package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubscriberExceptionEvent {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final EventBus eventBus;
    public final Throwable throwable;

    public SubscriberExceptionEvent(EventBus eventBus, Throwable th2, Object obj, Object obj2) {
        this.eventBus = eventBus;
        this.throwable = th2;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
