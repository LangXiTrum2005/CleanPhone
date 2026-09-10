package com.bytedance.adsdk.ud.mzz;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.smartdigimkt.d2.a;
import com.smartdigimkt.m3.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ljh {
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    private static JSONArray lnr(JsonReader jsonReader) {
        byte b2;
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals("hd")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (b2 != 1) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    private static List<com.bytedance.adsdk.ud.to.qdl> mml(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.ud.to.qdl qdlVar = new com.bytedance.adsdk.ud.to.qdl();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    switch (jsonReader.nextName()) {
                        case "l":
                            qdlVar.qdl = jsonReader.nextInt();
                            break;
                        case "le":
                            qdlVar.ud = jsonReader.nextInt();
                            break;
                        case "s":
                            qdlVar.mzz = jsonReader.nextInt();
                            break;
                        case "c":
                            qdlVar.lnr = jsonReader.nextString();
                            break;
                        case "f":
                            qdlVar.mml = jsonReader.nextString();
                            break;
                        case "bs":
                            qdlVar.mo = jsonReader.nextInt();
                            break;
                        case "ali":
                            qdlVar.wd = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(qdlVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static com.bytedance.adsdk.ud.wd qdl(JsonReader jsonReader) throws IOException {
        float f;
        com.bytedance.adsdk.ud.wd.lnr lnrVar;
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.ud.wd.lnr lnrVar2 = new com.bytedance.adsdk.ud.wd.lnr();
        com.bytedance.adsdk.ud.wd.qdl qdlVar = new com.bytedance.adsdk.ud.wd.qdl();
        com.bytedance.adsdk.ud.wd.ud udVar = new com.bytedance.adsdk.ud.wd.ud();
        com.bytedance.adsdk.ud.wd wdVar = new com.bytedance.adsdk.ud.wd();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        String strNextString = null;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            fQdl = fQdl;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b2 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f = fNextDouble;
                    if (strNextName.equals("assets")) {
                        b2 = 0;
                    }
                    break;
                case -1109732030:
                    f = fNextDouble;
                    if (strNextName.equals("layers")) {
                        b2 = 1;
                    }
                    break;
                case -865448777:
                    f = fNextDouble;
                    if (strNextName.equals("globalEvent")) {
                        b2 = 2;
                    }
                    break;
                case 104:
                    f = fNextDouble;
                    if (strNextName.equals(h.f36614b)) {
                        b2 = 3;
                    }
                    break;
                case 118:
                    f = fNextDouble;
                    if (strNextName.equals("v")) {
                        b2 = 4;
                    }
                    break;
                case 119:
                    f = fNextDouble;
                    if (strNextName.equals("w")) {
                        b2 = 5;
                    }
                    break;
                case 3208:
                    f = fNextDouble;
                    if (strNextName.equals("dl")) {
                        b2 = 6;
                    }
                    break;
                case 3276:
                    f = fNextDouble;
                    if (strNextName.equals(a.W)) {
                        b2 = 7;
                    }
                    break;
                case 3292:
                    f = fNextDouble;
                    if (strNextName.equals("gc")) {
                        b2 = 8;
                    }
                    break;
                case 3367:
                    f = fNextDouble;
                    if (strNextName.equals("ip")) {
                        b2 = 9;
                    }
                    break;
                case 3553:
                    f = fNextDouble;
                    if (strNextName.equals("op")) {
                        b2 = 10;
                    }
                    break;
                case 94623709:
                    f = fNextDouble;
                    if (strNextName.equals("chars")) {
                        b2 = 11;
                    }
                    break;
                case 97615364:
                    f = fNextDouble;
                    if (strNextName.equals("fonts")) {
                        b2 = 12;
                    }
                    break;
                case 110364485:
                    f = fNextDouble;
                    if (strNextName.equals("timer")) {
                        b2 = 13;
                    }
                    break;
                case 839250809:
                    f = fNextDouble;
                    if (strNextName.equals("markers")) {
                        b2 = 14;
                    }
                    break;
                default:
                    f = fNextDouble;
                    break;
            }
            switch (b2) {
                case 0:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, wdVar, map, map2);
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 1:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, wdVar, arrayList, longSparseArray);
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 2:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, udVar);
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f;
                    break;
                case 4:
                    lnrVar = lnrVar2;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.ud.mo.mo.qdl(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        wdVar.qdl("Lottie only supports bodymovin >= 4.4.0");
                    }
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f;
                    break;
                case 7:
                    lnrVar = lnrVar2;
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 8:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, qdlVar);
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 9:
                    lnrVar2 = lnrVar2;
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    lnrVar = lnrVar2;
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 11:
                    qdl(jsonReader, wdVar, sparseArray);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 12:
                    qdl(jsonReader, map3);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 13:
                    qdl(jsonReader, lnrVar2);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                case 14:
                    qdl(jsonReader, arrayList2);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
                default:
                    jsonReader.skipValue();
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fNextDouble = f;
                    break;
            }
        }
        float f2 = fQdl;
        jsonReader.endObject();
        wdVar.qdl(new Rect(0, 0, (int) (iNextInt2 * f2), (int) (iNextInt * f2)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, lnrVar2, strNextString, qdlVar, udVar);
        return wdVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    private static void ud(JsonReader jsonReader, com.bytedance.adsdk.ud.wd.qdl qdlVar) {
        byte b2;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals(a.W)) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    qdlVar.mzz = jsonReader.nextInt();
                } else if (b2 == 1) {
                    qdlVar.mo = jsonReader.nextString();
                } else if (b2 != 2) {
                    jsonReader.skipValue();
                } else {
                    qdlVar.wd = lnr(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static Map<String, Object> ud(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", lnr(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd.ud udVar) {
        byte b2;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals("lel")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    udVar.ud = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i2 = 0; i2 < 2; i2++) {
                            if (jsonReader.hasNext()) {
                                udVar.ud[0][i2] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b2 == 1) {
                    udVar.qdl = jsonReader.nextString();
                } else if (b2 != 2) {
                    jsonReader.skipValue();
                } else {
                    udVar.lnr = lnr(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd.qdl qdlVar) {
        byte b2;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strNextName.equals("se")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                        } else if (strNextName.equals("pc")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    qdlVar.qdl = jsonReader.nextInt();
                } else if (b2 == 1) {
                    qdlVar.ud = ud(jsonReader);
                } else if (b2 == 2) {
                    qdlVar.lnr = ud(jsonReader);
                } else if (b2 == 3) {
                    qdlVar.mml = jsonReader.nextInt();
                } else if (b2 != 4) {
                    jsonReader.skipValue();
                } else {
                    ud(jsonReader, qdlVar);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd.lnr lnrVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "ke":
                        lnrVar.qdl = jsonReader.nextInt();
                        break;
                    case "id":
                        lnrVar.ud = jsonReader.nextString();
                        break;
                    case "tl":
                        lnrVar.lnr = jsonReader.nextString();
                        break;
                    case "at":
                        lnrVar.mml = jsonReader.nextString();
                        break;
                    case "inel":
                        lnrVar.mzz = new int[]{-1, -1};
                        jsonReader.beginArray();
                        for (int i2 = 0; i2 < 2; i2++) {
                            if (jsonReader.hasNext()) {
                                lnrVar.mzz[i2] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                        break;
                    case "el":
                        lnrVar.mo = jsonReader.nextString();
                        break;
                    case "lel":
                        lnrVar.wd = lnr(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, List<com.bytedance.adsdk.ud.lnr.lnr.mzz> list, LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ud.lnr.lnr.mzz mzzVarQdl = oth.qdl(jsonReader, wdVar);
            mzzVarQdl.rq();
            com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl qdlVar = com.bytedance.adsdk.ud.lnr.lnr.mzz.qdl.PRE_COMP;
            list.add(mzzVarQdl);
            longSparseArray.put(mzzVarQdl.mzz(), mzzVarQdl);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> map, Map<String, com.bytedance.adsdk.ud.to> map2) throws IOException {
        int i2;
        int i3 = 2;
        int i4 = -1;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.ud.to.qdl> listMml = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayLnr = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName.hashCode()) {
                    case -1109732030:
                        i2 = strNextName.equals("layers") ? 0 : i4;
                        break;
                    case 104:
                        i2 = strNextName.equals(h.f36614b) ? 1 : i4;
                        break;
                    case 112:
                        i2 = strNextName.equals("p") ? i3 : i4;
                        break;
                    case 117:
                        i2 = strNextName.equals("u") ? 3 : i4;
                        break;
                    case 119:
                        i2 = strNextName.equals("w") ? 4 : i4;
                        break;
                    case 3239:
                        i2 = strNextName.equals("el") ? 5 : i4;
                        break;
                    case 3355:
                        i2 = strNextName.equals("id") ? 6 : i4;
                        break;
                    case 3695:
                        i2 = strNextName.equals("tc") ? 7 : i4;
                        break;
                    case 107027:
                        i2 = strNextName.equals("lel") ? 8 : i4;
                        break;
                    case 112793:
                        i2 = strNextName.equals("rel") ? 9 : i4;
                        break;
                    case 3237004:
                        i2 = strNextName.equals("inel") ? 10 : i4;
                        break;
                    default:
                        i2 = i4;
                        break;
                }
                switch (i2) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.ud.lnr.lnr.mzz mzzVarQdl = oth.qdl(jsonReader, wdVar);
                            longSparseArray.put(mzzVarQdl.mzz(), mzzVarQdl);
                            arrayList.add(mzzVarQdl);
                        }
                        jsonReader.endArray();
                        i3 = 2;
                        i4 = -1;
                        break;
                    case 1:
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case 2:
                        strNextString2 = jsonReader.nextString();
                        break;
                    case 3:
                        strNextString3 = jsonReader.nextString();
                        break;
                    case 4:
                        iNextInt = jsonReader.nextInt();
                        break;
                    case 5:
                        strNextString5 = jsonReader.nextString();
                        break;
                    case 6:
                        strNextString = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        listMml = mml(jsonReader);
                        jsonReader.endArray();
                        break;
                    case 8:
                        jSONArrayLnr = lnr(jsonReader);
                        break;
                    case 9:
                        strNextString4 = jsonReader.nextString();
                        break;
                    case 10:
                        int[][] iArr2 = {new int[]{i4, i4}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i5 = 0; i5 < i3; i5++) {
                                if (jsonReader.hasNext()) {
                                    iArr2[0][i5] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        iArr = iArr2;
                        break;
                    default:
                        jsonReader.skipValue();
                        i3 = 2;
                        i4 = -1;
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.ud.to toVar = new com.bytedance.adsdk.ud.to(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listMml, strNextString5, iArr, jSONArrayLnr);
                map2.put(toVar.jpc(), toVar);
            } else {
                map.put(strNextString, arrayList);
            }
            i3 = 2;
            i4 = -1;
        }
        jsonReader.endArray();
    }

    private static void qdl(JsonReader jsonReader, Map<String, com.bytedance.adsdk.ud.lnr.lnr> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.ud.lnr.lnr lnrVarQdl = rdp.qdl(jsonReader);
                    map.put(lnrVarQdl.ud(), lnrVarQdl);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ud.lnr.mml mmlVarQdl = exu.qdl(jsonReader, wdVar);
            sparseArray.put(mmlVarQdl.hashCode(), mmlVarQdl);
        }
        jsonReader.endArray();
    }

    private static void qdl(JsonReader jsonReader, List<com.bytedance.adsdk.ud.lnr.mo> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.ud.lnr.mo(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
