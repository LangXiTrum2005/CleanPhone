package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class HandlerC0927Oa extends Handler {
    public final /* synthetic */ E9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0927Oa(E9 e9, Looper looper) {
        super(looper);
        this.A00 = e9;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0N(msg);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
