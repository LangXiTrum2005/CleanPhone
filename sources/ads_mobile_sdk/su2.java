package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class su2 implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ uu2 d;

    public su2(uu2 uu2Var) {
        this.d = uu2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        uu2 uu2Var = this.d;
        if (i >= uu2Var.b) {
            if (uu2Var.c.isEmpty()) {
                return false;
            }
            if (this.c == null) {
                this.c = this.d.c.entrySet().iterator();
            }
            if (!this.c.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        uu2 uu2Var = this.d;
        if (i < uu2Var.b) {
            return (ru2) uu2Var.a[i];
        }
        if (this.c == null) {
            this.c = uu2Var.c.entrySet().iterator();
        }
        return (Map.Entry) this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        this.d.a();
        int i = this.a;
        uu2 uu2Var = this.d;
        if (i < uu2Var.b) {
            this.a = i - 1;
            uu2Var.b(i);
        } else {
            if (this.c == null) {
                this.c = uu2Var.c.entrySet().iterator();
            }
            this.c.remove();
        }
    }
}
