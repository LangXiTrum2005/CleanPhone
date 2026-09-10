package com.google.firebase.components;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class EventBus implements Subscriber, Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20223a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f20224b = new ArrayDeque();

    public EventBus(UiExecutor uiExecutor) {
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized void a(Executor executor, EventHandler eventHandler) {
        try {
            if (!this.f20223a.containsKey(DataCollectionDefaultChange.class)) {
                this.f20223a.put(DataCollectionDefaultChange.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f20223a.get(DataCollectionDefaultChange.class)).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
