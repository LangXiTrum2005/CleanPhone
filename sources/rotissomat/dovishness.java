package rotissomat;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final JsonReader.attabal f36844attabal = JsonReader.attabal.attabal("nm", "ind", "refId", "ty", "parent", "sw", b.JSON_KEY_SH, "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final JsonReader.attabal f36846saneness = JsonReader.attabal.attabal(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final JsonReader.attabal f36845dern = JsonReader.attabal.attabal("ty", "nm");

    /* JADX INFO: compiled from: LayerParser.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f36847attabal;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f36847attabal = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36847attabal[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer attabal(com.airbnb.lottie.impromptu impromptuVar) {
        Rect rectSaneness = impromptuVar.saneness();
        List list = Collections.EMPTY_LIST;
        return new Layer(list, impromptuVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new inswinger.triweekly(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectSaneness.width(), rectSaneness.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    public static Layer saneness(JsonReader jsonReader, com.airbnb.lottie.impromptu impromptuVar) throws IOException {
        float f;
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float fValueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.dern();
        boolean z = false;
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float fMonoploid = 0.0f;
        float fBeachfront = 0.0f;
        float fMonoploid2 = 0.0f;
        float fMonoploid3 = 0.0f;
        float fMonoploid4 = 0.0f;
        String strCuirassed = null;
        inswinger.cutely cutelyVarWireman = null;
        inswinger.apical apicalVarAttabal = null;
        inswinger.saneness sanenessVarBeachfront = null;
        euhemerize.attabal attabalVarSaneness = null;
        cutely cutelyVarSaneness = null;
        long jDovishness = 0;
        int iDovishness = 0;
        int iDovishness2 = 0;
        int color = 0;
        boolean zArytenoidectomy = false;
        long jDovishness2 = -1;
        float fMonoploid5 = 1.0f;
        String strCuirassed2 = "UNSET";
        String strCuirassed3 = null;
        inswinger.triweekly triweeklyVar = null;
        Layer.LayerType layerType = null;
        boolean z2 = false;
        while (jsonReader.formularize()) {
            switch (jsonReader.polder(f36844attabal)) {
                case 0:
                    strCuirassed2 = jsonReader.cuirassed();
                    z = false;
                    break;
                case 1:
                    jDovishness = jsonReader.dovishness();
                    z = false;
                    break;
                case 2:
                    strCuirassed = jsonReader.cuirassed();
                    z = false;
                    break;
                case 3:
                    f = fMonoploid5;
                    int iDovishness3 = jsonReader.dovishness();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iDovishness3 < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iDovishness3];
                    }
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 4:
                    jDovishness2 = jsonReader.dovishness();
                    z = false;
                    break;
                case 5:
                    iDovishness = (int) (jsonReader.dovishness() * utwa.arytenoidectomy.marial());
                    z = false;
                    break;
                case 6:
                    iDovishness2 = (int) (jsonReader.dovishness() * utwa.arytenoidectomy.marial());
                    z = false;
                    break;
                case 7:
                    color = Color.parseColor(jsonReader.cuirassed());
                    z = false;
                    break;
                case 8:
                    triweeklyVar = dern.impromptu(jsonReader, impromptuVar);
                    z = false;
                    break;
                case 9:
                    f = fMonoploid5;
                    int iDovishness4 = jsonReader.dovishness();
                    if (iDovishness4 >= Layer.MatteType.values().length) {
                        impromptuVar.attabal("Unsupported matte type: " + iDovishness4);
                    } else {
                        matteType2 = Layer.MatteType.values()[iDovishness4];
                        int i = attabal.f36847attabal[matteType2.ordinal()];
                        if (i == 1) {
                            impromptuVar.attabal("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            impromptuVar.attabal("Unsupported matte type: Luma Inverted");
                        }
                        impromptuVar.polloi(1);
                    }
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 10:
                    f = fMonoploid5;
                    jsonReader.saneness();
                    while (jsonReader.formularize()) {
                        arrayList.add(rotuma.attabal(jsonReader, impromptuVar));
                    }
                    impromptuVar.polloi(arrayList.size());
                    jsonReader.marial();
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 11:
                    f = fMonoploid5;
                    jsonReader.saneness();
                    while (jsonReader.formularize()) {
                        euhemerize.dern dernVarAttabal = impromptu.attabal(jsonReader, impromptuVar);
                        if (dernVarAttabal != null) {
                            arrayList2.add(dernVarAttabal);
                        }
                    }
                    jsonReader.marial();
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 12:
                    f = fMonoploid5;
                    jsonReader.dern();
                    while (jsonReader.formularize()) {
                        int iPolder = jsonReader.polder(f36846saneness);
                        if (iPolder == 0) {
                            cutelyVarWireman = wireman.wireman(jsonReader, impromptuVar);
                        } else if (iPolder != 1) {
                            jsonReader.seminary();
                            jsonReader.saran();
                        } else {
                            jsonReader.saneness();
                            if (jsonReader.formularize()) {
                                apicalVarAttabal = saneness.attabal(jsonReader, impromptuVar);
                            }
                            while (jsonReader.formularize()) {
                                jsonReader.saran();
                            }
                            jsonReader.marial();
                        }
                    }
                    jsonReader.cutely();
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 13:
                    f = fMonoploid5;
                    jsonReader.saneness();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.formularize()) {
                        jsonReader.dern();
                        while (jsonReader.formularize()) {
                            int iPolder2 = jsonReader.polder(f36845dern);
                            if (iPolder2 == 0) {
                                int iDovishness5 = jsonReader.dovishness();
                                if (iDovishness5 == 29) {
                                    attabalVarSaneness = marial.saneness(jsonReader, impromptuVar);
                                } else if (iDovishness5 == 25) {
                                    cutelyVarSaneness = new apical().saneness(jsonReader, impromptuVar);
                                }
                            } else if (iPolder2 != 1) {
                                jsonReader.seminary();
                                jsonReader.saran();
                            } else {
                                arrayList3.add(jsonReader.cuirassed());
                            }
                        }
                        jsonReader.cutely();
                    }
                    jsonReader.marial();
                    impromptuVar.attabal("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 14:
                    fMonoploid5 = (float) jsonReader.monoploid();
                    z = false;
                    break;
                case 15:
                    fMonoploid4 = (float) jsonReader.monoploid();
                    z = false;
                    break;
                case 16:
                    f = fMonoploid5;
                    fMonoploid2 = (float) (jsonReader.monoploid() * ((double) utwa.arytenoidectomy.marial()));
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 17:
                    f = fMonoploid5;
                    fMonoploid3 = (float) (jsonReader.monoploid() * ((double) utwa.arytenoidectomy.marial()));
                    fMonoploid5 = f;
                    z = false;
                    break;
                case 18:
                    fMonoploid = (float) jsonReader.monoploid();
                    break;
                case 19:
                    fBeachfront = (float) jsonReader.monoploid();
                    break;
                case 20:
                    sanenessVarBeachfront = wireman.beachfront(jsonReader, impromptuVar, z);
                    break;
                case 21:
                    strCuirassed3 = jsonReader.cuirassed();
                    break;
                case 22:
                    zArytenoidectomy = jsonReader.arytenoidectomy();
                    break;
                case 23:
                    z2 = jsonReader.dovishness() != 1 ? z : true;
                    break;
                case 24:
                    int iDovishness6 = jsonReader.dovishness();
                    if (iDovishness6 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[iDovishness6];
                    } else {
                        impromptuVar.attabal("Unsupported Blend Mode: " + iDovishness6);
                        lBlendMode2 = LBlendMode.NORMAL;
                    }
                    break;
                default:
                    jsonReader.seminary();
                    jsonReader.saran();
                    f = fMonoploid5;
                    fMonoploid5 = f;
                    z = false;
                    break;
            }
        }
        float f2 = fMonoploid5;
        jsonReader.cutely();
        ArrayList arrayList4 = new ArrayList();
        if (fMonoploid > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList4.add(new com.airbnb.lottie.value.attabal(impromptuVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(fMonoploid)));
        }
        if (fBeachfront <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fBeachfront = impromptuVar.beachfront();
        }
        arrayList4.add(new com.airbnb.lottie.value.attabal(impromptuVar, fValueOf2, fValueOf2, null, fMonoploid, Float.valueOf(fBeachfront)));
        arrayList4.add(new com.airbnb.lottie.value.attabal(impromptuVar, fValueOf, fValueOf, null, fBeachfront, Float.valueOf(Float.MAX_VALUE)));
        if (strCuirassed2.endsWith(".ai") || "ai".equals(strCuirassed3)) {
            impromptuVar.attabal("Convert your Illustrator layers to shape layers.");
        }
        if (z2 != 0) {
            if (triweeklyVar == null) {
                triweeklyVar = new inswinger.triweekly();
            }
            triweeklyVar.arytenoidectomy(z2);
        }
        return new Layer(arrayList2, impromptuVar, strCuirassed2, jDovishness, layerType, jDovishness2, strCuirassed, arrayList, triweeklyVar, iDovishness, iDovishness2, color, f2, fMonoploid4, fMonoploid2, fMonoploid3, cutelyVarWireman, apicalVarAttabal, arrayList4, matteType2, sanenessVarBeachfront, zArytenoidectomy, attabalVarSaneness, cutelyVarSaneness, lBlendMode2);
    }
}
