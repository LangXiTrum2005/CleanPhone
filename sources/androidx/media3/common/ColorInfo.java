package androidx.media3.common;

import android.support.v4.media.a;
import androidx.media3.common.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ColorInfo f5382h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5385c;
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5386e;
    public final int f;
    public int g;

    public static final class Builder {
        public byte[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5387a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5388b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5389c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5390e = -1;
        public int f = -1;

        public final ColorInfo a() {
            return new ColorInfo(this.f5387a, this.f5388b, this.f5389c, this.f5390e, this.f, this.d);
        }
    }

    static {
        Builder builder = new Builder();
        builder.f5387a = 1;
        builder.f5388b = 2;
        builder.f5389c = 3;
        f5382h = builder.a();
        Builder builder2 = new Builder();
        builder2.f5387a = 1;
        builder2.f5388b = 1;
        builder2.f5389c = 2;
        builder2.a();
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
        Util.E(5);
    }

    public ColorInfo(int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f5383a = i2;
        this.f5384b = i3;
        this.f5385c = i4;
        this.d = bArr;
        this.f5386e = i5;
        this.f = i6;
    }

    public static String a(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 != 1) {
            return i2 != 2 ? a.h(i2, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 != 1) {
            return i2 != 2 ? a.h(i2, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 != 6) {
            return i2 != 7 ? a.h(i2, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i2 = colorInfo.f5383a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.f5384b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = colorInfo.f5385c;
        if ((i4 != -1 && i4 != 3) || colorInfo.d != null) {
            return false;
        }
        int i5 = colorInfo.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = colorInfo.f5386e;
        return i6 == -1 || i6 == 8;
    }

    public static int f(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f5383a == -1 || this.f5384b == -1 || this.f5385c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f5383a == colorInfo.f5383a && this.f5384b == colorInfo.f5384b && this.f5385c == colorInfo.f5385c && Arrays.equals(this.d, colorInfo.d) && this.f5386e == colorInfo.f5386e && this.f == colorInfo.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f5383a) * 31) + this.f5384b) * 31) + this.f5385c) * 31)) * 31) + this.f5386e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f5383a));
        sb.append(", ");
        sb.append(a(this.f5384b));
        sb.append(", ");
        sb.append(c(this.f5385c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i2 = this.f5386e;
        sb.append(i2 != -1 ? androidx.datastore.preferences.protobuf.a.f(i2, "bit Luma") : "NA");
        sb.append(", ");
        int i3 = this.f;
        return a.r(sb, i3 != -1 ? androidx.datastore.preferences.protobuf.a.f(i3, "bit Chroma") : "NA", ")");
    }
}
