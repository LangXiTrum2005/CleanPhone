package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    public final Fragment X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ViewModelStore f5183Y;
    public final d Z;
    public ViewModelProvider.Factory e0;
    public LifecycleRegistry f0 = null;
    public SavedStateRegistryController g0 = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, d dVar) {
        this.X = fragment;
        this.f5183Y = viewModelStore;
        this.Z = dVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f0.f(event);
    }

    public final void b() {
        if (this.f0 == null) {
            this.f0 = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(this);
            this.g0 = savedStateRegistryController;
            savedStateRegistryController.a();
            this.Z.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.X;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        LinkedHashMap linkedHashMap = mutableCreationExtras.f5294a;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider.AndroidViewModelFactory.f5286e, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f5263a, fragment);
        linkedHashMap.put(SavedStateHandleSupport.f5264b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(SavedStateHandleSupport.f5265c, fragment.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.X;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.e0 = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.e0 == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.e0 = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.e0;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f0;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.g0.f8360b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f5183Y;
    }
}
