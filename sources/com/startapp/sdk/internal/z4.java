package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public final class z4 implements k7 {
    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new m8(new Handler(Looper.getMainLooper()));
    }
}
