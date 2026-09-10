package com.unity3d.services.core.di;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.d;
import wj.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/unity3d/services/core/di/IServiceComponent;", "", "named", "get", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;)Ljava/lang/Object;", "Lwj/e;", X3.a.f27684t, "Lwj/d;", "inject", "(Lcom/unity3d/services/core/di/IServiceComponent;Ljava/lang/String;Lwj/e;)Lwj/d;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class IServiceComponentKt {

    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1 extends o implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // jk.a
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            n.k();
            throw null;
        }
    }

    public static final <T> T get(IServiceComponent iServiceComponent, String named) {
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        n.k();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String named, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        n.k();
        throw null;
    }

    public static final <T> d inject(IServiceComponent iServiceComponent, String named, e mode) {
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        n.f(mode, "mode");
        n.k();
        throw null;
    }

    public static d inject$default(IServiceComponent iServiceComponent, String named, e mode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            named = "";
        }
        if ((i10 & 2) != 0) {
            mode = e.f53281b;
        }
        n.f(iServiceComponent, "<this>");
        n.f(named, "named");
        n.f(mode, "mode");
        n.k();
        throw null;
    }
}
