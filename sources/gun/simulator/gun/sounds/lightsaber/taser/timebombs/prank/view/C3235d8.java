package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3235d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4260a;
    public final String b;

    public C3235d8(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4260a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3235d8)) {
            return false;
        }
        C3235d8 c3235d8 = (C3235d8) obj;
        return this.f4260a.equals(c3235d8.f4260a) && this.b.equals(c3235d8.b);
    }

    public final int hashCode() {
        return ((this.f4260a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f4260a);
        sb.append(", version=");
        return DM.m(sb, this.b, "}");
    }
}
