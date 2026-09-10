package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f21592e;

    public wr0(String str, String str2, String str3, String str4, Long l) {
        this.f21588a = str;
        this.f21589b = str2;
        this.f21590c = str3;
        this.f21591d = str4;
        this.f21592e = l;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        rb0.F("gmp_app_id", bundle, this.f21588a);
        rb0.F("fbs_aiid", bundle, this.f21589b);
        rb0.F("fbs_aeid", bundle, this.f21590c);
        rb0.F("apm_id_origin", bundle, this.f21591d);
        Long l = this.f21592e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
