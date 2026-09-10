package com.google.android.gms.internal.ads;

import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f20047a;

    public final void a() {
        Message message = this.f20047a;
        message.getClass();
        message.sendToTarget();
        this.f20047a = null;
        ys0.f(this);
    }
}
