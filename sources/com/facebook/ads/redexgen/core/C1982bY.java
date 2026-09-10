package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1982bY extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C2459jT A02;
    public final C2300gi A03;
    public final VA A04;
    public final InterfaceC1841Yh A05;

    public C1982bY(C2300gi c2300gi, C2459jT c2459jT, VA va, InterfaceC1841Yh interfaceC1841Yh, int i2, int i3) {
        super(c2300gi);
        this.A03 = c2300gi;
        this.A02 = c2459jT;
        this.A04 = va;
        this.A05 = interfaceC1841Yh;
        this.A00 = i2;
        this.A01 = new LinearLayout(c2300gi);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i3);
    }

    private void A00() {
        int i2 = 0;
        while (true) {
            int iA23 = this.A02.A23();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i3 = str2.charAt(18);
            if (iCharAt == i3) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i2 < iA23) {
                LF lf = new LF(this.A03, this.A02.A27(i2), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i4 = LF.A0C;
                int i5 = LF.A0C;
                int i6 = LF.A0C;
                int i7 = LF.A0C;
                layoutParams.setMargins(i4, i5, i6, i7);
                lf.setLayoutParams(layoutParams);
                this.A01.addView(lf);
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i2) {
        if (i2 != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (((double) this.A00) * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (((double) this.A00) * 1.5d), 0, this.A00);
        }
    }
}
