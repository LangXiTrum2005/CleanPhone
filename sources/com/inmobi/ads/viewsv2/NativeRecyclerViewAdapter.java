package com.inmobi.ads.viewsv2;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C3049h8;
import com.inmobi.media.C3177p8;
import com.inmobi.media.D8;
import com.inmobi.media.I8;
import com.inmobi.media.L8;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0010\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/inmobi/ads/viewsv2/NativeRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/inmobi/media/I8;", "Lcom/inmobi/media/L8;", "Lcom/inmobi/media/p8;", "nativeDataModel", "Lcom/inmobi/media/D8;", "nativeLayoutInflater", "<init>", "(Lcom/inmobi/media/p8;Lcom/inmobi/media/D8;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/inmobi/media/I8;", "holder", "position", "", "onBindViewHolder", "(Lcom/inmobi/media/I8;I)V", "onViewRecycled", "(Lcom/inmobi/media/I8;)V", "Lcom/inmobi/media/h8;", "pageContainerAsset", "buildScrollableView", "(ILandroid/view/ViewGroup;Lcom/inmobi/media/h8;)Landroid/view/ViewGroup;", "getItemCount", "()I", "destroy", "()V", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NativeRecyclerViewAdapter extends RecyclerView.Adapter<I8> implements L8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3177p8 f22664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D8 f22665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f22666c;

    public NativeRecyclerViewAdapter(C3177p8 nativeDataModel, D8 nativeLayoutInflater) {
        Intrinsics.f(nativeDataModel, "nativeDataModel");
        Intrinsics.f(nativeLayoutInflater, "nativeLayoutInflater");
        this.f22664a = nativeDataModel;
        this.f22665b = nativeLayoutInflater;
        this.f22666c = new SparseArray();
    }

    public ViewGroup buildScrollableView(int position, ViewGroup parent, C3049h8 pageContainerAsset) {
        D8 d8;
        Intrinsics.f(parent, "parent");
        Intrinsics.f(pageContainerAsset, "pageContainerAsset");
        D8 d9 = this.f22665b;
        ViewGroup viewGroupA = d9 != null ? d9.a(parent, pageContainerAsset) : null;
        if (viewGroupA != null && (d8 = this.f22665b) != null) {
            d8.b(viewGroupA, pageContainerAsset);
        }
        return viewGroupA;
    }

    @Override // com.inmobi.media.L8
    public void destroy() {
        C3177p8 c3177p8 = this.f22664a;
        if (c3177p8 != null) {
            c3177p8.f23889l = null;
            c3177p8.g = null;
        }
        this.f22664a = null;
        this.f22665b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        C3177p8 c3177p8 = this.f22664a;
        if (c3177p8 != null) {
            return c3177p8.d();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(I8 holder, int position) {
        View viewBuildScrollableView;
        Intrinsics.f(holder, "holder");
        C3177p8 c3177p8 = this.f22664a;
        C3049h8 c3049h8B = c3177p8 != null ? c3177p8.b(position) : null;
        WeakReference weakReference = (WeakReference) this.f22666c.get(position);
        if (c3049h8B != null) {
            if (weakReference == null || (viewBuildScrollableView = (View) weakReference.get()) == null) {
                viewBuildScrollableView = buildScrollableView(position, holder.f22885a, c3049h8B);
            }
            if (viewBuildScrollableView != null) {
                if (position != getItemCount() - 1) {
                    holder.f22885a.setPadding(0, 0, 16, 0);
                }
                holder.f22885a.addView(viewBuildScrollableView);
                this.f22666c.put(position, new WeakReference(viewBuildScrollableView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public I8 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.f(parent, "parent");
        return new I8(new FrameLayout(parent.getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(I8 holder) {
        Intrinsics.f(holder, "holder");
        holder.f22885a.removeAllViews();
        super.onViewRecycled(holder);
    }
}
