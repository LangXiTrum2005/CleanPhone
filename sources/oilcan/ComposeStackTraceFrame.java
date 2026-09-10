package oilcan;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oilcan.dern, reason: from toString */
/* JADX INFO: compiled from: ComposeStackTrace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Loilcan/dern;", "", "Loilcan/adultoid;", "sourceInfo", "", "groupOffset", "<init>", "(Loilcan/adultoid;Ljava/lang/Integer;)V", "attabal", "(Loilcan/adultoid;Ljava/lang/Integer;)Loilcan/dern;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Loilcan/adultoid;", "wireman", "()Loilcan/adultoid;", "saneness", "Ljava/lang/Integer;", "dern", "()Ljava/lang/Integer;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComposeStackTraceFrame {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final adultoid sourceInfo;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer groupOffset;

    public ComposeStackTraceFrame(adultoid adultoidVar, Integer num) {
        this.sourceInfo = adultoidVar;
        this.groupOffset = num;
    }

    public static /* synthetic */ ComposeStackTraceFrame saneness(ComposeStackTraceFrame composeStackTraceFrame, adultoid adultoidVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            adultoidVar = composeStackTraceFrame.sourceInfo;
        }
        if ((i & 2) != 0) {
            num = composeStackTraceFrame.groupOffset;
        }
        return composeStackTraceFrame.attabal(adultoidVar, num);
    }

    public final ComposeStackTraceFrame attabal(adultoid sourceInfo, Integer groupOffset) {
        return new ComposeStackTraceFrame(sourceInfo, groupOffset);
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final Integer getGroupOffset() {
        return this.groupOffset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeStackTraceFrame)) {
            return false;
        }
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) other;
        return Intrinsics.wireman(this.sourceInfo, composeStackTraceFrame.sourceInfo) && Intrinsics.wireman(this.groupOffset, composeStackTraceFrame.groupOffset);
    }

    public int hashCode() {
        int iHashCode = this.sourceInfo.hashCode() * 31;
        Integer num = this.groupOffset;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.sourceInfo + ", groupOffset=" + this.groupOffset + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final adultoid getSourceInfo() {
        return this.sourceInfo;
    }
}
