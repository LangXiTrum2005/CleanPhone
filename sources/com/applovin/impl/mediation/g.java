package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.a3;
import com.applovin.impl.m3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f8691c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8689a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8692d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8693e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8694f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8695g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f8696h = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f8699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f8700d;

        public a(String str, String str2, a3 a3Var, com.applovin.impl.sdk.l lVar) {
            this.f8697a = str;
            this.f8698b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f8700d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (a3Var == null) {
                this.f8699c = null;
            } else {
                this.f8699c = a3Var.getFormat();
                JsonUtils.putString(jSONObject, "format", a3Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f8700d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f8697a.equals(aVar.f8697a) || !this.f8698b.equals(aVar.f8698b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f8699c;
            return maxAdFormat == null ? aVar.f8699c == null : maxAdFormat.equals(aVar.f8699c);
        }

        public int hashCode() {
            int iE = d5.u.e(this.f8697a.hashCode() * 31, 31, this.f8698b);
            MaxAdFormat maxAdFormat = this.f8699c;
            return iE + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f8697a + "', operationTag='" + this.f8698b + "', format=" + this.f8699c + '}';
        }
    }

    public g(com.applovin.impl.sdk.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8690b = lVar;
        this.f8691c = lVar.Q();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f8695g) {
            try {
                arrayList = new ArrayList(this.f8696h.size());
                Iterator it = this.f8696h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f8692d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f8694f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f8692d) {
            try {
                HashSet hashSet = new HashSet(this.f8693e.size());
                Iterator it = this.f8693e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return setUnmodifiableSet;
    }

    public h a(m3 m3Var) {
        return a(m3Var, false);
    }

    public h a(m3 m3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (m3Var != null) {
            String strC = m3Var.c();
            String strB = m3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8691c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8691c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f8689a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f8692d) {
                try {
                    if (!this.f8694f.contains(strB)) {
                        if (this.f8693e.containsKey(strB)) {
                            clsA = (Class) this.f8693e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f8691c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f8694f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(m3Var, clsA, z10);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f8691c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f8693e.put(strB, clsA);
                            if (z10) {
                                this.f8689a.put(m3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.p.a()) {
                            this.f8691c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f8694f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8691c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, a3 a3Var) {
        synchronized (this.f8695g) {
            try {
                this.f8690b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8690b.Q().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f8696h.add(new a(str, str2, a3Var, this.f8690b));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private h a(m3 m3Var, Class cls, boolean z10) {
        try {
            return new h(m3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f8690b.A0()), z10, this.f8690b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("MediationAdapterManager", "Failed to load adapter: " + m3Var, th2);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.p.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
