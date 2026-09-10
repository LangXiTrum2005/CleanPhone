package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2000bq extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C2000bq(C2300gi c2300gi, C1558Na c1558Na, boolean z2, int i2, int i3, int i4) {
        super(c2300gi);
        setOrientation(1);
        this.A02 = new TextView(c2300gi);
        YB.A0a(this.A02, true, i2);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c2300gi);
        this.A00 = new TextView(c2300gi);
        YB.A0a(this.A00, false, i3);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C1750Up.A17(c2300gi);
        int i5 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i5, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i5, -2));
        this.A01.setVisibility(8);
        A03(c1558Na, z2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, -2);
        layoutParams.setMargins(0, i4, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2000bq(C2300gi c2300gi, C1558Na c1558Na, boolean z2, boolean z3, boolean z4) {
        int i2 = z3 ? 18 : 22;
        int i3 = z3 ? 14 : 16;
        int i4 = A07;
        this(c2300gi, c1558Na, z2, i2, i3, z4 ? i4 / 2 : i4);
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C1558Na c1558Na, boolean z2) {
        this.A02.setTextColor(c1558Na.A07(z2));
        this.A01.setTextColor(c1558Na.A05(z2));
        this.A00.setTextColor(c1558Na.A06(z2));
    }

    public final void A04(String str, String str2, String str3, boolean z2, boolean z3) {
        int i2 = 1;
        boolean z4 = !TextUtils.isEmpty(str);
        boolean z5 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z4) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z4) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i3 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z4 || !z5) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z2) {
                        i3 = 2;
                    } else if (z3) {
                        i3 = 4;
                    }
                    textView3.setMaxLines(i3);
                    return;
                }
            } else {
                this.A02.setMaxLines(z2 ? 1 : 2);
                TextView textView4 = this.A00;
                if (!z2) {
                    i2 = z3 ? 3 : 2;
                }
                textView4.setMaxLines(i2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i2) {
        if (this.A03) {
            setGravity(i2);
        }
        this.A02.setGravity(i2);
        this.A00.setGravity(i2);
    }

    public void setCTAClickListener(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        ViewOnClickListenerC2003bt viewOnClickListenerC2003btA03 = AbstractC2004bu.A03(viewOnClickListenerC1498Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC2003btA03);
        this.A00.setOnClickListener(viewOnClickListenerC2003btA03);
        this.A01.setOnClickListener(viewOnClickListenerC2003btA03);
    }

    public void setDescriptionTextSize(int i2) {
        this.A00.setTextSize(i2);
    }

    public void setDescriptionVisibility(int i2) {
        this.A00.setVisibility(i2);
    }

    public void setTitleTextSize(int i2) {
        this.A02.setTextSize(i2);
    }
}
