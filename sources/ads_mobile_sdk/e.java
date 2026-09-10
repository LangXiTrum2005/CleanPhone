package ads_mobile_sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements coi {
    public final Map a;

    public e(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }
}
