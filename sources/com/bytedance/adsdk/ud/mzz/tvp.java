package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class tvp implements wc<com.bytedance.adsdk.ud.lnr.ud> {
    public static final tvp qdl = new tvp();

    private tvp() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.lnr.ud ud(JsonReader jsonReader, float f) throws IOException {
        com.bytedance.adsdk.ud.lnr.ud.qdl qdlVar = com.bytedance.adsdk.ud.lnr.ud.qdl.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.ud.lnr.ud.qdl qdlVar2 = qdlVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iQdl = 0;
        int iQdl2 = 0;
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
                    qdlVar2 = com.bytedance.adsdk.ud.lnr.ud.qdl.CENTER;
                    if (iNextInt2 <= qdlVar2.ordinal() && iNextInt2 >= 0) {
                        qdlVar2 = com.bytedance.adsdk.ud.lnr.ud.qdl.values()[iNextInt2];
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
                    iQdl = exc.qdl(jsonReader);
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
                    iQdl2 = exc.qdl(jsonReader);
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
        return new com.bytedance.adsdk.ud.lnr.ud(strNextString, strNextString2, fNextDouble, qdlVar2, iNextInt, fNextDouble2, fNextDouble3, iQdl, iQdl2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
