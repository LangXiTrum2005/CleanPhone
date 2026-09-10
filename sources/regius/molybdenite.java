package regius;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class molybdenite implements formularize {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Set<belongingness.wireman<?>> f36212kowloon = Collections.newSetFromMap(new WeakHashMap());

    public List<belongingness.wireman<?>> competently() {
        return com.bumptech.glide.util.formularize.apical(this.f36212kowloon);
    }

    public void dern() {
        this.f36212kowloon.clear();
    }

    public void formularize(belongingness.wireman<?> wiremanVar) {
        this.f36212kowloon.remove(wiremanVar);
    }

    @Override // regius.formularize
    public void onDestroy() {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36212kowloon).iterator();
        while (it.hasNext()) {
            ((belongingness.wireman) it.next()).onDestroy();
        }
    }

    @Override // regius.formularize
    public void onStart() {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36212kowloon).iterator();
        while (it.hasNext()) {
            ((belongingness.wireman) it.next()).onStart();
        }
    }

    @Override // regius.formularize
    public void onStop() {
        Iterator it = com.bumptech.glide.util.formularize.apical(this.f36212kowloon).iterator();
        while (it.hasNext()) {
            ((belongingness.wireman) it.next()).onStop();
        }
    }

    public void taiyuan(belongingness.wireman<?> wiremanVar) {
        this.f36212kowloon.add(wiremanVar);
    }
}
