package com.bytedance.adsdk.lr.fi;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class mj {
    public static com.bytedance.adsdk.lr.ik.lr.ik ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.lr.ik ikVarRi;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            ikVarRi = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strNextString.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT) ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strNextString.equals(b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strNextString.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strNextString.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ikVarRi = di.ri(jsonReader, xhaVar, iNextInt);
                break;
            case 1:
                ikVarRi = pv.ri(jsonReader, xhaVar);
                break;
            case 2:
                ikVarRi = slm.ri(jsonReader, xhaVar);
                break;
            case 3:
                ikVarRi = ig.ri(jsonReader, xhaVar);
                break;
            case 4:
                ikVarRi = bu.ri(jsonReader, xhaVar);
                break;
            case 5:
                ikVarRi = fr.ri(jsonReader);
                xhaVar.ri("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                ikVarRi = ory.ri(jsonReader, xhaVar);
                break;
            case 7:
                ikVarRi = oh.ri(jsonReader, xhaVar);
                break;
            case 8:
                ikVarRi = hcw.ri(jsonReader, xhaVar);
                break;
            case 9:
                ikVarRi = qd.ri(jsonReader, xhaVar);
                break;
            case 10:
                ikVarRi = dw.ri(jsonReader, xhaVar, iNextInt);
                break;
            case 11:
                ikVarRi = srn.ri(jsonReader, xhaVar);
                break;
            case 12:
                ikVarRi = jc.ri(jsonReader, xhaVar);
                break;
            case 13:
                ikVarRi = ik.ri(jsonReader, xhaVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return ikVarRi;
    }
}
