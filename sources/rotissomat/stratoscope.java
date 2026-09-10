package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class stratoscope implements saran<PointF> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f36882attabal = new stratoscope();

    @Override // rotissomat.saran
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public PointF attabal(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token tokenRestrictive = jsonReader.restrictive();
        if (tokenRestrictive == JsonReader.Token.BEGIN_ARRAY) {
            return molybdenite.marial(jsonReader, f);
        }
        if (tokenRestrictive == JsonReader.Token.BEGIN_OBJECT) {
            return molybdenite.marial(jsonReader, f);
        }
        if (tokenRestrictive == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.monoploid()) * f, ((float) jsonReader.monoploid()) * f);
            while (jsonReader.formularize()) {
                jsonReader.saran();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenRestrictive);
    }
}
