package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ShapePathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static JsonReader.attabal f36872attabal = JsonReader.attabal.attabal("nm", "ind", "ks", "hd");

    public static euhemerize.formularize attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        String strCuirassed = null;
        int iDovishness = 0;
        boolean zArytenoidectomy = false;
        inswinger.impromptu impromptuVarApical = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36872attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                iDovishness = jsonReader.dovishness();
            } else if (iPolder == 2) {
                impromptuVarApical = wireman.apical(jsonReader, impromptuVar);
            } else if (iPolder != 3) {
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        return new euhemerize.formularize(strCuirassed, iDovishness, impromptuVarApical, zArytenoidectomy);
    }
}
