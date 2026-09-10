package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    private final h0 mObservable = new h0();
    private boolean mHasStableIds = false;

    public final void bindViewHolder(@NonNull h1 h1Var, int i10) {
        h1Var.mPosition = i10;
        if (hasStableIds()) {
            h1Var.mItemId = getItemId(i10);
        }
        h1Var.setFlags(1, 519);
        Trace.beginSection("RV OnBindView");
        onBindViewHolder(h1Var, i10, h1Var.getUnmodifiedPayloads());
        h1Var.clearPayload();
        ViewGroup.LayoutParams layoutParams = h1Var.itemView.getLayoutParams();
        if (layoutParams instanceof s0) {
            ((s0) layoutParams).f4927c = true;
        }
        Trace.endSection();
    }

    @NonNull
    public final h1 createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        try {
            Trace.beginSection("RV CreateView");
            h1 h1VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
            if (h1VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            h1VarOnCreateViewHolder.mItemViewType = i10;
            Trace.endSection();
            return h1VarOnCreateViewHolder;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public abstract int getItemCount();

    public abstract long getItemId(int i10);

    public abstract int getItemViewType(int i10);

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i10) {
        this.mObservable.d(i10, 1, null);
    }

    public final void notifyItemInserted(int i10) {
        this.mObservable.e(i10, 1);
    }

    public final void notifyItemMoved(int i10, int i11) {
        this.mObservable.c(i10, i11);
    }

    public final void notifyItemRangeChanged(int i10, int i11) {
        this.mObservable.d(i10, i11, null);
    }

    public final void notifyItemRangeInserted(int i10, int i11) {
        this.mObservable.e(i10, i11);
    }

    public final void notifyItemRangeRemoved(int i10, int i11) {
        this.mObservable.f(i10, i11);
    }

    public final void notifyItemRemoved(int i10) {
        this.mObservable.f(i10, 1);
    }

    public abstract void onAttachedToRecyclerView(RecyclerView recyclerView);

    public abstract void onBindViewHolder(h1 h1Var, int i10);

    public void onBindViewHolder(@NonNull h1 h1Var, int i10, @NonNull List<Object> list) {
        onBindViewHolder(h1Var, i10);
    }

    public abstract h1 onCreateViewHolder(ViewGroup viewGroup, int i10);

    public abstract void onDetachedFromRecyclerView(RecyclerView recyclerView);

    public abstract boolean onFailedToRecycleView(h1 h1Var);

    public abstract void onViewAttachedToWindow(h1 h1Var);

    public abstract void onViewDetachedFromWindow(h1 h1Var);

    public abstract void onViewRecycled(h1 h1Var);

    public void registerAdapterDataObserver(@NonNull i0 i0Var) {
        this.mObservable.registerObserver(i0Var);
    }

    public void setHasStableIds(boolean z10) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z10;
    }

    public void unregisterAdapterDataObserver(@NonNull i0 i0Var) {
        this.mObservable.unregisterObserver(i0Var);
    }

    public final void notifyItemChanged(int i10, @Nullable Object obj) {
        this.mObservable.d(i10, 1, obj);
    }

    public final void notifyItemRangeChanged(int i10, int i11, @Nullable Object obj) {
        this.mObservable.d(i10, i11, obj);
    }
}
