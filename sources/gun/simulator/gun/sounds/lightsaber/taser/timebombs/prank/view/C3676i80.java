package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3676i80 implements InterfaceC3726il, InterfaceC3639hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2392El f4491a;
    public final InterfaceC3639hl b;
    public volatile int c;
    public volatile C3110bl d;
    public volatile Object e;
    public volatile EP f;
    public volatile C3198cl g;

    public C3676i80(C2392El c2392El, InterfaceC3639hl interfaceC3639hl) {
        this.f4491a = c2392El;
        this.b = interfaceC3639hl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void a(InterfaceC4650tG interfaceC4650tG, Exception exc, InterfaceC3551gl interfaceC3551gl, EnumC4516rl enumC4516rl) {
        this.b.a(interfaceC4650tG, exc, interfaceC3551gl, this.f.c.e());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void b(InterfaceC4650tG interfaceC4650tG, Object obj, InterfaceC3551gl interfaceC3551gl, EnumC4516rl enumC4516rl, InterfaceC4650tG interfaceC4650tG2) {
        this.b.b(interfaceC4650tG, obj, interfaceC3551gl, this.f.c.e(), interfaceC4650tG);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0024 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3726il
    public final boolean c() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.d != null && this.d.c()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while (!z && this.c < this.f4491a.b().size()) {
            ArrayList arrayListB = this.f4491a.b();
            int i = this.c;
            this.c = i + 1;
            this.f = (EP) arrayListB.get(i);
            if (this.f != null) {
                AbstractC2940Zo abstractC2940Zo = this.f4491a.p;
                EnumC4516rl enumC4516rlE = this.f.c.e();
                switch (((C2914Yo) abstractC2940Zo).e) {
                    case 1:
                    case 3:
                        if (this.f4491a.c(this.f.c.a()) != null) {
                            this.f.c.c(this.f4491a.o, new C3692iN(this, this.f, 6));
                            z = true;
                        }
                        break;
                    case 2:
                        if (enumC4516rlE == EnumC4516rl.c || enumC4516rlE == EnumC4516rl.e) {
                            if (this.f4491a.c(this.f.c.a()) != null) {
                                break;
                            }
                        }
                        this.f.c.c(this.f4491a.o, new C3692iN(this, this.f, 6));
                        z = true;
                        break;
                    default:
                        if (enumC4516rlE != EnumC4516rl.b) {
                            if (this.f4491a.c(this.f.c.a()) != null) {
                                break;
                            }
                        }
                        this.f.c.c(this.f4491a.o, new C3692iN(this, this.f, 6));
                        z = true;
                        break;
                }
            }
        }
        return z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3726il
    public final void cancel() {
        EP ep = this.f;
        if (ep != null) {
            ep.c.cancel();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3639hl
    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) throws Throwable {
        int i = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC3989ll interfaceC3989llH = this.f4491a.c.b().h(obj);
            Object objA = interfaceC3989llH.a();
            InterfaceC3473fr interfaceC3473frE = this.f4491a.e(objA);
            C2444Gl c2444Gl = new C2444Gl(interfaceC3473frE, objA, this.f4491a.i);
            InterfaceC4650tG interfaceC4650tG = this.f.f3021a;
            C2392El c2392El = this.f4491a;
            C3198cl c3198cl = new C3198cl(interfaceC4650tG, c2392El.n);
            InterfaceC2888Xo interfaceC2888XoA = c2392El.h.a();
            interfaceC2888XoA.g(c3198cl, c2444Gl);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c3198cl.toString();
                obj.toString();
                interfaceC3473frE.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (interfaceC2888XoA.e(c3198cl) != null) {
                this.g = c3198cl;
                this.d = new C3110bl(Collections.singletonList(this.f.f3021a), this.f4491a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.g);
                obj.toString();
            }
            try {
                this.b.b(this.f.f3021a, interfaceC3989llH.a(), this.f.c, this.f.c.e(), this.f.f3021a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f.c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
