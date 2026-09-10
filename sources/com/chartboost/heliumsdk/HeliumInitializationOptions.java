package com.chartboost.heliumsdk;

import com.p004ironsource.x4;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumInitializationOptions;", "", "skippedPartnerIds", "", "", "(Ljava/util/Set;)V", "getSkippedPartnerIds", "()Ljava/util/Set;", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HeliumInitializationOptions {
    private final Set<String> skippedPartnerIds;

    public HeliumInitializationOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeliumInitializationOptions copy$default(HeliumInitializationOptions heliumInitializationOptions, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            set = heliumInitializationOptions.skippedPartnerIds;
        }
        return heliumInitializationOptions.copy(set);
    }

    public final Set<String> component1() {
        return this.skippedPartnerIds;
    }

    public final HeliumInitializationOptions copy(Set<String> skippedPartnerIds) {
        Intrinsics.f(skippedPartnerIds, "skippedPartnerIds");
        return new HeliumInitializationOptions(skippedPartnerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeliumInitializationOptions) && Intrinsics.a(this.skippedPartnerIds, ((HeliumInitializationOptions) other).skippedPartnerIds);
    }

    public final Set<String> getSkippedPartnerIds() {
        return this.skippedPartnerIds;
    }

    public int hashCode() {
        return this.skippedPartnerIds.hashCode();
    }

    public String toString() {
        return "HeliumInitializationOptions(skippedPartnerIds=" + this.skippedPartnerIds + ')';
    }

    public HeliumInitializationOptions(Set<String> skippedPartnerIds) {
        Intrinsics.f(skippedPartnerIds, "skippedPartnerIds");
        this.skippedPartnerIds = skippedPartnerIds;
    }

    public /* synthetic */ HeliumInitializationOptions(Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EmptySet.X : set);
    }
}
