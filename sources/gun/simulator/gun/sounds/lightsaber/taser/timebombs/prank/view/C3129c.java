package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3129c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4197a;
    public final int b;
    public final int c;

    public /* synthetic */ C3129c(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.f4197a = str;
    }

    public static C3129c a(JT jt) {
        String str;
        jt.F(2);
        int iT = jt.t();
        int i = iT >> 1;
        int iT2 = ((jt.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iT2 >= 10 ? "." : ".0");
        sb.append(iT2);
        return new C3129c(i, iT2, sb.toString());
    }

    public C3129c(String str, int i, int i2) {
        this.f4197a = str;
        this.b = i;
        this.c = i2;
    }
}
