package com.example.mehdi.busandroid;

import com.squareup.otto.Bus;

public class EventBus {

    private static Bus bus = new Bus();

    private EventBus() {

    }

    public static Bus getBus() {
        return bus;
    }
}
