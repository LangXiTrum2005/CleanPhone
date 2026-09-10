package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2415lb implements InterfaceC1295Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C2415lb A02 = new C2415lb();
    public final List<C2641pT> A00;

    public C2415lb() {
        this.A00 = Collections.emptyList();
    }

    public C2415lb(C2641pT c2641pT) {
        this.A00 = Collections.singletonList(c2641pT);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Jj
    public final List<C2641pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Jj
    public final long A83(int i) {
        AbstractC09153y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1295Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
