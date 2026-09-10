package earstone;

import android.view.ViewGroup;

/* JADX INFO: compiled from: Scene.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ViewGroup f25507attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Runnable f25508saneness;

    public static void dern(ViewGroup viewGroup, arytenoidectomy arytenoidectomyVar) {
        viewGroup.setTag(triweekly.transition_current_scene, arytenoidectomyVar);
    }

    public static arytenoidectomy saneness(ViewGroup viewGroup) {
        return (arytenoidectomy) viewGroup.getTag(triweekly.transition_current_scene);
    }

    public void attabal() {
        Runnable runnable;
        if (saneness(this.f25507attabal) != this || (runnable = this.f25508saneness) == null) {
            return;
        }
        runnable.run();
    }
}
