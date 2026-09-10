package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1863Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC1592Oi A02;
    public C1593Oj A03;
    public C1594Ok A04;
    public InterfaceC1862Zc A05;
    public final C1590Og A06;
    public final C2300gi A07;
    public final VA A08;
    public final InterfaceC1841Yh A09;
    public final InterfaceC1842Yi A0A;
    public final String A0B;
    public final C1570Nm A0C;
    public final InterfaceC1865Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi);

    public abstract boolean A0S();

    public AbstractC1863Zd(C2300gi c2300gi, VA va, String str) {
        this(c2300gi, va, str, null, null, null);
    }

    public AbstractC1863Zd(C2300gi c2300gi, VA va, String str, C1570Nm c1570Nm, InterfaceC1842Yi interfaceC1842Yi, InterfaceC1841Yh interfaceC1841Yh) {
        super(c2300gi);
        this.A00 = 0;
        this.A02 = EnumC1592Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c2300gi;
        this.A08 = va;
        this.A0A = interfaceC1842Yi;
        this.A09 = interfaceC1841Yh;
        this.A0B = str;
        this.A0C = c1570Nm;
        this.A06 = AbstractC1591Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC1863Zd abstractC1863Zd) {
        int i2 = abstractC1863Zd.A00;
        abstractC1863Zd.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A03(AbstractC1863Zd abstractC1863Zd) {
        int i2 = abstractC1863Zd.A00;
        abstractC1863Zd.A00 = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C1594Ok c1594Ok) {
        this.A03.A08(this.A02);
        A0Q(c1594Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C1594Ok c1594Ok) {
        this.A04 = c1594Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c1594Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C1593Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC1842Yi interfaceC1842Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1842Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C1594Ok c1594Ok, EnumC1592Oi enumC1592Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC1862Zc interfaceC1862Zc) {
        this.A05 = interfaceC1862Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
