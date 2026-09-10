package com.bytedance.adsdk.LD.JXs;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.badlogic.gdx.graphics.GL20;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class eK {
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    private static void LD(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl.Lxb lxb) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("fr")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    lxb.JXs = jsonReader.nextInt();
                } else if (b == 1) {
                    lxb.lc = jsonReader.nextString();
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    lxb.ebl = lk(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    public static com.bytedance.adsdk.LD.ebl Lxb(JsonReader jsonReader) throws IOException {
        int i;
        float fLxb = com.bytedance.adsdk.LD.lc.lc.Lxb();
        LongSparseArray<com.bytedance.adsdk.LD.lk.lk.JXs> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.LD.lk.ZU> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.LD.ebl.lk lkVar = new com.bytedance.adsdk.LD.ebl.lk();
        com.bytedance.adsdk.LD.ebl.Lxb lxb = new com.bytedance.adsdk.LD.ebl.Lxb();
        com.bytedance.adsdk.LD.ebl.LD ld = new com.bytedance.adsdk.LD.ebl.LD();
        com.bytedance.adsdk.LD.ebl eblVar = new com.bytedance.adsdk.LD.ebl();
        jsonReader.beginObject();
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    i = iNextInt2;
                    if (strNextName.equals("assets")) {
                        b = 0;
                    }
                    break;
                case -1109732030:
                    i = iNextInt2;
                    if (strNextName.equals("layers")) {
                        b = 1;
                    }
                    break;
                case -865448777:
                    i = iNextInt2;
                    if (strNextName.equals("globalEvent")) {
                        b = 2;
                    }
                    break;
                case 104:
                    i = iNextInt2;
                    if (strNextName.equals(bc.aM)) {
                        b = 3;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    i = iNextInt2;
                    if (strNextName.equals(bc.aK)) {
                        b = 4;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i = iNextInt2;
                    if (strNextName.equals("w")) {
                        b = 5;
                    }
                    break;
                case 3208:
                    i = iNextInt2;
                    if (strNextName.equals("dl")) {
                        b = 6;
                    }
                    break;
                case 3276:
                    i = iNextInt2;
                    if (strNextName.equals("fr")) {
                        b = 7;
                    }
                    break;
                case 3292:
                    i = iNextInt2;
                    if (strNextName.equals("gc")) {
                        b = 8;
                    }
                    break;
                case 3367:
                    i = iNextInt2;
                    if (strNextName.equals("ip")) {
                        b = 9;
                    }
                    break;
                case GL20.GL_TEXTURE_2D /* 3553 */:
                    i = iNextInt2;
                    if (strNextName.equals("op")) {
                        b = 10;
                    }
                    break;
                case 94623709:
                    i = iNextInt2;
                    if (strNextName.equals("chars")) {
                        b = 11;
                    }
                    break;
                case 97615364:
                    i = iNextInt2;
                    if (strNextName.equals("fonts")) {
                        b = 12;
                    }
                    break;
                case 110364485:
                    i = iNextInt2;
                    if (strNextName.equals("timer")) {
                        b = cw.k;
                    }
                    break;
                case 839250809:
                    i = iNextInt2;
                    if (strNextName.equals("markers")) {
                        b = cw.l;
                    }
                    break;
                default:
                    i = iNextInt2;
                    break;
            }
            switch (b) {
                case 0:
                    Lxb(jsonReader, eblVar, map, map2);
                    break;
                case 1:
                    Lxb(jsonReader, eblVar, arrayList, longSparseArray);
                    break;
                case 2:
                    Lxb(jsonReader, ld);
                    break;
                case 3:
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.LD.lc.lc.Lxb(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        eblVar.Lxb("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 5:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    break;
                case 7:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 8:
                    Lxb(jsonReader, lxb);
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 11:
                    Lxb(jsonReader, eblVar, sparseArray);
                    break;
                case 12:
                    Lxb(jsonReader, map3);
                    break;
                case 13:
                    Lxb(jsonReader, lkVar);
                    break;
                case 14:
                    Lxb(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            iNextInt2 = i;
        }
        jsonReader.endObject();
        eblVar.Lxb(new Rect(0, 0, (int) (iNextInt * fLxb), (int) (iNextInt2 * fLxb)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, lkVar, strNextString, lxb, ld);
        return eblVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    private static List<com.bytedance.adsdk.LD.nBu.Lxb> ZU(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.LD.nBu.Lxb lxb = new com.bytedance.adsdk.LD.nBu.Lxb();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    switch (jsonReader.nextName()) {
                        case "l":
                            lxb.Lxb = jsonReader.nextInt();
                            break;
                        case "le":
                            lxb.LD = jsonReader.nextInt();
                            break;
                        case "s":
                            lxb.JXs = jsonReader.nextInt();
                            break;
                        case "c":
                            lxb.lk = jsonReader.nextString();
                            break;
                        case "f":
                            lxb.ZU = jsonReader.nextString();
                            break;
                        case "bs":
                            lxb.lc = jsonReader.nextInt();
                            break;
                        case "ali":
                            lxb.ebl = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(lxb);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    private static JSONArray lk(JsonReader jsonReader) {
        byte b;
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
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("hd")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (b != 1) {
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

    private static Map<String, Object> LD(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", lk(jsonReader));
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

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl.LD ld) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("lel")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    ld.LD = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i = 0; i < 2; i++) {
                            if (jsonReader.hasNext()) {
                                ld.LD[0][i] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b == 1) {
                    ld.Lxb = jsonReader.nextString();
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    ld.lk = lk(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl.Lxb lxb) {
        byte b;
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
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals("se")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("pc")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    lxb.Lxb = jsonReader.nextInt();
                } else if (b == 1) {
                    lxb.LD = LD(jsonReader);
                } else if (b == 2) {
                    lxb.lk = LD(jsonReader);
                } else if (b == 3) {
                    lxb.ZU = jsonReader.nextInt();
                } else if (b != 4) {
                    jsonReader.skipValue();
                } else {
                    LD(jsonReader, lxb);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl.lk lkVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "ke":
                        lkVar.Lxb = jsonReader.nextInt();
                        break;
                    case "id":
                        lkVar.LD = jsonReader.nextString();
                        break;
                    case "tl":
                        lkVar.lk = jsonReader.nextString();
                        break;
                    case "at":
                        lkVar.ZU = jsonReader.nextString();
                        break;
                    case "inel":
                        lkVar.JXs = new int[]{-1, -1};
                        jsonReader.beginArray();
                        for (int i = 0; i < 2; i++) {
                            if (jsonReader.hasNext()) {
                                lkVar.JXs[i] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                        break;
                    case "el":
                        lkVar.lc = jsonReader.nextString();
                        break;
                    case "lel":
                        lkVar.ebl = lk(jsonReader);
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

    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, List<com.bytedance.adsdk.LD.lk.lk.JXs> list, LongSparseArray<com.bytedance.adsdk.LD.lk.lk.JXs> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.LD.lk.lk.JXs jXsLxb = HD.Lxb(jsonReader, eblVar);
            jXsLxb.JVA();
            com.bytedance.adsdk.LD.lk.lk.JXs.Lxb lxb = com.bytedance.adsdk.LD.lk.lk.JXs.Lxb.PRE_COMP;
            list.add(jXsLxb);
            longSparseArray.put(jXsLxb.JXs(), jXsLxb);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, Map<String, List<com.bytedance.adsdk.LD.lk.lk.JXs>> map, Map<String, com.bytedance.adsdk.LD.nBu> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.LD.nBu.Lxb> listZU = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayLk = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.LD.lk.lk.JXs jXsLxb = HD.Lxb(jsonReader, eblVar);
                            longSparseArray.put(jXsLxb.JXs(), jXsLxb);
                            arrayList.add(jXsLxb);
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
                        listZU = ZU(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayLk = lk(jsonReader);
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
                com.bytedance.adsdk.LD.nBu nbu = new com.bytedance.adsdk.LD.nBu(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listZU, strNextString5, iArr, jSONArrayLk);
                map2.put(nbu.OY(), nbu);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void Lxb(JsonReader jsonReader, Map<String, com.bytedance.adsdk.LD.lk.lk> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.LD.lk.lk lkVarLxb = STP.Lxb(jsonReader);
                    map.put(lkVarLxb.LD(), lkVarLxb);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void Lxb(JsonReader jsonReader, com.bytedance.adsdk.LD.ebl eblVar, SparseArray<com.bytedance.adsdk.LD.lk.ZU> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.LD.lk.ZU zuLxb = NXR.Lxb(jsonReader, eblVar);
            sparseArray.put(zuLxb.hashCode(), zuLxb);
        }
        jsonReader.endArray();
    }

    private static void Lxb(JsonReader jsonReader, List<com.bytedance.adsdk.LD.lk.lc> list) throws IOException {
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
            list.add(new com.bytedance.adsdk.LD.lk.lc(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
