package androidx.core.util;

import com.smartdigimkt.o1.b;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class TimeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4414a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f4415b = new char[24];

    public static void a(long j, PrintWriter printWriter) {
        synchronized (f4414a) {
            printWriter.print(new String(f4415b, 0, b(j)));
        }
    }

    public static int b(long j) {
        char c2;
        int i2;
        int i3;
        int i4;
        if (f4415b.length < 0) {
            f4415b = new char[0];
        }
        char[] cArr = f4415b;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c2 = '+';
        } else {
            j = -j;
            c2 = '-';
        }
        int i5 = (int) (j % 1000);
        int iFloor = (int) Math.floor(j / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / 86400;
            iFloor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / b.l2;
            iFloor -= i3 * b.l2;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i6 = iFloor / 60;
            iFloor -= i6 * 60;
            i4 = i6;
        } else {
            i4 = 0;
        }
        cArr[0] = c2;
        int iC = c(cArr, i2, 'd', 1, false, 0);
        int iC2 = c(cArr, i3, 'h', iC, iC != 1, 0);
        int iC3 = c(cArr, i4, 'm', iC2, iC2 != 1, 0);
        int iC4 = c(cArr, i5, 'm', c(cArr, iFloor, 's', iC3, iC3 != 1, 0), true, 0);
        cArr[iC4] = 's';
        return iC4 + 1;
    }

    public static int c(char[] cArr, int i2, char c2, int i3, boolean z2, int i4) {
        int i5;
        if (!z2 && i2 <= 0) {
            return i3;
        }
        if ((!z2 || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z2 && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        cArr[i5 + 1] = c2;
        return i5 + 2;
    }
}
