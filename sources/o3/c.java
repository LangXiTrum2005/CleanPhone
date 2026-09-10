package o3;

import android.graphics.Color;
import d5.u;
import go.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f47087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f47088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f47089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f47093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f47094j;

    public c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f47085a = str;
        this.f47086b = i10;
        this.f47087c = num;
        this.f47088d = num2;
        this.f47089e = f10;
        this.f47090f = z10;
        this.f47091g = z11;
        this.f47092h = z12;
        this.f47093i = z13;
        this.f47094j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        u.q("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            l1.a.t("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            k.i(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(com.bumptech.glide.c.c(((j10 >> 24) & 255) ^ 255), com.bumptech.glide.c.c(j10 & 255), com.bumptech.glide.c.c((j10 >> 8) & 255), com.bumptech.glide.c.c((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            l1.a.t("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
