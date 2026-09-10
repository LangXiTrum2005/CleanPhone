package rotissomat;

import android.graphics.Rect;
import androidx.collection.overspeculate;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes.dex */
public class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36849attabal = JsonReader.attabal.attabal("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static JsonReader.attabal f36851saneness = JsonReader.attabal.attabal("id", "layers", "w", "h", TtmlNode.TAG_P, "u");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final JsonReader.attabal f36850dern = JsonReader.attabal.attabal("list");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final JsonReader.attabal f36852wireman = JsonReader.attabal.attabal("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static com.airbnb.lottie.impromptu attabal(JsonReader jsonReader) throws IOException {
        jsonReader = jsonReader;
        float fMarial = utwa.arytenoidectomy.marial();
        androidx.collection.gintrap<Layer> gintrapVar = new androidx.collection.gintrap<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        overspeculate<lamplit.dern> overspeculateVar = new overspeculate<>();
        com.airbnb.lottie.impromptu impromptuVar = new com.airbnb.lottie.impromptu();
        jsonReader.dern();
        float fMonoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fMonoploid2 = 0.0f;
        float fMonoploid3 = 0.0f;
        int iMonoploid = 0;
        int iMonoploid2 = 0;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36849attabal)) {
                case 0:
                    iMonoploid2 = (int) jsonReader.monoploid();
                    fMarial = fMarial;
                    break;
                case 1:
                    iMonoploid = (int) jsonReader.monoploid();
                    fMarial = fMarial;
                    break;
                case 2:
                    fMonoploid = (float) jsonReader.monoploid();
                    fMarial = fMarial;
                    break;
                case 3:
                    fMonoploid2 = ((float) jsonReader.monoploid()) - 0.01f;
                    fMarial = fMarial;
                    break;
                case 4:
                    fMonoploid3 = (float) jsonReader.monoploid();
                    fMarial = fMarial;
                    break;
                case 5:
                    String[] strArrSplit = jsonReader.cuirassed().split("\\.");
                    if (!utwa.arytenoidectomy.cutely(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        impromptuVar.attabal("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    marial(jsonReader, impromptuVar, arrayList, gintrapVar);
                    break;
                case 7:
                    saneness(jsonReader, impromptuVar, map, map2);
                    break;
                case 8:
                    wireman(jsonReader, map3);
                    break;
                case 9:
                    dern(jsonReader, impromptuVar, overspeculateVar);
                    break;
                case 10:
                    beachfront(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    break;
            }
        }
        float f = fMarial;
        impromptuVar.molybdenite(new Rect(0, 0, (int) (iMonoploid2 * f), (int) (iMonoploid * f)), fMonoploid, fMonoploid2, fMonoploid3, arrayList, gintrapVar, map, map2, utwa.arytenoidectomy.marial(), overspeculateVar, map3, arrayList2, iMonoploid2, iMonoploid);
        return impromptuVar;
    }

    public static void beachfront(JsonReader jsonReader, List<lamplit.competently> list) throws IOException {
        jsonReader.saneness();
        while (jsonReader.formularize()) {
            jsonReader.dern();
            float fMonoploid = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String strCuirassed = null;
            float fMonoploid2 = 0.0f;
            while (jsonReader.formularize()) {
                int iPolder = jsonReader.polder(f36852wireman);
                if (iPolder == 0) {
                    strCuirassed = jsonReader.cuirassed();
                } else if (iPolder == 1) {
                    fMonoploid = (float) jsonReader.monoploid();
                } else if (iPolder != 2) {
                    jsonReader.seminary();
                    jsonReader.saran();
                } else {
                    fMonoploid2 = (float) jsonReader.monoploid();
                }
            }
            jsonReader.cutely();
            list.add(new lamplit.competently(strCuirassed, fMonoploid, fMonoploid2));
        }
        jsonReader.marial();
    }

    public static void dern(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, overspeculate<lamplit.dern> overspeculateVar) throws IOException {
        jsonReader.saneness();
        while (jsonReader.formularize()) {
            lamplit.dern dernVarAttabal = impassible.attabal(jsonReader, impromptuVar);
            overspeculateVar.apical(dernVarAttabal.hashCode(), dernVarAttabal);
        }
        jsonReader.marial();
    }

    public static void marial(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, List<Layer> list, androidx.collection.gintrap<Layer> gintrapVar) throws IOException {
        jsonReader.saneness();
        int i = 0;
        while (jsonReader.formularize()) {
            Layer layerSaneness = dovishness.saneness(jsonReader, impromptuVar);
            if (layerSaneness.competently() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(layerSaneness);
            gintrapVar.taiyuan(layerSaneness.marial(), layerSaneness);
            if (i > 4) {
                utwa.beachfront.dern("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.marial();
    }

    public static void saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar, Map<String, List<Layer>> map, Map<String, com.airbnb.lottie.seminary> map2) throws IOException {
        jsonReader.saneness();
        while (jsonReader.formularize()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.gintrap gintrapVar = new androidx.collection.gintrap();
            jsonReader.dern();
            int iDovishness = 0;
            int iDovishness2 = 0;
            String strCuirassed = null;
            String strCuirassed2 = null;
            String strCuirassed3 = null;
            while (jsonReader.formularize()) {
                int iPolder = jsonReader.polder(f36851saneness);
                if (iPolder == 0) {
                    strCuirassed = jsonReader.cuirassed();
                } else if (iPolder == 1) {
                    jsonReader.saneness();
                    while (jsonReader.formularize()) {
                        Layer layerSaneness = dovishness.saneness(jsonReader, impromptuVar);
                        gintrapVar.taiyuan(layerSaneness.marial(), layerSaneness);
                        arrayList.add(layerSaneness);
                    }
                    jsonReader.marial();
                } else if (iPolder == 2) {
                    iDovishness = jsonReader.dovishness();
                } else if (iPolder == 3) {
                    iDovishness2 = jsonReader.dovishness();
                } else if (iPolder == 4) {
                    strCuirassed2 = jsonReader.cuirassed();
                } else if (iPolder != 5) {
                    jsonReader.seminary();
                    jsonReader.saran();
                } else {
                    strCuirassed3 = jsonReader.cuirassed();
                }
            }
            jsonReader.cutely();
            if (strCuirassed2 != null) {
                com.airbnb.lottie.seminary seminaryVar = new com.airbnb.lottie.seminary(iDovishness, iDovishness2, strCuirassed, strCuirassed2, strCuirassed3);
                map2.put(seminaryVar.marial(), seminaryVar);
            } else {
                map.put(strCuirassed, arrayList);
            }
        }
        jsonReader.marial();
    }

    public static void wireman(JsonReader jsonReader, Map<String, lamplit.saneness> map) throws IOException {
        jsonReader.dern();
        while (jsonReader.formularize()) {
            if (jsonReader.polder(f36850dern) != 0) {
                jsonReader.seminary();
                jsonReader.saran();
            } else {
                jsonReader.saneness();
                while (jsonReader.formularize()) {
                    lamplit.saneness sanenessVarAttabal = triweekly.attabal(jsonReader);
                    map.put(sanenessVarAttabal.saneness(), sanenessVarAttabal);
                }
                jsonReader.marial();
            }
        }
        jsonReader.cutely();
    }
}
