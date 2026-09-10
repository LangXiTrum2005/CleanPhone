package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class fs implements wc<Float> {
    public static final fs qdl = new fs();

    private fs() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public Float ud(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(exc.ud(jsonReader) * f);
    }
}
