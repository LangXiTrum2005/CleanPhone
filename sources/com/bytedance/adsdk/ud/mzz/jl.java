package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class jl implements wc<Integer> {
    public static final jl qdl = new jl();

    private jl() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public Integer ud(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(exc.ud(jsonReader) * f));
    }
}
