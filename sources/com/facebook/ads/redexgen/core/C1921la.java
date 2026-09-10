package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1921la implements InterfaceC04263l {
    public final SharedPreferences.Editor A00;

    public C1921la(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C1921la A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C1921la A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
