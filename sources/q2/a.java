package q2;

import com.google.android.gms.internal.ads.q2;
import l1.q;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import n2.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f48583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f48584c;

    public a(int i10) {
        this.f48582a = i10;
        switch (i10) {
            case 1:
                this.f48583b = new q(4);
                this.f48584c = new v(-1, -1, "image/webp");
                break;
            default:
                this.f48583b = new q(4);
                this.f48584c = new v(-1, -1, "image/avif");
                break;
        }
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        switch (this.f48582a) {
            case 0:
                h hVar = (h) lVar;
                hVar.b(4, false);
                q qVar = this.f48583b;
                qVar.J(4);
                hVar.peekFully(qVar.f44813a, 0, 4, false);
                if (qVar.B() != 1718909296) {
                    return false;
                }
                qVar.J(4);
                hVar.peekFully(qVar.f44813a, 0, 4, false);
                return qVar.B() == ((long) 1635150182);
            default:
                q qVar2 = this.f48583b;
                qVar2.J(4);
                h hVar2 = (h) lVar;
                hVar2.peekFully(qVar2.f44813a, 0, 4, false);
                if (qVar2.B() != 1380533830) {
                    return false;
                }
                hVar2.b(4, false);
                qVar2.J(4);
                hVar2.peekFully(qVar2.f44813a, 0, 4, false);
                return qVar2.B() == 1464156752;
        }
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) {
        switch (this.f48582a) {
            case 0:
                break;
        }
        return this.f48584c.b(lVar, q2Var);
    }

    @Override // n2.k
    public final void c(m mVar) {
        switch (this.f48582a) {
            case 0:
                this.f48584c.c(mVar);
                break;
            default:
                this.f48584c.c(mVar);
                break;
        }
    }

    @Override // n2.k
    public final void release() {
        int i10 = this.f48582a;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        switch (this.f48582a) {
            case 0:
                this.f48584c.seek(j10, j11);
                break;
            default:
                this.f48584c.seek(j10, j11);
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }
}
