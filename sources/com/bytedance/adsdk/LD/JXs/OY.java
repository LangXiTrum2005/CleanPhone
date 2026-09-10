package com.bytedance.adsdk.LD.JXs;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.umeng.analytics.pro.cw;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class OY {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    public static com.bytedance.adsdk.LD.lk.LD.lk Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.LD.lk lkVarLxb;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            lkVarLxb = null;
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
                if (!strNextString.equals("el")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3270:
                if (!strNextString.equals("fl")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                if (!strNextString.equals("gr")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3308:
                if (!strNextString.equals("gs")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3488:
                if (!strNextString.equals("mm")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 3633:
                if (!strNextString.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 3634:
                if (!strNextString.equals("rd")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 3646:
                if (!strNextString.equals("rp")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 3669:
                if (!strNextString.equals(b.JSON_KEY_SH)) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 3679:
                if (!strNextString.equals("sr")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 3681:
                if (!strNextString.equals("st")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 3705:
                if (!strNextString.equals("tm")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 3710:
                if (!strNextString.equals("tr")) {
                    b = -1;
                } else {
                    b = cw.k;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                lkVarLxb = lc.Lxb(jsonReader, eblVar, iNextInt);
                break;
            case 1:
                lkVarLxb = le.Lxb(jsonReader, eblVar);
                break;
            case 2:
                lkVarLxb = VVE.Lxb(jsonReader, eblVar);
                break;
            case 3:
                lkVarLxb = BcA.Lxb(jsonReader, eblVar);
                break;
            case 4:
                lkVarLxb = kqm.Lxb(jsonReader, eblVar);
                break;
            case 5:
                lkVarLxb = CSn.Lxb(jsonReader);
                eblVar.Lxb("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                lkVarLxb = nE.Lxb(jsonReader, eblVar);
                break;
            case 7:
                lkVarLxb = hg.Lxb(jsonReader, eblVar);
                break;
            case 8:
                lkVarLxb = xan.Lxb(jsonReader, eblVar);
                break;
            case 9:
                lkVarLxb = rW.Lxb(jsonReader, eblVar);
                break;
            case 10:
                lkVarLxb = Ivz.Lxb(jsonReader, eblVar, iNextInt);
                break;
            case 11:
                lkVarLxb = Pw.Lxb(jsonReader, eblVar);
                break;
            case 12:
                lkVarLxb = dR.Lxb(jsonReader, eblVar);
                break;
            case 13:
                lkVarLxb = lk.Lxb(jsonReader, eblVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return lkVarLxb;
    }
}
