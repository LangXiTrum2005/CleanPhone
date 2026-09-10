package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zf implements kt<PointF> {
    public static final zf ri = new zf();

    private zf() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public PointF lr(JsonReader jsonReader, float f) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return tan.lr(jsonReader, f);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return tan.lr(jsonReader, f);
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
