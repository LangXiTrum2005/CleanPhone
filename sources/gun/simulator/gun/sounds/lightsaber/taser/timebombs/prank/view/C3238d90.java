package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3238d90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4261a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public C3238d90(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f4261a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    AbstractC4038mJ.f();
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC4038mJ.g("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            FW.h(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC2995aW.r(((j >> 24) & 255) ^ 255), AbstractC2995aW.r(j & 255), AbstractC2995aW.r((j >> 8) & 255), AbstractC2995aW.r((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC4038mJ.g("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
