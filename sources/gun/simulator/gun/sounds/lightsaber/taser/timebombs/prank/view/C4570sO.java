package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C4570sO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4977a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C4570sO(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4570sO)) {
            return false;
        }
        C4570sO c4570sO = (C4570sO) obj;
        return this.f4977a.equals(c4570sO.f4977a) && this.b == c4570sO.b && this.c == c4570sO.c && this.d == c4570sO.d && this.e == c4570sO.e;
    }

    public final int hashCode() {
        return ((((((((this.f4977a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public C4570sO(C4570sO c4570sO) {
        this.f4977a = c4570sO.f4977a;
        this.b = c4570sO.b;
        this.c = c4570sO.c;
        this.d = c4570sO.d;
        this.e = c4570sO.e;
    }

    public C4570sO(Object obj, int i, int i2, long j, int i3) {
        this.f4977a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
