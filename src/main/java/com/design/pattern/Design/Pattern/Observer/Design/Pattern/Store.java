package com.design.pattern.Design.Pattern.Observer.Design.Pattern;

import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observable.IphoneObservableImpl;
import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observable.StocksObservable;
import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observer.EmailAlertObserverImpl;
import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observer.MobileAlertObserverImpl;
import com.design.pattern.Design.Pattern.Observer.Design.Pattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneObervable  = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneObervable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneObervable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc@gmail.com", iphoneObervable);


        iphoneObervable.add(observer1);
        iphoneObervable.add(observer2);
        iphoneObervable.add(observer3);

        iphoneObervable.setStockCount(10);
        iphoneObervable.setStockCount(100);
        iphoneObervable.setStockCount(0);
        iphoneObervable.setStockCount(10);
    }
}
