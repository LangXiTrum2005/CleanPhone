package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewModelInitializer[] f5296a;

    public InitializerViewModelFactory(ViewModelInitializer... initializers) {
        Intrinsics.f(initializers, "initializers");
        this.f5296a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(Class cls, MutableCreationExtras mutableCreationExtras) {
        ViewModel viewModel = null;
        for (ViewModelInitializer viewModelInitializer : this.f5296a) {
            if (viewModelInitializer.f5298a.equals(cls)) {
                Object objInvoke = viewModelInitializer.f5299b.invoke(mutableCreationExtras);
                viewModel = objInvoke instanceof ViewModel ? (ViewModel) objInvoke : null;
            }
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
