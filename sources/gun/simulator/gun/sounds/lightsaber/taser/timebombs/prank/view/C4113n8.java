package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4731a;
    public final long b;
    public final Pc0 c;

    public C4113n8(String str, long j, Pc0 pc0) {
        this.f4731a = str;
        this.b = j;
        this.c = pc0;
    }

    public static C4568sM a() {
        C4568sM c4568sM = new C4568sM(18);
        c4568sM.c = 0L;
        return c4568sM;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4113n8)) {
            return false;
        }
        C4113n8 c4113n8 = (C4113n8) obj;
        String str = this.f4731a;
        if (str != null ? str.equals(c4113n8.f4731a) : c4113n8.f4731a == null) {
            if (this.b == c4113n8.b) {
                Pc0 pc0 = c4113n8.c;
                Pc0 pc1 = this.c;
                if (pc1 == null) {
                    if (pc0 == null) {
                        return true;
                    }
                } else if (pc1.equals(pc0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4731a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Pc0 pc0 = this.c;
        return (pc0 != null ? pc0.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f4731a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
