package com.unity3d.ads.core.domain;

import ak.f;
import android.content.Context;
import android.content.Intent;
import ck.c;
import ck.e;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import fn.f1;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.g;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0013\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/IntentCreation;", "intentCreation", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "url", "packageName", "action", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLak/f;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/IntentCreation;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE}, m = "invoke")
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
            return AndroidHandleOpenUrl.this.invoke(null, null, null, null, null, false, this);
        }
    }

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        n.f(context, "context");
        n.f(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public Object invoke(final AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z10, f fVar) {
        AnonymousClass1 anonymousClass1;
        Object objC;
        boolean success;
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
        Object objK = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objK);
            Intent intentInvoke = this.intentCreation.invoke(str, str2, str3, map);
            if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                intentInvoke.setFlags(268435456);
                try {
                    this.context.startActivity(intentInvoke);
                    objC = r.f53297a;
                } catch (Throwable th2) {
                    objC = t9.e.c(th2);
                }
                success = !(objC instanceof g);
            } else {
                final f1 f1Var = new f1(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new AndroidHandleOpenUrl$invoke$result$1(adObject, intentInvoke, z10, null));
                fn.e eVar = new fn.e() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class AnonymousClass2<T> implements fn.f {
                        final /* synthetic */ AdObject $adObject$inlined;
                        final /* synthetic */ fn.f $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                        @e(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", l = {223}, m = "emit")
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                        public static final class AnonymousClass1 extends c {
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(fn.f fVar, AdObject adObject) {
                            this.$this_unsafeFlow = fVar;
                            this.$adObject$inlined = adObject;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // fn.f
                        public final Object emit(Object obj, f fVar) {
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
                            Object obj2 = anonymousClass1.result;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                t9.e.z(obj2);
                                fn.f fVar2 = this.$this_unsafeFlow;
                                DisplayMessage displayMessage = (DisplayMessage) obj;
                                if ((displayMessage instanceof DisplayMessage.OpenUrlResult) && n.a(displayMessage.getOpportunityId(), ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = fVar2.emit(obj, anonymousClass1);
                                    bk.a aVar = bk.a.f5708a;
                                    if (objEmit == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t9.e.z(obj2);
                            }
                            return r.f53297a;
                        }
                    }

                    @Override // fn.e
                    public Object collect(fn.f fVar2, f fVar3) {
                        Object objCollect = f1Var.collect(new AnonymousClass2(fVar2, adObject), fVar3);
                        return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                    }
                };
                anonymousClass1.label = 1;
                objK = fn.g.k(eVar, anonymousClass1);
                bk.a aVar = bk.a.f5708a;
                if (objK == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(success);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(objK);
        n.d(objK, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
        success = ((DisplayMessage.OpenUrlResult) objK).getSuccess();
        return Boolean.valueOf(success);
    }
}
