package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 implements InterfaceC2538Kb {
    public static final C2 g = new C2(null, new B2[0], 0, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, 0);
    public static final B2 h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final C2911Yl m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2904a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final B2[] f;

    static {
        B2 b2 = new B2(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = b2.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = b2.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        h = new B2(b2.f2849a, 0, b2.c, iArrCopyOf, (Uri[]) Arrays.copyOf(b2.d, 0), jArrCopyOf, b2.g, b2.h);
        int i2 = Ug0.f3833a;
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = new C2911Yl(13);
    }

    public C2(Object obj, B2[] b2Arr, long j2, long j3, int i2) {
        this.f2904a = obj;
        this.c = j2;
        this.d = j3;
        this.b = b2Arr.length + i2;
        this.f = b2Arr;
        this.e = i2;
    }

    public final B2 a(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2.class != obj.getClass()) {
            return false;
        }
        C2 c2 = (C2) obj;
        return Ug0.a(this.f2904a, c2.f2904a) && this.b == c2.b && this.c == c2.c && this.d == c2.d && this.e == c2.e && Arrays.equals(this.f, c2.f);
    }

    public final int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.f2904a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + Arrays.hashCode(this.f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (B2 b2 : this.f) {
            arrayList.add(b2.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(i, arrayList);
        }
        long j2 = this.c;
        if (j2 != 0) {
            bundle.putLong(j, j2);
        }
        long j3 = this.d;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bundle.putLong(k, j3);
        }
        int i2 = this.e;
        if (i2 != 0) {
            bundle.putInt(l, i2);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f2904a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            B2[] b2Arr = this.f;
            if (i2 >= b2Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(b2Arr[i2].f2849a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < b2Arr[i2].e.length; i3++) {
                sb.append("ad(state=");
                int i4 = b2Arr[i2].e[i3];
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
                sb.append(b2Arr[i2].f[i3]);
                sb.append(')');
                if (i3 < b2Arr[i2].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < b2Arr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
