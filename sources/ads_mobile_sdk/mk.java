package ads_mobile_sdk;

import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class mk extends Lambda implements Function1 {
    public static final mk a = new mk();

    public mk() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, JsonElement> mapAsMap = it.getAsJsonObject().asMap();
        Intrinsics.checkNotNullExpressionValue(mapAsMap, "asMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(mapAsMap.size()));
        Iterator<T> it2 = mapAsMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), Double.valueOf(((JsonElement) entry.getValue()).getAsDouble()));
        }
        return linkedHashMap;
    }
}
