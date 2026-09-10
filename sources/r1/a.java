package r1;

import android.os.Build;
import com.ironsource.X3;
import java.util.Objects;
import java.util.Set;
import oa.e2;
import oa.s0;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49218d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f49221c;

    static {
        a aVar;
        if (Build.VERSION.SDK_INT >= 33) {
            s0 s0Var = new s0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                s0Var.b(Integer.valueOf(l1.y.s(i10)));
            }
            aVar = new a(2, s0Var.h());
        } else {
            aVar = new a(2, 10);
        }
        f49218d = aVar;
    }

    public a(int i10, Set set) {
        this.f49219a = i10;
        u0 u0VarV = u0.v(set);
        this.f49221c = u0VarV;
        e2 it = u0VarV.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f49220b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f49219a == aVar.f49219a && this.f49220b == aVar.f49220b && Objects.equals(this.f49221c, aVar.f49221c);
    }

    public final int hashCode() {
        int i10 = ((this.f49219a * 31) + this.f49220b) * 31;
        u0 u0Var = this.f49221c;
        return i10 + (u0Var == null ? 0 : u0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f49219a + ", maxChannelCount=" + this.f49220b + ", channelMasks=" + this.f49221c + X3.j.f27836e;
    }

    public a(int i10, int i11) {
        this.f49219a = i10;
        this.f49220b = i11;
        this.f49221c = null;
    }
}
