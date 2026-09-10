package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1772Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1772Vm(int i2, String str) {
        this(AdErrorType.adErrorTypeFromCode(i2), str);
    }

    public C1772Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1772Vm A00(AdErrorType adErrorType) {
        return new C1772Vm(adErrorType, (String) null);
    }

    public static C1772Vm A01(AdErrorType adErrorType, String str) {
        return new C1772Vm(adErrorType, str);
    }

    public static C1772Vm A02(C1773Vn c1773Vn) {
        return new C1772Vm(c1773Vn.A00(), c1773Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
