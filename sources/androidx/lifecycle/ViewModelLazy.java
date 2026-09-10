package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    public final KClass X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Lambda f5282Y;
    public final Function0 Z;
    public final Lambda e0;
    public ViewModel f0;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function0<CreationExtras.Empty> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreationExtras.Empty.f5295b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(KClass viewModelClass, Function0 function0, Function0 function1, Function0 function2) {
        Intrinsics.f(viewModelClass, "viewModelClass");
        this.X = viewModelClass;
        this.f5282Y = (Lambda) function0;
        this.Z = function1;
        this.e0 = (Lambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.Lazy
    /* JADX INFO: renamed from: getValue */
    public final Object getX() {
        ViewModel viewModel = this.f0;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModel viewModelA = new ViewModelProvider((ViewModelStore) this.f5282Y.invoke(), (ViewModelProvider.Factory) this.Z.invoke(), (CreationExtras) this.e0.invoke()).a(JvmClassMappingKt.b(this.X));
        this.f0 = viewModelA;
        return viewModelA;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        throw null;
    }
}
