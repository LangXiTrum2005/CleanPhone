package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class it implements Runnable {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2481 = {54883, 57639, 47296, 29600, 2841, 49864, 40329, 21884, 27849, 10171, 65378, 46803, 16771, 6520, 'E', 14112, 28374, 42393, 56634, 5306, 19333, 33616, 47792, 61825, 10584, 24807, 38827, 53081, 1628, 'C', 14142, 28357, 42373, 56635, 5298, 48168, 'D', 14135, 28368, 42391, 56609, 5366, 19359, 33540};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2482 = 5018789748691646290L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2483 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2484 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2445(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2481[i3 + i4]) ^ (((long) i4) * f2482)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = f2484 + 37;
        f2483 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                mo276();
            } else {
                mo276();
                throw null;
            }
        } catch (Throwable th) {
            try {
                mo642(th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public void mo642(Throwable th) {
        String strIntern = m2445(14 - (ViewConfiguration.getTapTimeout() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 54839)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(m2445(15 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, (char) (ViewConfiguration.getTouchSlop() >> 8)).intern());
        sb.append(getClass().getName());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2445(6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.red(0)).intern());
        sb2.append(getClass().getName());
        sb2.append(m2445((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 35 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48130)).intern());
        kb.m2748(strIntern, string, sb2.toString(), th);
        String strIntern2 = m2445(View.combineMeasuredStates(0, 0) + 14, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54839)).intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2445(TextUtils.indexOf((CharSequence) "", '0') + 16, 14 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern());
        sb3.append(getClass().getName());
        n.m2835(strIntern2, sb3.toString());
        n.m2832(m2445(Color.blue(0) + 14, (-1) - Process.getGidForName(""), (char) (54839 - Color.alpha(0))).intern(), m2445(7 - ExpandableListView.getPackedPositionChild(0L), View.resolveSizeAndState(0, 0, 0) + 36, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), th);
        int i2 = f2483 + 69;
        f2484 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract void mo276() throws Exception;
}
