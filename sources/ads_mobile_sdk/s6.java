package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class s6 implements portwide {
    public final Set a;

    public s6(Set requestTypes) {
        Intrinsics.checkNotNullParameter(requestTypes, "requestTypes");
        this.a = requestTypes;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_TYPE;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        Set set = this.a;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((yf2) it.next()).a);
        }
        return new tn0(new r6(arrayList));
    }
}
