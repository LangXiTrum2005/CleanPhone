package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ij {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2411 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2412 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2413 = -687744399354335608L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2435(String str, String str2) {
        int i2 = f2411 + 77;
        f2412 = i2 % 128;
        int i3 = i2 % 2;
        n.m2826(str, str2);
        if (i3 != 0) {
            throw null;
        }
        f2411 = (f2412 + 23) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2436(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f2413, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2413));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2438(String str, String str2) {
        f2412 = (f2411 + 103) % 128;
        n.m2835(str, str2);
        int i2 = f2411 + 81;
        f2412 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2434(Context context) {
        String string;
        SharedPreferences.Editor editorEdit;
        String strM2436;
        f2412 = (f2411 + 19) % 128;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m2436("ﳈ飻ᐊﲻ阜\uf607쥵\uddf6䚍끽荑鏒袦穗䔸", TextUtils.getTrimmedLength("")).intern(), 0);
        String string2 = sharedPreferences.getString(m2436("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", View.MeasureSpec.getMode(0)).intern(), null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        int i2 = f2412 + 13;
        f2411 = i2 % 128;
        if (i2 % 2 == 0) {
            string = UUID.randomUUID().toString();
            editorEdit = sharedPreferences.edit();
            TextUtils.lastIndexOf("", '%', 1, 1);
            strM2436 = m2436("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", 0);
        } else {
            string = UUID.randomUUID().toString();
            editorEdit = sharedPreferences.edit();
            strM2436 = m2436("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", TextUtils.lastIndexOf("", '0', 0, 0) + 1);
        }
        editorEdit.putString(strM2436.intern(), string).commit();
        f2411 = (f2412 + 95) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2437(Context context) {
        String string;
        String strIntern;
        int i2;
        int i3 = f2412 + 37;
        f2411 = i3 % 128;
        if (i3 % 2 != 0 ? (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2436("䃮줗䴧䂏\uf4b1\ua7f1道뽛瑱\ue1d6\uda73\uf156㓇⮻", ViewConfiguration.getPressedStateDuration() >> 16).intern())) == null : (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m2436("䃮줗䴧䂏\uf4b1\ua7f1道뽛瑱\ue1d6\uda73\uf156㓇⮻", ViewConfiguration.getPressedStateDuration() >>> 8).intern())) == null) {
            int i4 = f2412 + 43;
            f2411 = i4 % 128;
            if (i4 % 2 == 0) {
                strIntern = m2436("\ufbcc晴\u17eeﮅﶽ鑊쪵뙠䆩퉯肟\uf825迃ᠻ䛍䈆헙昋\u1cfb萡ጟ귱툟짗変\uebdd栎\u13f7ꝩㆿ⹛喗\ued49羗\ue47d龠⪿", ViewConfiguration.getScrollBarFadeDuration() >> 127).intern();
                i2 = 1;
            } else {
                strIntern = m2436("\ufbcc晴\u17eeﮅﶽ鑊쪵뙠䆩퉯肟\uf825迃ᠻ䛍䈆헙昋\u1cfb萡ጟ귱툟짗変\uebdd栎\u13f7ꝩㆿ⹛喗\ued49羗\ue47d龠⪿", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern();
                i2 = 0;
            }
            m2438(strIntern, m2436("ྰ蒕괩\u0ff3ឧ\uea72灌屓뗴걓㨾ቫ篐昻ﰜꠋ↳᠕ꙹ渞\ue77e폙棫⏰굙闹틆淪匴俳铙뾪ᤣƔ康疸\ude90뭺͜\u0b51蓵絏앸셫䪕㜹轙蜖\uf0b4\ue953", View.MeasureSpec.getMode(i2)).intern());
            string = m2434(context);
        }
        f2411 = (f2412 + 79) % 128;
        return string;
    }
}
