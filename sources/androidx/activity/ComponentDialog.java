package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {
    public LifecycleRegistry X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SavedStateRegistryController f3225Y;
    public final OnBackPressedDispatcher Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i2) {
        super(context, i2);
        Intrinsics.f(context, "context");
        this.f3225Y = new SavedStateRegistryController(this);
        this.Z = new OnBackPressedDispatcher(new d(this, 2));
    }

    public static void a(ComponentDialog this$0) {
        Intrinsics.f(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.f(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.c(window);
        View decorView = window.getDecorView();
        Intrinsics.e(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.a(decorView, this);
        Window window2 = getWindow();
        Intrinsics.c(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.e(decorView2, "window!!.decorView");
        decorView2.setTag(com.charging.screenshow.battery.animations.themes.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.c(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.e(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.a(decorView3, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this.X;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this);
        this.X = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    /* JADX INFO: renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final OnBackPressedDispatcher getZ() {
        return this.Z;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f3225Y.f8360b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.Z.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.Z;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f3234e = onBackInvokedDispatcher;
            onBackPressedDispatcher.d(onBackPressedDispatcher.g);
        }
        this.f3225Y.b(bundle);
        LifecycleRegistry lifecycleRegistry = this.X;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.X = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f3225Y.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        LifecycleRegistry lifecycleRegistry = this.X;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.X = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        LifecycleRegistry lifecycleRegistry = this.X;
        if (lifecycleRegistry == null) {
            lifecycleRegistry = new LifecycleRegistry(this);
            this.X = lifecycleRegistry;
        }
        lifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
        this.X = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        b();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.f(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.f(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
