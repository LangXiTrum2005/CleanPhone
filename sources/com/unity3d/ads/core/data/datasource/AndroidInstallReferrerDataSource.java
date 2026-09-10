package com.unity3d.ads.core.data.datasource;

import ak.f;
import android.content.Context;
import android.os.RemoteException;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.d2;
import cn.e2;
import cn.j;
import cn.l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.gms.internal.play_billing.q1;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "Landroid/content/Context;", "appContext", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcn/j;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "continuation", "Lwj/r;", "onError", "(Lcn/j;)V", "invoke", "(Lak/f;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;
    private final Context appContext;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource", f = "AndroidInstallReferrerDataSource.kt", l = {32}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInstallReferrerDataSource.this.invoke(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "<anonymous>", "(Lcn/a0;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", l = {95}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        Object L$0;
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidInstallReferrerDataSource.this.new AnonymousClass2(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = AndroidInstallReferrerDataSource.this;
            this.L$0 = androidInstallReferrerDataSource;
            this.label = 1;
            final l lVar = new l(1, q1.t(this));
            lVar.t();
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(androidInstallReferrerDataSource.appContext).build();
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerServiceDisconnected() {
                        androidInstallReferrerDataSource.onError(lVar);
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerSetupFinished(int responseCode) {
                        try {
                            try {
                                if (responseCode == 0) {
                                    try {
                                        ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                        if (lVar.isActive()) {
                                            j jVar = lVar;
                                            InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
                                            InitializationRequestOuterClass.InstallReferrer.Builder builderNewBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                                            n.e(builderNewBuilder, "newBuilder()");
                                            InstallReferrerKt.Dsl dsl_create = companion._create(builderNewBuilder);
                                            String installReferrer2 = installReferrer.getInstallReferrer();
                                            if (installReferrer2 != null) {
                                                dsl_create.setUrl(installReferrer2);
                                            }
                                            dsl_create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                                            dsl_create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                                            dsl_create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                                            jVar.e(dsl_create._build(), AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$2.INSTANCE);
                                        }
                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
                                    } catch (RemoteException unused) {
                                        androidInstallReferrerDataSource.onError(lVar);
                                    }
                                } else {
                                    androidInstallReferrerDataSource.onError(lVar);
                                }
                            } finally {
                                try {
                                    installReferrerClientBuild.endConnection();
                                } catch (Throwable unused2) {
                                }
                            }
                        } catch (Throwable unused3) {
                            androidInstallReferrerDataSource.onError(lVar);
                        }
                    }
                });
            } catch (Throwable unused) {
                androidInstallReferrerDataSource.onError(lVar);
            }
            Object objS = lVar.s();
            bk.a aVar = bk.a.f5708a;
            return objS == aVar ? aVar : objS;
        }
    }

    public AndroidInstallReferrerDataSource(Context appContext, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(appContext, "appContext");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.appContext = appContext;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(j continuation) {
        if (continuation.isActive()) {
            continuation.resumeWith(null);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_failed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    public Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objE = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                t9.e.z(objE);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objE = d0.E(new e2(500L, anonymousClass1), anonymousClass2);
                bk.a aVar = bk.a.f5708a;
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (AndroidInstallReferrerDataSource) anonymousClass1.L$0;
                t9.e.z(objE);
            }
            return (InitializationRequestOuterClass.InstallReferrer) objE;
        } catch (d2 unused) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "install_referral_fetch_timed_out", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
            return null;
        }
    }
}
