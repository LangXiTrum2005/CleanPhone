package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kh {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2987 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2988 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2989 = 10592;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2990 = 4783;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2991 = {817065767, -2136142836, -266385091, -152372046, -709605310, 1194132331, -1283317232, -1182896738, 1086014787, 950692622, 689422918, -937270331, -987929511, -1190556387, 2015879889, -739374129, -2129436872, 1895251807};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2992 = 58010;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2993 = 35945;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2833(Context context, JSONObject jSONObject) {
        f2987 = (f2988 + 65) % 128;
        String strIntern = m2835("䖳輖쾡鶜㦽麟툭띍", 8 - Drawable.resolveOpacity(0, 0)).intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m2835("ι\ude2b", TextUtils.lastIndexOf("", '0', 0) + 3).intern(), packageName);
        } catch (JSONException e10) {
            m.m2983(strIntern, m2835("챘粄冹旐ꭑ\uaacb雧\uee75烡\uda5a慆䓀溰∫튺ꩧॄ陗‟ퟡ龣謚뾇絼ㄖ⟎軻༟\uf254鮇門ঢ䚘虬", 35 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), e10);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m2835("ᬽ絎", KeyEvent.keyCodeFromString("") + 2).intern(), packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2835("챘粄冹旐ꭑ\uaacb雧\uee75烡\uda5a慆䓀嫰葕\udc3d糜甆\udba9恈紲Ộ閤犫๕ⵓ睕퐲뚦\uf053녺ଘ튖꼪\ue47d焄\ufb19裼檴\uf28bᄠ둛탎ᣫ᧙淝䟑\uf83f붱ꉗ軗ᡄ頹", 52 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
            sb2.append(e11.getLocalizedMessage());
            m.m2964(strIntern, sb2.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m2835("\uec32ᛁ", (ViewConfiguration.getTouchSlop() >> 8) + 2).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m2832(new int[]{-1136415100, -524444643}, (Process.myPid() >> 22) + 2).intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e12) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2832(new int[]{-705128250, 411297831, 521637694, 134635620, 540422820, -17819908, -1218430229, 1385216179, -983593031, -873023621, -1581437908, -570450465, -2094481686, 414791373, 293545415, 359009839, 791504049, -2043350236}, 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            sb3.append(packageName);
            sb3.append(m2835("挚埛淝䟑\uf83f붱ꉗ軗ᡄ頹", View.resolveSizeAndState(0, 0, 0) + 10).intern());
            sb3.append(e12.getLocalizedMessage());
            m.m2964(strIntern, sb3.toString());
        } catch (JSONException e13) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2832(new int[]{-705128250, 411297831, 521637694, 134635620, -417003379, -183802469, -603187253, -347520238, 1982003592, 698294392, 2127391129, -379296876, -1917746489, 1024837326, -1464849053, -1437507758, -1994754117, 1684885785, 359067447, -2145571348, 200954191, -1008788242, 47608036, -2074679949}, Color.red(0) + 46).intern());
            sb4.append(e13.getLocalizedMessage());
            m.m2964(strIntern, sb4.toString());
        }
        try {
            jSONObject.put(m2835("ꭑ\uaacb", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            f2987 = (f2988 + 53) % 128;
        } catch (PackageManager.NameNotFoundException e14) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m2832(new int[]{-705128250, 411297831, 521637694, 134635620, 540422820, -17819908, -1218430229, 1385216179, -983593031, -873023621, -1581437908, -570450465, -2094481686, 414791373, 293545415, 359009839, 791504049, -2043350236}, TextUtils.lastIndexOf("", '0', 0, 0) + 34).intern());
            sb5.append(packageName);
            sb5.append(m2835("挚埛淝䟑\uf83f붱ꉗ軗ᡄ頹", 10 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            sb5.append(e14.getLocalizedMessage());
            m.m2964(strIntern, sb5.toString());
        } catch (JSONException e15) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m2832(new int[]{-705128250, 411297831, 521637694, 134635620, -417003379, -183802469, -603187253, -347520238, -26043751, 509835602, -1610645623, -1695356200, -1766904821, -807221429, 319021240, 766782849, -1243674384, 1965397676, -928399111, 1201474789, 1977920749, 63696534}, Color.alpha(0) + 43).intern());
            sb6.append(e15.getLocalizedMessage());
            m.m2964(strIntern, sb6.toString());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2834() {
        f2987 = (f2988 + 91) % 128;
        try {
            try {
                Class.forName(m2835("ﴰᆚޅ\udae1튺ꩧՅ嶹쎨⫅牳퉫₇⼫પ偷Ộ閤︻쌃賉\ue16c厊䤰疁췇પ偷Ộ閤", 30 - TextUtils.getOffsetAfter("", 0)).intern());
                String strIntern = m2832(new int[]{211844846, 1567376424}, KeyEvent.normalizeMetaState(0) + 1).intern();
                int i10 = f2987 + 125;
                f2988 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 89 / 0;
                }
                return strIntern;
            } catch (ClassNotFoundException unused) {
                return m2832(new int[]{-608620093, 1886354061}, 1 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName(m2832(new int[]{238049078, 448413062, 1956044932, 1600265017, -2008758410, -460253779, 1903784802, 1041998496, -1724697976, 606849989, -2068751604, -566093893, 1155051548, 2098269482, 1155051548, 2098269482, 2030926240, 1159205481, -990952231, -1627223621, -727578004, 185207364, -1064275710, 436862692, -1772434816, 1276550113, 782600909, -145707544, 2127391129, -379296876}, Color.green(0) + 60).intern());
            return m2835("夑㻖", 1 - (Process.myTid() >> 22)).intern();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2836(Context context, String str) {
        int i10 = f2987 + 1;
        f2988 = i10 % 128;
        if (i10 % 2 != 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        f2988 = (f2987 + 61) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2835(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2992)) ^ ((c5 >>> 5) + f2990)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2989) ^ ((c10 + i12) ^ ((c10 << 4) + f2993))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2831(Context context) {
        PackageManager packageManager;
        String packageName;
        int i10 = f2988 + 117;
        f2987 = i10 % 128;
        if (i10 % 2 == 0) {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        } else {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        }
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName;
            int i11 = f2988 + 89;
            f2987 = i11 % 128;
            if (i11 % 2 != 0) {
                return str;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException e10) {
            String strIntern = m2835("䖳輖쾡鶜㦽麟툭띍", 8 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2832(new int[]{-705128250, 411297831, 521637694, 134635620, 540422820, -17819908, -1218430229, 1385216179, -983593031, -873023621, -1581437908, -570450465, -2094481686, 414791373, 293545415, 359009839, 791504049, -2043350236}, KeyEvent.getDeadChar(0, 0) + 33).intern());
            sb2.append(packageName);
            sb2.append(m2835("挚埛淝䟑\uf83f붱ꉗ軗ᡄ頹", 10 - TextUtils.indexOf("", "", 0, 0)).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2964(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2832(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2991.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
