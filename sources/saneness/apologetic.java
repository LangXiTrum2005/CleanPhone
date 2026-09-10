package saneness;

import ads_mobile_sdk.et;
import ads_mobile_sdk.gt;
import ads_mobile_sdk.j;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.o21;
import ads_mobile_sdk.vm0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class apologetic extends vm0 {
    public apologetic() {
        super(gt.DEFAULT_INSTANCE);
    }

    public final void attabal(et etVar) {
        b();
        gt gtVar = (gt) this.b;
        gtVar.getClass();
        RandomAccess randomAccess = gtVar.allowedApis_;
        if (!((j) randomAccess).a) {
            j21 j21Var = (j21) randomAccess;
            gtVar.allowedApis_ = j21Var.a(j21Var.c * 2);
        }
        ((j21) gtVar.allowedApis_).b(etVar.getNumber());
    }

    public final void dern(ArrayList arrayList) {
        b();
        gt gtVar = (gt) this.b;
        RandomAccess randomAccess = gtVar.allowedApis_;
        if (!((j) randomAccess).a) {
            j21 j21Var = (j21) randomAccess;
            gtVar.allowedApis_ = j21Var.a(j21Var.c * 2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            et etVar = (et) it.next();
            ((j21) gtVar.allowedApis_).b(etVar.getNumber());
        }
    }

    public final o21 wireman() {
        gt gtVar = (gt) this.b;
        gtVar.getClass();
        return new o21(gtVar.allowedApis_, gt.allowedApis_converter_);
    }
}
