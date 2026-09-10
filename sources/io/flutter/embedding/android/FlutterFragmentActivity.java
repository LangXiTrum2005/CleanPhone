package io.flutter.embedding.android;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.h1;
import com.ironsource.X3;
import java.util.List;
import l1.d;
import mi.e;
import mi.f;
import mi.g;
import mi.i;
import mi.j;
import mi.k;
import ni.c;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class FlutterFragmentActivity extends FragmentActivity implements g, f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43208i = View.generateViewId();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f43209h;

    public final int H() {
        if (getIntent().hasExtra("background_mode")) {
            return d.w(getIntent().getStringExtra("background_mode"));
        }
        return 1;
    }

    public final Bundle I() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // mi.f
    public final void a(c cVar) {
        k kVar = this.f43209h;
        if (kVar == null || !kVar.f46024b.f45989g) {
            com.bumptech.glide.d.J(cVar);
        }
    }

    @Override // mi.g
    public final c b() {
        return null;
    }

    public final String l() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleI = I();
            if (bundleI != null) {
                return bundleI.getString("io.flutter.InitialRoute");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public final String m() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f43209h.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        k kVar = this.f43209h;
        if (kVar.D("onBackPressed")) {
            e eVar = kVar.f46024b;
            eVar.c();
            c cVar = eVar.f45984b;
            if (cVar != null) {
                ((p) cVar.f46745i.f49529b).a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        String string2;
        k kVar;
        boolean z10;
        boolean z11;
        int i10;
        try {
            Bundle bundleI = I();
            if (bundleI != null && (i10 = bundleI.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i10);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterFragmentActivity", "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
        this.f43209h = (k) F().C("flutter_fragment");
        super.onCreate(bundle);
        if (H() == 2) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        FrameLayout frameLayout = new FrameLayout(this);
        int i11 = f43208i;
        frameLayout.setId(i11);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(1073741824);
        }
        window.getDecorView().setSystemUiVisibility(1280);
        if (this.f43209h == null) {
            this.f43209h = (k) F().C("flutter_fragment");
        }
        if (this.f43209h == null) {
            int iH = H();
            int i12 = H() == 1 ? 1 : 2;
            int i13 = iH == 1 ? 1 : 2;
            boolean z12 = i12 == 1;
            if (getIntent().getStringExtra("cached_engine_id") != null) {
                getIntent().getStringExtra("cached_engine_id");
                getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                String stringExtra = getIntent().getStringExtra("cached_engine_id");
                int i14 = k.f46022e;
                try {
                    Bundle bundleI2 = I();
                    z11 = (bundleI2 == null || !bundleI2.containsKey("flutter_deeplinking_enabled")) ? true : bundleI2.getBoolean("flutter_deeplinking_enabled");
                } catch (PackageManager.NameNotFoundException unused2) {
                    z11 = false;
                }
                str = "flutter_fragment";
                boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
                try {
                    kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                    if (kVar == null) {
                        throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("cached_engine_id", stringExtra);
                    bundle2.putBoolean("destroy_engine_with_fragment", booleanExtra);
                    bundle2.putBoolean("handle_deeplinking", z11);
                    bundle2.putString("flutterview_render_mode", d.s(i12));
                    bundle2.putString("flutterview_transparency_mode", d.t(i13));
                    bundle2.putBoolean("should_attach_engine_to_activity", true);
                    bundle2.putBoolean("should_automatically_handle_on_back_pressed", true);
                    bundle2.putBoolean("should_delay_first_android_view_draw", z12);
                    kVar.setArguments(bundle2);
                } catch (Exception e10) {
                    throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e10);
                }
            } else {
                str = "flutter_fragment";
                getIntent().getStringExtra("cached_engine_group_id");
                s();
                try {
                    Bundle bundleI3 = I();
                    string = bundleI3 != null ? bundleI3.getString("io.flutter.EntrypointUri") : null;
                } catch (PackageManager.NameNotFoundException unused3) {
                }
                if (string != null) {
                    try {
                        Bundle bundleI4 = I();
                        if (bundleI4 != null) {
                            bundleI4.getString("io.flutter.EntrypointUri");
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                    }
                }
                l();
                m();
                if (getIntent().getStringExtra("cached_engine_group_id") != null) {
                    String stringExtra2 = getIntent().getStringExtra("cached_engine_group_id");
                    int i15 = k.f46022e;
                    j jVar = new j(stringExtra2);
                    jVar.f46015b = s();
                    jVar.f46016c = l();
                    try {
                        Bundle bundleI5 = I();
                        z10 = (bundleI5 == null || !bundleI5.containsKey("flutter_deeplinking_enabled")) ? true : bundleI5.getBoolean("flutter_deeplinking_enabled");
                    } catch (PackageManager.NameNotFoundException unused5) {
                        z10 = false;
                    }
                    jVar.f46017d = z10;
                    jVar.f46018e = i12;
                    jVar.f46019f = i13;
                    jVar.f46021h = z12;
                    jVar.f46020g = true;
                    try {
                        kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                        if (kVar == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        kVar.setArguments(jVar.a());
                    } catch (Exception e11) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e11);
                    }
                } else {
                    int i16 = k.f46022e;
                    i iVar = new i();
                    iVar.f46003a = X3.i.Z;
                    iVar.f46004b = null;
                    iVar.f46006d = "/";
                    boolean z13 = false;
                    iVar.f46007e = false;
                    iVar.f46008f = null;
                    iVar.f46009g = null;
                    iVar.f46010h = 1;
                    iVar.f46011i = 2;
                    iVar.f46012j = false;
                    iVar.f46013k = false;
                    iVar.f46003a = s();
                    try {
                        Bundle bundleI6 = I();
                        string2 = bundleI6 != null ? bundleI6.getString("io.flutter.EntrypointUri") : null;
                    } catch (PackageManager.NameNotFoundException unused6) {
                    }
                    iVar.f46004b = string2;
                    iVar.f46005c = (List) getIntent().getSerializableExtra("dart_entrypoint_args");
                    iVar.f46006d = l();
                    iVar.f46008f = m();
                    iVar.f46009g = ni.k.a(getIntent());
                    try {
                        Bundle bundleI7 = I();
                        z13 = (bundleI7 == null || !bundleI7.containsKey("flutter_deeplinking_enabled")) ? true : bundleI7.getBoolean("flutter_deeplinking_enabled");
                    } catch (PackageManager.NameNotFoundException unused7) {
                    }
                    iVar.f46007e = z13;
                    iVar.f46010h = i12;
                    iVar.f46011i = i13;
                    iVar.f46013k = z12;
                    iVar.f46012j = true;
                    try {
                        kVar = (k) k.class.getDeclaredConstructor(null).newInstance(null);
                        if (kVar == null) {
                            throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + k.class.getCanonicalName() + ") does not match the expected return type.");
                        }
                        kVar.setArguments(iVar.a());
                    } catch (Exception e12) {
                        throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + k.class.getName() + ")", e12);
                    }
                }
            }
            this.f43209h = kVar;
            h1 h1VarF = F();
            h1VarF.getClass();
            a aVar = new a(h1VarF);
            aVar.g(i11, this.f43209h, str);
            aVar.e();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        k kVar = this.f43209h;
        if (kVar.D("onNewIntent")) {
            kVar.f46024b.j(intent);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        k kVar = this.f43209h;
        if (kVar.D("onPostResume")) {
            kVar.f46024b.k();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f43209h.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this.f43209h.onTrimMemory(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        k kVar = this.f43209h;
        if (kVar.D("onUserLeaveHint")) {
            kVar.f46024b.s();
        }
    }

    public final String s() {
        try {
            Bundle bundleI = I();
            String string = bundleI != null ? bundleI.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : X3.i.Z;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // mi.f
    public final void e(c cVar) {
    }
}
