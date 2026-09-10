package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes3.dex */
public class zzfqw extends Handler {
    public zzfqw() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    @CallSuper
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfqw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
