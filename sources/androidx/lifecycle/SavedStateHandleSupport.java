package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 f5263a = new SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 f5264b = new SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 f5265c = new SavedStateHandleSupport$DEFAULT_ARGS_KEY$1();

    public static final SavedStateHandle a(MutableCreationExtras mutableCreationExtras) {
        SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 savedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 = f5263a;
        LinkedHashMap linkedHashMap = mutableCreationExtras.f5294a;
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) linkedHashMap.get(savedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) linkedHashMap.get(f5264b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5265c);
        ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f5289a;
        String str = (String) linkedHashMap.get(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f5291a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateRegistry.SavedStateProvider savedStateProviderB = savedStateRegistryOwner.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProviderB instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProviderB : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = c(viewModelStoreOwner).d;
        SavedStateHandle savedStateHandle = (SavedStateHandle) linkedHashMap2.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        Class[] clsArr = SavedStateHandle.f;
        savedStateHandlesProvider.b();
        Bundle bundle2 = savedStateHandlesProvider.f5268c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = savedStateHandlesProvider.f5268c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = savedStateHandlesProvider.f5268c;
        if (bundle5 != null && bundle5.isEmpty()) {
            savedStateHandlesProvider.f5268c = null;
        }
        SavedStateHandle savedStateHandleA = SavedStateHandle.Companion.a(bundle3, bundle);
        linkedHashMap2.put(str, savedStateHandleA);
        return savedStateHandleA;
    }

    public static final void b(SavedStateRegistryOwner savedStateRegistryOwner) {
        Lifecycle.State d = savedStateRegistryOwner.getLifecycle().getD();
        if (d != Lifecycle.State.f5232Y && d != Lifecycle.State.Z) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (savedStateRegistryOwner.getSavedStateRegistry().b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesVM c(ViewModelStoreOwner viewModelStoreOwner) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 savedStateHandleSupport$savedStateHandlesVM$1$1 = SavedStateHandleSupport$savedStateHandlesVM$1$1.X;
        KClass kClassB = Reflection.f43333a.b(SavedStateHandlesVM.class);
        ArrayList arrayList = initializerViewModelFactoryBuilder.f5297a;
        arrayList.add(new ViewModelInitializer(JvmClassMappingKt.b(kClassB), savedStateHandleSupport$savedStateHandlesVM$1$1));
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) arrayList.toArray(new ViewModelInitializer[0]);
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length))).b(SavedStateHandlesVM.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
