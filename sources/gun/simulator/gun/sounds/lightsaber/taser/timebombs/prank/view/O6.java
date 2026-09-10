package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3492a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final JT f;
    public final JT g;
    public int h;
    public int i;

    public O6(JT jt, JT jt2, boolean z) throws KT {
        this.g = jt;
        this.f = jt2;
        this.e = z;
        jt2.E(12);
        this.f3492a = jt2.w();
        jt.E(12);
        this.i = jt.w();
        AbstractC2871Wx.T("first_chunk must be 1", jt.f() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.f3492a) {
            return false;
        }
        boolean z = this.e;
        JT jt = this.f;
        this.d = z ? jt.x() : jt.u();
        if (this.b == this.h) {
            JT jt2 = this.g;
            this.c = jt2.w();
            jt2.F(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? jt2.w() - 1 : -1;
        }
        return true;
    }
}
