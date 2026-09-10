package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class xd implements kt<com.bytedance.adsdk.lr.xha.ik> {
    public static final xd ri = new xd();

    private xd() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lr.xha.ik lr(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.lr.xha.ik((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
