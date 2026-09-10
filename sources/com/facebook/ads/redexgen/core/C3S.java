package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3S extends ED {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C2300gi A01;
    public final UN<C4K> A02;
    public final UN<E3> A03;

    public C3S(C2300gi c2300gi) {
        this(c2300gi, false);
    }

    public C3S(C2300gi c2300gi, boolean z2) {
        ImageView.ScaleType scaleType;
        int color;
        super(c2300gi);
        this.A03 = new C1303Dc(this);
        this.A02 = new C1302Db(this);
        this.A01 = c2300gi;
        this.A00 = new ImageView(c2300gi);
        if (!z2) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
            color = -16777216;
        } else {
            scaleType = ImageView.ScaleType.FIT_START;
            color = 0;
        }
        this.A00.setScaleType(scaleType);
        YB.A0N(this.A00, color);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            UM<UN, UL> eventBus = getVideoView().getEventBus();
            UN[] unArr = new UN[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            unArr[0] = this.A03;
            unArr[1] = this.A02;
            eventBus.A03(unArr);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.A00.layout(0, 0, i4 - i2, i5 - i3);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC1956b8 interfaceC1956b8) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        LM downloadImageTask = new LM(this.A00, this.A01).A04();
        if (interfaceC1956b8 != null) {
            downloadImageTask.A06(interfaceC1956b8);
        }
        downloadImageTask.A07(str);
    }
}
