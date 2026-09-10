package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class eh extends ej {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1887 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1888 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1889 = -684344474;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f1890 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f1891 = {37, 79, -100, -93, -109, -99, -85, -112, -97, -107, -80, -30, 73, -84, -101, -28, 73, -95, -92, -108, -84, -115, -82, -118, -97, -16, 86, -106, -94, -110, -80, -119, -90, -88, -120, -82, -30, 75, -96, -102, -99, -54, 36, -55, 46, 27, 24, 37, 16, 108, -39, 28, 14, 31, 32, 28, 29, 24, 31, 34, 22, 114, -49, 28, 108, -32, 31, 88, -40, 15, 27, 114, -50, 24, 113, -42, 22, 34, 13, 36, 27, 113, 3};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1892 = 5;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1893 = -1158122413;

    public eh(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2094(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f1892;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f1891;
                    i6 = bArr != null ? (byte) (bArr[f1889 + i3] + i5) : (short) (f1890[f1889 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f1889 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f1893);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f1891;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f1890;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        du duVarM2086 = m2097().m2086(drVar, cpVar);
        try {
            Object objM2043 = m2098().m2086(drVar, cpVar).m2043();
            if (objM2043 instanceof JSONObject) {
                return new du(((JSONObject) objM2043).opt((String) duVarM2086.m2043()));
            }
            if (objM2043 instanceof JSONArray) {
                return new du(((JSONArray) objM2043).opt(duVarM2086.m2048().intValue()));
            }
            if (objM2043 instanceof Map) {
                return new du(((Map) objM2043).get(duVarM2086.m2043()));
            }
            if (objM2043 instanceof List) {
                return new du(((List) objM2043).get(duVarM2086.m2048().intValue()));
            }
            if (objM2043.getClass().isArray()) {
                du duVar = new du(((Object[]) objM2043)[duVarM2086.m2048().intValue()]);
                int i2 = f1888 + 123;
                f1887 = i2 % 128;
                if (i2 % 2 != 0) {
                    return duVar;
                }
                throw null;
            }
            String strM1616 = cpVar.m1616();
            StringBuilder sb = new StringBuilder();
            sb.append(m2094((byte) TextUtils.getOffsetBefore("", 0), (short) (99 - View.resolveSizeAndState(0, 0, 0)), (-6) - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + 684344474, 1158122482 - ExpandableListView.getPackedPositionGroup(0L)).intern());
            sb.append(this);
            sb.append(m2085());
            sb.append(m2094((byte) Color.red(0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 29), TextUtils.getCapsMode("", 0, 0) - 6, 684344516 - (ViewConfiguration.getTapTimeout() >> 16), 1158122471 - Color.green(0)).intern());
            sb.append(objM2043);
            cq.m1676(strM1616, sb.toString(), null);
            du duVar2 = new du(null);
            int i3 = f1887 + 81;
            f1888 = i3 % 128;
            if (i3 % 2 == 0) {
                return duVar2;
            }
            throw null;
        } catch (Exception e2) {
            String strM1617 = cpVar.m1616();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2094((byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (99 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-5) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 684344474, 1158122483 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
            sb2.append(this);
            sb2.append(m2085());
            cq.m1676(strM1617, sb2.toString(), e2);
        }
    }
}
