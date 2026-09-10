package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class jyq {
    public static <T> List<com.bytedance.adsdk.ud.wd.qdl<T>> qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, float f, wc<T> wcVar, boolean z2) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.ud.wd wdVar2;
        float f2;
        wc<T> wcVar2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            wdVar.qdl("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.ud.wd wdVar3 = wdVar;
                    float f3 = f;
                    wc<T> wcVar3 = wcVar;
                    boolean z4 = z2;
                    com.bytedance.adsdk.ud.wd.qdl qdlVarQdl = aaj.qdl(jsonReader3, wdVar3, f3, wcVar3, false, z4);
                    jsonReader2 = jsonReader3;
                    wdVar2 = wdVar3;
                    f2 = f3;
                    wcVar2 = wcVar3;
                    z3 = z4;
                    arrayList.add(qdlVarQdl);
                } else {
                    jsonReader2 = jsonReader;
                    wdVar2 = wdVar;
                    f2 = f;
                    wcVar2 = wcVar;
                    z3 = z2;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(aaj.qdl(jsonReader2, wdVar2, f2, wcVar2, true, z3));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                wdVar = wdVar2;
                f = f2;
                wcVar = wcVar2;
                z2 = z3;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(aaj.qdl(jsonReader4, wdVar, f, wcVar, false, z2));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        qdl(arrayList);
        return arrayList;
    }

    public static <T> void qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
        int i2;
        T t;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = list.get(i3);
            i3++;
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = list.get(i3);
            qdlVar.wd = Float.valueOf(qdlVar2.mo);
            if (qdlVar.ud == null && (t = qdlVar2.qdl) != null) {
                qdlVar.ud = t;
                if (qdlVar instanceof com.bytedance.adsdk.ud.qdl.ud.tvp) {
                    ((com.bytedance.adsdk.ud.qdl.ud.tvp) qdlVar).qdl();
                }
            }
        }
        com.bytedance.adsdk.ud.wd.qdl<T> qdlVar3 = list.get(i2);
        if ((qdlVar3.qdl == null || qdlVar3.ud == null) && list.size() > 1) {
            list.remove(qdlVar3);
        }
    }
}
