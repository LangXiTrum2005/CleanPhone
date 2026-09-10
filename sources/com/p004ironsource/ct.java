package com.p004ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.p;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/ironsource/ct;", "Lcom/ironsource/gp;", "Landroid/content/Context;", "context", "Lcom/ironsource/vs;", "initRequest", "Lcom/ironsource/ts;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", IronSourceLoadParameters.Constants.DEMAND_ONLY, "", "a", "Lcom/ironsource/ns;", "sdkInitResponse", "c", "Lcom/ironsource/qt;", "serverResponse", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "onInitFailed", "Lcom/ironsource/ft;", "b", "Lcom/ironsource/ft;", "tools", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ct implements gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ct f24585a = new ct();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ft tools = new ft();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/ironsource/ct$a", "Lcom/ironsource/ts;", "Lcom/ironsource/ns;", "sdkConfig", "", "a", "Lcom/ironsource/ps;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ts {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ts f24587a;

        public a(ts tsVar) {
            this.f24587a = tsVar;
        }

        @Override // com.p004ironsource.ts
        public void a(ns sdkConfig) {
            Intrinsics.f(sdkConfig, "sdkConfig");
            ct.tools.a(new B(sdkConfig, this.f24587a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(ns sdkConfig, ts listener) {
            Intrinsics.f(sdkConfig, "$sdkConfig");
            Intrinsics.f(listener, "$listener");
            ct.f24585a.a(sdkConfig, listener);
        }

        @Override // com.p004ironsource.ts
        public void a(ps error) {
            Intrinsics.f(error, "error");
            ct.tools.d(new C(this.f24587a, error, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(ts listener, ps error) {
            Intrinsics.f(listener, "$listener");
            Intrinsics.f(error, "$error");
            listener.a(error);
        }
    }

    private ct() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, vs initRequest, ts listener) {
        Intrinsics.f(context, "$context");
        Intrinsics.f(initRequest, "$initRequest");
        Intrinsics.f(listener, "$listener");
        new hk().a(us.LEVEL_PLAY_INIT);
        f24585a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, vs initRequest, ts listener) {
        Intrinsics.f(context, "$context");
        Intrinsics.f(initRequest, "$initRequest");
        Intrinsics.f(listener, "$listener");
        p pVarJ = p.j();
        String strD = initRequest.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.e().toArray(new IronSource.AD_UNIT[0]);
        List<IronSource.AD_UNIT> validAdUnitsList = pVarJ.a(context, strD, false, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        Intrinsics.e(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new hk().a(us.EXTERNAL_MEDIATION_INIT);
        f24585a.a(context, initRequest, listener, true);
    }

    public final void c(Context context, vs initRequest, ts listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(initRequest, "initRequest");
        Intrinsics.f(listener, "listener");
        tools.c(new H(context, initRequest, listener, 0));
    }

    @Override // com.p004ironsource.gp
    public void onInitFailed(IronSourceError error) {
        Intrinsics.f(error, "error");
        tools.a(new D(error, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(qt serverResponse) {
        Intrinsics.f(serverResponse, "$serverResponse");
        bt.f24457a.a(new ws(serverResponse));
    }

    public final void a(Context context, vs initRequest, ts listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(initRequest, "initRequest");
        Intrinsics.f(listener, "listener");
        tools.c(new H(context, initRequest, listener, 1));
    }

    private final void a(Context context, vs initRequest, ts listener, boolean demandOnly) {
        String strF = initRequest.f();
        if (strF == null || strF.length() <= 0) {
            initRequest = new vs(initRequest.d(), p.j().l(), CollectionsKt.j0(initRequest.e()));
        } else {
            p.j().p(initRequest.f());
        }
        p pVarJ = p.j();
        String strD = initRequest.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.e().toArray(new IronSource.AD_UNIT[0]);
        IronSourceError ironSourceErrorA = pVarJ.a(context, strD, demandOnly, null, this, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        if (ironSourceErrorA == null || ironSourceErrorA.getErrorCode() == 2020) {
            bt.f24457a.a(context, initRequest, new a(listener));
            return;
        }
        if (ironSourceErrorA.getErrorCode() == 2040) {
            qt qtVarE = p.j().e();
            if (qtVarE != null) {
                a(new ns(new ws(qtVarE)), listener);
                return;
            }
        } else if (ironSourceErrorA.getErrorCode() == 2030) {
            bt.f24457a.e();
            return;
        }
        tools.d(new G0(7, listener, ironSourceErrorA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.f(error, "$error");
        bt.f24457a.b(new ps(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ns sdkInitResponse, ts listener) {
        if (p.j().a(false, sdkInitResponse.d())) {
            tools.d(new B(listener, sdkInitResponse, 1));
        } else {
            tools.d(new D(listener, 4));
        }
    }

    @Override // com.p004ironsource.gp
    public void a(qt serverResponse) {
        Intrinsics.f(serverResponse, "serverResponse");
        tools.a(new D(serverResponse, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ts listener) {
        Intrinsics.f(listener, "$listener");
        listener.a(new ps(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ts listener, IronSourceError error) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.e(error, "error");
        listener.a(new ps(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ts listener, ns sdkInitResponse) {
        Intrinsics.f(listener, "$listener");
        Intrinsics.f(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }
}
