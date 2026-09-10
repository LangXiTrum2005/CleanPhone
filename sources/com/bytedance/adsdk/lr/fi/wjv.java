package com.bytedance.adsdk.lr.fi;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class wjv {
    private static JSONArray ik(JsonReader jsonReader) {
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
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static List<com.bytedance.adsdk.lr.qt.ri> ka(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.lr.qt.ri riVar = new com.bytedance.adsdk.lr.qt.ri();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                riVar.xha = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals("le")) {
                                            riVar.lr = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        riVar.di = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("s")) {
                                    riVar.fi = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("l")) {
                                riVar.ri = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("f")) {
                            riVar.ka = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("c")) {
                        riVar.ik = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(riVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void lr(JsonReader jsonReader, com.bytedance.adsdk.lr.xha.ri riVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            riVar.xha = ik(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("fr")) {
                        riVar.fi = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    riVar.di = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    public static com.bytedance.adsdk.lr.xha ri(JsonReader jsonReader) throws IOException {
        float f;
        float fRi = com.bytedance.adsdk.lr.di.di.ri();
        LongSparseArray<com.bytedance.adsdk.lr.ik.ik.fi> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.lr.ik.ka> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.lr.xha.ik ikVar = new com.bytedance.adsdk.lr.xha.ik();
        com.bytedance.adsdk.lr.xha.ri riVar = new com.bytedance.adsdk.lr.xha.ri();
        com.bytedance.adsdk.lr.xha.lr lrVar = new com.bytedance.adsdk.lr.xha.lr();
        com.bytedance.adsdk.lr.xha xhaVar = new com.bytedance.adsdk.lr.xha();
        jsonReader.beginObject();
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f2 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b = 0;
                    }
                    break;
                case -1109732030:
                    f = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b = 1;
                    }
                    break;
                case -865448777:
                    f = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b = 2;
                    }
                    break;
                case 104:
                    f = fNextDouble3;
                    if (strNextName.equals("h")) {
                        b = 3;
                    }
                    break;
                case 118:
                    f = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b = 4;
                    }
                    break;
                case 119:
                    f = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b = 5;
                    }
                    break;
                case 3208:
                    f = fNextDouble3;
                    if (strNextName.equals("dl")) {
                        b = 6;
                    }
                    break;
                case 3276:
                    f = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b = 7;
                    }
                    break;
                case 3292:
                    f = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b = 8;
                    }
                    break;
                case 3367:
                    f = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b = 9;
                    }
                    break;
                case 3553:
                    f = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b = 10;
                    }
                    break;
                case 94623709:
                    f = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b = 11;
                    }
                    break;
                case 97615364:
                    f = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b = 12;
                    }
                    break;
                case 110364485:
                    f = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b = 13;
                    }
                    break;
                case 839250809:
                    f = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b = 14;
                    }
                    break;
                default:
                    f = fNextDouble3;
                    break;
            }
            switch (b) {
                case 0:
                    ri(jsonReader, xhaVar, map, map2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 1:
                    ri(jsonReader, xhaVar, arrayList, longSparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 2:
                    ri(jsonReader, lrVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.lr.di.di.ri(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        xhaVar.ri("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 8:
                    ri(jsonReader, riVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f2;
                    break;
                case 11:
                    ri(jsonReader, xhaVar, sparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 12:
                    ri(jsonReader, map3);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 13:
                    ri(jsonReader, ikVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 14:
                    ri(jsonReader, arrayList2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
            }
        }
        jsonReader.endObject();
        xhaVar.ri(new Rect(0, 0, (int) (iNextInt2 * fRi), (int) (iNextInt * fRi)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, ikVar, strNextString, riVar, lrVar);
        return xhaVar;
    }

    private static Map<String, Object> lr(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", ik(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
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

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha.lr lrVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            lrVar.lr = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        lrVar.lr[0][i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        lrVar.ik = ik(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    lrVar.ri = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha.ri riVar) {
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
                                    lr(jsonReader, riVar);
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                riVar.ri = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("pc")) {
                            riVar.ka = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        riVar.ik = lr(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("be")) {
                    riVar.lr = lr(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha.ik ikVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            ikVar.fi = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i = 0; i < 2; i++) {
                                                if (jsonReader.hasNext()) {
                                                    ikVar.fi[i] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        ikVar.xha = ik(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("tl")) {
                                    ikVar.ik = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("ke")) {
                                ikVar.ri = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("id")) {
                            ikVar.lr = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        ikVar.di = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    ikVar.ka = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, List<com.bytedance.adsdk.lr.ik.ik.fi> list, LongSparseArray<com.bytedance.adsdk.lr.ik.ik.fi> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lr.ik.ik.fi fiVarRi = uq.ri(jsonReader, xhaVar);
            fiVarRi.sf();
            com.bytedance.adsdk.lr.ik.ik.fi.ri riVar = com.bytedance.adsdk.lr.ik.ik.fi.ri.PRE_COMP;
            list.add(fiVarRi);
            longSparseArray.put(fiVarRi.fi(), fiVarRi);
        }
        jsonReader.endArray();
    }

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, Map<String, List<com.bytedance.adsdk.lr.ik.ik.fi>> map, Map<String, com.bytedance.adsdk.lr.qt> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.lr.qt.ri> listKa = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayIk = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.lr.ik.ik.fi fiVarRi = uq.ri(jsonReader, xhaVar);
                            longSparseArray.put(fiVarRi.fi(), fiVarRi);
                            arrayList.add(fiVarRi);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listKa = ka(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayIk = ik(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i = 0; i < 2; i++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.lr.qt qtVar = new com.bytedance.adsdk.lr.qt(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listKa, strNextString5, iArr, jSONArrayIk);
                map2.put(qtVar.mj(), qtVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void ri(JsonReader jsonReader, Map<String, com.bytedance.adsdk.lr.ik.ik> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lr.ik.ik ikVarRi = bgr.ri(jsonReader);
                    map.put(ikVarRi.lr(), ikVarRi);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void ri(JsonReader jsonReader, com.bytedance.adsdk.lr.xha xhaVar, SparseArray<com.bytedance.adsdk.lr.ik.ka> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lr.ik.ka kaVarRi = aw.ri(jsonReader, xhaVar);
            sparseArray.put(kaVarRi.hashCode(), kaVarRi);
        }
        jsonReader.endArray();
    }

    private static void ri(JsonReader jsonReader, List<com.bytedance.adsdk.lr.ik.di> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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
            list.add(new com.bytedance.adsdk.lr.ik.di(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
