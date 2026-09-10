package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2136gn extends AbstractRunnableC1618Wc {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC1529Sp A00;
    public final /* synthetic */ C1530Sq A01;
    public final /* synthetic */ C1537Sx A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C2136gn(C1537Sx c1537Sx, ArrayList arrayList, C1530Sq c1530Sq, InterfaceC1529Sp interfaceC1529Sp, ArrayList arrayList2) {
        this.A02 = c1537Sx;
        this.A03 = arrayList;
        this.A01 = c1530Sq;
        this.A00 = interfaceC1529Sp;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1618Wc
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = C1537Sx.A0D(this.A03);
        if (this.A02.A04 instanceof C2131gi) {
            C2131gi c2131gi = (C2131gi) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        c2131gi.A0F().A4p(Y1.A01(this.A02.A00));
                    } else {
                        c2131gi.A0F().A4n(Y1.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                InterfaceC1357Lt interfaceC1357LtA0F = c2131gi.A0F();
                long jA01 = Y1.A01(this.A02.A00);
                C1530Sq c1530Sq = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    interfaceC1357LtA0F.A4q(jA01, c1530Sq.A00);
                }
                throw new RuntimeException();
            }
            c2131gi.A0F().A4o(Y1.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C2137go(this, atomicBooleanA0D));
        C1537Sx.A0D(this.A04);
    }
}
