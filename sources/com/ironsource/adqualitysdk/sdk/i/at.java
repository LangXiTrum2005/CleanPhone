package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class at extends ar.AnonymousClass5 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f400 = 167;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f401 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f402 = 1;

    public at(aw awVar) {
        m508(awVar);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m564() {
        f402 = (f401 + InterfaceC0435l1.d.b.f29114k) % 128;
        boolean zOptBoolean = m506().optBoolean(m563(Drawable.resolveOpacity(0, 0) + 4, false, (ViewConfiguration.getTapTimeout() >> 16) + 272, "\ufffa\ufffa\ufffe\u000e", 3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), true);
        int i10 = f402 + 1;
        f401 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 98 / 0;
        }
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m565() {
        int i10 = f401 + 21;
        f402 = i10 % 128;
        return m506().optBoolean((i10 % 2 == 0 ? m563(Color.rgb(0, 0, 0) * (-16777212), true, 4963 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), "\ufff6\ufffa\n\t", 1 << (ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1))) : m563((-16777212) - Color.rgb(0, 0, 0), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 275, "\ufff6\ufffa\n\t", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), true);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final int m566() {
        f401 = (f402 + 107) % 128;
        int iM671 = m505().m671();
        int i10 = f402 + 27;
        f401 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 85 / 0;
        }
        return iM671;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m567() {
        f402 = (f401 + 49) % 128;
        int iM674 = m505().m674();
        int i10 = f402 + 97;
        f401 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
        return iM674;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m568() {
        int i10 = f402 + InterfaceC0435l1.d.b.f29110g;
        f401 = i10 % 128;
        int i11 = i10 % 2;
        List<String> listM672 = m505().m672();
        if (i11 != 0) {
            int i12 = 5 / 0;
        }
        int i13 = f402 + 123;
        f401 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 1 / 0;
        }
        return listM672;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m569() {
        f401 = (f402 + 5) % 128;
        List<String> listM675 = m505().m675();
        f401 = (f402 + 95) % 128;
        return listM675;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m563(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f400);
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
}
