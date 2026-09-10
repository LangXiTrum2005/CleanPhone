package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ak {
    public final T9 a;

    public Ak(T9 mConfigIncludeIdMaskMap) {
        Intrinsics.checkNotNullParameter(mConfigIncludeIdMaskMap, "mConfigIncludeIdMaskMap");
        this.a = mConfigIncludeIdMaskMap;
    }

    public final HashMap a() {
        C3238t1 c3238t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.a.a() && (c3238t1 = AbstractC3407zk.a) != null && (str = c3238t1.b) != null) {
                Intrinsics.beachfront(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(Ak.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
