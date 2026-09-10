package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ihz {
    public static <T> List<com.bytedance.adsdk.lr.xha.ri<T>> ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, float f, kt<T> ktVar, boolean z) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.lr.xha xhaVar2;
        float f2;
        kt<T> ktVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            xhaVar.ri("Lottie doesn't support expressions.");
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
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.lr.xha xhaVar3 = xhaVar;
                    float f3 = f;
                    kt<T> ktVar3 = ktVar;
                    boolean z3 = z;
                    com.bytedance.adsdk.lr.xha.ri riVarRi = ac.ri(jsonReader3, xhaVar3, f3, ktVar3, false, z3);
                    jsonReader2 = jsonReader3;
                    xhaVar2 = xhaVar3;
                    f2 = f3;
                    ktVar2 = ktVar3;
                    z2 = z3;
                    arrayList.add(riVarRi);
                } else {
                    jsonReader2 = jsonReader;
                    xhaVar2 = xhaVar;
                    f2 = f;
                    ktVar2 = ktVar;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(ac.ri(jsonReader2, xhaVar2, f2, ktVar2, true, z2));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                xhaVar = xhaVar2;
                f = f2;
                ktVar = ktVar2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(ac.ri(jsonReader4, xhaVar, f, ktVar, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        ri(arrayList);
        return arrayList;
    }

    public static <T> void ri(List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.lr.xha.ri<T> riVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.lr.xha.ri<T> riVar2 = list.get(i2);
            riVar.xha = Float.valueOf(riVar2.di);
            if (riVar.lr == null && (t = riVar2.ri) != null) {
                riVar.lr = t;
                if (riVar instanceof com.bytedance.adsdk.lr.ri.lr.jbs) {
                    ((com.bytedance.adsdk.lr.ri.lr.jbs) riVar).ri();
                }
            }
        }
        com.bytedance.adsdk.lr.xha.ri<T> riVar3 = list.get(i);
        if ((riVar3.ri == null || riVar3.lr == null) && list.size() > 1) {
            list.remove(riVar3);
        }
    }
}
