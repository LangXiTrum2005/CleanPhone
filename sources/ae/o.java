package ae;

import com.google.android.gms.internal.ads.mr1;
import com.google.android.gms.internal.ads.nr1;
import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map.Entry f3518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f3519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f3520e;

    public o(nr1 nr1Var) {
        this.f3516a = 1;
        Objects.requireNonNull(nr1Var);
        this.f3520e = nr1Var;
        this.f3518c = nr1Var.f17934e.f17530d;
        this.f3519d = null;
        this.f3517b = nr1Var.f17933d;
    }

    public p a() {
        p pVar = (p) this.f3518c;
        q qVar = (q) this.f3520e;
        if (pVar == qVar.f3536f) {
            throw new NoSuchElementException();
        }
        if (qVar.f3535e != this.f3517b) {
            throw new ConcurrentModificationException();
        }
        this.f3518c = pVar.f3524d;
        this.f3519d = pVar;
        return pVar;
    }

    public mr1 b() {
        nr1 nr1Var = (nr1) this.f3520e;
        mr1 mr1Var = (mr1) this.f3518c;
        if (mr1Var == nr1Var.f17934e) {
            throw new NoSuchElementException();
        }
        if (nr1Var.f17933d != this.f3517b) {
            throw new ConcurrentModificationException();
        }
        this.f3518c = mr1Var.f17530d;
        this.f3519d = mr1Var;
        return mr1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3516a) {
            case 0:
                return ((p) this.f3518c) != ((q) this.f3520e).f3536f;
            default:
                return ((mr1) this.f3518c) != ((nr1) this.f3520e).f17934e;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f3516a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3516a) {
            case 0:
                q qVar = (q) this.f3520e;
                p pVar = (p) this.f3519d;
                if (pVar == null) {
                    throw new IllegalStateException();
                }
                qVar.c(pVar, true);
                this.f3519d = null;
                this.f3517b = qVar.f3535e;
                return;
            default:
                mr1 mr1Var = (mr1) this.f3519d;
                if (mr1Var == null) {
                    throw new IllegalStateException();
                }
                nr1 nr1Var = (nr1) this.f3520e;
                nr1Var.b(mr1Var, true);
                this.f3519d = null;
                this.f3517b = nr1Var.f17933d;
                return;
        }
    }

    public o(q qVar) {
        this.f3516a = 0;
        this.f3520e = qVar;
        this.f3518c = qVar.f3536f.f3524d;
        this.f3519d = null;
        this.f3517b = qVar.f3535e;
    }
}
