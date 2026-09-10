package com.bytedance.adsdk.LD.JXs;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.badlogic.gdx.graphics.GL20;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class HD {

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.JXs.HD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.LD.lk.lk.JXs.LD.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.LD.lk.lk.JXs.LD.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.LD.lk.lk.JXs.LD.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.LD.lk.lk.JXs Lxb(com.bytedance.adsdk.LD.ebl eblVar) {
        Rect rectZU = eblVar.ZU();
        return new com.bytedance.adsdk.LD.lk.lk.JXs(Collections.emptyList(), eblVar, "__container", -1L, com.bytedance.adsdk.LD.lk.lk.JXs.Lxb.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.LD.lk.Lxb.sLN(), 0, 0, 0, 0.0f, 0.0f, rectZU.width(), rectZU.height(), null, null, Collections.emptyList(), com.bytedance.adsdk.LD.lk.lk.JXs.LD.NONE, null, false, null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.LD.lk.lk.JXs Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar) throws IOException {
        com.bytedance.adsdk.LD.lk.lk.JXs.LD ld = com.bytedance.adsdk.LD.lk.lk.JXs.LD.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.bytedance.adsdk.LD.lk.lk.JXs.LD ld2 = ld;
        com.bytedance.adsdk.LD.lk.lk.JXs.Lxb lxb = null;
        String strNextString = null;
        com.bytedance.adsdk.LD.lk.Lxb.sLN slnLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.nBu nbuLc = null;
        com.bytedance.adsdk.LD.lk.Lxb.JVA jvaLxb = null;
        com.bytedance.adsdk.LD.lk.Lxb.LD ldLxb = null;
        com.bytedance.adsdk.LD.lk.LD.Lxb Lxb = null;
        nBu nbuLxb = null;
        long jNextInt = 0;
        long jNextInt2 = -1;
        float fNextDouble = 0.0f;
        int iLxb = 0;
        int iLxb2 = 0;
        int color = 0;
        float fNextDouble2 = 1.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float fNextDouble5 = 0.0f;
        boolean zNextBoolean = false;
        float fEbl = 0.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -995424086:
                    if (strNextName.equals("parent")) {
                        b = 0;
                    }
                    break;
                case -903568142:
                    if (strNextName.equals("shapes")) {
                        b = 1;
                    }
                    break;
                case 104:
                    if (strNextName.equals(bc.aM)) {
                        b = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals(bc.aO)) {
                        b = 3;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (strNextName.equals("w")) {
                        b = 4;
                    }
                    break;
                case 3177:
                    if (strNextName.equals("cl")) {
                        b = 5;
                    }
                    break;
                case 3233:
                    if (strNextName.equals("ef")) {
                        b = 6;
                    }
                    break;
                case 3324:
                    if (strNextName.equals("hd")) {
                        b = 7;
                    }
                    break;
                case 3367:
                    if (strNextName.equals("ip")) {
                        b = 8;
                    }
                    break;
                case 3432:
                    if (strNextName.equals("ks")) {
                        b = 9;
                    }
                    break;
                case 3519:
                    if (strNextName.equals("nm")) {
                        b = 10;
                    }
                    break;
                case GL20.GL_TEXTURE_2D /* 3553 */:
                    if (strNextName.equals("op")) {
                        b = 11;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        b = 12;
                    }
                    break;
                case 3669:
                    if (strNextName.equals(b.JSON_KEY_SH)) {
                        b = cw.k;
                    }
                    break;
                case 3679:
                    if (strNextName.equals("sr")) {
                        b = cw.l;
                    }
                    break;
                case 3681:
                    if (strNextName.equals("st")) {
                        b = cw.m;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b = cw.n;
                    }
                    break;
                case 3705:
                    if (strNextName.equals("tm")) {
                        b = 17;
                    }
                    break;
                case 3712:
                    if (strNextName.equals(TtmlNode.TAG_TT)) {
                        b = 18;
                    }
                    break;
                case 3717:
                    if (strNextName.equals("ty")) {
                        b = 19;
                    }
                    break;
                case 104415:
                    if (strNextName.equals("ind")) {
                        b = 20;
                    }
                    break;
                case 108390670:
                    if (strNextName.equals("refId")) {
                        b = 21;
                    }
                    break;
                case 1441620890:
                    if (strNextName.equals("masksProperties")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.LD.lk.LD.lk lkVarLxb = OY.Lxb(jsonReader, eblVar);
                        if (lkVarLxb != null) {
                            arrayList2.add(lkVarLxb);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    fNextDouble5 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.LD.lc.lc.Lxb()));
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jvaLxb = LD.Lxb(jsonReader, eblVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                            jsonReader.skipValue();
                        } else {
                            nbuLc = ZU.lc(jsonReader, eblVar);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    fNextDouble4 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.LD.lc.lc.Lxb()));
                    break;
                case 5:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 6:
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (!strNextName3.equals("ty")) {
                                jsonReader.skipValue();
                            } else {
                                int iNextInt = jsonReader.nextInt();
                                if (iNextInt == 29) {
                                    Lxb = JXs.Lxb(jsonReader, eblVar);
                                } else if (iNextInt == 25) {
                                    nbuLxb = new JVA().Lxb(jsonReader, eblVar);
                                }
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    eblVar.Lxb("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 9:
                    slnLxb = lk.Lxb(jsonReader, eblVar);
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 11:
                    fEbl = (float) jsonReader.nextDouble();
                    break;
                case 12:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 13:
                    iLxb2 = (int) (com.bytedance.adsdk.LD.lc.lc.Lxb() * jsonReader.nextInt());
                    break;
                case 14:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    iLxb = (int) (com.bytedance.adsdk.LD.lc.lc.Lxb() * jsonReader.nextInt());
                    break;
                case 17:
                    ldLxb = ZU.Lxb(jsonReader, eblVar, false);
                    break;
                case 18:
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 >= com.bytedance.adsdk.LD.lk.lk.JXs.LD.values().length) {
                        eblVar.Lxb("Unsupported matte type: ".concat(String.valueOf(iNextInt2)));
                    } else {
                        ld2 = com.bytedance.adsdk.LD.lk.lk.JXs.LD.values()[iNextInt2];
                        int i = AnonymousClass1.Lxb[ld2.ordinal()];
                        if (i == 1) {
                            eblVar.Lxb("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            eblVar.Lxb("Unsupported matte type: Luma Inverted");
                        }
                        eblVar.Lxb(1);
                    }
                    break;
                case 19:
                    int iNextInt3 = jsonReader.nextInt();
                    lxb = com.bytedance.adsdk.LD.lk.lk.JXs.Lxb.UNKNOWN;
                    if (iNextInt3 < lxb.ordinal()) {
                        lxb = com.bytedance.adsdk.LD.lk.lk.JXs.Lxb.values()[iNextInt3];
                    }
                    break;
                case 20:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 21:
                    strNextString = jsonReader.nextString();
                    break;
                case 22:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(aH.Lxb(jsonReader, eblVar));
                    }
                    eblVar.Lxb(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.LD.ebl.Lxb(eblVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (fEbl <= 0.0f) {
            fEbl = eblVar.ebl();
        }
        arrayList4.add(new com.bytedance.adsdk.LD.ebl.Lxb(eblVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fEbl)));
        arrayList4.add(new com.bytedance.adsdk.LD.ebl.Lxb(eblVar, fValueOf, fValueOf, null, fEbl, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            eblVar.Lxb("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.LD.lk.lk.JXs(arrayList2, eblVar, strNextString2, jNextInt, lxb, jNextInt2, strNextString, arrayList, slnLxb, iLxb, iLxb2, color, fNextDouble2, fNextDouble3, fNextDouble4, fNextDouble5, nbuLc, jvaLxb, arrayList4, ld2, ldLxb, zNextBoolean, Lxb, nbuLxb);
    }
}
