/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author Piyaporn
 */
public class MyFacade {
    private static MyFacade myFacadeObj = null;
        public static MyFacade getMyFacadeObject() {
            if(myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            }
            return myFacadeObj;
        }
        public void classScheduleServer() {
            ScheduleServer obj = new ScheduleServer();
            obj.startBooting();
            obj.readSystemConfigFile();
            obj.init();
            obj.initializeContext();
            obj.initializeListeners();
            obj.createSystemObjects();
            System.out.println("Start working......");
            System.out.println("After work done.........");
            obj.releaseProcesses();
            obj.destory();
            obj.destroySystemObjects();
            obj.destoryListeners();
            obj.destoryContext();
            obj.shutdown();
        }
}
