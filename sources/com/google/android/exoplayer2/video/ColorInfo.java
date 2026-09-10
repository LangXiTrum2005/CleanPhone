package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorInfo implements Bundleable {
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final f k0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f18991Y;
    public final int Z;
    public final byte[] e0;
    public int f0;

    static {
        int i2 = Util.f18979a;
        g0 = Integer.toString(0, 36);
        h0 = Integer.toString(1, 36);
        i0 = Integer.toString(2, 36);
        j0 = Integer.toString(3, 36);
        k0 = new f(26);
    }

    public ColorInfo(int i2, int i3, int i4, byte[] bArr) {
        this.X = i2;
        this.f18991Y = i3;
        this.Z = i4;
        this.e0 = bArr;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.X == colorInfo.X && this.f18991Y == colorInfo.f18991Y && this.Z == colorInfo.Z && Arrays.equals(this.e0, colorInfo.e0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f0 == 0) {
            this.f0 = Arrays.hashCode(this.e0) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.X) * 31) + this.f18991Y) * 31) + this.Z) * 31);
        }
        return this.f0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.f18991Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(", ");
        return android.support.v4.media.a.t(sb, this.e0 != null, ")");
    }
}
