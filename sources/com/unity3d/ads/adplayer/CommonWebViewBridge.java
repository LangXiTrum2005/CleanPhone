package com.unity3d.ads.adplayer;

import ak.f;
import androidx.core.app.NotificationCompat;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.q;
import cn.u;
import cn.u1;
import cn.w;
import cn.z;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import fn.a1;
import fn.g;
import fn.m0;
import fn.n0;
import fn.r0;
import fn.s;
import fn.u0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jk.c;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import wj.h;
import wj.r;
import xj.b0;
import xj.g0;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\u0018\u00010\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J=\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010 J'\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R8\u0010:\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c090807068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR7\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D8\u0016@\u0016X\u0096\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/unity3d/ads/adplayer/CommonWebViewBridge;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcn/w;", "dispatcher", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lcn/a0;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcn/w;Lcom/unity3d/ads/adplayer/WebViewContainer;Lcn/a0;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "Lwj/r;", "execute", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/Invocation;", "invocation", "", "callbackId", "handleInvocationResult", "(Lcom/unity3d/ads/adplayer/Invocation;Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "status", "", "", "params", "respond", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lak/f;)Ljava/lang/Object;", "className", "method", "request", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "message", "handleInvocation", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "scope", "Lcn/a0;", "getScope", "()Lcn/a0;", "Lfn/n0;", "", "Lwj/f;", "Lcn/q;", "callbacks", "Lfn/n0;", "Lfn/m0;", "_onInvocation", "Lfn/m0;", "Lfn/r0;", "onInvocation", "Lfn/r0;", "getOnInvocation", "()Lfn/r0;", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "exposedFunctions", "Ljava/util/Map;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonWebViewBridge implements WebViewBridge {
    private final m0 _onInvocation;
    private final n0 callbacks;
    private Map<String, ? extends jk.a> exposedFunctions;
    private final Logger logger;
    private final r0 onInvocation;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        int label;

        public AnonymousClass1(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                Object objAddJavascriptInterface = webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this);
                bk.a aVar = bk.a.f5708a;
                if (objAddJavascriptInterface == aVar) {
                    return aVar;
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", l = {133, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements c {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, f fVar) {
            super(2, fVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass7) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r6.handleInvocationResult(r0, r2, r5) == r3) goto L15;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                bk.a r3 = bk.a.f5708a
                if (r0 == 0) goto L20
                if (r0 == r2) goto L18
                if (r0 != r1) goto L10
                t9.e.z(r6)
                goto L51
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L18:
                java.lang.Object r0 = r5.L$0
                com.unity3d.ads.adplayer.Invocation r0 = (com.unity3d.ads.adplayer.Invocation) r0
                t9.e.z(r6)
                goto L41
            L20:
                t9.e.z(r6)
                com.unity3d.ads.adplayer.Invocation r0 = new com.unity3d.ads.adplayer.Invocation
                java.lang.String r6 = r5.$location
                org.json.JSONArray r4 = r5.$parameters
                java.lang.Object[] r4 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r4)
                r0.<init>(r6, r4)
                com.unity3d.ads.adplayer.CommonWebViewBridge r6 = r5.this$0
                fn.m0 r6 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$get_onInvocation$p(r6)
                r5.L$0 = r0
                r5.label = r2
                java.lang.Object r6 = r6.emit(r0, r5)
                if (r6 != r3) goto L41
                goto L50
            L41:
                com.unity3d.ads.adplayer.CommonWebViewBridge r6 = r5.this$0
                java.lang.String r2 = r5.$callback
                r4 = 0
                r5.L$0 = r4
                r5.label = r1
                java.lang.Object r5 = com.unity3d.ads.adplayer.CommonWebViewBridge.access$handleInvocationResult(r6, r0, r2, r5)
                if (r5 != r3) goto L51
            L50:
                return r3
            L51:
                wj.r r5 = wj.r.f53297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07121 extends ck.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07121(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.handleInvocationResult(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class AnonymousClass2 extends k implements c {
        public AnonymousClass2(Object obj) {
            super(2, obj, CommonWebViewBridge.class, "sendEvent", "sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // jk.c
        public final Object invoke(WebViewEvent webViewEvent, f fVar) {
            return ((CommonWebViewBridge) this.receiver).sendEvent(webViewEvent, fVar);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "", "e", "Lwj/r;", "<anonymous>", "(Lfn/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements d {
        final /* synthetic */ Invocation $invocation;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Invocation invocation, f fVar) {
            super(3, fVar);
            this.$invocation = invocation;
        }

        @Override // jk.d
        public final Object invoke(fn.f fVar, Throwable th2, f fVar2) {
            AnonymousClass3 anonymousClass3 = CommonWebViewBridge.this.new AnonymousClass3(this.$invocation, fVar2);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            Throwable th2 = (Throwable) this.L$0;
            CommonWebViewBridge.this.logger.error("Error delivering flow event", th2);
            SendDiagnosticEvent sendDiagnosticEvent = CommonWebViewBridge.this.sendDiagnosticEvent;
            String message = th2.getMessage();
            if (message == null) {
                message = th2.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, b0.Q(new wj.f("reason_debug", message), new wj.f("webview_invocation", this.$invocation.getLocation())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {83, 85}, m = "request")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07131 extends ck.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07131(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(w dispatcher, WebViewContainer webViewContainer, a0 adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        n.f(dispatcher, "dispatcher");
        n.f(webViewContainer, "webViewContainer");
        n.f(adPlayerScope, "adPlayerScope");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        hn.d dVarY = d0.y(d0.y(adPlayerScope, dispatcher), new z("CommonWebViewBridge"));
        this.scope = dVarY;
        this.callbacks = g.c(x.f53868a);
        u0 u0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);
        this._onInvocation = u0VarA;
        this.onInvocation = g.g(u0VarA);
        this.exposedFunctions = xj.w.f53867a;
        d0.w(dVarY, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, f fVar) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, fVar);
        return objEvaluateJavascript == bk.a.f5708a ? objEvaluateJavascript : r.f53297a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x0120 A[Catch: all -> 0x00ca, PHI: r0 r1 r2 r3
  0x0120: PHI (r0v30 java.lang.Object) = (r0v24 java.lang.Object), (r0v26 java.lang.Object), (r0v1 java.lang.Object) binds: [B:50:0x011c, B:47:0x0107, B:28:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r1v11 com.unity3d.ads.adplayer.CommonWebViewBridge) = 
  (r1v27 com.unity3d.ads.adplayer.CommonWebViewBridge)
  (r1v28 com.unity3d.ads.adplayer.CommonWebViewBridge)
  (r1v13 com.unity3d.ads.adplayer.CommonWebViewBridge)
 binds: [B:50:0x011c, B:47:0x0107, B:28:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r2v13 com.unity3d.ads.adplayer.Invocation) = 
  (r2v0 com.unity3d.ads.adplayer.Invocation)
  (r2v0 com.unity3d.ads.adplayer.Invocation)
  (r2v14 com.unity3d.ads.adplayer.Invocation)
 binds: [B:50:0x011c, B:47:0x0107, B:28:0x008c] A[DONT_GENERATE, DONT_INLINE]
  0x0120: PHI (r3v7 java.lang.String) = (r3v19 java.lang.String), (r3v20 java.lang.String), (r3v9 java.lang.String) binds: [B:50:0x011c, B:47:0x0107, B:28:0x008c] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0124 A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137 A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[Catch: all -> 0x00ca, TryCatch #4 {all -> 0x00ca, blocks: (B:62:0x0157, B:64:0x015f, B:52:0x0120, B:54:0x0124, B:57:0x0137, B:59:0x013b, B:66:0x0182, B:33:0x00a6, B:35:0x00b6, B:40:0x00cd, B:42:0x00dd, B:44:0x00e5, B:46:0x00f3, B:49:0x010b, B:69:0x0196, B:70:0x01b4), top: B:96:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x01db  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.unity3d.ads.adplayer.CommonWebViewBridge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.unity3d.ads.adplayer.CommonWebViewBridge] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.unity3d.ads.adplayer.CommonWebViewBridge] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    public final Object handleInvocationResult(Invocation invocation, String str, f fVar) {
        C07121 c07121;
        ?? r3;
        ?? r2;
        String message;
        ?? r10;
        Invocation invocation2;
        ?? r11;
        Object objC;
        ?? r12;
        Throwable thA;
        String message2;
        ExposedFunction exposedFunction;
        String str2;
        CommonWebViewBridge commonWebViewBridge;
        String str3;
        CommonWebViewBridge commonWebViewBridge2;
        Object[] objArr;
        CommonWebViewBridge commonWebViewBridge3;
        Object obj;
        CommonWebViewBridge commonWebViewBridge4 = this;
        Invocation invocation3 = invocation;
        String str4 = str;
        if (fVar instanceof C07121) {
            c07121 = (C07121) fVar;
            int i10 = c07121.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07121.label = i10 - Integer.MIN_VALUE;
            } else {
                c07121 = commonWebViewBridge4.new C07121(fVar);
            }
        } else {
            c07121 = commonWebViewBridge4.new C07121(fVar);
        }
        Object objInvoke = c07121.result;
        int i11 = c07121.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        try {
            switch (i11) {
                case 0:
                    t9.e.z(objInvoke);
                    try {
                        ExposedFunctionLocation exposedFunctionLocation = ExposedFunctionLocation.INSTANCE;
                        if (exposedFunctionLocation.getEVENT_LOCATIONS().contains(invocation3.getLocation())) {
                            c07121.L$0 = commonWebViewBridge4;
                            c07121.L$1 = invocation3;
                            c07121.L$2 = str4;
                            c07121.label = 1;
                            if (commonWebViewBridge4.respond(str4, "OK", new Object[0], c07121) == aVar) {
                            }
                            return rVar;
                        }
                        jk.a aVar2 = commonWebViewBridge4.getExposedFunctions().get(invocation3.getLocation());
                        if (aVar2 == null || (exposedFunction = (ExposedFunction) aVar2.invoke()) == null) {
                            throw new IllegalStateException(("Invocation(" + invocation3.getLocation() + ") is not handled").toString());
                        }
                        if (exposedFunctionLocation.getNON_CANCELLABLE_LOCATIONS().contains(invocation3.getLocation())) {
                            u1 u1Var = u1.f6774a;
                            CommonWebViewBridge$handleInvocationResult$result$1 commonWebViewBridge$handleInvocationResult$result$1 = new CommonWebViewBridge$handleInvocationResult$result$1(exposedFunction, invocation3, null);
                            c07121.L$0 = commonWebViewBridge4;
                            c07121.L$1 = invocation3;
                            c07121.L$2 = str4;
                            c07121.label = 2;
                            objInvoke = d0.J(u1Var, commonWebViewBridge$handleInvocationResult$result$1, c07121);
                            if (objInvoke != aVar) {
                                commonWebViewBridge2 = commonWebViewBridge4;
                                str3 = str4;
                                commonWebViewBridge2 = commonWebViewBridge4;
                                str3 = str4;
                                if (objInvoke instanceof WebViewEvent) {
                                    c07121.L$0 = commonWebViewBridge2;
                                    c07121.L$1 = invocation3;
                                    c07121.L$2 = str3;
                                    c07121.label = 4;
                                    if (commonWebViewBridge2.sendEvent((WebViewEvent) objInvoke, c07121) == aVar) {
                                    }
                                    return rVar;
                                }
                                if (objInvoke instanceof wj.f) {
                                    c07121.L$0 = commonWebViewBridge2;
                                    c07121.L$1 = invocation3;
                                    c07121.L$2 = str3;
                                    c07121.label = 6;
                                    if (commonWebViewBridge2.respond(str3, "OK", new Object[]{objInvoke}, c07121) == aVar) {
                                    }
                                    return rVar;
                                }
                                objArr = new Object[]{((wj.f) objInvoke).f53283a};
                                c07121.L$0 = commonWebViewBridge2;
                                c07121.L$1 = invocation3;
                                c07121.L$2 = str3;
                                c07121.L$3 = objInvoke;
                                c07121.label = 5;
                                if (commonWebViewBridge2.respond(str3, "OK", objArr, c07121) == aVar) {
                                    commonWebViewBridge3 = commonWebViewBridge2;
                                }
                                commonWebViewBridge3 = commonWebViewBridge2;
                                obj = ((wj.f) objInvoke).f53284b;
                                if (obj instanceof fn.e) {
                                    final fn.e eVar = (fn.e) obj;
                                    g.o(new fn.k(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                                        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                        public static final class AnonymousClass2<T> implements fn.f {
                                            final /* synthetic */ fn.f $this_unsafeFlow;

                                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                            @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {224}, m = "emit")
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

                                            public AnonymousClass2(fn.f fVar) {
                                                this.$this_unsafeFlow = fVar;
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
                                                    if (obj instanceof WebViewEvent) {
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
                                            Object objCollect = eVar.collect(new AnonymousClass2(fVar2), fVar3);
                                            return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                                        }
                                    }, new AnonymousClass2(commonWebViewBridge3), 2), commonWebViewBridge3.new AnonymousClass3(invocation3, null), 2), commonWebViewBridge3.scope);
                                    return rVar;
                                }
                                return rVar;
                            }
                            commonWebViewBridge2 = commonWebViewBridge4;
                            str3 = str4;
                        } else {
                            Object[] parameters = invocation3.getParameters();
                            c07121.L$0 = commonWebViewBridge4;
                            c07121.L$1 = invocation3;
                            c07121.L$2 = str4;
                            c07121.label = 3;
                            objInvoke = exposedFunction.invoke(parameters, c07121);
                            if (objInvoke != aVar) {
                                commonWebViewBridge2 = commonWebViewBridge4;
                                str3 = str4;
                                commonWebViewBridge2 = commonWebViewBridge4;
                                str3 = str4;
                                if (objInvoke instanceof WebViewEvent) {
                                    c07121.L$0 = commonWebViewBridge2;
                                    c07121.L$1 = invocation3;
                                    c07121.L$2 = str3;
                                    c07121.label = 4;
                                    if (commonWebViewBridge2.sendEvent((WebViewEvent) objInvoke, c07121) == aVar) {
                                    }
                                    return rVar;
                                }
                                if (objInvoke instanceof wj.f) {
                                    c07121.L$0 = commonWebViewBridge2;
                                    c07121.L$1 = invocation3;
                                    c07121.L$2 = str3;
                                    c07121.label = 6;
                                    if (commonWebViewBridge2.respond(str3, "OK", new Object[]{objInvoke}, c07121) == aVar) {
                                    }
                                    return rVar;
                                }
                                objArr = new Object[]{((wj.f) objInvoke).f53283a};
                                c07121.L$0 = commonWebViewBridge2;
                                c07121.L$1 = invocation3;
                                c07121.L$2 = str3;
                                c07121.L$3 = objInvoke;
                                c07121.label = 5;
                                if (commonWebViewBridge2.respond(str3, "OK", objArr, c07121) == aVar) {
                                    commonWebViewBridge3 = commonWebViewBridge2;
                                }
                                commonWebViewBridge3 = commonWebViewBridge2;
                                obj = ((wj.f) objInvoke).f53284b;
                                if (obj instanceof fn.e) {
                                    final fn.e eVar2 = (fn.e) obj;
                                    g.o(new fn.k(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                                        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                        public static final class AnonymousClass2<T> implements fn.f {
                                            final /* synthetic */ fn.f $this_unsafeFlow;

                                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                            @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {224}, m = "emit")
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

                                            public AnonymousClass2(fn.f fVar) {
                                                this.$this_unsafeFlow = fVar;
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
                                                    if (obj instanceof WebViewEvent) {
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
                                            Object objCollect = eVar2.collect(new AnonymousClass2(fVar2), fVar3);
                                            return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                                        }
                                    }, new AnonymousClass2(commonWebViewBridge3), 2), commonWebViewBridge3.new AnonymousClass3(invocation3, null), 2), commonWebViewBridge3.scope);
                                    return rVar;
                                }
                                return rVar;
                            }
                            commonWebViewBridge2 = commonWebViewBridge4;
                            str3 = str4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = commonWebViewBridge4;
                        r3 = str4;
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        try {
                            c07121.L$0 = r2;
                            c07121.L$1 = invocation3;
                            c07121.L$2 = null;
                            c07121.L$3 = null;
                            c07121.label = 7;
                            if (r2.respond(r3, "ERROR", new Object[]{message}, c07121) != aVar) {
                                Invocation invocation4 = invocation3;
                                r11 = r2;
                                invocation2 = invocation4;
                                objC = rVar;
                                r12 = r11;
                                thA = h.a(objC);
                                if (thA != null) {
                                    SendDiagnosticEvent sendDiagnosticEvent = r12.sendDiagnosticEvent;
                                    message2 = thA.getMessage();
                                    if (message2 == null) {
                                        message2 = thA.getClass().getSimpleName();
                                    }
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, b0.Q(new wj.f("reason_debug", message2), new wj.f("webview_invocation", invocation2.getLocation())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                                }
                                return rVar;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            Invocation invocation5 = invocation3;
                            r10 = r2;
                            invocation2 = invocation5;
                            objC = t9.e.c(th);
                            r12 = r10;
                        }
                    }
                    return aVar;
                case 1:
                case 4:
                case 6:
                    t9.e.z(objInvoke);
                    return rVar;
                case 2:
                    str2 = (String) c07121.L$2;
                    invocation3 = (Invocation) c07121.L$1;
                    commonWebViewBridge = (CommonWebViewBridge) c07121.L$0;
                    t9.e.z(objInvoke);
                    CommonWebViewBridge commonWebViewBridge5 = commonWebViewBridge;
                    str3 = str2;
                    commonWebViewBridge2 = commonWebViewBridge5;
                    commonWebViewBridge2 = commonWebViewBridge4;
                    str3 = str4;
                    commonWebViewBridge2 = commonWebViewBridge4;
                    str3 = str4;
                    if (objInvoke instanceof WebViewEvent) {
                        c07121.L$0 = commonWebViewBridge2;
                        c07121.L$1 = invocation3;
                        c07121.L$2 = str3;
                        c07121.label = 4;
                        if (commonWebViewBridge2.sendEvent((WebViewEvent) objInvoke, c07121) == aVar) {
                            return aVar;
                        }
                        return rVar;
                    }
                    if (objInvoke instanceof wj.f) {
                        c07121.L$0 = commonWebViewBridge2;
                        c07121.L$1 = invocation3;
                        c07121.L$2 = str3;
                        c07121.label = 6;
                        if (commonWebViewBridge2.respond(str3, "OK", new Object[]{objInvoke}, c07121) == aVar) {
                        }
                        return rVar;
                    }
                    objArr = new Object[]{((wj.f) objInvoke).f53283a};
                    c07121.L$0 = commonWebViewBridge2;
                    c07121.L$1 = invocation3;
                    c07121.L$2 = str3;
                    c07121.L$3 = objInvoke;
                    c07121.label = 5;
                    if (commonWebViewBridge2.respond(str3, "OK", objArr, c07121) == aVar) {
                        commonWebViewBridge3 = commonWebViewBridge2;
                    }
                    commonWebViewBridge3 = commonWebViewBridge2;
                    obj = ((wj.f) objInvoke).f53284b;
                    if (obj instanceof fn.e) {
                        final fn.e eVar3 = (fn.e) obj;
                        g.o(new fn.k(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            public static final class AnonymousClass2<T> implements fn.f {
                                final /* synthetic */ fn.f $this_unsafeFlow;

                                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {224}, m = "emit")
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

                                public AnonymousClass2(fn.f fVar) {
                                    this.$this_unsafeFlow = fVar;
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
                                        if (obj instanceof WebViewEvent) {
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
                                Object objCollect = eVar3.collect(new AnonymousClass2(fVar2), fVar3);
                                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                            }
                        }, new AnonymousClass2(commonWebViewBridge3), 2), commonWebViewBridge3.new AnonymousClass3(invocation3, null), 2), commonWebViewBridge3.scope);
                        return rVar;
                    }
                    return rVar;
                    return aVar;
                case 3:
                    str2 = (String) c07121.L$2;
                    invocation3 = (Invocation) c07121.L$1;
                    commonWebViewBridge = (CommonWebViewBridge) c07121.L$0;
                    t9.e.z(objInvoke);
                    CommonWebViewBridge commonWebViewBridge6 = commonWebViewBridge;
                    str3 = str2;
                    commonWebViewBridge2 = commonWebViewBridge6;
                    commonWebViewBridge2 = commonWebViewBridge4;
                    str3 = str4;
                    commonWebViewBridge2 = commonWebViewBridge4;
                    str3 = str4;
                    if (objInvoke instanceof WebViewEvent) {
                        c07121.L$0 = commonWebViewBridge2;
                        c07121.L$1 = invocation3;
                        c07121.L$2 = str3;
                        c07121.label = 4;
                        if (commonWebViewBridge2.sendEvent((WebViewEvent) objInvoke, c07121) == aVar) {
                            return aVar;
                        }
                        return rVar;
                    }
                    if (objInvoke instanceof wj.f) {
                        c07121.L$0 = commonWebViewBridge2;
                        c07121.L$1 = invocation3;
                        c07121.L$2 = str3;
                        c07121.label = 6;
                        if (commonWebViewBridge2.respond(str3, "OK", new Object[]{objInvoke}, c07121) == aVar) {
                        }
                        return rVar;
                    }
                    objArr = new Object[]{((wj.f) objInvoke).f53283a};
                    c07121.L$0 = commonWebViewBridge2;
                    c07121.L$1 = invocation3;
                    c07121.L$2 = str3;
                    c07121.L$3 = objInvoke;
                    c07121.label = 5;
                    if (commonWebViewBridge2.respond(str3, "OK", objArr, c07121) == aVar) {
                        commonWebViewBridge3 = commonWebViewBridge2;
                    }
                    commonWebViewBridge3 = commonWebViewBridge2;
                    obj = ((wj.f) objInvoke).f53284b;
                    if (obj instanceof fn.e) {
                        final fn.e eVar4 = (fn.e) obj;
                        g.o(new fn.k(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                            /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            public static final class AnonymousClass2<T> implements fn.f {
                                final /* synthetic */ fn.f $this_unsafeFlow;

                                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {224}, m = "emit")
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

                                public AnonymousClass2(fn.f fVar) {
                                    this.$this_unsafeFlow = fVar;
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
                                        if (obj instanceof WebViewEvent) {
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
                                Object objCollect = eVar4.collect(new AnonymousClass2(fVar2), fVar3);
                                return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                            }
                        }, new AnonymousClass2(commonWebViewBridge3), 2), commonWebViewBridge3.new AnonymousClass3(invocation3, null), 2), commonWebViewBridge3.scope);
                        return rVar;
                    }
                    return rVar;
                    return aVar;
                case 5:
                    Object obj2 = c07121.L$3;
                    String str5 = (String) c07121.L$2;
                    Invocation invocation6 = (Invocation) c07121.L$1;
                    CommonWebViewBridge commonWebViewBridge7 = (CommonWebViewBridge) c07121.L$0;
                    try {
                        t9.e.z(objInvoke);
                        invocation3 = invocation6;
                        objInvoke = obj2;
                        commonWebViewBridge3 = commonWebViewBridge7;
                        commonWebViewBridge3 = commonWebViewBridge2;
                        obj = ((wj.f) objInvoke).f53284b;
                        if (obj instanceof fn.e) {
                            final fn.e eVar5 = (fn.e) obj;
                            g.o(new fn.k(new s(new fn.e() { // from class: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1

                                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", X3.i.X, "Lwj/r;", "emit", "(Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                public static final class AnonymousClass2<T> implements fn.f {
                                    final /* synthetic */ fn.f $this_unsafeFlow;

                                    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                                    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$$inlined$filterIsInstance$1$2", f = "CommonWebViewBridge.kt", l = {224}, m = "emit")
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

                                    public AnonymousClass2(fn.f fVar) {
                                        this.$this_unsafeFlow = fVar;
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
                                            if (obj instanceof WebViewEvent) {
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
                                    Object objCollect = eVar5.collect(new AnonymousClass2(fVar2), fVar3);
                                    return objCollect == bk.a.f5708a ? objCollect : r.f53297a;
                                }
                            }, new AnonymousClass2(commonWebViewBridge3), 2), commonWebViewBridge3.new AnonymousClass3(invocation3, null), 2), commonWebViewBridge3.scope);
                            return rVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r3 = str5;
                        invocation3 = invocation6;
                        r2 = commonWebViewBridge7;
                        message = th.getMessage();
                        if (message == null) {
                            message = th.getClass().getSimpleName();
                        }
                        c07121.L$0 = r2;
                        c07121.L$1 = invocation3;
                        c07121.L$2 = null;
                        c07121.L$3 = null;
                        c07121.label = 7;
                        if (r2.respond(r3, "ERROR", new Object[]{message}, c07121) != aVar) {
                            Invocation invocation7 = invocation3;
                            r11 = r2;
                            invocation2 = invocation7;
                            objC = rVar;
                            r12 = r11;
                            thA = h.a(objC);
                            if (thA != null) {
                                SendDiagnosticEvent sendDiagnosticEvent2 = r12.sendDiagnosticEvent;
                                message2 = thA.getMessage();
                                if (message2 == null) {
                                    message2 = thA.getClass().getSimpleName();
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_webview_invocation_error", (Double) null, b0.Q(new wj.f("reason_debug", message2), new wj.f("webview_invocation", invocation2.getLocation())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                            }
                        }
                        return aVar;
                    }
                    return rVar;
                case 7:
                    invocation2 = (Invocation) c07121.L$1;
                    r10 = (CommonWebViewBridge) c07121.L$0;
                    try {
                        t9.e.z(objInvoke);
                        r11 = r10;
                        objC = rVar;
                        r12 = r11;
                    } catch (Throwable th5) {
                        th = th5;
                        objC = t9.e.c(th);
                        r12 = r10;
                    }
                    thA = h.a(objC);
                    if (thA != null) {
                        SendDiagnosticEvent sendDiagnosticEvent3 = r12.sendDiagnosticEvent;
                        message2 = thA.getMessage();
                        if (message2 == null) {
                            message2 = thA.getClass().getSimpleName();
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_webview_invocation_error", (Double) null, b0.Q(new wj.f("reason_debug", message2), new wj.f("webview_invocation", invocation2.getLocation())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
                    }
                    return rVar;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th6) {
            th = th6;
            r3 = commonWebViewBridge4;
            r2 = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, f fVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, new JSONArray((Collection) j1.f.C(jSONArray)), fVar);
        return objExecute == bk.a.f5708a ? objExecute : r.f53297a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Map<String, jk.a> getExposedFunctions() {
        return this.exposedFunctions;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public r0 getOnInvocation() {
        return this.onInvocation;
    }

    public final a0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleCallback(String callbackId, String callbackStatus, String rawParameters) {
        Object next;
        a1 a1Var;
        Object value;
        n.f(callbackId, "callbackId");
        n.f(callbackStatus, "callbackStatus");
        n.f(rawParameters, "rawParameters");
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters));
        Iterator it = ((Iterable) ((a1) this.callbacks).getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!n.a((String) ((wj.f) next).f53283a, callbackId));
        wj.f fVar = (wj.f) next;
        if (fVar == null) {
            return;
        }
        q qVar = (q) fVar.f53284b;
        int iHashCode = callbackStatus.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != 2524) {
                if (iHashCode == 66247144 ? callbackStatus.equals("ERROR") : iHashCode == 96784904 && callbackStatus.equals("error")) {
                    Object obj = typedArray[0];
                    n.d(obj, "null cannot be cast to non-null type kotlin.String");
                    Exception exc = new Exception((String) obj);
                    cn.r rVar = (cn.r) qVar;
                    rVar.getClass();
                    rVar.O(new u(exc, false));
                }
            } else if (callbackStatus.equals("OK")) {
                ((cn.r) qVar).O(typedArray);
            }
        } else if (callbackStatus.equals("success")) {
            ((cn.r) qVar).O(typedArray);
        }
        n0 n0Var = this.callbacks;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, g0.u0((Set) value, fVar)));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) {
        n.f(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    this.logger.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    d0.w(this.scope, null, new AnonymousClass7(str4, jSONArray3, this, str3, null), 3);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(message), e10);
            }
        } catch (Throwable th2) {
            this.logger.error("Error handling invocation from webview (" + message + ')', th2);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = th2.getMessage();
            if (message2 == null) {
                message2 = th2.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, b0.Q(new wj.f("reason_debug", message2), new wj.f("webview_invocation", message)), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(message), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object request(String str, String str2, Object[] objArr, f fVar) throws Throwable {
        C07131 c07131;
        a1 a1Var;
        Object value;
        q qVar;
        if (fVar instanceof C07131) {
            c07131 = (C07131) fVar;
            int i10 = c07131.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07131.label = i10 - Integer.MIN_VALUE;
            } else {
                c07131 = new C07131(fVar);
            }
        } else {
            c07131 = new C07131(fVar);
        }
        Object obj = c07131.result;
        int i11 = c07131.label;
        Object obj2 = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(obj);
            cn.r rVarA = d0.a();
            Object objValueOf = String.valueOf(rVarA.hashCode());
            n0 n0Var = this.callbacks;
            do {
                a1Var = (a1) n0Var;
                value = a1Var.getValue();
            } while (!a1Var.c0(value, g0.w0((Set) value, new wj.f(objValueOf, rVarA))));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONArray.put(str2);
            jSONArray.put(objValueOf);
            for (Object obj3 : objArr) {
                jSONArray.put(obj3);
            }
            HandlerType handlerType = HandlerType.INVOCATION;
            c07131.L$0 = rVarA;
            c07131.label = 1;
            if (execute(handlerType, jSONArray, c07131) != obj2) {
                qVar = rVarA;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        qVar = (q) c07131.L$0;
        t9.e.z(obj);
        c07131.L$0 = null;
        c07131.label = 2;
        Object objS = ((cn.r) qVar).s(c07131);
        return objS == obj2 ? obj2 : objS;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, f fVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object objExecute = execute(HandlerType.EVENT, jSONArray, fVar);
        return objExecute == bk.a.f5708a ? objExecute : r.f53297a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void setExposedFunctions(Map<String, ? extends jk.a> map) {
        n.f(map, "<set-?>");
        this.exposedFunctions = map;
    }
}
