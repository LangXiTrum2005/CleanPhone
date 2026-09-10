package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ed extends eb {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1864 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1865 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1866 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1867 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1868 = -1891578488;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ee[] f1869;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ee f1870;

    public ed(ee eeVar, String str, List<ee> list, List<ee> list2, dm dmVar) {
        super(str, list2, dmVar);
        this.f1870 = eeVar;
        if (list != null) {
            ee[] eeVarArr = new ee[list.size()];
            this.f1869 = eeVarArr;
            list.toArray(eeVarArr);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2081() {
        if (this.f1869 == null) {
            f1864 = (f1865 + 49) % 128;
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m2082(View.MeasureSpec.getMode(0) - 112945020, (char) (22203 - AndroidCharacter.getMirror('0')), "萟䒘诹\ue056", "ⴉ", "\u0000\u0000\u0000\u0000").intern());
        sb.append(ee.m2084(this.f1869));
        String strC = a.C(sb, m2082((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 682783218, (char) (20749 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "ྏ䶎\u0cd7ꙑ", "ਞ", "\u0000\u0000\u0000\u0000"));
        f1865 = (f1864 + 31) % 128;
        return strC;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2082(int i2, char c2, String str, String str2, String str3) {
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
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1867) ^ ((long) f1868)) ^ ((long) f1866));
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.eb
    public final boolean equals(Object obj) {
        if (this == obj) {
            f1865 = (f1864 + 77) % 128;
            return true;
        }
        if (obj == null || ed.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ed edVar = (ed) obj;
        ee eeVar = this.f1870;
        if (eeVar == null ? edVar.f1870 != null : !eeVar.equals(edVar.f1870)) {
            return false;
        }
        ee[] eeVarArr = this.f1869;
        if (eeVarArr == null) {
            return edVar.f1869 == null;
        }
        int i2 = f1865 + 17;
        f1864 = i2 % 128;
        int i3 = i2 % 2;
        ee[] eeVarArr2 = edVar.f1869;
        if (i3 == 0) {
            return eeVarArr.equals(eeVarArr2);
        }
        int i4 = 26 / 0;
        return eeVarArr.equals(eeVarArr2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r0
  0x003c: PHI (r0v12 int) = (r0v4 int), (r0v14 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r0
  0x0022: PHI (r0v5 int) = (r0v4 int), (r0v14 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.eb
    public final int hashCode() {
        int iHashCode;
        int i2;
        int iHashCode2;
        int i3 = f1864 + 55;
        f1865 = i3 % 128;
        if (i3 % 2 == 0) {
            iHashCode = super.hashCode() - 46;
            if (this.f1870 != null) {
                i2 = f1865 + 125;
                f1864 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f1870.hashCode();
                    throw null;
                }
                iHashCode2 = this.f1870.hashCode();
            } else {
                iHashCode2 = 0;
            }
        } else {
            iHashCode = super.hashCode() * 31;
            if (this.f1870 != null) {
                i2 = f1865 + 125;
                f1864 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f1870.hashCode();
                    throw null;
                }
                iHashCode2 = this.f1870.hashCode();
            } else {
                iHashCode2 = 0;
            }
        }
        int i4 = (iHashCode + iHashCode2) * 31;
        ee[] eeVarArr = this.f1869;
        return i4 + (eeVarArr != null ? eeVarArr.hashCode() : 0);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.eb
    public final String toString() {
        f1865 = (f1864 + 31) % 128;
        String strMo2078 = mo2078(m2076());
        f1865 = (f1864 + 71) % 128;
        return strMo2078;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.eb, com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        Method methodM2726;
        List<Object> listM2075 = m2075(drVar, cpVar);
        ee eeVar = this.f1870;
        if ((eeVar instanceof el) && ((el) eeVar).m2103().equals(m2082(View.resolveSize(0, 0) + 579516372, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53322), "퐆誷䨢\ue3d0", "⻚틂慻\u17df垷", "\u0000\u0000\u0000\u0000").intern())) {
            return cpVar.m1626().m2252().m2253(m2077()).m2037(drVar, cpVar, listM2075).m2045(false);
        }
        Object objM2043 = this.f1870.m2086(drVar, cpVar).m2043();
        if (objM2043 instanceof ck) {
            return new du(((ck) objM2043).mo792(m2077(), listM2075, cpVar.m1615()));
        }
        if (objM2043 instanceof cl) {
            String strM2077 = m2077();
            cpVar.m1615();
            return new du(((cl) objM2043).mo1524(cpVar, strM2077, listM2075, drVar));
        }
        if (objM2043 instanceof cp) {
            synchronized (objM2043) {
                try {
                    cp cpVar2 = (cp) objM2043;
                    dt dtVarM1623 = cpVar2.m1623(m2077());
                    if (dtVarM1623 != null) {
                        return dtVarM1623.m2037(cpVar2.m1614(), cpVar2, listM2075).m2045(false);
                    }
                    String strM1616 = cpVar.m1616();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2082(Color.blue(0) + 270451464, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
                    sb.append(m2077());
                    cq.m1676(strM1616, sb.toString(), new NoSuchMethodException());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            ee[] eeVarArr = this.f1869;
            if (eeVarArr != null) {
                methodM2726 = jz.m2722(objM2043, m2077(), m2080(eeVarArr, drVar, cpVar));
            } else {
                methodM2726 = jz.m2726(objM2043, m2077(), listM2075);
            }
            if (methodM2726 != null) {
                return new du(methodM2726.invoke(objM2043, listM2075.toArray()));
            }
            listM2075.add(0, objM2043);
            de deVarM1613 = cpVar.m1613();
            String strM2078 = m2077();
            cpVar.m1615();
            return new du(deVarM1613.mo1524(cpVar, strM2078, listM2075, drVar));
        } catch (IllegalAccessException e2) {
            String strM1617 = cpVar.m1616();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2082(270451464 - TextUtils.getOffsetBefore("", 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
            sb2.append(this);
            cq.m1676(strM1617, sb2.toString(), e2);
            return null;
        } catch (IllegalArgumentException e3) {
            String strM1618 = cpVar.m1616();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2082(270451464 - TextUtils.getTrimmedLength(""), (char) KeyEvent.getDeadChar(0, 0), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
            sb3.append(this);
            cq.m1676(strM1618, sb3.toString(), e3);
            return null;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<Class> m2080(ee[] eeVarArr, dr drVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        int length = eeVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            f1864 = (f1865 + 41) % 128;
            arrayList.add((Class) eeVarArr[i2].m2086(drVar, cpVar).m2043());
            i2++;
            f1864 = (f1865 + 111) % 128;
        }
        int i3 = f1864 + 29;
        f1865 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return arrayList;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.eb
    /* JADX INFO: renamed from: ｋ */
    public final String mo2078(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1870);
        sb.append(m2082(ImageFormat.getBitsPerPixel(0) + 464346693, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36009), "䒙굞ꤛ첌", "敳", "\u0000\u0000\u0000\u0000").intern());
        sb.append(m2077());
        sb.append(m2081());
        sb.append(m2082(Color.blue(0) - 957114864, (char) (48544 - ExpandableListView.getPackedPositionType(0L)), "ဧ\uf396ꃆ溽", "䗴", "\u0000\u0000\u0000\u0000").intern());
        sb.append(ee.m2084(objArr));
        String strC = a.C(sb, m2082((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 360654155, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 62094), "䬶缥踕磲", "\uf1b2", "\u0000\u0000\u0000\u0000"));
        int i2 = f1864 + 103;
        f1865 = i2 % 128;
        if (i2 % 2 != 0) {
            return strC;
        }
        throw null;
    }
}
