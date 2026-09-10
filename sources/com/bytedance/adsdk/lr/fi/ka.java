package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static com.bytedance.adsdk.lr.ik.ri.qt di(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.qt(ri(jsonReader, com.bytedance.adsdk.lr.di.di.ri(), xhaVar, jbs.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.mj fi(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.mj(ri(jsonReader, com.bytedance.adsdk.lr.di.di.ri(), xhaVar, dzy.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.di ik(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.di(ihz.ri(jsonReader, xhaVar, com.bytedance.adsdk.lr.di.di.ri(), zf.ri, true));
    }

    public static com.bytedance.adsdk.lr.ik.ri.xha ka(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.xha(ri(jsonReader, xhaVar, xd.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.ka lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.ka(ri(jsonReader, xhaVar, nr.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.lr ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return ri(jsonReader, xhaVar, true);
    }

    public static com.bytedance.adsdk.lr.ik.ri.ri xha(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.ri(ri(jsonReader, xhaVar, xha.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.lr ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, boolean z) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.lr(ri(jsonReader, z ? com.bytedance.adsdk.lr.di.di.ri() : 1.0f, xhaVar, co.ri));
    }

    public static com.bytedance.adsdk.lr.ik.ri.ik ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, int i) throws IOException {
        return new com.bytedance.adsdk.lr.ik.ri.ik(ri(jsonReader, xhaVar, new vr(i)));
    }

    private static <T> List<com.bytedance.adsdk.lr.xha.ri<T>> ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, kt<T> ktVar) throws IOException {
        return ihz.ri(jsonReader, xhaVar, 1.0f, ktVar, false);
    }

    private static <T> List<com.bytedance.adsdk.lr.xha.ri<T>> ri(JsonReader jsonReader, float f, com.bytedance.adsdk.lr.xha xhaVar, kt<T> ktVar) throws IOException {
        return ihz.ri(jsonReader, xhaVar, f, ktVar, false);
    }
}
