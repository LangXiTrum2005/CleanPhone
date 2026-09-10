package regius;

import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.cuirassed;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: LifecycleLifecycle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class apical implements cutely, androidx.p001lifecycle.kowloon {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Lifecycle f36192arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Set<formularize> f36193kowloon = new HashSet();

    public apical(Lifecycle lifecycle) {
        this.f36192arytenoidectomy = lifecycle;
        lifecycle.attabal(this);
    }

    @Override // regius.cutely
    public void attabal(formularize formularizeVar) {
        this.f36193kowloon.remove(formularizeVar);
    }

    @cuirassed(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36193kowloon).iterator();
        while (it.hasNext()) {
            ((formularize) it.next()).onDestroy();
        }
        arytenoidectomyVar.getLifecycle().wireman(this);
    }

    @cuirassed(Lifecycle.Event.ON_START)
    public void onStart(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36193kowloon).iterator();
        while (it.hasNext()) {
            ((formularize) it.next()).onStart();
        }
    }

    @cuirassed(Lifecycle.Event.ON_STOP)
    public void onStop(androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar) {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36193kowloon).iterator();
        while (it.hasNext()) {
            ((formularize) it.next()).onStop();
        }
    }

    @Override // regius.cutely
    public void saneness(formularize formularizeVar) {
        this.f36193kowloon.add(formularizeVar);
        if (this.f36192arytenoidectomy.getState() == Lifecycle.State.DESTROYED) {
            formularizeVar.onDestroy();
        } else if (this.f36192arytenoidectomy.getState().isAtLeast(Lifecycle.State.STARTED)) {
            formularizeVar.onStart();
        } else {
            formularizeVar.onStop();
        }
    }
}
