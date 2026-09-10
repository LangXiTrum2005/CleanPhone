package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends WebChromeClient implements yj.a, j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc f13573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj f13574c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f13575e;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f13577c;
        public final /* synthetic */ ConsoleMessage d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConsoleMessage consoleMessage, Continuation continuation) {
            super(2, continuation);
            this.f13577c = str;
            this.d = consoleMessage;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f13577c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13576b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            String str = this.f13577c;
            int iLineNumber = this.d.lineNumber();
            String strSourceId = this.d.sourceId();
            StringBuilder sbZ = android.support.v4.media.a.z("Chartboost Rich Webview: ", str, " -- From line ", iLineNumber, " of ");
            sbZ.append(strSourceId);
            za.a(sbZ.toString(), (Throwable) null, 2, (Object) null);
            return Unit.f43263a;
        }
    }

    public c3(View activityNonVideoView, qc cmd, yj yjVar) {
        Intrinsics.f(activityNonVideoView, "activityNonVideoView");
        Intrinsics.f(cmd, "cmd");
        this.f13572a = activityNonVideoView;
        this.f13573b = cmd;
        this.f13574c = yjVar;
        cmd.a(this);
    }

    public final void a(String str) {
        yj yjVar = this.f13574c;
        if (yjVar != null) {
            yjVar.a(str, this);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        Intrinsics.f(cm, "cm");
        String strMessage = cm.message();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new a(strMessage, cm, null), 3);
        Intrinsics.c(strMessage);
        a(strMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient, com.chartboost.sdk.impl.j8
    public void onHideCustomView() {
        WebChromeClient.CustomViewCallback customViewCallback;
        if (this.d) {
            this.f13572a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback2 = this.f13575e;
            if (customViewCallback2 != null && !StringsKt.l(customViewCallback2.getClass().getName(), ".chromium.", false) && (customViewCallback = this.f13575e) != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.d = false;
            this.f13575e = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2 == null) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("eventType");
            Intrinsics.e(string, "getString(...)");
            JSONObject jSONObject2 = jSONObject.getJSONObject("eventArgs");
            Intrinsics.e(jSONObject2, "getJSONObject(...)");
            String strA = this.f13573b.a(jSONObject2, string);
            if (jsPromptResult != null) {
                jsPromptResult.confirm(strA);
            }
            return true;
        } catch (JSONException unused) {
            za.b("Exception caught parsing the function name from js to native", (Throwable) null, 2, (Object) null);
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // com.chartboost.sdk.impl.yj.a
    public void a(JSONObject jSONObject) {
        this.f13573b.a(jSONObject, rc.ERROR.c());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.d = true;
            this.f13575e = customViewCallback;
            this.f13572a.setVisibility(4);
        }
    }
}
