package com.startapp.sdk.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public final class w4 implements k7 {
    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        n8 n8Var = new n8("startapp-".concat("core"));
        n8Var.start();
        return new m8(new Handler(n8Var.getLooper()));
    }
}
