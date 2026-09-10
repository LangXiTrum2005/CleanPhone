package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.p001lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class seminary {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public String f10392apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public ArrayList<String> f10393arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final graveside f10394attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f10395beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f10396competently;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f10399formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public CharSequence f10400impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f10401impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public CharSequence f10402kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f10403marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ArrayList<Runnable> f10404molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ArrayList<String> f10405monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ClassLoader f10407saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f10408taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f10409triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f10410wireman;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ArrayList<attabal> f10398dern = new ArrayList<>();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public boolean f10397cutely = true;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f10406polloi = false;

    /* JADX INFO: compiled from: FragmentTransaction.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f10411attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f10412beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f10413competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f10414dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public Lifecycle.State f10415impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f10416marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Fragment f10417saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public Lifecycle.State f10418taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f10419wireman;

        public attabal() {
        }

        public attabal(int i, Fragment fragment) {
            this.f10411attabal = i;
            this.f10417saneness = fragment;
            this.f10414dern = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f10415impromptu = state;
            this.f10418taiyuan = state;
        }

        public attabal(int i, Fragment fragment, boolean z) {
            this.f10411attabal = i;
            this.f10417saneness = fragment;
            this.f10414dern = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f10415impromptu = state;
            this.f10418taiyuan = state;
        }

        public attabal(int i, Fragment fragment, Lifecycle.State state) {
            this.f10411attabal = i;
            this.f10417saneness = fragment;
            this.f10414dern = false;
            this.f10415impromptu = fragment.mMaxState;
            this.f10418taiyuan = state;
        }
    }

    public seminary(graveside gravesideVar, ClassLoader classLoader) {
        this.f10394attabal = gravesideVar;
        this.f10407saneness = classLoader;
    }

    public seminary apical(Fragment fragment) {
        marial(new attabal(6, fragment));
        return this;
    }

    public seminary arytenoidectomy(int i, Fragment fragment) {
        return monoploid(i, fragment, null);
    }

    public seminary beachfront(Fragment fragment) {
        marial(new attabal(7, fragment));
        return this;
    }

    public abstract int competently();

    public abstract void cutely();

    public final seminary dern(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return saneness(viewGroup.getId(), fragment, str);
    }

    public seminary formularize() {
        if (this.f10408taiyuan) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f10397cutely = false;
        return this;
    }

    public seminary graveside(boolean z) {
        this.f10406polloi = z;
        return this;
    }

    public void impassible(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.beachfront(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        marial(new attabal(i2, fragment));
    }

    public abstract int impromptu();

    public seminary kowloon(Fragment fragment) {
        marial(new attabal(3, fragment));
        return this;
    }

    public void marial(attabal attabalVar) {
        this.f10398dern.add(attabalVar);
        attabalVar.f10419wireman = this.f10410wireman;
        attabalVar.f10416marial = this.f10403marial;
        attabalVar.f10412beachfront = this.f10395beachfront;
        attabalVar.f10413competently = this.f10396competently;
    }

    public seminary molybdenite(Fragment fragment, Lifecycle.State state) {
        marial(new attabal(10, fragment, state));
        return this;
    }

    public seminary monoploid(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        impassible(i, fragment, str, 2);
        return this;
    }

    public seminary polloi(boolean z, Runnable runnable) {
        if (!z) {
            formularize();
        }
        if (this.f10404molybdenite == null) {
            this.f10404molybdenite = new ArrayList<>();
        }
        this.f10404molybdenite.add(runnable);
        return this;
    }

    public seminary saneness(int i, Fragment fragment, String str) {
        impassible(i, fragment, str, 1);
        return this;
    }

    public abstract void taiyuan();

    public abstract boolean triweekly();

    public seminary wireman(Fragment fragment, String str) {
        impassible(0, fragment, str, 1);
        return this;
    }
}
