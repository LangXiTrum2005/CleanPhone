package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class IW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3220a;
    public final String b;

    public IW(String str, String str2) {
        this.f3220a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header{name='");
        sb.append(this.f3220a);
        sb.append("', value='");
        return DM.m(sb, this.b, "'}");
    }
}
