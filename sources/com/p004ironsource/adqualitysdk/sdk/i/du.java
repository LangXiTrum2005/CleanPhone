package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public final class du {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1804 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1805 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1806 = 3675794903966310633L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1807;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1808;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1809;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f1810;

    public du(Object obj) {
        this.f1810 = obj;
    }

    public final String toString() {
        f1804 = (f1805 + 73) % 128;
        if (!(this.f1810 instanceof String)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1810);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2039("惋", (Process.myPid() >> 22) + 55201).intern());
        sb2.append(this.f1810);
        String strC = a.C(sb2, m2039("惋", 55200 - ((byte) KeyEvent.getModifierMetaStateMask())));
        int i2 = f1805 + 109;
        f1804 = i2 % 128;
        if (i2 % 2 != 0) {
            return strC;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m2040() {
        int i2 = f1805;
        boolean z2 = this.f1809;
        f1804 = (i2 + 79) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final du m2041() {
        int i2 = f1805;
        int i3 = i2 + 29;
        f1804 = i3 % 128;
        int i4 = i3 % 2;
        this.f1808 = true;
        int i5 = i2 + 7;
        f1804 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m2042() {
        int i2 = (f1804 + 85) % 128;
        f1805 = i2;
        this.f1809 = true;
        int i3 = i2 + 111;
        f1804 = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m2043() {
        int i2 = f1805 + 89;
        f1804 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1810;
        }
        int i3 = 61 / 0;
        return this.f1810;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2044() {
        int i2 = (f1804 + 45) % 128;
        f1805 = i2;
        boolean z2 = this.f1808;
        f1804 = (i2 + 9) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2046() {
        int i2 = (f1804 + 35) % 128;
        f1805 = i2;
        boolean z2 = this.f1807;
        f1804 = (i2 + 97) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2047() {
        Object obj = this.f1810;
        if (obj == null) {
            int i2 = f1805 + 51;
            f1804 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return false;
            }
            f1804 = (f1805 + 79) % 128;
            return true;
        }
        if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return false;
            }
            int i3 = f1804 + 111;
            f1805 = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                return true;
            }
            f1805 = (f1804 + 11) % 128;
            return !TextUtils.isEmpty((String) obj);
        }
        int i4 = f1804 + 111;
        f1805 = i4 % 128;
        if (i4 % 2 == 0 ? ((Double) obj).doubleValue() == 0.0d : ((Double) obj).doubleValue() == 1.0d) {
            return false;
        }
        f1805 = (f1804 + 13) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Number m2048() {
        int i2 = f1805;
        int i3 = (i2 + 105) % 128;
        f1804 = i3;
        Object obj = this.f1810;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            f1805 = (i3 + 97) % 128;
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        int i4 = i2 + 67;
        f1804 = i4 % 128;
        if (i4 % 2 != 0) {
            return (Double) obj;
        }
        int i5 = 58 / 0;
        return (Double) obj;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final du m2045(boolean z2) {
        int i2 = (f1805 + 107) % 128;
        f1804 = i2;
        this.f1807 = z2;
        f1805 = (i2 + 119) % 128;
        return this;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2039(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1806);
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
