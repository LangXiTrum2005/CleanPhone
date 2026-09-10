package oa;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f47352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47353e;

    public y0() {
        this.f47349a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        go.k.t(this.f47349a != 4);
        int iC = v0.i.c(this.f47349a);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f47349a = 4;
            switch (this.f47351c) {
                case 0:
                    do {
                        Iterator it = this.f47352d;
                        if (!it.hasNext()) {
                            this.f47349a = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((na.i) this.f47353e).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f47352d;
                        if (!it2.hasNext()) {
                            this.f47349a = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((y1) this.f47353e).f47355b.contains(next));
                    break;
            }
            this.f47350b = next;
            if (this.f47349a != 3) {
                this.f47349a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47349a = 2;
        Object obj = this.f47350b;
        this.f47350b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(Iterator it, na.i iVar) {
        this();
        this.f47351c = 0;
        this.f47352d = it;
        this.f47353e = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y0(y1 y1Var) {
        this();
        this.f47351c = 1;
        this.f47353e = y1Var;
        this.f47352d = y1Var.f47354a.iterator();
    }
}
