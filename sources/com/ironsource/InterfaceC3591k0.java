package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3591k0 {

    /* JADX INFO: renamed from: com.ironsource.k0$a */
    public static final class a implements InterfaceC3591k0 {
        public static final C0400a c = new C0400a(null);
        private final String a;
        private final boolean b;

        /* JADX INFO: renamed from: com.ironsource.k0$a$a, reason: collision with other inner class name */
        public static final class C0400a {
            public /* synthetic */ C0400a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }

            private C0400a() {
            }
        }

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.wireman(this.a, ((a) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NotReady(reason=" + this.a + ")";
        }

        public a(String str) {
            this.a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC3591k0
        public boolean a() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k0$b */
    public static final class b implements InterfaceC3591k0 {
        public static final b a = new b();
        private static final boolean b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC3591k0
        public boolean a() {
            return b;
        }
    }

    boolean a();
}
