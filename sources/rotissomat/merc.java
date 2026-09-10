package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShapeGroupParser.java */
/* JADX INFO: loaded from: classes.dex */
public class merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36865attabal = JsonReader.attabal.attabal("nm", "hd", "it");

    public static euhemerize.apical attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strCuirassed = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36865attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            } else if (iPolder != 2) {
                jsonReader.saran();
            } else {
                jsonReader.saneness();
                while (jsonReader.formularize()) {
                    euhemerize.dern dernVarAttabal = impromptu.attabal(jsonReader, impromptuVar);
                    if (dernVarAttabal != null) {
                        arrayList.add(dernVarAttabal);
                    }
                }
                jsonReader.marial();
            }
        }
        return new euhemerize.apical(strCuirassed, arrayList, zArytenoidectomy);
    }
}
