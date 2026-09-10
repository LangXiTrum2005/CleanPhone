package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements kt<com.bytedance.adsdk.lr.ik.lr> {
    public static final jbs ri = new jbs();

    private jbs() {
    }

    @Override // com.bytedance.adsdk.lr.fi.kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lr.ik.lr lr(JsonReader jsonReader, float f) throws IOException {
        com.bytedance.adsdk.lr.ik.lr.ri riVar = com.bytedance.adsdk.lr.ik.lr.ri.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.lr.ri riVar2 = riVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iRi = 0;
        int iRi2 = 0;
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
                    riVar2 = com.bytedance.adsdk.lr.ik.lr.ri.CENTER;
                    if (iNextInt2 <= riVar2.ordinal() && iNextInt2 >= 0) {
                        riVar2 = com.bytedance.adsdk.lr.ik.lr.ri.values()[iNextInt2];
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
                    iRi = tan.ri(jsonReader);
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
                    iRi2 = tan.ri(jsonReader);
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
        return new com.bytedance.adsdk.lr.ik.lr(strNextString, strNextString2, fNextDouble, riVar2, iNextInt, fNextDouble2, fNextDouble3, iRi, iRi2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
