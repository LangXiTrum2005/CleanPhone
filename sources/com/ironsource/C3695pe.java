package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3695pe implements InterfaceC3845yc {
    public static final C3695pe a = new C3695pe();
    private static final C3745se b = new C3745se();

    /* JADX INFO: renamed from: com.ironsource.pe$a */
    public static final class a implements InterfaceC3534ge {
        final /* synthetic */ InterfaceC3534ge a;

        public a(InterfaceC3534ge interfaceC3534ge) {
            this.a = interfaceC3534ge;
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3426ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C3745se c3745se = C3695pe.b;
            final InterfaceC3534ge interfaceC3534ge = this.a;
            c3745se.c(new Runnable() { // from class: com.ironsource.ctenidium
                @Override // java.lang.Runnable
                public final void run() {
                    C3695pe.a.a(sdkConfig, interfaceC3534ge);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3426ae sdkConfig, InterfaceC3534ge listener) {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            C3695pe.a.a(sdkConfig, listener);
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3462ce error, final C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C3745se c3745se = C3695pe.b;
            final InterfaceC3534ge interfaceC3534ge = this.a;
            c3745se.b(new Runnable() { // from class: com.ironsource.puffin
                @Override // java.lang.Runnable
                public final void run() {
                    C3695pe.a.a(interfaceC3534ge, error, c3439b9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(InterfaceC3534ge listener, C3462ce error, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(error, "$error");
            listener.a(error, c3439b9);
        }
    }

    private C3695pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, C3570ie initRequest, InterfaceC3534ge listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        new R9().a(EnumC3552he.LEVEL_PLAY_INIT);
        a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, C3570ie initRequest, InterfaceC3534ge listener) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        com.ironsource.mediationsdk.p pVarH = com.ironsource.mediationsdk.p.h();
        String strD = initRequest.d();
        IronSource.a[] aVarArr = (IronSource.a[]) initRequest.e().toArray(new IronSource.a[0]);
        List<IronSource.a> validAdUnitsList = pVarH.a(context, strD, false, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        Intrinsics.checkNotNullExpressionValue(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        new R9().a(EnumC3552he.EXTERNAL_MEDIATION_INIT);
        a.a(context, initRequest, listener, true);
    }

    public final void c(final Context context, final C3570ie initRequest, final InterfaceC3534ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new Runnable() { // from class: com.ironsource.miliaria
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C3695pe.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3845yc
    public void onInitFailed(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        b.c(new Runnable() { // from class: com.ironsource.liable
            @Override // java.lang.Runnable
            public final void run() {
                C3695pe.a(error);
            }
        });
    }

    public final void a(final Context context, final C3570ie initRequest, final InterfaceC3534ge listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b.d(new Runnable() { // from class: com.ironsource.twybill
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C3695pe.b(context, initRequest, listener);
            }
        });
    }

    private final void a(Context context, C3570ie c3570ie, final InterfaceC3534ge interfaceC3534ge, boolean z) throws Throwable {
        String strF = c3570ie.f();
        if (strF != null && strF.length() > 0) {
            com.ironsource.mediationsdk.p.h().j(c3570ie.f());
        } else {
            c3570ie = new C3570ie(c3570ie.d(), com.ironsource.mediationsdk.p.h().j(), CollectionsKt.basify(c3570ie.e()));
        }
        com.ironsource.mediationsdk.p pVarH = com.ironsource.mediationsdk.p.h();
        String strD = c3570ie.d();
        IronSource.a[] aVarArr = (IronSource.a[]) c3570ie.e().toArray(new IronSource.a[0]);
        final IronSourceError ironSourceErrorA = pVarH.a(context, strD, z, this, (IronSource.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        if (ironSourceErrorA != null && ironSourceErrorA.getErrorCode() != 2020) {
            if (ironSourceErrorA.getErrorCode() == 2040) {
                Ie ieE = com.ironsource.mediationsdk.p.h().e();
                if (ieE != null) {
                    a(new C3426ae(new C3587je(ieE), null, null, 6, null), interfaceC3534ge);
                    return;
                }
            } else if (ironSourceErrorA.getErrorCode() == 2030) {
                C3677oe.l.a().e();
                return;
            }
            b.b(new Runnable() { // from class: com.ironsource.vir
                @Override // java.lang.Runnable
                public final void run() {
                    C3695pe.a(interfaceC3534ge, ironSourceErrorA);
                }
            });
            return;
        }
        C3677oe.l.a().a(context, c3570ie, new a(interfaceC3534ge));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ie serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C3677oe.l.a().a(new C3587je(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3534ge listener, IronSourceError error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullExpressionValue(error, "error");
        InterfaceC3534ge.a(listener, new C3462ce(error), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C3426ae c3426ae, final InterfaceC3534ge interfaceC3534ge) {
        if (!com.ironsource.mediationsdk.p.h().a(false, c3426ae.d())) {
            b.b(new Runnable() { // from class: com.ironsource.incorrectly
                @Override // java.lang.Runnable
                public final void run() {
                    C3695pe.a(interfaceC3534ge);
                }
            });
        } else {
            b.b(new Runnable() { // from class: com.ironsource.hyalinization
                @Override // java.lang.Runnable
                public final void run() {
                    C3695pe.a(interfaceC3534ge, c3426ae);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3534ge listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        InterfaceC3534ge.a(listener, new C3462ce(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC3534ge listener, C3426ae sdkInitResponse) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    @Override // com.ironsource.InterfaceC3845yc
    public void a(final Ie serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        b.c(new Runnable() { // from class: com.ironsource.tailoring
            @Override // java.lang.Runnable
            public final void run() {
                C3695pe.b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        C3677oe.l.a().a(new C3462ce(error));
    }
}
