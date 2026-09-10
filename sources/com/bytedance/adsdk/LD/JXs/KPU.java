package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class KPU implements NDz<PointF> {
    public static final KPU Lxb = new KPU();

    private KPU() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public PointF LD(JsonReader jsonReader, float f) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return tD.LD(jsonReader, f);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return tD.LD(jsonReader, f);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
