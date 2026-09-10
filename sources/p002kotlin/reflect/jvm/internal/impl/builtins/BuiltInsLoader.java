package p002kotlin.reflect.jvm.internal.impl.builtins;

import discontentedness.attabal;
import discontentedness.dern;
import java.util.ServiceLoader;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.saneness;
import patroclinal.taiyuan;
import yeast.formularize;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface BuiltInsLoader {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Companion f29621attabal = Companion.f29622attabal;

    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f29622attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final taiyuan<BuiltInsLoader> f29623saneness = saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<BuiltInsLoader>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$Instance$2
            @Override // p002kotlin.jvm.functions.Function0
            public final BuiltInsLoader invoke() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                Intrinsics.beachfront(serviceLoaderLoad);
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.nosophobia(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        });

        public final BuiltInsLoader attabal() {
            return f29623saneness.getValue();
        }
    }

    kattegat attabal(formularize formularizeVar, trm trmVar, Iterable<? extends discontentedness.saneness> iterable, dern dernVar, attabal attabalVar, boolean z);
}
