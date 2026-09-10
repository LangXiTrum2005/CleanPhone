package ads_mobile_sdk;

import java.util.NoSuchElementException;
import saneness.incorrectly;
import saneness.rostrated;

/* JADX INFO: loaded from: classes.dex */
public final class ti2 extends incorrectly {
    public final vi2 a;
    public rostrated b = b();

    public ti2(wi2 wi2Var) {
        this.a = new vi2(wi2Var);
    }

    @Override // saneness.rostrated
    public final byte a() {
        rostrated rostratedVar = this.b;
        if (rostratedVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = rostratedVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    public final bn b() {
        if (!this.a.hasNext()) {
            return null;
        }
        hn hnVarB = this.a.next();
        hnVarB.getClass();
        return new bn(hnVarB);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
