package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbfq implements Callable {
    static final /* synthetic */ zzbfq zza = new zzbfq();

    private /* synthetic */ zzbfq() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
