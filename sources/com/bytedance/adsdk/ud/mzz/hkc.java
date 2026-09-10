package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class hkc implements wc<com.bytedance.adsdk.ud.wd.lnr> {
    public static final hkc qdl = new hkc();

    private hkc() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.wd.lnr ud(JsonReader jsonReader, float f) throws IOException {
        boolean z2 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z2) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.ud.wd.lnr((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
