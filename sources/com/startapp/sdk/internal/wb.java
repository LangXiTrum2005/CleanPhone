package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class wb extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb f41631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(zb zbVar, Looper looper) {
        super(looper);
        this.f41631a = zbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        xb[] xbVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        zb zbVar = this.f41631a;
        while (true) {
            synchronized (zbVar.f41776b) {
                try {
                    size = zbVar.d.size();
                    if (size <= 0) {
                        return;
                    }
                    xbVarArr = new xb[size];
                    zbVar.d.toArray(xbVarArr);
                    zbVar.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                xb xbVar = xbVarArr[i2];
                for (int i3 = 0; i3 < xbVar.f41671b.size(); i3++) {
                    BroadcastReceiver broadcastReceiver = ((yb) xbVar.f41671b.get(i3)).f41707b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(zbVar.f41775a, xbVar.f41670a);
                    }
                }
            }
        }
    }
}
