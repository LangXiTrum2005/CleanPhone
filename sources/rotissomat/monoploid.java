package rotissomat;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.A5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: GradientStrokeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36868attabal = JsonReader.attabal.attabal("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36870saneness = JsonReader.attabal.attabal(TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_K);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final JsonReader.attabal f36869dern = JsonReader.attabal.attabal(A5.q, "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    public static com.airbnb.lottie.model.content.attabal attabal(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        inswinger.wireman wiremanVar;
        ArrayList arrayList = new ArrayList();
        GradientType gradientType = null;
        String strCuirassed = null;
        inswinger.dern dernVarCompetently = null;
        inswinger.beachfront beachfrontVarTaiyuan = null;
        inswinger.beachfront beachfrontVarTaiyuan2 = null;
        inswinger.saneness sanenessVarMarial = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        inswinger.saneness sanenessVar = null;
        float fMonoploid = 0.0f;
        boolean zArytenoidectomy = false;
        inswinger.wireman wiremanVarImpromptu = null;
        while (jsonReader.formularize()) {
            GradientType gradientType2 = gradientType;
            switch (jsonReader.polder(f36868attabal)) {
                case 0:
                    strCuirassed = jsonReader.cuirassed();
                    gradientType = gradientType2;
                    break;
                case 1:
                    wiremanVar = wiremanVarImpromptu;
                    jsonReader.dern();
                    int iDovishness = -1;
                    while (jsonReader.formularize()) {
                        int iPolder = jsonReader.polder(f36870saneness);
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
                    gradientType = gradientType2;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                case 2:
                    wiremanVarImpromptu = wireman.impromptu(jsonReader, impromptuVar);
                    gradientType = gradientType2;
                    break;
                case 3:
                    wiremanVar = wiremanVarImpromptu;
                    gradientType = jsonReader.dovishness() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                case 4:
                    beachfrontVarTaiyuan = wireman.taiyuan(jsonReader, impromptuVar);
                    gradientType = gradientType2;
                    break;
                case 5:
                    beachfrontVarTaiyuan2 = wireman.taiyuan(jsonReader, impromptuVar);
                    gradientType = gradientType2;
                    break;
                case 6:
                    sanenessVarMarial = wireman.marial(jsonReader, impromptuVar);
                    gradientType = gradientType2;
                    break;
                case 7:
                    wiremanVar = wiremanVarImpromptu;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.dovishness() - 1];
                    gradientType = gradientType2;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                case 8:
                    wiremanVar = wiremanVarImpromptu;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.dovishness() - 1];
                    gradientType = gradientType2;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                case 9:
                    wiremanVar = wiremanVarImpromptu;
                    fMonoploid = (float) jsonReader.monoploid();
                    gradientType = gradientType2;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                case 10:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    gradientType = gradientType2;
                    break;
                case 11:
                    jsonReader.saneness();
                    while (jsonReader.formularize()) {
                        jsonReader.dern();
                        String strCuirassed2 = null;
                        inswinger.saneness sanenessVarMarial2 = null;
                        while (jsonReader.formularize()) {
                            int iPolder2 = jsonReader.polder(f36869dern);
                            if (iPolder2 != 0) {
                                inswinger.wireman wiremanVar2 = wiremanVarImpromptu;
                                if (iPolder2 != 1) {
                                    jsonReader.seminary();
                                    jsonReader.saran();
                                } else {
                                    sanenessVarMarial2 = wireman.marial(jsonReader, impromptuVar);
                                }
                                wiremanVarImpromptu = wiremanVar2;
                            } else {
                                strCuirassed2 = jsonReader.cuirassed();
                            }
                        }
                        inswinger.wireman wiremanVar3 = wiremanVarImpromptu;
                        jsonReader.cutely();
                        if (strCuirassed2.equals("o")) {
                            sanenessVar = sanenessVarMarial2;
                        } else {
                            if (strCuirassed2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) || strCuirassed2.equals("g")) {
                                impromptuVar.adultoid(true);
                                arrayList.add(sanenessVarMarial2);
                            }
                            wiremanVarImpromptu = wiremanVar3;
                        }
                        wiremanVarImpromptu = wiremanVar3;
                    }
                    wiremanVar = wiremanVarImpromptu;
                    jsonReader.marial();
                    if (arrayList.size() == 1) {
                        arrayList.add((inswinger.saneness) arrayList.get(0));
                    }
                    gradientType = gradientType2;
                    wiremanVarImpromptu = wiremanVar;
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    gradientType = gradientType2;
                    break;
            }
        }
        inswinger.wireman wiremanVar4 = wiremanVarImpromptu;
        return new com.airbnb.lottie.model.content.attabal(strCuirassed, gradientType, dernVarCompetently, wiremanVar4 == null ? new inswinger.wireman(Collections.singletonList(new com.airbnb.lottie.value.attabal(100))) : wiremanVar4, beachfrontVarTaiyuan, beachfrontVarTaiyuan2, sanenessVarMarial, lineCapType, lineJoinType, fMonoploid, arrayList, sanenessVar, zArytenoidectomy);
    }
}
