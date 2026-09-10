package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/tm;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "a", "b", "Lcom/ironsource/tm$a;", "Lcom/ironsource/tm$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface tm<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/tm$a;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ironsource/tm;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "error", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "b", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;", "<init>", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a<T> implements tm<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IronSourceError error;

        public a(IronSourceError error) {
            Intrinsics.f(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IronSourceError getError() {
            return this.error;
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

        public final a<T> a(IronSourceError error) {
            Intrinsics.f(error, "error");
            return new a<>(error);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                ironSourceError = aVar.error;
            }
            return aVar.a(ironSourceError);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/ironsource/tm$b;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ironsource/tm;", "a", "()Ljava/lang/Object;", "value", "(Ljava/lang/Object;)Lcom/ironsource/tm$b;", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/Object;", "b", "<init>", "(Ljava/lang/Object;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b<T> implements tm<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T value;

        public b(T t) {
            this.value = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = bVar.value;
            }
            return bVar.a(obj);
        }

        public final T b() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.a(this.value, ((b) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }

        public final b<T> a(T value) {
            return new b<>(value);
        }

        public final T a() {
            return this.value;
        }
    }
}
