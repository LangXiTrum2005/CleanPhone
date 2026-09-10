package androidx.lifecycle;

import androidx.lifecycle.viewmodel.MutableCreationExtras;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory$Companion;", "", "", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
        ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f5289a;
        if (((String) mutableCreationExtras.f5294a.get(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f5291a)) == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        SavedStateHandleSupport.a(mutableCreationExtras);
        return d();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls) {
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void c(ViewModel viewModel) {
    }

    public abstract ViewModel d();
}
