package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: RepeaterParser.java */
/* JADX INFO: loaded from: classes.dex */
public class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36889attabal = JsonReader.attabal.attabal("nm", "c", "o", "tr", "hd");

    public static euhemerize.competently attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        String strCuirassed = null;
        inswinger.saneness sanenessVarBeachfront = null;
        inswinger.saneness sanenessVarBeachfront2 = null;
        inswinger.triweekly triweeklyVarImpromptu = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36889attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                sanenessVarBeachfront = wireman.beachfront(jsonReader, impromptuVar, false);
            } else if (iPolder == 2) {
                sanenessVarBeachfront2 = wireman.beachfront(jsonReader, impromptuVar, false);
            } else if (iPolder == 3) {
                triweeklyVarImpromptu = dern.impromptu(jsonReader, impromptuVar);
            } else if (iPolder != 4) {
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        return new euhemerize.competently(strCuirassed, sanenessVarBeachfront, sanenessVarBeachfront2, triweeklyVarImpromptu, zArytenoidectomy);
    }
}
