package s4;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f50106b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f50107a;

    public f(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f50107a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (m.f50121g.a()) {
            return this.f50107a.deleteProfile(str);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (m.f50121g.a()) {
            return this.f50107a.getAllProfileNames();
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final r4.b getOrCreateProfile(String str) {
        if (m.f50121g.a()) {
            return new rb.c((ProfileBoundaryInterface) no.b.e(ProfileBoundaryInterface.class, this.f50107a.getOrCreateProfile(str)), 3);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final r4.b getProfile(String str) {
        if (!m.f50121g.a()) {
            throw m.a();
        }
        InvocationHandler profile = this.f50107a.getProfile(str);
        if (profile != null) {
            return new rb.c((ProfileBoundaryInterface) no.b.e(ProfileBoundaryInterface.class, profile), 3);
        }
        return null;
    }
}
