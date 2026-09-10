package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: compiled from: RectangleShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36871attabal = JsonReader.attabal.attabal("nm", TtmlNode.TAG_P, "s", "r", "hd");

    public static euhemerize.beachfront attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        String strCuirassed = null;
        inswinger.kowloon<PointF, PointF> kowloonVarSaneness = null;
        inswinger.beachfront beachfrontVarTaiyuan = null;
        inswinger.saneness sanenessVarMarial = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36871attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                kowloonVarSaneness = attabal.saneness(jsonReader, impromptuVar);
            } else if (iPolder == 2) {
                beachfrontVarTaiyuan = wireman.taiyuan(jsonReader, impromptuVar);
            } else if (iPolder == 3) {
                sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
            } else if (iPolder != 4) {
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        return new euhemerize.beachfront(strCuirassed, kowloonVarSaneness, beachfrontVarTaiyuan, sanenessVarMarial, zArytenoidectomy);
    }
}
