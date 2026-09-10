package com.ironsource;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3571ig {

    /* JADX INFO: renamed from: com.ironsource.ig$a */
    public static final class a extends AbstractC3571ig {
        private final AbstractC3554hg a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3554hg error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public final AbstractC3554hg a() {
            return this.a;
        }

        public final AbstractC3554hg b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.wireman(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public final a a(AbstractC3554hg error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error);
        }

        public static /* synthetic */ a a(a aVar, AbstractC3554hg abstractC3554hg, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC3554hg = aVar.a;
            }
            return aVar.a(abstractC3554hg);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ig$b */
    public static final class b extends AbstractC3571ig {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC3571ig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3571ig() {
    }
}
