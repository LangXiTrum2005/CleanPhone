package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: FontParser.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36887attabal = JsonReader.attabal.attabal("fFamily", "fName", "fStyle", "ascent");

    public static lamplit.saneness attabal(JsonReader jsonReader) throws IOException {
        jsonReader.dern();
        String strCuirassed = null;
        String strCuirassed2 = null;
        float fMonoploid = 0.0f;
        String strCuirassed3 = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36887attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                strCuirassed3 = jsonReader.cuirassed();
            } else if (iPolder == 2) {
                strCuirassed2 = jsonReader.cuirassed();
            } else if (iPolder != 3) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                fMonoploid = (float) jsonReader.monoploid();
            }
        }
        jsonReader.cutely();
        return new lamplit.saneness(strCuirassed, strCuirassed3, strCuirassed2, fMonoploid);
    }
}
