package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1798jX implements C9A {
    public final /* synthetic */ String[] A00;

    public C1798jX(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.core.C9A
    public final boolean A30(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
