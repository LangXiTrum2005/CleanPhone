package androidx.webkit.internal;

import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class ProfileStoreImpl implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ProfileStoreImpl f8573b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f8574a;

    public ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f8574a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f8573b == null) {
            f8573b = new ProfileStoreImpl(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f8591a.getProfileStore());
        }
        return f8573b;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (WebViewFeatureInternal.f8589l.c()) {
            return this.f8574a.deleteProfile(str);
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (WebViewFeatureInternal.f8589l.c()) {
            return this.f8574a.getAllProfileNames();
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getOrCreateProfile(String str) {
        if (WebViewFeatureInternal.f8589l.c()) {
            return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileBoundaryInterface.class, this.f8574a.getOrCreateProfile(str)));
        }
        throw WebViewFeatureInternal.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final Profile getProfile(String str) {
        if (!WebViewFeatureInternal.f8589l.c()) {
            throw WebViewFeatureInternal.a();
        }
        InvocationHandler profile = this.f8574a.getProfile(str);
        if (profile != null) {
            return new ProfileImpl((ProfileBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
