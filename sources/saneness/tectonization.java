package saneness;

import ads_mobile_sdk.b41;
import ads_mobile_sdk.g61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class tectonization {
    public static final complexometry.saneness attabal(b41 b41Var) {
        Intrinsics.checkNotNullParameter(b41Var, "<this>");
        String str = b41Var.a;
        List list = b41Var.b;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((g61) it.next()).a());
        }
        return new complexometry.saneness(str, arrayList);
    }
}
