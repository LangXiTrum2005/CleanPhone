package com.unity3d.ads.core.data.manager;

import ak.f;
import an.p;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.l;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.u71;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import fn.f1;
import fn.g;
import fn.q0;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import ph.d;
import wj.r;
import xj.k;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidScarManager;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "scarEventReceiver", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "gmaBridge", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "scarTimeHackFixer", "<init>", "(Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;)V", "", "getVersion", "(Lak/f;)Ljava/lang/Object;", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "getSignals", "(Ljava/util/List;Lak/f;)Ljava/lang/Object;", "placementId", HandleInvocationsFromAdViewer.KEY_AD_STRING, "adUnitId", HandleInvocationsFromAdViewer.KEY_QUERY_ID, "", HandleInvocationsFromAdViewer.KEY_VIDEO_LENGTH, "Lwj/r;", "loadAd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILak/f;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/unity3d/services/banners/BannerView;", "bannerView", "Lph/c;", "scarAdMetadata", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "opportunityId", "Lfn/e;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "loadBannerAd", "(Landroid/content/Context;Lcom/unity3d/services/banners/BannerView;Lph/c;Lcom/unity3d/services/banners/UnityBannerSize;Ljava/lang/String;)Lfn/e;", "show", "(Ljava/lang/String;Ljava/lang/String;)Lfn/e;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, f fVar) {
            super(2, fVar);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass2(this.$adFormat, this.this$0, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            final l lVar = new l(1, q1.t(this));
            lVar.t();
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    d unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                    if (unityAdFormat == d.f48376a) {
                        unityAdFormat = null;
                    }
                    if (unityAdFormat != null) {
                        arrayList.add(unityAdFormat);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                lVar.resumeWith(null);
            } else {
                androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(String msg) {
                        lVar.resumeWith(t9.e.c(new Exception(msg)));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(BiddingSignals signals) {
                        lVar.resumeWith(signals);
                    }
                }));
            }
            Object objS = lVar.s();
            bk.a aVar = bk.a.f5708a;
            return objS == aVar ? aVar : objS;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "", "<anonymous>", "(Lcn/a0;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    public static final class C07442 extends i implements c {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements c {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, f fVar) {
                super(2, fVar);
                this.this$0 = androidScarManager;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass1(this.this$0, fVar);
            }

            @Override // jk.c
            public final Object invoke(fn.f fVar, f fVar2) {
                return ((AnonymousClass1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                this.this$0.gmaBridge.getVersion();
                return r.f53297a;
            }
        }

        public C07442(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidScarManager.this.new C07442(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((C07442) create(a0Var, fVar)).invokeSuspend(r.f53297a);
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
            f1 f1Var = new f1(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
            this.label = 1;
            Object objK = g.k(f1Var, this);
            bk.a aVar = bk.a.f5708a;
            return objK == aVar ? aVar : objK;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = "loadAd")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends ck.c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C07452 extends i implements c {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07452(boolean z10, String str, String str2, String str3, String str4, int i10, f fVar) {
            super(2, fVar);
            this.$canSkip = z10;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i10;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidScarManager.this.new C07452(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((C07452) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements c {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, f fVar) {
            super(2, fVar);
            this.$placementId = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, fVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // jk.c
        public final Object invoke(GmaEventData gmaEventData, f fVar) {
            return ((AnonymousClass3) create(gmaEventData, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0045  */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            if (o.Q(b.f38567k, b.f38570o).contains(gmaEventData.getGmaEvent()) && n.a(gmaEventData.getPlacementId(), this.$placementId)) {
                z10 = true;
            } else {
                if (o.Q(b.E, b.f38558b, b.f38569n).contains(gmaEventData.getGmaEvent())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C07461 extends i implements c {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ ph.c $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07461(Context context, BannerView bannerView, String str, ph.c cVar, UnityBannerSize unityBannerSize, f fVar) {
            super(2, fVar);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidScarManager.this.new C07461(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((C07461) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C07471 extends i implements c {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07471(String str, String str2, f fVar) {
            super(2, fVar);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidScarManager.this.new C07471(this.$placementId, this.$queryId, fVar);
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((C07471) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "it", "", "<anonymous>", "(Lfn/f;Lcom/unity3d/ads/core/domain/scar/GmaEventData;)Z"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    public static final class C07482 extends i implements jk.d {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C07482(f fVar) {
            super(3, fVar);
        }

        @Override // jk.d
        public final Object invoke(fn.f fVar, GmaEventData gmaEventData, f fVar2) {
            C07482 c07482 = new C07482(fVar2);
            c07482.L$0 = fVar;
            c07482.L$1 = gmaEventData;
            return c07482.invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                fn.f fVar = (fn.f) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                Object objEmit = fVar.emit(gmaEventData2, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                t9.e.z(obj);
            }
            return Boolean.valueOf(!k.c0(new b[]{b.D, b.f38571p, b.f38576u, b.f38575t}, gmaEventData.getGmaEvent()));
        }
    }

    public AndroidScarManager(CommonScarEventReceiver scarEventReceiver, GMAScarAdapterBridge gmaBridge, ScarTimeHackFixer scarTimeHackFixer) {
        n.f(scarEventReceiver, "scarEventReceiver");
        n.f(gmaBridge, "gmaBridge");
        n.f(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, f fVar) {
        return d0.K(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), fVar);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(f fVar) {
        return d0.K(5000L, new C07442(null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object loadAd(String str, String str2, String str3, String str4, String str5, int i10, f fVar) throws LoadException {
        AnonymousClass1 anonymousClass1;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objL = anonymousClass2.result;
        int i12 = anonymousClass2.label;
        if (i12 == 0) {
            t9.e.z(objL);
            f1 f1Var = new f1(this.scarEventReceiver.getGmaEventFlow(), new C07452(p.i0(str, "INTERSTITIAL"), str2, str5, str3, str4, i10, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str2, null);
            anonymousClass2.label = 1;
            objL = g.l(f1Var, anonymousClass3, anonymousClass2);
            bk.a aVar = bk.a.f5708a;
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objL);
        }
        GmaEventData gmaEventData = (GmaEventData) (((GmaEventData) objL).getGmaEvent() != b.f38567k ? objL : null);
        if (gmaEventData == null) {
            return r.f53297a;
        }
        StringBuilder sb2 = new StringBuilder("Error loading SCAR ad: ");
        Object errorMessage = gmaEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = gmaEventData.getGmaEvent();
        }
        sb2.append(errorMessage);
        throw new LoadException(0, sb2.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public fn.e loadBannerAd(Context context, BannerView bannerView, ph.c scarAdMetadata, UnityBannerSize bannerSize, final String opportunityId) {
        n.f(context, "context");
        n.f(bannerView, "bannerView");
        n.f(scarAdMetadata, "scarAdMetadata");
        n.f(bannerSize, "bannerSize");
        n.f(opportunityId, "opportunityId");
        final fn.k kVar = new fn.k(new C07461(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null), this.scarEventReceiver.getGmaEventFlow());
        return new fn.e() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements fn.f {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ fn.f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public static final class AnonymousClass1 extends ck.c {
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

                public AnonymousClass2(fn.f fVar, String str) {
                    this.$this_unsafeFlow = fVar;
                    this.$opportunityId$inlined = str;
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
                        GmaEventData gmaEventData = (GmaEventData) obj;
                        if (gmaEventData.getGmaEvent() == b.F && n.a(gmaEventData.getOpportunityId(), this.$opportunityId$inlined)) {
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
            public Object collect(fn.f fVar, f fVar2) {
                Object objCollect = kVar.collect(new AnonymousClass2(fVar, opportunityId), fVar2);
                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public fn.e show(String placementId, String queryId) {
        n.f(placementId, "placementId");
        n.f(queryId, "queryId");
        return new q0(new u71(new f1(this.scarEventReceiver.getGmaEventFlow(), new C07471(placementId, queryId, null)), new C07482(null), (f) null));
    }
}
