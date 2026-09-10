package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.t90;
import com.google.android.gms.internal.ads.uv0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.vv0;
import com.google.android.gms.internal.ads.wc0;
import com.google.android.gms.internal.ads.yv0;
import com.google.android.gms.internal.ads.zd1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f11441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kx1 f11442d;

    public zzay(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4) {
        this.f11439a = kx1Var;
        this.f11440b = kx1Var2;
        this.f11441c = kx1Var3;
        this.f11442d = kx1Var4;
    }

    public static zzay zza(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4) {
        return new zzay(kx1Var, kx1Var2, kx1Var3, kx1Var4);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        yv0 yv0Var = (yv0) this.f11439a.zzb();
        zzba zzbaVarZzb = ((zzbb) this.f11440b).zzb();
        s90 s90VarZzb = ((t90) this.f11441c).zzb();
        wc0 wc0Var = (wc0) this.f11442d.zzb();
        v90 v90VarG = yv0Var.a(s90VarZzb.b(), vv0.GENERATE_SIGNALS).g(zzbaVarZzb);
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.J6)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        uv0 uv0VarM = v90VarG.l(jIntValue).m();
        uv0VarM.addListener(new zd1(0, uv0VarM, new zzar(wc0Var)), l00.f16608a);
        return uv0VarM;
    }
}
