package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/zt;", "Lcom/ironsource/ji;", "Lcom/ironsource/ji$a;", "", "b", "Lcom/ironsource/au;", "historyRecord", "a", "Lcom/ironsource/ju;", d9.a.t, "Lorg/json/JSONObject;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "", "", "", "Lcom/ironsource/xt;", "configuration", "", "", "Lcom/ironsource/w;", "Ljava/util/Map;", "adFormatsHistory", "Lcom/ironsource/ro;", "Lcom/ironsource/ro;", "networkGlobalDataWriter", "Ljava/util/concurrent/locks/ReadWriteLock;", "c", "Ljava/util/concurrent/locks/ReadWriteLock;", "lock", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class zt implements ji, ji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, C3386w> adFormatsHistory = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ro networkGlobalDataWriter = new ro();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27953a;

        static {
            int[] iArr = new int[yt.values().length];
            try {
                iArr[yt.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yt.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yt.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27953a = iArr;
        }
    }

    private final void b() {
        xt configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        ro roVar = this.networkGlobalDataWriter;
        Intrinsics.e(configuration, "configuration");
        roVar.a(a(configuration));
        this.networkGlobalDataWriter.a(a());
    }

    @Override // com.p004ironsource.ji
    public int a(IronSource.AD_UNIT adFormat) {
        Intrinsics.f(adFormat, "adFormat");
        this.lock.readLock().lock();
        try {
            C3386w c3386w = this.adFormatsHistory.get(adFormat.toString());
            return c3386w != null ? c3386w.get_currentlyLoadedAds() : 0;
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.p004ironsource.ji
    public List<String> a() {
        this.lock.readLock().lock();
        try {
            Map<String, C3386w> map = this.adFormatsHistory;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C3386w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return CollectionsKt.i0(linkedHashMap.keySet());
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // com.p004ironsource.ji
    public JSONObject a(ju mode) {
        Intrinsics.f(mode, "mode");
        this.lock.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C3386w> entry : this.adFormatsHistory.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(mode);
                if (jSONObjectA.length() > 0) {
                    jSONObject.put(key, jSONObjectA);
                }
            }
            this.lock.readLock().unlock();
            return jSONObject;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.ji.a
    public void a(au historyRecord) {
        Intrinsics.f(historyRecord, "historyRecord");
        this.lock.writeLock().lock();
        try {
            C3373n0 adInternalInfo = historyRecord.getAdInternalInfo();
            String strValueOf = String.valueOf(adInternalInfo != null ? adInternalInfo.b() : null);
            Map<String, C3386w> map = this.adFormatsHistory;
            C3386w c3386w = map.get(strValueOf);
            if (c3386w == null) {
                c3386w = new C3386w();
                map.put(strValueOf, c3386w);
            }
            c3386w.a(historyRecord.a(new gu()));
            this.lock.writeLock().unlock();
            b();
        } catch (Throwable th) {
            this.lock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.p004ironsource.ji
    public Map<String, JSONObject> a(xt configuration) {
        Map<String, JSONObject> mapL;
        Intrinsics.f(configuration, "configuration");
        this.lock.readLock().lock();
        try {
            int i2 = a.f27953a[configuration.getHistoryMode().ordinal()];
            if (i2 == 1) {
                mapL = MapsKt.l(new Pair(ne.x1, a(ju.FullHistory)), new Pair(ne.y1, a(ju.CurrentlyLoadedAds)));
            } else if (i2 == 2) {
                mapL = MapsKt.l(new Pair(ne.y1, a(ju.CurrentlyLoadedAds)));
            } else if (i2 == 3) {
                mapL = EmptyMap.X;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.lock.readLock().unlock();
            return mapL;
        } catch (Throwable th) {
            this.lock.readLock().unlock();
            throw th;
        }
    }
}
