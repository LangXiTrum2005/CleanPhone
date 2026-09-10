package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass80 implements InterfaceC2496k8 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public N9 A01;
    public NA A02;
    public C2472jk A03;
    public C2470ji A04;
    public AnonymousClass76 A05;
    public Z1 A06;
    public Z2 A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(AnonymousClass76 anonymousClass76, C2470ji c2470ji, C1706Sx c1706Sx, N9 n9, Z2 z2) {
        String strA7O = c2470ji.A7O();
        if (!TextUtils.isEmpty(strA7O)) {
            c1706Sx.A0e(new VI(strA7O, anonymousClass76.A0A()));
        }
        C1762Vb c1762VbA0I = c2470ji.A0I();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (c1762VbA0I != null) {
            C1704Sv c1704Sv = new C1704Sv(c2470ji.A0I().getUrl(), c2470ji.A0I().getHeight(), c2470ji.A0I().getWidth(), c2470ji.A0b(), A03(2, 16, 120));
            c1704Sv.A01 = new T3(false, -1, -1);
            c1706Sx.A0W();
            c1706Sx.A0c(c1704Sv);
        }
        if (c2470ji.A0H() != null) {
            c1706Sx.A0c(new C1704Sv(c2470ji.A0H().getUrl(), c2470ji.A0H().getHeight(), c2470ji.A0H().getWidth(), c2470ji.A0b(), A03(2, 16, 120)));
        }
        String strA0e = c2470ji.A0e();
        if (strA0e != null && !TextUtils.isEmpty(strA0e)) {
            c1706Sx.A0b(new C1702St(strA0e, c2470ji.A0b(), A03(2, 16, 120), c2470ji.A0D()));
        }
        AbstractC2465jd abstractC2465jdA0F = c2470ji.A0F();
        String strA03 = A03(2, 16, 120);
        if (abstractC2465jdA0F != null) {
            O0.A00(c2470ji.A0F(), c1706Sx, strA03);
        }
        C2484jw c2484jw = new C2484jw(this, z2, n9, anonymousClass76);
        String clientToken2 = c2470ji.A0b();
        c1706Sx.A0X(c2484jw, new C1699Sq(clientToken2, strA03));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2496k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC1774Vp enumC1774Vp, N9 n9, JSONObject jSONObject, C1732Tx c1732Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        C1706Sx c1706Sx = new C1706Sx(anonymousClass76);
        this.A00 = System.currentTimeMillis();
        C2470ji c2470jiA00 = NI.A00(anonymousClass76, jSONObject, AbstractC1811Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c2470jiA00;
        if (!AbstractC1556Mx.A06(anonymousClass76, c2470jiA00, va)) {
            Z1 adViewListener = new C2486jy(this, anonymousClass76);
            this.A06 = adViewListener;
            Z2 z2 = new Z2(anonymousClass76, va, c1706Sx, new WeakReference(adViewListener), c1732Tx.A04(), c1732Tx.A07(), c1732Tx.A08(), c1732Tx.A09(), c2470jiA00, this.A08);
            this.A07 = z2;
            this.A03 = new C2472jk(anonymousClass76, new C2485jx(this, anonymousClass76, n9), z2.getViewabilityChecker(), va, c2470jiA00);
            A05(anonymousClass76, c2470jiA00, c1706Sx, n9, z2);
            this.A02 = new NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, C1772Vm.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2527kf interfaceC2527kfA0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC2527kfA0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        NA na = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (na != null) {
            this.A02.A03();
        }
    }
}
