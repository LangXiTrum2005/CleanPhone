package oilcan;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oilcan.monoploid, reason: from toString */
/* JADX INFO: compiled from: ComposeStackTraceBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Loilcan/monoploid;", "", "", "group", "dataOffset", "<init>", "(ILjava/lang/Integer;)V", "attabal", "()I", "saneness", "()Ljava/lang/Integer;", "", "toString", "()Ljava/lang/String;", "hashCode", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "I", "getGroup", "Ljava/lang/Integer;", "getDataOffset", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ObjectLocation {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final int group;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer dataOffset;

    public ObjectLocation(int i, Integer num) {
        this.group = i;
        this.dataOffset = num;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getGroup() {
        return this.group;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectLocation)) {
            return false;
        }
        ObjectLocation objectLocation = (ObjectLocation) other;
        return this.group == objectLocation.group && Intrinsics.wireman(this.dataOffset, objectLocation.dataOffset);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.group) * 31;
        Integer num = this.dataOffset;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Integer getDataOffset() {
        return this.dataOffset;
    }

    public String toString() {
        return "ObjectLocation(group=" + this.group + ", dataOffset=" + this.dataOffset + ')';
    }
}
