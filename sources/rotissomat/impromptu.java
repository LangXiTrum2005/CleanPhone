package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;

/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36860attabal = JsonReader.attabal.attabal("ty", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    public static euhemerize.dern attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        euhemerize.dern dernVarAttabal;
        String strCuirassed;
        jsonReader.dern();
        byte b = 2;
        int iDovishness = 2;
        while (true) {
            dernVarAttabal = null;
            if (!jsonReader.formularize()) {
                strCuirassed = null;
                break;
            }
            int iPolder = jsonReader.polder(f36860attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
                break;
            }
            if (iPolder != 1) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                iDovishness = jsonReader.dovishness();
            }
        }
        if (strCuirassed == null) {
            return null;
        }
        switch (strCuirassed.hashCode()) {
            case 3239:
                b = !strCuirassed.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strCuirassed.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strCuirassed.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strCuirassed.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strCuirassed.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strCuirassed.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strCuirassed.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT) ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strCuirassed.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strCuirassed.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strCuirassed.equals(b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strCuirassed.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strCuirassed.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strCuirassed.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strCuirassed.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                dernVarAttabal = beachfront.attabal(jsonReader, impromptuVar, iDovishness);
                break;
            case 1:
                dernVarAttabal = restrictive.attabal(jsonReader, impromptuVar);
                break;
            case 2:
                dernVarAttabal = arytenoidectomy.attabal(jsonReader, impromptuVar);
                break;
            case 3:
                dernVarAttabal = merc.attabal(jsonReader, impromptuVar);
                break;
            case 4:
                dernVarAttabal = monoploid.attabal(jsonReader, impromptuVar);
                break;
            case 5:
                dernVarAttabal = preprohormone.attabal(jsonReader);
                impromptuVar.attabal("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                dernVarAttabal = oilcan.attabal(jsonReader, impromptuVar);
                break;
            case 7:
                dernVarAttabal = sealless.attabal(jsonReader, impromptuVar);
                break;
            case 8:
                dernVarAttabal = yemenite.attabal(jsonReader, impromptuVar);
                break;
            case 9:
                dernVarAttabal = polder.attabal(jsonReader, impromptuVar);
                break;
            case 10:
                dernVarAttabal = trm.attabal(jsonReader, impromptuVar, iDovishness);
                break;
            case 11:
                dernVarAttabal = seminary.attabal(jsonReader, impromptuVar);
                break;
            case 12:
                dernVarAttabal = grimness.attabal(jsonReader, impromptuVar);
                break;
            case 13:
                dernVarAttabal = dern.impromptu(jsonReader, impromptuVar);
                break;
            default:
                utwa.beachfront.dern("Unknown shape type " + strCuirassed);
                break;
        }
        while (jsonReader.formularize()) {
            jsonReader.saran();
        }
        jsonReader.cutely();
        return dernVarAttabal;
    }
}
