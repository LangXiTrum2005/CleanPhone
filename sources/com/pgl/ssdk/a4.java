package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class a4 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<a> f33387a;

    public interface a {
        void a(Message message);
    }

    public a4(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.f33387a = new WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.f33387a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.a(message);
    }
}
