package com.unity3d.services;

import ak.f;
import ak.l;
import android.content.Context;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.f1;
import cn.h1;
import cn.y1;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.ForceAlternativeFlow;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.LogLevelKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.InitializeSDK;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import r9.b;
import wj.d;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010!J!\u0010\u001e\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0014\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010$J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020C8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020I8\nX\u008a\u0084\u0002²\u0006\f\u0010L\u001a\u00020K8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020M8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/unity3d/services/UnityAdsSDK;", "Lcom/unity3d/services/core/di/IServiceComponent;", "Lcom/unity3d/services/core/di/IServiceProvider;", "serviceProvider", "<init>", "(Lcom/unity3d/services/core/di/IServiceProvider;)V", "getServiceProvider", "()Lcom/unity3d/services/core/di/IServiceProvider;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "source", "Lcom/unity3d/ads/InitializationConfiguration;", "initializationConfiguration", "Lcn/f1;", MobileAdsBridgeBase.initializeMethodName, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/InitializationConfiguration;)Lcn/f1;", "placementId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "listener", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "load", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;)Lcn/f1;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "show", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;)Lcn/f1;", "getToken", "()Ljava/lang/String;", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)Lcn/f1;", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;)Lcn/f1;", "opportunityId", "finishOMIDSession", "(Ljava/lang/String;)Lcn/f1;", "Lwj/r;", "sendBannerDestroyed", "()V", "sync", "fetchToken", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/services/core/di/IServiceProvider;", "initializationJob", "Lcn/f1;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "shouldAllowInitialization", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "forceAlternativeFlow", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/services/core/domain/task/InitializeSDK;", "initializeSDK", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "initializeBoldSDK", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "tokenNumberProvider", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getAsyncHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAdObject;", "getAdObject", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "omFinishSession", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UnityAdsSDK implements IServiceComponent {
    private f1 initializationJob;
    private final IServiceProvider serviceProvider;

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", l = {266}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ d $getAdObject$delegate;
        final /* synthetic */ d $omFinishSession$delegate;
        final /* synthetic */ a0 $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, a0 a0Var, d dVar, d dVar2, f fVar) {
            super(2, fVar);
            this.$opportunityId = str;
            this.$omidScope = a0Var;
            this.$getAdObject$delegate = dVar;
            this.$omFinishSession$delegate = dVar2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AdObject adObjectInvoke = UnityAdsSDK.finishOMIDSession$lambda$26(this.$getAdObject$delegate).invoke(this.$opportunityId);
                if (adObjectInvoke != null) {
                    OmFinishSession omFinishSessionFinishOMIDSession$lambda$27 = UnityAdsSDK.finishOMIDSession$lambda$27(this.$omFinishSession$delegate);
                    this.label = 1;
                    Object objInvoke = omFinishSessionFinishOMIDSession$lambda$27.invoke(adObjectInvoke, this);
                    a aVar = a.f5708a;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            d0.j(this.$omidScope);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {184}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        int label;

        public AnonymousClass1(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return UnityAdsSDK.this.new AnonymousClass1(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
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
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
            this.label = 1;
            Object objFetchToken = unityAdsSDK.fetchToken(com.ironsource.mediationsdk.metadata.a.f29610g, this);
            a aVar = a.f5708a;
            return objFetchToken == aVar ? aVar : objFetchToken;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {200}, m = "invokeSuspend")
    public static final class C08262 extends i implements c {
        final /* synthetic */ d $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ a0 $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ d $tokenNumberProvider$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08262(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, a0 a0Var, d dVar, d dVar2, f fVar) {
            super(2, fVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = a0Var;
            this.$getAsyncHeaderBiddingToken$delegate = dVar;
            this.$tokenNumberProvider$delegate = dVar2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C08262(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C08262) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                GetAsyncHeaderBiddingToken token$lambda$15 = UnityAdsSDK.getToken$lambda$15(this.$getAsyncHeaderBiddingToken$delegate);
                int iInvoke = UnityAdsSDK.getToken$lambda$14(this.$tokenNumberProvider$delegate).invoke();
                TokenConfiguration tokenConfiguration = this.$tokenConfiguration;
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                Object objInvoke = token$lambda$15.invoke(iInvoke, tokenConfiguration, iUnityAdsTokenListener, this);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            d0.j(this.$getTokenScope);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {164}, m = "invokeSuspend")
    public static final class C08271 extends i implements c {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ d $context$delegate;
        final /* synthetic */ InternalLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ a0 $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08271(String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, a0 a0Var, d dVar, f fVar) {
            super(2, fVar);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = internalLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = a0Var;
            this.$context$delegate = dVar;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return UnityAdsSDK.this.new C08271(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C08271) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            C08271 c08271;
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.d0.f44761a.b(LegacyLoadUseCase.class));
                Context contextLoad$lambda$12 = UnityAdsSDK.load$lambda$12(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                InternalLoadListener internalLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                c08271 = this;
                Object objInvoke = legacyLoadUseCase.invoke(contextLoad$lambda$12, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, c08271);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                c08271 = this;
            }
            d0.j(c08271.$loadScope);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {174}, m = "invokeSuspend")
    public static final class C08281 extends i implements c {
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ a0 $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08281(LegacyShowUseCase legacyShowUseCase, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, a0 a0Var, f fVar) {
            super(2, fVar);
            this.$showBoldSDK = legacyShowUseCase;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = a0Var;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C08281(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C08281) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                Object objInvoke = legacyShowUseCase.invoke(str, unityAdsShowOptions, listeners, this);
                a aVar = a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            d0.j(this.$showScope);
            return r.f53297a;
        }
    }

    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, f fVar) {
        String str2;
        String str3;
        String str4;
        UnityAdsSDK$fetchToken$$inlined$inject$default$1 unityAdsSDK$fetchToken$$inlined$inject$default$1 = new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, "");
        wj.e eVar = wj.e.f53281b;
        d dVarT = b.t(eVar, unityAdsSDK$fetchToken$$inlined$inject$default$1);
        d dVarT2 = b.t(eVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        d dVarT3 = b.t(eVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        d dVarT4 = b.t(eVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$4(this, ""));
        d dVarT5 = b.t(eVar, new UnityAdsSDK$fetchToken$$inlined$inject$default$5(this, ""));
        long jB = bn.d.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$19(dVarT4), DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED, (Double) null, b0.Q(new wj.f("sync", str), new wj.f("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(dVarT3), false, 1, null).toString())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(dVarT3), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) d0.C(l.f3620a, new UnityAdsSDK$fetchToken$token$1(dVarT2, dVarT, null));
                str2 = null;
                str3 = null;
            } catch (Exception e10) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$19 = fetchToken$lambda$19(dVarT4);
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = str4 == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME;
        Double d10 = new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB)));
        yj.f fVar2 = new yj.f();
        fVar2.put("sync", str);
        fVar2.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$18(dVarT3), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            fVar2.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$19, diagnosticEventType, d10, fVar2.g(), (Map) null, (AdObject) null, new Integer(fetchToken$lambda$16(dVarT).invoke()), 24, (Object) null);
        if (str4 == null) {
            Logger.DefaultImpls.error$default(fetchToken$lambda$20(dVarT5), defpackage.e.n("Returned nil token due to: ", str2), null, 2, null);
        } else {
            fetchToken$lambda$20(dVarT5).info("Generated a valid token.");
        }
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider fetchToken$lambda$16(d dVar) {
        return (TokenNumberProvider) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$17(d dVar) {
        return (GetHeaderBiddingToken) dVar.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$18(d dVar) {
        return (GetInitializationState) dVar.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$19(d dVar) {
        return (SendDiagnosticEvent) dVar.getValue();
    }

    private static final Logger fetchToken$lambda$20(d dVar) {
        return (Logger) dVar.getValue();
    }

    private static final AlternativeFlowReader finishOMIDSession$lambda$24(d dVar) {
        return (AlternativeFlowReader) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$26(d dVar) {
        return (GetAdObject) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$27(d dVar) {
        return (OmFinishSession) dVar.getValue();
    }

    private static final GetGameId getToken$lambda$13(d dVar) {
        return (GetGameId) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider getToken$lambda$14(d dVar) {
        return (TokenNumberProvider) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$15(d dVar) {
        return (GetAsyncHeaderBiddingToken) dVar.getValue();
    }

    public static /* synthetic */ f1 initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, InitializationConfiguration initializationConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "api";
        }
        if ((i10 & 4) != 0) {
            initializationConfiguration = null;
        }
        return unityAdsSDK.initialize(str, str2, initializationConfiguration);
    }

    private static final ShouldAllowInitialization initialize$lambda$10$lambda$0(d dVar) {
        return (ShouldAllowInitialization) dVar.getValue();
    }

    private static final ForceAlternativeFlow initialize$lambda$10$lambda$2$lambda$1(d dVar) {
        return (ForceAlternativeFlow) dVar.getValue();
    }

    private static final SessionRepository initialize$lambda$10$lambda$6$lambda$3(d dVar) {
        return (SessionRepository) dVar.getValue();
    }

    private static final ValidateExtrasSize initialize$lambda$10$lambda$6$lambda$4(d dVar) {
        return (ValidateExtrasSize) dVar.getValue();
    }

    private static final Logger initialize$lambda$10$lambda$6$lambda$5(d dVar) {
        return (Logger) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$10$lambda$7(d dVar) {
        return (AlternativeFlowReader) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$10$lambda$8(d dVar) {
        return (InitializeSDK) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$10$lambda$9(d dVar) {
        return (InitializeBoldSDK) dVar.getValue();
    }

    public static /* synthetic */ f1 load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, internalLoadListener, unityBannerSize);
    }

    private static final GetGameId load$lambda$11(d dVar) {
        return (GetGameId) dVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$12(d dVar) {
        return (Context) dVar.getValue();
    }

    private static final AlternativeFlowReader sendBannerDestroyed$lambda$28(d dVar) {
        return (AlternativeFlowReader) dVar.getValue();
    }

    private static final SendDiagnosticEvent sendBannerDestroyed$lambda$29(d dVar) {
        return (SendDiagnosticEvent) dVar.getValue();
    }

    public final f1 finishOMIDSession(String opportunityId) {
        n.f(opportunityId, "opportunityId");
        UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1 unityAdsSDK$finishOMIDSession$$inlined$inject$default$1 = new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, "");
        wj.e eVar = wj.e.f53281b;
        if (!finishOMIDSession$lambda$24(b.t(eVar, unityAdsSDK$finishOMIDSession$$inlined$inject$default$1)).invoke()) {
            h1 h1VarC = d0.c();
            h1VarC.O(r.f53297a);
            return h1VarC;
        }
        d dVarT = b.t(eVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        d dVarT2 = b.t(eVar, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        a0 a0Var = (a0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class));
        return d0.w(a0Var, null, new AnonymousClass2(opportunityId, a0Var, dVarT, dVarT2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) d0.C(l.f3620a, new AnonymousClass1(null));
    }

    public final f1 initialize(String gameId, String source, InitializationConfiguration initializationConfiguration) {
        n.f(source, "source");
        synchronized (this) {
            f1 f1Var = this.initializationJob;
            if (f1Var != null && f1Var.isActive()) {
                return f1Var;
            }
            wj.e eVar = wj.e.f53281b;
            d dVarT = b.t(eVar, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$1(this, ""));
            if (initializationConfiguration != null) {
                initialize$lambda$10$lambda$2$lambda$1(b.t(eVar, new UnityAdsSDK$initialize$lambda$10$lambda$2$$inlined$inject$default$1(this, ""))).invoke(true);
            }
            if (!initialize$lambda$10$lambda$0(dVarT).invoke(gameId)) {
                return d0.c();
            }
            if (initializationConfiguration != null) {
                d dVarT2 = b.t(eVar, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$1(this, ""));
                ValidateExtrasSize.invoke$default(initialize$lambda$10$lambda$6$lambda$4(b.t(eVar, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$2(this, ""))), initializationConfiguration.getExtras(), "init", null, 4, null);
                initialize$lambda$10$lambda$6$lambda$3(dVarT2).setInitializationConfiguration(new InitializationConfigurationInternal(initializationConfiguration.getGameId(), initializationConfiguration.getIsTestModeEnabled(), initializationConfiguration.getLogLevel(), initializationConfiguration.getExtras(), initializationConfiguration.getMediationInfo()));
                initialize$lambda$10$lambda$6$lambda$5(b.t(eVar, new UnityAdsSDK$initialize$lambda$10$lambda$6$$inlined$inject$default$3(this, ""))).setLogLevel(LogLevelKt.toLogLevelInternal(initializationConfiguration.getLogLevel()));
            }
            d dVarT3 = b.t(eVar, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$2(this, ""));
            d dVarT4 = b.t(eVar, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$3(this, ""));
            d dVarT5 = b.t(eVar, new UnityAdsSDK$initialize$lambda$10$$inlined$inject$default$4(this, ""));
            a0 a0Var = (a0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class));
            y1 y1VarW = d0.w(a0Var, null, new UnityAdsSDK$initialize$1$newInitializationJob$1(source, gameId, a0Var, dVarT3, dVarT5, dVarT4, null), 3);
            this.initializationJob = y1VarW;
            return y1VarW;
        }
    }

    public final f1 load(String placementId, UnityAdsLoadOptions loadOptions, InternalLoadListener listener, UnityBannerSize bannerSize) {
        n.f(loadOptions, "loadOptions");
        UnityAdsSDK$load$$inlined$inject$default$1 unityAdsSDK$load$$inlined$inject$default$1 = new UnityAdsSDK$load$$inlined$inject$default$1(this, "");
        wj.e eVar = wj.e.f53281b;
        initialize$default(this, load$lambda$11(b.t(eVar, unityAdsSDK$load$$inlined$inject$default$1)).invoke(), "load", null, 4, null);
        a0 a0Var = (a0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class));
        return d0.w(a0Var, null, new C08271(placementId, loadOptions, listener, bannerSize, a0Var, b.t(eVar, new UnityAdsSDK$load$$inlined$inject$default$2(this, "")), null), 3);
    }

    public final void sendBannerDestroyed() {
        UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1 unityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1 = new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1(this, "");
        wj.e eVar = wj.e.f53281b;
        if (sendBannerDestroyed$lambda$28(b.t(eVar, unityAdsSDK$sendBannerDestroyed$$inlined$inject$default$1)).invoke()) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendBannerDestroyed$lambda$29(b.t(eVar, new UnityAdsSDK$sendBannerDestroyed$$inlined$inject$default$2(this, ""))), "native_banner_destroyed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
        }
    }

    public final f1 show(String placementId, UnityAdsShowOptions showOptions, Listeners listener) {
        n.f(listener, "listener");
        IServicesRegistry registry = getServiceProvider().getRegistry();
        e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        a0 a0Var = (a0) registry.getService(ServiceProvider.NAMED_SHOW_SCOPE, e0Var.b(a0.class));
        return d0.w(a0Var, null, new C08281((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", e0Var.b(LegacyShowUseCase.class)), placementId, showOptions, listener, a0Var, null), 3);
    }

    public UnityAdsSDK(IServiceProvider serviceProvider) {
        n.f(serviceProvider, "serviceProvider");
        this.serviceProvider = serviceProvider;
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i10, g gVar) {
        this((i10 & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    public final f1 getToken(IUnityAdsTokenListener listener) {
        return getToken(null, listener);
    }

    public final f1 getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener listener) {
        UnityAdsSDK$getToken$$inlined$inject$default$1 unityAdsSDK$getToken$$inlined$inject$default$1 = new UnityAdsSDK$getToken$$inlined$inject$default$1(this, "");
        wj.e eVar = wj.e.f53281b;
        initialize$default(this, getToken$lambda$13(b.t(eVar, unityAdsSDK$getToken$$inlined$inject$default$1)).invoke(), "get_token", null, 4, null);
        d dVarT = b.t(eVar, new UnityAdsSDK$getToken$$inlined$inject$default$2(this, ""));
        d dVarT2 = b.t(eVar, new UnityAdsSDK$getToken$$inlined$inject$default$3(this, ""));
        a0 a0Var = (a0) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class));
        return d0.w(a0Var, null, new C08262(tokenConfiguration, listener, a0Var, dVarT2, dVarT, null), 3);
    }
}
