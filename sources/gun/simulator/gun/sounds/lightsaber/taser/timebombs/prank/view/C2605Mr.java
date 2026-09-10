package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2605Mr implements QY, IY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3427a;
    public final QY b;
    public volatile IY c;
    public volatile IY d;
    public int e = 3;
    public int f = 3;

    public C2605Mr(Object obj, QY qy) {
        this.f3427a = obj;
        this.b = qy;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean a() {
        boolean z;
        synchronized (this.f3427a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final void b(IY iy) {
        synchronized (this.f3427a) {
            try {
                if (iy.equals(this.d)) {
                    this.f = 5;
                    QY qy = this.b;
                    if (qy != null) {
                        qy.b(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void begin() {
        synchronized (this.f3427a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean c(IY iy) {
        boolean z;
        synchronized (this.f3427a) {
            QY qy = this.b;
            z = qy == null || qy.c(this);
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void clear() {
        synchronized (this.f3427a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean d(IY iy) {
        if (!(iy instanceof C2605Mr)) {
            return false;
        }
        C2605Mr c2605Mr = (C2605Mr) iy;
        return this.c.d(c2605Mr.c) && this.d.d(c2605Mr.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean e(IY iy) {
        boolean z;
        synchronized (this.f3427a) {
            QY qy = this.b;
            z = (qy == null || qy.e(this)) && iy.equals(this.c);
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final void f(IY iy) {
        synchronized (this.f3427a) {
            try {
                if (iy.equals(this.c)) {
                    this.e = 4;
                } else if (iy.equals(this.d)) {
                    this.f = 4;
                }
                QY qy = this.b;
                if (qy != null) {
                    qy.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean g() {
        boolean z;
        synchronized (this.f3427a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final QY getRoot() {
        QY root;
        synchronized (this.f3427a) {
            try {
                QY qy = this.b;
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
        synchronized (this.f3427a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QY
    public final boolean i(IY iy) {
        int i;
        boolean z;
        synchronized (this.f3427a) {
            QY qy = this.b;
            if (qy != null && !qy.i(this)) {
                z = false;
            } else if (this.e != 5) {
                if (iy.equals(this.c)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (iy.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f3427a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IY
    public final void pause() {
        synchronized (this.f3427a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.pause();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
