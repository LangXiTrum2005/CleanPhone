package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.m1;
import com.applovin.impl.n9;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f9419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9420c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public e(l lVar) {
        this.f9418a = lVar;
        this.f9419b = new d(lVar);
    }

    private void e() {
        String str = (String) this.f9418a.r0().a(b5.E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                d.a aVarA = d.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f9418a);
                if (aVarA != null) {
                    if (a(aVarA)) {
                        long jC = aVarA.c() - SystemClock.elapsedRealtime();
                        this.f9418a.g().d(f2.f7835a0, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                    } else {
                        this.f9420c.add(0, aVarA);
                    }
                }
            } catch (Throwable th2) {
                this.f9418a.Q();
                if (p.a()) {
                    this.f9418a.Q().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th2);
                }
                this.f9418a.E().a("AdPersistenceManager", "deserializePersistedAdFilePath", th2);
            }
        }
    }

    private void f() {
        this.f9418a.s0().a((k5) new u6(this.f9418a, "loadPersistedAdFilesQueueAndCleanupAsync", new w(this, 1)), f6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f9420c) {
            try {
                Iterator it = this.f9420c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((d.a) it.next()).a());
                    } catch (Throwable th2) {
                        this.f9418a.Q();
                        if (p.a()) {
                            this.f9418a.Q().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th2);
                        }
                        this.f9418a.E().a("AdPersistenceManager", "serializePersistedAdFilePath", th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f9418a.r0().b(b5.E, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f9418a.s0().a((k5) new u6(this.f9418a, "resetManagerState", new w(this, 0)), f6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(d.a aVar) {
        if (aVar == null) {
            this.f9418a.Q();
            if (p.a()) {
                this.f9418a.Q().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f9420c.add(aVar);
        if (((Boolean) this.f9418a.a(z4.f10116c1)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f9418a.r0().b(b5.E);
        this.f9419b.a();
    }

    public void a(com.applovin.impl.u uVar, a aVar) {
        if (aVar == null) {
            this.f9418a.Q();
            if (p.a()) {
                this.f9418a.Q().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            m1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f9418a.g().a(f2.X, uVar, (AppLovinError) null);
        d.a aVarA = a(uVar.g());
        this.f9419b.a(aVarA, new n9(this, aVar, aVarA, uVar));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(d.a aVar) {
        if (aVar != null && this.f9420c.remove(aVar)) {
            this.f9419b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f9418a.g().a(f2.U, bVar);
        this.f9419b.b(bVar, new a4.a(this, 12));
    }

    private boolean b(d.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == l.o()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, d.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, uVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(d.a.a(bVar));
    }

    private d.a a(AppLovinAdType appLovinAdType) {
        d.a aVar;
        synchronized (this.f9420c) {
            try {
                Iterator it = this.f9420c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (d.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.f9420c.remove(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void a(a aVar, d.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f9418a.Q();
        if (p.a()) {
            this.f9418a.Q().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f9419b.b(aVar2);
        this.f9418a.g().a(f2.Z, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, d.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f9418a.Q();
        if (p.a()) {
            this.f9418a.Q().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f9419b.b(aVar2);
        this.f9418a.g().a(f2.Y, bVar);
    }

    private boolean a(d.a aVar) {
        return ((Long) this.f9418a.a(z4.f10132e1)).longValue() + SystemClock.elapsedRealtime() >= aVar.c();
    }

    private void a() {
        synchronized (this.f9420c) {
            this.f9419b.a(new ArrayList(this.f9420c));
        }
    }
}
