package com.design.pattern.Design.Pattern.ObserverDesignPattern.Observable;

import com.design.pattern.Design.Pattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscriber();

    int getStockCount();

    void setStockCount(int newStockAdded);

}
