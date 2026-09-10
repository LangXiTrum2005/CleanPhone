package com.codejoy.boom.clap.module;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.codejoy.boom.clap.helper.formularize;
import com.codejoy.boom.clap.module.WebViewActivity;
import com.codejoy.boom.clap.module.base.BaseActivity;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;
import sonnetize.impassible;

/* JADX INFO: compiled from: WebViewActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/codejoy/boom/clap/module/WebViewActivity;", "Lcom/codejoy/boom/clap/module/base/BaseActivity;", "Lsonnetize/impassible;", "<init>", "()V", "cultivated", "()Lsonnetize/impassible;", "", "privatdozent", "saran", "onDestroy", "permissivist", "", "cord", "Lpatroclinal/taiyuan;", "overspeculate", "()Ljava/lang/String;", "webTitle", "cuirassed", "clubfoot", "webUrl", "stratoscope", "attabal", "saneness", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WebViewActivity extends BaseActivity<impassible> {

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f18272trm = 8;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final taiyuan webTitle = p002kotlin.saneness.saneness(new Function0() { // from class: motel.attabal
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebViewActivity.premeiotic(this.f33630kowloon);
        }
    });

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public final taiyuan webUrl = p002kotlin.saneness.saneness(new Function0() { // from class: motel.saneness
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebViewActivity.timberyard(this.f33632kowloon);
        }
    });

    /* JADX INFO: renamed from: com.codejoy.boom.clap.module.WebViewActivity$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WebViewActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/codejoy/boom/clap/module/WebViewActivity$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "title", "url", "", "attabal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "KEY_TITLE", "Ljava/lang/String;", "KEY_URL", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void attabal(Context context, String title, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra("TITLE", title);
            intent.putExtra("URL", url);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: WebViewActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/codejoy/boom/clap/module/WebViewActivity$saneness;", "Landroid/webkit/WebChromeClient;", "<init>", "(Lcom/codejoy/boom/clap/module/WebViewActivity;)V", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "title", "", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class saneness extends WebChromeClient {
        public saneness() {
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (WebViewActivity.this.overspeculate().length() != 0 || title == null) {
                return;
            }
            WebViewActivity.this.grimness().f37852wireman.setText(title);
        }
    }

    public static final void dent(WebViewActivity webViewActivity, View view) {
        webViewActivity.getOnBackPressedDispatcher().formularize();
    }

    public static final String premeiotic(WebViewActivity webViewActivity) {
        String stringExtra = webViewActivity.getIntent().getStringExtra("TITLE");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final String timberyard(WebViewActivity webViewActivity) {
        String stringExtra = webViewActivity.getIntent().getStringExtra("URL");
        return stringExtra == null ? "" : stringExtra;
    }

    public final String clubfoot() {
        return (String) this.webUrl.getValue();
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    /* JADX INFO: renamed from: cultivated, reason: merged with bridge method [inline-methods] */
    public impassible starveling() {
        impassible impassibleVarDern = impassible.dern(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(impassibleVarDern, "inflate(...)");
        return impassibleVarDern;
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        grimness().f37850marial.destroy();
        super.onDestroy();
    }

    public final String overspeculate() {
        return (String) this.webTitle.getValue();
    }

    public final void permissivist() {
        if (TextUtils.isEmpty(clubfoot())) {
            return;
        }
        grimness().f37850marial.loadUrl(clubfoot());
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void privatdozent() {
        ConstraintLayout root = grimness().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        vintage.taiyuan.apical(root);
        grimness().f37851saneness.setOnClickListener(new View.OnClickListener() { // from class: motel.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.dent(this.f33631kowloon, view);
            }
        });
        grimness().f37852wireman.setText(overspeculate());
    }

    @Override // com.codejoy.boom.clap.module.base.BaseActivity
    public void saran() {
        WebView webView = grimness().f37850marial;
        webView.setScrollBarStyle(0);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        formularize formularizeVar = formularize.f18261attabal;
        WebView webView2 = grimness().f37850marial;
        Intrinsics.checkNotNullExpressionValue(webView2, "webView");
        formularizeVar.attabal(webView2, new WebViewClient(), new saneness());
        permissivist();
    }
}
