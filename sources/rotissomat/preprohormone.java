package rotissomat;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: MergePathsParser.java */
/* JADX INFO: loaded from: classes.dex */
public class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36874attabal = JsonReader.attabal.attabal("nm", "mm", "hd");

    public static MergePaths attabal(JsonReader jsonReader) throws IOException {
        String strCuirassed = null;
        boolean zArytenoidectomy = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.formularize()) {
            int iPolder = jsonReader.polder(f36874attabal);
            if (iPolder == 0) {
                strCuirassed = jsonReader.cuirassed();
            } else if (iPolder == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.dovishness());
            } else if (iPolder != 2) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                zArytenoidectomy = jsonReader.arytenoidectomy();
            }
        }
        return new MergePaths(strCuirassed, mergePathsModeForId, zArytenoidectomy);
    }
}
