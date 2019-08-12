1. 为什么每个测试类要一个runner?

2. statement执行逻辑

3. 同一个测试类的不同方法执行时，会生成新的测试类对象
   静态方法则无需生成对应类对象
   
   JUnitCore.run->
        ParentRunner.run->
                        classBlock->
                            childrenInvoker：Statement.runChildren(类维度)->
                                                        runChild->
                                                            methodBlock(Statement方法维度)
                                                            runLeaf
                            withBeforeClasses: 处理@BeforeClass等 RunBefores
                        evaluate                
   Statement:
        runner1(对应一个测试类)
            Statement(class).runChildren->
                                runChild-> 
                                    Statement(对应method1)
                                    runLeaf
                                runChild-> 
                                    Statement(对应method2)
                                    runLeaf
        runner2
        ...          
            
        
   测试类->runner
        method1->statement
        method2->statement
        
        method(with Before or after)->statement->next.evaluate(method)
   
    ParentRunner.run->
                    classBlock-> 处理 @BeforeClass @AfterClass等
        