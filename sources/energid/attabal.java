package energid;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: ApiFeature.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal implements energid.impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Set<attabal> f25832dern = new HashSet();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f25833attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f25834saneness;

    /* JADX INFO: renamed from: energid.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApiFeature.java */
    public static class C0600attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final Set<String> f25835attabal = new HashSet(Arrays.asList(dovishness.wireman().saneness()));
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class beachfront extends attabal {
        public beachfront(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class competently extends attabal {
        public competently(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class dern extends attabal {
        public dern(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return true;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class impromptu extends attabal {
        public impromptu(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class marial extends attabal {
        public marial(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class saneness extends attabal {
        public saneness(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return true;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class taiyuan extends attabal {
        public taiyuan(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    /* JADX INFO: compiled from: ApiFeature.java */
    public static class wireman extends attabal {
        public wireman(String str, String str2) {
            super(str, str2);
        }

        @Override // energid.attabal
        public final boolean saneness() {
            return false;
        }
    }

    public attabal(String str, String str2) {
        this.f25833attabal = str;
        this.f25834saneness = str2;
        f25832dern.add(this);
    }

    public static Set<attabal> wireman() {
        return Collections.unmodifiableSet(f25832dern);
    }

    @Override // energid.impromptu
    public String attabal() {
        return this.f25833attabal;
    }

    public boolean dern() {
        return BoundaryInterfaceReflectionUtil.containsFeature(C0600attabal.f25835attabal, this.f25834saneness);
    }

    @Override // energid.impromptu
    public boolean isSupported() {
        return saneness() || dern();
    }

    public abstract boolean saneness();
}
