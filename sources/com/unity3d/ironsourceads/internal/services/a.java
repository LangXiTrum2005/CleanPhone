package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C0407j9;
import com.ironsource.EnumC0443l9;
import defpackage.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class AbstractC0221a {

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0222a extends AbstractC0221a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f38461a;

            public C0222a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f38461a;
            }

            public final String b() {
                return this.f38461a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0222a) && n.a(this.f38461a, ((C0222a) obj).f38461a);
            }

            public int hashCode() {
                return this.f38461a.hashCode();
            }

            public String toString() {
                return e.o("Error(errorMessage=", this.f38461a, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0222a(String errorMessage) {
                super(null);
                n.f(errorMessage, "errorMessage");
                this.f38461a = errorMessage;
            }

            public final C0222a a(String errorMessage) {
                n.f(errorMessage, "errorMessage");
                return new C0222a(errorMessage);
            }

            public /* synthetic */ C0222a(String str, int i10, g gVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0222a a(C0222a c0222a, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0222a.f38461a;
                }
                return c0222a.a(str);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b extends AbstractC0221a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f38462a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0221a(g gVar) {
            this();
        }

        private AbstractC0221a() {
        }
    }

    static /* synthetic */ AbstractC0221a a(a aVar, Context context, EnumC0443l9 enumC0443l9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 2) != 0) {
            enumC0443l9 = EnumC0443l9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC0443l9);
    }

    AbstractC0221a a(Context context, C0407j9 c0407j9);

    AbstractC0221a a(Context context, EnumC0443l9 enumC0443l9);
}
