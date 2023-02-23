package com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observer;

import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessage(userName, "product is in stock");
    }

    private void sendMessage(String userName, String message) {
        System.out.println("send notification to mobile");
    }
}
