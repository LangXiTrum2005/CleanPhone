package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: compiled from: PolystarShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36888attabal = JsonReader.attabal.attabal("nm", "sy", "pt", TtmlNode.TAG_P, "r", "or", L6.F, "ir", "is", "hd", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    public static PolystarShape attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, int i) throws IOException {
        boolean zArytenoidectomy = false;
        boolean z = i == 3;
        String strCuirassed = null;
        PolystarShape.Type typeForValue = null;
        inswinger.saneness sanenessVarBeachfront = null;
        inswinger.kowloon<PointF, PointF> kowloonVarSaneness = null;
        inswinger.saneness sanenessVarBeachfront2 = null;
        inswinger.saneness sanenessVarMarial = null;
        inswinger.saneness sanenessVarMarial2 = null;
        inswinger.saneness sanenessVarBeachfront3 = null;
        inswinger.saneness sanenessVarBeachfront4 = null;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36888attabal)) {
                case 0:
                    strCuirassed = jsonReader.cuirassed();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.dovishness());
                    break;
                case 2:
                    sanenessVarBeachfront = wireman.beachfront(jsonReader, impromptuVar, false);
                    break;
                case 3:
                    kowloonVarSaneness = attabal.saneness(jsonReader, impromptuVar);
                    break;
                case 4:
                    sanenessVarBeachfront2 = wireman.beachfront(jsonReader, impromptuVar, false);
                    break;
                case 5:
                    sanenessVarMarial2 = wireman.marial(jsonReader, impromptuVar);
                    break;
                case 6:
                    sanenessVarBeachfront4 = wireman.beachfront(jsonReader, impromptuVar, false);
                    break;
                case 7:
                    sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
                    break;
                case 8:
                    sanenessVarBeachfront3 = wireman.beachfront(jsonReader, impromptuVar, false);
                    break;
                case 9:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                case 10:
                    z = jsonReader.dovishness() == 3;
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    break;
            }
        }
        return new PolystarShape(strCuirassed, typeForValue, sanenessVarBeachfront, kowloonVarSaneness, sanenessVarBeachfront2, sanenessVarMarial, sanenessVarMarial2, sanenessVarBeachfront3, sanenessVarBeachfront4, zArytenoidectomy, z);
    }
}
