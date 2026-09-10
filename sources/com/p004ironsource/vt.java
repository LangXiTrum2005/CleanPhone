package com.p004ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\tH\u0016R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ironsource/vt;", "Lcom/ironsource/hi;", "Lcom/ironsource/hi$a;", "", "Lcom/ironsource/hi$b;", "smashes", "", "a", "smash", "", "b", "", "", "", "Ljava/util/Map;", "mShowCountMap", "mMaxAdsPerSessionMap", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class vt implements hi, hi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> mShowCountMap = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> mMaxAdsPerSessionMap = new HashMap();

    @Override // com.ironsource.hi.a
    public void a(hi.b smash) {
        Intrinsics.f(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.mShowCountMap.containsKey(strC)) {
                Map<String, Integer> map = this.mShowCountMap;
                Integer num = map.get(strC);
                Intrinsics.c(num);
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.p004ironsource.hi
    public boolean b(hi.b smash) {
        boolean z2;
        Intrinsics.f(smash, "smash");
        synchronized (this) {
            String strC = smash.c();
            if (this.mShowCountMap.containsKey(strC)) {
                Integer num = this.mShowCountMap.get(strC);
                Intrinsics.c(num);
                if (num.intValue() >= smash.b()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // com.ironsource.hi.a
    public void a(List<? extends hi.b> smashes) {
        Intrinsics.f(smashes, "smashes");
        for (hi.b bVar : smashes) {
            this.mShowCountMap.put(bVar.c(), 0);
            this.mMaxAdsPerSessionMap.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }

    @Override // com.p004ironsource.hi
    public boolean a() {
        for (String str : this.mMaxAdsPerSessionMap.keySet()) {
            Integer num = this.mShowCountMap.get(str);
            Intrinsics.c(num);
            int iIntValue = num.intValue();
            Integer num2 = this.mMaxAdsPerSessionMap.get(str);
            Intrinsics.c(num2);
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
