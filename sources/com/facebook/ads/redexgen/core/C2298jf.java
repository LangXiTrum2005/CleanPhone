package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2298jf implements InterfaceC1787b8 {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2297je A01;
    public final /* synthetic */ UK A02;

    public C2298jf(AbstractC2297je abstractC2297je, int i, UK uk) {
        this.A01 = abstractC2297je;
        this.A00 = i;
        this.A02 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1787b8
    public final void AE7(C1786b7 c1786b7) {
        if (this.A00 == 0) {
            this.A02.A1k(this.A01.A04);
        }
        this.A02.A1o(c1786b7.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
