package com.applovin.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.n;
import b2.o;
import com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.b5;
import com.applovin.impl.d;
import com.applovin.impl.e;
import com.applovin.impl.f2;
import com.applovin.impl.g;
import com.applovin.impl.g8;
import com.applovin.impl.h2;
import com.applovin.impl.i0;
import com.applovin.impl.o1;
import com.applovin.impl.p0;
import com.applovin.impl.p2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements o1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Set f7305m = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f7306n = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static p2 parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f7307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y1 f7308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7309c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f7310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f7311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i0 f7312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7317k;
    private boolean l;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f7318a;

        public a(Boolean bool) {
            this.f7318a = bool;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f7318a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!AppLovinFullscreenActivity.this.l) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f7307a.a(z4.f10289y2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f7307a.a(z4.f10289y2)).intValue();
            Insets insets2 = windowInsets.getInsets(AppLovinFullscreenActivity.this.f7317k ? (~WindowInsets.Type.displayCutout()) & iIntValue : WindowInsets.Type.displayCutout() | iIntValue);
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f7321a;

        public c(Runnable runnable) {
            this.f7321a = runnable;
        }

        public void onBackInvoked() {
            this.f7321a.run();
        }
    }

    public void configureSystemUiBars(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.l = z10 || z11 || z12;
        if (!p0.b() || !this.l) {
            getWindow().setFlags(1024, 1024);
            d.c(this);
            return;
        }
        this.f7314h = z10;
        this.f7315i = z11;
        this.f7316j = z12;
        this.f7317k = z13;
        if (z12) {
            this.f7314h = false;
            this.f7315i = false;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        if (this.f7314h) {
            d.b((Activity) this);
        } else {
            d.f(this);
        }
        if (this.f7315i) {
            d.a((Activity) this);
        } else {
            d.e(this);
        }
    }

    @Override // com.applovin.impl.o1
    public void dismiss(String str) {
        if (p0.h() && this.f7311e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f7311e);
            this.f7311e = null;
        }
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.a(str);
        } else {
            finish();
        }
    }

    public boolean isAllowingAdRenderingWithinDisplayCutout() {
        return this.f7317k;
    }

    public boolean isHidingNavigationBar() {
        return this.f7315i;
    }

    public boolean isHidingStatusBar() {
        return this.f7314h;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            p.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            p.c("AppLovinFullscreenActivity", "Failed to request window feature", th2);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            p2 p2Var = parentInterstitialWrapper;
            if (p2Var != null && p2Var.f() != null) {
                p2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f7307a = AppLovinSdk.getInstance(this).a();
        p2 p2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = p2Var2 != null ? p2Var2.f() : null;
        Boolean bool = (Boolean) this.f7307a.a(z4.J4);
        if (bVarF != null) {
            this.f7314h = bVarF.Q0();
            this.f7315i = bVarF.O0();
            this.f7316j = bVarF.P0();
            this.f7317k = bVarF.D0();
            this.l = bVarF.H0();
        }
        if (p0.b() && (bool.booleanValue() || this.l)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool));
            configureSystemUiBars(this.f7314h, this.f7315i, this.f7316j, this.f7317k);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (p0.b()) {
                g8.a(viewFindViewById, this.f7307a);
            }
            configureSystemUiBars(this.f7314h, this.f7315i, this.f7316j, this.f7317k);
        }
        if (bVarF != null) {
            g.a(bVarF, this, this.f7307a);
        }
        if (p0.h() && ((Boolean) this.f7307a.a(z4.f10205m6)).booleanValue()) {
            this.f7311e = new c(new n(this, 7));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f7311e);
        }
        a();
        b();
        Integer num = (Integer) this.f7307a.a(z4.L6);
        if (num.intValue() > 0) {
            synchronized (f7306n) {
                Set set = f7305m;
                set.add(this);
                q7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f7307a.E());
            }
        }
        p2 p2Var3 = parentInterstitialWrapper;
        if (p2Var3 != null) {
            y1.a(p2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f7307a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f7307a);
        this.f7310d = aVar;
        bindService(intent, aVar, 1);
        if (p0.f()) {
            String str = this.f7307a.p0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        l lVar = this.f7307a;
        if (lVar != null) {
            if (((Boolean) lVar.a(z4.B2)).booleanValue()) {
                this.f7307a.r0().b(b5.N);
                this.f7307a.r0().b(b5.P);
                this.f7307a.r0().b(b5.Q);
            }
            if (((Boolean) this.f7307a.a(z4.U6)).booleanValue()) {
                stopService(new Intent(this, (Class<?>) AppRestartDuringAdDetectionService.class));
            }
        }
        if (this.f7312f != null) {
            this.f7307a.r0().b(b5.O);
            this.f7312f.a();
            this.f7312f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f7310d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            if (y1Var.g()) {
                this.f7308b.r();
            } else {
                long jA = this.f7308b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f7308b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new o(5, this, parentInterstitialWrapper), jA);
                } else {
                    a(this.f7308b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.s();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        y1 y1Var;
        try {
            super.onResume();
            if (this.f7309c.get() || (y1Var = this.f7308b) == null) {
                return;
            }
            y1Var.t();
        } catch (IllegalArgumentException e10) {
            this.f7307a.Q();
            if (p.a()) {
                this.f7307a.Q().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f7307a.E().a("AppLovinFullscreenActivity", X3.i.f27817u0, e10);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        l lVar = this.f7307a;
        if (lVar != null && ((Boolean) lVar.a(z4.U6)).booleanValue()) {
            if (z10) {
                stopService(new Intent(this, (Class<?>) AppRestartDuringAdDetectionService.class));
            } else {
                getApplicationContext().startService(new Intent(getApplicationContext(), (Class<?>) AppRestartDuringAdDetectionService.class));
            }
        }
        if (this.f7308b != null) {
            if (!this.f7309c.getAndSet(false)) {
                this.f7308b.b(z10);
            }
            if (z10) {
                configureSystemUiBars(this.f7314h, this.f7315i, this.f7316j, this.f7317k);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(@Nullable y1 y1Var) {
        this.f7308b = y1Var;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements y1.g {
        public b() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            AppLovinFullscreenActivity.this.f7308b = y1Var;
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th2) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            p2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f7307a.g().a(f2.G, bVarF, mapHashMap);
        }
    }

    private void b() {
        l lVar = this.f7307a;
        if (lVar == null || !((Boolean) lVar.a(z4.C2)).booleanValue()) {
            return;
        }
        Long l = (Long) this.f7307a.a(z4.D2);
        this.f7312f = i0.a(l.longValue(), true, this.f7307a, new o(4, this, l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.q();
        }
        if (q7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        p0.a aVarA = p0.a(windowInsets, this.f7307a);
        p0.a aVarC = p0.c(windowInsets, this.f7307a);
        p0.a aVarB = p0.b(windowInsets, this.f7307a);
        String strB = q7.b(this);
        p0.a(aVarA, strB);
        p0.c(aVarC, strB);
        p0.b(aVarB, strB);
        y1 y1Var = this.f7308b;
        if (y1Var != null) {
            y1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(p2 p2Var) {
        boolean zY = this.f7308b.y();
        boolean zI = (p2Var == null || !zY) ? false : p2Var.i();
        if (!zI) {
            this.f7308b.d(false);
        }
        a(this.f7308b, zY, zI);
    }

    private void a(y1 y1Var, boolean z10, boolean z11) {
        y1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f7307a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            p2 p2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = p2Var != null ? p2Var.f() : null;
            mapHashMap.putAll(h2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z10);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z11);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f7307a.E().d(f2.K0, mapHashMap);
        }
        y1Var.r();
    }

    private void a() {
        p2 p2Var;
        l lVar = this.f7307a;
        if (lVar == null || !((Boolean) lVar.a(z4.B2)).booleanValue() || (p2Var = parentInterstitialWrapper) == null || p2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        e eVar = (e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f7307a.r0().b(b5.P, jSONObject.toString());
        this.f7307a.r0().b(b5.N, Long.valueOf(System.currentTimeMillis()));
        this.f7307a.r0().b(b5.Q, CollectionUtils.toJsonString(h2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.f7313g = l.longValue() + this.f7313g;
        this.f7307a.r0().b(b5.O, Long.valueOf(this.f7313g));
    }
}
