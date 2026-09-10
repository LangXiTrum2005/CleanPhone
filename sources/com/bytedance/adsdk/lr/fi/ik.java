package com.bytedance.adsdk.lr.fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ik(com.bytedance.adsdk.lr.ik.ri.lr lrVar) {
        if (lrVar != null) {
            return lrVar.lr() && ((Float) ((com.bytedance.adsdk.lr.xha.ri) lrVar.ik().get(0)).ri).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean lr(com.bytedance.adsdk.lr.ik.ri.lr lrVar) {
        if (lrVar != null) {
            return lrVar.lr() && ((Float) ((com.bytedance.adsdk.lr.xha.ri) lrVar.ik().get(0)).ri).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    public static com.bytedance.adsdk.lr.ik.ri.co ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi;
        com.bytedance.adsdk.lr.xha xhaVar2 = xhaVar;
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.lr.ik.ri.lr lrVar = null;
        com.bytedance.adsdk.lr.ik.ri.fi fiVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVarLr = null;
        com.bytedance.adsdk.lr.ik.ri.xha xhaVarKa = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi2 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi3 = null;
        com.bytedance.adsdk.lr.ik.ri.ka kaVarLr = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi4 = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi5 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            fiVarRi = ri.ri(jsonReader, xhaVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    xhaVar2 = xhaVar;
                    break;
                case "o":
                    kaVarLr = ka.lr(jsonReader, xhaVar);
                    xhaVar2 = xhaVar;
                    break;
                case "p":
                    awVarLr = ri.lr(jsonReader, xhaVar);
                    xhaVar2 = xhaVar;
                    break;
                case "r":
                    lrVarRi = ka.ri(jsonReader, xhaVar2, false);
                    if (lrVarRi.ik().isEmpty()) {
                        if (((com.bytedance.adsdk.lr.xha.ri) lrVarRi.ik().get(0)).ri == 0) {
                            lrVar = lrVarRi;
                            xhaVar2 = xhaVar;
                        } else {
                            lrVarRi.ik().set(0, new com.bytedance.adsdk.lr.xha.ri(xhaVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(xhaVar.xha())));
                        }
                        break;
                    } else {
                        lrVarRi.ik().add(new com.bytedance.adsdk.lr.xha.ri(xhaVar2, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(xhaVar2.xha())));
                    }
                    xhaVar2 = xhaVar;
                    lrVar = lrVarRi;
                    break;
                case "s":
                    xhaVarKa = ka.ka(jsonReader, xhaVar);
                    break;
                case "eo":
                    lrVarRi5 = ka.ri(jsonReader, xhaVar2, false);
                    break;
                case "rz":
                    xhaVar2.ri("Lottie doesn't support 3D layers.");
                    lrVarRi = ka.ri(jsonReader, xhaVar2, false);
                    if (lrVarRi.ik().isEmpty()) {
                        if (((com.bytedance.adsdk.lr.xha.ri) lrVarRi.ik().get(0)).ri == 0) {
                            lrVar = lrVarRi;
                            xhaVar2 = xhaVar;
                        } else {
                            lrVarRi.ik().set(0, new com.bytedance.adsdk.lr.xha.ri(xhaVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(xhaVar.xha())));
                        }
                        break;
                    } else {
                        lrVarRi.ik().add(new com.bytedance.adsdk.lr.xha.ri(xhaVar2, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(xhaVar2.xha())));
                    }
                    xhaVar2 = xhaVar;
                    lrVar = lrVarRi;
                    break;
                case "sa":
                    lrVarRi3 = ka.ri(jsonReader, xhaVar2, false);
                    break;
                case "sk":
                    lrVarRi2 = ka.ri(jsonReader, xhaVar2, false);
                    break;
                case "so":
                    lrVarRi4 = ka.ri(jsonReader, xhaVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    xhaVar2 = xhaVar;
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new com.bytedance.adsdk.lr.ik.ri.co(ri(fiVarRi) ? null : fiVarRi, ri(awVarLr) ? null : awVarLr, ri(xhaVarKa) ? null : xhaVarKa, ri(lrVar) ? null : lrVar, kaVarLr, lrVarRi4, lrVarRi5, lr(lrVarRi2) ? null : lrVarRi2, ik(lrVarRi3) ? null : lrVarRi3);
    }

    private static boolean ri(com.bytedance.adsdk.lr.ik.ri.fi fiVar) {
        if (fiVar != null) {
            return fiVar.lr() && fiVar.ik().get(0).ri.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    private static boolean ri(com.bytedance.adsdk.lr.ik.ri.aw<PointF, PointF> awVar) {
        if (awVar != null) {
            return !(awVar instanceof com.bytedance.adsdk.lr.ik.ri.jbs) && awVar.lr() && awVar.ik().get(0).ri.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ri(com.bytedance.adsdk.lr.ik.ri.lr lrVar) {
        if (lrVar != null) {
            return lrVar.lr() && ((Float) ((com.bytedance.adsdk.lr.xha.ri) lrVar.ik().get(0)).ri).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ri(com.bytedance.adsdk.lr.ik.ri.xha xhaVar) {
        if (xhaVar != null) {
            return xhaVar.lr() && ((com.bytedance.adsdk.lr.xha.ik) ((com.bytedance.adsdk.lr.xha.ri) xhaVar.ik().get(0)).ri).lr(1.0f, 1.0f);
        }
        return true;
    }
}
