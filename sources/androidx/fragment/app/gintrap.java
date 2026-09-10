package androidx.fragment.app;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Fragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "requestKey", "Landroid/os/Bundle;", "result", "", "saneness", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dern", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class gintrap {
    public static final void dern(Fragment fragment, String str, final Function2<? super String, ? super Bundle, Unit> function2) {
        fragment.getParentFragmentManager().hydromechanics(str, fragment, new restrictive() { // from class: androidx.fragment.app.dovishness
            @Override // androidx.fragment.app.restrictive
            public final void attabal(String str2, Bundle bundle) {
                gintrap.wireman(function2, str2, bundle);
            }
        });
    }

    public static final void saneness(Fragment fragment, String str, Bundle bundle) {
        fragment.getParentFragmentManager().microanalysis(str, bundle);
    }

    public static final void wireman(Function2 function2, String str, Bundle bundle) {
        function2.invoke(str, bundle);
    }
}
