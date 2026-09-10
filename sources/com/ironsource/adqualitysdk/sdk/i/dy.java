package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dy {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1855 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1856 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1857 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1858 = {'a', 'n', 'd', 'r', 'o', 'i', '-', '.', 's', 'l', ' ', 't', ',', '\n', '[', ']'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f1859;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f1860;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<dw> f1861 = new ArrayList();

    public dy(String str, String str2) {
        this.f1860 = str;
        this.f1859 = str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2105(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f1858;
                char c4 = f1857;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2105(4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "##\u0003\b#", (byte) (3 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern());
        sb2.append(this.f1861.toString().replace(m2105((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3, "\u000e\b", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 15)).intern(), m2105(6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u000e\t\b\u0002\b\u000b", (byte) (17 - KeyEvent.getDeadChar(0, 0))).intern()).replace(m2105((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, "o", (byte) (20 - Color.alpha(0))).intern(), "").replace(m2105(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "¦", (byte) (73 - Drawable.resolveOpacity(0, 0))).intern(), ""));
        String string = sb2.toString();
        int i10 = f1856 + InterfaceC0435l1.d.b.f29107d;
        f1855 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2106(dw dwVar) {
        int i10 = f1855 + InterfaceC0435l1.d.b.f29109f;
        f1856 = i10 % 128;
        int i11 = i10 % 2;
        this.f1861.add(dwVar);
        if (i11 != 0) {
            int i12 = 55 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2107() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2105((ViewConfiguration.getTouchSlop() >> 8) + 8, "\u0001\u0002\u0003\u0000\u0005\u0006\u0006\n", (byte) (ExpandableListView.getPackedPositionChild(0L) + 92)).intern());
        sb2.append(this.f1860.toLowerCase());
        sb2.append(m2105(1 - TextUtils.getOffsetBefore("", 0), "¨", (byte) (123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern());
        sb2.append(this.f1859);
        String strM = f2.m(sb2, m2105(View.MeasureSpec.makeMeasureSpec(0, 0) + 4, "\u0004\u000b\u0001\u000b", (byte) (105 - (ViewConfiguration.getEdgeSlop() >> 16))));
        int i10 = f1856 + 63;
        f1855 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 44 / 0;
        }
        return strM;
    }
}
