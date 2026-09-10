package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: FontCharacterParser.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36858attabal = JsonReader.attabal.attabal("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36859saneness = JsonReader.attabal.attabal("shapes");

    public static lamplit.dern attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.dern();
        double dMonoploid = 0.0d;
        String strCuirassed = null;
        String strCuirassed2 = null;
        char cCharAt = 0;
        double dMonoploid2 = 0.0d;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36858attabal);
            if (iPolder == 0) {
                cCharAt = jsonReader.cuirassed().charAt(0);
            } else if (iPolder == 1) {
                dMonoploid2 = jsonReader.monoploid();
            } else if (iPolder == 2) {
                dMonoploid = jsonReader.monoploid();
            } else if (iPolder == 3) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 4) {
                strCuirassed2 = jsonReader.cuirassed();
            } else if (iPolder != 5) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                jsonReader.dern();
                while (jsonReader.formularize()) {
                    if (jsonReader.polder(f36859saneness) != 0) {
                        jsonReader.seminary();
                        jsonReader.saran();
                    } else {
                        jsonReader.saneness();
                        while (jsonReader.formularize()) {
                            arrayList.add((euhemerize.apical) impromptu.attabal(jsonReader, impromptuVar));
                        }
                        jsonReader.marial();
                    }
                }
                jsonReader.cutely();
            }
        }
        jsonReader.cutely();
        return new lamplit.dern(arrayList, cCharAt, dMonoploid2, dMonoploid, strCuirassed, strCuirassed2);
    }
}
