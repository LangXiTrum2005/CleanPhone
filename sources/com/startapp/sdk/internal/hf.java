package com.startapp.sdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadataItem;
import com.startapp.simple.bloomfilter.api.BloomFilterCreator;
import java.io.StringReader;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f41056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RscMetadata f41057c;
    public ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedList f41058e;
    public final WeakHashMap f = new WeakHashMap();

    public hf(Context context, o3 o3Var) {
        this.f41055a = context;
        this.f41056b = o3Var;
    }

    public static JSONArray a(jf jfVar) {
        a3 a3Var = jfVar.f41144a;
        String[] strArr = a3Var.f40785c;
        Object[] objArr = a3Var.f40786e;
        if (strArr.length == objArr.length) {
            int length = strArr.length;
            if (length == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(strArr[i2], objArr[i2]);
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            } catch (JSONException e2) {
                if (jfVar.a(32)) {
                    g9.a(e2);
                }
            }
        } else if (jfVar.a(512)) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "c690e4ef5365d88b";
            g9Var.f41002e = Arrays.toString(strArr) + ", " + Arrays.toString(objArr);
            g9Var.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final List a() {
        ArrayList<kf> arrayList;
        a3 a3VarA;
        Object kfVar;
        this.f41056b.getClass();
        RscMetadata rscMetadataS = MetaData.E().S();
        a3 a3Var = null;
        RscMetadata rscMetadata = (rscMetadataS == null || !rscMetadataS.d()) ? null : rscMetadataS;
        if (rscMetadata == null) {
            return a(null, null, null);
        }
        synchronized (this) {
            try {
                if (rscMetadata.equals(this.f41057c)) {
                    return this.f41058e;
                }
                String strC = rscMetadata.c();
                int i2 = 4;
                int i3 = 2;
                int i4 = 8;
                int i5 = 0;
                if (strC == null || strC.length() < 1) {
                    arrayList = null;
                } else {
                    try {
                        try {
                            ArrayList arrayListA = jb.a(new JsonReader(new StringReader(new String(vi.a(AbstractC3396g.a(Base64.decode(strC, 8)))))));
                            arrayList = new ArrayList();
                            for (Object obj : arrayListA) {
                                if (!(obj instanceof Map)) {
                                    kfVar = new kf();
                                } else {
                                    Map map = (Map) obj;
                                    Object obj2 = map.get("type");
                                    Object obj3 = map.get("params");
                                    if (obj2 instanceof Number) {
                                        int iIntValue = ((Number) obj2).intValue();
                                        if (iIntValue != 1) {
                                            if (iIntValue != 2) {
                                                if (iIntValue != 3) {
                                                    if (iIntValue == 4 && (obj3 instanceof List)) {
                                                        List list = (List) obj3;
                                                        if (list.size() > 0) {
                                                            h9 h9Var = (h9) h9.f41039c.get(String.valueOf(list.get(0)));
                                                            if (h9Var != null) {
                                                                kfVar = new df(h9Var, list.size() > 1 ? String.valueOf(list.get(1)) : null);
                                                            } else {
                                                                kfVar = new kf();
                                                            }
                                                        } else {
                                                            kfVar = new kf();
                                                        }
                                                    } else {
                                                        kfVar = new kf();
                                                    }
                                                } else if (obj3 instanceof Map) {
                                                    Map map2 = (Map) obj3;
                                                    Object obj4 = map2.get("action");
                                                    if (obj4 instanceof String) {
                                                        Object obj5 = map2.get("extras");
                                                        HashMap map3 = new HashMap();
                                                        if (obj5 instanceof Map) {
                                                            for (Map.Entry entry : ((Map) obj5).entrySet()) {
                                                                Object key = entry.getKey();
                                                                if (key instanceof String) {
                                                                    map3.put((String) key, String.valueOf(entry.getValue()));
                                                                }
                                                            }
                                                        }
                                                        kfVar = new cf((String) obj4, map3);
                                                    } else {
                                                        kfVar = new kf();
                                                    }
                                                } else {
                                                    kfVar = new kf();
                                                }
                                            } else if (obj3 instanceof List) {
                                                LinkedList linkedList = new LinkedList();
                                                for (Object obj6 : (List) obj3) {
                                                    if (obj6 instanceof String) {
                                                        h9 h9Var2 = (h9) h9.f41039c.get((String) obj6);
                                                        if (h9Var2 != null) {
                                                            linkedList.add(h9Var2);
                                                        }
                                                    }
                                                }
                                                if (linkedList.size() > 0) {
                                                    kfVar = new ef(linkedList);
                                                } else {
                                                    kfVar = new kf();
                                                }
                                            } else {
                                                kfVar = new kf();
                                            }
                                        } else if (obj3 instanceof Number) {
                                            kfVar = new af(((Number) obj3).intValue());
                                        } else {
                                            kfVar = new kf();
                                        }
                                    } else {
                                        kfVar = new kf();
                                    }
                                }
                                arrayList.add(kfVar);
                            }
                        } catch (Throwable th) {
                            if ((rscMetadata.a() & 1) != 0) {
                                g9.a(th);
                            }
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        if ((rscMetadata.a() & 1) != 0) {
                            g9.a(th2);
                        }
                    }
                }
                if (arrayList != null && arrayList.size() >= 1) {
                    List<RscMetadataItem> listB = rscMetadata.b();
                    if (listB != null && listB.size() >= 1) {
                        LinkedList linkedList2 = new LinkedList();
                        for (RscMetadataItem rscMetadataItem : listB) {
                            if (rscMetadataItem != null) {
                                String strA = rscMetadataItem.a();
                                if (strA == null || strA.length() < 1) {
                                    a3VarA = a3Var;
                                } else {
                                    try {
                                        try {
                                            a3VarA = b3.a(new String(vi.a(AbstractC3396g.a(Base64.decode(strA, i4)))));
                                        } catch (Throwable th3) {
                                            if ((rscMetadata.a(rscMetadataItem) & i2) != 0) {
                                                g9.a(th3);
                                            }
                                            a3VarA = a3Var;
                                        }
                                    } catch (Throwable th4) {
                                        if ((rscMetadata.a(rscMetadataItem) & i3) != 0) {
                                            g9.a(th4);
                                        }
                                    }
                                }
                                if (a3VarA != null) {
                                    int iH = rscMetadataItem.h();
                                    int iD = rscMetadataItem.d();
                                    ArrayList arrayList2 = new ArrayList(Math.min(arrayList.size(), Integer.bitCount(iH)));
                                    int i6 = i5;
                                    for (kf kfVar2 : arrayList) {
                                        int i7 = 1 << i6;
                                        if ((iH & i7) != 0) {
                                            arrayList2.add(new Pair(kfVar2, Boolean.valueOf((iD & i7) != 0 ? 1 : i5)));
                                        }
                                        i6++;
                                        i5 = 0;
                                    }
                                    if (arrayList2.size() >= 1) {
                                        linkedList2.add(new jf(a3VarA, arrayList2, rscMetadataItem.i() != null ? rscMetadataItem.i().intValue() : 300, rscMetadataItem.g(), rscMetadataItem.c(), rscMetadataItem.f(), rscMetadataItem.e() != null ? rscMetadataItem.e().intValue() : 0, rscMetadata.a(rscMetadataItem)));
                                    }
                                    a3Var = null;
                                    i2 = 4;
                                    i3 = 2;
                                    i4 = 8;
                                    i5 = 0;
                                }
                            }
                        }
                        return a(rscMetadata, arrayList, linkedList2);
                    }
                    return a(rscMetadata, null, null);
                }
                return a(rscMetadata, null, null);
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final synchronized List a(RscMetadata rscMetadata, ArrayList arrayList, LinkedList linkedList) {
        try {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((kf) it.next()).a(this.f41055a);
                    } catch (Throwable th) {
                        RscMetadata rscMetadata2 = this.f41057c;
                        if (rscMetadata2 != null && (rscMetadata2.a() & 64) != 0) {
                            g9.a(th);
                        }
                    }
                }
            }
            this.f41057c = rscMetadata;
            this.d = arrayList;
            this.f41058e = linkedList;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((kf) it2.next()).a(this.f41055a, this);
                    } catch (Throwable th2) {
                        if (rscMetadata != null && (rscMetadata.a() & 128) != 0) {
                            g9.a(th2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return linkedList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:90:0x013b, B:92:0x0140, B:95:0x014c, B:97:0x0152, B:98:0x015b, B:100:0x0161, B:101:0x0166), top: B:148:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:113:0x018e A[Catch: JSONException -> 0x0199, TryCatch #2 {JSONException -> 0x0199, blocks: (B:111:0x0186, B:113:0x018e, B:116:0x019b, B:118:0x01a3, B:119:0x01ad), top: B:146:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a3 A[Catch: JSONException -> 0x0199, TryCatch #2 {JSONException -> 0x0199, blocks: (B:111:0x0186, B:113:0x018e, B:116:0x019b, B:118:0x01a3, B:119:0x01ad), top: B:146:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0140 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:90:0x013b, B:92:0x0140, B:95:0x014c, B:97:0x0152, B:98:0x015b, B:100:0x0161, B:101:0x0166), top: B:148:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0152 A[Catch: JSONException -> 0x014a, TryCatch #3 {JSONException -> 0x014a, blocks: (B:90:0x013b, B:92:0x0140, B:95:0x014c, B:97:0x0152, B:98:0x015b, B:100:0x0161, B:101:0x0166), top: B:148:0x013b }] */
    public final String a(Object obj) {
        int i2;
        Iterator it;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArrayA;
        JSONArray jSONArrayA2;
        Integer num;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        Pair pair;
        List listA = a();
        if (listA == null) {
            return null;
        }
        JSONObject jSONObject2 = null;
        for (Iterator it2 = listA.iterator(); it2.hasNext(); it2 = it) {
            jf jfVar = (jf) it2.next();
            try {
                Iterator it3 = jfVar.f41145b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    Pair pair2 = (Pair) it3.next();
                    try {
                        if (((kf) pair2.first).a(obj)) {
                            i2 = (((Boolean) pair2.second).booleanValue() ? 2 : 0) | 1;
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (jfVar.a(256)) {
                            g9.a(th);
                        }
                        i2 = 0;
                        break;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if ((i2 & 1) == 0) {
                it = it2;
            } else {
                a3 a3Var = jfVar.f41144a;
                if ((i2 & 2) == 0) {
                    int i3 = jfVar.f41146c;
                    synchronized (this) {
                        pair = (Pair) this.f.get(a3Var);
                    }
                    if (pair == null || (jSONObject = (JSONObject) ((SoftReference) pair.second).get()) == null) {
                        it = it2;
                        jSONArray = null;
                    } else {
                        long jLongValue = ((Long) pair.first).longValue();
                        it = it2;
                        jSONArray = null;
                        if (jLongValue + ((long) (i3 * 1000)) < SystemClock.elapsedRealtime()) {
                        }
                    }
                    jSONObject = jSONArray;
                } else {
                    it = it2;
                    jSONArray = null;
                    jSONObject = jSONArray;
                }
                if (jSONObject == null) {
                    try {
                        jSONArrayA = a3Var.a(this.f41055a, jfVar.d, jfVar.f41147e);
                    } catch (Throwable th3) {
                        if (jfVar.a(8)) {
                            g9.a(th3);
                        }
                        jSONArrayA = jSONArray;
                    }
                    if (jSONArrayA != null && (num = jfVar.f) != null) {
                        try {
                            if ((num.intValue() == 1 ? new Cif() : jSONArray) != null) {
                                JSONArray jSONArray2 = new JSONArray();
                                ArrayList arrayList = new ArrayList(jSONArrayA.length());
                                int length = jSONArrayA.length();
                                for (int i4 = 0; i4 < length; i4++) {
                                    JSONObject jSONObject3 = jSONArrayA.getJSONObject(i4);
                                    if (jSONObject3 != null) {
                                        try {
                                            arrayList.add(jSONObject3.getString(Cif.f41095a));
                                        } catch (Throwable th4) {
                                            th = th4;
                                            if (jfVar.a(com.p004ironsource.mediationsdk.metadata.a.f25965n)) {
                                                g9.a(th);
                                            }
                                            if (jSONArrayA != null) {
                                                jSONObject = new JSONObject();
                                                try {
                                                    if ((jfVar.g & 1) != 0) {
                                                        jSONObject.put("currentTimeMillis", System.currentTimeMillis());
                                                    }
                                                    if ((jfVar.g & 2) != 0) {
                                                        jSONObject.put("bootTimeMillis", SystemClock.elapsedRealtime());
                                                    }
                                                    jSONArrayA2 = a(jfVar);
                                                    if (jSONArrayA2 != null) {
                                                        jSONObject.put("params", jSONArrayA2);
                                                    }
                                                    jSONObject.put("items", jSONArrayA);
                                                } catch (JSONException e2) {
                                                    if (jfVar.a(32)) {
                                                        g9.a(e2);
                                                    }
                                                }
                                                a(a3Var, jSONObject);
                                            }
                                            if (jSONObject != null) {
                                                if (jSONObject2 == null) {
                                                    jSONObject2 = new JSONObject();
                                                }
                                                try {
                                                    jSONObjectOptJSONObject = jSONObject2.optJSONObject(a3Var.f40783a);
                                                    if (jSONObjectOptJSONObject == null) {
                                                        jSONObjectOptJSONObject = new JSONObject();
                                                        jSONObject2.put(a3Var.f40783a, jSONObjectOptJSONObject);
                                                    }
                                                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(a3Var.f40784b);
                                                    if (jSONArrayOptJSONArray == null) {
                                                        jSONArrayOptJSONArray = new JSONArray();
                                                        jSONObjectOptJSONObject.put(a3Var.f40784b, jSONArrayOptJSONArray);
                                                    }
                                                    jSONArrayOptJSONArray.put(jSONObject);
                                                } catch (JSONException e3) {
                                                    if (jfVar.a(32)) {
                                                        g9.a(e3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                jSONArray2.put(new BloomFilterCreator().fromKeys(arrayList));
                                jSONArrayA = jSONArray2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    if (jSONArrayA != null && jSONArrayA.length() > 0) {
                        jSONObject = new JSONObject();
                        if ((jfVar.g & 1) != 0) {
                            jSONObject.put("currentTimeMillis", System.currentTimeMillis());
                        }
                        if ((jfVar.g & 2) != 0) {
                            jSONObject.put("bootTimeMillis", SystemClock.elapsedRealtime());
                        }
                        jSONArrayA2 = a(jfVar);
                        if (jSONArrayA2 != null) {
                            jSONObject.put("params", jSONArrayA2);
                        }
                        jSONObject.put("items", jSONArrayA);
                        a(a3Var, jSONObject);
                    }
                }
                if (jSONObject != null) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject(a3Var.f40783a);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                        jSONObject2.put(a3Var.f40783a, jSONObjectOptJSONObject);
                    }
                    jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(a3Var.f40784b);
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                        jSONObjectOptJSONObject.put(a3Var.f40784b, jSONArrayOptJSONArray);
                    }
                    jSONArrayOptJSONArray.put(jSONObject);
                }
            }
        }
        if (jSONObject2 == null) {
            return null;
        }
        try {
            return vi.b(jSONObject2.toString());
        } catch (Throwable th6) {
            this.f41056b.getClass();
            RscMetadata rscMetadataS = MetaData.E().S();
            if (rscMetadataS == null || !rscMetadataS.d()) {
                rscMetadataS = null;
            }
            if (rscMetadataS != null && (rscMetadataS.a() & 16) != 0) {
                g9.a(th6);
            }
            return null;
        }
    }

    public final synchronized void a(a3 a3Var, JSONObject jSONObject) {
        this.f.put(a3Var, new Pair(Long.valueOf(SystemClock.elapsedRealtime()), new SoftReference(jSONObject)));
    }
}
