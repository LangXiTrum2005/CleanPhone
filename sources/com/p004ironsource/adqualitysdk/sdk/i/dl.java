package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1705 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f1706 = 4877835772717127964L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1707;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1708;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1709;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1710;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1711;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1712;

    public dl(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1708 = jSONObject.optString(m1943("奫精ᾛ댵풠框跜", 41843 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            this.f1711 = jSONObject.optString(m1943("奿竔ḿ㎄ퟯ\ueb31", (ViewConfiguration.getLongPressTimeout() >> 16) + 9127).intern());
            this.f1712 = jSONObject.optString(m1943("她粓ኆ⢋캡", 9719 - Color.red(0)).intern());
            this.f1709 = jSONObject.optString(m1943("奫ხ쩐薯缩㚊\ue0e1", 18839 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            this.f1710 = jSONObject.optBoolean(m1943("奩ᤲ\ud9c3顎堐ᢹ\udb40鯶宾ᨪ", 16477 - TextUtils.getTrimmedLength("")).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1944() {
        String str;
        int i2 = f1705 + 5;
        int i3 = i2 % 128;
        f1707 = i3;
        if (i2 % 2 != 0) {
            str = this.f1708;
            int i4 = 43 / 0;
        } else {
            str = this.f1708;
        }
        f1705 = (i3 + 67) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1945() {
        String str;
        int i2 = f1705 + 43;
        int i3 = i2 % 128;
        f1707 = i3;
        if (i2 % 2 != 0) {
            str = this.f1712;
            int i4 = 7 / 0;
        } else {
            str = this.f1712;
        }
        f1705 = (i3 + 41) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1946() {
        int i2 = f1705 + 71;
        f1707 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1711;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m1947() {
        int i2 = f1707 + 71;
        int i3 = i2 % 128;
        f1705 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f1710;
        int i4 = i3 + 77;
        f1707 = i4 % 128;
        if (i4 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1948() {
        int i2 = f1707 + 1;
        f1705 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1709;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1943(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1706);
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
