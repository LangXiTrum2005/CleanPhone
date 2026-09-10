package com.kochava.tracker.payload.internal;

import android.content.Context;
import androidx.media3.extractor.text.ttml.a;
import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.storage.queue.internal.StorageQueue;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import com.kochava.core.storage.queue.internal.StorageQueueChangedListener;
import com.kochava.core.task.manager.internal.TaskManagerApi;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.controller.internal.Controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class PayloadQueue implements PayloadQueueApi, StorageQueueChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StorageQueue f28263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28264b = a.u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28265c = false;

    public PayloadQueue(Context context, TaskManagerApi taskManagerApi, String str) {
        this.f28263a = new StorageQueue(context, taskManagerApi, str, Math.max(1, 100));
    }

    @Override // com.kochava.core.storage.queue.internal.StorageQueueChangedListener
    public final void a(StorageQueueChangedAction storageQueueChangedAction) {
        ArrayList arrayListQ = ObjectUtil.q(this.f28264b);
        if (arrayListQ.isEmpty()) {
            return;
        }
        Iterator it = arrayListQ.iterator();
        while (it.hasNext()) {
            ((PayloadQueueChangedListener) it.next()).h(storageQueueChangedAction);
        }
    }

    @Override // com.kochava.tracker.payload.internal.PayloadQueueApi
    public final synchronized void b(PayloadApi payloadApi) {
        this.f28263a.g(payloadApi.toJson().toString());
    }

    public final synchronized boolean c(PayloadApi payloadApi) {
        return this.f28263a.c(payloadApi.toJson().toString());
    }

    public final synchronized void d(Controller controller) {
        this.f28264b.remove(controller);
        this.f28264b.add(controller);
        if (!this.f28265c) {
            StorageQueue storageQueue = this.f28263a;
            if (!storageQueue.f28067e) {
                storageQueue.d.remove(this);
                storageQueue.d.add(this);
            }
            this.f28265c = true;
        }
    }

    public final synchronized long e() {
        long j;
        StorageQueue storageQueue = this.f28263a;
        synchronized (storageQueue) {
            j = storageQueue.f28064a.getLong("last_remove_time_millis", 0L);
        }
        return j;
    }

    public final synchronized int f() {
        return this.f28263a.f();
    }

    @Override // com.kochava.tracker.payload.internal.PayloadQueueApi
    public final synchronized Payload get() {
        String string;
        StorageQueue storageQueue = this.f28263a;
        synchronized (storageQueue) {
            if (storageQueue.f() <= 0) {
                string = null;
            } else {
                string = storageQueue.f28064a.getString(Long.toString(storageQueue.f28064a.getLong("read_index", 0L)), null);
            }
        }
        if (string == null) {
            return null;
        }
        return Payload.i(JsonObject.x(string, true));
    }

    @Override // com.kochava.tracker.payload.internal.PayloadQueueApi
    public final synchronized void remove() {
        StorageQueue storageQueue = this.f28263a;
        synchronized (storageQueue) {
            storageQueue.d();
            storageQueue.b(StorageQueueChangedAction.f28070Y);
        }
    }
}
