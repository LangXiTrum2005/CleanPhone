package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3647hp implements InterfaceC2888Xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4473a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;

    public final synchronized C3909kp a() {
        try {
            if (((C3909kp) this.b) == null) {
                this.b = C3909kp.i((File) this.d, this.f4473a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C3909kp) this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2888Xo
    public final File e(InterfaceC4650tG interfaceC4650tG) {
        String strB = ((M20) this.c).b(interfaceC4650tG);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC4650tG);
        }
        try {
            C3647hp c3647hpG = a().g(strB);
            if (c3647hpG != null) {
                return ((File[]) c3647hpG.e)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2888Xo
    public final void g(InterfaceC4650tG interfaceC4650tG, C2444Gl c2444Gl) {
        C3029ap c3029apA;
        String strB = ((M20) this.c).b(interfaceC4650tG);
        C3692iN c3692iN = (C3692iN) this.e;
        synchronized (c3692iN) {
            try {
                c3029apA = (C3029ap) ((Map) c3692iN.b).get(strB);
                if (c3029apA == null) {
                    c3029apA = ((Wm0) c3692iN.c).A();
                    ((Map) c3692iN.b).put(strB, c3029apA);
                }
                c3029apA.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c3029apA.f4143a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC4650tG);
            }
            try {
                C3909kp c3909kpA = a();
                if (c3909kpA.g(strB) != null) {
                    ((C3692iN) this.e).L(strB);
                    return;
                }
                C3877kY c3877kYE = c3909kpA.e(strB);
                if (c3877kYE == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strB));
                }
                try {
                    if (((InterfaceC3473fr) c2444Gl.f3136a).w(c2444Gl.b, c3877kYE.l(), (YS) c2444Gl.c)) {
                        c3877kYE.e();
                    }
                    if (!c3877kYE.b) {
                        c3877kYE.c();
                    }
                    ((C3692iN) this.e).L(strB);
                } catch (Throwable th2) {
                    if (!c3877kYE.b) {
                        try {
                            c3877kYE.c();
                        } catch (IOException unused) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            ((C3692iN) this.e).L(strB);
            throw th3;
        }
    }
}
