package hint;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: GlobalLibraryVersionRegistrar.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile wireman f27732saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<beachfront> f27733attabal = new HashSet();

    public static wireman attabal() {
        wireman wiremanVar;
        wireman wiremanVar2 = f27732saneness;
        if (wiremanVar2 != null) {
            return wiremanVar2;
        }
        synchronized (wireman.class) {
            try {
                wiremanVar = f27732saneness;
                if (wiremanVar == null) {
                    wiremanVar = new wireman();
                    f27732saneness = wiremanVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wiremanVar;
    }

    public Set<beachfront> saneness() {
        Set<beachfront> setUnmodifiableSet;
        synchronized (this.f27733attabal) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f27733attabal);
        }
        return setUnmodifiableSet;
    }
}
