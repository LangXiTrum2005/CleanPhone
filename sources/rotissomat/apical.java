package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: DropShadowEffectParser.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final JsonReader.attabal f36824beachfront = JsonReader.attabal.attabal("ef");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final JsonReader.attabal f36825competently = JsonReader.attabal.attabal("nm", "v");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public inswinger.attabal f36826attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public inswinger.saneness f36827dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public inswinger.saneness f36828marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public inswinger.saneness f36829saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public inswinger.saneness f36830wireman;

    public final void attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        String strCuirassed = "";
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36825competently);
            if (iPolder != 0) {
                if (iPolder == 1) {
                    strCuirassed.getClass();
                    switch (strCuirassed) {
                        case "Distance":
                            this.f36830wireman = wireman.marial(jsonReader, impromptuVar);
                            break;
                        case "Opacity":
                            this.f36829saneness = wireman.beachfront(jsonReader, impromptuVar, false);
                            break;
                        case "Direction":
                            this.f36827dern = wireman.beachfront(jsonReader, impromptuVar, false);
                            break;
                        case "Shadow Color":
                            this.f36826attabal = wireman.dern(jsonReader, impromptuVar);
                            break;
                        case "Softness":
                            this.f36828marial = wireman.marial(jsonReader, impromptuVar);
                            break;
                        default:
                            jsonReader.saran();
                            break;
                    }
                } else {
                    jsonReader.seminary();
                    jsonReader.saran();
                }
            } else {
                strCuirassed = jsonReader.cuirassed();
            }
        }
        jsonReader.cutely();
    }

    public cutely saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        inswinger.saneness sanenessVar;
        inswinger.saneness sanenessVar2;
        inswinger.saneness sanenessVar3;
        inswinger.saneness sanenessVar4;
        while (jsonReader.formularize()) {
            if (jsonReader.polder(f36824beachfront) != 0) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                jsonReader.saneness();
                while (jsonReader.formularize()) {
                    attabal(jsonReader, impromptuVar);
                }
                jsonReader.marial();
            }
        }
        inswinger.attabal attabalVar = this.f36826attabal;
        if (attabalVar == null || (sanenessVar = this.f36829saneness) == null || (sanenessVar2 = this.f36827dern) == null || (sanenessVar3 = this.f36830wireman) == null || (sanenessVar4 = this.f36828marial) == null) {
            return null;
        }
        return new cutely(attabalVar, sanenessVar, sanenessVar2, sanenessVar3, sanenessVar4);
    }
}
