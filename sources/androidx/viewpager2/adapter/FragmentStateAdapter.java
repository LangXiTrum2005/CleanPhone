package androidx.viewpager2.adapter;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$2, reason: invalid class name */
    class AnonymousClass2 extends FragmentManager.FragmentLifecycleCallbacks {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$4, reason: invalid class name */
    class AnonymousClass4 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
            throw null;
        }
    }

    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public static class FragmentEventDispatcher {
    }

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1, reason: invalid class name */
        class AnonymousClass1 extends ViewPager2.OnPageChangeCallback {
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void a(int i2) {
                throw null;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i2) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2, reason: invalid class name */
        class AnonymousClass2 extends DataSetChangeObserver {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onChanged() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3, reason: invalid class name */
        class AnonymousClass3 implements LifecycleEventObserver {
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                throw null;
            }
        }
    }

    public static abstract class FragmentTransactionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnPostEventListener f8536a = null;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$1, reason: invalid class name */
        public class AnonymousClass1 implements OnPostEventListener {
        }

        public interface OnPostEventListener {
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable a() {
        throw null;
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void b() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) viewHolder;
        fragmentViewHolder.getItemId();
        ((FrameLayout) fragmentViewHolder.itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = FragmentViewHolder.f8537c;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            ((ViewPager2) parent).f(null);
            throw null;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ((FragmentViewHolder) viewHolder).getItemId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        ((FrameLayout) ((FragmentViewHolder) viewHolder).itemView).getId();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z2) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
