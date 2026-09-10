package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class er extends ep {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1989 = 140;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1990 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1991 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f1992;

    public er(ef efVar, ef efVar2, ef efVar3) {
        super(efVar, efVar2);
        this.f1992 = efVar3;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2190(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f1989);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ef m2191() {
        int i10 = (f1990 + 91) % 128;
        f1991 = i10;
        ef efVar = this.f1992;
        f1990 = (i10 + 23) % 128;
        return efVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final boolean equals(Object obj) {
        f1990 = (f1991 + 93) % 128;
        if (this == obj) {
            return true;
        }
        if (obj != null && er.class == obj.getClass()) {
            if (!super.equals(obj)) {
                f1990 = (f1991 + 115) % 128;
                return false;
            }
            er erVar = (er) obj;
            ef efVar = this.f1992;
            if (efVar != null) {
                f1990 = (f1991 + 33) % 128;
                return efVar.equals(erVar.f1992);
            }
            if (erVar.f1992 == null) {
                int i10 = f1990 + 35;
                f1991 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 44 / 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode() * 31;
        ef efVar = this.f1992;
        if (efVar != null) {
            int i10 = f1990 + 119;
            f1991 = i10 % 128;
            if (i10 % 2 == 0) {
                efVar.hashCode();
                throw null;
            }
            iHashCode = efVar.hashCode();
            f1991 = (f1990 + 123) % 128;
        } else {
            iHashCode = 0;
        }
        return iHashCode2 + iHashCode;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(m2190(2 - MotionEvent.axisFromString(""), false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 180, "\u0014\ufff7\ufff7", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3).intern());
        sb2.append(m2191().toString());
        String string = sb2.toString();
        int i10 = f1991 + 5;
        f1990 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ea eaVarM2165 = m2186().m2165(eeVar, clVar);
        ea eaVarM2166 = m2191().m2165(eeVar, clVar);
        try {
            Object objM2124 = m2187().m2165(eeVar, clVar).m2124();
            if (objM2124 instanceof JSONObject) {
                ((JSONObject) objM2124).put((String) eaVarM2165.m2124(), eaVarM2166.m2124());
                return eaVarM2166;
            }
            if (objM2124 instanceof JSONArray) {
                ((JSONArray) objM2124).put(eaVarM2165.m2121().intValue(), eaVarM2166.m2124());
                return eaVarM2166;
            }
            if (objM2124 instanceof Map) {
                ((Map) objM2124).put(eaVarM2165.m2124(), eaVarM2166.m2124());
                f1991 = (f1990 + 1) % 128;
                return eaVarM2166;
            }
            if (objM2124 instanceof List) {
                int i10 = f1991 + 99;
                f1990 = i10 % 128;
                if (i10 % 2 == 0) {
                    ((List) objM2124).set(eaVarM2165.m2121().intValue(), eaVarM2166.m2124());
                    return eaVarM2166;
                }
                ((List) objM2124).set(eaVarM2165.m2121().intValue(), eaVarM2166.m2124());
                throw null;
            }
            if (objM2124.getClass().isArray()) {
                ((Object[]) objM2124)[eaVarM2165.m2121().intValue()] = eaVarM2166.m2124();
                return eaVarM2166;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2190((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42, true, Color.blue(0) + 238, "\u0003\u0010\u000e\u0016\u0003ﾾ\u0012\u0013\u000eﾾ\u0012\u000e\u0007\u0010\u0001\u0011\u0000\u0013\u0011ﾾ\u0005\f\u0007\u0012\uffff\u0013\n\uffff\u0014\u0003ﾾ\u0010\r\u0010\u0010￣ￅﾾ\f\r\u0007\u0011\u0011", 36 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(this);
            sb2.append(m2190((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 45, false, AndroidCharacter.getMirror('0') + 182, "ￆ\u001b\u0014\u0019\u001b\u0016\u0016\u0015\u0018\u001a\u000b\nￆ\u0015\b\u0010\u000b\t\u001aￆￍ￠ￆ\u001a\u0018\u001f\u000f\u0014\rￆ\u001a\u0015ￆ\u001b\u0019\u000bￆ\u0001\u0003ￆ\u0015\u0014ￆ\u0007\u0014", ExpandableListView.getPackedPositionGroup(0L) + 20).intern());
            sb2.append(objM2124);
            new dr(clVar, eeVar, sb2.toString()).m2034(clVar.m1643());
            return eaVarM2166;
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2190(43 - ExpandableListView.getPackedPositionType(0L), true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 237, "\u0003\u0010\u000e\u0016\u0003ﾾ\u0012\u0013\u000eﾾ\u0012\u000e\u0007\u0010\u0001\u0011\u0000\u0013\u0011ﾾ\u0005\f\u0007\u0012\uffff\u0013\n\uffff\u0014\u0003ﾾ\u0010\r\u0010\u0010￣ￅﾾ\f\r\u0007\u0011\u0011", 35 - TextUtils.lastIndexOf("", '0', 0)).intern());
            sb3.append(this);
            new dr(clVar, eeVar, f2.m(sb3, m2190((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 179 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), e10).m2034(clVar.m1643());
            return eaVarM2166;
        }
    }
}
