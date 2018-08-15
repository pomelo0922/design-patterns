package com.sunjie.facade;

/**
 * Description:
 * User: sunjie
 * Date: 2018/8/15
 * Time: 下午8:29
 */
public class TravelFacade {


    public void handle() {
        BuyTicket buyTicket = new BuyTicket();
        BookRoom bookRoom = new BookRoom();
        Travel travel = new Travel();
        buyTicket.handle();
        bookRoom.handle();
        travel.handle();
    }
}
