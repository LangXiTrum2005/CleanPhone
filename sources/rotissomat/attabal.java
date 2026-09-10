package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36833attabal = JsonReader.attabal.attabal(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static inswinger.marial attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.saneness();
            while (jsonReader.formularize()) {
                arrayList.add(cord.attabal(jsonReader, impromptuVar));
            }
            jsonReader.marial();
            adultoid.saneness(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.attabal(molybdenite.marial(jsonReader, utwa.arytenoidectomy.marial())));
        }
        return new inswinger.marial(arrayList);
    }

    public static inswinger.kowloon<PointF, PointF> saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        inswinger.marial marialVarAttabal = null;
        inswinger.saneness sanenessVarMarial = null;
        boolean z = false;
        inswinger.saneness sanenessVarMarial2 = null;
        while (jsonReader.restrictive() != JsonReader.Token.END_OBJECT) {
            int iPolder = jsonReader.polder(f36833attabal);
            if (iPolder == 0) {
                marialVarAttabal = attabal(jsonReader, impromptuVar);
            } else if (iPolder != 1) {
                if (iPolder != 2) {
                    jsonReader.seminary();
                    jsonReader.saran();
                } else if (jsonReader.restrictive() == JsonReader.Token.STRING) {
                    jsonReader.saran();
                    z = true;
                } else {
                    sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
                }
            } else if (jsonReader.restrictive() == JsonReader.Token.STRING) {
                jsonReader.saran();
                z = true;
            } else {
                sanenessVarMarial2 = wireman.marial(jsonReader, impromptuVar);
            }
        }
        jsonReader.cutely();
        if (z) {
            impromptuVar.attabal("Lottie doesn't support expressions.");
        }
        return marialVarAttabal != null ? marialVarAttabal : new inswinger.taiyuan(sanenessVarMarial2, sanenessVarMarial);
    }
}
