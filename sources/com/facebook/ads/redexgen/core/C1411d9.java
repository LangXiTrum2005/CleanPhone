package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1411d9 extends C6K implements DY {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C03962h A00;
    public JK A01;
    public JL A02;
    public JL A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1828k1 A06;
    public final LU A07;

    public C1411d9(LU lu, SparseBooleanArray sparseBooleanArray, JL jl, int i, C1828k1 c1828k1, C03962h c03962h) {
        super(lu);
        this.A06 = c1828k1;
        this.A07 = lu;
        this.A05 = sparseBooleanArray;
        this.A02 = jl;
        this.A04 = i;
        this.A00 = c03962h;
    }

    private void A0A(A7 a7, C0647Cv c0647Cv, String str, C0758Hc c0758Hc) {
        if (this.A05.get(c0758Hc.A02())) {
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
        this.A01 = new C1414dC(this, str, c0758Hc, a7, c0758Hc.A04(), c0647Cv);
        this.A03 = new JL(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C1413dB(this, c0758Hc));
    }

    public final void A0j(C0758Hc c0758Hc, A7 a7, C05357t c05357t, C0647Cv c0647Cv, String str, int i, int i2, int i3) {
        int iA02 = c0758Hc.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c0758Hc);
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
        String strA08 = c0758Hc.A03().A0F().A08();
        String strA09 = c0758Hc.A03().A0F().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1F()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(c05357t.A0S(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c0758Hc.A03().A0H(), c0758Hc.A04());
        this.A07.A1G(c0758Hc.A04());
        A0A(a7, c0647Cv, str, c0758Hc);
    }

    public final void A0k(JL jl) {
        this.A02 = jl;
    }

    @Override // com.facebook.ads.redexgen.core.DY
    public final void AIL() {
        this.A07.A1A();
    }
}
