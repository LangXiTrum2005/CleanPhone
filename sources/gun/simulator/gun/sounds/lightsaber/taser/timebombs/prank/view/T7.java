package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class T7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3756a;
    public final long b;

    public T7(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f3756a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T7)) {
            return false;
        }
        T7 t7 = (T7) obj;
        return DM.a(this.f3756a, t7.f3756a) && this.b == t7.b;
    }

    public final int hashCode() {
        int iD = (DM.D(this.f3756a) ^ 1000003) * 1000003;
        long j = this.b;
        return iD ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(DM.E(this.f3756a));
        sb.append(", nextRequestWaitMillis=");
        return AbstractC3950lJ.s(sb, this.b, "}");
    }
}
