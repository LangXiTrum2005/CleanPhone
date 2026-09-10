package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0342ff implements N8, N8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, C0666y> f28709a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0500oc f28710b = new C0500oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadWriteLock f28711c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: com.ironsource.ff$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28712a;

        static {
            int[] iArr = new int[EnumC0324ef.values().length];
            try {
                iArr[EnumC0324ef.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0324ef.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0324ef.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28712a = iArr;
        }
    }

    private final void b() {
        C0306df configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C0500oc c0500oc = this.f28710b;
        kotlin.jvm.internal.n.e(configuration, "configuration");
        c0500oc.a(a(configuration));
        this.f28710b.a(a());
    }

    @Override // com.ironsource.N8.a
    public void a(AbstractC0360gf historyRecord) {
        kotlin.jvm.internal.n.f(historyRecord, "historyRecord");
        this.f28711c.writeLock().lock();
        try {
            P pA = historyRecord.a();
            String strValueOf = String.valueOf(pA != null ? pA.b() : null);
            Map<String, C0666y> map = this.f28709a;
            C0666y c0666y = map.get(strValueOf);
            if (c0666y == null) {
                c0666y = new C0666y();
                map.put(strValueOf, c0666y);
            }
            c0666y.a(historyRecord.a(new C0467mf()));
            this.f28711c.writeLock().unlock();
            b();
        } catch (Throwable th2) {
            this.f28711c.writeLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.N8
    public JSONObject a(EnumC0521pf mode) {
        kotlin.jvm.internal.n.f(mode, "mode");
        this.f28711c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C0666y> entry : this.f28709a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            this.f28711c.readLock().unlock();
            return jSONObject;
        } catch (Throwable th2) {
            this.f28711c.readLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.N8
    public int a(IronSource.a adFormat) {
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f28711c.readLock().lock();
        try {
            C0666y c0666y = this.f28709a.get(adFormat.toString());
            return c0666y != null ? c0666y.a() : 0;
        } finally {
            this.f28711c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public List<String> a() {
        this.f28711c.readLock().lock();
        try {
            Map<String, C0666y> map = this.f28709a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C0666y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return xj.n.N0(linkedHashMap.keySet());
        } finally {
            this.f28711c.readLock().unlock();
        }
    }

    @Override // com.ironsource.N8
    public Map<String, JSONObject> a(C0306df configuration) {
        Map<String, JSONObject> mapR;
        kotlin.jvm.internal.n.f(configuration, "configuration");
        this.f28711c.readLock().lock();
        try {
            int i10 = a.f28712a[configuration.a().ordinal()];
            if (i10 == 1) {
                mapR = xj.b0.R(new wj.f(O6.f26768z1, a(EnumC0521pf.FullHistory)), new wj.f(O6.A1, a(EnumC0521pf.CurrentlyLoadedAds)));
            } else if (i10 == 2) {
                mapR = xj.b0.R(new wj.f(O6.A1, a(EnumC0521pf.CurrentlyLoadedAds)));
            } else if (i10 == 3) {
                mapR = xj.w.f53867a;
            } else {
                throw new aa.b((byte) 0, 20);
            }
            this.f28711c.readLock().unlock();
            return mapR;
        } catch (Throwable th2) {
            this.f28711c.readLock().unlock();
            throw th2;
        }
    }
}
