package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class su {
    public static com.bytedance.adsdk.lr.ri.lr.jbs ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ri.lr.jbs(xhaVar, ac.ri(jsonReader, xhaVar, com.bytedance.adsdk.lr.di.di.ri(), igq.ri, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
