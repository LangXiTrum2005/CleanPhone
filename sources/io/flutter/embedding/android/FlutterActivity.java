package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import b2.l;
import bj.a;
import com.ironsource.X3;
import com.ironsource.sdk.controller.w;
import i3.f;
import java.util.List;
import mi.b;
import mi.d;
import mi.e;
import ni.c;
import ni.k;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterActivity extends Activity implements d, v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43203e = View.generateViewId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43204a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f43205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f43206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f43207d;

    public FlutterActivity() {
        int i10 = Build.VERSION.SDK_INT;
        this.f43207d = i10 < 33 ? null : i10 >= 34 ? new b(this, 0) : new w(this, 3);
        this.f43206c = new x(this);
    }

    @Override // mi.d
    public final String A() {
        try {
            Bundle bundleJ = j();
            if (bundleJ != null) {
                return bundleJ.getString("io.flutter.EntrypointUri");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // mi.d
    public final f B(Activity activity, c cVar) {
        return new f(this, cVar.l, this);
    }

    public void a(c cVar) {
        if (this.f43205b.f45989g) {
            return;
        }
        com.bumptech.glide.d.J(cVar);
    }

    @Override // mi.d, mi.g
    public final c b() {
        return null;
    }

    @Override // mi.d
    public final void d() {
        reportFullyDrawn();
    }

    @Override // mi.d
    public final List f() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final int g() {
        if (getIntent().hasExtra("background_mode")) {
            return l1.d.w(getIntent().getStringExtra("background_mode"));
        }
        return 1;
    }

    @Override // mi.d, androidx.lifecycle.v
    public final o getLifecycle() {
        return this.f43206c;
    }

    @Override // mi.d
    public final String h() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // mi.d
    public final boolean i() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return h() == null;
    }

    public final Bundle j() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // mi.d
    public final void k() {
        Log.w("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + this.f43205b.f45984b + " evicted by another attaching activity");
        e eVar = this.f43205b;
        if (eVar != null) {
            eVar.h();
            this.f43205b.i();
        }
    }

    @Override // mi.d
    public final String l() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleJ = j();
            if (bundleJ != null) {
                return bundleJ.getString("io.flutter.InitialRoute");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // mi.d
    public final String m() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // mi.d
    public final k n() {
        return k.a(getIntent());
    }

    @Override // mi.d
    public final int o() {
        return g() == 1 ? 1 : 2;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (u("onActivityResult")) {
            this.f43205b.e(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (u("onBackPressed")) {
            e eVar = this.f43205b;
            eVar.c();
            c cVar = eVar.f45984b;
            if (cVar != null) {
                ((p) cVar.f46745i.f49529b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        try {
            Bundle bundleJ = j();
            if (bundleJ != null && (i10 = bundleJ.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i10);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            w(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        e eVar = new e(this);
        this.f43205b = eVar;
        eVar.f();
        this.f43205b.m(bundle);
        this.f43206c.e(m.ON_CREATE);
        if (g() == 2) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(this.f43205b.g(f43203e, o() == 1));
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(1073741824);
        }
        window.getDecorView().setSystemUiVisibility(1280);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (u("onDestroy")) {
            this.f43205b.h();
            this.f43205b.i();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f43207d);
            this.f43204a = false;
        }
        e eVar = this.f43205b;
        if (eVar != null) {
            eVar.f45983a = null;
            eVar.f45984b = null;
            eVar.f45985c = null;
            eVar.f45986d = null;
            eVar.f45987e = null;
            this.f43205b = null;
        }
        this.f43206c.e(m.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (u("onNewIntent")) {
            this.f43205b.j(intent);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (u(X3.i.t0)) {
            e eVar = this.f43205b;
            eVar.c();
            eVar.f45983a.getClass();
            c cVar = eVar.f45984b;
            if (cVar != null) {
                l lVar = cVar.f46743g;
                lVar.e(3, lVar.f5319c);
            }
        }
        this.f43206c.e(m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (u("onPostResume")) {
            this.f43205b.k();
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (u("onRequestPermissionsResult")) {
            this.f43205b.l(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f43206c.e(m.ON_RESUME);
        if (u(X3.i.f27817u0)) {
            this.f43205b.n();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (u("onSaveInstanceState")) {
            this.f43205b.o(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f43206c.e(m.ON_START);
        if (u("onStart")) {
            this.f43205b.p();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (u("onStop")) {
            this.f43205b.q();
        }
        this.f43206c.e(m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (u("onTrimMemory")) {
            this.f43205b.r(i10);
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (u("onUserLeaveHint")) {
            this.f43205b.s();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (u("onWindowFocusChanged")) {
            this.f43205b.t(z10);
        }
    }

    @Override // mi.d
    public final a p(Activity activity, c cVar) {
        return new a(f43203e, activity, cVar.f46749n);
    }

    @Override // mi.d
    public final int q() {
        return g() == 1 ? 1 : 2;
    }

    @Override // mi.d
    public final boolean r() {
        return false;
    }

    @Override // mi.d
    public final String s() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleJ = j();
            String string = bundleJ != null ? bundleJ.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : X3.i.Z;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // mi.d
    public final boolean t() {
        try {
            Bundle bundleJ = j();
            if (bundleJ == null || !bundleJ.containsKey("flutter_deeplinking_enabled")) {
                return true;
            }
            return bundleJ.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean u(String str) {
        e eVar = this.f43205b;
        if (eVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (eVar.f45992j) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // mi.d
    public final boolean v() {
        return this.f43204a;
    }

    @Override // mi.d
    public final void w(boolean z10) {
        if (z10 && !this.f43204a) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f43207d);
                this.f43204a = true;
                return;
            }
            return;
        }
        if (z10 || !this.f43204a || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f43207d);
        this.f43204a = false;
    }

    @Override // mi.d
    public final String x() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // mi.d
    public final boolean y() {
        return true;
    }

    @Override // mi.d
    public final boolean z() {
        return (h() != null || this.f43205b.f45989g) ? getIntent().getBooleanExtra("destroy_engine_with_activity", false) : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // mi.d
    public final void c() {
    }

    @Override // mi.d
    public final Activity getActivity() {
        return this;
    }

    @Override // mi.d
    public final Context getContext() {
        return this;
    }

    @Override // mi.d, mi.f
    public final void e(c cVar) {
    }
}
