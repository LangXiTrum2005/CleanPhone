package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w10 extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f21361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e20 f21362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f21364e;

    public w10(b30 b30Var, e20 e20Var, String str, String[] strArr) {
        this.f21361b = b30Var;
        this.f21362c = e20Var;
        this.f21363d = str;
        this.f21364e = strArr;
        zzt.zzB().f22072a.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.f21362c.j(this.f21363d, this.f21364e);
        } finally {
            zzs.zza.post(new d(this, 21));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) zzba.zzc().a(am.M2)).booleanValue() && (this.f21362c instanceof i20)) ? l00.f16613f.b(new sf(this, 2)) : super.zzb();
    }
}
