package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 implements InterfaceC2538Kb {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final C2911Yl q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2849a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    static {
        int i2 = Ug0.f3833a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
        q = new C2911Yl(14);
    }

    public B2(long j2, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
        FW.h(iArr.length == uriArr.length);
        this.f2849a = j2;
        this.b = i2;
        this.c = i3;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.g = j3;
        this.h = z;
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
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
        if (obj == null || B2.class != obj.getClass()) {
            return false;
        }
        B2 b2 = (B2) obj;
        return this.f2849a == b2.f2849a && this.b == b2.b && this.c == b2.c && Arrays.equals(this.d, b2.d) && Arrays.equals(this.e, b2.e) && Arrays.equals(this.f, b2.f) && this.g == b2.g && this.h == b2.h;
    }

    public final int hashCode() {
        int i2 = ((this.b * 31) + this.c) * 31;
        long j2 = this.f2849a;
        int iHashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j3 = this.g;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong(i, this.f2849a);
        bundle.putInt(j, this.b);
        bundle.putInt(p, this.c);
        bundle.putParcelableArrayList(k, new ArrayList<>(Arrays.asList(this.d)));
        bundle.putIntArray(l, this.e);
        bundle.putLongArray(m, this.f);
        bundle.putLong(n, this.g);
        bundle.putBoolean(o, this.h);
        return bundle;
    }
}
