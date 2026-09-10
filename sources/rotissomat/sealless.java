package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: RoundedCornersParser.java */
/* JADX INFO: loaded from: classes.dex */
public class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36879attabal = JsonReader.attabal.attabal("nm", "r", "hd");

    public static euhemerize.impromptu attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        boolean zArytenoidectomy = false;
        String strCuirassed = null;
        inswinger.saneness sanenessVarBeachfront = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36879attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                sanenessVarBeachfront = wireman.beachfront(jsonReader, impromptuVar, true);
            } else if (iPolder != 2) {
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        if (zArytenoidectomy) {
            return null;
        }
        return new euhemerize.impromptu(strCuirassed, sanenessVarBeachfront);
    }
}
