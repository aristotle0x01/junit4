1. Ϊʲôÿ��������Ҫһ��runner?

2. statementִ���߼�

3. ͬһ��������Ĳ�ͬ����ִ��ʱ���������µĲ��������
   ��̬�������������ɶ�Ӧ�����
   
   JUnitCore.run->
        ParentRunner.run->
                        classBlock->
                            childrenInvoker��Statement.runChildren(��ά��)->
                                                        runChild->
                                                            methodBlock(Statement����ά��)
                                                            runLeaf
                            withBeforeClasses: ����@BeforeClass�� RunBefores
                        evaluate                
   Statement:
        runner1(��Ӧһ��������)
            Statement(class).runChildren->
                                runChild-> 
                                    Statement(��Ӧmethod1)
                                    runLeaf
                                runChild-> 
                                    Statement(��Ӧmethod2)
                                    runLeaf
        runner2
        ...          
            
        
   ������->runner
        method1->statement
        method2->statement
        
        method(with Before or after)->statement->next.evaluate(method)
   
    ParentRunner.run->
                    classBlock-> ���� @BeforeClass @AfterClass��
        