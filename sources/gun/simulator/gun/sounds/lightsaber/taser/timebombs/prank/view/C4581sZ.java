package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4581sZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4984a;
    public Object b;

    public C4581sZ() {
        this.b = InterfaceC2412Ff.f3077a;
    }

    public final void a(int i) {
        FW.s(!this.f4984a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public final C3125bv b() {
        FW.s(!this.f4984a);
        this.f4984a = true;
        return new C3125bv((SparseBooleanArray) this.b);
    }

    public final synchronized void c() {
        this.f4984a = false;
    }

    public final synchronized boolean d() {
        if (this.f4984a) {
            return false;
        }
        this.f4984a = true;
        notifyAll();
        return true;
    }

    public final synchronized void e(InterfaceC3616hZ interfaceC3616hZ, boolean z) {
        try {
            if (this.f4984a || z) {
                ((Handler) this.b).obtainMessage(1, interfaceC3616hZ).sendToTarget();
            } else {
                this.f4984a = true;
                interfaceC3616hZ.recycle();
                this.f4984a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4581sZ(int i) {
        this();
        if (i != 1) {
            if (i == 2) {
            } else if (i != 3) {
                this.b = new Handler(Looper.getMainLooper(), new C4493rZ());
            } else {
                this.b = new SparseBooleanArray();
            }
        }
    }
}
