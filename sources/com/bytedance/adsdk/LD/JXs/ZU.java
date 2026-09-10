package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    public static com.bytedance.adsdk.LD.lk.Lxb.OY JXs(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.OY(Lxb(jsonReader, com.bytedance.adsdk.LD.lc.lc.Lxb(), eblVar, nJ.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.ZU LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.ZU(Lxb(jsonReader, eblVar, brP.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.LD Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return Lxb(jsonReader, eblVar, true);
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.ebl ZU(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.ebl(Lxb(jsonReader, eblVar, CG.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.Lxb ebl(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.Lxb(Lxb(jsonReader, eblVar, ebl.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.nBu lc(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.nBu(Lxb(jsonReader, com.bytedance.adsdk.LD.lc.lc.Lxb(), eblVar, QAg.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.lc lk(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.lc(Sfi.Lxb(jsonReader, eblVar, com.bytedance.adsdk.LD.lc.lc.Lxb(), KPU.Lxb, true));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.LD Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, boolean z) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.LD(Lxb(jsonReader, z ? com.bytedance.adsdk.LD.lc.lc.Lxb() : 1.0f, eblVar, sLN.Lxb));
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.lk Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, int i) throws IOException {
        return new com.bytedance.adsdk.LD.lk.Lxb.lk(Lxb(jsonReader, eblVar, new IeN(i)));
    }

    private static <T> List<com.bytedance.adsdk.LD.ebl.Lxb<T>> Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, NDz<T> nDz) throws IOException {
        return Sfi.Lxb(jsonReader, eblVar, 1.0f, nDz, false);
    }

    private static <T> List<com.bytedance.adsdk.LD.ebl.Lxb<T>> Lxb(JsonReader jsonReader, float f, com.bytedance.adsdk.LD.ebl eblVar, NDz<T> nDz) throws IOException {
        return Sfi.Lxb(jsonReader, eblVar, f, nDz, false);
    }
}
