package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f18973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f18976i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18969b = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18970c = C.TIME_UNSET;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18968a = new int[4];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18977j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18978k = -1;

    public static int a(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(gp0 gp0Var, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z10 ? 1 : 0;
        int iWidth = rect.width();
        int i13 = i12 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int iH = 0;
                while (true) {
                    if (iH >= i15 || i15 > 64) {
                        i10 = iH & 3;
                        if (iH >= 4) {
                            i11 = iH >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (gp0Var.b() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        iH = (iH << 4) | gp0Var.h(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i16 = i13 + iMin;
                    Arrays.fill(iArr, i13, i16, this.f18968a[i10]);
                    i14 += iMin;
                    i13 = i16;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            gp0Var.k();
        }
    }
}
