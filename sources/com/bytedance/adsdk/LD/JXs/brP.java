package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class brP implements NDz<Integer> {
    public static final brP Lxb = new brP();

    private brP() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public Integer LD(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(tD.LD(jsonReader) * f));
    }
}
