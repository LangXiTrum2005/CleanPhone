package com.unity3d.ads.core.domain;

import ak.f;
import android.content.Context;
import ck.e;
import ck.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import fn.a1;
import fn.q0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "gameServerIdReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "handleGatewayAdResponse", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/UnityAdsShowOptions;", "showOptions", "Lfn/e;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/UnityAdsShowOptions;)Lfn/e;", "Lwj/r;", "terminate", "(Lcom/unity3d/ads/core/data/model/AdObject;Lak/f;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final Context context;
    private final GameServerIdReader gameServerIdReader;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final ValidateExtrasSize validateExtrasSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {45, 88}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "Lwj/r;", "<anonymous>", "(Lfn/f;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass4 extends i implements c {
            final /* synthetic */ c0 $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ AdPlayer $adPlayer;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(c0 c0Var, AndroidShow androidShow, AdObject adObject, AdPlayer adPlayer, UnityAdsShowOptions unityAdsShowOptions, f fVar) {
                super(2, fVar);
                this.$ad = c0Var;
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$adPlayer = adPlayer;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass4(this.$ad, this.this$0, this.$adObject, this.$adPlayer, this.$showOptions, fVar);
            }

            @Override // jk.c
            public final Object invoke(fn.f fVar, f fVar2) {
                return ((AnonymousClass4) create(fVar, fVar2)).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                JSONObject data;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                AdObject adObject = (AdObject) this.$ad.f44760a;
                GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                Object playerServerId = ((AdObject) this.$ad.f44760a).getPlayerServerId();
                Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = playerServerId;
                    }
                    if (obj2 != null) {
                        playerServerId = obj2;
                    }
                }
                if (gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey()) != null) {
                    gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                }
                adObject.setPlayerServerId((String) playerServerId);
                ((a1) this.$adObject.getState()).d0(AdObjectState.SHOWING);
                AdPlayer adPlayer = this.$adPlayer;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                adPlayer.show(new AndroidShowOptions((unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null) ? null : JSONObjectExtensionsKt.toBuiltInMap(data), ((AdObject) this.$ad.f44760a).getPlacementId(), ((AdObject) this.$ad.f44760a).isScarAd(), ((AdObject) this.$ad.f44760a).getScarQueryId(), ((AdObject) this.$ad.f44760a).getScarAdString(), ((AdObject) this.$ad.f44760a).getScarAdUnitId(), ((AdObject) this.$ad.f44760a).isOfferwallAd(), ((AdObject) this.$ad.f44760a).getOfferwallPlacementName()));
                return r.f53297a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Lwj/r;", "<anonymous>", "(Lfn/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass5 extends i implements d {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(AdObject adObject, AndroidShow androidShow, ByteString byteString, f fVar) {
                super(3, fVar);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // jk.d
            public final Object invoke(fn.f fVar, Throwable th2, f fVar2) {
                return new AnonymousClass5(this.$adObject, this.this$0, this.$opportunityId, fVar2).invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                ((a1) this.$adObject.getState()).d0(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return r.f53297a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "", "<anonymous>", "(Lfn/f;Lcom/unity3d/ads/core/data/model/ShowEvent;)Z"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", l = {85}, m = "invokeSuspend")
        public static final class AnonymousClass6 extends i implements d {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass6(f fVar) {
                super(3, fVar);
            }

            @Override // jk.d
            public final Object invoke(fn.f fVar, ShowEvent showEvent, f fVar2) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(fVar2);
                anonymousClass6.L$0 = fVar;
                anonymousClass6.L$1 = showEvent;
                return anonymousClass6.invokeSuspend(r.f53297a);
            }

            @Override // ck.a
            public final Object invokeSuspend(Object obj) {
                ShowEvent showEvent;
                int i10 = this.label;
                if (i10 == 0) {
                    t9.e.z(obj);
                    fn.f fVar = (fn.f) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    Object objEmit = fVar.emit(showEvent2, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objEmit == aVar) {
                        return aVar;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    t9.e.z(obj);
                }
                return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, f fVar) {
            super(2, fVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // jk.c
        public final Object invoke(fn.f fVar, f fVar2) {
            return ((AnonymousClass1) create(fVar, fVar2)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0132  */
        /* JADX WARN: Code duplicated, block: B:42:0x0182  */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x017c, code lost:
        
            if (r0.collect(r1, r25) == r11) goto L39;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidShow(Context context, AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize, HandleGatewayAdResponse handleGatewayAdResponse) {
        n.f(context, "context");
        n.f(adRepository, "adRepository");
        n.f(gameServerIdReader, "gameServerIdReader");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(validateExtrasSize, "validateExtrasSize");
        n.f(handleGatewayAdResponse, "handleGatewayAdResponse");
        this.context = context;
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public fn.e invoke(AdObject adObject, UnityAdsShowOptions showOptions) {
        n.f(adObject, "adObject");
        return new q0(new AnonymousClass1(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, f fVar) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(fVar)) != bk.a.f5708a) ? r.f53297a : objDestroy;
    }
}
