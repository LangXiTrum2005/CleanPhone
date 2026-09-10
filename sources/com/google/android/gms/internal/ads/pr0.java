package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f18771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18775f;

    public pr0(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f18770a = str;
        this.f18771b = num;
        this.f18772c = str2;
        this.f18773d = str3;
        this.f18774e = str4;
        this.f18775f = str5;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        rb0.F("pn", bundle, this.f18770a);
        Integer num = this.f18771b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        rb0.F("vnm", bundle, this.f18772c);
        rb0.F("dl", bundle, this.f18773d);
        rb0.F("ins_pn", bundle, this.f18774e);
        rb0.F("ini_pn", bundle, this.f18775f);
    }
}
