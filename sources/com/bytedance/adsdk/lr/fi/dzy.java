package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class dzy implements kt<com.bytedance.adsdk.lr.ik.lr.bgr> {
    public static final dzy ri = new dzy();

    private dzy() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lr.ik.lr.bgr lr(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listRi = null;
        List<PointF> listRi2 = null;
        List<PointF> listRi3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listRi == null || listRi2 == null || listRi3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listRi.isEmpty()) {
                    return new com.bytedance.adsdk.lr.ik.lr.bgr(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listRi.size();
                PointF pointF = listRi.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = listRi.get(i);
                    int i2 = i - 1;
                    arrayList.add(new com.bytedance.adsdk.lr.ik.ri(com.bytedance.adsdk.lr.di.fi.ri(listRi.get(i2), listRi3.get(i2)), com.bytedance.adsdk.lr.di.fi.ri(pointF2, listRi2.get(i)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listRi.get(0);
                    int i3 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.lr.ik.ri(com.bytedance.adsdk.lr.di.fi.ri(listRi.get(i3), listRi3.get(i3)), com.bytedance.adsdk.lr.di.fi.ri(pointF3, listRi2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.lr.ik.lr.bgr(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listRi2 = tan.ri(jsonReader, f);
                    break;
                case "o":
                    listRi3 = tan.ri(jsonReader, f);
                    break;
                case "v":
                    listRi = tan.ri(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
