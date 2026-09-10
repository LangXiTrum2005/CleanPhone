package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: BlurEffectParser.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36863attabal = JsonReader.attabal.attabal("ef");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36864saneness = JsonReader.attabal.attabal("ty", "v");

    public static euhemerize.attabal attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        euhemerize.attabal attabalVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.formularize()) {
                    jsonReader.cutely();
                    return attabalVar;
                }
                int iPolder = jsonReader.polder(f36864saneness);
                if (iPolder != 0) {
                    if (iPolder != 1) {
                        jsonReader.seminary();
                        jsonReader.saran();
                    } else if (z) {
                        attabalVar = new euhemerize.attabal(wireman.marial(jsonReader, impromptuVar));
                    } else {
                        jsonReader.saran();
                    }
                } else if (jsonReader.dovishness() == 0) {
                    z = true;
                }
            }
        }
    }

    public static euhemerize.attabal saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        euhemerize.attabal attabalVar = null;
        while (jsonReader.formularize()) {
            if (jsonReader.polder(f36863attabal) != 0) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                jsonReader.saneness();
                while (jsonReader.formularize()) {
                    euhemerize.attabal attabalVarAttabal = attabal(jsonReader, impromptuVar);
                    if (attabalVarAttabal != null) {
                        attabalVar = attabalVarAttabal;
                    }
                }
                jsonReader.marial();
            }
        }
        return attabalVar;
    }
}
