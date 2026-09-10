package com.p004ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.InterfaceC3356g;
import com.p004ironsource.InterfaceC3358h;
import com.p004ironsource.d9;
import com.p004ironsource.q9;
import com.p004ironsource.vp;
import com.p004ironsource.wp;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/p;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface p {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ironsource/sdk/controller/p$a;", "Lcom/ironsource/sdk/controller/p;", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/sdk/controller/p$b;", "Lcom/ironsource/sdk/controller/p$b;", "openUrlStrategy", "", "method", "Lcom/ironsource/wp;", "openUrlConfigurations", "Lcom/ironsource/h;", "activityIntentFactory", "Lcom/ironsource/g;", "actionIntentFactory", "<init>", "(Ljava/lang/String;Lcom/ironsource/wp;Lcom/ironsource/h;Lcom/ironsource/g;)V", "(Ljava/lang/String;Lcom/ironsource/wp;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b openUrlStrategy;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, wp openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            Intrinsics.f(method, "method");
            Intrinsics.f(openUrlConfigurations, "openUrlConfigurations");
        }

        @Override // com.p004ironsource.sdk.controller.p
        public c a(Context context, vp openUrl) {
            Intrinsics.f(context, "context");
            Intrinsics.f(openUrl, "openUrl");
            try {
                return this.openUrlStrategy.a(context, openUrl);
            } catch (Exception e2) {
                q9.d().a(e2);
                String message = e2.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e2.getMessage();
                Intrinsics.c(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        public a(String method, wp openUrlConfigurations, InterfaceC3358h activityIntentFactory, InterfaceC3356g actionIntentFactory) {
            b aVar;
            Intrinsics.f(method, "method");
            Intrinsics.f(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.f(activityIntentFactory, "activityIntentFactory");
            Intrinsics.f(actionIntentFactory, "actionIntentFactory");
            int iHashCode = method.hashCode();
            if (iHashCode != -1455867212) {
                if (iHashCode != 109770977) {
                    if (iHashCode == 1224424441 && method.equals(d9.h.K)) {
                        aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                    } else {
                        aVar = new b.C0296b(method);
                    }
                } else if (method.equals(d9.h.f24716U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                } else {
                    aVar = new b.C0296b(method);
                }
            } else if (method.equals(d9.h.f24711J)) {
                aVar = new b.a(openUrlConfigurations, actionIntentFactory);
            } else {
                aVar = new b.C0296b(method);
            }
            this.openUrlStrategy = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/sdk/controller/p$b;", "", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$a;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/wp;", "Lcom/ironsource/wp;", "configurations", "Lcom/ironsource/g;", "b", "Lcom/ironsource/g;", "intentFactory", "<init>", "(Lcom/ironsource/wp;Lcom/ironsource/g;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final wp configurations;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final InterfaceC3356g intentFactory;

            public a(wp configurations, InterfaceC3356g intentFactory) {
                Intrinsics.f(configurations, "configurations");
                Intrinsics.f(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, vp openUrl) {
                Intrinsics.f(context, "context");
                Intrinsics.f(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.intentFactory.a();
                intentA.setData(Uri.parse(openUrl.d()));
                String strC = openUrl.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(openUrl.c());
                    Intrinsics.e(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.configurations.c());
                }
                Intrinsics.e(intentA, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentA);
                return c.b.f27005a;
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$b;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "", "Ljava/lang/String;", "method", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0296b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String method;

            public C0296b(String method) {
                Intrinsics.f(method, "method");
                this.method = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, vp openUrl) {
                Intrinsics.f(context, "context");
                Intrinsics.f(openUrl, "openUrl");
                return new c.a(android.support.v4.media.a.r(new StringBuilder("method "), this.method, " is unsupported"));
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$c;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/wp;", "Lcom/ironsource/wp;", "configurations", "Lcom/ironsource/h;", "b", "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/wp;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final wp configurations;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final InterfaceC3358h intentFactory;

            public c(wp configurations, InterfaceC3358h intentFactory) {
                Intrinsics.f(configurations, "configurations");
                Intrinsics.f(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, vp openUrl) {
                Intrinsics.f(context, "context");
                Intrinsics.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f27005a;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$b$d;", "Lcom/ironsource/sdk/controller/p$b;", "Landroid/content/Context;", "context", "Lcom/ironsource/vp;", "openUrl", "Lcom/ironsource/sdk/controller/p$c;", "a", "Lcom/ironsource/wp;", "Lcom/ironsource/wp;", "configurations", "Lcom/ironsource/h;", "b", "Lcom/ironsource/h;", "intentFactory", "<init>", "(Lcom/ironsource/wp;Lcom/ironsource/h;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final wp configurations;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final InterfaceC3358h intentFactory;

            public d(wp configurations, InterfaceC3358h intentFactory) {
                Intrinsics.f(configurations, "configurations");
                Intrinsics.f(intentFactory, "intentFactory");
                this.configurations = configurations;
                this.intentFactory = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, vp openUrl) {
                Intrinsics.f(context, "context");
                Intrinsics.f(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.intentFactory).a(this.configurations.c()).a(openUrl.d()).a(this.configurations.d()).b(true).a(context));
                return c.b.f27005a;
            }
        }

        c a(Context context, vp openUrl);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/sdk/controller/p$c;", "", "<init>", "()V", "a", "b", "Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c$b;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$a;", "Lcom/ironsource/sdk/controller/p$c;", "", "a", "errorMessage", "toString", "", "hashCode", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String errorMessage;

            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ a a(a aVar, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = aVar.errorMessage;
                }
                return aVar.a(str);
            }

            public final String b() {
                return this.errorMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && Intrinsics.a(this.errorMessage, ((a) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return androidx.media3.extractor.text.ttml.a.p(new StringBuilder("Error(errorMessage="), this.errorMessage, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                Intrinsics.f(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            public final a a(String errorMessage) {
                Intrinsics.f(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ironsource/sdk/controller/p$c$b;", "Lcom/ironsource/sdk/controller/p$c;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27005a = new b();

            private b() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    c a(Context context, vp openUrl);
}
