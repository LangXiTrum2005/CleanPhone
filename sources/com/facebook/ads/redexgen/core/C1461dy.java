package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1461dy implements InterfaceC05006k {
    public static String[] A01 = {"EbGpmssVJ7ns5QL3Rl3UMQ1bkFVQ99jJ", "NZiaRg2dkcqShBYEYgfcfS6cvloj595L", "orBeTHrcfmlzSHmkgrBC5PhD7dWIdW6R", "A0QUoJlw", "r5xapKwo2g0pU1r2itXQ9K5SrPer64wf", "XFka6Ze1I6IepT0r6LvaraMv7MRENHMC", "Xj0im9L41l0kDU7dj2M6tiOB0nkMWcds", "VCdvqSH1BrwZZsOdC7BZghv3f2EYDVkv"};
    public final /* synthetic */ C0850Kq A00;

    public C1461dy(C0850Kq c0850Kq) {
        this.A00 = c0850Kq;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05006k
    public final boolean AA8() {
        if (this.A00.A05.get()) {
            boolean zA0f = this.A00.A0f();
            String[] strArr = A01;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A01[0] = "O5SuZCLVdBOcw9avK46kWbT1hYIehzyg";
            if (!zA0f) {
                return false;
            }
        }
        return true;
    }
}
