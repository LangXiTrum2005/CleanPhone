package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ce implements Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ce f25903a = new Ce();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Fe f25904b = new Fe();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0591te {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0591te f25905a;

        public a(InterfaceC0591te interfaceC0591te) {
            this.f25905a = interfaceC0591te;
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0484ne sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            Ce.f25904b.c(new qh(sdkConfig, this.f25905a));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0484ne sdkConfig, InterfaceC0591te listener) {
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.f(listener, "$listener");
            Ce.f25903a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            Ce.f25904b.b(new ph(this.f25905a, error, c0300d9, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC0591te listener, C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(listener, "$listener");
            kotlin.jvm.internal.n.f(error, "$error");
            listener.a(error, c0300d9);
        }
    }

    private Ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C0627ve initRequest, InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(listener, "$listener");
        new U9().a(EnumC0609ue.LEVEL_PLAY_INIT);
        f25903a.a(context, initRequest, listener, false);
    }

    @Override // com.ironsource.Dc
    public void onInitFailed(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        f25904b.c(new androidx.fragment.app.n(error, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C0627ve initRequest, InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(listener, "$listener");
        com.ironsource.mediationsdk.p pVarH = com.ironsource.mediationsdk.p.h();
        String strD = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = pVarH.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        kotlin.jvm.internal.n.e(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new U9().a(EnumC0609ue.EXTERNAL_MEDIATION_INIT);
        f25903a.a(context, initRequest, listener, true);
    }

    public final void c(Context context, C0627ve initRequest, InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        f25904b.c(new rh(context, initRequest, listener, 1));
    }

    public final void a(Context context, C0627ve initRequest, InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        f25904b.c(new rh(context, initRequest, listener, 0));
    }

    private final void a(Context context, C0627ve c0627ve, InterfaceC0591te interfaceC0591te, boolean z10) {
        String strF = c0627ve.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c0627ve.f());
        } else {
            c0627ve = new C0627ve(c0627ve.d(), com.ironsource.mediationsdk.p.h().j(), xj.n.O0(c0627ve.e()));
        }
        com.ironsource.mediationsdk.p pVarH = com.ironsource.mediationsdk.p.h();
        String strD = c0627ve.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c0627ve.e().toArray(new IronSource.a[0]);
        IronSourceError ironSourceErrorA = pVarH.a(context, strD, z10, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Ve veE = com.ironsource.mediationsdk.p.h().e();
                if (veE != null) {
                    a(new C0484ne(new C0645we(veE), null, null, 6, null), interfaceC0591te);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                Be.l.a().d();
                return;
            }
            f25904b.b(new ki(11, interfaceC0591te, ironSourceErrorA));
            return;
        }
        Be.l.a().a(context, c0627ve, new a(interfaceC0591te));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ve serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "$serverResponse");
        Be.l.a().a(new C0645we(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0591te listener, IronSourceError error) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.e(error, "error");
        InterfaceC0591te.a(listener, new C0520pe(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C0484ne c0484ne, InterfaceC0591te interfaceC0591te) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c0484ne.d())) {
            f25904b.b(new androidx.fragment.app.n(interfaceC0591te, 19));
        } else {
            f25904b.b(new qh(interfaceC0591te, c0484ne, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0591te listener) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        InterfaceC0591te.a(listener, new C0520pe(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC0591te listener, C0484ne sdkInitResponse) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.Dc
    public void a(Ve serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        f25904b.c(new androidx.fragment.app.n(serverResponse, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "$error");
        Be.l.a().a(new C0520pe(error));
    }
}
