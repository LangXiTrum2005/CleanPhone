package com.charging.screenshow.battery.animations.themes.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.charging.screenshow.battery.animations.themes.utils.ext.TextViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ConfigVM;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseFrag extends Fragment {
    public final ViewModelLazy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13257Y;

    public BaseFrag() {
        final BaseFrag$special$$inlined$viewModels$default$1 baseFrag$special$$inlined$viewModels$default$1 = new BaseFrag$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.Z, new Function0<ViewModelStoreOwner>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.BaseFrag$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) baseFrag$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X = FragmentViewModelLazyKt.a(this, Reflection.f43333a.b(ConfigVM.class), new Function0<ViewModelStore>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.BaseFrag$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getX()).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.BaseFrag$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getX();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f5295b;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.charging.screenshow.battery.animations.themes.fragment.BaseFrag$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getX();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.X.getDefaultViewModelProviderFactory();
                Intrinsics.e(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    public abstract View b();

    public abstract TextView c();

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.f(inflater, "inflater");
        return b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.f(view, "view");
        super.onViewCreated(view, bundle);
        ViewModelLazy viewModelLazy = this.X;
        if (((ConfigVM) viewModelLazy.getX()).d == null) {
            ((ConfigVM) viewModelLazy.getX()).d = getResources().getConfiguration();
        } else {
            this.f13257Y = (((long) getResources().getConfiguration().diff(((ConfigVM) viewModelLazy.getX()).d)) & 2147483648L) != 0;
            ((ConfigVM) viewModelLazy.getX()).d = getResources().getConfiguration();
        }
        e();
        f();
        TextView textViewC = c();
        if (textViewC != null) {
            TextViewExt.a(textViewC);
        }
        d();
    }
}
