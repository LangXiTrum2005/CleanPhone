package ads_mobile_sdk;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class vi2 implements Iterator {
    public final ArrayDeque a;
    public hn b;

    public vi2(kn knVar) {
        if (!(knVar instanceof wi2)) {
            this.a = null;
            this.b = (hn) knVar;
            return;
        }
        wi2 wi2Var = (wi2) knVar;
        ArrayDeque arrayDeque = new ArrayDeque(wi2Var.a());
        this.a = arrayDeque;
        arrayDeque.push(wi2Var);
        this.b = a(wi2Var.e);
    }

    public final hn a(kn knVar) {
        while (knVar instanceof wi2) {
            wi2 wi2Var = (wi2) knVar;
            this.a.push(wi2Var);
            knVar = wi2Var.e;
        }
        return (hn) knVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hn next() {
        hn hnVarA;
        hn hnVar = this.b;
        if (hnVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                hnVarA = null;
                break;
            }
            hnVarA = a(((wi2) this.a.pop()).f);
        } while (hnVarA.size() == 0);
        this.b = hnVarA;
        return hnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
