package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1199Fq extends RK implements InterfaceC1679Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C1395Ng A00;
    public AbstractC2075fo A01;
    public C2076fp A02;
    public C2076fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C2131gi A06;
    public final C6M A07;

    public C1199Fq(C6M c6m, SparseBooleanArray sparseBooleanArray, C2076fp c2076fp, int i, C2131gi c2131gi, C1395Ng c1395Ng) {
        super(c6m);
        this.A06 = c2131gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c2076fp;
        this.A04 = i;
        this.A00 = c1395Ng;
    }

    private void A05(VA va, Y2 y2, String str, C1969e5 c1969e5) {
        if (this.A05.get(c1969e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C1201Fs(this, str, c1969e5, va, c1969e5.A04(), y2);
        this.A03 = new C2076fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C1200Fr(this, c1969e5));
    }

    public final void A0p(C1969e5 c1969e5, VA va, C1537Sx c1537Sx, Y2 y2, String str, int i, int i2, int i3) {
        int iA02 = c1969e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c1969e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = iA02 == 0 ? i3 : i2;
        if (iA02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String strA08 = c1969e5.A03().A0H().A08();
        String strA09 = c1969e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(c1537Sx.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1969e5.A03().A0J(), c1969e5.A04());
        this.A07.A1W(c1969e5.A04());
        A05(va, y2, str, c1969e5);
    }

    public final void A0q(C2076fp c2076fp) {
        this.A02 = c2076fp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1679Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
