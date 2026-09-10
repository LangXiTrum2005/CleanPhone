package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class jv {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2791 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2792 = -4897670081812094941L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2793 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2670(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m2671("\u2063ꗉ⬍냾㛙밿Ǉ蜥൵鋷ᠯ鹉掴\ue928滯\uf4ed穼\uffc8䕢쭟働홑屢⇨ꝒⲚ닉㡗부̛襫ຩ鐇ᨁ", 34211 - View.combineMeasuredStates(0, 0)).intern().getBytes(m2671("⁶蹜簳⪏颷", ExpandableListView.getPackedPositionGroup(0L) + 44587).intern()), mac.getAlgorithm()));
            String strM2397 = ic.m2397(mac.doFinal(str.replaceAll(m2671("\u2003", 55603 - TextUtils.getOffsetAfter("", 0)).intern(), "").replaceAll(m2671("\u2029", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28978).intern(), "").getBytes(m2671("⁶蹜簳⪏颷", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44587).intern())));
            int i2 = f2793 + 125;
            f2791 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM2397;
            }
            throw null;
        } catch (Exception e2) {
            String strIntern = m2671("\u2062䇣\ue33dՔꚢ죞橴讼ⷸ", 25013 - View.getDefaultSize(0, 0)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2671("\u2066퉊쑧\uf61d\ue83d骞財", 61979 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            sb.append(e2.getLocalizedMessage());
            n.m2835(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2671(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2792);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
