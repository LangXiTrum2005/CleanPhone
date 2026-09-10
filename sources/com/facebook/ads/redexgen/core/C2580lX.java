package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2580lX implements H9 {
    public static String[] A03 = {"omX6mlrNbYq0LGa8KWDQoDOxuY4Jaqsm", "5vCbKZ7gcP1deFubK5J3aMrnVGjcBeMu", "ozZJ4UCdXiLAsxGuZMu8vrfsyQyOy2Qr", "457YRIf4cJgVa", "48ELt3GeP9QgscGCGAyy0GBjQnf8y1ot", "nP9Rki4V9hDzJun2MpMPW2v7tMuO22BO", "splStgYzXsMDywgFYcc1GmuRRae3j1Zq", "jQwA1XKYR4HrKvDtyQbVDHffCNmVjAZf"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lY
        @Override // com.facebook.ads.redexgen.core.HD
        public final H9[] A5N() {
            return C2580lX.A00();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2579lW A02 = new C2579lW();
    public final C11074v A01 = new C11074v(2786);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C2580lX()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A02.A5c(ha, new LG(0, 1));
        ha.A6O();
        ha.AJ7(new C2646mn(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2651ms interfaceC2651ms, HV hv) throws IOException {
        int i2 = interfaceC2651ms.read(this.A01.A0l(), 0, 2786);
        if (i2 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i2);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2651ms interfaceC2651ms) throws IOException {
        C11074v c11074v = new C11074v(10);
        int i2 = 0;
        while (true) {
            interfaceC2651ms.AGt(c11074v.A0l(), 0, 10);
            c11074v.A0f(0);
            if (c11074v.A0K() != 4801587) {
                interfaceC2651ms.AIl();
                interfaceC2651ms.A47(i2);
                int i3 = i2;
                int startPosition = 0;
                while (true) {
                    interfaceC2651ms.AGt(c11074v.A0l(), 0, 6);
                    c11074v.A0f(0);
                    int headerPosition = c11074v.A0M();
                    if (headerPosition != 2935) {
                        startPosition = 0;
                        interfaceC2651ms.AIl();
                        i3++;
                        int headerPosition2 = i3 - i2;
                        if (headerPosition2 >= 8192) {
                            return false;
                        }
                        interfaceC2651ms.A47(i3);
                    } else {
                        startPosition++;
                        if (startPosition >= 4) {
                            return true;
                        }
                        int headerPosition3 = AbstractC1395Gr.A05(c11074v.A0l());
                        if (headerPosition3 == -1) {
                            return false;
                        }
                        interfaceC2651ms.A47(headerPosition3 - 6);
                    }
                }
            } else {
                c11074v.A0g(3);
                int length = c11074v.A0H();
                i2 += length + 10;
                String[] strArr = A03;
                if (strArr[2].charAt(6) == strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[2] = "eBRvK0YAHsHMNfInXbOwvDfd4dSG53RM";
                strArr2[0] = "womotRNroMOUij9xAXX8qTzQtzDZBBtc";
                interfaceC2651ms.A47(length);
            }
        }
    }
}
