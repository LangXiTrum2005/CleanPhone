package energid;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: StartupApiFeature.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class arytenoidectomy {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Set<arytenoidectomy> f25829dern = new HashSet();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f25830attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f25831saneness;

    /* JADX INFO: compiled from: StartupApiFeature.java */
    public static class attabal extends arytenoidectomy {
        public attabal(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: compiled from: StartupApiFeature.java */
    public static class saneness extends arytenoidectomy {
        public saneness(String str, String str2) {
            super(str, str2);
        }
    }

    public arytenoidectomy(String str, String str2) {
        this.f25830attabal = str;
        this.f25831saneness = str2;
        f25829dern.add(this);
    }
}
