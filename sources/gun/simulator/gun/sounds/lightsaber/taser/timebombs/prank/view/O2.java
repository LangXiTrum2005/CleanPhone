package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes3.dex */
public final class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3346eT f3490a;
    public final EnumC3346eT b;
    public final boolean c;
    public final EnumC5042xk d;
    public final RC e;

    public O2(EnumC5042xk enumC5042xk, RC rc, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, boolean z) {
        this.d = enumC5042xk;
        this.e = rc;
        this.f3490a = enumC3346eT;
        if (enumC3346eT2 == null) {
            this.b = EnumC3346eT.NONE;
        } else {
            this.b = enumC3346eT2;
        }
        this.c = z;
    }
}
