package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class nr implements kt<Integer> {
    public static final nr ri = new nr();

    private nr() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public Integer lr(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(tan.lr(jsonReader) * f));
    }
}
