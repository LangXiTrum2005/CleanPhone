package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0004\u0003\tB\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ironsource/j7;", "Lcom/ironsource/k7;", "", "c", "b", "", "a", "<init>", "()V", "d", "Lcom/ironsource/j7$a;", "Lcom/ironsource/j7$c;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public abstract class j7 implements k7 {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/j7$a;", "Lcom/ironsource/j7;", "Lcom/ironsource/j7$b;", "d", "firstReason", "a", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Lcom/ironsource/j7$b;", "e", "()Lcom/ironsource/j7$b;", "<init>", "(Lcom/ironsource/j7$b;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a extends j7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b firstReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            Intrinsics.f(firstReason, "firstReason");
            this.firstReason = firstReason;
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bVar = aVar.firstReason;
            }
            return aVar.a(bVar);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getFirstReason() {
            return this.firstReason;
        }

        public final b e() {
            return this.firstReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && Intrinsics.a(this.firstReason, ((a) other).firstReason);
        }

        public int hashCode() {
            return this.firstReason.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.firstReason + ')';
        }

        public final a a(b firstReason) {
            Intrinsics.f(firstReason, "firstReason");
            return new a(firstReason);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ironsource/j7$b;", "Lcom/ironsource/k7;", "", "a", "<init>", "()V", "b", "c", "Lcom/ironsource/j7$b$a;", "Lcom/ironsource/j7$b$b;", "Lcom/ironsource/j7$b$c;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class b implements k7 {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$b$a;", "Lcom/ironsource/j7$b;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25390a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j7$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$b$b;", "Lcom/ironsource/j7$b;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0281b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0281b f25391a = new C0281b();

            private C0281b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$b$c;", "Lcom/ironsource/j7$b;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f25392a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        @Override // com.p004ironsource.k7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0281b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ironsource/j7$c;", "Lcom/ironsource/j7;", "", "d", "Lcom/ironsource/j7$d;", "e", "reloadDuration", "recurringReason", "a", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "J", g.f40227p, "()J", "b", "Lcom/ironsource/j7$d;", f.j, "()Lcom/ironsource/j7$d;", "<init>", "(JLcom/ironsource/j7$d;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class c extends j7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long reloadDuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d recurringReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, d recurringReason) {
            super(null);
            Intrinsics.f(recurringReason, "recurringReason");
            this.reloadDuration = j;
            this.recurringReason = recurringReason;
        }

        public final c a(long reloadDuration, d recurringReason) {
            Intrinsics.f(recurringReason, "recurringReason");
            return new c(reloadDuration, recurringReason);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getReloadDuration() {
            return this.reloadDuration;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d getRecurringReason() {
            return this.recurringReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.reloadDuration == cVar.reloadDuration && Intrinsics.a(this.recurringReason, cVar.recurringReason);
        }

        public final d f() {
            return this.recurringReason;
        }

        public final long g() {
            return this.reloadDuration;
        }

        public int hashCode() {
            return this.recurringReason.hashCode() + (Long.hashCode(this.reloadDuration) * 31);
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.reloadDuration + ", recurringReason=" + this.recurringReason + ')';
        }

        public static /* synthetic */ c a(c cVar, long j, d dVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = cVar.reloadDuration;
            }
            if ((i2 & 2) != 0) {
                dVar = cVar.recurringReason;
            }
            return cVar.a(j, dVar);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0005\u0003\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/ironsource/j7$d;", "Lcom/ironsource/k7;", "", "b", "", "a", "<init>", "()V", "c", "d", "e", com.smartdigimkt.h5.f.j, com.smartdigimkt.y4.g.f40227p, com.smartdigimkt.m3.h.f36614b, "Lcom/ironsource/j7$d$a;", "Lcom/ironsource/j7$d$b;", "Lcom/ironsource/j7$d$c;", "Lcom/ironsource/j7$d$d;", "Lcom/ironsource/j7$d$e;", "Lcom/ironsource/j7$d$f;", "Lcom/ironsource/j7$d$g;", "Lcom/ironsource/j7$d$h;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class d implements k7 {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$a;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25395a = new a();

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$b;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f25396a = new b();

            private b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$c;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f25397a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.j7$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$d;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0282d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0282d f25398a = new C0282d();

            private C0282d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$e;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f25399a = new e();

            private e() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ironsource/j7$d$f;", "Lcom/ironsource/j7$d;", "", "c", "notVisibleDuration", "a", "", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "J", "d", "()J", "<init>", "(J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final long notVisibleDuration;

            public f(long j) {
                super(null);
                this.notVisibleDuration = j;
            }

            public final f a(long notVisibleDuration) {
                return new f(notVisibleDuration);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final long getNotVisibleDuration() {
                return this.notVisibleDuration;
            }

            public final long d() {
                return this.notVisibleDuration;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && this.notVisibleDuration == ((f) other).notVisibleDuration;
            }

            public int hashCode() {
                return Long.hashCode(this.notVisibleDuration);
            }

            public String toString() {
                return androidx.media3.extractor.text.ttml.a.o(new StringBuilder("ResumeVisibility(notVisibleDuration="), this.notVisibleDuration, ')');
            }

            public static /* synthetic */ f a(f fVar, long j, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = fVar.notVisibleDuration;
                }
                return fVar.a(j);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$g;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f25401a = new g();

            private g() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/j7$d$h;", "Lcom/ironsource/j7$d;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f25402a = new h();

            private h() {
                super(null);
            }
        }

        private d() {
        }

        @Override // com.p004ironsource.k7
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C0282d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private j7() {
    }

    @Override // com.p004ironsource.k7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ j7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
