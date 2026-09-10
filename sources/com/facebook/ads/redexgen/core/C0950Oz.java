package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0950Oz implements InterfaceC1551fR {
    public Message A00;
    public C0949Oy A01;

    public C0950Oz() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C0949Oy.A01(this);
    }

    public final C0950Oz A01(Message message, C0949Oy c0949Oy) {
        this.A00 = message;
        this.A01 = c0949Oy;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC1517es.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC1517es.A01(this.A00));
        A00();
        return success;
    }
}
