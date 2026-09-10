package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5142yr implements InterfaceC3616hZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5303a;
    public final boolean b;
    public final InterfaceC3616hZ c;
    public final InterfaceC5054xr d;
    public final InterfaceC4650tG e;
    public int f;
    public boolean g;

    public C5142yr(InterfaceC3616hZ interfaceC3616hZ, boolean z, boolean z2, InterfaceC4650tG interfaceC4650tG, InterfaceC5054xr interfaceC5054xr) {
        AbstractC2871Wx.V(interfaceC3616hZ, "Argument must not be null");
        this.c = interfaceC3616hZ;
        this.f5303a = z;
        this.b = z2;
        this.e = interfaceC4650tG;
        AbstractC2871Wx.V(interfaceC5054xr, "Argument must not be null");
        this.d = interfaceC5054xr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final int a() {
        return this.c.a();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Class b() {
        return this.c.b();
    }

    public final synchronized void c() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void d() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C4439qr) this.d).e(this.e, this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Object get() {
        return this.c.get();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f5303a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
