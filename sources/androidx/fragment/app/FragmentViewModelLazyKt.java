package androidx.fragment.app;

import androidx.lifecycle.ViewModelLazy;
import com.charging.screenshow.battery.animations.themes.fragment.BaseFrag;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FragmentViewModelLazyKt {
    public static final ViewModelLazy a(BaseFrag baseFrag, KClass viewModelClass, Function0 function0, Function0 function1, Function0 function2) {
        Intrinsics.f(viewModelClass, "viewModelClass");
        return new ViewModelLazy(viewModelClass, function0, function2, function1);
    }
}
