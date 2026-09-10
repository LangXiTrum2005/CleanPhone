package com.p004ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR*\u0010\u0013\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u0011\u0012\b\u0012\u00060\u0002j\u0002`\b0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R*\u0010\u0016\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u0011\u0012\b\u0012\u00060\tj\u0002`\u00140\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ironsource/ou;", "Lcom/ironsource/mi;", "", "count", "", "identifier", "", "a", "Lcom/ironsource/services/capping/showcount/ShowCount;", "", "b", "(Ljava/lang/String;)Ljava/lang/Long;", "threshold", "Lcom/ironsource/i8;", "Lcom/ironsource/i8;", d9.a.k, "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/services/capping/Identifier;", "Ljava/util/concurrent/ConcurrentHashMap;", "showCountCache", "Lcom/ironsource/services/capping/showcount/TimeThreshold;", "c", "timeThresholdCache", "<init>", "(Lcom/ironsource/i8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ou implements mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i8 storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ConcurrentHashMap<String, Integer> showCountCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ConcurrentHashMap<String, Long> timeThresholdCache;

    public ou(i8 storage) {
        Intrinsics.f(storage, "storage");
        this.storage = storage;
        this.showCountCache = new ConcurrentHashMap<>();
        this.timeThresholdCache = new ConcurrentHashMap<>();
    }

    @Override // com.p004ironsource.mi
    public int a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        Integer num = this.showCountCache.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer numC = this.storage.c(identifier);
        if (numC == null) {
            this.showCountCache.put(identifier, 0);
            return 0;
        }
        int iIntValue = numC.intValue();
        this.showCountCache.put(identifier, Integer.valueOf(iIntValue));
        return iIntValue;
    }

    @Override // com.p004ironsource.mi
    public Long b(String identifier) {
        Intrinsics.f(identifier, "identifier");
        Long l2 = this.timeThresholdCache.get(identifier);
        if (l2 != null) {
            return l2;
        }
        Long lA = this.storage.a(identifier);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        this.timeThresholdCache.put(identifier, Long.valueOf(jLongValue));
        return Long.valueOf(jLongValue);
    }

    @Override // com.p004ironsource.mi
    public void a(int count, String identifier) {
        Intrinsics.f(identifier, "identifier");
        this.showCountCache.put(identifier, Integer.valueOf(count));
        this.storage.a(identifier, count);
    }

    @Override // com.p004ironsource.mi
    public void a(long threshold, String identifier) {
        Intrinsics.f(identifier, "identifier");
        this.timeThresholdCache.put(identifier, Long.valueOf(threshold));
        this.storage.a(identifier, threshold);
    }
}
