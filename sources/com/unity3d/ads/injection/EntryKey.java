package com.unity3d.ads.injection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import qk.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/injection/EntryKey;", "", "", "named", "Lqk/d;", "instanceClass", "<init>", "(Ljava/lang/String;Lqk/d;)V", "component1", "()Ljava/lang/String;", "component2", "()Lqk/d;", "copy", "(Ljava/lang/String;Lqk/d;)Lcom/unity3d/ads/injection/EntryKey;", InAppPurchaseConstants.METHOD_TO_STRING, "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNamed", "Lqk/d;", "getInstanceClass", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class EntryKey {
    private final d instanceClass;
    private final String named;

    public EntryKey(String named, d instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            dVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, dVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNamed() {
        return this.named;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final d getInstanceClass() {
        return this.instanceClass;
    }

    public final EntryKey copy(String named, d instanceClass) {
        n.f(named, "named");
        n.f(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) other;
        return n.a(this.named, entryKey.named) && n.a(this.instanceClass, entryKey.instanceClass);
    }

    public final d getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, d dVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, dVar);
    }
}
