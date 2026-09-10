package com.inmobi.media;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H0 {
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    public static HashMap a(String creativeTypeString, String customRefData, boolean z2, JSONObject jSONObject, byte b2) {
        String str;
        Intrinsics.f(creativeTypeString, "creativeTypeString");
        Intrinsics.f(customRefData, "customRefData");
        HashMap map = new HashMap();
        int iHashCode = creativeTypeString.hashCode();
        if (iHashCode == 93166550) {
            str = "audio";
            if (!creativeTypeString.equals("audio")) {
                str = "unknown";
            }
        } else if (iHashCode == 112202875) {
            str = "video";
            if (!creativeTypeString.equals("video")) {
                str = "unknown";
            }
        } else if (iHashCode != 1425678798) {
            str = "unknown";
        } else {
            str = "nonvideo";
            if (!creativeTypeString.equals("nonvideo")) {
                str = "unknown";
            }
        }
        map.put("creativeType", str);
        map.put("customReferenceData", customRefData);
        map.put("impressionType", Byte.valueOf(b2));
        HashMap map2 = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next);
                Intrinsics.c(next);
                Intrinsics.c(strOptString);
                map2.put(next, strOptString);
            }
        }
        map.put("macros", map2);
        map.put("isolateVerificationScripts", Boolean.valueOf(z2));
        return map;
    }
}
