package com.chartboost.sdk.view;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.chartboost.sdk.impl.bf;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.m;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.rd;
import com.chartboost.sdk.impl.s7;
import com.chartboost.sdk.impl.vj;
import com.chartboost.sdk.impl.za;
import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/chartboost/sdk/view/FullscreenAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", d9.h.u0, "()V", "onDestroy", "a", "", "Ljava/lang/String;", "auctionId", "Lcom/chartboost/sdk/impl/m;", "b", "Lcom/chartboost/sdk/impl/m;", "adContainerView", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "rootView", "", "d", "Z", "dismissable", "Landroidx/activity/OnBackPressedCallback;", "e", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "<init>", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class FullscreenAdActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String auctionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public m adContainerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public FrameLayout rootView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean dismissable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final OnBackPressedCallback onBackPressedCallback = new a();

    public static final class a extends OnBackPressedCallback {
        public a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!FullscreenAdActivity.this.dismissable) {
                za.a("Back pressed but disallowed. Ignoring.", (Throwable) null, 2, (Object) null);
                return;
            }
            m mVar = FullscreenAdActivity.this.adContainerView;
            if (mVar != null) {
                mVar.h();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        WindowCompat.a(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.e();
        windowInsetsControllerCompat.a(7);
        this.rootView = (FrameLayout) findViewById(R.id.content);
        String stringExtra = getIntent().getStringExtra("com.chartboost.sdk.internal.AdController.AdContainerMap");
        this.auctionId = stringExtra;
        m mVar = (m) TypeIntrinsics.b(o.f14553n.a()).remove(stringExtra);
        this.adContainerView = mVar;
        if (mVar == null) {
            za.e("No loaded ad found. Finishing ad activity.", null, 2, null);
            finish();
            return;
        }
        l adContainerListener$ChartboostMonetization_9_10_2_productionRelease = mVar.getAdContainerListener$ChartboostMonetization_9_10_2_productionRelease();
        mVar.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(new b(adContainerListener$ChartboostMonetization_9_10_2_productionRelease, this, mVar));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(-16777216);
        }
        View viewA = vj.r.a(this, mVar);
        if (viewA == null) {
            viewA = mVar.getRootView();
        }
        View view = viewA;
        Intrinsics.c(view);
        vj vjVar = new vj(this, mVar, view, 1, 0, 100L, 25, false, 128, null);
        vjVar.a(new com.unity3d.ads.adplayer.b(adContainerListener$ChartboostMonetization_9_10_2_productionRelease, 8));
        vjVar.i();
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(mVar);
        }
        mVar.p();
        OnBackPressedDispatcher z2 = getZ();
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        z2.getClass();
        Intrinsics.f(onBackPressedCallback, "onBackPressedCallback");
        z2.b(onBackPressedCallback);
        if (mVar.j()) {
            this.dismissable = true;
        }
        mVar.l();
        a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        m mVar = this.adContainerView;
        if (mVar != null) {
            mVar.i();
        }
        m mVar2 = this.adContainerView;
        if (mVar2 != null) {
            mVar2.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(null);
        }
        this.adContainerView = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f15873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FullscreenAdActivity f15874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f15875c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15876a;

            static {
                int[] iArr = new int[rd.values().length];
                try {
                    iArr[rd.DISABLE_ORIENTATION_CHANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[rd.ENABLE_ORIENTATION_CHANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[rd.PORTRAIT_ONLY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[rd.LANDSCAPE_ONLY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f15876a = iArr;
            }
        }

        public b(l lVar, FullscreenAdActivity fullscreenAdActivity, m mVar) {
            this.f15873a = lVar;
            this.f15874b = fullscreenAdActivity;
            this.f15875c = mVar;
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(s7 expirationReason) {
            Unit unit;
            Intrinsics.f(expirationReason, "expirationReason");
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.a(expirationReason);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdExpired()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            Unit unit;
            this.f15874b.finish();
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.b();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdClosed()", null, 2, null);
            }
            this.f15875c.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            this.f15874b.dismissable = true;
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            Unit unit;
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.d();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            Unit unit;
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.e();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdShown()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(rd request) {
            int i2;
            Intrinsics.f(request, "request");
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.a(request);
            }
            int i3 = this.f15874b.getResources().getConfiguration().orientation;
            int i4 = 6;
            if (i3 != 1) {
                i2 = i3 != 2 ? -1 : 6;
            } else {
                i2 = 1;
            }
            FullscreenAdActivity fullscreenAdActivity = this.f15874b;
            int i5 = a.f15876a[request.ordinal()];
            if (i5 == 1) {
                i4 = i2;
            } else if (i5 == 2) {
                i4 = -1;
            } else if (i5 == 3) {
                i4 = 1;
            } else if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fullscreenAdActivity.setRequestedOrientation(i4);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            Unit unit;
            l lVar = this.f15873a;
            if (lVar != null) {
                lVar.a();
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("AdContainerListener null when onAdClicked()", null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.f(url, "url");
            ContextCompat.startActivity(this.f15874b, new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
        }
    }

    public static final void a(l lVar) {
        if (lVar != null) {
            lVar.e();
        }
    }

    public final void a() {
        View decorView = getWindow().getDecorView();
        Intrinsics.e(decorView, "getDecorView(...)");
        ViewCompat.G(decorView, new com.unity3d.ads.adplayer.b(this, 9));
    }

    public static final WindowInsetsCompat a(FullscreenAdActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(view, "view");
        Intrinsics.f(insets, "insets");
        za.a("WindowInsets updated: " + insets, (Throwable) null, 2, (Object) null);
        m mVar = this$0.adContainerView;
        if (mVar == null) {
            return insets;
        }
        mVar.setRenderingContainerCalculator(new bf(this$0));
        return insets;
    }
}
