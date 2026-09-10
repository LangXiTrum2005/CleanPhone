package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4941wd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5189a;
    public final C5196zY[] b;
    public final InterfaceC3299dt[] c;
    public final C5117yd0 d;
    public final Object e;

    public C4941wd0(C5196zY[] c5196zYArr, InterfaceC3299dt[] interfaceC3299dtArr, C5117yd0 c5117yd0, C4041mM c4041mM) {
        this.b = c5196zYArr;
        this.c = (InterfaceC3299dt[]) interfaceC3299dtArr.clone();
        this.d = c5117yd0;
        this.e = c4041mM;
        this.f5189a = c5196zYArr.length;
    }

    public final boolean a(C4941wd0 c4941wd0, int i) {
        return c4941wd0 != null && Ug0.a(this.b[i], c4941wd0.b[i]) && Ug0.a(this.c[i], c4941wd0.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
