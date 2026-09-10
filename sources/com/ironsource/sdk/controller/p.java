package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C0474n4;
import com.ironsource.InterfaceC0344g;
import com.ironsource.InterfaceC0362h;
import com.ironsource.Rc;
import com.ironsource.Sc;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f30480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC0344g f30481b;

            public a(Sc configurations, InterfaceC0344g intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f30480a = configurations;
                this.f30481b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.f30481b.a();
                intentA.setData(Uri.parse(openUrl.d()));
                String strC = openUrl.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(openUrl.c());
                    kotlin.jvm.internal.n.e(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.f30480a.c());
                }
                kotlin.jvm.internal.n.e(intentA, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentA);
                return c.b.f30488a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class C0086b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30482a;

            public C0086b(String method) {
                kotlin.jvm.internal.n.f(method, "method");
                this.f30482a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                return new c.a(defpackage.e.o("method ", this.f30482a, " is unsupported"));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f30483a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC0362h f30484b;

            public c(Sc configurations, InterfaceC0362h intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f30483a = configurations;
                this.f30484b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f30484b).a(this.f30483a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f30488a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Sc f30485a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC0362h f30486b;

            public d(Sc configurations, InterfaceC0362h intentFactory) {
                kotlin.jvm.internal.n.f(configurations, "configurations");
                kotlin.jvm.internal.n.f(intentFactory, "intentFactory");
                this.f30485a = configurations;
                this.f30486b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Rc openUrl) {
                kotlin.jvm.internal.n.f(context, "context");
                kotlin.jvm.internal.n.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f30486b).a(this.f30485a.c()).a(openUrl.d()).a(this.f30485a.d()).b(true).a(context));
                return c.b.f30488a;
            }
        }

        c a(Context context, Rc rc2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f30487a;

            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f30487a;
            }

            public final String b() {
                return this.f30487a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f30487a, ((a) obj).f30487a);
            }

            public int hashCode() {
                return this.f30487a.hashCode();
            }

            public String toString() {
                return defpackage.e.o("Error(errorMessage=", this.f30487a, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
                this.f30487a = errorMessage;
            }

            public final a a(String errorMessage) {
                kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.g gVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f30487a;
                }
                return aVar.a(str);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30488a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Rc rc2);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f30479a;

        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        public a(String method, Sc openUrlConfigurations, InterfaceC0362h activityIntentFactory, InterfaceC0344g actionIntentFactory) {
            b aVar;
            kotlin.jvm.internal.n.f(method, "method");
            kotlin.jvm.internal.n.f(openUrlConfigurations, "openUrlConfigurations");
            kotlin.jvm.internal.n.f(activityIntentFactory, "activityIntentFactory");
            kotlin.jvm.internal.n.f(actionIntentFactory, "actionIntentFactory");
            int iHashCode = method.hashCode();
            if (iHashCode != -1455867212) {
                if (iHashCode != 109770977) {
                    if (iHashCode == 1224424441 && method.equals(X3.i.K)) {
                        aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                    } else {
                        aVar = new b.C0086b(method);
                    }
                } else if (method.equals(X3.i.U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                } else {
                    aVar = new b.C0086b(method);
                }
            } else if (method.equals(X3.i.J)) {
                aVar = new b.a(openUrlConfigurations, actionIntentFactory);
            } else {
                aVar = new b.C0086b(method);
            }
            this.f30479a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Rc openUrl) {
            kotlin.jvm.internal.n.f(context, "context");
            kotlin.jvm.internal.n.f(openUrl, "openUrl");
            try {
                return this.f30479a.a(context, openUrl);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                String message = e10.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e10.getMessage();
                kotlin.jvm.internal.n.c(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, Sc openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.c(), new k.a());
            kotlin.jvm.internal.n.f(method, "method");
            kotlin.jvm.internal.n.f(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
