package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0018J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0013J\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b \u0010\u0013J\u001d\u0010!\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0013J%\u0010$\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b$\u0010\u0018J\u001d\u0010%\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0013J\u001d\u0010&\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006-"}, d2 = {"Landroidx/fragment/app/preprohormone;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/FragmentManager$formularize;", "cb", "", "recursive", "", "kowloon", "(Landroidx/fragment/app/FragmentManager$formularize;Z)V", "arytenoidectomy", "(Landroidx/fragment/app/FragmentManager$formularize;)V", "Landroidx/fragment/app/Fragment;", "f", "onlyRecursive", "competently", "(Landroidx/fragment/app/Fragment;Z)V", "saneness", "Landroid/os/Bundle;", "savedInstanceState", "impromptu", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "dern", "attabal", "Landroid/view/View;", "v", "impassible", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "apical", "taiyuan", "beachfront", "formularize", "outState", "cutely", "triweekly", "wireman", "marial", "Landroidx/fragment/app/FragmentManager;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/preprohormone$attabal;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "lifecycleCallbacks", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final FragmentManager fragmentManager;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final CopyOnWriteArrayList<attabal> lifecycleCallbacks;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/preprohormone$attabal;", "", "Landroidx/fragment/app/FragmentManager$formularize;", "callback", "", "recursive", "<init>", "(Landroidx/fragment/app/FragmentManager$formularize;Z)V", "attabal", "Landroidx/fragment/app/FragmentManager$formularize;", "()Landroidx/fragment/app/FragmentManager$formularize;", "saneness", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final FragmentManager.formularize callback;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final boolean recursive;

        public attabal(FragmentManager.formularize callback, boolean z) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callback = callback;
            this.recursive = z;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final FragmentManager.formularize getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public preprohormone(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void apical(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().apical(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().apical(this.fragmentManager, f);
            }
        }
    }

    public final void arytenoidectomy(FragmentManager.formularize cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                for (int i = 0; i < size; i++) {
                    if (this.lifecycleCallbacks.get(i).getCallback() == cb) {
                        this.lifecycleCallbacks.remove(i);
                        break;
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void attabal(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().attabal(f, savedInstanceState, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().attabal(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void beachfront(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().beachfront(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().beachfront(this.fragmentManager, f);
            }
        }
    }

    public final void competently(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Context context = this.fragmentManager.claque().getContext();
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().competently(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().competently(this.fragmentManager, f, context);
            }
        }
    }

    public final void cutely(Fragment f, Bundle outState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().cutely(f, outState, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().cutely(this.fragmentManager, f, outState);
            }
        }
    }

    public final void dern(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().dern(f, savedInstanceState, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().dern(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void formularize(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().formularize(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().formularize(this.fragmentManager, f);
            }
        }
    }

    public final void impassible(Fragment f, View v, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(v, "v");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().impassible(f, v, savedInstanceState, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().impassible(this.fragmentManager, f, v, savedInstanceState);
            }
        }
    }

    public final void impromptu(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().impromptu(f, savedInstanceState, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().impromptu(this.fragmentManager, f, savedInstanceState);
            }
        }
    }

    public final void kowloon(FragmentManager.formularize cb, boolean recursive) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.lifecycleCallbacks.add(new attabal(cb, recursive));
    }

    public final void marial(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().marial(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().marial(this.fragmentManager, f);
            }
        }
    }

    public final void saneness(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Context context = this.fragmentManager.claque().getContext();
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().saneness(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().saneness(this.fragmentManager, f, context);
            }
        }
    }

    public final void taiyuan(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().taiyuan(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().taiyuan(this.fragmentManager, f);
            }
        }
    }

    public final void triweekly(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().triweekly(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().triweekly(this.fragmentManager, f);
            }
        }
    }

    public final void wireman(Fragment f, boolean onlyRecursive) {
        Intrinsics.checkNotNullParameter(f, "f");
        Fragment fragmentTechnofreak = this.fragmentManager.technofreak();
        if (fragmentTechnofreak != null) {
            FragmentManager parentFragmentManager = fragmentTechnofreak.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.herdbook().wireman(f, true);
        }
        for (attabal attabalVar : this.lifecycleCallbacks) {
            if (!onlyRecursive || attabalVar.getRecursive()) {
                attabalVar.getCallback().wireman(this.fragmentManager, f);
            }
        }
    }
}
