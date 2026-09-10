package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f5269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.AndroidViewModelFactory f5270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f5271c;
    public final Lifecycle d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry f5272e;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        this.f5272e = savedStateRegistryOwner.getSavedStateRegistry();
        this.d = savedStateRegistryOwner.getLifecycle();
        this.f5271c = bundle;
        this.f5269a = application;
        if (application != null) {
            ViewModelProvider.AndroidViewModelFactory androidViewModelFactory2 = ViewModelProvider.AndroidViewModelFactory.d;
            if (ViewModelProvider.AndroidViewModelFactory.d == null) {
                ViewModelProvider.AndroidViewModelFactory.d = new ViewModelProvider.AndroidViewModelFactory(application);
            }
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.d;
            Intrinsics.c(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory(null);
        }
        this.f5270b = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
        ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f5289a;
        ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl viewModelKeyImpl = ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f5291a;
        LinkedHashMap linkedHashMap = mutableCreationExtras.f5294a;
        String str = (String) linkedHashMap.get(viewModelKeyImpl);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(SavedStateHandleSupport.f5263a) == null || linkedHashMap.get(SavedStateHandleSupport.f5264b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.d;
        Application application = (Application) linkedHashMap.get(ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.f5288a);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.a(cls, SavedStateViewModelFactoryKt.f5274b) : SavedStateViewModelFactoryKt.a(cls, SavedStateViewModelFactoryKt.f5273a);
        if (constructorA == null) {
            return this.f5270b.a(cls, mutableCreationExtras);
        }
        return (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.b(cls, constructorA, SavedStateHandleSupport.a(mutableCreationExtras)) : SavedStateViewModelFactoryKt.b(cls, constructorA, application, SavedStateHandleSupport.a(mutableCreationExtras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void c(ViewModel viewModel) {
        Lifecycle lifecycle = this.d;
        if (lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.f5272e;
            Intrinsics.c(savedStateRegistry);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public final ViewModel d(Class cls, String str) {
        Lifecycle lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.f5269a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.a(cls, SavedStateViewModelFactoryKt.f5274b) : SavedStateViewModelFactoryKt.a(cls, SavedStateViewModelFactoryKt.f5273a);
        if (constructorA == null) {
            if (application != null) {
                return this.f5270b.b(cls);
            }
            if (ViewModelProvider.NewInstanceFactory.f5289a == null) {
                ViewModelProvider.NewInstanceFactory.f5289a = new ViewModelProvider.NewInstanceFactory();
            }
            ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f5289a;
            Intrinsics.c(newInstanceFactory);
            return newInstanceFactory.b(cls);
        }
        SavedStateRegistry savedStateRegistry = this.f5272e;
        Intrinsics.c(savedStateRegistry);
        Bundle bundle = this.f5271c;
        Bundle bundleA = savedStateRegistry.a(str);
        Class[] clsArr = SavedStateHandle.f;
        SavedStateHandle savedStateHandleA = SavedStateHandle.Companion.a(bundleA, bundle);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, savedStateHandleA);
        savedStateHandleController.a(lifecycle, savedStateRegistry);
        LegacySavedStateHandleController.b(lifecycle, savedStateRegistry);
        ViewModel viewModelB = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.b(cls, constructorA, savedStateHandleA) : SavedStateViewModelFactoryKt.b(cls, constructorA, application, savedStateHandleA);
        viewModelB.c(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return viewModelB;
    }
}
