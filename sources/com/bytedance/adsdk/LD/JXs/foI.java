package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class foI implements NDz<PointF> {
    public static final foI Lxb = new foI();

    private foI() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public PointF LD(JsonReader jsonReader, float f) throws IOException {
        return tD.LD(jsonReader, f);
    }
}
