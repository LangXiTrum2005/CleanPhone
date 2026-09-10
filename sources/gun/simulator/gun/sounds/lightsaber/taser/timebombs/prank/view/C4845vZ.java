package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4845vZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HY f5136a;
    public EnumC5106yW b;
    public String d;
    public C3657hz e;
    public CZ g;
    public C5021xZ h;
    public C5021xZ i;
    public C5021xZ j;
    public long k;
    public long l;
    public C4813v60 m;
    public int c = -1;
    public C5036xh f = new C5036xh();

    public static void b(String str, C5021xZ c5021xZ) {
        if (c5021xZ == null) {
            return;
        }
        if (c5021xZ.g != null) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(".body != null", str).toString());
        }
        if (c5021xZ.h != null) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(".networkResponse != null", str).toString());
        }
        if (c5021xZ.i != null) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(".cacheResponse != null", str).toString());
        }
        if (c5021xZ.j != null) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(".priorResponse != null", str).toString());
        }
    }

    public final C5021xZ a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(AbstractC2995aW.v0(Integer.valueOf(i), "code < 0: ").toString());
        }
        HY hy = this.f5136a;
        if (hy == null) {
            throw new IllegalStateException("request == null".toString());
        }
        EnumC5106yW enumC5106yW = this.b;
        if (enumC5106yW == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.d;
        if (str != null) {
            return new C5021xZ(hy, enumC5106yW, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null".toString());
    }

    public final void c(C4447qz c4447qz) {
        AbstractC2995aW.q(c4447qz, "headers");
        this.f = c4447qz.c();
    }
}
