package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/hr;", "", "<init>", "()V", "a", "b", "Lcom/ironsource/hr$a;", "Lcom/ironsource/hr$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
abstract class hr {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/hr$a;", "Lcom/ironsource/hr;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "error", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "b", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a extends hr {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IronSourceError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IronSourceError error) {
            super(null);
            Intrinsics.f(error, "error");
            this.error = error;
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                ironSourceError = aVar.error;
            }
            return aVar.a(ironSourceError);
        }

        public final IronSourceError b() {
            return this.error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.a(this.error, ((a) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ')';
        }

        public final a a(IronSourceError error) {
            Intrinsics.f(error, "error");
            return new a(error);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IronSourceError getError() {
            return this.error;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/hr$b;", "Lcom/ironsource/hr;", "Lcom/ironsource/r1;", "a", "adUnitCallback", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/r1;", "b", "()Lcom/ironsource/r1;", "<init>", "(Lcom/ironsource/r1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b extends hr {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final r1 adUnitCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r1 adUnitCallback) {
            super(null);
            Intrinsics.f(adUnitCallback, "adUnitCallback");
            this.adUnitCallback = adUnitCallback;
        }

        public static /* synthetic */ b a(b bVar, r1 r1Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                r1Var = bVar.adUnitCallback;
            }
            return bVar.a(r1Var);
        }

        public final r1 b() {
            return this.adUnitCallback;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.a(this.adUnitCallback, ((b) other).adUnitCallback);
        }

        public int hashCode() {
            return this.adUnitCallback.hashCode();
        }

        public String toString() {
            return "Success(adUnitCallback=" + this.adUnitCallback + ')';
        }

        public final b a(r1 adUnitCallback) {
            Intrinsics.f(adUnitCallback, "adUnitCallback");
            return new b(adUnitCallback);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r1 getAdUnitCallback() {
            return this.adUnitCallback;
        }
    }

    private hr() {
    }

    public /* synthetic */ hr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
