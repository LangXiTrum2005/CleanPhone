package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1833k6 extends BY {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ InterfaceC05277l A00;
    public final /* synthetic */ C05287m A01;
    public final /* synthetic */ C05357t A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1833k6(C05357t c05357t, ArrayList arrayList, C05287m c05287m, InterfaceC05277l interfaceC05277l, ArrayList arrayList2) {
        this.A02 = c05357t;
        this.A03 = arrayList;
        this.A01 = c05287m;
        this.A00 = interfaceC05277l;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        AtomicBoolean atomicBooleanA0D = C05357t.A0D(this.A03);
        if (this.A02.A04 instanceof C1828k1) {
            C1828k1 c1828k1 = (C1828k1) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z) {
                        c1828k1.A0F().A4f(C0646Cu.A01(this.A02.A00));
                    } else {
                        c1828k1.A0F().A4d(C0646Cu.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                InterfaceC03681f interfaceC03681fA0F = c1828k1.A0F();
                long jA01 = C0646Cu.A01(this.A02.A00);
                C05287m c05287m = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    interfaceC03681fA0F.A4g(jA01, c05287m.A00);
                }
                throw new RuntimeException();
            }
            c1828k1.A0F().A4e(C0646Cu.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C1834k7(this, atomicBooleanA0D));
        C05357t.A0D(this.A04);
    }
}
