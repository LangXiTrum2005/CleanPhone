package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dm {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1764 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1765 = {28000, 58323, 28696, 49483, 55504, 22123, 50585, 29938, 57913, 4450, 'p', 36575, 7438, 44123, 14997, 51653, 'a', 36573, 7432, 44115, 14990, 51679, 22528, 59227, 30101, 1245, 'v', 36567, 7449, 44109, 15038, 51679, 22552, 59206, 30101, 1244, 'w', 36571, 7454, 44140, 14993, 51667, 22531, 59201, 30135, 1227, 37656, 8798, 45197, 16340};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1766 = 2153064368548843198L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1767 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1768;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1769;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f1770;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f1771;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityAdType f1772;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1773;

    public dm(JSONObject jSONObject) {
        this.f1772 = ISAdQualityAdType.UNKNOWN;
        this.f1773 = eb.m2127(jSONObject.optString(m2025((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27925), AndroidCharacter.getMirror('0') - '0', 4 - ExpandableListView.getPackedPositionType(0L)).intern()));
        String strM2127 = eb.m2127(jSONObject.optString(m2025((char) (55473 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, 6 - KeyEvent.getDeadChar(0, 0)).intern()));
        if (!TextUtils.isEmpty(strM2127)) {
            this.f1772 = ISAdQualityAdType.fromInt(Integer.parseInt(strM2127));
        }
        this.f1771 = jSONObject.optJSONObject(m2025((char) (Process.myTid() >> 22), 10 - Color.argb(0, 0, 0, 0), 6 - (Process.myPid() >> 22)).intern());
        this.f1770 = kj.m2863(jSONObject, m2025((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), 10 - View.resolveSizeAndState(0, 0, 0)).intern(), new ArrayList());
        this.f1769 = eb.m2127(jSONObject.optString(m2025((char) TextUtils.indexOf("", "", 0), 26 - Drawable.resolveOpacity(0, 0), 10 - View.resolveSize(0, 0)).intern()));
        this.f1768 = eb.m2127(jSONObject.optString(m2025((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 36 - (ViewConfiguration.getJumpTapTimeout() >> 16), 14 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()));
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m2026() {
        int i10 = f1767;
        int i11 = i10 + 53;
        f1764 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1768;
        int i12 = i10 + 91;
        f1764 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 85 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ISAdQualityAdType m2027() {
        int i10 = f1764;
        ISAdQualityAdType iSAdQualityAdType = this.f1772;
        int i11 = i10 + 73;
        f1767 = i11 % 128;
        if (i11 % 2 != 0) {
            return iSAdQualityAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m2028() {
        int i10 = f1764 + 27;
        int i11 = i10 % 128;
        f1767 = i11;
        int i12 = i10 % 2;
        JSONObject jSONObject = this.f1771;
        if (i12 == 0) {
            int i13 = 0 / 0;
        }
        f1764 = (i11 + 37) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2029() {
        int i10 = f1764;
        String str = this.f1769;
        int i11 = i10 + 23;
        f1767 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2030() {
        int i10 = f1764;
        String str = this.f1773;
        int i11 = i10 + 89;
        f1767 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m2031() {
        int i10 = f1767;
        List<String> list = this.f1770;
        int i11 = i10 + 7;
        f1764 = i11 % 128;
        if (i11 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2025(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1765[i10 + i12]) ^ (((long) i12) * f1766)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
