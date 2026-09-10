package androidx.p001lifecycle;

import android.app.Application;
import cig.CreationExtras;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import demilitarize.apical;
import demilitarize.impassible;
import java.lang.reflect.InvocationTargetException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0005\u0011\u001b\u001c\u0014\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ(\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/peridotite;", "", "Ldemilitarize/apical;", "impl", "<init>", "(Ldemilitarize/apical;)V", "Landroidx/lifecycle/mathsort;", X3.i.U, "Landroidx/lifecycle/peridotite$dern;", "factory", "Lcig/attabal;", "defaultCreationExtras", "(Landroidx/lifecycle/mathsort;Landroidx/lifecycle/peridotite$dern;Lcig/attabal;)V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkurbash/wireman;", "modelClass", "dern", "(Lkurbash/wireman;)Landroidx/lifecycle/starveling;", "Ljava/lang/Class;", "attabal", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "", X3.i.W, "saneness", "(Ljava/lang/String;Lkurbash/wireman;)Landroidx/lifecycle/starveling;", "Ldemilitarize/apical;", "marial", "wireman", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class peridotite {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final CreationExtras.dern<String> f10505dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final apical impl;

    /* JADX INFO: compiled from: CreationExtras.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/peridotite$beachfront", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class beachfront implements CreationExtras.dern<String> {
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/peridotite$dern;", "", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "modelClass", "saneness", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "dern", "(Ljava/lang/Class;Lcig/attabal;)Landroidx/lifecycle/starveling;", "Lkurbash/wireman;", "attabal", "(Lkurbash/wireman;Lcig/attabal;)Landroidx/lifecycle/starveling;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f10513attabal;

        /* JADX INFO: renamed from: androidx.lifecycle.peridotite$dern$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/peridotite$dern$attabal;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ Companion f10513attabal = new Companion();
        }

        default <T extends starveling> T attabal(kurbash.wireman<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) dern(gibeonite.attabal.saneness(modelClass), extras);
        }

        default <T extends starveling> T dern(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) saneness(modelClass);
        }

        default <T extends starveling> T saneness(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) impassible.f25180attabal.wireman();
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/peridotite$marial;", "", "<init>", "()V", "Landroidx/lifecycle/starveling;", "viewModel", "", "wireman", "(Landroidx/lifecycle/starveling;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class marial {
        public void wireman(starveling viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.peridotite$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/peridotite$saneness;", "", "<init>", "()V", "Landroidx/lifecycle/splinterproof;", "owner", "Landroidx/lifecycle/peridotite$dern;", "factory", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Landroidx/lifecycle/peridotite;", "saneness", "(Landroidx/lifecycle/splinterproof;Landroidx/lifecycle/peridotite$dern;Lcig/attabal;)Landroidx/lifecycle/peridotite;", "Landroidx/lifecycle/mathsort;", X3.i.U, "attabal", "(Landroidx/lifecycle/mathsort;Landroidx/lifecycle/peridotite$dern;Lcig/attabal;)Landroidx/lifecycle/peridotite;", "Lcig/attabal$dern;", "", "VIEW_MODEL_KEY", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ peridotite dern(Companion companion, splinterproof splinterproofVar, dern dernVar, CreationExtras creationExtras, int i, Object obj) {
            if ((i & 2) != 0) {
                dernVar = impassible.f25180attabal.saneness(splinterproofVar);
            }
            if ((i & 4) != 0) {
                creationExtras = impassible.f25180attabal.attabal(splinterproofVar);
            }
            return companion.saneness(splinterproofVar, dernVar, creationExtras);
        }

        public final peridotite attabal(mathsort store, dern factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new peridotite(store, factory, extras);
        }

        public final peridotite saneness(splinterproof owner, dern factory, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new peridotite(owner.getViewModelStore(), factory, extras);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/peridotite$wireman;", "Landroidx/lifecycle/peridotite$dern;", "<init>", "()V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "modelClass", "saneness", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "dern", "(Ljava/lang/Class;Lcig/attabal;)Landroidx/lifecycle/starveling;", "Lkurbash/wireman;", "attabal", "(Lkurbash/wireman;Lcig/attabal;)Landroidx/lifecycle/starveling;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class wireman implements dern {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static wireman f10514dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final CreationExtras.dern<String> f10516wireman = peridotite.f10505dern;

        /* JADX INFO: renamed from: androidx.lifecycle.peridotite$wireman$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/peridotite$wireman$attabal;", "", "<init>", "()V", "Landroidx/lifecycle/peridotite$wireman;", "attabal", "()Landroidx/lifecycle/peridotite$wireman;", "getInstance$annotations", C3700q2.p, "_instance", "Landroidx/lifecycle/peridotite$wireman;", "Lcig/attabal$dern;", "", "VIEW_MODEL_KEY", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final wireman attabal() {
                if (wireman.f10514dern == null) {
                    wireman.f10514dern = new wireman();
                }
                wireman wiremanVar = wireman.f10514dern;
                Intrinsics.beachfront(wiremanVar);
                return wiremanVar;
            }

            public Companion() {
            }
        }

        @Override // androidx.lifecycle.peridotite.dern
        public <T extends starveling> T attabal(kurbash.wireman<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) dern(gibeonite.attabal.saneness(modelClass), extras);
        }

        @Override // androidx.lifecycle.peridotite.dern
        public <T extends starveling> T dern(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) saneness(modelClass);
        }

        @Override // androidx.lifecycle.peridotite.dern
        public <T extends starveling> T saneness(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) demilitarize.marial.f25181attabal.attabal(modelClass);
        }
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f10505dern = new beachfront();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public peridotite(mathsort store, dern factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public <T extends starveling> T attabal(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) dern(gibeonite.attabal.marial(modelClass));
    }

    public final <T extends starveling> T dern(kurbash.wireman<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) apical.marial(this.impl, modelClass, null, 2, null);
    }

    public final <T extends starveling> T saneness(String key, kurbash.wireman<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.impl.wireman(modelClass, key);
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/peridotite$attabal;", "Landroidx/lifecycle/peridotite$wireman;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/starveling;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "modelClass", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "dern", "(Ljava/lang/Class;Lcig/attabal;)Landroidx/lifecycle/starveling;", "saneness", "(Ljava/lang/Class;)Landroidx/lifecycle/starveling;", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "impromptu", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/starveling;", "marial", "Landroid/app/Application;", "beachfront", "attabal", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class attabal extends wireman {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static attabal f10509competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final CreationExtras.dern<Application> f10510impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.peridotite$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/peridotite$attabal$attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/peridotite$attabal;", "attabal", "(Landroid/app/Application;)Landroidx/lifecycle/peridotite$attabal;", "_instance", "Landroidx/lifecycle/peridotite$attabal;", "Lcig/attabal$dern;", "APPLICATION_KEY", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final attabal attabal(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (attabal.f10509competently == null) {
                    attabal.f10509competently = new attabal(application);
                }
                attabal attabalVar = attabal.f10509competently;
                Intrinsics.beachfront(attabalVar);
                return attabalVar;
            }

            public Companion() {
            }
        }

        /* JADX INFO: compiled from: CreationExtras.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/peridotite$attabal$saneness", "Lcig/attabal$dern;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class saneness implements CreationExtras.dern<Application> {
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            f10510impromptu = new saneness();
        }

        public attabal(Application application, int i) {
            this.application = application;
        }

        @Override // androidx.lifecycle.peridotite.wireman, androidx.lifecycle.peridotite.dern
        public <T extends starveling> T dern(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) saneness(modelClass);
            }
            Application application = (Application) extras.attabal(f10510impromptu);
            if (application != null) {
                return (T) impromptu(modelClass, application);
            }
            if (androidx.p001lifecycle.attabal.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.saneness(modelClass);
        }

        public final <T extends starveling> T impromptu(Class<T> modelClass, Application app) {
            if (!androidx.p001lifecycle.attabal.class.isAssignableFrom(modelClass)) {
                return (T) super.saneness(modelClass);
            }
            try {
                T tNewInstance = modelClass.getConstructor(Application.class).newInstance(app);
                Intrinsics.beachfront(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            }
        }

        @Override // androidx.lifecycle.peridotite.wireman, androidx.lifecycle.peridotite.dern
        public <T extends starveling> T saneness(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) impromptu(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public attabal() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public attabal(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    public peridotite(apical apicalVar) {
        this.impl = apicalVar;
    }

    public /* synthetic */ peridotite(mathsort mathsortVar, dern dernVar, CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mathsortVar, dernVar, (i & 4) != 0 ? CreationExtras.saneness.f15611dern : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public peridotite(mathsort store, dern factory, CreationExtras defaultCreationExtras) {
        this(new apical(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }
}
