package rotissomat;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ShapeTrimPathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36857attabal = JsonReader.attabal.attabal("s", "e", "o", "nm", "m", "hd");

    public static ShapeTrimPath attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        String strCuirassed = null;
        ShapeTrimPath.Type typeForId = null;
        inswinger.saneness sanenessVarBeachfront = null;
        inswinger.saneness sanenessVarBeachfront2 = null;
        inswinger.saneness sanenessVarBeachfront3 = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36857attabal);
            if (iPolder == 0) {
                sanenessVarBeachfront = wireman.beachfront(jsonReader, impromptuVar, false);
            } else if (iPolder == 1) {
                sanenessVarBeachfront2 = wireman.beachfront(jsonReader, impromptuVar, false);
            } else if (iPolder == 2) {
                sanenessVarBeachfront3 = wireman.beachfront(jsonReader, impromptuVar, false);
            } else if (iPolder == 3) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.dovishness());
            } else if (iPolder != 5) {
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        return new ShapeTrimPath(strCuirassed, typeForId, sanenessVarBeachfront, sanenessVarBeachfront2, sanenessVarBeachfront3, zArytenoidectomy);
    }
}
