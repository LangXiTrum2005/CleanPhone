package rotissomat;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class competently implements saran<Integer> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final competently f36835attabal = new competently();

    @Override // rotissomat.saran
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public Integer attabal(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.saneness();
        }
        double dMonoploid = jsonReader.monoploid();
        double dMonoploid2 = jsonReader.monoploid();
        double dMonoploid3 = jsonReader.monoploid();
        double dMonoploid4 = jsonReader.restrictive() == JsonReader.Token.NUMBER ? jsonReader.monoploid() : 1.0d;
        if (z) {
            jsonReader.marial();
        }
        if (dMonoploid <= 1.0d && dMonoploid2 <= 1.0d && dMonoploid3 <= 1.0d) {
            dMonoploid *= 255.0d;
            dMonoploid2 *= 255.0d;
            dMonoploid3 *= 255.0d;
            if (dMonoploid4 <= 1.0d) {
                dMonoploid4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMonoploid4, (int) dMonoploid, (int) dMonoploid2, (int) dMonoploid3));
    }
}
