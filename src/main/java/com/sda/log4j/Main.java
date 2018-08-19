package com.sda.log4j;

public class Main {

    public static Logger logger = Logger.getInstance();

    static class Task1 implements Runnable{

        @Override
        public void run(){
            logger = Logger.getInstance();
            logger.debug("To jest tes 1");
            logger.error("To jest eror 1");
        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run(){
            logger = Logger.getInstance();
            logger.debug("To jest tes 2");
            logger.error("To jest eror 2");
        }
    }

    public static void main(String[] args) {

        Thread task1 = new Thread(new Task1());
        Thread task2 = new Thread(new Task2());
        task1.start();
        task2.start();

   /*     Runnable task1 = () ->{
            logger = Logger.getInstance();
            logger.debug("To jest tes 1");
            logger.error("To jest eror 1");
        };

        Runnable task2 = () ->{
            logger = Logger.getInstance();
            logger.debug("To jest tes 2");
            logger.error("To jest eror 2");
        };

        new Thread(task1).start();
        new Thread(task2).start();
        */
        }
}
