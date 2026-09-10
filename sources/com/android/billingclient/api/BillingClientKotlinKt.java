package com.android.billingclient.api;

import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import java.util.List;
import kotlinx.coroutines.preprohormone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\f\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\f\u001a\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0010\u0010\f\u001a\u001c\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u001e\u0010\u001b\u001a\u001c\u0010\"\u001a\u00020!*\u00020\u00002\u0006\u0010\u0002\u001a\u00020 H\u0087@¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lcom/android/billingclient/api/AcknowledgePurchaseParams;", "params", "Lcom/android/billingclient/api/BillingResult;", "acknowledgePurchase", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/ConsumeParams;", "Lcom/android/billingclient/api/ConsumeResult;", "consumePurchase", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/ConsumeParams;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/CreateAlternativeBillingOnlyReportingDetailsResult;", "createAlternativeBillingOnlyReportingDetails", "(Lcom/android/billingclient/api/BillingClient;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "createExternalOfferReportingDetails", "isAlternativeBillingOnlyAvailable", "isExternalOfferAvailable", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "Lcom/android/billingclient/api/ProductDetailsResult;", "queryProductDetails", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryProductDetailsParams;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/QueryPurchaseHistoryParams;", "Lcom/android/billingclient/api/PurchaseHistoryResult;", "queryPurchaseHistory", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryPurchaseHistoryParams;Lwretchedly/dern;)Ljava/lang/Object;", "", "skuType", "(Lcom/android/billingclient/api/BillingClient;Ljava/lang/String;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/QueryPurchasesParams;", "Lcom/android/billingclient/api/PurchasesResult;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryPurchasesParams;Lwretchedly/dern;)Ljava/lang/Object;", "Lcom/android/billingclient/api/SkuDetailsParams;", "Lcom/android/billingclient/api/SkuDetailsResult;", "querySkuDetails", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/SkuDetailsParams;Lwretchedly/dern;)Ljava/lang/Object;", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BillingClientKotlinKt {
    public static /* synthetic */ void $r8$lambda$1JhcD_0Y_gWWNKF2aNTk2toOOyY(kotlinx.coroutines.gintrap deferred, BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$9SKPFUMhNCJ3v0PMCwGqle8zR10(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new SkuDetailsResult(billingResult, list));
    }

    /* JADX INFO: renamed from: $r8$lambda$BC2cAL2vk_I3dV-pkSAsSywRIek, reason: not valid java name */
    public static /* synthetic */ void m26$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, String str) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new ConsumeResult(billingResult, str));
    }

    public static /* synthetic */ void $r8$lambda$Bt5YvFTOU7XGqhy1u2vanp4Jc20(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    /* JADX INFO: renamed from: $r8$lambda$Iy_vpeZ_JH-NmajeE6ZBdUlqJKA, reason: not valid java name */
    public static /* synthetic */ void m27$r8$lambda$Iy_vpeZ_JHNmajeE6ZBdUlqJKA(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        Intrinsics.beachfront(list);
        deferred.saran(new PurchasesResult(billingResult, list));
    }

    /* JADX INFO: renamed from: $r8$lambda$Jmx2bDJUe-jQbQfqNR-Rv-qVuz0, reason: not valid java name */
    public static /* synthetic */ void m28$r8$lambda$Jmx2bDJUejQbQfqNRRvqVuz0(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new PurchaseHistoryResult(billingResult, list));
    }

    /* JADX INFO: renamed from: $r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25-w, reason: not valid java name */
    public static /* synthetic */ void m29$r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25w(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    /* JADX INFO: renamed from: $r8$lambda$OmYoMPMU8NG-G-TTJRupXijq_ag, reason: not valid java name */
    public static /* synthetic */ void m30$r8$lambda$OmYoMPMU8NGGTTJRupXijq_ag(kotlinx.coroutines.gintrap deferred, BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$ZzkEujuP9GqFND2FbZB_kuqycGM(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new PurchaseHistoryResult(billingResult, list));
    }

    /* JADX INFO: renamed from: $r8$lambda$_HjOTKlijnqR-5v_YY-SPcvW1bw, reason: not valid java name */
    public static /* synthetic */ void m31$r8$lambda$_HjOTKlijnqR5v_YYSPcvW1bw(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(new ProductDetailsResult(billingResult, list));
    }

    public static /* synthetic */ void $r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(kotlinx.coroutines.gintrap deferred, BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        deferred.saran(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$wzezm1LgRtzooDMmMf2vgdwDzEw(kotlinx.coroutines.gintrap deferred, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.beachfront(billingResult);
        Intrinsics.beachfront(list);
        deferred.saran(new PurchasesResult(billingResult, list));
    }

    public static final Object acknowledgePurchase(BillingClient billingClient, AcknowledgePurchaseParams acknowledgePurchaseParams, wretchedly.dern<? super BillingResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(gintrapVarDern, billingResult);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object consumePurchase(BillingClient billingClient, ConsumeParams consumeParams, wretchedly.dern<? super ConsumeResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(BillingResult billingResult, String str) {
                BillingClientKotlinKt.m26$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(gintrapVarDern, billingResult, str);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object createAlternativeBillingOnlyReportingDetails(BillingClient billingClient, wretchedly.dern<? super CreateAlternativeBillingOnlyReportingDetailsResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda9
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                BillingClientKotlinKt.m29$r8$lambda$NdU5wcJ8m2M9H_puX2oHpjb25w(gintrapVarDern, billingResult, alternativeBillingOnlyReportingDetails);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object createExternalOfferReportingDetails(BillingClient billingClient, wretchedly.dern<? super CreateExternalOfferReportingDetailsResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.createExternalOfferReportingDetailsAsync(new ExternalOfferReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.ExternalOfferReportingDetailsListener
            public final void onExternalOfferReportingDetailsResponse(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
                BillingClientKotlinKt.$r8$lambda$Bt5YvFTOU7XGqhy1u2vanp4Jc20(gintrapVarDern, billingResult, externalOfferReportingDetails);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object isAlternativeBillingOnlyAvailable(BillingClient billingClient, wretchedly.dern<? super BillingResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$1JhcD_0Y_gWWNKF2aNTk2toOOyY(gintrapVarDern, billingResult);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object isExternalOfferAvailable(BillingClient billingClient, wretchedly.dern<? super BillingResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.isExternalOfferAvailableAsync(new ExternalOfferAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ExternalOfferAvailabilityListener
            public final void onExternalOfferAvailabilityResponse(BillingResult billingResult) {
                BillingClientKotlinKt.m30$r8$lambda$OmYoMPMU8NGGTTJRupXijq_ag(gintrapVarDern, billingResult);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object queryProductDetails(BillingClient billingClient, QueryProductDetailsParams queryProductDetailsParams, wretchedly.dern<? super ProductDetailsResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m31$r8$lambda$_HjOTKlijnqR5v_YYSPcvW1bw(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object queryPurchaseHistory(BillingClient billingClient, QueryPurchaseHistoryParams queryPurchaseHistoryParams, wretchedly.dern<? super PurchaseHistoryResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.queryPurchaseHistoryAsync(queryPurchaseHistoryParams, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m28$r8$lambda$Jmx2bDJUejQbQfqNRRvqVuz0(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    public static final Object queryPurchasesAsync(BillingClient billingClient, QueryPurchasesParams queryPurchasesParams, wretchedly.dern<? super PurchasesResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda10
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.m27$r8$lambda$Iy_vpeZ_JHNmajeE6ZBdUlqJKA(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    @patroclinal.wireman
    public static final Object querySkuDetails(BillingClient billingClient, SkuDetailsParams skuDetailsParams, wretchedly.dern<? super SkuDetailsResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.querySkuDetailsAsync(skuDetailsParams, new SkuDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda11
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$9SKPFUMhNCJ3v0PMCwGqle8zR10(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    @patroclinal.wireman
    public static final Object queryPurchaseHistory(BillingClient billingClient, String str, wretchedly.dern<? super PurchaseHistoryResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda8
            @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
            public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$ZzkEujuP9GqFND2FbZB_kuqycGM(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }

    @patroclinal.wireman
    public static final Object queryPurchasesAsync(BillingClient billingClient, String str, wretchedly.dern<? super PurchasesResult> dernVar) {
        final kotlinx.coroutines.gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
        billingClient.queryPurchasesAsync(str, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                BillingClientKotlinKt.$r8$lambda$wzezm1LgRtzooDMmMf2vgdwDzEw(gintrapVarDern, billingResult, list);
            }
        });
        return gintrapVarDern.dent(dernVar);
    }
}
