package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11747k extends AbstractC2435j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C11747k(AnonymousClass76 anonymousClass76, O7 o7) {
        super(anonymousClass76, o7);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private C2438j3 A01(Runnable runnable) {
        return new C2438j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o8) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = o8.A03();
        String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i2 = 0; i2 < adsArray.length(); i2++) {
                        arrayList.add((JSONObject) adsArray.get(i2));
                    }
                }
            } catch (JSONException unused) {
                String strA04 = A03(36, 38, 101);
                this.A02.A0F().A5g(C1772Vm.A01(AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC2496k8 interfaceC2496k8, JSONObject jSONObject, C1732Tx c1732Tx) {
        this.A0C = false;
        C2437j2 c2437j2 = new C2437j2(this, interfaceC2496k8, AbstractC1811Xd.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c2437j2, c1732Tx.A05());
        interfaceC2496k8.AAt(this.A02, this.A09, this.A08.A08, A01(c2437j2), jSONObject, c1732Tx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0R(N1 n1, C1731Tw c1731Tw, C1729Tu c1729Tu, final O8 o8) {
        this.A02.A0F().A4Y();
        final InterfaceC2496k8 interfaceC2496k8 = (InterfaceC2496k8) n1;
        if (interfaceC2496k8.AKL()) {
            final List<JSONObject> listA04 = A04(o8);
            A06(interfaceC2496k8, listA04.get(0), o8.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC2496k8, listA04, o8);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2496k8, o8.A03(), o8.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2435j0
    public final void A0Y(boolean z2) {
        super.A0Y(z2);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2496k8 interfaceC2496k8, List list, O8 o8) {
        A06(interfaceC2496k8, (JSONObject) list.get(1), o8.A01());
    }
}
