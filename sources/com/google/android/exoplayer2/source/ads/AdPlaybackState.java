package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.f;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPlaybackState implements Bundleable {
    public static final AdPlaybackState g0 = new AdPlaybackState(new AdGroup[0], 0, -9223372036854775807L, 0);
    public static final AdGroup h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final f m0;
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18426Y;
    public final long Z;
    public final int e0;
    public final AdGroup[] f0;

    public static final class AdGroup implements Bundleable {
        public static final String j0;
        public static final String k0;
        public static final String l0;
        public static final String m0;
        public static final String n0;
        public static final String o0;
        public static final String p0;
        public static final String q0;
        public static final f r0;
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f18427Y;
        public final int Z;
        public final Uri[] e0;
        public final int[] f0;
        public final long[] g0;
        public final long h0;
        public final boolean i0;

        static {
            int i2 = Util.f18979a;
            j0 = Integer.toString(0, 36);
            k0 = Integer.toString(1, 36);
            l0 = Integer.toString(2, 36);
            m0 = Integer.toString(3, 36);
            n0 = Integer.toString(4, 36);
            o0 = Integer.toString(5, 36);
            p0 = Integer.toString(6, 36);
            q0 = Integer.toString(7, 36);
            r0 = new f(23);
        }

        public AdGroup(long j, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z2) {
            Assertions.b(iArr.length == uriArr.length);
            this.X = j;
            this.f18427Y = i2;
            this.Z = i3;
            this.f0 = iArr;
            this.e0 = uriArr;
            this.g0 = jArr;
            this.h0 = j2;
            this.i0 = z2;
        }

        public final int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.f0;
                if (i4 >= iArr.length || this.i0 || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AdGroup.class == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.X == adGroup.X && this.f18427Y == adGroup.f18427Y && this.Z == adGroup.Z && Arrays.equals(this.e0, adGroup.e0) && Arrays.equals(this.f0, adGroup.f0) && Arrays.equals(this.g0, adGroup.g0) && this.h0 == adGroup.h0 && this.i0 == adGroup.i0) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i2 = ((this.f18427Y * 31) + this.Z) * 31;
            long j = this.X;
            int iHashCode = (Arrays.hashCode(this.g0) + ((Arrays.hashCode(this.f0) + ((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.e0)) * 31)) * 31)) * 31;
            long j2 = this.h0;
            return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.i0 ? 1 : 0);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    static {
        AdGroup adGroup = new AdGroup(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = adGroup.f0;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = adGroup.g0;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        h0 = new AdGroup(adGroup.X, 0, adGroup.Z, iArrCopyOf, (Uri[]) Arrays.copyOf(adGroup.e0, 0), jArrCopyOf, adGroup.h0, adGroup.i0);
        int i2 = Util.f18979a;
        i0 = Integer.toString(1, 36);
        j0 = Integer.toString(2, 36);
        k0 = Integer.toString(3, 36);
        l0 = Integer.toString(4, 36);
        m0 = new f(22);
    }

    public AdPlaybackState(AdGroup[] adGroupArr, long j, long j2, int i2) {
        this.f18426Y = j;
        this.Z = j2;
        this.X = adGroupArr.length + i2;
        this.f0 = adGroupArr;
        this.e0 = i2;
    }

    public final AdGroup a(int i2) {
        int i3 = this.e0;
        return i2 < i3 ? h0 : this.f0[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        int i2 = Util.f18979a;
        return this.X == adPlaybackState.X && this.f18426Y == adPlaybackState.f18426Y && this.Z == adPlaybackState.Z && this.e0 == adPlaybackState.e0 && Arrays.equals(this.f0, adPlaybackState.f0);
    }

    public final int hashCode() {
        return (((((((this.X * 961) + ((int) this.f18426Y)) * 31) + ((int) this.Z)) * 31) + this.e0) * 31) + Arrays.hashCode(this.f0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f18426Y);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            AdGroup[] adGroupArr = this.f0;
            if (i2 >= adGroupArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(adGroupArr[i2].X);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < adGroupArr[i2].f0.length; i3++) {
                sb.append("ad(state=");
                int i4 = adGroupArr[i2].f0[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(adGroupArr[i2].g0[i3]);
                sb.append(')');
                if (i3 < adGroupArr[i2].f0.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < adGroupArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
