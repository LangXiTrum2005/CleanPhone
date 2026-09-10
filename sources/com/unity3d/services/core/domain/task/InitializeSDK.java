package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import cn.d0;
import cn.w;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010)\u001a\u00020\u0002H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeSDK;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/EmptyParams;", "Lwj/r;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "initializeStateReset", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "initializeStateError", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "initializeStateConfig", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "initializeStateCreate", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "initializeStateLoadCache", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "initializeStateLoadWeb", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "initializeStateComplete", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/services/core/domain/task/InitializeStateReset;Lcom/unity3d/services/core/domain/task/InitializeStateError;Lcom/unity3d/services/core/domain/task/InitializeStateConfig;Lcom/unity3d/services/core/domain/task/InitializeStateCreate;Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;Lcom/unity3d/services/core/domain/task/InitializeStateComplete;)V", "Lcom/unity3d/services/core/domain/task/InitializationException;", "exception", "handleInitializationException", "(Lcom/unity3d/services/core/domain/task/InitializationException;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/services/core/configuration/ErrorState;", "errorState", "", "taskException", "Lcom/unity3d/services/core/configuration/Configuration;", "configuration", "Lwj/h;", "executeErrorState-BWLJW6A", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Throwable;Lcom/unity3d/services/core/configuration/Configuration;Lak/f;)Ljava/lang/Object;", "executeErrorState", "", "getMetricName", "()Ljava/lang/String;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/EmptyParams;Lak/f;)Ljava/lang/Object;", "doWork", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializeSDK extends MetricTask<EmptyParams, r> {
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    private final InitializeStateComplete initializeStateComplete;
    private final InitializeStateConfig initializeStateConfig;
    private final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    private final InitializeStateLoadCache initializeStateLoadCache;
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    private final InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {InterfaceC0435l1.d.b.f29112i}, m = "handleInitializationException")
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
            return InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    public InitializeSDK(ISDKDispatchers dispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage, InitializeStateReset initializeStateReset, InitializeStateError initializeStateError, InitializeStateConfig initializeStateConfig, InitializeStateCreate initializeStateCreate, InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateComplete initializeStateComplete) {
        n.f(dispatchers, "dispatchers");
        n.f(configFileFromLocalStorage, "configFileFromLocalStorage");
        n.f(initializeStateReset, "initializeStateReset");
        n.f(initializeStateError, "initializeStateError");
        n.f(initializeStateConfig, "initializeStateConfig");
        n.f(initializeStateCreate, "initializeStateCreate");
        n.f(initializeStateLoadCache, "initializeStateLoadCache");
        n.f(initializeStateLoadWeb, "initializeStateLoadWeb");
        n.f(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    public final Object m3243executeErrorStateBWLJW6A(ErrorState errorState, Throwable th2, Configuration configuration, f fVar) {
        InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        if (fVar instanceof InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (InitializeSDK$executeErrorState$1) fVar;
            int i10 = initializeSDK$executeErrorState$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeSDK$executeErrorState$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, fVar);
            }
        } else {
            initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, fVar);
        }
        Object obj = initializeSDK$executeErrorState$1.result;
        int i11 = initializeSDK$executeErrorState$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return ((h) obj).f53286a;
        }
        t9.e.z(obj);
        InitializeStateError initializeStateError = this.initializeStateError;
        InitializeStateError.Params params = new InitializeStateError.Params(errorState, new Exception(th2 != null ? th2.getMessage() : null), configuration);
        initializeSDK$executeErrorState$1.label = 1;
        Object objMo3239invokegIAlus = initializeStateError.mo3239invokegIAlus(params, initializeSDK$executeErrorState$1);
        a aVar = a.f5708a;
        return objMo3239invokegIAlus == aVar ? aVar : objMo3239invokegIAlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleInitializationException(InitializationException initializationException, f fVar) throws InitializationException {
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
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InitializationException initializationException2 = (InitializationException) anonymousClass1.L$0;
            t9.e.z(obj);
            ((h) obj).getClass();
            throw initializationException2;
        }
        t9.e.z(obj);
        ErrorState errorState = initializationException.getErrorState();
        Throwable originalException = initializationException.getOriginalException();
        Configuration config = initializationException.getConfig();
        anonymousClass1.L$0 = initializationException;
        anonymousClass1.label = 1;
        Object objM3243executeErrorStateBWLJW6A = m3243executeErrorStateBWLJW6A(errorState, originalException, config, anonymousClass1);
        Object obj2 = a.f5708a;
        if (objM3243executeErrorStateBWLJW6A == obj2) {
            return obj2;
        }
        throw initializationException;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo3238doWorkgIAlus(EmptyParams emptyParams, f fVar) {
        InitializeSDK$doWork$1 initializeSDK$doWork$1;
        if (fVar instanceof InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (InitializeSDK$doWork$1) fVar;
            int i10 = initializeSDK$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeSDK$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, fVar);
            }
        } else {
            initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, fVar);
        }
        Object objJ = initializeSDK$doWork$1.result;
        int i11 = initializeSDK$doWork$1.label;
        if (i11 == 0) {
            t9.e.z(objJ);
            w wVar = this.dispatchers.getDefault();
            InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this, null);
            initializeSDK$doWork$1.label = 1;
            objJ = d0.J(wVar, initializeSDK$doWork$2, initializeSDK$doWork$1);
            a aVar = a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objJ);
        }
        return ((h) objJ).f53286a;
    }
}
