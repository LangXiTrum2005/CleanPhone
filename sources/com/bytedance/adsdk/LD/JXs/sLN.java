package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class sLN implements NDz<Float> {
    public static final sLN Lxb = new sLN();

    private sLN() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Float LD(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(tD.LD(jsonReader) * f);
    }
}
