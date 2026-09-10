package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/jx;", "", "Lcom/ironsource/m5;", "item", "", "itemInstanceType", "", "a", "d", "", "Lcom/ironsource/z;", d.k, "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "()I", "size", "<init>", "(Ljava/util/List;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC3389z> instances;

    /* JADX WARN: Multi-variable type inference failed */
    public jx(List<? extends AbstractC3389z> instances) {
        Intrinsics.f(instances, "instances");
        this.instances = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jx a(jx jxVar, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = jxVar.instances;
        }
        return jxVar.a(list);
    }

    public final List<AbstractC3389z> b() {
        return this.instances;
    }

    public final int c() {
        return this.instances.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3389z abstractC3389z : this.instances) {
            arrayList.add(a(abstractC3389z.getAuctionResponseItem(), abstractC3389z.getInstanceType()));
        }
        return CollectionsKt.D(arrayList, ",", null, null, null, 62);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof jx) && Intrinsics.a(this.instances, ((jx) other).instances);
    }

    public int hashCode() {
        return this.instances.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.instances + ')';
    }

    public final jx a(List<? extends AbstractC3389z> instances) {
        Intrinsics.f(instances, "instances");
        return new jx(instances);
    }

    private final String a(m5 item, int itemInstanceType) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(itemInstanceType), item.c()}, 2));
    }

    public final List<AbstractC3389z> a() {
        return this.instances;
    }
}
