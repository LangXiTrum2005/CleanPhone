package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2921 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2922 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static dp f2923 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2924 = 9129661839050511924L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f2925;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f2926;

    public jz(String str, boolean z10) {
        this.f2926 = str;
        this.f2925 = z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m2767() {
        f2921 = (f2922 + 77) % 128;
        String strM2038 = f2923.m2038();
        try {
            String strReplace = strM2038.replace(m2770("陯\ue510炃찇宂휊⊍븙ඓ餕ᒃ怓ﾟ䬉욇刈ꆁ㴆袇", 29567 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2772()).replace(m2770("陯ጾ鳕ᦈ茽೬覝㍍볣㦧ꍍⰒꦥ", View.MeasureSpec.getMode(0) + 34129).intern(), f2923.m2037());
            if (this.f2925) {
                f2921 = (f2922 + 65) % 128;
                strM2038 = strReplace.replace(m2770("陯亸⟟ᳩ\uf53c꩕荿箊僆২\uee0f읔", (-16721705) - Color.rgb(0, 0, 0)).intern(), f2923.m2040());
            } else {
                strM2038 = strReplace.replace(m2770("陯亸⟟ᳩ\uf53c꩕荿箊僆২\uee0f읔", 55511 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), "");
            }
            String strReplace2 = strM2038.replace(m2770("陯㋼\udf51篂жꂥ䴃ᙲ닸彐ﯘ萺ₚ촐陣㋴", KeyEvent.normalizeMetaState(0) + 42131).intern(), this.f2926);
            f2921 = (f2922 + 79) % 128;
            return strReplace2;
        } catch (Throwable th2) {
            String strIntern = m2770("陣零霘鞗铁锒閩鋯鍿鎢郜酳醅鸬齢龒鰶", 167 - Color.blue(0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2770("陱ȥ뺀⭲쟊珻\uec0f飯㔌ꄨ嶏\uf601拚ὀ謊➖큍䳉\uf8a8锈ǫ멟嚌싱", 37987 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            sb2.append(th2.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
            return strM2038;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m2769(jz jzVar) {
        int i10 = f2921 + 47;
        f2922 = i10 % 128;
        if (i10 % 2 == 0) {
            return jzVar.m2768();
        }
        jzVar.m2768();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2772() {
        f2921 = (f2922 + 117) % 128;
        String strM467 = ar.m468().mo482().m467();
        f2922 = (f2921 + 69) % 128;
        return strM467;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2773(final WebView webView) {
        try {
            p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    final String strM2769 = jz.m2769(jz.this);
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            ko.m2936(webView, strM2769);
                        }
                    });
                }
            });
            f2921 = (f2922 + 85) % 128;
        } catch (Exception e10) {
            String strIntern = m2770("陣零霘鞗铁锒閩鋯鍿鎢郜酳醅鸬齢龒鰶", 167 - TextUtils.indexOf("", "", 0)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2770("陱雳霬鑄钒閝鉣銩鏶逌酅醇鸡齫龵鲏鴎驂骮鬯顿飍駍蘒蚮蟏萿蕆薏芏茢", 229 - AndroidCharacter.getMirror('0')).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2771(dp dpVar) {
        int i10 = f2921;
        f2923 = dpVar;
        f2922 = (i10 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2768() {
        f2921 = (f2922 + 55) % 128;
        String strM2521 = il.m2521(m2767().getBytes());
        int i10 = f2921 + 59;
        f2922 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM2521;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2770(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2924);
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
