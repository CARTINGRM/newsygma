package com.raven.event;

import java.util.EventListener;

public interface EventMenu {

    public void selected(int index);

    public void onMenuSelected(EventListener eventListener);
}
