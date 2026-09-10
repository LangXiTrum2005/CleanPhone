package com.p004ironsource.mediationsdk.testSuite;

import F.a;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.p004ironsource.fv;
import com.p004ironsource.oi;
import com.p004ironsource.rv;
import com.p004ironsource.wv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "Landroid/app/Activity;", "Lcom/ironsource/oi;", "Lorg/json/JSONObject;", "b", "", "a", "Landroid/widget/RelativeLayout$LayoutParams;", "c", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "onDestroy", "onUIReady", "onClosed", "Landroid/widget/RelativeLayout;", "getContainer", "Landroid/widget/RelativeLayout;", "mContainer", "Lcom/ironsource/wv;", "Lcom/ironsource/wv;", "mWebViewWrapper", "Lcom/ironsource/rv;", "Lcom/ironsource/rv;", "mNativeBridge", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class TestSuiteActivity extends Activity implements oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private RelativeLayout mContainer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wv mWebViewWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private rv mNativeBridge;

    private final String a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject b() {
        String strB = new fv().b(this);
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

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m("mContainer");
        throw null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p004ironsource.oi
    public void onClosed() {
        runOnUiThread(new a(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.mContainer = relativeLayout;
        setContentView(relativeLayout, c());
        wv wvVar = new wv(this, this, b(), a());
        this.mWebViewWrapper = wvVar;
        rv rvVar = new rv(wvVar);
        this.mNativeBridge = rvVar;
        rvVar.d();
        RelativeLayout relativeLayout2 = this.mContainer;
        if (relativeLayout2 == null) {
            Intrinsics.m("mContainer");
            throw null;
        }
        wv wvVar2 = this.mWebViewWrapper;
        if (wvVar2 != null) {
            relativeLayout2.addView(wvVar2.getMLoadingScreenWebView(), c());
        } else {
            Intrinsics.m("mWebViewWrapper");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        rv rvVar = this.mNativeBridge;
        if (rvVar == null) {
            Intrinsics.m("mNativeBridge");
            throw null;
        }
        rvVar.a();
        RelativeLayout relativeLayout = this.mContainer;
        if (relativeLayout == null) {
            Intrinsics.m("mContainer");
            throw null;
        }
        relativeLayout.removeAllViews();
        wv wvVar = this.mWebViewWrapper;
        if (wvVar == null) {
            Intrinsics.m("mWebViewWrapper");
            throw null;
        }
        wvVar.a();
        super.onDestroy();
    }

    @Override // com.p004ironsource.oi
    public void onUIReady() {
        runOnUiThread(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.f(this$0, "this$0");
        wv wvVar = this$0.mWebViewWrapper;
        if (wvVar == null) {
            Intrinsics.m("mWebViewWrapper");
            throw null;
        }
        if (wvVar.getMAppWebView().getParent() == null) {
            RelativeLayout relativeLayout = this$0.mContainer;
            if (relativeLayout == null) {
                Intrinsics.m("mContainer");
                throw null;
            }
            wv wvVar2 = this$0.mWebViewWrapper;
            if (wvVar2 == null) {
                Intrinsics.m("mWebViewWrapper");
                throw null;
            }
            relativeLayout.removeView(wvVar2.getMLoadingScreenWebView());
            RelativeLayout relativeLayout2 = this$0.mContainer;
            if (relativeLayout2 == null) {
                Intrinsics.m("mContainer");
                throw null;
            }
            wv wvVar3 = this$0.mWebViewWrapper;
            if (wvVar3 == null) {
                Intrinsics.m("mWebViewWrapper");
                throw null;
            }
            relativeLayout2.addView(wvVar3.getMAppWebView(), this$0.c());
            wv wvVar4 = this$0.mWebViewWrapper;
            if (wvVar4 != null) {
                wvVar4.b();
            } else {
                Intrinsics.m("mWebViewWrapper");
                throw null;
            }
        }
    }

    private final RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }
}
