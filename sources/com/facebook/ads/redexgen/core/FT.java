package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FT extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C1982mb A02;
    public final C1828k1 A03;
    public final A7 A04;
    public final DR A05;

    public FT(C1828k1 c1828k1, C1982mb c1982mb, A7 a7, DR dr, int i, int i2) {
        super(c1828k1);
        this.A03 = c1828k1;
        this.A02 = c1982mb;
        this.A04 = a7;
        this.A05 = dr;
        this.A00 = i;
        this.A01 = new LinearLayout(c1828k1);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i2);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int iA1W = this.A02.A1W();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int iCharAt = str.charAt(18);
            int i2 = str2.charAt(18);
            if (iCharAt == i2) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < iA1W) {
                C1621ga c1621ga = new C1621ga(this.A03, this.A02.A1Z(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i3 = C1621ga.A0C;
                int i4 = C1621ga.A0C;
                int i5 = C1621ga.A0C;
                int i6 = C1621ga.A0C;
                layoutParams.setMargins(i3, i4, i5, i6);
                c1621ga.setLayoutParams(layoutParams);
                this.A01.addView(c1621ga);
                i++;
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

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (((double) this.A00) * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (((double) this.A00) * 1.5d), 0, this.A00);
        }
    }
}
