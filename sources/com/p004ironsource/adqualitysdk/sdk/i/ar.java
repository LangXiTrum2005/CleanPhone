package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ar extends as.AnonymousClass3 {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f338 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f339;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final int f344 = (int) TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f342 = {184801126, -1639353577, -274655506, 1648228947, -1057480481, 1068008412, 123411374, -1006540659, -1715508370, -553615642, -2114135597, 8010784, 1319891523, -680565863, 1621223362, 1899910779, 1537152614, -2094689366};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f340 = 80902793371995309L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f343 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f341 = 0;

    public ar(au auVar) {
        m455(new int[]{2064642512, -613354505, -92546326, -1347088344}, ImageFormat.getBitsPerPixel(0) + 8).intern();
        m455(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, 9 - View.combineMeasuredStates(0, 0)).intern();
        m502(auVar);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final long m457() {
        JSONObject jSONObjectM501;
        int i2;
        int packedPositionChild;
        int i3 = f339 + 113;
        f338 = i3 % 128;
        if (i3 % 2 == 0) {
            jSONObjectM501 = m501();
            i2 = (PointF.length(1.0f, 0.0f) > 1.0f ? 1 : (PointF.length(1.0f, 0.0f) == 1.0f ? 0 : -1));
            packedPositionChild = 38131 / ExpandableListView.getPackedPositionChild(0L);
        } else {
            jSONObjectM501 = m501();
            i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            packedPositionChild = 38131 - ExpandableListView.getPackedPositionChild(0L);
        }
        long jOptLong = jSONObjectM501.optLong(m456(i2, (char) packedPositionChild, "蚾\ueb8d\uf429貔", "꾎盧", "䲭瑆沩ğ").intern(), 0L);
        f338 = (f339 + 123) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final long m458() {
        f339 = (f338 + 27) % 128;
        long jOptLong = m501().optLong(m456(1219151686 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (56056 - View.resolveSizeAndState(0, 0, 0)), "䘠\uaac7\uf848䯚", "곒\uec9bï", "䲭瑆沩ğ").intern(), 0L);
        int i2 = f338 + 3;
        f339 = i2 % 128;
        if (i2 % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m459() {
        JSONObject jSONObjectOptJSONObject;
        int i2 = f338 + 115;
        f339 = i2 % 128;
        if (i2 % 2 == 0 ? (jSONObjectOptJSONObject = m501().optJSONObject(m456((-1942049510) - (Process.myPid() >> 22), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 39885), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null : (jSONObjectOptJSONObject = m501().optJSONObject(m456((-1942049510) / (Process.myPid() + 102), (char) (39885 - View.MeasureSpec.makeMeasureSpec(0, 1)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null) {
            return jSONObjectOptJSONObject.optString(m456((-945719977) - ExpandableListView.getPackedPositionChild(0L), (char) (6401 - Color.alpha(0)), "壴ꅵǇน", "\ueddd", "䲭瑆沩ğ").intern(), m455(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10).intern());
        }
        String strIntern = m455(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, (-16777207) - Color.rgb(0, 0, 0)).intern();
        int i3 = f339 + 75;
        f338 = i3 % 128;
        if (i3 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final long m460() {
        JSONObject jSONObjectM501;
        String strM455;
        int i2 = f338 + 105;
        f339 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM501 = m501();
            strM455 = m455(new int[]{-1968164846, 1771119708}, 5 / TextUtils.getOffsetAfter("", 1));
        } else {
            jSONObjectM501 = m501();
            strM455 = m455(new int[]{-1968164846, 1771119708}, TextUtils.getOffsetAfter("", 0) + 2);
        }
        return jSONObjectM501.optLong(strM455.intern(), 0L);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m461() {
        JSONObject jSONObjectOptJSONObject;
        int i2 = f339 + 59;
        f338 = i2 % 128;
        if (i2 % 2 != 0 ? (jSONObjectOptJSONObject = m501().optJSONObject(m456((ViewConfiguration.getTouchSlop() >> 8) - 1942049510, (char) (39885 - (Process.myTid() >> 22)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null : (jSONObjectOptJSONObject = m501().optJSONObject(m456((-1942049510) >>> (ViewConfiguration.getTouchSlop() << 44), (char) (39885 >> (Process.myTid() - 58)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null) {
            return jSONObjectOptJSONObject.optString(m456((-2020579062) - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33912), "\u0b97適碇誄", "찿", "䲭瑆沩ğ").intern(), m455(new int[]{2064642512, -613354505, -92546326, -1347088344}, 6 - TextUtils.lastIndexOf("", '0')).intern());
        }
        String strIntern = m455(new int[]{2064642512, -613354505, -92546326, -1347088344}, TextUtils.getCapsMode("", 0, 0) + 7).intern();
        int i3 = f338 + 89;
        f339 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m462() {
        List<String> listM543 = m500().m543();
        listM543.addAll(kc.m2762(m501(), m455(new int[]{-311205064, -1346332935}, Color.green(0) + 3).intern(), new ArrayList()));
        int i2 = f339 + 123;
        f338 = i2 % 128;
        if (i2 % 2 != 0) {
            return listM543;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m463() {
        List<String> listM546 = m500().m546();
        listM546.addAll(kc.m2762(m501(), m456((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1619279477, (char) (59130 - (ViewConfiguration.getScrollBarSize() >> 8)), "诮篁犯\uf5e6", "娊䀃\u0c53", "䲭瑆沩ğ").intern(), new ArrayList()));
        f339 = (f338 + 17) % 128;
        return listM546;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m464() {
        f338 = (f339 + 123) % 128;
        int iOptInt = m501().optInt(m455(new int[]{-52602431, 1162499507}, 3 - TextUtils.getTrimmedLength("")).intern(), 9850);
        f339 = (f338 + 29) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m465() {
        f338 = (f339 + 41) % 128;
        int iOptInt = m501().optInt(m456((ViewConfiguration.getScrollBarSize() >> 8) - 299405563, (char) (3125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "Հ❯㗮稌", "쭅倯\udbf1", "䲭瑆沩ğ").intern(), this.f344);
        f338 = (f339 + 65) % 128;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m466() {
        f338 = (f339 + 75) % 128;
        int iOptInt = m501().optInt(m456(2132691028 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (56076 - View.MeasureSpec.makeMeasureSpec(0, 0)), "呖Ṉ౿맛", "뀺촐ᇝ", "䲭瑆沩ğ").intern(), 40);
        int i2 = f339 + 15;
        f338 = i2 % 128;
        if (i2 % 2 != 0) {
            return iOptInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m455(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f342.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m456(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f340) ^ ((long) f343)) ^ ((long) f341));
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
