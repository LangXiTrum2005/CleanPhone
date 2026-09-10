package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class hx<T> extends cz implements ck, ht<T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2315 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f2316 = {-1756802235, -1064028084, -750845654, -88022561, -986125088, -1378334124, 2030642054, -70982709, 1155652130, -1155944456, 322288988, -1509271477, -776707607, -514941796, -609881498, -1611498786, 870276461, 2009668450};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2317 = 10;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2318 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Collection f2319;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Object f2320;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ht f2321;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map f2322;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Field f2323;

    public hx(Field field, Object obj, ht htVar) {
        this.f2323 = field;
        this.f2320 = obj;
        this.f2321 = htVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Object m2319() {
        int i2 = (f2318 + 41) % 128;
        f2315 = i2;
        Object obj = this.f2320;
        int i3 = i2 + 79;
        f2318 = i3 % 128;
        if (i3 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private ht m2320() {
        int i2 = f2318 + 57;
        f2315 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2321;
        }
        int i3 = 95 / 0;
        return this.f2321;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Map m2321() {
        int i2 = f2315 + 109;
        f2318 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2322;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Collection m2322() {
        int i2 = f2315;
        Collection collection = this.f2319;
        f2318 = (i2 + 99) % 128;
        return collection;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m2324() {
        int i2 = f2318;
        int i3 = i2 + 79;
        f2315 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.f2319 != null) {
            return true;
        }
        int i4 = i2 + 41;
        f2315 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2325() {
        int i2 = f2318;
        int i3 = (i2 + 53) % 128;
        f2315 = i3;
        if (this.f2323 != null) {
            f2315 = (i2 + 59) % 128;
            return true;
        }
        f2318 = (i3 + 23) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2326(T t) {
        f2315 = (f2318 + 55) % 128;
        if (m2325()) {
            f2315 = (f2318 + 79) % 128;
            try {
                this.f2323.set(this.f2320, t);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2328() {
        if (this.f2322 != null) {
            f2315 = (f2318 + 27) % 128;
            return true;
        }
        f2315 = (f2318 + 81) % 128;
        return false;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ht
    /* JADX INFO: renamed from: ｋ */
    public final T mo2260() {
        int i2 = f2315 + 105;
        f2318 = i2 % 128;
        if (i2 % 2 == 0) {
            m2325();
            throw null;
        }
        if (m2325()) {
            try {
                return (T) this.f2323.get(this.f2320);
            } catch (Exception unused) {
            }
        } else if (m2324() || m2328()) {
            T t = (T) this.f2320;
            f2318 = (f2315 + 67) % 128;
            return t;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2323(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2317);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2327(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2316.clone();
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

    public hx(Collection collection, Object obj, ht htVar) {
        this.f2319 = collection;
        this.f2320 = obj;
        this.f2321 = htVar;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ht
    /* JADX INFO: renamed from: ﾇ */
    public final Field mo2261() {
        int i2 = f2315 + 67;
        int i3 = i2 % 128;
        f2318 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Field field = this.f2323;
        int i4 = i3 + 119;
        f2315 = i4 % 128;
        if (i4 % 2 == 0) {
            return field;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        byte b2 = 6;
        f2318 = (f2315 + 13) % 128;
        switch (str.hashCode()) {
            case -2039060844:
                if (!str.equals(m2327(new int[]{-1856470131, 1665334258, -1789766053, 588603745, -1518782159, -1617830766, 1100275572, 1847435675}, ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -1661939189:
                if (!str.equals(m2327(new int[]{-848309434, 319469, -1229980542, -973606584, -1146867756, 1511320323}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1249356250:
                if (!str.equals(m2327(new int[]{-755406165, -89422357, -742401634, 1965219871}, TextUtils.lastIndexOf("", '0') + 7).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 100472786:
                if (!str.equals(m2323((ViewConfiguration.getJumpTapTimeout() >> 16) + 2, 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 111, "\u000e\u0004\u000b￼￨", true).intern())) {
                    b2 = -1;
                }
                break;
            case 429960040:
                if (!str.equals(m2323(-MotionEvent.axisFromString(""), Gravity.getAbsoluteGravity(0, 0) + 12, 114 - TextUtils.getCapsMode("", 0, 0), "\u0001\u0006\u0007\u0001\f\ufffb�\u0004\u0004\u0007ￛ\u000b", true).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 700591008:
                if (str.equals(m2323((ViewConfiguration.getWindowTouchSlop() >> 8) + 7, View.resolveSize(0, 0) + 9, 114 - Color.red(0), "\f￨\ufff9\n�\u0006\f\uffff�", false).intern())) {
                    int i2 = f2315 + 47;
                    f2318 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 8 : (byte) 119;
                } else {
                    b2 = -1;
                }
                break;
            case 1406685743:
                if (!str.equals(m2327(new int[]{111853097, -1302632757, -288024374, 595061977}, TextUtils.lastIndexOf("", '0', 0, 0) + 9).intern())) {
                    b2 = -1;
                } else {
                    f2318 = (f2315 + 73) % 128;
                    b2 = 1;
                }
                break;
            case 1953253188:
                if (!str.equals(m2323(TextUtils.getOffsetBefore("", 0) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 110, "\u0000\u0003\u0001\u0010￢\u0005\u0001\b", false).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f2315 + 87;
                    f2318 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b2 = 3;
                    } else {
                        b2 = 2;
                    }
                }
                break;
            case 1967798203:
                if (!str.equals(m2323((ViewConfiguration.getWindowTouchSlop() >> 8) + 3, TextUtils.indexOf("", "", 0, 0) + 8, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 113, "\r\ufffe\u0000\ufffe\u000e\u0005\ufffa\uffef", true).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 2058833392:
                if (!str.equals(m2327(new int[]{-9129617, 487998792, -115228640, -1091819963}, 6 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return mo2260();
            case 1:
                m2326(cz.m1785(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m2325());
            case 3:
                return mo2261();
            case 4:
                return Boolean.valueOf(m2324());
            case 5:
                return m2322();
            case 6:
                return Boolean.valueOf(m2328());
            case 7:
                return m2321();
            case 8:
                return m2320();
            case 9:
                return m2319();
            default:
                return null;
        }
    }

    public hx(Map map, Object obj, ht htVar) {
        this.f2322 = map;
        this.f2320 = obj;
        this.f2321 = htVar;
    }
}
