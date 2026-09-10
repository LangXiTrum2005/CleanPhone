package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class supplicat implements saran<euhemerize.taiyuan> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final supplicat f36883attabal = new supplicat();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36884saneness = JsonReader.attabal.attabal("c", "v", "i", "o");

    @Override // rotissomat.saran
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public euhemerize.taiyuan attabal(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.restrictive() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.saneness();
        }
        jsonReader.dern();
        List<PointF> listBeachfront = null;
        List<PointF> listBeachfront2 = null;
        List<PointF> listBeachfront3 = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36884saneness);
            if (iPolder == 0) {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            } else if (iPolder == 1) {
                listBeachfront = molybdenite.beachfront(jsonReader, f);
            } else if (iPolder == 2) {
                listBeachfront2 = molybdenite.beachfront(jsonReader, f);
            } else if (iPolder != 3) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                listBeachfront3 = molybdenite.beachfront(jsonReader, f);
            }
        }
        jsonReader.cutely();
        if (jsonReader.restrictive() == JsonReader.Token.END_ARRAY) {
            jsonReader.marial();
        }
        if (listBeachfront == null || listBeachfront2 == null || listBeachfront3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listBeachfront.isEmpty()) {
            return new euhemerize.taiyuan(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listBeachfront.size();
        PointF pointF = listBeachfront.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listBeachfront.get(i);
            int i2 = i - 1;
            arrayList.add(new lamplit.attabal(utwa.apical.attabal(listBeachfront.get(i2), listBeachfront3.get(i2)), utwa.apical.attabal(pointF2, listBeachfront2.get(i)), pointF2));
        }
        if (zArytenoidectomy) {
            PointF pointF3 = listBeachfront.get(0);
            int i3 = size - 1;
            arrayList.add(new lamplit.attabal(utwa.apical.attabal(listBeachfront.get(i3), listBeachfront3.get(i3)), utwa.apical.attabal(pointF3, listBeachfront2.get(0)), pointF3));
        }
        return new euhemerize.taiyuan(pointF, zArytenoidectomy, arrayList);
    }
}
