package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ListAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements AsyncListDiffer.ListListener<T> {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        throw null;
    }
}
