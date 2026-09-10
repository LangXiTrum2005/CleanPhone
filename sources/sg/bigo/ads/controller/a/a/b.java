package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.controller.a.j;

/* JADX INFO: loaded from: classes7.dex */
public class b implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0858b f47757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0858b f47758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47759c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47760e;
    private Map<a, C0858b> f;
    private Map<a, List<C0858b>> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47761h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<a, C0858b> f47762i = a();
    private Map<a, List<C0858b>> j;

    public static class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<a> f47764c = new sg.bigo.ads.common.f.a<a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a("", 0);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47766b;

        public a(String str, int i2) {
            this.f47765a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
            this.f47766b = i2;
        }

        @Override // sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            this.f47765a = n.a(parcel, "");
            this.f47766b = n.a(parcel, 0);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f47765a, aVar.f47765a) && this.f47766b == aVar.f47766b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f47765a + "_" + this.f47766b).hashCode();
        }

        public final String toString() {
            return super.toString();
        }

        @Override // sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            parcel.writeString(this.f47765a);
            parcel.writeInt(this.f47766b);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.controller.a.a.b$b, reason: collision with other inner class name */
    public static class C0858b extends j implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sg.bigo.ads.common.f.a<C0858b> f47767e = new sg.bigo.ads.common.f.a<C0858b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new C0858b("", "", 0);
            }
        };
        boolean d;
        private int f;
        private long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47768h;

        public C0858b(String str, String str2, int i2) {
            super(str, str2, i2);
            this.d = true;
            this.f = 0;
            this.g = 0L;
            this.f47768h = 0;
        }

        public static /* synthetic */ int c(C0858b c0858b) {
            c0858b.f47768h = 0;
            return 0;
        }

        public static /* synthetic */ int e(C0858b c0858b) {
            int i2 = c0858b.f;
            c0858b.f = i2 + 1;
            return i2;
        }

        public static /* synthetic */ int f(C0858b c0858b) {
            c0858b.f = 0;
            return 0;
        }

        public static /* synthetic */ int g(C0858b c0858b) {
            int i2 = c0858b.f47768h;
            c0858b.f47768h = i2 + 1;
            return i2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                return TextUtils.equals(this.f47869a, ((j) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f47869a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(Parcel parcel) {
            parcel.writeString(this.f47869a);
            parcel.writeInt(this.f47871c);
            n.a(parcel, this.d);
            parcel.writeString(this.f47870b);
            parcel.writeInt(this.f);
            parcel.writeLong(this.g);
            parcel.writeInt(this.f47768h);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(Parcel parcel) {
            this.f47869a = n.a(parcel, "");
            this.f47871c = n.a(parcel, 1);
            this.d = n.b(parcel, true);
            this.f47870b = n.a(parcel, "");
            this.f = n.a(parcel, 0);
            this.g = n.a(parcel, 0L);
            this.f47768h = n.a(parcel, 0);
        }

        public final void a(String str) {
            this.f47870b = str;
        }
    }

    public b(String str, String str2) {
        this.d = str;
        this.f47760e = str2;
    }

    private C0858b b(Map<a, List<C0858b>> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C0858b c0858b = (C0858b) k.a(k.a(map.get(it.next()), new Comparable<C0858b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C0858b c0858b2) {
                        C0858b c0858b3 = c0858b2;
                        return (c0858b3 == null || !c0858b3.d) ? 0 : 1;
                    }
                }));
                if (a(c0858b)) {
                    return c0858b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    public final Pair<String, Integer> a(sg.bigo.ads.api.a.h hVar) {
        synchronized (this) {
            try {
                if (!k.a(this.f) && hVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator<Map.Entry<a, C0858b>> it = this.f.entrySet().iterator();
                    while (it.hasNext()) {
                        C0858b value = it.next().getValue();
                        if (!value.d) {
                            if (value.f % hVar.y() == 0) {
                                C0858b.c(value);
                                if (value.g != 0 && Math.round(Math.abs(jCurrentTimeMillis - value.g) / 8.64E7f) <= hVar.A()) {
                                    value = null;
                                }
                            } else if (Math.round(Math.abs(jCurrentTimeMillis - value.g) / 60000.0f) <= hVar.z()) {
                                value = null;
                            }
                            if (value != null) {
                                value.g = jCurrentTimeMillis;
                                C0858b.e(value);
                                return new Pair<>(value.a(), Integer.valueOf(value.f));
                            }
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    private static List<a> a(a aVar) {
        ArrayList arrayList = new ArrayList();
        a aVar2 = new a("all", 0);
        if (aVar2.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar2);
        a aVar3 = new a("all", aVar.f47766b);
        if (aVar3.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar3);
        a aVar4 = new a(aVar.f47765a, 0);
        if (aVar4.equals(aVar)) {
            arrayList.add(0, aVar);
            return arrayList;
        }
        arrayList.add(0, aVar4);
        arrayList.add(0, aVar);
        return arrayList;
    }

    @Override // sg.bigo.ads.common.f
    public void b(Parcel parcel) {
        synchronized (this) {
            try {
                this.f = n.a(parcel, a.f47764c, C0858b.f47767e);
                this.g = n.b(parcel, a.f47764c, C0858b.f47767e);
                this.f47761h = n.a(parcel, 3);
                Map mapA = n.a(parcel, a.f47764c, C0858b.f47767e);
                this.j = n.b(parcel, a.f47764c, C0858b.f47767e);
                this.f47757a = (C0858b) n.b(parcel, C0858b.f47767e);
                this.f47758b = (C0858b) n.b(parcel, C0858b.f47767e);
                this.f47759c = n.a(parcel, 0);
                this.f47762i = a();
                HashSet hashSet = new HashSet();
                for (C0858b c0858b : this.f47762i.values()) {
                    hashSet.add(c0858b.a());
                    if (!k.a(mapA)) {
                        for (C0858b c0858b2 : mapA.values()) {
                            if (TextUtils.equals(c0858b.a(), c0858b2.a())) {
                                c0858b.d = c0858b2.d;
                            }
                        }
                    }
                }
                C0858b c0858b3 = this.f47758b;
                if (c0858b3 != null && c0858b3.d() == 0 && !hashSet.contains(this.f47758b.a())) {
                    this.f47757a = this.f47758b;
                    this.f47758b = null;
                    this.f47759c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Map<a, C0858b> a() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.d)) {
            map.put(new a("all", 0), new C0858b(this.d, "", 0));
        }
        if (!TextUtils.isEmpty(this.f47760e)) {
            map.put(new a(com.smartdigimkt.d2.a.f34403Y, 0), new C0858b(this.f47760e, "", 0));
        }
        return map;
    }

    private static C0858b a(Map<a, C0858b> map, a aVar) {
        if (!k.a(map) && aVar != null) {
            Iterator<a> it = a(aVar).iterator();
            while (it.hasNext()) {
                C0858b c0858b = map.get(it.next());
                if (a(c0858b)) {
                    return c0858b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r0
  0x0034: PHI (r0v2 sg.bigo.ads.controller.a.a.b$b) = 
  (r0v1 sg.bigo.ads.controller.a.a.b$b)
  (r0v5 sg.bigo.ads.controller.a.a.b$b)
  (r0v7 sg.bigo.ads.controller.a.a.b$b)
  (r0v9 sg.bigo.ads.controller.a.a.b$b)
 binds: [B:3:0x000b, B:5:0x0017, B:7:0x0023, B:9:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    private C0858b a(a aVar, boolean z2) {
        boolean z3;
        C0858b c0858bA = a(this.f, aVar);
        if (a(c0858bA)) {
            z3 = true;
        } else {
            c0858bA = b(this.g, aVar);
            if (a(c0858bA)) {
                z3 = true;
            } else {
                c0858bA = a(this.f47762i, aVar);
                if (a(c0858bA)) {
                    z3 = true;
                } else {
                    c0858bA = b(this.j, aVar);
                    if (a(c0858bA)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("getBestHost ");
        sb.append(z3 ? "success" : "fail");
        sb.append(z2 ? " after reset" : "");
        sb.append(", countryKey=");
        sb.append(aVar);
        sb.append(", currentHost=");
        sb.append(this.f47758b);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBanHost", sb.toString());
        if (a(c0858bA)) {
            return c0858bA;
        }
        return null;
    }

    public final sg.bigo.ads.controller.a.e a(String str, int i2) {
        boolean z2;
        sg.bigo.ads.controller.a.e eVar;
        synchronized (this) {
            try {
                C0858b c0858b = this.f47758b;
                if (c0858b == null || this.f47759c >= this.f47761h) {
                    a aVar = new a(str, i2);
                    C0858b c0858bA = a(aVar, false);
                    if (a(c0858bA)) {
                        z2 = false;
                    } else {
                        Map<a, C0858b> map = this.f;
                        if (map != null) {
                            Iterator<Map.Entry<a, C0858b>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                C0858b value = it.next().getValue();
                                if (value != null) {
                                    value.d = true;
                                }
                            }
                        }
                        Map<a, List<C0858b>> map2 = this.g;
                        if (map2 != null) {
                            Iterator<Map.Entry<a, List<C0858b>>> it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                List<C0858b> value2 = it2.next().getValue();
                                if (!k.a((Collection) value2)) {
                                    Iterator<C0858b> it3 = value2.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().d = true;
                                    }
                                }
                            }
                        }
                        Map<a, List<C0858b>> map3 = this.j;
                        if (map3 != null) {
                            Iterator<Map.Entry<a, List<C0858b>>> it4 = map3.entrySet().iterator();
                            while (it4.hasNext()) {
                                List<C0858b> value3 = it4.next().getValue();
                                if (!k.a((Collection) value3)) {
                                    Iterator<C0858b> it5 = value3.iterator();
                                    while (it5.hasNext()) {
                                        it5.next().d = true;
                                    }
                                }
                            }
                        }
                        Map<a, C0858b> map4 = this.f47762i;
                        if (map4 != null) {
                            Iterator<Map.Entry<a, C0858b>> it6 = map4.entrySet().iterator();
                            while (it6.hasNext()) {
                                C0858b value4 = it6.next().getValue();
                                if (value4 != null) {
                                    value4.d = true;
                                }
                            }
                        }
                        this.f47757a = this.f47758b;
                        this.f47758b = null;
                        this.f47759c = 0;
                        c0858bA = a(aVar, true);
                        z2 = true;
                    }
                    if (a(c0858bA)) {
                        c0858bA.d = false;
                        this.f47757a = this.f47758b;
                        this.f47758b = new C0858b(c0858bA.a(), c0858bA.b(), c0858bA.d());
                        this.f47759c = 0;
                    }
                    if (this.f47758b == null) {
                        this.f47758b = new C0858b(this.d, "", 0);
                    }
                    eVar = new sg.bigo.ads.controller.a.e(this.f47758b, z2, true);
                } else {
                    eVar = new sg.bigo.ads.controller.a.e(c0858b, false, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // sg.bigo.ads.common.f
    public void a(Parcel parcel) {
        synchronized (this) {
            n.a(parcel, this.f);
            n.b(parcel, this.g);
            parcel.writeInt(this.f47761h);
            n.a(parcel, this.f47762i);
            n.b(parcel, this.j);
            n.a(parcel, this.f47757a);
            n.a(parcel, this.f47758b);
            parcel.writeInt(this.f47759c);
        }
    }

    private void a(Map<a, C0858b> map, Map<a, List<C0858b>> map2, String str, int i2) {
        C0858b value;
        C0858b c0858b;
        synchronized (this) {
            try {
                if (!k.a(this.f) && !k.a(map)) {
                    for (Map.Entry<a, C0858b> entry : this.f.entrySet()) {
                        a key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null && (c0858b = map.get(key)) != null && value.equals(c0858b)) {
                            value.a(c0858b.b());
                        }
                    }
                }
                if (!k.a(this.g) && !k.a(map2)) {
                    for (Map.Entry<a, List<C0858b>> entry2 : this.g.entrySet()) {
                        a key2 = entry2.getKey();
                        if (key2 != null) {
                            List<C0858b> value2 = entry2.getValue();
                            if (!k.a((Collection) value2)) {
                                List<C0858b> list = map2.get(key2);
                                if (!k.a((Collection) list)) {
                                    for (C0858b c0858b2 : value2) {
                                        if (c0858b2 != null) {
                                            for (C0858b c0858b3 : list) {
                                                if (c0858b2.equals(c0858b3)) {
                                                    c0858b2.a(c0858b3.b());
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C0858b c0858b4 = this.f47758b;
                if (c0858b4 != null) {
                    if (c0858b4.d() != 1) {
                        if (this.f47758b.d() == 2) {
                            List<C0858b> list2 = this.g.get(new a(str, i2));
                            if (!k.a((Collection) list2)) {
                                for (C0858b c0858b5 : list2) {
                                    if (this.f47758b.equals(c0858b5)) {
                                        this.f47758b.a(c0858b5.b());
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        C0858b c0858b6 = this.f.get(new a(str, i2));
                        if (this.f47758b.equals(c0858b6)) {
                            this.f47758b.a(c0858b6.b());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(JSONObject jSONObject, boolean z2, String str, int i2) {
        synchronized (this) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("country_hosts");
                if (jSONArrayOptJSONArray != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("host", "");
                            if (sg.bigo.ads.controller.a.d.a(strOptString)) {
                                map.put(new a(jSONObjectOptJSONObject.optString("country", "all"), jSONObjectOptJSONObject.optInt("app_flag", 0)), new C0858b(strOptString, jSONObjectOptJSONObject.optString("domain_front", ""), 1));
                            }
                        }
                    }
                }
                HashMap map2 = new HashMap();
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("backup_hosts");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i4);
                        if (jSONObjectOptJSONObject2 != null) {
                            a aVar = new a(jSONObjectOptJSONObject2.optString("country", "all"), jSONObjectOptJSONObject2.optInt("app_flag", 0));
                            List arrayList = (List) map2.get(aVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map2.put(aVar, arrayList);
                            }
                            String strOptString2 = jSONObjectOptJSONObject2.optString("domain_front", "");
                            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("hosts");
                            if (jSONArrayOptJSONArray3 != null) {
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                                    String strOptString3 = jSONArrayOptJSONArray3.optString(i5, "");
                                    if (sg.bigo.ads.controller.a.d.a(strOptString3)) {
                                        C0858b c0858b = new C0858b(strOptString3, strOptString2, 2);
                                        if (!arrayList.contains(c0858b)) {
                                            arrayList.add(c0858b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z2) {
                    a(map, map2, str, i2);
                } else {
                    int iOptInt = jSONObject.optInt("threshold", 3);
                    this.f = map;
                    this.g = map2;
                    this.f47761h = iOptInt;
                    this.j = new HashMap();
                    this.f47762i = a();
                    this.f47757a = this.f47758b;
                    this.f47758b = null;
                    this.f47759c = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(String str, String str2) {
        synchronized (this) {
            try {
                if (sg.bigo.ads.controller.a.d.a(str2)) {
                    a aVar = new a(str, 0);
                    if (this.j == null) {
                        this.j = new HashMap();
                    }
                    List<C0858b> arrayList = this.j.get(aVar);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.j.put(aVar, arrayList);
                    }
                    C0858b c0858b = new C0858b(str2, "", 3);
                    if (!arrayList.contains(c0858b)) {
                        arrayList.add(c0858b);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(String str, String str2, int i2, sg.bigo.ads.api.a.h hVar, boolean z2) {
        Map<a, C0858b> map;
        C0858b value;
        Map<a, List<C0858b>> map2;
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str) && (map = this.f) != null && hVar != null) {
                    Iterator<Map.Entry<a, C0858b>> it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            value = it.next().getValue();
                            if (TextUtils.equals(value.a(), str)) {
                                if (!z2) {
                                    C0858b.g(value);
                                    if (value.f47768h != 0 && value.f47768h % hVar.y() == 0) {
                                        break;
                                    }
                                } else {
                                    C0858b.c(value);
                                    C0858b.f(value);
                                }
                            }
                        }
                        value = null;
                        break;
                    }
                    if (value != null) {
                        C0858b.c(value);
                        C0858b.f(value);
                        C0858b c0858bA = a(this.f, new a(str2, i2));
                        if (c0858bA != null) {
                            value = c0858bA;
                        }
                        C0858b c0858b = this.f47758b;
                        if (c0858b != null) {
                            synchronized (this) {
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    int iD = c0858b.d();
                                    if (iD == 0) {
                                        Map<a, C0858b> map3 = this.f47762i;
                                        if (map3 != null) {
                                            for (C0858b c0858b2 : map3.values()) {
                                                if (c0858b2 != null && TextUtils.equals(c0858b2.a(), c0858b.a())) {
                                                    arrayList.add(c0858b2);
                                                }
                                            }
                                        }
                                    } else if (iD == 1) {
                                        Map<a, C0858b> map4 = this.f;
                                        if (map4 != null) {
                                            for (C0858b c0858b3 : map4.values()) {
                                                if (c0858b3 != null && TextUtils.equals(c0858b3.a(), c0858b.a())) {
                                                    arrayList.add(c0858b3);
                                                }
                                            }
                                        }
                                    } else if (iD == 2) {
                                        Map<a, List<C0858b>> map5 = this.g;
                                        if (map5 != null) {
                                            Iterator<List<C0858b>> it2 = map5.values().iterator();
                                            while (it2.hasNext()) {
                                                for (C0858b c0858b4 : it2.next()) {
                                                    if (c0858b4 != null && TextUtils.equals(c0858b4.a(), c0858b.a())) {
                                                        arrayList.add(c0858b4);
                                                    }
                                                }
                                            }
                                        }
                                    } else if (iD == 3 && (map2 = this.j) != null) {
                                        Iterator<List<C0858b>> it3 = map2.values().iterator();
                                        while (it3.hasNext()) {
                                            for (C0858b c0858b5 : it3.next()) {
                                                if (c0858b5 != null && TextUtils.equals(c0858b5.a(), c0858b.a())) {
                                                    arrayList.add(c0858b5);
                                                }
                                            }
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            ((C0858b) it4.next()).d = true;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.f47757a = this.f47758b;
                        this.f47758b = value;
                        this.f47759c = 0;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean a(C0858b c0858b) {
        return c0858b != null && c0858b.d;
    }
}
