package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gs extends gt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2225 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2226 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2227 = 2757544375072309387L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        int i10 = f2226 + 125;
        f2225 = i10 % 128;
        return m2259("샢奚\uf39bීꘅ쁑媒\uf4c6ചꝊ솘", i10 % 2 == 0 ? 39359 >> ExpandableListView.getPackedPositionType(0L) : ExpandableListView.getPackedPositionType(0L) + 39359).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bt btVar = new bt(mo2240());
        int i10 = f2225 + 3;
        f2226 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 82 / 0;
        }
        return btVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int i10 = f2226 + InterfaceC0435l1.d.b.f29114k;
        f2225 = i10 % 128;
        String strIntern = m2259("샨\uffef뻰綄㳁\ufbc5몫禣㢡\uf7c6뚌疜㑡\uf361뉣煏じ\uef44긤洬ⰲ\ueb42ꨊ椒⧨\ue8b6\ua7f0曚○\ue4d1ꎳ抰↊\ue08c鿓幃ᵩ\udc72魌婔ᥒ\ud82b霱嘻ᔙ퐁錰只ዖ퇱郃俛໐충貫", i10 % 2 == 0 ? (KeyEvent.getMaxKeyCode() << 34) * 32553 : (KeyEvent.getMaxKeyCode() >> 16) + 16139).intern();
        f2225 = (f2226 + 61) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2226;
        f2225 = (i10 + 119) % 128;
        f2225 = (i10 + 9) % 128;
        return InneractiveAdManager.class;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2259(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2227);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
