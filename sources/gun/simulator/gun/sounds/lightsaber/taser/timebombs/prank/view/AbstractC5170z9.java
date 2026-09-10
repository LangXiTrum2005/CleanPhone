package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5170z9 {
    public final InterfaceC4906w9 c;
    public C4215oK e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5318a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public AbstractC5170z9(List list) {
        InterfaceC4906w9 c5082y9;
        if (list.isEmpty()) {
            c5082y9 = new Qm0();
        } else {
            c5082y9 = list.size() == 1 ? new C5082y9(list) : new C4994x9(list);
        }
        this.c = c5082y9;
    }

    public final void a(InterfaceC4818v9 interfaceC4818v9) {
        this.f5318a.add(interfaceC4818v9);
    }

    public float b() {
        if (this.h == -1.0f) {
            this.h = this.c.u();
        }
        return this.h;
    }

    public final float c() {
        Interpolator interpolator;
        C5090yG c5090yGF = this.c.f();
        if (c5090yGF == null || c5090yGF.c() || (interpolator = c5090yGF.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        C5090yG c5090yGF = this.c.f();
        if (c5090yGF.c()) {
            return 0.0f;
        }
        return (this.d - c5090yGF.b()) / (c5090yGF.a() - c5090yGF.b());
    }

    public Object e() {
        Interpolator interpolator;
        float fD = d();
        C4215oK c4215oK = this.e;
        InterfaceC4906w9 interfaceC4906w9 = this.c;
        if (c4215oK == null && interfaceC4906w9.d(fD)) {
            return this.f;
        }
        C5090yG c5090yGF = interfaceC4906w9.f();
        Interpolator interpolator2 = c5090yGF.e;
        Object objF = (interpolator2 == null || (interpolator = c5090yGF.f) == null) ? f(c5090yGF, c()) : g(c5090yGF, fD, interpolator2.getInterpolation(fD), interpolator.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(C5090yG c5090yG, float f);

    public Object g(C5090yG c5090yG, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5318a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC4818v9) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        InterfaceC4906w9 interfaceC4906w9 = this.c;
        if (interfaceC4906w9.isEmpty()) {
            return;
        }
        if (this.g == -1.0f) {
            this.g = interfaceC4906w9.j();
        }
        float f2 = this.g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.g = interfaceC4906w9.j();
            }
            f = this.g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (interfaceC4906w9.h(f)) {
            h();
        }
    }

    public final void j(C4215oK c4215oK) {
        C4215oK c4215oK2 = this.e;
        if (c4215oK2 != null) {
            c4215oK2.getClass();
        }
        this.e = c4215oK;
    }
}
