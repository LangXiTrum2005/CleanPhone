package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K90 {
    public InterfaceC4326pd0 b;
    public InterfaceC4353pt c;
    public InterfaceC4047mS d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3871kS f3305a = new C3871kS();
    public C3491g4 j = new C3491g4(4);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(JT jt);

    public abstract boolean c(JT jt, long j, C3491g4 c3491g4);

    public void d(boolean z) {
        if (z) {
            this.j = new C3491g4(4);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
