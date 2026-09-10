package crosspiece;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.gintrap;
import androidx.core.view.premeiotic;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.seminary;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.impassible;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import technofreak.cutely;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal extends RecyclerView.Adapter<crosspiece.saneness> implements crosspiece.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Lifecycle f24183attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public competently f24184beachfront;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final FragmentManager f24189saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final gintrap<Fragment> f24186dern = new gintrap<>();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final gintrap<Fragment.SavedState> f24191wireman = new gintrap<>();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final gintrap<Integer> f24188marial = new gintrap<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public beachfront f24185competently = new beachfront();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f24187impromptu = false;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f24190taiyuan = false;

    /* JADX INFO: renamed from: crosspiece.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public class C0573attabal implements impassible {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ crosspiece.saneness f24193kowloon;

        public C0573attabal(crosspiece.saneness sanenessVar) {
            this.f24193kowloon = sanenessVar;
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
            if (attabal.this.dovishness()) {
                return;
            }
            arytenoidectomyVar.getLifecycle().wireman(this);
            if (premeiotic.starveling(this.f24193kowloon.saneness())) {
                attabal.this.polloi(this.f24193kowloon);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public static class beachfront {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public List<impromptu> f24194attabal = new CopyOnWriteArrayList();

        public List<impromptu.saneness> attabal(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            Iterator<impromptu> it = this.f24194attabal.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().attabal(fragment, state));
            }
            return arrayList;
        }

        public List<impromptu.saneness> dern(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<impromptu> it = this.f24194attabal.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().saneness(fragment));
            }
            return arrayList;
        }

        public List<impromptu.saneness> marial(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<impromptu> it = this.f24194attabal.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().wireman(fragment));
            }
            return arrayList;
        }

        public void saneness(List<impromptu.saneness> list) {
            Iterator<impromptu.saneness> it = list.iterator();
            while (it.hasNext()) {
                it.next().attabal();
            }
        }

        public List<impromptu.saneness> wireman(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<impromptu> it = this.f24194attabal.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().dern(fragment));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public ViewPager2.taiyuan f24195attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public impassible f24197dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f24198marial = -1;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public RecyclerView.taiyuan f24199saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ViewPager2 f24200wireman;

        /* JADX INFO: renamed from: crosspiece.attabal$competently$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FragmentStateAdapter.java */
        public class C0574attabal extends ViewPager2.taiyuan {
            public C0574attabal() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
            public void attabal(int i) {
                competently.this.wireman(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.taiyuan
            public void dern(int i) {
                competently.this.wireman(false);
            }
        }

        /* JADX INFO: compiled from: FragmentStateAdapter.java */
        public class dern implements impassible {
            public dern() {
            }

            @Override // androidx.p001lifecycle.impassible
            public void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                competently.this.wireman(false);
            }
        }

        /* JADX INFO: compiled from: FragmentStateAdapter.java */
        public class saneness extends marial {
            public saneness() {
                super(null);
            }

            @Override // crosspiece.attabal.marial, androidx.recyclerview.widget.RecyclerView.taiyuan
            public void onChanged() {
                competently.this.wireman(true);
            }
        }

        public competently() {
        }

        public final ViewPager2 attabal(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void dern(RecyclerView recyclerView) {
            attabal(recyclerView).impassible(this.f24195attabal);
            attabal.this.unregisterAdapterDataObserver(this.f24199saneness);
            attabal.this.f24183attabal.wireman(this.f24197dern);
            this.f24200wireman = null;
        }

        public void saneness(RecyclerView recyclerView) {
            this.f24200wireman = attabal(recyclerView);
            C0574attabal c0574attabal = new C0574attabal();
            this.f24195attabal = c0574attabal;
            this.f24200wireman.competently(c0574attabal);
            saneness sanenessVar = new saneness();
            this.f24199saneness = sanenessVar;
            attabal.this.registerAdapterDataObserver(sanenessVar);
            dern dernVar = new dern();
            this.f24197dern = dernVar;
            attabal.this.f24183attabal.attabal(dernVar);
        }

        public void wireman(boolean z) {
            int currentItem;
            Fragment fragmentMarial;
            if (attabal.this.dovishness() || this.f24200wireman.getScrollState() != 0 || attabal.this.f24186dern.competently() || attabal.this.getItemCount() == 0 || (currentItem = this.f24200wireman.getCurrentItem()) >= attabal.this.getItemCount()) {
                return;
            }
            long itemId = attabal.this.getItemId(currentItem);
            if ((itemId != this.f24198marial || z) && (fragmentMarial = attabal.this.f24186dern.marial(itemId)) != null && fragmentMarial.isAdded()) {
                this.f24198marial = itemId;
                seminary seminaryVarPolloi = attabal.this.f24189saneness.polloi();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i = 0; i < attabal.this.f24186dern.impassible(); i++) {
                    long jImpromptu = attabal.this.f24186dern.impromptu(i);
                    Fragment fragmentTriweekly = attabal.this.f24186dern.triweekly(i);
                    if (fragmentTriweekly.isAdded()) {
                        if (jImpromptu != this.f24198marial) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            seminaryVarPolloi.molybdenite(fragmentTriweekly, state);
                            arrayList.add(attabal.this.f24185competently.attabal(fragmentTriweekly, state));
                        } else {
                            fragment = fragmentTriweekly;
                        }
                        fragmentTriweekly.setMenuVisibility(jImpromptu == this.f24198marial);
                    }
                }
                if (fragment != null) {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    seminaryVarPolloi.molybdenite(fragment, state2);
                    arrayList.add(attabal.this.f24185competently.attabal(fragment, state2));
                }
                if (seminaryVarPolloi.triweekly()) {
                    return;
                }
                seminaryVarPolloi.taiyuan();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    attabal.this.f24185competently.saneness((List) it.next());
                }
            }
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public class dern implements Runnable {
        public dern() {
        }

        @Override // java.lang.Runnable
        public void run() {
            attabal attabalVar = attabal.this;
            attabalVar.f24187impromptu = false;
            attabalVar.impromptu();
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public static abstract class marial extends RecyclerView.taiyuan {
        public marial() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ marial(C0573attabal c0573attabal) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.taiyuan
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public class saneness extends FragmentManager.formularize {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Fragment f24206attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f24208saneness;

        public saneness(Fragment fragment, FrameLayout frameLayout) {
            this.f24206attabal = fragment;
            this.f24208saneness = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.formularize
        public void impassible(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f24206attabal) {
                fragmentManager.homophylic(this);
                attabal.this.dern(view, this.f24208saneness);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public class wireman implements impassible {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Runnable f24209arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Handler f24210kowloon;

        public wireman(Handler handler, Runnable runnable) {
            this.f24210kowloon = handler;
            this.f24209arytenoidectomy = runnable;
        }

        @Override // androidx.p001lifecycle.impassible
        public void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f24210kowloon.removeCallbacks(this.f24209arytenoidectomy);
                arytenoidectomyVar.getLifecycle().wireman(this);
            }
        }
    }

    public attabal(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.f24189saneness = fragmentManager;
        this.f24183attabal = lifecycle;
        super.setHasStableIds(true);
    }

    public static String beachfront(String str, long j) {
        return str + j;
    }

    public static boolean cutely(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public static long monoploid(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    public final void adultoid(Fragment fragment, FrameLayout frameLayout) {
        this.f24189saneness.vir(new saneness(fragment, frameLayout), false);
    }

    public final Long apical(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f24188marial.impassible(); i2++) {
            if (this.f24188marial.triweekly(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f24188marial.impromptu(i2));
            }
        }
        return lValueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(crosspiece.saneness sanenessVar) {
        Long lApical = apical(sanenessVar.saneness().getId());
        if (lApical != null) {
            molybdenite(lApical.longValue());
            this.f24188marial.apical(lApical.longValue());
        }
    }

    @Override // crosspiece.dern
    public final Parcelable attabal() {
        Bundle bundle = new Bundle(this.f24186dern.impassible() + this.f24191wireman.impassible());
        for (int i = 0; i < this.f24186dern.impassible(); i++) {
            long jImpromptu = this.f24186dern.impromptu(i);
            Fragment fragmentMarial = this.f24186dern.marial(jImpromptu);
            if (fragmentMarial != null && fragmentMarial.isAdded()) {
                this.f24189saneness.liable(bundle, beachfront("f#", jImpromptu), fragmentMarial);
            }
        }
        for (int i2 = 0; i2 < this.f24191wireman.impassible(); i2++) {
            long jImpromptu2 = this.f24191wireman.impromptu(i2);
            if (wireman(jImpromptu2)) {
                bundle.putParcelable(beachfront("s#", jImpromptu2), this.f24191wireman.marial(jImpromptu2));
            }
        }
        return bundle;
    }

    public final void competently(int i) {
        long itemId = getItemId(i);
        if (this.f24186dern.wireman(itemId)) {
            return;
        }
        Fragment fragmentMarial = marial(i);
        fragmentMarial.setInitialSavedState(this.f24191wireman.marial(itemId));
        this.f24186dern.taiyuan(itemId, fragmentMarial);
    }

    public void dern(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean dovishness() {
        return this.f24189saneness.osteal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(crosspiece.saneness sanenessVar, int i) {
        long itemId = sanenessVar.getItemId();
        int id = sanenessVar.saneness().getId();
        Long lApical = apical(id);
        if (lApical != null && lApical.longValue() != itemId) {
            molybdenite(lApical.longValue());
            this.f24188marial.apical(lApical.longValue());
        }
        this.f24188marial.taiyuan(itemId, Integer.valueOf(id));
        competently(i);
        if (premeiotic.starveling(sanenessVar.saneness())) {
            polloi(sanenessVar);
        }
        impromptu();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public final void graveside() {
        Handler handler = new Handler(Looper.getMainLooper());
        dern dernVar = new dern();
        this.f24183attabal.attabal(new wireman(handler, dernVar));
        handler.postDelayed(dernVar, Ua.s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public final crosspiece.saneness onCreateViewHolder(ViewGroup viewGroup, int i) {
        return crosspiece.saneness.attabal(viewGroup);
    }

    public void impromptu() {
        if (!this.f24190taiyuan || dovishness()) {
            return;
        }
        androidx.collection.saneness sanenessVar = new androidx.collection.saneness();
        for (int i = 0; i < this.f24186dern.impassible(); i++) {
            long jImpromptu = this.f24186dern.impromptu(i);
            if (!wireman(jImpromptu)) {
                sanenessVar.add(Long.valueOf(jImpromptu));
                this.f24188marial.apical(jImpromptu);
            }
        }
        if (!this.f24187impromptu) {
            this.f24190taiyuan = false;
            for (int i2 = 0; i2 < this.f24186dern.impassible(); i2++) {
                long jImpromptu2 = this.f24186dern.impromptu(i2);
                if (!taiyuan(jImpromptu2)) {
                    sanenessVar.add(Long.valueOf(jImpromptu2));
                }
            }
        }
        Iterator<E> it = sanenessVar.iterator();
        while (it.hasNext()) {
            molybdenite(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(crosspiece.saneness sanenessVar) {
        polloi(sanenessVar);
        impromptu();
    }

    public abstract Fragment marial(int i);

    public final void molybdenite(long j) {
        ViewParent parent;
        Fragment fragmentMarial = this.f24186dern.marial(j);
        if (fragmentMarial == null) {
            return;
        }
        if (fragmentMarial.getView() != null && (parent = fragmentMarial.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!wireman(j)) {
            this.f24191wireman.apical(j);
        }
        if (!fragmentMarial.isAdded()) {
            this.f24186dern.apical(j);
            return;
        }
        if (dovishness()) {
            this.f24190taiyuan = true;
            return;
        }
        if (fragmentMarial.isAdded() && wireman(j)) {
            List<impromptu.saneness> listMarial = this.f24185competently.marial(fragmentMarial);
            Fragment.SavedState utVar = this.f24189saneness.tout(fragmentMarial);
            this.f24185competently.saneness(listMarial);
            this.f24191wireman.taiyuan(j, utVar);
        }
        List<impromptu.saneness> listWireman = this.f24185competently.wireman(fragmentMarial);
        try {
            this.f24189saneness.polloi().kowloon(fragmentMarial).taiyuan();
            this.f24186dern.apical(j);
        } finally {
            this.f24185competently.saneness(listWireman);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        cutely.attabal(this.f24184beachfront == null);
        competently competentlyVar = new competently();
        this.f24184beachfront = competentlyVar;
        competentlyVar.saneness(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f24184beachfront.dern(recyclerView);
        this.f24184beachfront = null;
    }

    public void polloi(crosspiece.saneness sanenessVar) {
        Fragment fragmentMarial = this.f24186dern.marial(sanenessVar.getItemId());
        if (fragmentMarial == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutSaneness = sanenessVar.saneness();
        View view = fragmentMarial.getView();
        if (!fragmentMarial.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentMarial.isAdded() && view == null) {
            adultoid(fragmentMarial, frameLayoutSaneness);
            return;
        }
        if (fragmentMarial.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutSaneness) {
                dern(view, frameLayoutSaneness);
                return;
            }
            return;
        }
        if (fragmentMarial.isAdded()) {
            dern(view, frameLayoutSaneness);
            return;
        }
        if (dovishness()) {
            if (this.f24189saneness.libyan()) {
                return;
            }
            this.f24183attabal.attabal(new C0573attabal(sanenessVar));
            return;
        }
        adultoid(fragmentMarial, frameLayoutSaneness);
        List<impromptu.saneness> listDern = this.f24185competently.dern(fragmentMarial);
        try {
            fragmentMarial.setMenuVisibility(false);
            this.f24189saneness.polloi().wireman(fragmentMarial, "f" + sanenessVar.getItemId()).molybdenite(fragmentMarial, Lifecycle.State.STARTED).taiyuan();
            this.f24184beachfront.wireman(false);
        } finally {
            this.f24185competently.saneness(listDern);
        }
    }

    @Override // crosspiece.dern
    public final void saneness(Parcelable parcelable) {
        if (!this.f24191wireman.competently() || !this.f24186dern.competently()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (cutely(str, "f#")) {
                this.f24186dern.taiyuan(monoploid(str, "f#"), this.f24189saneness.monroe(bundle, str));
            } else {
                if (!cutely(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jMonoploid = monoploid(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (wireman(jMonoploid)) {
                    this.f24191wireman.taiyuan(jMonoploid, savedState);
                }
            }
        }
        if (this.f24186dern.competently()) {
            return;
        }
        this.f24190taiyuan = true;
        this.f24187impromptu = true;
        impromptu();
        graveside();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public final boolean taiyuan(long j) {
        View view;
        if (this.f24188marial.wireman(j)) {
            return true;
        }
        Fragment fragmentMarial = this.f24186dern.marial(j);
        return (fragmentMarial == null || (view = fragmentMarial.getView()) == null || view.getParent() == null) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(crosspiece.saneness sanenessVar) {
        return true;
    }

    public boolean wireman(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* JADX INFO: compiled from: FragmentStateAdapter.java */
    public static abstract class impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f24205attabal = new C0575attabal();

        /* JADX INFO: compiled from: FragmentStateAdapter.java */
        public interface saneness {
            void attabal();
        }

        public saneness attabal(Fragment fragment, Lifecycle.State state) {
            return f24205attabal;
        }

        public saneness dern(Fragment fragment) {
            return f24205attabal;
        }

        public saneness saneness(Fragment fragment) {
            return f24205attabal;
        }

        public saneness wireman(Fragment fragment) {
            return f24205attabal;
        }

        /* JADX INFO: renamed from: crosspiece.attabal$impromptu$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FragmentStateAdapter.java */
        public class C0575attabal implements saneness {
            @Override // crosspiece.attabal.impromptu.saneness
            public void attabal() {
            }
        }
    }
}
