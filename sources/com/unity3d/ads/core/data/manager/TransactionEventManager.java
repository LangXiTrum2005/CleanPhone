package com.unity3d.ads.core.data.manager;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001fH\u0086\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-¨\u0006/"}, d2 = {"Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "", "Lcn/a0;", "scope", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientAdapter", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getTransactionData", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "getTransactionRequest", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "transactionEventRepository", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "iapTransactionStore", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "isBillingClientAvailable", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "productDetailsFetcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcn/a0;Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Lcom/unity3d/ads/core/domain/events/GetTransactionData;Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "billingResult", "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "purchases", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "transactionOrigin", "Lwj/r;", "onPurchasesReceived", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;Ljava/util/List;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;)V", "invoke", "()V", "Lcn/a0;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "Lcom/unity3d/ads/core/data/repository/TransactionEventRepository;", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "Lcom/unity3d/ads/core/domain/billing/IsBillingClientAvailable;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TransactionEventManager {
    public static final String BILLING_SERVICE_UNAVAILABLE = "Billing client is not available";
    private static final String INAPP = "inapp";
    private static final String SUBS = "subs";
    private final BillingClientAdapter billingClientAdapter;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final IsBillingClientAvailable isBillingClientAvailable;
    private final Logger logger;
    private final ProductDetailsFetcher productDetailsFetcher;
    private final a0 scope;
    private final SessionRepository sessionRepository;
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        Object L$0;
        int label;

        public AnonymousClass1(f fVar) {
            super(2, fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            transactionEventManager.onPurchasesReceived(billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return TransactionEventManager.this.new AnonymousClass1(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    t9.e.z(obj);
                    if (!TransactionEventManager.this.billingClientAdapter.isInitialized()) {
                        final TransactionEventManager transactionEventManager = TransactionEventManager.this;
                        this.L$0 = transactionEventManager;
                        this.label = 1;
                        final l lVar = new l(1, q1.t(this));
                        lVar.t();
                        transactionEventManager.billingClientAdapter.initialize(new BillingInitializationListener() { // from class: com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1$1$1
                            private final n0 hasBeenResumed = g.c(Boolean.FALSE);

                            private final void tryResume() {
                                a1 a1Var;
                                Object value;
                                Boolean bool;
                                if (lVar.isActive()) {
                                    n0 n0Var = this.hasBeenResumed;
                                    do {
                                        a1Var = (a1) n0Var;
                                        value = a1Var.getValue();
                                        bool = (Boolean) value;
                                        bool.getClass();
                                    } while (!a1Var.c0(value, Boolean.TRUE));
                                    if (bool.booleanValue()) {
                                        return;
                                    }
                                    lVar.resumeWith(r.f53297a);
                                }
                            }

                            private final void tryResumeWithException(Exception exception) {
                                a1 a1Var;
                                Object value;
                                Boolean bool;
                                if (lVar.isActive()) {
                                    n0 n0Var = this.hasBeenResumed;
                                    do {
                                        a1Var = (a1) n0Var;
                                        value = a1Var.getValue();
                                        bool = (Boolean) value;
                                        bool.getClass();
                                    } while (!a1Var.c0(value, Boolean.TRUE));
                                    if (bool.booleanValue()) {
                                        return;
                                    }
                                    lVar.resumeWith(t9.e.c(exception));
                                }
                            }

                            public final n0 getHasBeenResumed() {
                                return this.hasBeenResumed;
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingServiceDisconnected() {
                                tryResumeWithException(new TransactionException("Billing service disconnected"));
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
                            public void onBillingSetupFinished(BillingResultBridge billingResult) {
                                n.f(billingResult, "billingResult");
                                if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
                                    tryResumeWithException(new TransactionException("Billing setup failed"));
                                } else {
                                    tryResume();
                                }
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
                            public void onIsAlreadyInitialized() {
                                tryResume();
                            }

                            @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
                            public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
                                n.f(billingResult, "billingResult");
                                transactionEventManager.onPurchasesReceived(billingResult, purchases, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
                            }
                        });
                        Object objS = lVar.s();
                        bk.a aVar = bk.a.f5708a;
                        if (objS == aVar) {
                            return aVar;
                        }
                    }
                    return r.f53297a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                if (TransactionEventManager.this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                    BillingClientAdapter billingClientAdapter = TransactionEventManager.this.billingClientAdapter;
                    final TransactionEventManager transactionEventManager2 = TransactionEventManager.this;
                    final int i11 = 0;
                    billingClientAdapter.queryPurchasesAsync("inapp", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                        @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                        public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                            int i12 = i11;
                            TransactionEventManager transactionEventManager3 = transactionEventManager2;
                            switch (i12) {
                                case 0:
                                    TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager3, billingResultBridge, list);
                                    break;
                                default:
                                    TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager3, billingResultBridge, list);
                                    break;
                            }
                        }
                    });
                    BillingClientAdapter billingClientAdapter2 = TransactionEventManager.this.billingClientAdapter;
                    final TransactionEventManager transactionEventManager3 = TransactionEventManager.this;
                    final int i12 = 1;
                    billingClientAdapter2.queryPurchasesAsync("subs", new PurchasesResponseListener() { // from class: com.unity3d.ads.core.data.manager.a
                        @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
                        public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
                            int i13 = i12;
                            TransactionEventManager transactionEventManager4 = transactionEventManager3;
                            switch (i13) {
                                case 0:
                                    TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$1(transactionEventManager4, billingResultBridge, list);
                                    break;
                                default:
                                    TransactionEventManager.AnonymousClass1.invokeSuspend$lambda$2(transactionEventManager4, billingResultBridge, list);
                                    break;
                            }
                        }
                    });
                }
            } catch (Exception e10) {
                TransactionEventManager.this.logger.trace(TransactionEventManager.BILLING_SERVICE_UNAVAILABLE, e10);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {131, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 150}, m = "invokeSuspend")
    public static final class C07491 extends i implements c {
        final /* synthetic */ List<PurchaseBridge> $purchases;
        final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07491(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, f fVar) {
            super(2, fVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new C07491(this.$purchases, this.this$0, this.$transactionOrigin, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07491) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:111:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:41:0x0112  */
        /* JADX WARN: Code duplicated, block: B:44:0x0128  */
        /* JADX WARN: Code duplicated, block: B:45:0x0129  */
        /* JADX WARN: Code duplicated, block: B:47:0x012c A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0199 -> B:121:0x019c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01be -> B:72:0x01c1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01df -> B:82:0x01ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ef -> B:75:0x01ce). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ck.a
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 623
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.C07491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventManager(a0 scope, BillingClientAdapter billingClientAdapter, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource iapTransactionStore, IsBillingClientAvailable isBillingClientAvailable, SessionRepository sessionRepository, ProductDetailsFetcher productDetailsFetcher, Logger logger) {
        n.f(scope, "scope");
        n.f(getTransactionData, "getTransactionData");
        n.f(getTransactionRequest, "getTransactionRequest");
        n.f(transactionEventRepository, "transactionEventRepository");
        n.f(iapTransactionStore, "iapTransactionStore");
        n.f(isBillingClientAvailable, "isBillingClientAvailable");
        n.f(sessionRepository, "sessionRepository");
        n.f(productDetailsFetcher, "productDetailsFetcher");
        n.f(logger, "logger");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        List<? extends PurchaseBridge> list;
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK || (list = purchases) == null || list.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        d0.w(this.scope, null, new C07491(purchases, this, transactionOrigin, null), 3);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            Logger.DefaultImpls.trace$default(this.logger, BILLING_SERVICE_UNAVAILABLE, null, 2, null);
        } else {
            d0.w(this.scope, null, new AnonymousClass1(null), 3);
        }
    }
}
