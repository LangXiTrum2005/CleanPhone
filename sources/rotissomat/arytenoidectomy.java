package rotissomat;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: GradientFillParser.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36831attabal = JsonReader.attabal.attabal("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36832saneness = JsonReader.attabal.attabal(TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_K);

    public static euhemerize.marial attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        inswinger.wireman wiremanVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strCuirassed = null;
        GradientType gradientType = null;
        inswinger.dern dernVarCompetently = null;
        inswinger.beachfront beachfrontVarTaiyuan = null;
        inswinger.beachfront beachfrontVarTaiyuan2 = null;
        boolean zArytenoidectomy = false;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36831attabal)) {
                case 0:
                    strCuirassed = jsonReader.cuirassed();
                    break;
                case 1:
                    jsonReader.dern();
                    int iDovishness = -1;
                    while (jsonReader.formularize()) {
                        int iPolder = jsonReader.polder(f36832saneness);
                        if (iPolder == 0) {
                            iDovishness = jsonReader.dovishness();
                        } else if (iPolder != 1) {
                            jsonReader.seminary();
                            jsonReader.saran();
                        } else {
                            dernVarCompetently = wireman.competently(jsonReader, impromptuVar, iDovishness);
                        }
                    }
                    jsonReader.cutely();
                    break;
                case 2:
                    wiremanVar = wireman.impromptu(jsonReader, impromptuVar);
                    break;
                case 3:
                    gradientType = jsonReader.dovishness() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    beachfrontVarTaiyuan = wireman.taiyuan(jsonReader, impromptuVar);
                    break;
                case 5:
                    beachfrontVarTaiyuan2 = wireman.taiyuan(jsonReader, impromptuVar);
                    break;
                case 6:
                    fillType = jsonReader.dovishness() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    break;
            }
        }
        if (wiremanVar == null) {
            wiremanVar = new inswinger.wireman(Collections.singletonList(new com.airbnb.lottie.value.attabal(100)));
        }
        return new euhemerize.marial(strCuirassed, gradientType, fillType, dernVarCompetently, wiremanVar, beachfrontVarTaiyuan, beachfrontVarTaiyuan2, null, null, zArytenoidectomy);
    }
}
