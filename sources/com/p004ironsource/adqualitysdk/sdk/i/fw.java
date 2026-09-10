package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes5.dex */
public final class fw extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2039 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2040 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2041 = 157260195039371603L;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String mo2138() {
        f2039 = (f2040 + 89) % 128;
        String strIntern = m2137("愰겯礼ৄ坶拾끎︸ම嬗暘둰쏔ᅁ彷檯렇쟡ᕰ⃛湃밵쮅\u191fⓨ牬臖쿼ᴴ⢐瘂薰퍺ỒⲺ稤覬휃\ue2f4い翈趽\udb0c\ue686㑆䏱酘\udcc2\ueaaa㠄䞜", 52627 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        f2040 = (f2039 + 119) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String mo2139() {
        f2040 = (f2039 + 121) % 128;
        String strIntern = m2137("愲ᇰ肬㍵ꈧ勑얋瑇\ue70f韍۱릨⡤\udb3c䯇", 28919 - AndroidCharacter.getMirror('0')).intern();
        f2039 = (f2040 + 59) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Class mo2140() {
        int i2 = f2040 + 41;
        f2039 = i2 % 128;
        if (i2 % 2 == 0) {
            return IronSourceAdQuality.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final bg mo2141() {
        bh bhVar = new bh(mo2139());
        int i2 = f2039 + 53;
        f2040 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return bhVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2137(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2041);
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
