package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9433a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9434b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9435c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9436d = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f9438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque f9439c;

        public String b() {
            return JsonUtils.getString(this.f9438b, "bcode", "");
        }

        public c c() {
            return (c) this.f9439c.getLast();
        }

        public String toString() {
            return "AdInfo{states='" + this.f9439c.toString() + "', adUnitId='" + a("ad_unit_id") + "', format='" + a("ad_format") + "', adapterName='" + a("network_name") + "', adapterClass='" + a("adapter_class") + "', adapterVersion='" + a("adapter_version") + "', bCode='" + b() + "', creativeId='" + a(CampaignEx.JSON_KEY_CREATIVE_ID) + "', updated=" + this.f9437a + '}';
        }

        private b(a3 a3Var, c cVar) {
            JSONObject jSONObject = new JSONObject();
            this.f9438b = jSONObject;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f9439c = arrayDeque;
            a(cVar);
            JsonUtils.putString(jSONObject, "ad_unit_id", a3Var.getAdUnitId());
            JsonUtils.putString(jSONObject, "ad_format", a3Var.getFormat().getLabel());
            JsonUtils.putString(jSONObject, "network_name", a3Var.c());
            JsonUtils.putString(jSONObject, "adapter_class", a3Var.b());
            JsonUtils.putString(jSONObject, "adapter_version", a3Var.A());
            JsonUtils.putString(jSONObject, "bcode", a3Var.C());
            JsonUtils.putString(jSONObject, CampaignEx.JSON_KEY_CREATIVE_ID, a3Var.getCreativeId());
            JsonUtils.putString(jSONObject, "operation", arrayDeque.toString());
        }

        public JSONObject a() {
            return this.f9438b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f9437a = System.currentTimeMillis();
            this.f9439c.add(cVar);
            JsonUtils.putString(this.f9438b, "operation", cVar.toString());
        }

        private String a(String str) {
            return JsonUtils.getString(this.f9438b, str, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9448a;

        c(String str) {
            this.f9448a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f9448a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        void a(b bVar);
    }

    public h() {
        a();
    }

    private Set b(c cVar) {
        HashSet hashSet;
        synchronized (this.f9434b) {
            hashSet = new HashSet(a(cVar));
        }
        return hashSet;
    }

    public void a(a3 a3Var, c cVar) {
        synchronized (this.f9436d) {
            try {
                String strC = a3Var.C();
                b bVar = (b) this.f9435c.get(strC);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(a3Var, cVar);
                    this.f9435c.put(strC, bVar);
                } else if (bVar.c() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f9435c.remove(strC);
                }
                a(bVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f9434b) {
            try {
                for (c cVar : c.values()) {
                    this.f9433a.put(cVar, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f9434b) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f9434b) {
            try {
                Iterator it = this.f9433a.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f9434b) {
            try {
                Set set = (Set) this.f9433a.get(cVar);
                if (m1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(b bVar, c cVar) {
        Iterator it = b(cVar).iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(bVar);
        }
    }
}
