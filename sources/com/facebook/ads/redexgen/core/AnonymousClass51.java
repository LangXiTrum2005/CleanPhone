package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.51, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass51 implements Q7 {
    public static String[] A04 = {"8O6NxNXFBs71YOtLDSHVih5By1ynlGW9", "5kcYm1deIqpjb7XMaQ0NGj", "X12gxJqLzdDCLKt5fAN4D", "PXwPZopkVepbrNP264xVpR4njQkcGHYI", "0829f", "IeMmL", "VcaMLrlRPDtdwBv7yKnzyq0wzDs3iXCi", "oTNZToNiXGDP6UHHexhSb"};
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map<String, List<String>> A02 = Collections.emptyMap();
    public final Q7 A03;

    public AnonymousClass51(Q7 q7) {
        this.A03 = (Q7) AbstractC1517es.A01(q7);
    }

    public final long A00() {
        return this.A00;
    }

    public final Uri A01() {
        return this.A01;
    }

    public final Map<String, List<String>> A02() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void A3t(InterfaceC1486eN interfaceC1486eN) {
        AbstractC1517es.A01(interfaceC1486eN);
        this.A03.A3t(interfaceC1486eN);
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Map<String, List<String>> A8j() {
        return this.A03.A8j();
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Uri A9F() {
        return this.A03.A9F();
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final long AFq(C1447dj c1447dj) throws IOException {
        this.A01 = c1447dj.A06;
        this.A02 = Collections.emptyMap();
        long jAFq = this.A03.AFq(c1447dj);
        this.A01 = (Uri) AbstractC1517es.A01(A9F());
        this.A02 = A8j();
        return jAFq;
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final void close() throws IOException {
        this.A03.close();
    }

    @Override // com.facebook.ads.redexgen.core.O9
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 != -1) {
            long j = this.A00;
            long j2 = i3;
            String[] strArr = A04;
            String str = strArr[7];
            String str2 = strArr[2];
            int length = str.length();
            int bytesRead = str2.length();
            if (length != bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "YAnyeWWgx32ib983O31NSy2gRb88nkVo";
            strArr2[3] = "eSbzoMjSMfUJexhPG1kEL6L2dyY8Aid8";
            this.A00 = j + j2;
        }
        return i3;
    }
}
