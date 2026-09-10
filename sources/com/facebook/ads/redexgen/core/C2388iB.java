package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2388iB implements InterfaceC1596Om {
    public final SharedPreferences A00;

    public C2388iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Om
    public final C2389iC A6I() {
        return new C2389iC(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Om
    public final long A8Q(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
