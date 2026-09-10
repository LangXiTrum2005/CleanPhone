package energid;

import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: ProfileStoreImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly implements http.wireman {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static http.wireman f25860saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f25861attabal;

    public triweekly(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f25861attabal = profileStoreBoundaryInterface;
    }

    public static http.wireman attabal() {
        if (f25860saneness == null) {
            f25860saneness = new triweekly(dovishness.wireman().getProfileStore());
        }
        return f25860saneness;
    }

    @Override // http.wireman
    public http.dern getOrCreateProfile(String str) {
        if (adultoid.f25817treadless.dern()) {
            return new impassible((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, this.f25861attabal.getOrCreateProfile(str)));
        }
        throw adultoid.attabal();
    }
}
