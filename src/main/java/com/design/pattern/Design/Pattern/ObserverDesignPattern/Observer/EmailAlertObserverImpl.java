package com.design.pattern.Design.Pattern.ObserverDesignPattern.Observer;

import com.design.pattern.Design.Pattern.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {


    String emailId;
    StocksObservable observable;


    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.observable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock Hurry up");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("send notification to emailId");
    }
}
