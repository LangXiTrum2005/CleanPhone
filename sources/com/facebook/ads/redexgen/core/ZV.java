package com.facebook.ads.redexgen.core;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZV {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public ZV(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ZV.class) {
            return false;
        }
        ZV zv = (ZV) obj;
        return TextUtils.equals(this.A00, zv.A00) && this.A01 == zv.A01 && this.A02 == zv.A02;
    }

    public final int hashCode() {
        int result = 1 * 31;
        int prime = this.A00.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        int result3 = (result2 + prime2) * 31;
        int result4 = this.A02 ? 1231 : 1237;
        return result3 + result4;
    }
}
