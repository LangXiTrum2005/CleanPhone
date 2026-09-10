package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class an {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f312 = -3927734697160398019L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f313 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f314 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m440(Context context) {
        int i10 = f313 + 49;
        f314 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                return kk.m2886(m443(), m441("⭚㴝߃榻片䐗껗낿饻\ue333\uf5ea", TextUtils.getOffsetBefore("", 0) + 5701).intern(), (List<Object>) Arrays.asList(context)).invoke(null, context);
            }
            Method methodM2886 = kk.m2886(m443(), m441("⭚㴝߃榻片䐗껗낿饻\ue333\uf5ea", 25488 / TextUtils.getOffsetBefore("", 1)).intern(), (List<Object>) Arrays.asList(context));
            Object[] objArr = new Object[1];
            objArr[1] = context;
            return methodM2886.invoke(null, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i11 = f314 + 55;
            f313 = i11 % 128;
            if (i11 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m444(Object obj, BroadcastReceiver broadcastReceiver) {
        int i10 = f313 + 115;
        f314 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                kk.m2886(obj, m441("⭈ꬶ⮅꩷⫎ꪭ⤐ꦊ⡰ꣂ⢝꼏\u2fe2깹⻒꺠ⴈ귺", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32868).intern(), (List<Object>) Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
                return;
            }
            String strIntern = m441("⭈ꬶ⮅꩷⫎ꪭ⤐ꦊ⡰ꣂ⢝꼏\u2fe2깹⻒꺠ⴈ귺", 32868 % (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))).intern();
            Object[] objArr = new Object[0];
            objArr[1] = broadcastReceiver;
            kk.m2886(obj, strIntern, (List<Object>) Arrays.asList(objArr)).invoke(obj, broadcastReceiver);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Class m443() {
        f313 = (f314 + 27) % 128;
        Class clsM2870 = kk.m2870(m441("⭜畢霻㇜厖ﶡṿ렒\uda9b擨蚸❅䄐\ue32c\u0df1꾐졂樝됫훽炈酋㍿崷ￄᦚ뮦쑱昄胂⊭䲱\ued72༂꧋쯫ᖷ뙜큕爆鳺㺇彖索ᬓꗒ잜憣艩ⰿ从\ue88dઽꭕ\uf50a។뇤펳籂鸄", 24113 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), false);
        f313 = (f314 + 53) % 128;
        return clsM2870;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m442(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        f314 = (f313 + 69) % 128;
        try {
            kk.m2886(obj, m441("⭏綍蛰⼫瀚饠⎦璜鷇☥伌避㪨䎚链㴴", 22229 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), (List<Object>) Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            f313 = (f314 + 51) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m441(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f312);
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
