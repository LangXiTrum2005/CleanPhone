package androidx.p001lifecycle;

import android.app.Application;
import android.os.Bundle;
import cig.CreationExtras;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gibeonite.attabal;
import inrooted.beachfront;
import inrooted.taiyuan;
import java.lang.reflect.Constructor;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/lifecycle/grimness;", "Landroidx/lifecycle/peridotite$marial;", "Landroidx/lifecycle/peridotite$dern;", "Landroid/app/Application;", "application", "Linrooted/taiyuan;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Landroid/app/Application;Linrooted/taiyuan;Landroid/os/Bundle;)V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "modelClass", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "attabal", "(Lkurbash/wireman;Lcig/attabal;)Landroidx/lifecycle/starveling;", "Ljava/lang/Class;", "dern", "(Ljava/lang/Class;Lcig/attabal;)Landroidx/lifecycle/starveling;", "", X3.i.W, "marial", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "saneness", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "viewModel", "", "wireman", "(Landroidx/lifecycle/starveling;)V", "Landroid/app/Application;", "Landroidx/lifecycle/peridotite$dern;", "factory", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Linrooted/beachfront;", "beachfront", "Linrooted/beachfront;", "savedStateRegistry", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class grimness extends peridotite.marial implements peridotite.dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public beachfront savedStateRegistry;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final peridotite.dern factory;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Lifecycle lifecycle;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public Application application;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Bundle defaultArgs;

    public grimness(Application application, taiyuan owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? peridotite.attabal.INSTANCE.attabal(application) : new peridotite.attabal();
    }

    @Override // androidx.lifecycle.peridotite.dern
    public <T extends starveling> T attabal(wireman<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return (T) dern(attabal.saneness(modelClass), extras);
    }

    @Override // androidx.lifecycle.peridotite.dern
    public <T extends starveling> T dern(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.attabal(peridotite.f10505dern);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.attabal(restrictive.f10539attabal) == null || extras.attabal(restrictive.f10541saneness) == null) {
            if (this.lifecycle != null) {
                return (T) marial(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.attabal(peridotite.attabal.f10510impromptu);
        boolean zIsAssignableFrom = attabal.class.isAssignableFrom(modelClass);
        Constructor constructorDern = (!zIsAssignableFrom || application == null) ? saran.dern(modelClass, saran.f10545saneness) : saran.dern(modelClass, saran.f10544attabal);
        if (constructorDern == null) {
            return (T) this.factory.dern(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) saran.wireman(modelClass, constructorDern, restrictive.attabal(extras)) : (T) saran.wireman(modelClass, constructorDern, application, restrictive.attabal(extras));
    }

    public final <T extends starveling> T marial(String key, Class<T> modelClass) {
        T t;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = attabal.class.isAssignableFrom(modelClass);
        Constructor constructorDern = (!zIsAssignableFrom || this.application == null) ? saran.dern(modelClass, saran.f10545saneness) : saran.dern(modelClass, saran.f10544attabal);
        if (constructorDern == null) {
            return this.application != null ? (T) this.factory.saneness(modelClass) : (T) peridotite.wireman.INSTANCE.attabal().saneness(modelClass);
        }
        beachfront beachfrontVar = this.savedStateRegistry;
        Intrinsics.beachfront(beachfrontVar);
        supplicat supplicatVarSaneness = cutely.saneness(beachfrontVar, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t = (T) saran.wireman(modelClass, constructorDern, supplicatVarSaneness.getHandle());
        } else {
            Intrinsics.beachfront(application);
            t = (T) saran.wireman(modelClass, constructorDern, application, supplicatVarSaneness.getHandle());
        }
        t.attabal("androidx.lifecycle.savedstate.vm.tag", supplicatVarSaneness);
        return t;
    }

    @Override // androidx.lifecycle.peridotite.dern
    public <T extends starveling> T saneness(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) marial(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.peridotite.marial
    public void wireman(starveling viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            beachfront beachfrontVar = this.savedStateRegistry;
            Intrinsics.beachfront(beachfrontVar);
            Lifecycle lifecycle = this.lifecycle;
            Intrinsics.beachfront(lifecycle);
            cutely.attabal(viewModel, beachfrontVar, lifecycle);
        }
    }
}
