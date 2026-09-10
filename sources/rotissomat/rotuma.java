package rotissomat;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: MaskParser.java */
/* JADX INFO: loaded from: classes.dex */
public class rotuma {
    public static Mask attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        jsonReader.dern();
        Mask.MaskMode maskMode = null;
        inswinger.impromptu impromptuVarApical = null;
        inswinger.wireman wiremanVarImpromptu = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            String strRotuma = jsonReader.rotuma();
            strRotuma.getClass();
            switch (strRotuma) {
                case "o":
                    wiremanVarImpromptu = wireman.impromptu(jsonReader, impromptuVar);
                    break;
                case "pt":
                    impromptuVarApical = wireman.apical(jsonReader, impromptuVar);
                    break;
                case "inv":
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                case "mode":
                    String strCuirassed = jsonReader.cuirassed();
                    strCuirassed.getClass();
                    switch (strCuirassed) {
                        case "a":
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case "i":
                            impromptuVar.attabal("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            utwa.beachfront.dern("Unknown mask mode " + strRotuma + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.saran();
                    break;
            }
        }
        jsonReader.cutely();
        return new Mask(maskMode, impromptuVarApical, wiremanVarImpromptu, zArytenoidectomy);
    }
}
