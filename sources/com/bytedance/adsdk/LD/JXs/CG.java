package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CG implements NDz<com.bytedance.adsdk.LD.ebl.lk> {
    public static final CG Lxb = new CG();

    private CG() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.ebl.lk LD(JsonReader jsonReader, float f) throws IOException {
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
        return new com.bytedance.adsdk.LD.ebl.lk((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
