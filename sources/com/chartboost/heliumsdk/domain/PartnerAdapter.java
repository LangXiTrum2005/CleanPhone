package com.chartboost.heliumsdk.domain;

import android.content.Context;
import com.p004ironsource.d9;
import com.p004ironsource.gv;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0015H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H&J'\u0010$\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020'H&¢\u0006\u0002\u0010(J2\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\"H&J2\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PartnerAdapter;", "", gv.f25175b, "", "getAdapterVersion", "()Ljava/lang/String;", "partnerDisplayName", "getPartnerDisplayName", "partnerId", "getPartnerId", "partnerSdkVersion", "getPartnerSdkVersion", "fetchBidderInformation", "", "context", "Landroid/content/Context;", "request", "Lcom/chartboost/heliumsdk/domain/PreBidRequest;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PreBidRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "Lkotlin/Result;", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "partnerAd", "invalidate-gIAlu-s", "(Lcom/chartboost/heliumsdk/domain/PartnerAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "partnerAdListener", "Lcom/chartboost/heliumsdk/domain/PartnerAdListener;", "load-BWLJW6A", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;Lcom/chartboost/heliumsdk/domain/PartnerAdListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCcpaConsent", "", "hasGrantedCcpaConsent", "", "privacyString", "setGdpr", "applies", d9.i.a0, "Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;", "(Landroid/content/Context;Ljava/lang/Boolean;Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;)V", "setUp", "partnerConfiguration", "Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;", "setUp-0E7RQCE", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserSubjectToCoppa", "isSubjectToCoppa", "show", "show-0E7RQCE", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PartnerAdapter {
    Object fetchBidderInformation(Context context, PreBidRequest preBidRequest, Continuation<? super Map<String, String>> continuation);

    String getAdapterVersion();

    String getPartnerDisplayName();

    String getPartnerId();

    String getPartnerSdkVersion();

    /* JADX INFO: renamed from: invalidate-gIAlu-s, reason: not valid java name */
    Object mo164invalidategIAlus(PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation);

    /* JADX INFO: renamed from: load-BWLJW6A, reason: not valid java name */
    Object mo165loadBWLJW6A(Context context, PartnerAdLoadRequest partnerAdLoadRequest, PartnerAdListener partnerAdListener, Continuation<? super Result<PartnerAd>> continuation);

    void setCcpaConsent(Context context, boolean hasGrantedCcpaConsent, String privacyString);

    void setGdpr(Context context, Boolean applies, GdprConsentStatus gdprConsentStatus);

    /* JADX INFO: renamed from: setUp-0E7RQCE, reason: not valid java name */
    Object mo166setUp0E7RQCE(Context context, PartnerConfiguration partnerConfiguration, Continuation<? super Result<Unit>> continuation);

    void setUserSubjectToCoppa(Context context, boolean isSubjectToCoppa);

    /* JADX INFO: renamed from: show-0E7RQCE, reason: not valid java name */
    Object mo167show0E7RQCE(Context context, PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation);
}
