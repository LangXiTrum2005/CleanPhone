package rotissomat;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: ShapeFillParser.java */
/* JADX INFO: loaded from: classes.dex */
public class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36875attabal = JsonReader.attabal.attabal("nm", "c", "o", "fillEnabled", "r", "hd");

    public static euhemerize.cutely attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        inswinger.wireman wiremanVar = null;
        String strCuirassed = null;
        inswinger.attabal attabalVarDern = null;
        boolean zArytenoidectomy = false;
        boolean zArytenoidectomy2 = false;
        int iDovishness = 1;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36875attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                attabalVarDern = wireman.dern(jsonReader, impromptuVar);
            } else if (iPolder == 2) {
                wiremanVar = wireman.impromptu(jsonReader, impromptuVar);
            } else if (iPolder == 3) {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            } else if (iPolder == 4) {
                iDovishness = jsonReader.dovishness();
            } else if (iPolder != 5) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                zArytenoidectomy2 = jsonReader.arytenoidectomy();
            }
        }
        if (wiremanVar == null) {
            wiremanVar = new inswinger.wireman(Collections.singletonList(new com.airbnb.lottie.value.attabal(100)));
        }
        return new euhemerize.cutely(strCuirassed, zArytenoidectomy, iDovishness == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, attabalVarDern, wiremanVar, zArytenoidectomy2);
    }
}
