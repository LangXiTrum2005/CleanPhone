package ads_mobile_sdk;

import java.util.AbstractList;
import saneness.artsy;
import saneness.cyrtometer;

/* JADX INFO: loaded from: classes.dex */
public final class o21 extends AbstractList {
    public final cyrtometer a;
    public final artsy b;

    public o21(cyrtometer cyrtometerVar, artsy artsyVar) {
        this.a = cyrtometerVar;
        this.b = artsyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        artsy artsyVar = this.b;
        j21 j21Var = (j21) this.a;
        j21Var.d(i);
        return artsyVar.a(j21Var.b[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((j21) this.a).c;
    }
}
