package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nJ implements NDz<com.bytedance.adsdk.LD.lk.LD.STP> {
    public static final nJ Lxb = new nJ();

    private nJ() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.lk.LD.STP LD(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listLxb = null;
        List<PointF> listLxb2 = null;
        List<PointF> listLxb3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listLxb == null || listLxb2 == null || listLxb3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listLxb.isEmpty()) {
                    return new com.bytedance.adsdk.LD.lk.LD.STP(new PointF(), false, Collections.emptyList());
                }
                int size = listLxb.size();
                PointF pointF = listLxb.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = listLxb.get(i);
                    int i2 = i - 1;
                    arrayList.add(new com.bytedance.adsdk.LD.lk.Lxb(com.bytedance.adsdk.LD.lc.JXs.Lxb(listLxb.get(i2), listLxb3.get(i2)), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointF2, listLxb2.get(i)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listLxb.get(0);
                    int i3 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.LD.lk.Lxb(com.bytedance.adsdk.LD.lc.JXs.Lxb(listLxb.get(i3), listLxb3.get(i3)), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointF3, listLxb2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.LD.lk.LD.STP(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listLxb2 = tD.Lxb(jsonReader, f);
                    break;
                case "o":
                    listLxb3 = tD.Lxb(jsonReader, f);
                    break;
                case "v":
                    listLxb = tD.Lxb(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
