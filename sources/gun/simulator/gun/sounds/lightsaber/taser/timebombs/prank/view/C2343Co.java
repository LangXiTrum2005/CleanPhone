package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2343Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2943a;
    public final String b;
    public final String c;

    public C2343Co(String str, String str2, String str3) {
        this.f2943a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2343Co.class != obj.getClass()) {
            return false;
        }
        C2343Co c2343Co = (C2343Co) obj;
        return Ug0.a(this.f2943a, c2343Co.f2943a) && Ug0.a(this.b, c2343Co.b) && Ug0.a(this.c, c2343Co.c);
    }

    public final int hashCode() {
        int iHashCode = this.f2943a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
