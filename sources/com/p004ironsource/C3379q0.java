package com.p004ironsource;

import com.p004ironsource.sdk.controller.f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0006\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/ironsource/q0;", "Lcom/ironsource/o0;", "Lcom/ironsource/o0$a;", "", f.b.AD_ID, "Lcom/ironsource/n0;", "a", "", "adInfo", "", "Lorg/json/JSONObject;", "json", "Lcom/ironsource/l1;", "adStatus", "Ljava/util/concurrent/locks/ReadWriteLock;", "Ljava/util/concurrent/locks/ReadWriteLock;", "readWriteLock", "", "b", "Ljava/util/Map;", "adInternalInfoMap", "<init>", "(Ljava/util/concurrent/locks/ReadWriteLock;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3379q0 implements InterfaceC3375o0, InterfaceC3375o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteLock readWriteLock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C3373n0> adInternalInfoMap;

    public C3379q0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.p004ironsource.InterfaceC3375o0
    public C3373n0 a(String adId) {
        Intrinsics.f(adId, "adId");
        this.readWriteLock.readLock().lock();
        try {
            return this.adInternalInfoMap.get(adId);
        } finally {
            this.readWriteLock.readLock().unlock();
        }
    }

    public C3379q0(ReadWriteLock readWriteLock) {
        Intrinsics.f(readWriteLock, "readWriteLock");
        this.readWriteLock = readWriteLock;
        this.adInternalInfoMap = new LinkedHashMap();
    }

    @Override // com.p004ironsource.InterfaceC3375o0
    public List<C3373n0> a() {
        this.readWriteLock.readLock().lock();
        List<C3373n0> listI0 = CollectionsKt.i0(this.adInternalInfoMap.values());
        this.readWriteLock.readLock().unlock();
        return listI0;
    }

    public /* synthetic */ C3379q0(ReadWriteLock readWriteLock, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.p004ironsource.InterfaceC3375o0.a
    public void a(l1 adStatus, String adId) {
        Intrinsics.f(adStatus, "adStatus");
        Intrinsics.f(adId, "adId");
        this.readWriteLock.writeLock().lock();
        try {
            C3373n0 c3373n0 = this.adInternalInfoMap.get(adId);
            if (c3373n0 != null) {
                c3373n0.a(adStatus);
                c3373n0.a(System.currentTimeMillis() / 1000.0d);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    @Override // com.p004ironsource.InterfaceC3375o0.a
    public void a(C3373n0 adInfo) {
        Intrinsics.f(adInfo, "adInfo");
        this.readWriteLock.writeLock().lock();
        try {
            if (this.adInternalInfoMap.get(adInfo.c()) == null) {
                this.adInternalInfoMap.put(adInfo.c(), adInfo);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }

    @Override // com.p004ironsource.InterfaceC3375o0.a
    public void a(JSONObject json, l1 adStatus, String adId) {
        Intrinsics.f(json, "json");
        Intrinsics.f(adStatus, "adStatus");
        Intrinsics.f(adId, "adId");
        this.readWriteLock.writeLock().lock();
        try {
            C3373n0 c3373n0 = this.adInternalInfoMap.get(adId);
            if (c3373n0 != null) {
                String bundleId = json.optString("bundleId");
                Intrinsics.e(bundleId, "bundleId");
                if (bundleId.length() > 0) {
                    c3373n0.a(bundleId);
                }
                String dynamicDemandSourceId = json.optString("dynamicDemandSource");
                Intrinsics.e(dynamicDemandSourceId, "dynamicDemandSourceId");
                if (dynamicDemandSourceId.length() > 0) {
                    c3373n0.a(qg.INSTANCE.a(dynamicDemandSourceId));
                }
                c3373n0.a(adStatus);
            }
        } finally {
            this.readWriteLock.writeLock().unlock();
        }
    }
}
