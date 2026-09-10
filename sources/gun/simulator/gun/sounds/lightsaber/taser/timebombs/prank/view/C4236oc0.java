package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4236oc0 implements QY, IY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QY f4796a;
    public final Object b;
    public volatile IY c;
    public volatile IY d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public C4236oc0(Object obj, QY qy) {
        this.b = obj;
        this.f4796a = qy;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final void b(IY iy) {
        synchronized (this.b) {
            try {
                if (!iy.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                QY qy = this.f4796a;
                if (qy != null) {
                    qy.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void begin() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.begin();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.begin();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean c(IY iy) {
        boolean z;
        synchronized (this.b) {
            try {
                QY qy = this.f4796a;
                z = (qy == null || qy.c(this)) && (iy.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean d(IY iy) {
        if (!(iy instanceof C4236oc0)) {
            return false;
        }
        C4236oc0 c4236oc0 = (C4236oc0) iy;
        if (this.c == null) {
            if (c4236oc0.c != null) {
                return false;
            }
        } else if (!this.c.d(c4236oc0.c)) {
            return false;
        }
        if (this.d == null) {
            if (c4236oc0.d != null) {
                return false;
            }
        } else if (!this.d.d(c4236oc0.d)) {
            return false;
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean e(IY iy) {
        boolean z;
        synchronized (this.b) {
            try {
                QY qy = this.f4796a;
                z = (qy == null || qy.e(this)) && iy.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final void f(IY iy) {
        synchronized (this.b) {
            try {
                if (iy.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                QY qy = this.f4796a;
                if (qy != null) {
                    qy.f(this);
                }
                if (!AbstractC3950lJ.e(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final QY getRoot() {
        QY root;
        synchronized (this.b) {
            try {
                QY qy = this.f4796a;
                root = qy != null ? qy.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean h() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean i(IY iy) {
        boolean z;
        synchronized (this.b) {
            try {
                QY qy = this.f4796a;
                z = (qy == null || qy.i(this)) && iy.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!AbstractC3950lJ.e(this.f)) {
                    this.f = 2;
                    this.d.pause();
                }
                if (!AbstractC3950lJ.e(this.e)) {
                    this.e = 2;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
