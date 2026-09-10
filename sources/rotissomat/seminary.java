package rotissomat;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: ShapeStrokeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36880attabal = JsonReader.attabal.attabal("nm", "c", "w", "o", "lc", "lj", "ml", "hd", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36881saneness = JsonReader.attabal.attabal(A5.q, "v");

    /* JADX WARN: Multi-variable type inference failed */
    public static ShapeStroke attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strCuirassed = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        Object obj = null;
        inswinger.attabal attabalVarDern = null;
        inswinger.saneness sanenessVarMarial = null;
        String str = null;
        float fMonoploid = 0.0f;
        boolean zArytenoidectomy = false;
        inswinger.wireman wiremanVar = null;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36880attabal)) {
                case 0:
                    strCuirassed = jsonReader.cuirassed();
                    break;
                case 1:
                    attabalVarDern = wireman.dern(jsonReader, impromptuVar);
                    break;
                case 2:
                    sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
                    break;
                case 3:
                    wiremanVar = wireman.impromptu(jsonReader, impromptuVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.dovishness() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.dovishness() - 1];
                    break;
                case 6:
                    fMonoploid = (float) jsonReader.monoploid();
                    break;
                case 7:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                case 8:
                    jsonReader.saneness();
                    while (jsonReader.formularize()) {
                        jsonReader.dern();
                        String strCuirassed2 = str;
                        Object objMarial = strCuirassed2;
                        while (jsonReader.formularize()) {
                            int iPolder = jsonReader.polder(f36881saneness);
                            if (iPolder == 0) {
                                strCuirassed2 = jsonReader.cuirassed();
                            } else if (iPolder != 1) {
                                jsonReader.seminary();
                                jsonReader.saran();
                            } else {
                                objMarial = wireman.marial(jsonReader, impromptuVar);
                            }
                        }
                        jsonReader.cutely();
                        strCuirassed2.getClass();
                        switch (strCuirassed2) {
                            case "d":
                            case "g":
                                impromptuVar.adultoid(true);
                                arrayList.add(objMarial);
                                break;
                            case "o":
                                obj = objMarial;
                                break;
                        }
                        str = null;
                    }
                    jsonReader.marial();
                    if (arrayList.size() == 1) {
                        arrayList.add((inswinger.saneness) arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.saran();
                    continue;
            }
            str = null;
        }
        if (wiremanVar == null) {
            wiremanVar = new inswinger.wireman(Collections.singletonList(new com.airbnb.lottie.value.attabal(100)));
        }
        if (lineCapType == null) {
            lineCapType = ShapeStroke.LineCapType.BUTT;
        }
        if (lineJoinType == null) {
            lineJoinType = ShapeStroke.LineJoinType.MITER;
        }
        return new ShapeStroke(strCuirassed, obj, arrayList, attabalVarDern, wiremanVar, sanenessVarMarial, lineCapType, lineJoinType, fMonoploid, zArytenoidectomy);
    }
}
