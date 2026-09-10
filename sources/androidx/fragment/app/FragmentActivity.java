package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4220g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4224e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f4221b = new c0(new l0(this), 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.x f4222c = new androidx.lifecycle.x(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4225f = true;

    public FragmentActivity() {
        getSavedStateRegistry().c("android:support:lifecycle", new i0(this, 0));
        final int i10 = 0;
        addOnConfigurationChangedListener(new l0.a(this) { // from class: androidx.fragment.app.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f4367b;

            {
                this.f4367b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f4367b.f4221b.a();
                        break;
                    default:
                        this.f4367b.f4221b.a();
                        break;
                }
            }
        });
        final int i11 = 1;
        addOnNewIntentListener(new l0.a(this) { // from class: androidx.fragment.app.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f4367b;

            {
                this.f4367b = this;
            }

            @Override // l0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f4367b.f4221b.a();
                        break;
                    default:
                        this.f4367b.f4221b.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new k0(this, 0));
    }

    public static boolean G(g1 g1Var) {
        boolean zG = false;
        for (Fragment fragment : g1Var.f4324c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zG |= G(fragment.getChildFragmentManager());
                }
                z1 z1Var = fragment.mViewLifecycleOwner;
                androidx.lifecycle.n nVar = androidx.lifecycle.n.f4567d;
                if (z1Var != null) {
                    z1Var.b();
                    if (z1Var.f4521e.f4609d.compareTo(nVar) >= 0) {
                        fragment.mViewLifecycleOwner.f4521e.g();
                        zG = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f4609d.compareTo(nVar) >= 0) {
                    fragment.mLifecycleRegistry.g();
                    zG = true;
                }
            }
        }
        return zG;
    }

    public final h1 F() {
        return ((l0) this.f4221b.f4268b).f4445d;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f4223d);
            printWriter.print(" mResumed=");
            printWriter.print(this.f4224e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f4225f);
            if (getApplication() != null) {
                f1.a.a(this).b(str2, printWriter);
            }
            ((l0) this.f4221b.f4268b).f4445d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f4221b.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4222c.e(androidx.lifecycle.m.ON_CREATE);
        h1 h1Var = ((l0) this.f4221b.f4268b).f4445d;
        h1Var.H = false;
        h1Var.I = false;
        h1Var.O.f4378i = false;
        h1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((l0) this.f4221b.f4268b).f4445d.f4327f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((l0) this.f4221b.f4268b).f4445d.l();
        this.f4222c.e(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((l0) this.f4221b.f4268b).f4445d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f4224e = false;
        ((l0) this.f4221b.f4268b).f4445d.u(5);
        this.f4222c.e(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f4222c.e(androidx.lifecycle.m.ON_RESUME);
        h1 h1Var = ((l0) this.f4221b.f4268b).f4445d;
        h1Var.H = false;
        h1Var.I = false;
        h1Var.O.f4378i = false;
        h1Var.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f4221b.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        c0 c0Var = this.f4221b;
        c0Var.a();
        super.onResume();
        this.f4224e = true;
        ((l0) c0Var.f4268b).f4445d.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        c0 c0Var = this.f4221b;
        c0Var.a();
        l0 l0Var = (l0) c0Var.f4268b;
        super.onStart();
        this.f4225f = false;
        if (!this.f4223d) {
            this.f4223d = true;
            h1 h1Var = l0Var.f4445d;
            h1Var.H = false;
            h1Var.I = false;
            h1Var.O.f4378i = false;
            h1Var.u(4);
        }
        l0Var.f4445d.z(true);
        this.f4222c.e(androidx.lifecycle.m.ON_START);
        h1 h1Var2 = l0Var.f4445d;
        h1Var2.H = false;
        h1Var2.I = false;
        h1Var2.O.f4378i = false;
        h1Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4221b.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f4225f = true;
        while (G(F())) {
        }
        h1 h1Var = ((l0) this.f4221b.f4268b).f4445d;
        h1Var.I = true;
        h1Var.O.f4378i = true;
        h1Var.u(4);
        this.f4222c.e(androidx.lifecycle.m.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((l0) this.f4221b.f4268b).f4445d.f4327f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
