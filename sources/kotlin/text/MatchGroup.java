package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f44708b;

    public MatchGroup(String str, IntRange intRange) {
        this.f44707a = str;
        this.f44708b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.a(this.f44707a, matchGroup.f44707a) && Intrinsics.a(this.f44708b, matchGroup.f44708b);
    }

    public final int hashCode() {
        return this.f44708b.hashCode() + (this.f44707a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f44707a + ", range=" + this.f44708b + ')';
    }
}
