package f;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.x;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.v, v, j4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f40228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j4.f f40229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj.j f40230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj.j f40231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.n.f(context, "context");
        this.f40229b = new j4.f(this);
        final int i11 = 0;
        this.f40230c = r9.b.u(new jk.a(this) { // from class: f.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f40227b;

            {
                this.f40227b = this;
            }

            @Override // jk.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        x3.a aVar = new x3.a();
                        this.f40227b.getOnBackPressedDispatcher().b().f40248c.a(aVar);
                        return aVar;
                    default:
                        return new t(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this.f40227b, 15));
                }
            }
        });
        final int i12 = 1;
        this.f40231d = r9.b.u(new jk.a(this) { // from class: f.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f40227b;

            {
                this.f40227b = this;
            }

            @Override // jk.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        x3.a aVar = new x3.a();
                        this.f40227b.getOnBackPressedDispatcher().b().f40248c.a(aVar);
                        return aVar;
                    default:
                        return new t(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this.f40227b, 15));
                }
            }
        });
    }

    public static void a(l lVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.n.f(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.n.c(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.n.e(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.n.c(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.n.e(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.n.c(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.n.e(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        kotlin.jvm.internal.n.c(window4);
        View decorView4 = window4.getDecorView();
        kotlin.jvm.internal.n.e(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o getLifecycle() {
        x xVar = this.f40228a;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        this.f40228a = xVar2;
        return xVar2;
    }

    @Override // f.v
    public final t getOnBackPressedDispatcher() {
        return (t) this.f40231d.getValue();
    }

    @Override // j4.g
    public final j4.e getSavedStateRegistry() {
        return this.f40229b.f43708b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((x3.a) this.f40230c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            t onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.n.e(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.f40229b.b(bundle);
        x xVar = this.f40228a;
        if (xVar == null) {
            xVar = new x(this);
            this.f40228a = xVar;
        }
        xVar.e(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.n.e(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f40229b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        x xVar = this.f40228a;
        if (xVar == null) {
            xVar = new x(this);
            this.f40228a = xVar;
        }
        xVar.e(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        x xVar = this.f40228a;
        if (xVar == null) {
            xVar = new x(this);
            this.f40228a = xVar;
        }
        xVar.e(androidx.lifecycle.m.ON_DESTROY);
        this.f40228a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.n.f(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.n.f(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
