package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.licking;
import androidx.compose.runtime.miliaria;
import com.applovin.sdk.AppLovinEventTypes;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b)\u0010\u0019¨\u0006+²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", "content", "attabal", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/taiyuan;I)V", "Landroid/content/Context;", "context", "Loverspeculate/saneness;", "impromptu", "(Landroid/content/Context;Landroidx/compose/runtime/taiyuan;I)Loverspeculate/saneness;", "Landroid/content/res/Configuration;", "configuration", "Loverspeculate/attabal;", "competently", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/taiyuan;I)Loverspeculate/attabal;", "", "name", "", "beachfront", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/unconsolidated;", "Landroidx/compose/runtime/unconsolidated;", "getLocalConfiguration", "()Landroidx/compose/runtime/unconsolidated;", "LocalConfiguration", "saneness", "getLocalContext", "LocalContext", "dern", "getLocalImageVectorCache", "LocalImageVectorCache", "wireman", "getLocalResourceIdCache", "LocalResourceIdCache", "Linrooted/taiyuan;", "marial", "getLocalSavedStateRegistryOwner", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "getLocalView", "LocalView", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<Configuration> f7237attabal = androidx.compose.runtime.stratoscope.impromptu(null, new Function0<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<Context> f7241saneness = androidx.compose.runtime.stratoscope.taiyuan(new Function0<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalContext");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<overspeculate.attabal> f7239dern = androidx.compose.runtime.stratoscope.taiyuan(new Function0<overspeculate.attabal>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // p002kotlin.jvm.functions.Function0
        public final overspeculate.attabal invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<overspeculate.saneness> f7242wireman = androidx.compose.runtime.stratoscope.taiyuan(new Function0<overspeculate.saneness>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // p002kotlin.jvm.functions.Function0
        public final overspeculate.saneness invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<inrooted.taiyuan> f7240marial = androidx.compose.runtime.stratoscope.taiyuan(new Function0<inrooted.taiyuan>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final inrooted.taiyuan invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final androidx.compose.runtime.unconsolidated<View> f7238beachfront = androidx.compose.runtime.stratoscope.taiyuan(new Function0<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.beachfront("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$attabal", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ overspeculate.attabal f7244arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Configuration f7245kowloon;

        public attabal(Configuration configuration, overspeculate.attabal attabalVar) {
            this.f7245kowloon = configuration;
            this.f7244arytenoidectomy = attabalVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f7244arytenoidectomy.saneness(this.f7245kowloon.updateFrom(configuration));
            this.f7245kowloon.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f7244arytenoidectomy.attabal();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f7244arytenoidectomy.attabal();
        }
    }

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$saneness", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ overspeculate.saneness f7250kowloon;

        public saneness(overspeculate.saneness sanenessVar) {
            this.f7250kowloon = sanenessVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            this.f7250kowloon.attabal();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f7250kowloon.attabal();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f7250kowloon.attabal();
        }
    }

    public static final void attabal(final AndroidComposeView androidComposeView, final Function2<? super androidx.compose.runtime.taiyuan, ? super Integer, Unit> function2, androidx.compose.runtime.taiyuan taiyuanVar, final int i) {
        int i2;
        androidx.compose.runtime.taiyuan taiyuanVarAttabal = taiyuanVar.attabal(1396852028);
        if ((i & 6) == 0) {
            i2 = (taiyuanVarAttabal.impassible(androidComposeView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= taiyuanVarAttabal.impassible(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && taiyuanVarAttabal.saneness()) {
            taiyuanVarAttabal.kowloon();
        } else {
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.mathsort(1396852028, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView.getContext();
            Object objApical = taiyuanVarAttabal.apical();
            androidx.compose.runtime.taiyuan.Companion companion = androidx.compose.runtime.taiyuan.INSTANCE;
            if (objApical == companion.attabal()) {
                objApical = miliaria.saneness(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                taiyuanVarAttabal.competently(objApical);
            }
            final androidx.compose.runtime.czestochowa czestochowaVar = (androidx.compose.runtime.czestochowa) objApical;
            Object objApical2 = taiyuanVarAttabal.apical();
            if (objApical2 == companion.attabal()) {
                objApical2 = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                        invoke2(configuration);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Configuration configuration) {
                        AndroidCompositionLocals_androidKt.dern(czestochowaVar, new Configuration(configuration));
                    }
                };
                taiyuanVarAttabal.competently(objApical2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objApical2);
            Object objApical3 = taiyuanVarAttabal.apical();
            if (objApical3 == companion.attabal()) {
                objApical3 = new seminary(context);
                taiyuanVarAttabal.competently(objApical3);
            }
            final seminary seminaryVar = (seminary) objApical3;
            AndroidComposeView.saneness viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objApical4 = taiyuanVarAttabal.apical();
            if (objApical4 == companion.attabal()) {
                objApical4 = DisposableSaveableStateRegistry_androidKt.saneness(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                taiyuanVarAttabal.competently(objApical4);
            }
            final mathsort mathsortVar = (mathsort) objApical4;
            Unit unit = Unit.f29295attabal;
            boolean zImpassible = taiyuanVarAttabal.impassible(mathsortVar);
            Object objApical5 = taiyuanVarAttabal.apical();
            if (zImpassible || objApical5 == companion.attabal()) {
                objApical5 = new Function1<androidx.compose.runtime.privatdozent, androidx.compose.runtime.saran>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1

                    /* JADX INFO: compiled from: Effects.kt */
                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$attabal", "Landroidx/compose/runtime/saran;", "", "attabal", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class attabal implements androidx.compose.runtime.saran {

                        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                        public final /* synthetic */ mathsort f7243attabal;

                        public attabal(mathsort mathsortVar) {
                            this.f7243attabal = mathsortVar;
                        }

                        @Override // androidx.compose.runtime.saran
                        public void attabal() {
                            this.f7243attabal.saneness();
                        }
                    }

                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public final androidx.compose.runtime.saran invoke(androidx.compose.runtime.privatdozent privatdozentVar) {
                        return new attabal(mathsortVar);
                    }
                };
                taiyuanVarAttabal.competently(objApical5);
            }
            androidx.compose.runtime.hydrovane.attabal(unit, (Function1) objApical5, taiyuanVarAttabal, 6);
            androidx.compose.runtime.stratoscope.wireman(new androidx.compose.runtime.claque[]{f7237attabal.wireman(saneness(czestochowaVar)), f7241saneness.wireman(context), cosy.saneness.dern().wireman(viewTreeOwners.getLifecycleOwner()), f7240marial.wireman(viewTreeOwners.getSavedStateRegistryOwner()), stratoscope.marial.marial().wireman(mathsortVar), f7238beachfront.wireman(androidComposeView.getView()), f7239dern.wireman(competently(context, saneness(czestochowaVar), taiyuanVarAttabal, 0)), f7242wireman.wireman(impromptu(context, taiyuanVarAttabal, 0)), CompositionLocalsKt.dern().wireman(Boolean.valueOf(((Boolean) taiyuanVarAttabal.wireman(CompositionLocalsKt.wireman())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, cuirassed.wireman.wireman(1471621628, true, new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar2, Integer num) {
                    invoke(taiyuanVar2, num.intValue());
                    return Unit.f29295attabal;
                }

                public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar2, int i3) {
                    if ((i3 & 3) == 2 && taiyuanVar2.saneness()) {
                        taiyuanVar2.kowloon();
                        return;
                    }
                    if (androidx.compose.runtime.polloi.grimness()) {
                        androidx.compose.runtime.polloi.mathsort(1471621628, i3, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                    }
                    CompositionLocalsKt.attabal(androidComposeView, seminaryVar, function2, taiyuanVar2, 0);
                    if (androidx.compose.runtime.polloi.grimness()) {
                        androidx.compose.runtime.polloi.peridotite();
                    }
                }
            }, taiyuanVarAttabal, 54), taiyuanVarAttabal, androidx.compose.runtime.claque.f5860taiyuan | 48);
            if (androidx.compose.runtime.polloi.grimness()) {
                androidx.compose.runtime.polloi.peridotite();
            }
        }
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2<androidx.compose.runtime.taiyuan, Integer, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // p002kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.taiyuan taiyuanVar2, Integer num) {
                    invoke(taiyuanVar2, num.intValue());
                    return Unit.f29295attabal;
                }

                public final void invoke(androidx.compose.runtime.taiyuan taiyuanVar2, int i3) {
                    AndroidCompositionLocals_androidKt.attabal(androidComposeView, function2, taiyuanVar2, androidx.compose.runtime.outmarry.attabal(i | 1));
                }
            });
        }
    }

    public static final Void beachfront(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final overspeculate.attabal competently(final Context context, Configuration configuration, androidx.compose.runtime.taiyuan taiyuanVar, int i) {
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.mathsort(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object objApical = taiyuanVar.apical();
        androidx.compose.runtime.taiyuan.Companion companion = androidx.compose.runtime.taiyuan.INSTANCE;
        if (objApical == companion.attabal()) {
            objApical = new overspeculate.attabal();
            taiyuanVar.competently(objApical);
        }
        overspeculate.attabal attabalVar = (overspeculate.attabal) objApical;
        Object objApical2 = taiyuanVar.apical();
        Object obj = objApical2;
        if (objApical2 == companion.attabal()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            taiyuanVar.competently(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objApical3 = taiyuanVar.apical();
        if (objApical3 == companion.attabal()) {
            objApical3 = new attabal(configuration3, attabalVar);
            taiyuanVar.competently(objApical3);
        }
        final attabal attabalVar2 = (attabal) objApical3;
        boolean zImpassible = taiyuanVar.impassible(context);
        Object objApical4 = taiyuanVar.apical();
        if (zImpassible || objApical4 == companion.attabal()) {
            objApical4 = new Function1<androidx.compose.runtime.privatdozent, androidx.compose.runtime.saran>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$attabal", "Landroidx/compose/runtime/saran;", "", "attabal", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class attabal implements androidx.compose.runtime.saran {

                    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                    public final /* synthetic */ Context f7246attabal;

                    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
                    public final /* synthetic */ AndroidCompositionLocals_androidKt.attabal f7247saneness;

                    public attabal(Context context, AndroidCompositionLocals_androidKt.attabal attabalVar) {
                        this.f7246attabal = context;
                        this.f7247saneness = attabalVar;
                    }

                    @Override // androidx.compose.runtime.saran
                    public void attabal() {
                        this.f7246attabal.getApplicationContext().unregisterComponentCallbacks(this.f7247saneness);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.saran invoke(androidx.compose.runtime.privatdozent privatdozentVar) {
                    context.getApplicationContext().registerComponentCallbacks(attabalVar2);
                    return new attabal(context, attabalVar2);
                }
            };
            taiyuanVar.competently(objApical4);
        }
        androidx.compose.runtime.hydrovane.attabal(attabalVar, (Function1) objApical4, taiyuanVar, 0);
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.peridotite();
        }
        return attabalVar;
    }

    public static final void dern(androidx.compose.runtime.czestochowa<Configuration> czestochowaVar, Configuration configuration) {
        czestochowaVar.setValue(configuration);
    }

    public static final overspeculate.saneness impromptu(final Context context, androidx.compose.runtime.taiyuan taiyuanVar, int i) {
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.mathsort(-1348507246, i, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object objApical = taiyuanVar.apical();
        androidx.compose.runtime.taiyuan.Companion companion = androidx.compose.runtime.taiyuan.INSTANCE;
        if (objApical == companion.attabal()) {
            objApical = new overspeculate.saneness();
            taiyuanVar.competently(objApical);
        }
        overspeculate.saneness sanenessVar = (overspeculate.saneness) objApical;
        Object objApical2 = taiyuanVar.apical();
        if (objApical2 == companion.attabal()) {
            objApical2 = new saneness(sanenessVar);
            taiyuanVar.competently(objApical2);
        }
        final saneness sanenessVar2 = (saneness) objApical2;
        boolean zImpassible = taiyuanVar.impassible(context);
        Object objApical3 = taiyuanVar.apical();
        if (zImpassible || objApical3 == companion.attabal()) {
            objApical3 = new Function1<androidx.compose.runtime.privatdozent, androidx.compose.runtime.saran>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$attabal", "Landroidx/compose/runtime/saran;", "", "attabal", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class attabal implements androidx.compose.runtime.saran {

                    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
                    public final /* synthetic */ Context f7248attabal;

                    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
                    public final /* synthetic */ AndroidCompositionLocals_androidKt.saneness f7249saneness;

                    public attabal(Context context, AndroidCompositionLocals_androidKt.saneness sanenessVar) {
                        this.f7248attabal = context;
                        this.f7249saneness = sanenessVar;
                    }

                    @Override // androidx.compose.runtime.saran
                    public void attabal() {
                        this.f7248attabal.getApplicationContext().unregisterComponentCallbacks(this.f7249saneness);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.saran invoke(androidx.compose.runtime.privatdozent privatdozentVar) {
                    context.getApplicationContext().registerComponentCallbacks(sanenessVar2);
                    return new attabal(context, sanenessVar2);
                }
            };
            taiyuanVar.competently(objApical3);
        }
        androidx.compose.runtime.hydrovane.attabal(sanenessVar, (Function1) objApical3, taiyuanVar, 0);
        if (androidx.compose.runtime.polloi.grimness()) {
            androidx.compose.runtime.polloi.peridotite();
        }
        return sanenessVar;
    }

    public static final Configuration saneness(androidx.compose.runtime.czestochowa<Configuration> czestochowaVar) {
        return czestochowaVar.getValue();
    }
}
