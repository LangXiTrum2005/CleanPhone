package com.unity3d.ads.core.domain;

import ak.f;
import bn.d;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;
import xj.b0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010$\u001a\u0004\u0018\u00010#H\u0096Bø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R \u0010=\u001a\u00020<8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "awaitInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lwj/r;", "fetchToken", "(ILcom/unity3d/ads/TokenConfiguration;Lak/f;)Ljava/lang/Object;", "", "token", "tokenSuccess", "(ILjava/lang/String;Lcom/unity3d/ads/TokenConfiguration;)V", "reason", "reasonDebug", "tokenFailure", "(ILjava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/TokenConfiguration;)V", "tokenStart", "(ILcom/unity3d/ads/TokenConfiguration;)V", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "listener", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "Lbn/f;", "startTime", "J", "getStartTime-z9LOYto", "()J", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "", "didAwaitInit", "Z", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final Logger logger;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {76}, m = "fetchToken")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE, 69}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07631 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07631(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {60}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(fVar);
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
                if (k.c0(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    Object objInvoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
                    bk.a aVar = bk.a.f5708a;
                    if (objInvoke$default == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07642 extends o implements jk.a {
        public C07642() {
            super(0);
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3223invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3223invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07651 extends o implements jk.a {
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07651(String str) {
            super(0);
            this.$token = str;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3224invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3224invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(this.$token);
            }
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        n.f(getHeaderBiddingToken, "getHeaderBiddingToken");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getInitializationState, "getInitializationState");
        n.f(awaitInitialization, "awaitInitialization");
        n.f(sessionRepository, "sessionRepository");
        n.f(safeCallbackInvoke, "safeCallbackInvoke");
        n.f(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchToken(int i10, TokenConfiguration tokenConfiguration, f fVar) {
        AnonymousClass1 anonymousClass1;
        String shortenedStackTrace$default;
        String str;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objInvoke = anonymousClass1.result;
        int i12 = anonymousClass1.label;
        String str2 = null;
        try {
            if (i12 == 0) {
                t9.e.z(objInvoke);
                GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = tokenConfiguration;
                anonymousClass1.I$0 = i10;
                anonymousClass1.label = 1;
                objInvoke = getHeaderBiddingToken.invoke(i10, tokenConfiguration, anonymousClass1);
                bk.a aVar = bk.a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = anonymousClass1.I$0;
                tokenConfiguration = (TokenConfiguration) anonymousClass1.L$1;
                this = (CommonInitAwaitingGetHeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(objInvoke);
            }
            str = null;
            str2 = (String) objInvoke;
            shortenedStackTrace$default = null;
        } catch (Exception e10) {
            shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e10, 0, 1, null);
            str = "uncaught_exception";
        }
        if (str2 == null) {
            this.tokenFailure(i10, str, shortenedStackTrace$default, tokenConfiguration);
        } else {
            this.tokenSuccess(i10, str2, tokenConfiguration);
        }
        return r.f53297a;
    }

    private final void tokenFailure(int tokenNumber, String reason, String reasonDebug, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_FAILURE_TIME;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new bn.f(this.startTime)));
        yj.f fVar = new yj.f();
        fVar.put("sync", "false");
        fVar.put("state", String.valueOf(this.startState));
        fVar.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        fVar.put("awaited_init", String.valueOf(this.didAwaitInit));
        fVar.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            fVar.put("reason_debug", reasonDebug);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, dValueOf, fVar.g(), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), 24, (Object) null);
        Logger.DefaultImpls.error$default(this.logger, defpackage.e.n("Returned nil token due to: ", reason), null, 2, null);
        this.safeCallbackInvoke.invoke(new C07642());
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i10, String str, String str2, TokenConfiguration tokenConfiguration, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, str, str2, tokenConfiguration);
    }

    private final void tokenStart(int tokenNumber, TokenConfiguration tokenConfiguration) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_STARTED;
        yj.f fVar = new yj.f();
        fVar.put("sync", "false");
        fVar.put("state", String.valueOf(this.startState));
        fVar.put("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, (Double) null, fVar.g(), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), 26, (Object) null);
    }

    private final void tokenSuccess(int tokenNumber, String token, TokenConfiguration tokenConfiguration) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_GATEWAY_TOKEN_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(new bn.f(this.startTime))), b0.Q(new wj.f("sync", "false"), new wj.f("state", String.valueOf(this.startState)), new wj.f("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new wj.f("awaited_init", String.valueOf(this.didAwaitInit)), new wj.f("new_api", String.valueOf(tokenConfiguration != null ? tokenConfiguration.get_isNewApi() : false))), (Map) null, (AdObject) null, Integer.valueOf(tokenNumber), 24, (Object) null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new C07651(token));
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* JADX INFO: renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, f fVar) {
        C07631 c07631;
        if (fVar instanceof C07631) {
            c07631 = (C07631) fVar;
            int i11 = c07631.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c07631.label = i11 - Integer.MIN_VALUE;
            } else {
                c07631 = new C07631(fVar);
            }
        } else {
            c07631 = new C07631(fVar);
        }
        Object obj = c07631.result;
        int i12 = c07631.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = c07631.I$0;
                tokenConfiguration = (TokenConfiguration) c07631.L$1;
                this = (CommonInitAwaitingGetHeaderBiddingToken) c07631.L$0;
                t9.e.z(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
        }
        t9.e.z(obj);
        this.listener = iUnityAdsTokenListener;
        tokenStart(i10, tokenConfiguration);
        if (iUnityAdsTokenListener == null) {
            tokenFailure(i10, "listener_null", "IUnityAdsTokenListener is null", tokenConfiguration);
            return rVar;
        }
        if (!this.sessionRepository.getShouldInitialize()) {
            tokenFailure(i10, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
            return rVar;
        }
        long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        c07631.L$0 = this;
        c07631.L$1 = tokenConfiguration;
        c07631.I$0 = i10;
        c07631.label = 1;
        if (d0.K(getTokenTimeoutMs, anonymousClass2, c07631) != aVar) {
        }
        if (!this.sessionRepository.getShouldInitialize()) {
            this.tokenFailure(i10, "gateway", "!sessionRepository.shouldInitialize", tokenConfiguration);
            return rVar;
        }
        c07631.L$0 = null;
        c07631.L$1 = null;
        c07631.label = 2;
        return this.fetchToken(i10, tokenConfiguration, c07631) == aVar ? aVar : rVar;
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
