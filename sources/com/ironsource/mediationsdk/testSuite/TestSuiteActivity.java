package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C0289cg;
import com.ironsource.C0474n4;
import com.ironsource.Of;
import com.ironsource.S8;
import com.ironsource.Xf;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import xe.a;
import xe.b;
import xe.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class TestSuiteActivity extends Activity implements S8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f29718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0289cg f29719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Xf f29720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f29721d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets insets) {
        n.f(view, "view");
        n.f(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        n.e(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final JSONObject d() {
        String strB = new Of().b(this);
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    return new JSONObject(strB);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private final RelativeLayout.LayoutParams e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.f29721d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f29721d = null;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.f29718a;
            if (relativeLayout == null) {
                n.l("mContainer");
                throw null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new a());
            RelativeLayout relativeLayout2 = this.f29718a;
            if (relativeLayout2 != null) {
                relativeLayout2.requestApplyInsets();
            } else {
                n.l("mContainer");
                throw null;
            }
        }
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f29718a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        n.l("mContainer");
        throw null;
    }

    @Override // com.ironsource.S8
    public void onClosed() {
        runOnUiThread(new c(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f29718a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C0289cg c0289cg = new C0289cg(this, this, d(), c());
        this.f29719b = c0289cg;
        Xf xf2 = new Xf(c0289cg);
        this.f29720c = xf2;
        xf2.d();
        RelativeLayout relativeLayout2 = this.f29718a;
        if (relativeLayout2 == null) {
            n.l("mContainer");
            throw null;
        }
        C0289cg c0289cg2 = this.f29719b;
        if (c0289cg2 == null) {
            n.l("mWebViewWrapper");
            throw null;
        }
        relativeLayout2.addView(c0289cg2.d(), e());
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        f();
        Xf xf2 = this.f29720c;
        if (xf2 == null) {
            n.l("mNativeBridge");
            throw null;
        }
        xf2.a();
        RelativeLayout relativeLayout = this.f29718a;
        if (relativeLayout == null) {
            n.l("mContainer");
            throw null;
        }
        relativeLayout.removeAllViews();
        C0289cg c0289cg = this.f29719b;
        if (c0289cg == null) {
            n.l("mWebViewWrapper");
            throw null;
        }
        c0289cg.a();
        super.onDestroy();
    }

    @Override // com.ironsource.S8
    public void onUIReady() {
        runOnUiThread(new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        n.f(this$0, "this$0");
        C0289cg c0289cg = this$0.f29719b;
        if (c0289cg == null) {
            n.l("mWebViewWrapper");
            throw null;
        }
        if (c0289cg.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f29718a;
            if (relativeLayout == null) {
                n.l("mContainer");
                throw null;
            }
            C0289cg c0289cg2 = this$0.f29719b;
            if (c0289cg2 == null) {
                n.l("mWebViewWrapper");
                throw null;
            }
            relativeLayout.removeView(c0289cg2.d());
            RelativeLayout relativeLayout2 = this$0.f29718a;
            if (relativeLayout2 == null) {
                n.l("mContainer");
                throw null;
            }
            C0289cg c0289cg3 = this$0.f29719b;
            if (c0289cg3 == null) {
                n.l("mWebViewWrapper");
                throw null;
            }
            relativeLayout2.addView(c0289cg3.c(), this$0.e());
            C0289cg c0289cg4 = this$0.f29719b;
            if (c0289cg4 != null) {
                c0289cg4.b();
            } else {
                n.l("mWebViewWrapper");
                throw null;
            }
        }
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            b bVar = new b();
            this.f29721d = bVar;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        n.f(this$0, "this$0");
        this$0.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
