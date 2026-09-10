package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh0 f16444a;

    public kh0(yh0 yh0Var) {
        this.f16444a = yh0Var;
    }

    public final boolean a(c11 c11Var) {
        boolean zK = c11Var.K();
        yh0 yh0Var = this.f16444a;
        if (zK) {
            lj1 lj1VarA = yh0Var.a();
            lj1VarA.l("action", "aq_ad_closed");
            lj1VarA.l("gqi", c11Var.C());
            lj1VarA.l("aq_ad_duration", String.valueOf(c11Var.D()));
            lj1VarA.l("aq_ad_bounce_cnt", String.valueOf(c11Var.E()));
            lj1VarA.l("aq_time_away", String.valueOf(c11Var.H()));
            return lj1VarA.n().equals(zzt.zza);
        }
        lj1 lj1VarA2 = yh0Var.a();
        lj1VarA2.l("action", "aq_ad_kill");
        lj1VarA2.l("gqi", c11Var.C());
        lj1VarA2.l("aq_ad_duration", String.valueOf(c11Var.D()));
        lj1VarA2.l("aq_ad_bounce_cnt", String.valueOf(c11Var.E()));
        lj1VarA2.l("aq_time_away", String.valueOf(c11Var.H()));
        lj1VarA2.l("aq_is_os_kill", String.valueOf(c11Var.G()));
        return lj1VarA2.n().equals(zzt.zza);
    }
}
