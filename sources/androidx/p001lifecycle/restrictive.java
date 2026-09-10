package androidx.p001lifecycle;

import android.os.Bundle;
import cig.CreationExtras;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import inrooted.beachfront;
import inrooted.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\"\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u001c*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Linrooted/taiyuan;", "Landroidx/lifecycle/splinterproof;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "dern", "(Linrooted/taiyuan;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", X3.i.W, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArgs", "Landroidx/lifecycle/sealless;", "saneness", "(Linrooted/taiyuan;Landroidx/lifecycle/splinterproof;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/sealless;", "Lcig/attabal;", "attabal", "(Lcig/attabal;)Landroidx/lifecycle/sealless;", "Lcig/attabal$dern;", "Lcig/attabal$dern;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/seminary;", "marial", "(Landroidx/lifecycle/splinterproof;)Landroidx/lifecycle/seminary;", "savedStateHandlesVM", "Landroidx/lifecycle/polder;", "wireman", "(Linrooted/taiyuan;)Landroidx/lifecycle/polder;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final CreationExtras.dern<taiyuan> f10539attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final CreationExtras.dern<Bundle> f10540dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final CreationExtras.dern<splinterproof> f10541saneness;

    /* JADX INFO: compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/restrictive$attabal", "Landroidx/lifecycle/peridotite$dern;", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "modelClass", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "attabal", "(Lkurbash/wireman;Lcig/attabal;)Landroidx/lifecycle/starveling;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements peridotite.dern {
        @Override // androidx.lifecycle.peridotite.dern
        public <T extends starveling> T attabal(kurbash.wireman<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new seminary();
        }
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/restrictive$dern", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class dern implements CreationExtras.dern<splinterproof> {
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/restrictive$saneness", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements CreationExtras.dern<taiyuan> {
    }

    /* JADX INFO: compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/restrictive$wireman", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class wireman implements CreationExtras.dern<Bundle> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f10539attabal = new saneness();
        f10541saneness = new dern();
        f10540dern = new wireman();
    }

    public static final sealless attabal(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        taiyuan taiyuanVar = (taiyuan) creationExtras.attabal(f10539attabal);
        if (taiyuanVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        splinterproof splinterproofVar = (splinterproof) creationExtras.attabal(f10541saneness);
        if (splinterproofVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.attabal(f10540dern);
        String str = (String) creationExtras.attabal(peridotite.f10505dern);
        if (str != null) {
            return saneness(taiyuanVar, splinterproofVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends taiyuan & splinterproof> void dern(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Lifecycle.State state = t.getLifecycle().getState();
        if (state != Lifecycle.State.INITIALIZED && state != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().saneness("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            polder polderVar = new polder(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().dern("androidx.lifecycle.internal.SavedStateHandlesProvider", polderVar);
            t.getLifecycle().attabal(new kattegat(polderVar));
        }
    }

    public static final seminary marial(splinterproof splinterproofVar) {
        Intrinsics.checkNotNullParameter(splinterproofVar, "<this>");
        return (seminary) peridotite.Companion.dern(peridotite.INSTANCE, splinterproofVar, new attabal(), null, 4, null).saneness("androidx.lifecycle.internal.SavedStateHandlesVM", polloi.saneness(seminary.class));
    }

    public static final sealless saneness(taiyuan taiyuanVar, splinterproof splinterproofVar, String str, Bundle bundle) {
        polder polderVarWireman = wireman(taiyuanVar);
        seminary seminaryVarMarial = marial(splinterproofVar);
        sealless seallessVar = seminaryVarMarial.marial().get(str);
        if (seallessVar != null) {
            return seallessVar;
        }
        sealless seallessVarAttabal = sealless.INSTANCE.attabal(polderVarWireman.dern(str), bundle);
        seminaryVarMarial.marial().put(str, seallessVarAttabal);
        return seallessVarAttabal;
    }

    public static final polder wireman(taiyuan taiyuanVar) {
        Intrinsics.checkNotNullParameter(taiyuanVar, "<this>");
        beachfront.saneness sanenessVarSaneness = taiyuanVar.getSavedStateRegistry().saneness("androidx.lifecycle.internal.SavedStateHandlesProvider");
        polder polderVar = sanenessVarSaneness instanceof polder ? (polder) sanenessVarSaneness : null;
        if (polderVar != null) {
            return polderVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
}
