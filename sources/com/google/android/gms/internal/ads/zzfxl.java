package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class zzfxl extends Handler {
    public zzfxl() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfxl(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
