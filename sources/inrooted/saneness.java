package inrooted;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.arytenoidectomy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Recreator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Linrooted/saneness;", "Landroidx/lifecycle/impassible;", "Linrooted/taiyuan;", "owner", "<init>", "(Linrooted/taiyuan;)V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "", "className", "attabal", "(Ljava/lang/String;)V", "kowloon", "Linrooted/taiyuan;", "arytenoidectomy", "saneness", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness implements androidx.p001lifecycle.impassible {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final taiyuan owner;

    /* JADX INFO: renamed from: inrooted.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Recreator.android.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Linrooted/saneness$saneness;", "Linrooted/beachfront$saneness;", "Linrooted/beachfront;", "registry", "<init>", "(Linrooted/beachfront;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "attabal", "()Landroid/os/Bundle;", "", "className", "", "saneness", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0653saneness implements beachfront.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Set<String> classes;

        public C0653saneness(beachfront registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.dern("androidx.savedstate.Restarter", this);
        }

        @Override // inrooted.beachfront.saneness
        public Bundle attabal() {
            Pair[] pairArr;
            Map mapTaiyuan = seminary.taiyuan();
            if (mapTaiyuan.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapTaiyuan.size());
                for (Map.Entry entry : mapTaiyuan.entrySet()) {
                    arrayList.add(patroclinal.formularize.attabal((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleAttabal = claque.wireman.attabal((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            cutely.wireman(cutely.attabal(bundleAttabal), "classes_to_restore", CollectionsKt.molet(this.classes));
            return bundleAttabal;
        }

        public final void saneness(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }

    public saneness(taiyuan owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    public final void attabal(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, saneness.class.getClassLoader()).asSubclass(beachfront.attabal.class);
            Intrinsics.beachfront(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.beachfront(objNewInstance);
                    ((beachfront.attabal) objNewInstance).attabal(this.owner);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + className, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + className + " wasn't found", e3);
        }
    }

    @Override // androidx.p001lifecycle.impassible
    public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().wireman(this);
        Bundle bundleAttabal = this.owner.getSavedStateRegistry().attabal("androidx.savedstate.Restarter");
        if (bundleAttabal == null) {
            return;
        }
        List<String> listMarial = dern.marial(dern.attabal(bundleAttabal), "classes_to_restore");
        if (listMarial == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listMarial.iterator();
        while (it.hasNext()) {
            attabal(it.next());
        }
    }
}
