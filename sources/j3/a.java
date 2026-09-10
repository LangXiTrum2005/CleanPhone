package j3;

import com.google.android.gms.internal.ads.q2;
import n2.k;
import n2.l;
import n2.m;
import n2.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f43696b;

    public a(byte b10, int i10) {
        this.f43695a = i10;
        switch (i10) {
            case 1:
                this.f43696b = new v(16973, 2, "image/bmp");
                break;
            default:
                this.f43696b = new v(35152, 2, "image/png");
                break;
        }
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        switch (this.f43695a) {
            case 0:
                return ((v) this.f43696b).a(lVar);
            case 1:
                return ((v) this.f43696b).a(lVar);
            default:
                return this.f43696b.a(lVar);
        }
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) {
        switch (this.f43695a) {
            case 0:
                return ((v) this.f43696b).b(lVar, q2Var);
            case 1:
                return ((v) this.f43696b).b(lVar, q2Var);
            default:
                return this.f43696b.b(lVar, q2Var);
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        switch (this.f43695a) {
            case 0:
                ((v) this.f43696b).c(mVar);
                break;
            case 1:
                ((v) this.f43696b).c(mVar);
                break;
            default:
                this.f43696b.c(mVar);
                break;
        }
    }

    @Override // n2.k
    public final void release() {
        switch (this.f43695a) {
            case 0:
            case 1:
                break;
            default:
                this.f43696b.release();
                break;
        }
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        switch (this.f43695a) {
            case 0:
                ((v) this.f43696b).seek(j10, j11);
                break;
            case 1:
                ((v) this.f43696b).seek(j10, j11);
                break;
            default:
                this.f43696b.seek(j10, j11);
                break;
        }
    }

    public a(int i10) {
        this.f43695a = 2;
        if ((i10 & 1) != 0) {
            this.f43696b = new v(65496, 2, "image/jpeg");
        } else {
            this.f43696b = new v2.a();
        }
    }

    private final void e() {
    }

    private final void f() {
    }
}
