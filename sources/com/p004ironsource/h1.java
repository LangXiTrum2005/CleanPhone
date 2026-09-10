package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/h1;", "", "", "a", "()Z", "isReady", "b", "Lcom/ironsource/h1$a;", "Lcom/ironsource/h1$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface h1 {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/h1$a;", "Lcom/ironsource/h1;", "", "b", "reason", "a", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "()Z", "isReady", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a implements h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String reason;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isReady;

        /* JADX INFO: renamed from: com.ironsource.h1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/h1$a$a;", "", "", "reason", "Lcom/ironsource/h1$a;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public final a a(String reason) {
                return new a(reason);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ a a(a aVar, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.reason;
            }
            return aVar.a(str);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final String c() {
            return this.reason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.a(this.reason, ((a) other).reason);
        }

        public int hashCode() {
            String str = this.reason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("NotReady(reason="), this.reason, ')');
        }

        public a(String str) {
            this.reason = str;
        }

        public final a a(String reason) {
            return new a(reason);
        }

        public /* synthetic */ a(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str);
        }

        @Override // com.p004ironsource.h1
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsReady() {
            return this.isReady;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/h1$b;", "Lcom/ironsource/h1;", "", "b", "Z", "a", "()Z", "isReady", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25188a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final boolean isReady = true;

        private b() {
        }

        @Override // com.p004ironsource.h1
        /* JADX INFO: renamed from: a */
        public boolean getIsReady() {
            return isReady;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean getIsReady();
}
