package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Sfi {
    public static <T> List<com.bytedance.adsdk.LD.ebl.Lxb<T>> Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, float f, NDz<T> nDz, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eblVar.Lxb("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(DY.Lxb(jsonReader, eblVar, f, nDz, false, z));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(DY.Lxb(jsonReader, eblVar, f, nDz, true, z));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(DY.Lxb(jsonReader, eblVar, f, nDz, false, z));
            }
        }
        jsonReader.endObject();
        Lxb(arrayList);
        return arrayList;
    }

    public static <T> void Lxb(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb = list.get(i2);
            i2++;
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb2 = list.get(i2);
            lxb.ebl = Float.valueOf(lxb2.lc);
            if (lxb.LD == null && (t = lxb2.Lxb) != null) {
                lxb.LD = t;
                if (lxb instanceof com.bytedance.adsdk.LD.Lxb.LD.QAg) {
                    ((com.bytedance.adsdk.LD.Lxb.LD.QAg) lxb).Lxb();
                }
            }
        }
        com.bytedance.adsdk.LD.ebl.Lxb<T> lxb3 = list.get(i);
        if ((lxb3.Lxb == null || lxb3.LD == null) && list.size() > 1) {
            list.remove(lxb3);
        }
    }
}
