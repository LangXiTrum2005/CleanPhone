package com.bytedance.adsdk.lr.fi;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes2.dex */
public class uq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.uq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[com.bytedance.adsdk.lr.ik.ik.fi.lr.values().length];
            ri = iArr;
            try {
                iArr[com.bytedance.adsdk.lr.ik.ik.fi.lr.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[com.bytedance.adsdk.lr.ik.ik.fi.lr.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.lr.ik.ik.fi ri(com.bytedance.adsdk.lr.xha xhaVar) {
        Rect rectKa = xhaVar.ka();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.lr.ik.ik.fi(list, xhaVar, "__container", -1L, com.bytedance.adsdk.lr.ik.ik.fi.ri.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.lr.ik.ri.co(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectKa.width(), rectKa.height(), null, null, list, com.bytedance.adsdk.lr.ik.ik.fi.lr.NONE, null, false, null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.lr.ik.ik.fi ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar) throws IOException {
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.bytedance.adsdk.lr.ik.ik.fi.lr lrVar = com.bytedance.adsdk.lr.ik.ik.fi.lr.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        com.bytedance.adsdk.lr.ik.ik.fi.lr lrVar2 = lrVar;
        String strNextString = null;
        com.bytedance.adsdk.lr.ik.ri.co coVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.qt qtVarDi = null;
        com.bytedance.adsdk.lr.ik.ri.sf sfVarRi = null;
        com.bytedance.adsdk.lr.ik.ri.lr lrVarRi = null;
        com.bytedance.adsdk.lr.ik.lr.ri riVarRi = null;
        qt qtVarRi = null;
        float fNextDouble = 0.0f;
        float fXha = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        com.bytedance.adsdk.lr.ik.ik.fi.ri riVar = null;
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
                    if (strNextName.equals("h")) {
                        b = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b = 3;
                    }
                    break;
                case 119:
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
                case 3553:
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
                        b = 13;
                    }
                    break;
                case 3679:
                    if (strNextName.equals("sr")) {
                        b = 14;
                    }
                    break;
                case 3681:
                    if (strNextName.equals("st")) {
                        b = 15;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b = ExecutionDataWriter.BLOCK_SESSIONINFO;
                    }
                    break;
                case 3705:
                    if (strNextName.equals("tm")) {
                        b = ExecutionDataWriter.BLOCK_EXECUTIONDATA;
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
                        com.bytedance.adsdk.lr.ik.lr.ik ikVarRi = mj.ri(jsonReader, xhaVar);
                        if (ikVarRi != null) {
                            arrayList2.add(ikVarRi);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.lr.di.di.ri()));
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                sfVarRi = lr.ri(jsonReader, xhaVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                            jsonReader.skipValue();
                        } else {
                            qtVarDi = ka.di(jsonReader, xhaVar);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.lr.di.di.ri()));
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
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    riVarRi = fi.ri(jsonReader, xhaVar);
                                } else if (iNextInt3 == 25) {
                                    qtVarRi = new sf().ri(jsonReader, xhaVar);
                                }
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    xhaVar.ri("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 9:
                    coVarRi = ik.ri(jsonReader, xhaVar);
                    break;
                case 10:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 11:
                    fXha = (float) jsonReader.nextDouble();
                    break;
                case 12:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 13:
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.lr.di.di.ri());
                    break;
                case 14:
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.lr.di.di.ri());
                    break;
                case 17:
                    lrVarRi = ka.ri(jsonReader, xhaVar, false);
                    break;
                case 18:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= com.bytedance.adsdk.lr.ik.ik.fi.lr.values().length) {
                        xhaVar.ri("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                    } else {
                        lrVar2 = com.bytedance.adsdk.lr.ik.ik.fi.lr.values()[iNextInt4];
                        int i = AnonymousClass1.ri[lrVar2.ordinal()];
                        if (i == 1) {
                            xhaVar.ri("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            xhaVar.ri("Unsupported matte type: Luma Inverted");
                        }
                        xhaVar.ri(1);
                    }
                    break;
                case 19:
                    int iNextInt5 = jsonReader.nextInt();
                    riVar = com.bytedance.adsdk.lr.ik.ik.fi.ri.UNKNOWN;
                    if (iNextInt5 < riVar.ordinal()) {
                        riVar = com.bytedance.adsdk.lr.ik.ik.fi.ri.values()[iNextInt5];
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
                        arrayList.add(ay.ri(jsonReader, xhaVar));
                    }
                    xhaVar.ri(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList4.add(new com.bytedance.adsdk.lr.xha.ri(xhaVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(fNextDouble)));
        }
        if (fXha <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fXha = xhaVar.xha();
        }
        arrayList4.add(new com.bytedance.adsdk.lr.xha.ri(xhaVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fXha)));
        arrayList4.add(new com.bytedance.adsdk.lr.xha.ri(xhaVar, fValueOf, fValueOf, null, fXha, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            xhaVar.ri("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.lr.ik.ik.fi(arrayList2, xhaVar, strNextString2, jNextInt, riVar, jNextInt2, strNextString, arrayList, coVarRi, iNextInt, iNextInt2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, qtVarDi, sfVarRi, arrayList4, lrVar2, lrVarRi, zNextBoolean, riVarRi, qtVarRi);
    }
}
