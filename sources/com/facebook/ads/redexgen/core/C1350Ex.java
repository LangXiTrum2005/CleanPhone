package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1350Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2815pY A01;
    public final Object A02;
    public final C11827s[] A03;
    public final InterfaceC2672nE[] A04;

    public C1350Ex(C11827s[] c11827sArr, InterfaceC2672nE[] interfaceC2672nEArr, C2815pY c2815pY, Object obj) {
        this.A03 = c11827sArr;
        this.A04 = (InterfaceC2672nE[]) interfaceC2672nEArr.clone();
        this.A01 = c2815pY;
        this.A02 = obj;
        this.A00 = c11827sArr.length;
    }

    public final boolean A00(int i2) {
        return this.A03[i2] != null;
    }

    public final boolean A01(C1350Ex c1350Ex, int i2) {
        if (c1350Ex == null) {
            return false;
        }
        C11827s[] c11827sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c11827sArr[i2], c1350Ex.A03[i2])) {
                return false;
            }
            InterfaceC2672nE interfaceC2672nE = this.A04[i2];
            InterfaceC2672nE interfaceC2672nE2 = c1350Ex.A04[i2];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2672nE, interfaceC2672nE2);
            }
        }
        throw new RuntimeException();
    }
}
