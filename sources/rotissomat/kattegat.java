package rotissomat;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes.dex */
public class kattegat implements saran<com.airbnb.lottie.value.wireman> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final kattegat f36861attabal = new kattegat();

    @Override // rotissomat.saran
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.wireman attabal(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.saneness();
        }
        float fMonoploid = (float) jsonReader.monoploid();
        float fMonoploid2 = (float) jsonReader.monoploid();
        while (jsonReader.formularize()) {
            jsonReader.saran();
        }
        if (z) {
            jsonReader.marial();
        }
        return new com.airbnb.lottie.value.wireman((fMonoploid / 100.0f) * f, (fMonoploid2 / 100.0f) * f);
    }
}
