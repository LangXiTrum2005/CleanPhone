package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* JADX INFO: loaded from: classes5.dex */
public final class gl extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2111 = 55043;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2112 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2113 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2114 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2115;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2114 + 33;
        f2113 = i2 % 128;
        return (i2 % 2 != 0 ? m2160(1310322979 - KeyEvent.keyCodeFromString(""), (char) (18939 << (KeyEvent.getMaxKeyCode() << 88)), "⍵᧱㩎\uf853", "溧₷⚟矹杷쌍뗁멋వ鋉몄ᰆ新ﲻ髽\uf661봪跜\ue4a1並\udf3f晨탪⯄勹峏⦬杜ꚥ⤈慘ꩮ\uf219ꢭ״䳫崠\u1afa置ﰴ\udbbaဿ徳ྲྀ\udfe0䌎亶찑滥\ue81fⶭㅅ醙㜆즊", "\u0000\u0000\u0000\u0000") : m2160(KeyEvent.keyCodeFromString("") + 1310322979, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 21306), "⍵᧱㩎\uf853", "溧₷⚟矹杷쌍뗁멋వ鋉몄ᰆ新ﲻ髽\uf661봪跜\ue4a1並\udf3f晨탪⯄勹峏⦬杜ꚥ⤈慘ꩮ\uf219ꢭ״䳫崠\u1afa置ﰴ\udbbaဿ徳ྲྀ\udfe0䌎亶찑滥\ue81fⶭㅅ醙㜆즊", "\u0000\u0000\u0000\u0000")).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2114 + 87;
        f2113 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2160((-1602387105) >>> (ViewConfiguration.getPressedStateDuration() << 53), (char) (PointF.length(1.0f, 2.0f) > 1.0f ? 1 : (PointF.length(1.0f, 2.0f) == 1.0f ? 0 : -1)), "彥綃\ue7a0婌", "䘯뽅녮烓颢\ud9bc鄀铦꒠孉ꆳ", "\u0000\u0000\u0000\u0000") : m2160((-1602387105) - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "彥綃\ue7a0婌", "䘯뽅녮烓颢\ud9bc鄀铦꒠孉ꆳ", "\u0000\u0000\u0000\u0000")).intern();
        f2114 = (f2113 + 103) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = (f2114 + 5) % 128;
        f2113 = i2;
        int i3 = i2 + 57;
        f2114 = i3 % 128;
        if (i3 % 2 != 0) {
            return InneractiveAdManager.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bu buVar = new bu(mo2139());
        f2114 = (f2113 + 57) % 128;
        return buVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2160(int i2, char c2, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2112) ^ ((long) f2115)) ^ ((long) f2111));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }
}
