package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class ec implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gc f40935a;

    public ec(gc gcVar) {
        this.f40935a = gcVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        gc gcVar = this.f40935a;
        synchronized (gcVar) {
            gcVar.d = true;
            gcVar.notifyAll();
        }
        return true;
    }
}
