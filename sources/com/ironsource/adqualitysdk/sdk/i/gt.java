package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2228 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2229 = 3888530524792720430L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2230;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2260(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2229);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final jl.e m2261() {
        int i10 = f2228 + 95;
        f2230 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m468().mo482().m466();
            throw null;
        }
        if (!ar.m468().mo482().m466()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2260("豍쿊ୖ䛡艧\uddfaᤘ和逄펾⽯", 17290 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            sb2.append(mo2240());
            return new jl.e(sb2.toString(), m2260("谙脫陈", 3419 - AndroidCharacter.getMirror('0')).intern());
        }
        String strM465 = ar.m468().mo482().m465(mo2240());
        if (TextUtils.isEmpty(strM465)) {
            int i11 = f2230 + InterfaceC0435l1.d.b.f29110g;
            f2228 = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2260("豍쿊ୖ䛡艧\uddfaᤘ和逄펾⽯", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17291).intern());
        sb3.append(mo2240());
        jl.a aVar = new jl.a(sb3.toString(), m2260("谙脫陈", 3371 - KeyEvent.normalizeMetaState(0)).intern(), strM465);
        f2228 = (f2230 + 3) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo2240();

    /* JADX INFO: renamed from: ｋ */
    public abstract be mo2241();

    /* JADX INFO: renamed from: ﾇ */
    public abstract String mo2242();

    /* JADX INFO: renamed from: ﾒ */
    public abstract Class mo2243();
}
