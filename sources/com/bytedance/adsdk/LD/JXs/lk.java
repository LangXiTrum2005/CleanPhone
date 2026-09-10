package com.bytedance.adsdk.LD.JXs;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class lk {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean LD(com.bytedance.adsdk.LD.lk.Lxb.LD ld) {
        if (ld != null) {
            return ld.LD() && ((Float) ((com.bytedance.adsdk.LD.ebl.Lxb) ld.lk().get(0)).Lxb).floatValue() == 0.0f;
        }
        return true;
    }

    public static com.bytedance.adsdk.LD.lk.Lxb.sLN Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.LD.lk.Lxb.LD ld = null;
        com.bytedance.adsdk.LD.lk.Lxb.JXs jXsLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxrLD = null;
        com.bytedance.adsdk.LD.lk.Lxb.ebl eblVarZU = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb2 = null;
        com.bytedance.adsdk.LD.lk.Lxb.ZU zuLD = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb3 = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb4 = null;
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
                            jXsLxb = Lxb.Lxb(jsonReader, eblVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                    break;
                case "o":
                    zuLD = ZU.LD(jsonReader, eblVar);
                    continue;
                    break;
                case "p":
                    nxrLD = Lxb.LD(jsonReader, eblVar);
                    continue;
                    break;
                case "r":
                    break;
                case "s":
                    eblVarZU = ZU.ZU(jsonReader, eblVar);
                    continue;
                    break;
                case "eo":
                    ldLxb4 = ZU.Lxb(jsonReader, eblVar, false);
                    continue;
                    break;
                case "rz":
                    eblVar.Lxb("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    ldLxb2 = ZU.Lxb(jsonReader, eblVar, false);
                    continue;
                    break;
                case "sk":
                    ldLxb = ZU.Lxb(jsonReader, eblVar, false);
                    continue;
                    break;
                case "so":
                    ldLxb3 = ZU.Lxb(jsonReader, eblVar, false);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb5 = ZU.Lxb(jsonReader, eblVar, false);
            if (ldLxb5.lk().isEmpty()) {
                ldLxb5.lk().add(new com.bytedance.adsdk.LD.ebl.Lxb(eblVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(eblVar.ebl())));
            } else if (((com.bytedance.adsdk.LD.ebl.Lxb) ldLxb5.lk().get(0)).Lxb == 0) {
                ldLxb5.lk().set(0, new com.bytedance.adsdk.LD.ebl.Lxb(eblVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(eblVar.ebl())));
            }
            ld = ldLxb5;
        }
        if (z) {
            jsonReader.endObject();
        }
        com.bytedance.adsdk.LD.lk.Lxb.JXs jXs = Lxb(jXsLxb) ? null : jXsLxb;
        if (Lxb(nxrLD)) {
            nxrLD = null;
        }
        return new com.bytedance.adsdk.LD.lk.Lxb.sLN(jXs, nxrLD, Lxb(eblVarZU) ? null : eblVarZU, Lxb(ld) ? null : ld, zuLD, ldLxb3, ldLxb4, LD(ldLxb) ? null : ldLxb, lk(ldLxb2) ? null : ldLxb2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean lk(com.bytedance.adsdk.LD.lk.Lxb.LD ld) {
        if (ld != null) {
            return ld.LD() && ((Float) ((com.bytedance.adsdk.LD.ebl.Lxb) ld.lk().get(0)).Lxb).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean Lxb(com.bytedance.adsdk.LD.lk.Lxb.JXs jXs) {
        if (jXs != null) {
            return jXs.LD() && jXs.lk().get(0).Lxb.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean Lxb(com.bytedance.adsdk.LD.lk.Lxb.NXR<PointF, PointF> nxr) {
        if (nxr != null) {
            return !(nxr instanceof com.bytedance.adsdk.LD.lk.Lxb.QAg) && nxr.LD() && nxr.lk().get(0).Lxb.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean Lxb(com.bytedance.adsdk.LD.lk.Lxb.LD ld) {
        if (ld != null) {
            return ld.LD() && ((Float) ((com.bytedance.adsdk.LD.ebl.Lxb) ld.lk().get(0)).Lxb).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean Lxb(com.bytedance.adsdk.LD.lk.Lxb.ebl eblVar) {
        if (eblVar != null) {
            return eblVar.LD() && ((com.bytedance.adsdk.LD.ebl.lk) ((com.bytedance.adsdk.LD.ebl.Lxb) eblVar.lk().get(0)).Lxb).LD(1.0f, 1.0f);
        }
        return true;
    }
}
