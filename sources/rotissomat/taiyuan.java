package rotissomat;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: DocumentDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan implements saran<DocumentData> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f36885attabal = new taiyuan();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36886saneness = JsonReader.attabal.attabal("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // rotissomat.saran
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public DocumentData attabal(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.dern();
        DocumentData.Justification justification2 = justification;
        String strCuirassed = null;
        String strCuirassed2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fMonoploid = 0.0f;
        float fMonoploid2 = 0.0f;
        float fMonoploid3 = 0.0f;
        float fMonoploid4 = 0.0f;
        int iDovishness = 0;
        int iWireman = 0;
        int iWireman2 = 0;
        boolean zArytenoidectomy = true;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36886saneness)) {
                case 0:
                    strCuirassed = jsonReader.cuirassed();
                    break;
                case 1:
                    strCuirassed2 = jsonReader.cuirassed();
                    break;
                case 2:
                    fMonoploid = (float) jsonReader.monoploid();
                    break;
                case 3:
                    int iDovishness2 = jsonReader.dovishness();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iDovishness2 <= justification2.ordinal() && iDovishness2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iDovishness2];
                    }
                    break;
                case 4:
                    iDovishness = jsonReader.dovishness();
                    break;
                case 5:
                    fMonoploid2 = (float) jsonReader.monoploid();
                    break;
                case 6:
                    fMonoploid3 = (float) jsonReader.monoploid();
                    break;
                case 7:
                    iWireman = molybdenite.wireman(jsonReader);
                    break;
                case 8:
                    iWireman2 = molybdenite.wireman(jsonReader);
                    break;
                case 9:
                    fMonoploid4 = (float) jsonReader.monoploid();
                    break;
                case 10:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                case 11:
                    jsonReader.saneness();
                    PointF pointF3 = new PointF(((float) jsonReader.monoploid()) * f, ((float) jsonReader.monoploid()) * f);
                    jsonReader.marial();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.saneness();
                    PointF pointF4 = new PointF(((float) jsonReader.monoploid()) * f, ((float) jsonReader.monoploid()) * f);
                    jsonReader.marial();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    break;
            }
        }
        jsonReader.cutely();
        return new DocumentData(strCuirassed, strCuirassed2, fMonoploid, justification2, iDovishness, fMonoploid2, fMonoploid3, iWireman, iWireman2, fMonoploid4, zArytenoidectomy, pointF, pointF2);
    }
}
