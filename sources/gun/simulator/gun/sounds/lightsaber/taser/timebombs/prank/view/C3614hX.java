package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3614hX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4456a;
    public final long b;
    public final String c;
    public int d;

    public C3614hX(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.f4456a = j;
        this.b = j2;
    }

    public final C3614hX a(C3614hX c3614hX, String str) {
        String strV = FW.V(str, this.c);
        if (c3614hX == null || !strV.equals(FW.V(str, c3614hX.c))) {
            return null;
        }
        long j = c3614hX.b;
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.f4456a;
            if (j3 + j2 == c3614hX.f4456a) {
                return new C3614hX(strV, j3, j == -1 ? -1L : j2 + j);
            }
        }
        if (j != -1) {
            long j4 = c3614hX.f4456a;
            if (j4 + j == this.f4456a) {
                return new C3614hX(strV, j4, j2 == -1 ? -1L : j + j2);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return FW.X(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3614hX.class != obj.getClass()) {
            return false;
        }
        C3614hX c3614hX = (C3614hX) obj;
        return this.f4456a == c3614hX.f4456a && this.b == c3614hX.b && this.c.equals(c3614hX.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.f4456a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.f4456a);
        sb.append(", length=");
        return AbstractC3950lJ.s(sb, this.b, ")");
    }
}
