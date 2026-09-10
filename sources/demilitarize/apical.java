package demilitarize;

import androidx.p001lifecycle.mathsort;
import androidx.p001lifecycle.peridotite;
import androidx.p001lifecycle.starveling;
import cig.CreationExtras;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelProviderImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Ldemilitarize/apical;", "", "Landroidx/lifecycle/mathsort;", X3.i.U, "Landroidx/lifecycle/peridotite$dern;", "factory", "Lcig/attabal;", "defaultExtras", "<init>", "(Landroidx/lifecycle/mathsort;Landroidx/lifecycle/peridotite$dern;Lcig/attabal;)V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "modelClass", "", X3.i.W, "wireman", "(Lkurbash/wireman;Ljava/lang/String;)Landroidx/lifecycle/starveling;", "attabal", "Landroidx/lifecycle/mathsort;", "saneness", "Landroidx/lifecycle/peridotite$dern;", "dern", "Lcig/attabal;", "Ldemilitarize/beachfront;", "Ldemilitarize/beachfront;", "lock", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final mathsort store;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final CreationExtras defaultExtras;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final peridotite.dern factory;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final beachfront lock;

    public apical(mathsort store, peridotite.dern factory, CreationExtras defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new beachfront();
    }

    public static /* synthetic */ starveling marial(apical apicalVar, kurbash.wireman wiremanVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = impassible.f25180attabal.dern(wiremanVar);
        }
        return apicalVar.wireman(wiremanVar, str);
    }

    public final <T extends starveling> T wireman(kurbash.wireman<T> modelClass, String key) {
        T t;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            try {
                t = (T) this.store.saneness(key);
                if (modelClass.beachfront(t)) {
                    if (this.factory instanceof peridotite.marial) {
                        peridotite.marial marialVar = (peridotite.marial) this.factory;
                        Intrinsics.beachfront(t);
                        marialVar.wireman(t);
                    }
                    Intrinsics.competently(t, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    cig.saneness sanenessVar = new cig.saneness(this.defaultExtras);
                    sanenessVar.dern(peridotite.f10505dern, key);
                    t = (T) formularize.attabal(this.factory, modelClass, sanenessVar);
                    this.store.wireman(key, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
