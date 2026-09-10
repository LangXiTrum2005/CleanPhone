package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class QAg implements NDz<com.bytedance.adsdk.LD.lk.LD> {
    public static final QAg Lxb = new QAg();

    private QAg() {
    }

    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.lk.LD LD(JsonReader jsonReader, float f) throws IOException {
        com.bytedance.adsdk.LD.lk.LD.Lxb lxb = com.bytedance.adsdk.LD.lk.LD.Lxb.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.LD.lk.LD.Lxb lxb2 = lxb;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        int iNextInt = 0;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iLxb = 0;
        int iLxb2 = 0;
        float fNextDouble4 = 0.0f;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    lxb2 = com.bytedance.adsdk.LD.lk.LD.Lxb.CENTER;
                    if (iNextInt2 <= lxb2.ordinal() && iNextInt2 >= 0) {
                        lxb2 = com.bytedance.adsdk.LD.lk.LD.Lxb.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iLxb = tD.Lxb(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iLxb2 = tD.Lxb(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.LD.lk.LD(strNextString, strNextString2, fNextDouble, lxb2, iNextInt, fNextDouble2, fNextDouble3, iLxb, iLxb2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
