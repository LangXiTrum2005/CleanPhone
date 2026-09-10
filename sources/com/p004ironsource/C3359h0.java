package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ironsource/h0;", "", "Lcom/ironsource/o1$a;", "a", "performance", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/o1$a;", "b", "()Lcom/ironsource/o1$a;", "(Lcom/ironsource/o1$a;)V", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class C3359h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o1.a performance;

    public C3359h0(o1.a performance) {
        Intrinsics.f(performance, "performance");
        this.performance = performance;
    }

    public static /* synthetic */ C3359h0 a(C3359h0 c3359h0, o1.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = c3359h0.performance;
        }
        return c3359h0.a(aVar);
    }

    public final o1.a b() {
        return this.performance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C3359h0) && this.performance == ((C3359h0) other).performance;
    }

    public int hashCode() {
        return this.performance.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.performance + ')';
    }

    public final C3359h0 a(o1.a performance) {
        Intrinsics.f(performance, "performance");
        return new C3359h0(performance);
    }

    public final void b(o1.a aVar) {
        Intrinsics.f(aVar, "<set-?>");
        this.performance = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o1.a getPerformance() {
        return this.performance;
    }
}
