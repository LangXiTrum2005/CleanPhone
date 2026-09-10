package energid;

import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface;

/* JADX INFO: compiled from: WebViewStartUpConfigAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class cuirassed implements WebViewStartUpConfigBoundaryInterface {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final http.monoploid f25844attabal;

    public cuirassed(http.monoploid monoploidVar) {
        this.f25844attabal = monoploidVar;
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Executor getBackgroundExecutor() {
        return this.f25844attabal.attabal();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public Set<String> getProfileNamesToLoad() {
        return this.f25844attabal.saneness();
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
        return this.f25844attabal.dern();
    }
}
