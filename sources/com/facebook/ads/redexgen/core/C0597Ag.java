package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0597Ag {
    public final AdErrorType A00;
    public final String A01;

    public C0597Ag(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C0597Ag(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0597Ag A00(AdErrorType adErrorType) {
        return new C0597Ag(adErrorType, (String) null);
    }

    public static C0597Ag A01(AdErrorType adErrorType, String str) {
        return new C0597Ag(adErrorType, str);
    }

    public static C0597Ag A02(C0598Ah c0598Ah) {
        return new C0597Ag(c0598Ah.A00(), c0598Ah.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
