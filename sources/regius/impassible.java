package regius;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p001lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Lifecycle, com.bumptech.glide.impromptu> f36194attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon.saneness f36195saneness;

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public final class saneness implements arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final FragmentManager f36198attabal;

        public saneness(FragmentManager fragmentManager) {
            this.f36198attabal = fragmentManager;
        }

        @Override // regius.arytenoidectomy
        public Set<com.bumptech.glide.impromptu> attabal() {
            HashSet hashSet = new HashSet();
            saneness(this.f36198attabal, hashSet);
            return hashSet;
        }

        public final void saneness(FragmentManager fragmentManager, Set<com.bumptech.glide.impromptu> set) {
            List<Fragment> listUnconsolidated = fragmentManager.unconsolidated();
            int size = listUnconsolidated.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = listUnconsolidated.get(i);
                saneness(fragment.getChildFragmentManager(), set);
                com.bumptech.glide.impromptu impromptuVarAttabal = impassible.this.attabal(fragment.getLifecycle());
                if (impromptuVarAttabal != null) {
                    set.add(impromptuVarAttabal);
                }
            }
        }
    }

    public impassible(kowloon.saneness sanenessVar) {
        this.f36195saneness = sanenessVar;
    }

    public com.bumptech.glide.impromptu attabal(Lifecycle lifecycle) {
        com.bumptech.glide.util.formularize.saneness();
        return this.f36194attabal.get(lifecycle);
    }

    public com.bumptech.glide.impromptu saneness(Context context, com.bumptech.glide.saneness sanenessVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        com.bumptech.glide.util.formularize.saneness();
        com.bumptech.glide.impromptu impromptuVarAttabal = attabal(lifecycle);
        if (impromptuVarAttabal != null) {
            return impromptuVarAttabal;
        }
        apical apicalVar = new apical(lifecycle);
        com.bumptech.glide.impromptu impromptuVarAttabal2 = this.f36195saneness.attabal(sanenessVar, apicalVar, new saneness(fragmentManager), context);
        this.f36194attabal.put(lifecycle, impromptuVarAttabal2);
        apicalVar.saneness(new attabal(lifecycle));
        if (z) {
            impromptuVarAttabal2.onStart();
        }
        return impromptuVarAttabal2;
    }

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public class attabal implements formularize {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f36197kowloon;

        public attabal(Lifecycle lifecycle) {
            this.f36197kowloon = lifecycle;
        }

        @Override // regius.formularize
        public void onDestroy() {
            impassible.this.f36194attabal.remove(this.f36197kowloon);
        }

        @Override // regius.formularize
        public void onStart() {
        }

        @Override // regius.formularize
        public void onStop() {
        }
    }
}
