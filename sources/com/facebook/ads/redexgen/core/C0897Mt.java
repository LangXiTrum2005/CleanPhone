package com.facebook.ads.redexgen.core;

import android.view.View;
import androidx.work.WorkRequest;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0897Mt extends AbstractC1964mI {
    public static byte[] A03;
    public long A00;
    public View A01;
    public M5 A02;

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C0897Mt(M5 m5, AnonymousClass37 anonymousClass37) {
        super(m5, anonymousClass37);
        this.A00 = WorkRequest.MIN_BACKOFF_MILLIS;
        this.A02 = m5;
    }

    private C1967mL A01(Runnable runnable) {
        return new C1967mL(this, runnable);
    }

    private List<JSONObject> A04(AnonymousClass38 anonymousClass38) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = anonymousClass38.A03();
        String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i = 0; i < adsArray.length(); i++) {
                        arrayList.add((JSONObject) adsArray.get(i));
                    }
                }
            } catch (JSONException unused) {
                String strA04 = A03(36, 38, 101);
                this.A02.A0F().A5W(C0597Ag.A01(AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC2016n9 interfaceC2016n9, JSONObject jSONObject, C05618u c05618u) {
        this.A0C = false;
        C1966mK c1966mK = new C1966mK(this, interfaceC2016n9, CV.A02(jSONObject, A03(34, 2, 114)));
        A0H().postDelayed(c1966mK, c05618u.A05());
        interfaceC2016n9.AAi(this.A02, this.A09, this.A08.A08, A01(c1966mK), jSONObject, c05618u);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4U();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0R(AnonymousClass23 anonymousClass23, C05608t c05608t, C05588r c05588r, final AnonymousClass38 anonymousClass38) {
        this.A02.A0F().A4O();
        final InterfaceC2016n9 interfaceC2016n9 = (InterfaceC2016n9) anonymousClass23;
        if (interfaceC2016n9.AJQ()) {
            final List<JSONObject> listA04 = A04(anonymousClass38);
            A06(interfaceC2016n9, listA04.get(0), anonymousClass38.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.39
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC2016n9, listA04, anonymousClass38);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2016n9, anonymousClass38.A03(), anonymousClass38.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0U(String str) {
        this.A02.A0F().A4T(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1964mI
    public final void A0Y(boolean z) {
        super.A0Y(z);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2016n9 interfaceC2016n9, List list, AnonymousClass38 anonymousClass38) {
        A06(interfaceC2016n9, (JSONObject) list.get(1), anonymousClass38.A01());
    }
}
