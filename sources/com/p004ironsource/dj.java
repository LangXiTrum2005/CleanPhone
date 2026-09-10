package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ironsource/dj;", "", "", "a", "", "b", "c", "instanceId", "instanceType", "dynamicDemandSourceId", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "I", f.j, "()I", "d", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String instanceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int instanceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String dynamicDemandSourceId;

    public dj() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ dj a(dj djVar, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = djVar.instanceId;
        }
        if ((i3 & 2) != 0) {
            i2 = djVar.instanceType;
        }
        if ((i3 & 4) != 0) {
            str2 = djVar.dynamicDemandSourceId;
        }
        return djVar.a(str, i2, str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInstanceType() {
        return this.instanceType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDynamicDemandSourceId() {
        return this.dynamicDemandSourceId;
    }

    public final String d() {
        return this.dynamicDemandSourceId;
    }

    public final String e() {
        return this.instanceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof dj)) {
            return false;
        }
        dj djVar = (dj) other;
        return Intrinsics.a(this.instanceId, djVar.instanceId) && this.instanceType == djVar.instanceType && Intrinsics.a(this.dynamicDemandSourceId, djVar.dynamicDemandSourceId);
    }

    public final int f() {
        return this.instanceType;
    }

    public int hashCode() {
        int iA = a.a(this.instanceType, this.instanceId.hashCode() * 31, 31);
        String str = this.dynamicDemandSourceId;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstanceInformation(instanceId=");
        sb.append(this.instanceId);
        sb.append(", instanceType=");
        sb.append(this.instanceType);
        sb.append(", dynamicDemandSourceId=");
        return a.p(sb, this.dynamicDemandSourceId, ')');
    }

    public dj(String instanceId, int i2, String str) {
        Intrinsics.f(instanceId, "instanceId");
        this.instanceId = instanceId;
        this.instanceType = i2;
        this.dynamicDemandSourceId = str;
    }

    public final dj a(String instanceId, int instanceType, String dynamicDemandSourceId) {
        Intrinsics.f(instanceId, "instanceId");
        return new dj(instanceId, instanceType, dynamicDemandSourceId);
    }

    public /* synthetic */ dj(String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }
}
