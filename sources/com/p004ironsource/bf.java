package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/bf;", "", "Lcom/ironsource/cf;", "handler", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface bf {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ironsource/bf$a;", "Lcom/ironsource/bf;", "Lcom/ironsource/cf;", "handler", "", "a", "Lcom/ironsource/ye;", "failure", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/ye;", "b", "()Lcom/ironsource/ye;", "<init>", "(Lcom/ironsource/ye;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a implements bf {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ye failure;

        public a(ye failure) {
            Intrinsics.f(failure, "failure");
            this.failure = failure;
        }

        public static /* synthetic */ a a(a aVar, ye yeVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                yeVar = aVar.failure;
            }
            return aVar.a(yeVar);
        }

        public final ye b() {
            return this.failure;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.a(this.failure, ((a) other).failure);
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.failure + ')';
        }

        public final a a(ye failure) {
            Intrinsics.f(failure, "failure");
            return new a(failure);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ye getFailure() {
            return this.failure;
        }

        @Override // com.p004ironsource.bf
        public void a(cf handler) {
            Intrinsics.f(handler, "handler");
            handler.a(this.failure);
        }
    }

    default void a(cf handler) {
        Intrinsics.f(handler, "handler");
    }
}
