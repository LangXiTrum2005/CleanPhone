package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0330f3 implements InterfaceC0459m7 {

    /* JADX INFO: renamed from: com.ironsource.f3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends AbstractC0330f3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f28611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b firstReason) {
            super(null);
            kotlin.jvm.internal.n.f(firstReason, "firstReason");
            this.f28611a = firstReason;
        }

        public final a a(b firstReason) {
            kotlin.jvm.internal.n.f(firstReason, "firstReason");
            return new a(firstReason);
        }

        public final b d() {
            return this.f28611a;
        }

        public final b e() {
            return this.f28611a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f28611a, ((a) obj).f28611a);
        }

        public int hashCode() {
            return this.f28611a.hashCode();
        }

        public String toString() {
            return "First(firstReason=" + this.f28611a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f28611a;
            }
            return aVar.a(bVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class b implements InterfaceC0459m7 {

        /* JADX INFO: renamed from: com.ironsource.f3$b$a */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28612a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0070b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0070b f28613a = new C0070b();

            private C0070b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$b$c */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f28614a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC0459m7
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C0070b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new aa.b((byte) 0, 20);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends AbstractC0330f3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f28615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f28616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, d recurringReason) {
            super(null);
            kotlin.jvm.internal.n.f(recurringReason, "recurringReason");
            this.f28615a = j10;
            this.f28616b = recurringReason;
        }

        public final c a(long j10, d recurringReason) {
            kotlin.jvm.internal.n.f(recurringReason, "recurringReason");
            return new c(j10, recurringReason);
        }

        public final long d() {
            return this.f28615a;
        }

        public final d e() {
            return this.f28616b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f28615a == cVar.f28615a && kotlin.jvm.internal.n.a(this.f28616b, cVar.f28616b);
        }

        public final d f() {
            return this.f28616b;
        }

        public final long g() {
            return this.f28615a;
        }

        public int hashCode() {
            return this.f28616b.hashCode() + (Long.hashCode(this.f28615a) * 31);
        }

        public String toString() {
            return "Recurring(reloadDuration=" + this.f28615a + ", recurringReason=" + this.f28616b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j10, d dVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f28615a;
            }
            if ((i10 & 2) != 0) {
                dVar = cVar.f28616b;
            }
            return cVar.a(j10, dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.f3$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class d implements InterfaceC0459m7 {

        /* JADX INFO: renamed from: com.ironsource.f3$d$a */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28617a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$b */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f28618a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$c */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f28619a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0071d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0071d f28620a = new C0071d();

            private C0071d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$e */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f28621a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$f */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f28622a;

            public f(long j10) {
                super(null);
                this.f28622a = j10;
            }

            public final f a(long j10) {
                return new f(j10);
            }

            public final long c() {
                return this.f28622a;
            }

            public final long d() {
                return this.f28622a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f28622a == ((f) obj).f28622a;
            }

            public int hashCode() {
                return Long.hashCode(this.f28622a);
            }

            public String toString() {
                return defpackage.e.j(this.f28622a, "ResumeVisibility(notVisibleDuration=", ")");
            }

            public static /* synthetic */ f a(f fVar, long j10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j10 = fVar.f28622a;
                }
                return fVar.a(j10);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$g */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f28623a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.f3$d$h */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class h extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f28624a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(kotlin.jvm.internal.g gVar) {
            this();
        }

        @Override // com.ironsource.InterfaceC0459m7
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
            if (this instanceof C0071d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new aa.b((byte) 0, 20);
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC0330f3(kotlin.jvm.internal.g gVar) {
        this();
    }

    @Override // com.ironsource.InterfaceC0459m7
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new aa.b((byte) 0, 20);
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new aa.b((byte) 0, 20);
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new aa.b((byte) 0, 20);
    }

    private AbstractC0330f3() {
    }
}
