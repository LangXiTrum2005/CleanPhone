package com.p004ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.smartdigimkt.h5.f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0007\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J(\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00040\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006'"}, d2 = {"Lcom/ironsource/tv;", "Lcom/ironsource/dv$c;", "Lcom/ironsource/dv$d;", "Lcom/ironsource/dv$b;", "Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;", "activity", "Landroid/widget/RelativeLayout;", "a", f.j, "Lcom/ironsource/jv;", "loadAdConfig", "", "", "e", "c", "b", "d", "", "description", "", "width", "height", "", "marginPercentageFromTop", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "mTestSuiteActivityWeakReference", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "Landroid/widget/RelativeLayout;", "mBannerContainer", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "Lcom/ironsource/mediationsdk/IronSourceBannerLayout;", "mBannerLayout", "handler", "<init>", "(Lcom/ironsource/mediationsdk/testSuite/TestSuiteActivity;Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tv implements dv.c, dv.d, dv.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<TestSuiteActivity> mTestSuiteActivityWeakReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Handler mHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private RelativeLayout mBannerContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private IronSourceBannerLayout mBannerLayout;

    public tv(TestSuiteActivity activity, Handler handler) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(handler, "handler");
        this.mTestSuiteActivityWeakReference = new WeakReference<>(activity);
        this.mHandler = handler;
    }

    private final RelativeLayout a(TestSuiteActivity activity) {
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    private final TestSuiteActivity f() {
        return this.mTestSuiteActivityWeakReference.get();
    }

    @Override // com.ironsource.dv.d
    public void d() {
        qv.f26644a.b((Activity) this.mTestSuiteActivityWeakReference.get());
    }

    @Override // com.ironsource.dv.c
    public boolean e() {
        return qv.f26644a.e();
    }

    @Override // com.ironsource.dv.b
    public void a(double marginPercentageFromTop) {
        TestSuiteActivity testSuiteActivityF;
        if (this.mBannerContainer != null || (testSuiteActivityF = f()) == null) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.setLayoutParams(vv.f27547a.a((Context) testSuiteActivityF));
        }
        this.mBannerContainer = a(testSuiteActivityF);
        this.mHandler.post(new H0(0, this, testSuiteActivityF));
    }

    @Override // com.ironsource.dv.b
    public void b() {
        IronSourceBannerLayout ironSourceBannerLayout = this.mBannerLayout;
        if (ironSourceBannerLayout != null) {
            qv.f26644a.a(ironSourceBannerLayout);
        }
        this.mHandler.post(new D(this, 10));
        this.mBannerLayout = null;
    }

    @Override // com.ironsource.dv.c
    public void c() {
        qv.f26644a.a((Activity) this.mTestSuiteActivityWeakReference.get());
    }

    @Override // com.ironsource.dv.c
    public void a(jv loadAdConfig) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        qv qvVar = qv.f26644a;
        qvVar.a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        qvVar.g();
    }

    @Override // com.ironsource.dv.d
    public void b(jv loadAdConfig) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        qv qvVar = qv.f26644a;
        qvVar.a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        qvVar.h();
    }

    @Override // com.ironsource.dv.b
    public void a(jv loadAdConfig, String description, int width, int height) {
        Intrinsics.f(loadAdConfig, "loadAdConfig");
        Intrinsics.f(description, "description");
        b();
        qv qvVar = qv.f26644a;
        qvVar.a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity testSuiteActivityF = f();
        if (testSuiteActivityF != null) {
            IronSourceBannerLayout ironSourceBannerLayoutA = qvVar.a(testSuiteActivityF, qvVar.a(description, width, height));
            this.mBannerLayout = ironSourceBannerLayoutA;
            qvVar.b(ironSourceBannerLayoutA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tv this$0) {
        RelativeLayout container;
        Intrinsics.f(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity testSuiteActivityF = this$0.f();
        if (testSuiteActivityF != null && (container = testSuiteActivityF.getContainer()) != null) {
            container.removeView(this$0.mBannerContainer);
        }
        this$0.mBannerContainer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(tv this$0, TestSuiteActivity testSuiteActivity) {
        Intrinsics.f(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.mBannerContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.mBannerLayout);
        }
        testSuiteActivity.getContainer().addView(this$0.mBannerContainer);
    }

    @Override // com.ironsource.dv.d
    public boolean a() {
        return qv.f26644a.f();
    }
}
