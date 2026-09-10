package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0x, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C0x extends C1F implements InterfaceC2135e2 {
    public static byte[] A07;
    public static String[] A08 = {"J7yX0QGw9CwhbXJlOgK1AZPNtt2UF0On", "oXMSY1TARkqssgt6s8jHvILUEU9", "ivvOLLZvAzFcQQYEM", "46hEJr0dkjUa2YxjnqHHZtVzHBYgDtfX", "qOyhICr4SrTKnx9gG6JsVKrXp45uLK", "kbgvhlczlSdLn8qANYfrfCagYhnCySOb", "Z6RoLzaVoBLmlhzvAeWOPUTl5laN13sF", "YB9cTMd7bVO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC1852Ys A04;
    public boolean A05;
    public final C11596v A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 46);
            if (A08[0].charAt(21) != 'Z') {
                throw new RuntimeException();
            }
            A08[3] = "76s3uTgYoGqvxE8PFJZmOuk3NB8C1jhQ";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-68, -69, -99, -82, -76, -78, -112, -75, -82, -69, -76, -78, -79};
    }

    static {
        A03();
    }

    public C0x(C2300gi c2300gi) {
        super(c2300gi);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C11596v(c2300gi, new C2133e0(), new C2132dz());
        A02();
    }

    public C0x(C2300gi c2300gi, AttributeSet attributeSet) {
        super(c2300gi, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C11596v(c2300gi, new C2133e0(), new C2132dz());
        A02();
    }

    public C0x(C2300gi c2300gi, AttributeSet attributeSet, int i2) {
        super(c2300gi, attributeSet, i2);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C11596v(c2300gi, new C2133e0(), new C2132dz());
        A02();
    }

    private int A00(int i2) {
        int i3 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i4 = (measuredWidth - spacing) - i3;
        int itemSize = getAdapter().A0B();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i2) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i2;
            }
            int spacing3 = numFullItems * i3;
            spacing2 = (int) ((i4 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2C(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        YB.A0K(this);
    }

    private void A04(int i2, int i3) {
        if (i2 == this.A03 && i3 == this.A02) {
            return;
        }
        this.A03 = i2;
        this.A02 = i3;
        if (A08[3].charAt(25) != 'B') {
            throw new RuntimeException();
        }
        A08[2] = "arB2ao";
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 31));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1F
    public final void A20(int i2, boolean z2) {
        super.A20(i2, z2);
        A04(i2, 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2135e2
    public final int A8o(int i2) {
        int iAbs = Math.abs(i2);
        int scrollXAbs = ((C1F) this).A06;
        if (iAbs <= scrollXAbs) {
            return 0;
        }
        int scrollXAbs2 = this.A01;
        if (scrollXAbs2 == 0) {
            return 1;
        }
        int scrollXAbs3 = this.A01;
        return 1 + (iAbs / scrollXAbs3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C7M, android.view.View
    public final void onMeasure(int i2, int i3) {
        int height;
        int itemSize;
        super.onMeasure(i2, i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i4 = (int) XX.A02;
            int verticalPadding = C1750Up.A0F(getContext());
            height = (i4 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i3);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i3);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i3);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = C1847Yn.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C7M
    public void setAdapter(AbstractC1648Qq abstractC1648Qq) {
        this.A06.A2J(abstractC1648Qq == null ? -1 : abstractC1648Qq.hashCode());
        super.setAdapter(abstractC1648Qq);
    }

    public void setChildSpacing(int i2) {
        this.A00 = i2;
    }

    public void setChildWidth(int i2) {
        this.A01 = i2;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i3 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i4 = i3 - pageWidth2;
        C11596v c11596v = this.A06;
        int pageWidth3 = this.A01;
        c11596v.A2K((i4 - pageWidth3) / 2);
        C11596v c11596v2 = this.A06;
        int pageWidth4 = this.A01;
        c11596v2.A2I(((double) pageWidth4) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i2) {
        A20(i2, false);
    }

    public void setOnPageChangedListener(InterfaceC1852Ys interfaceC1852Ys) {
        this.A04 = interfaceC1852Ys;
    }

    public void setShowTextInCarousel(boolean z2) {
        this.A05 = z2;
    }
}
