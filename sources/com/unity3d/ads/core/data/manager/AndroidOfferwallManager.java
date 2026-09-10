package com.unity3d.ads.core.data.manager;

import ak.f;
import ck.c;
import ck.e;
import ck.i;
import com.google.android.gms.internal.ads.u71;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import fn.f1;
import fn.g;
import fn.q0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.InvocationTargetException;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.k;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "offerwallBridge", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;Lcom/unity3d/ads/core/log/Logger;)V", "", "getVersion", "(Lak/f;)Ljava/lang/Object;", "", "isConnected", "placementName", "isAdReady", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lwj/r;", "loadAd", "Lfn/e;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "showAd", "(Ljava/lang/String;)Lfn/e;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidOfferwallManager implements OfferwallManager {
    private final Logger logger;
    private final OfferwallAdapterBridge offerwallBridge;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE}, m = "loadAd")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, f fVar) {
            super(2, fVar);
            this.$placementName = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((AnonymousClass2) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements jk.c {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, f fVar) {
            super(2, fVar);
            this.$placementName = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, fVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // jk.c
        public final Object invoke(OfferwallEventData offerwallEventData, f fVar) {
            return ((AnonymousClass3) create(offerwallEventData, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return Boolean.valueOf(o.Q(OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED).contains(offerwallEventData.getOfferwallEvent()) && n.a(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    public static final class C07421 extends i implements jk.c {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07421(String str, f fVar) {
            super(2, fVar);
            this.$placementName = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidOfferwallManager.this.new C07421(this.$placementName, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((C07421) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it", "", "<anonymous>", "(Lfn/f;Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;)Z"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {45}, m = "invokeSuspend")
    public static final class C07432 extends i implements d {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C07432(f fVar) {
            super(3, fVar);
        }

        @Override // jk.d
        public final Object invoke(fn.f fVar, OfferwallEventData offerwallEventData, f fVar2) {
            C07432 c07432 = new C07432(fVar2);
            c07432.L$0 = fVar;
            c07432.L$1 = offerwallEventData;
            return c07432.invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            OfferwallEventData offerwallEventData;
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                fn.f fVar = (fn.f) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                Object objEmit = fVar.emit(offerwallEventData2, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                t9.e.z(obj);
            }
            return Boolean.valueOf(!k.c0(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }
    }

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallBridge, Logger logger) {
        n.f(offerwallBridge, "offerwallBridge");
        n.f(logger, "logger");
        this.offerwallBridge = offerwallBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(f fVar) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, f fVar) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(f fVar) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object loadAd(String str, f fVar) throws LoadException {
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
        Object objL = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objL);
            this.logger.debug("Offerwall Manager - loadAd: " + str);
            f1 f1Var = new f1(this.offerwallBridge.getOfferwallEventFlow(), new AnonymousClass2(str, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str, null);
            anonymousClass1.label = 1;
            objL = g.l(f1Var, anonymousClass3, anonymousClass1);
            bk.a aVar = bk.a.f5708a;
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objL);
        }
        OfferwallEventData offerwallEventData = (OfferwallEventData) (((OfferwallEventData) objL).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? objL : null);
        if (offerwallEventData == null) {
            return r.f53297a;
        }
        Integer errorCode = offerwallEventData.getErrorCode();
        int iIntValue = errorCode != null ? errorCode.intValue() : 0;
        StringBuilder sb2 = new StringBuilder("Error loading offerwall ad: ");
        Object errorMessage = offerwallEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = offerwallEventData.getOfferwallEvent();
        }
        sb2.append(errorMessage);
        throw new LoadException(iIntValue, sb2.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public fn.e showAd(String placementName) {
        n.f(placementName, "placementName");
        this.logger.debug("Offerwall Manager - showAd: ".concat(placementName));
        return new q0(new u71(new f1(this.offerwallBridge.getOfferwallEventFlow(), new C07421(placementName, null)), new C07432(null), (f) null));
    }
}
