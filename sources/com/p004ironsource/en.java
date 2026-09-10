package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J;\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/ironsource/en;", "", "Lcom/ironsource/ej;", "a", "", "b", "", "c", "", "d", "e", "instanceType", "adSourceNameForEvents", "loadTimeoutInMills", "isOneFlow", "isMultipleAdObjects", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Lcom/ironsource/ej;", g.f40227p, "()Lcom/ironsource/ej;", "Ljava/lang/String;", f.j, "()Ljava/lang/String;", "J", h.f36614b, "()J", "Z", "j", "()Z", i.f37957c, "<init>", "(Lcom/ironsource/ej;Ljava/lang/String;JZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class en {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ej instanceType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String adSourceNameForEvents;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long loadTimeoutInMills;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isOneFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isMultipleAdObjects;

    public en(ej instanceType, String adSourceNameForEvents, long j, boolean z2, boolean z3) {
        Intrinsics.f(instanceType, "instanceType");
        Intrinsics.f(adSourceNameForEvents, "adSourceNameForEvents");
        this.instanceType = instanceType;
        this.adSourceNameForEvents = adSourceNameForEvents;
        this.loadTimeoutInMills = j;
        this.isOneFlow = z2;
        this.isMultipleAdObjects = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ej getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdSourceNameForEvents() {
        return this.adSourceNameForEvents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLoadTimeoutInMills() {
        return this.loadTimeoutInMills;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsOneFlow() {
        return this.isOneFlow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMultipleAdObjects() {
        return this.isMultipleAdObjects;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof en)) {
            return false;
        }
        en enVar = (en) other;
        return this.instanceType == enVar.instanceType && Intrinsics.a(this.adSourceNameForEvents, enVar.adSourceNameForEvents) && this.loadTimeoutInMills == enVar.loadTimeoutInMills && this.isOneFlow == enVar.isOneFlow && this.isMultipleAdObjects == enVar.isMultipleAdObjects;
    }

    public final String f() {
        return this.adSourceNameForEvents;
    }

    public final ej g() {
        return this.instanceType;
    }

    public final long h() {
        return this.loadTimeoutInMills;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iB = a.b(androidx.datastore.preferences.protobuf.a.b(this.adSourceNameForEvents, this.instanceType.hashCode() * 31, 31), 31, this.loadTimeoutInMills);
        boolean z2 = this.isOneFlow;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iB + r2) * 31;
        boolean z3 = this.isMultipleAdObjects;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean i() {
        return this.isMultipleAdObjects;
    }

    public final boolean j() {
        return this.isOneFlow;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadTaskConfig(instanceType=");
        sb.append(this.instanceType);
        sb.append(", adSourceNameForEvents=");
        sb.append(this.adSourceNameForEvents);
        sb.append(", loadTimeoutInMills=");
        sb.append(this.loadTimeoutInMills);
        sb.append(", isOneFlow=");
        sb.append(this.isOneFlow);
        sb.append(", isMultipleAdObjects=");
        return a.r(sb, this.isMultipleAdObjects, ')');
    }

    public /* synthetic */ en(ej ejVar, String str, long j, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ejVar, str, j, z2, (i2 & 16) != 0 ? true : z3);
    }

    public final en a(ej instanceType, String adSourceNameForEvents, long loadTimeoutInMills, boolean isOneFlow, boolean isMultipleAdObjects) {
        Intrinsics.f(instanceType, "instanceType");
        Intrinsics.f(adSourceNameForEvents, "adSourceNameForEvents");
        return new en(instanceType, adSourceNameForEvents, loadTimeoutInMills, isOneFlow, isMultipleAdObjects);
    }

    public static /* synthetic */ en a(en enVar, ej ejVar, String str, long j, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            ejVar = enVar.instanceType;
        }
        if ((i2 & 2) != 0) {
            str = enVar.adSourceNameForEvents;
        }
        if ((i2 & 4) != 0) {
            j = enVar.loadTimeoutInMills;
        }
        if ((i2 & 8) != 0) {
            z2 = enVar.isOneFlow;
        }
        if ((i2 & 16) != 0) {
            z3 = enVar.isMultipleAdObjects;
        }
        long j2 = j;
        return enVar.a(ejVar, str, j2, z2, z3);
    }
}
