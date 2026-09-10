package com.facebook.ads.redexgen.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1318be implements IQ {
    public static String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public C1361cL A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1337bx A07 = new KW(this);
    public final AbstractC1343c3 A06 = new KV(this);
    public final AbstractC1335bv A08 = new KU(this);
    public final AbstractC1332bs A09 = new KT(this);
    public final AbstractC1326bm A0A = new KS(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC0798Iq> A0B = new ArrayList();
    public int A00 = 2000;

    public C1318be(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC0798Iq> it = this.A0B.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        Iterator<InterfaceC0798Iq> it = this.A0B.iterator();
        while (it.hasNext()) {
            it.next().A40(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(EnumC0797Ip enumC0797Ip) {
        Iterator<InterfaceC0798Iq> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A91() != enumC0797Ip) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(InterfaceC0798Iq interfaceC0798Iq) {
        this.A0B.add(interfaceC0798Iq);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AAk(C1361cL c1361cL) {
        this.A01 = c1361cL;
        c1361cL.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AJa(C1361cL c1361cL) {
        A03();
        c1361cL.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
