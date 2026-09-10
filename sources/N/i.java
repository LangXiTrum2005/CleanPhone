package n;

import java.util.ArrayList;
import m0.x0;
import m0.y0;
import p.x2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46318d;

    public i(j jVar) {
        this.f46315a = 0;
        this.f46318d = jVar;
        this.f46316b = false;
        this.f46317c = 0;
    }

    @Override // m0.y0, m0.x0
    public void a() {
        switch (this.f46315a) {
            case 1:
                this.f46316b = true;
                break;
        }
    }

    @Override // m0.y0, m0.x0
    public final void b() {
        switch (this.f46315a) {
            case 0:
                if (!this.f46316b) {
                    this.f46316b = true;
                    x0 x0Var = (x0) ((j) this.f46318d).f46323e;
                    if (x0Var != null) {
                        x0Var.b();
                    }
                    break;
                }
                break;
            default:
                ((x2) this.f46318d).f47854a.setVisibility(0);
                break;
        }
    }

    @Override // m0.x0
    public final void c() {
        switch (this.f46315a) {
            case 0:
                int i10 = this.f46317c + 1;
                this.f46317c = i10;
                j jVar = (j) this.f46318d;
                if (i10 == ((ArrayList) jVar.f46321c).size()) {
                    x0 x0Var = (x0) jVar.f46323e;
                    if (x0Var != null) {
                        x0Var.c();
                    }
                    this.f46317c = 0;
                    this.f46316b = false;
                    jVar.f46320b = false;
                }
                break;
            default:
                if (!this.f46316b) {
                    ((x2) this.f46318d).f47854a.setVisibility(this.f46317c);
                }
                break;
        }
    }

    public i(x2 x2Var, int i10) {
        this.f46315a = 1;
        this.f46318d = x2Var;
        this.f46317c = i10;
        this.f46316b = false;
    }
}
