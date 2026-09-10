package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: classes5.dex */
public final class fx extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2042 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2043 = 24744;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2044;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2045;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2046;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean m2142() {
        f2042 = (f2045 + 115) % 128;
        try {
            if (Prode.m220()) {
                f2045 = (f2042 + 69) % 128;
                return true;
            }
            Class.forName(m2143(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) View.getDefaultSize(0, 0), "싙䴏\u0e85岪", "눯꜊版㾿萻㏅\u1aefꌧ䉓뎴❩氊鵹졌ᄆ\uf38dᆿᩂ릵☪\uf63e\ud9f9杜\uda00㟢Ꙭ\udeed䢋ၺ륪灕獘鱇搋䉴喕ﳭ\u2efe", "\u0000\u0000\u0000\u0000").intern());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2143(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2046) ^ ((long) f2044)) ^ ((long) f2043));
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int gidForName;
        int absoluteGravity;
        int i2 = f2042 + 5;
        f2045 = i2 % 128;
        if (i2 % 2 != 0) {
            gidForName = (-1) - Process.getGidForName("");
            absoluteGravity = Gravity.getAbsoluteGravity(1, 0);
        } else {
            gidForName = (-1) - Process.getGidForName("");
            absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
        }
        String strIntern = m2143(gidForName, (char) absoluteGravity, "ﵷ巫疅ኲ", "ᶇ\u0095◹鐞全뮡葅혩浽紿潪⨄\uf039鉸碛Ṁ垚省\ue17e뜷䗆髎⧂\uf80f\uf05e蜞鋵僘魇蘋Ａ띞饛\uf349ꈏ添", "\u0000\u0000\u0000\u0000").intern();
        int i3 = f2042 + 27;
        f2045 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2042 = (f2045 + 39) % 128;
        String strIntern = m2143(11823 - AndroidCharacter.getMirror('0'), (char) (46605 - TextUtils.lastIndexOf("", '0', 0)), "ￅꜭค\u07b6", "৹偉࿋鱞䗴", "\u0000\u0000\u0000\u0000").intern();
        f2042 = (f2045 + 61) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2042 + 97;
        f2045 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return MobileAds.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        int i2 = f2045 + 31;
        f2042 = i2 % 128;
        if (i2 % 2 == 0) {
            m2142();
            throw null;
        }
        if (!m2142()) {
            return new ay(mo2139());
        }
        ay.d dVar = new ay.d(mo2139());
        f2042 = (f2045 + 85) % 128;
        return dVar;
    }
}
