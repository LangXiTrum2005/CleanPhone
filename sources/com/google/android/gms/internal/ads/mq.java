package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mq implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m60 f17514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17515c;

    public /* synthetic */ mq(m60 m60Var, String str, int i10) {
        this.f17513a = i10;
        this.f17514b = m60Var;
        this.f17515c = str;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        int i10 = this.f17513a;
        String str = this.f17515c;
        m60 m60Var = this.f17514b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                iq iqVar = nq.f17890a;
                return (((Boolean) zzba.zzc().a(am.Hb)).booleanValue() && m60Var != null && m60.b(str)) ? m60Var.a(str2, zzay.zzh()) : zw1.d(str2);
            default:
                ((k00) m60Var.f17309e).a(new l60(m60Var, (Throwable) obj, 1));
                return zw1.d(str);
        }
    }
}
