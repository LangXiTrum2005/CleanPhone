package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class SsaStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f18574c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18575e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18577i;
    public final int j;

    public static final class Format {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18580c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18581e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f18582h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f18583i;
        public final int j;
        public final int k;

        public Format(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f18578a = i2;
            this.f18579b = i3;
            this.f18580c = i4;
            this.d = i5;
            this.f18581e = i6;
            this.f = i7;
            this.g = i8;
            this.f18582h = i9;
            this.f18583i = i10;
            this.j = i11;
            this.k = i12;
        }
    }

    public static final class Overrides {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f18584a = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f18585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f18586c;
        public static final Pattern d;

        static {
            int i2 = Util.f18979a;
            Locale locale = Locale.US;
            f18585b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f18586c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            d = Pattern.compile("\\\\an(\\d+)");
        }

        public static PointF a(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f18585b.matcher(str);
            Matcher matcher2 = f18586c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f, Float.parseFloat(strGroup2.trim()));
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    public SsaStyle(String str, int i2, Integer num, Integer num2, float f, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        this.f18572a = str;
        this.f18573b = i2;
        this.f18574c = num;
        this.d = num2;
        this.f18575e = f;
        this.f = z2;
        this.g = z3;
        this.f18576h = z4;
        this.f18577i = z5;
        this.j = i3;
    }

    public static int a(String str) {
        boolean z2;
        try {
            int i2 = Integer.parseInt(str.trim());
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
            if (z2) {
                return i2;
            }
        } catch (NumberFormatException unused) {
        }
        Z.v("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i2 = Integer.parseInt(str);
            return i2 == 1 || i2 == -1;
        } catch (NumberFormatException e2) {
            Log.h("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.b(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.b(((j >> 24) & 255) ^ 255), Ints.b(j & 255), Ints.b((j >> 8) & 255), Ints.b((j >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            Log.h("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }
}
