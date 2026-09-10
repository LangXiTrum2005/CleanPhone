package rotissomat;

import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: AnimatableTextPropertiesParser.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36876attabal = JsonReader.attabal.attabal("s", "a");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36878saneness = JsonReader.attabal.attabal("s", "e", "o", "r");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final JsonReader.attabal f36877dern = JsonReader.attabal.attabal("fc", "sc", "sw", "t", "o");

    public static inswinger.apical attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        inswinger.impassible impassibleVarDern = null;
        inswinger.formularize formularizeVarSaneness = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36876attabal);
            if (iPolder == 0) {
                formularizeVarSaneness = saneness(jsonReader, impromptuVar);
            } else if (iPolder != 1) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                impassibleVarDern = dern(jsonReader, impromptuVar);
            }
        }
        jsonReader.cutely();
        return new inswinger.apical(impassibleVarDern, formularizeVarSaneness);
    }

    public static inswinger.impassible dern(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        inswinger.attabal attabalVarDern = null;
        inswinger.attabal attabalVarDern2 = null;
        inswinger.saneness sanenessVarMarial = null;
        inswinger.saneness sanenessVarMarial2 = null;
        inswinger.wireman wiremanVarImpromptu = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36877dern);
            if (iPolder == 0) {
                attabalVarDern = wireman.dern(jsonReader, impromptuVar);
            } else if (iPolder == 1) {
                attabalVarDern2 = wireman.dern(jsonReader, impromptuVar);
            } else if (iPolder == 2) {
                sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
            } else if (iPolder == 3) {
                sanenessVarMarial2 = wireman.marial(jsonReader, impromptuVar);
            } else if (iPolder != 4) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                wiremanVarImpromptu = wireman.impromptu(jsonReader, impromptuVar);
            }
        }
        jsonReader.cutely();
        return new inswinger.impassible(attabalVarDern, attabalVarDern2, sanenessVarMarial, sanenessVarMarial2, wiremanVarImpromptu);
    }

    public static inswinger.formularize saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        inswinger.wireman wiremanVar = null;
        inswinger.wireman wiremanVarImpromptu = null;
        inswinger.wireman wiremanVarImpromptu2 = null;
        TextRangeUnits textRangeUnits = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36878saneness);
            if (iPolder == 0) {
                wiremanVar = wireman.impromptu(jsonReader, impromptuVar);
            } else if (iPolder == 1) {
                wiremanVarImpromptu = wireman.impromptu(jsonReader, impromptuVar);
            } else if (iPolder == 2) {
                wiremanVarImpromptu2 = wireman.impromptu(jsonReader, impromptuVar);
            } else if (iPolder != 3) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                int iDovishness = jsonReader.dovishness();
                if (iDovishness == 1 || iDovishness == 2) {
                    textRangeUnits = iDovishness == 1 ? TextRangeUnits.PERCENT : TextRangeUnits.INDEX;
                } else {
                    impromptuVar.attabal("Unsupported text range units: " + iDovishness);
                    textRangeUnits = TextRangeUnits.INDEX;
                }
            }
        }
        jsonReader.cutely();
        if (wiremanVar == null && wiremanVarImpromptu != null) {
            wiremanVar = new inswinger.wireman(Collections.singletonList(new com.airbnb.lottie.value.attabal(0)));
        }
        return new inswinger.formularize(wiremanVar, wiremanVarImpromptu, wiremanVarImpromptu2, textRangeUnits);
    }
}
