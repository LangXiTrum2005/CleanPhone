package com.google.android.gms.ads.internal.util;

import bc.s;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.m00;
import com.ironsource.C0375hc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbk extends hb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m00 f11082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzl f11083n;

    public zzbk(String str, Map map, m00 m00Var) {
        super(0, str, new zzbj(m00Var));
        this.f11082m = m00Var;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.f11083n = zzlVar;
        zzlVar.zzb(str, C0375hc.f28788a, null, null);
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final s c(fb fbVar) {
        return new s(fbVar, dv.c(fbVar));
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        fb fbVar = (fb) obj;
        Map map = fbVar.f14356c;
        int i10 = fbVar.f14354a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.f11083n;
        zzlVar.zzd(map, i10);
        byte[] bArr = fbVar.f14355b;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.f11082m.zzc(fbVar);
    }
}
