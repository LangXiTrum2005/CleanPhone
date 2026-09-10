package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    public static com.bytedance.adsdk.ud.lnr.qdl.mo lnr(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.mo(jyq.qdl(jsonReader, wdVar, com.bytedance.adsdk.ud.mo.mo.qdl(), koa.qdl, true));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.wd mml(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.wd(qdl(jsonReader, wdVar, hkc.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.to mo(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.to(qdl(jsonReader, com.bytedance.adsdk.ud.mo.mo.qdl(), wdVar, tvp.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.jpc mzz(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.jpc(qdl(jsonReader, com.bytedance.adsdk.ud.mo.mo.qdl(), wdVar, hzv.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.ud qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return qdl(jsonReader, wdVar, true);
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.mml ud(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.mml(qdl(jsonReader, wdVar, jl.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.qdl wd(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.qdl(qdl(jsonReader, wdVar, wd.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.ud qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, boolean z2) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.ud(qdl(jsonReader, z2 ? com.bytedance.adsdk.ud.mo.mo.qdl() : 1.0f, wdVar, fs.qdl));
    }

    public static com.bytedance.adsdk.ud.lnr.qdl.lnr qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, int i2) throws IOException {
        return new com.bytedance.adsdk.ud.lnr.qdl.lnr(qdl(jsonReader, wdVar, new bjy(i2)));
    }

    private static <T> List<com.bytedance.adsdk.ud.wd.qdl<T>> qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, wc<T> wcVar) throws IOException {
        return jyq.qdl(jsonReader, wdVar, 1.0f, wcVar, false);
    }

    private static <T> List<com.bytedance.adsdk.ud.wd.qdl<T>> qdl(JsonReader jsonReader, float f, com.bytedance.adsdk.ud.wd wdVar, wc<T> wcVar) throws IOException {
        return jyq.qdl(jsonReader, wdVar, f, wcVar, false);
    }
}
