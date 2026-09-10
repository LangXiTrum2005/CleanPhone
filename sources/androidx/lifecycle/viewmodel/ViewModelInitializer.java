package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewModelInitializer<T extends ViewModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f5299b;

    public ViewModelInitializer(Class cls, Function1 function1) {
        this.f5298a = cls;
        this.f5299b = function1;
    }
}
