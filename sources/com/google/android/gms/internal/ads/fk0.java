package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mx f14451b;

    public /* synthetic */ fk0(mx mxVar, int i10) {
        this.f14450a = i10;
        this.f14451b = mxVar;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f14450a) {
            case 0:
                return zw1.d(new zk0(inputStream, this.f14451b));
            case 1:
                return zw1.d(new zk0(inputStream, this.f14451b));
            default:
                String str = new String(tb1.a(inputStream), StandardCharsets.UTF_8);
                mx mxVar = this.f14451b;
                mxVar.f17575j = str;
                return zw1.d(mxVar);
        }
    }
}
