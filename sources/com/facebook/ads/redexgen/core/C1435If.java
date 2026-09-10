package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1435If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C11195h A00;

    public C1435If(C11195h c11195h) {
        this.A00 = c11195h;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        if (!(this.A00.A01 instanceof C1483Kc) || !this.A00.A01.A1M()) {
            if (!(this.A00.A01 instanceof C1463Ji) || !this.A00.A01.A1M()) {
                InterfaceC2120dm interfaceC2120dm = this.A00.A07;
                String[] strArr = A01;
                if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
                strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
                interfaceC2120dm.AFw(false);
            } else {
                this.A00.A07.AFw(true);
                this.A00.A06.setToolbarActionMode(1);
            }
        } else {
            this.A00.A07.AFw(true);
            this.A00.A06.setToolbarActionMode(1);
        }
        this.A00.A07.ADc(this.A00.A03);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        this.A00.A07.ADw(this.A00.A03 - f);
        if (this.A00.A02 != null) {
            this.A00.A02.A07((int) (this.A00.A03 - f));
        }
    }
}
