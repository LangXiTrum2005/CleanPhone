package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class co implements kt<Float> {
    public static final co ri = new co();

    private co() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public Float lr(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(tan.lr(jsonReader) * f);
    }
}
