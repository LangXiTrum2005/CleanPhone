package com.chartboost.sdk.internal.clickthrough;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.ah;
import com.chartboost.sdk.impl.ch;
import com.chartboost.sdk.impl.fh;
import com.chartboost.sdk.impl.u6;
import com.chartboost.sdk.impl.ug;
import com.chartboost.sdk.impl.xg;
import com.chartboost.sdk.impl.z6;
import com.chartboost.sdk.impl.za;
import com.p004ironsource.d9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0002 #B\u0007¢\u0006\u0004\b/\u00100J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0014\u0010\u000b\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0017J\u0014\u0010\r\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0017J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0018J\u0014\u0010\u0014\u001a\u00020\u0012*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u0014\u0010\u0016\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001b\u0010*\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b \u0010)R\u001b\u0010.\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b(\u0010-¨\u00062"}, d2 = {"Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity;", "Landroid/app/Activity;", "Lcom/chartboost/sdk/impl/z6;", "", "type", "location", "", "clear", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chartboost/sdk/impl/ch;", "event", "clearFromStorage", "(Lcom/chartboost/sdk/impl/ch;)V", "persist", "Lcom/chartboost/sdk/impl/ah;", com.smartdigimkt.q0.b.i0, "refresh", "(Lcom/chartboost/sdk/impl/ah;)V", "Lcom/chartboost/sdk/impl/ug;", "ad", d9.h.f24716U, "(Lcom/chartboost/sdk/impl/ug;)V", "track", "(Lcom/chartboost/sdk/impl/ch;)Lcom/chartboost/sdk/impl/ch;", "(Lcom/chartboost/sdk/impl/ah;)Lcom/chartboost/sdk/impl/ah;", "(Lcom/chartboost/sdk/impl/ug;)Lcom/chartboost/sdk/impl/ug;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "t", "a", "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "b", "Lkotlin/Lazy;", "()Landroid/view/View;", "view", "Landroid/widget/FrameLayout;", "c", "()Landroid/widget/FrameLayout;", "frameLayout", "Landroid/webkit/WebView;", "d", "()Landroid/webkit/WebView;", "webView", "<init>", "()V", "Companion", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class EmbeddedBrowserActivity extends Activity implements z6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z6 f15806a = xg.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Lazy view = LazyKt.b(new d());

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Lazy frameLayout = LazyKt.b(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Lazy webView = LazyKt.b(new e());

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Intent a(Context context, String url) {
            Intrinsics.f(context, "context");
            Intrinsics.f(url, "url");
            Intent intentPutExtra = new Intent(context, (Class<?>) EmbeddedBrowserActivity.class).putExtra("KEY_INTENT_URL", url);
            Intrinsics.e(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final String a(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_INTENT_URL");
            }
            return null;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayout = new FrameLayout(EmbeddedBrowserActivity.this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FrameLayout invoke() {
            FrameLayout frameLayoutA = EmbeddedBrowserActivity.this.a();
            frameLayoutA.addView(EmbeddedBrowserActivity.this.c());
            return frameLayoutA;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke() {
            WebView webView = new WebView(EmbeddedBrowserActivity.this);
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setWebViewClient(embeddedBrowserActivity.new b());
            return webView;
        }
    }

    public final FrameLayout a() {
        return (FrameLayout) this.frameLayout.getX();
    }

    public final View b() {
        return (View) this.view.getX();
    }

    public final WebView c() {
        return (WebView) this.webView.getX();
    }

    @Override // com.chartboost.sdk.impl.y6
    public void clear(String type, String location) {
        Intrinsics.f(type, "type");
        Intrinsics.f(location, "location");
        this.f15806a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch clearFromStorage(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15806a.clearFromStorage(chVar);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objA;
        Object obj;
        try {
            super.onCreate(savedInstanceState);
            setContentView(b());
            String strA = INSTANCE.a(getIntent());
            objA = Unit.f43263a;
            if (strA != null) {
                c().loadUrl(strA);
                obj = objA;
            } else {
                obj = null;
            }
            if (obj == null) {
                a(this, null, 1, null);
            }
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            a(thA);
        }
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch persist(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15806a.persist(chVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ah refresh(ah ahVar) {
        Intrinsics.f(ahVar, "<this>");
        return this.f15806a.refresh(ahVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ug store(ug ugVar) {
        Intrinsics.f(ugVar, "<this>");
        return this.f15806a.store(ugVar);
    }

    @Override // com.chartboost.sdk.impl.z6
    public ch track(ch chVar) {
        Intrinsics.f(chVar, "<this>");
        return this.f15806a.track(chVar);
    }

    public static /* synthetic */ void a(EmbeddedBrowserActivity embeddedBrowserActivity, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        embeddedBrowserActivity.a(th);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: clearFromStorage */
    public void mo185clearFromStorage(ch event) {
        Intrinsics.f(event, "event");
        this.f15806a.mo185clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: persist */
    public void mo186persist(ch event) {
        Intrinsics.f(event, "event");
        this.f15806a.mo186persist(event);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: refresh */
    public void mo187refresh(ah config) {
        Intrinsics.f(config, "config");
        this.f15806a.mo187refresh(config);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: store */
    public void mo188store(ug ad) {
        Intrinsics.f(ad, "ad");
        this.f15806a.mo188store(ad);
    }

    @Override // com.chartboost.sdk.impl.y6
    /* JADX INFO: renamed from: track */
    public void mo189track(ch event) {
        Intrinsics.f(event, "event");
        this.f15806a.mo189track(event);
    }

    public final void a(Throwable t) {
        za.b("Error loading URL into embedded browser", t);
        finish();
    }

    public final class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f15809a = CollectionsKt.I(-1, -2, -3, -6, -9, -10, -11, -12);

        public b() {
        }

        public final String a(WebResourceError webResourceError) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
            if (description == null) {
                description = "";
            }
            jSONObject.put("error", description);
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }

        public final boolean b(WebResourceError webResourceError) {
            List list = this.f15809a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (webResourceError != null && iIntValue == webResourceError.getErrorCode()) {
                    return true;
                }
            }
            return false;
        }

        public final void c(WebResourceError webResourceError) {
            if (b(webResourceError)) {
                EmbeddedBrowserActivity.this.track((ch) new u6(fh.g.FAILURE, a(webResourceError), null, null, null, 28, null));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            za.b("onReceivedError: " + webResourceError, (Throwable) null, 2, (Object) null);
            if (Chartboost.isSdkStarted()) {
                c(webResourceError);
                return;
            }
            za.b("SDK is not initialized. Cannot track error: " + webResourceError, (Throwable) null, 2, (Object) null);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            za.b("onReceivedHttpError: " + webResourceResponse, (Throwable) null, 2, (Object) null);
            b(webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            EmbeddedBrowserActivity embeddedBrowserActivity = EmbeddedBrowserActivity.this;
            fh.b bVar = fh.b.FAILURE;
            if (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) {
                str = "Webview killed, likely due to low memory";
            } else {
                str = "Webview crashed " + renderProcessGoneDetail;
            }
            embeddedBrowserActivity.track((ch) new u6(bVar, str, null, null, null, 28, null));
            Context context = webView != null ? webView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return true;
        }

        public final String a(WebResourceResponse webResourceResponse) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            jSONObject.put("error", "HTTP status code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }

        public final void b(WebResourceResponse webResourceResponse) {
            EmbeddedBrowserActivity.this.track((ch) new u6(fh.g.FAILURE, a(webResourceResponse), null, null, null, 28, null));
        }
    }
}
