package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1207Fy extends R7 {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC1892cp A02;
    public C2076fp A04;
    public List<C1969e5> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C2201hr A0C;
    public final RF A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final InterfaceC1896ct A0F = new G1(this);
    public InterfaceC1894cr A03 = new G0(this);
    public final InterfaceC1895cs A0E = new C1208Fz(this);

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public C1207Fy(C1J c1j, int i, List<C1969e5> list, C2076fp c2076fp, Bundle bundle) {
        this.A0C = c1j.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c2076fp;
        this.A0D = new C2200hq(c1j.getContext());
        this.A0B = c1j.getContext();
        c1j.A1h(this);
        A0D(bundle);
    }

    private AbstractC1292Jg A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private AbstractC1292Jg A04(int i, int i2, boolean z) {
        AbstractC1292Jg abstractC1292Jg = null;
        while (i <= i2) {
            AbstractC1292Jg abstractC1292Jg2 = (AbstractC1292Jg) this.A0C.A1o(i);
            if (abstractC1292Jg2 == null || abstractC1292Jg2.A1U()) {
                return null;
            }
            boolean zA0a = A0a(abstractC1292Jg2);
            if (abstractC1292Jg == null && abstractC1292Jg2.A1V() && zA0a && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(abstractC1292Jg2, this.A0A))) {
                abstractC1292Jg = abstractC1292Jg2;
            }
            if (abstractC1292Jg2.A1V() && !zA0a) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC1292Jg;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC1292Jg abstractC1292JgA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC1292JgA03 != null) {
            abstractC1292JgA03.A1S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA25 = this.A0C.A25();
        if (iA25 != -1) {
            int curPos = this.A05.size();
            if (iA25 < curPos - 1) {
                int curPos2 = iA25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC1292Jg abstractC1292JgA04 = A04(i + 1, this.A0C.A27(), false);
        if (abstractC1292JgA04 != null) {
            abstractC1292JgA04.A1S();
            A0U(((Integer) abstractC1292JgA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC1844c3 abstractC1844c3, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = XX.A04.widthPixels - 1;
        } else {
            int width = abstractC1844c3.getWidth();
            int allowedAreaMinX = XX.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i2 = XX.A04.widthPixels;
            int allowedAreaMinX2 = abstractC1844c3.getWidth();
            furthestX = (int) (((i2 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC1844c3.getX();
        int allowedAreaMinX3 = abstractC1844c3.getWidth();
        return ((int) (x + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC1844c3.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC1292Jg abstractC1292Jg) {
        if (!this.A08 || !abstractC1292Jg.A1V()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public void A0L(C7M c7m, int i) {
        super.A0L(c7m, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public void A0M(C7M c7m, int i, int i2) {
        super.A0M(c7m, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC1894cr A0N() {
        return this.A03;
    }

    public final InterfaceC1895cs A0O() {
        return this.A0E;
    }

    public final InterfaceC1896ct A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA27 = this.A0C.A27();
        for (int iA26 = this.A0C.A26(); iA26 <= iA27 && iA26 >= 0; iA26++) {
            AbstractC1292Jg card = (AbstractC1292Jg) this.A0C.A1o(iA26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1U()) {
                this.A01 = iA26;
                card.A1R();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1292Jg abstractC1292Jg = (AbstractC1292Jg) this.A0C.A1o(this.A01);
        if (abstractC1292Jg != null && this.A01 >= 0) {
            abstractC1292Jg.A1S();
        }
    }

    public final void A0S(int i) {
        AbstractC1292Jg abstractC1292Jg = (AbstractC1292Jg) this.A0C.A1o(i);
        if (abstractC1292Jg != null && !A0a(abstractC1292Jg)) {
            A0Z(abstractC1292Jg, false);
        }
    }

    public final void A0T(int i) {
        AbstractC1292Jg abstractC1292Jg = (AbstractC1292Jg) this.A0C.A1o(i);
        if (abstractC1292Jg == null) {
            return;
        }
        if (A0a(abstractC1292Jg)) {
            A0Z(abstractC1292Jg, true);
        }
        if (A0J(abstractC1292Jg) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC1292Jg.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AKa(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC1892cp interfaceC1892cp) {
        this.A02 = interfaceC1892cp;
    }

    public void A0Z(AbstractC1292Jg abstractC1292Jg, boolean z) {
        if (A0H()) {
            A0X(abstractC1292Jg, z);
        }
        if (!z && abstractC1292Jg.A1U()) {
            abstractC1292Jg.A1R();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
