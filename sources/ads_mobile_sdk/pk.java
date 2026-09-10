package ads_mobile_sdk;

import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class pk extends Lambda implements Function1 {
    public static final pk a = new pk();

    public pk() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Iterable iterable = (Iterable) zk.g.invoke(jsonElement);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return arrayList;
    }
}
