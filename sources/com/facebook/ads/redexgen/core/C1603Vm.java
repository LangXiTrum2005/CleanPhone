package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1603Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1603Vm(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1603Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1603Vm A00(AdErrorType adErrorType) {
        return new C1603Vm(adErrorType, (String) null);
    }

    public static C1603Vm A01(AdErrorType adErrorType, String str) {
        return new C1603Vm(adErrorType, str);
    }

    public static C1603Vm A02(C1604Vn c1604Vn) {
        return new C1603Vm(c1604Vn.A00(), c1604Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
