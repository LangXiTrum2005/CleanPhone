package pd;

import android.util.Log;
import com.google.android.gms.internal.ads.ln0;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.k;
import qd.m;
import qd.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb.c f48326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f48327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.b f48328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qd.b f48329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd.g f48330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qd.h f48331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f48332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qd.i f48333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k5.g f48334i;

    public b(nb.c cVar, Executor executor, qd.b bVar, qd.b bVar2, qd.b bVar3, qd.g gVar, qd.h hVar, m mVar, qd.i iVar, k5.g gVar2) {
        this.f48326a = cVar;
        this.f48327b = executor;
        this.f48328c = bVar;
        this.f48329d = bVar2;
        this.f48330e = gVar;
        this.f48331f = hVar;
        this.f48332g = mVar;
        this.f48333h = iVar;
        this.f48334i = gVar2;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        String string;
        o oVar;
        qd.h hVar = this.f48331f;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(qd.h.a(hVar.f48977c));
        hashSet.addAll(qd.h.a(hVar.f48978d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            qd.c cVarC = hVar.f48977c.c();
            String string2 = null;
            if (cVarC == null) {
                string = null;
            } else {
                try {
                    string = cVarC.f48946b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                qd.c cVarC2 = hVar.f48977c.c();
                if (cVarC2 != null) {
                    synchronized (hVar.f48975a) {
                        try {
                            Iterator it = hVar.f48975a.iterator();
                            while (it.hasNext()) {
                                hVar.f48976b.execute(new ld.f((h) it.next(), str, cVarC2, 6));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                oVar = new o(string, 2);
            } else {
                qd.c cVarC3 = hVar.f48978d.c();
                if (cVarC3 != null) {
                    try {
                        string2 = cVarC3.f48946b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    oVar = new o(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    oVar = new o("", 0);
                }
            }
            map.put(str, oVar);
        }
        return map;
    }

    public final d5.o b() {
        d5.o oVar;
        m mVar = this.f48332g;
        synchronized (mVar.f49008b) {
            try {
                mVar.f49007a.getLong("last_fetch_time_in_millis", -1L);
                int i10 = mVar.f49007a.getInt("last_fetch_status", 0);
                long j10 = qd.g.f48963i;
                long j11 = mVar.f49007a.getLong("fetch_timeout_in_seconds", 60L);
                if (j11 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
                }
                long j12 = mVar.f49007a.getLong("minimum_fetch_interval_in_seconds", j10);
                if (j12 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j12 + " is an invalid argument");
                }
                oVar = new d5.o(i10, 15);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public final void c(boolean z10) {
        HttpURLConnection httpURLConnection;
        qd.i iVar = this.f48333h;
        synchronized (iVar) {
            k kVar = (k) iVar.f48981c;
            synchronized (kVar.f49002r) {
                try {
                    kVar.f48990e = z10;
                    ln0 ln0Var = kVar.f48992g;
                    if (ln0Var != null) {
                        ln0Var.f17070a = z10;
                    }
                    if (z10 && (httpURLConnection = kVar.f48991f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                synchronized (iVar) {
                    if (!((LinkedHashSet) iVar.f48980b).isEmpty()) {
                        ((k) iVar.f48981c).e(0L);
                    }
                }
            }
        }
    }
}
