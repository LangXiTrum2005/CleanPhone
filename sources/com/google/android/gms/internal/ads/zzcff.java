package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcff implements Runnable {
    public zzcff(zzcfh zzcfhVar) {
        Objects.requireNonNull(zzcfhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
