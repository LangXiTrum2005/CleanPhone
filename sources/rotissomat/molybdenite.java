package rotissomat;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36866attabal = JsonReader.attabal.attabal("x", "y");

    /* JADX INFO: compiled from: JsonUtils.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f36867attabal;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f36867attabal = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36867attabal[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36867attabal[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF attabal(JsonReader jsonReader, float f) throws IOException {
        jsonReader.saneness();
        float fMonoploid = (float) jsonReader.monoploid();
        float fMonoploid2 = (float) jsonReader.monoploid();
        while (jsonReader.restrictive() != JsonReader.Token.END_ARRAY) {
            jsonReader.saran();
        }
        jsonReader.marial();
        return new PointF(fMonoploid * f, fMonoploid2 * f);
    }

    public static List<PointF> beachfront(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.saneness();
        while (jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.saneness();
            arrayList.add(marial(jsonReader, f));
            jsonReader.marial();
        }
        jsonReader.marial();
        return arrayList;
    }

    public static float competently(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenRestrictive = jsonReader.restrictive();
        int i = attabal.f36867attabal[tokenRestrictive.ordinal()];
        if (i == 1) {
            return (float) jsonReader.monoploid();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenRestrictive);
        }
        jsonReader.saneness();
        float fMonoploid = (float) jsonReader.monoploid();
        while (jsonReader.formularize()) {
            jsonReader.saran();
        }
        jsonReader.marial();
        return fMonoploid;
    }

    public static PointF dern(JsonReader jsonReader, float f) throws IOException {
        jsonReader.dern();
        float fCompetently = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fCompetently2 = 0.0f;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36866attabal);
            if (iPolder == 0) {
                fCompetently = competently(jsonReader);
            } else if (iPolder != 1) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                fCompetently2 = competently(jsonReader);
            }
        }
        jsonReader.cutely();
        return new PointF(fCompetently * f, fCompetently2 * f);
    }

    public static PointF marial(JsonReader jsonReader, float f) throws IOException {
        int i = attabal.f36867attabal[jsonReader.restrictive().ordinal()];
        if (i == 1) {
            return saneness(jsonReader, f);
        }
        if (i == 2) {
            return attabal(jsonReader, f);
        }
        if (i == 3) {
            return dern(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.restrictive());
    }

    public static PointF saneness(JsonReader jsonReader, float f) throws IOException {
        float fMonoploid = (float) jsonReader.monoploid();
        float fMonoploid2 = (float) jsonReader.monoploid();
        while (jsonReader.formularize()) {
            jsonReader.saran();
        }
        return new PointF(fMonoploid * f, fMonoploid2 * f);
    }

    public static int wireman(JsonReader jsonReader) throws IOException {
        jsonReader.saneness();
        int iMonoploid = (int) (jsonReader.monoploid() * 255.0d);
        int iMonoploid2 = (int) (jsonReader.monoploid() * 255.0d);
        int iMonoploid3 = (int) (jsonReader.monoploid() * 255.0d);
        while (jsonReader.formularize()) {
            jsonReader.saran();
        }
        jsonReader.marial();
        return Color.argb(255, iMonoploid, iMonoploid2, iMonoploid3);
    }
}
