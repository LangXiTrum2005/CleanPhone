package demilitarize;

import androidx.p001lifecycle.peridotite;
import androidx.p001lifecycle.splinterproof;
import androidx.p001lifecycle.starveling;
import cig.CreationExtras;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelProviders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldemilitarize/impassible;", "", "<init>", "()V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "modelClass", "", "dern", "(Lkurbash/wireman;)Ljava/lang/String;", "VM", "wireman", "()Landroidx/lifecycle/starveling;", "Landroidx/lifecycle/splinterproof;", "owner", "Landroidx/lifecycle/peridotite$dern;", "saneness", "(Landroidx/lifecycle/splinterproof;)Landroidx/lifecycle/peridotite$dern;", "Lcig/attabal;", "attabal", "(Landroidx/lifecycle/splinterproof;)Lcig/attabal;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final impassible f25180attabal = new impassible();

    public final CreationExtras attabal(splinterproof owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.p001lifecycle.taiyuan ? ((androidx.p001lifecycle.taiyuan) owner).getDefaultViewModelCreationExtras() : CreationExtras.saneness.f15611dern;
    }

    public final <T extends starveling> String dern(kurbash.wireman<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strAttabal = attabal.attabal(modelClass);
        if (strAttabal == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strAttabal;
    }

    public final peridotite.dern saneness(splinterproof owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof androidx.p001lifecycle.taiyuan ? ((androidx.p001lifecycle.taiyuan) owner).getDefaultViewModelProviderFactory() : wireman.f25183saneness;
    }

    public final <VM extends starveling> VM wireman() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
