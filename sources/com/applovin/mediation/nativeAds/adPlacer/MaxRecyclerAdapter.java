package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.h1;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.r0;
import com.applovin.impl.g5;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxRecyclerAdapter extends g0 implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f10407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f10408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f10410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g5 f10411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f10412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f10414h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class MaxAdRecyclerViewHolder extends h1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f10416a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f10416a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f10416a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements g5.a {
        public a() {
        }

        @Override // com.applovin.impl.g5.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f10407a.updateFillablePositions(i10, Math.min(MaxRecyclerAdapter.this.f10413g + i11, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, g0 g0Var, Activity activity) {
        b bVar = new b(this, null);
        this.f10409c = bVar;
        this.f10413g = 8;
        this.f10414h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f10407a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(g0Var.hasStableIds());
        this.f10408b = g0Var;
        g0Var.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f10408b.unregisterAdapterDataObserver(this.f10409c);
        } catch (Exception unused) {
        }
        this.f10407a.destroy();
        g5 g5Var = this.f10411e;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f10407a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f10407a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.g0
    public int getItemCount() {
        return this.f10407a.getAdjustedCount(this.f10408b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.g0
    public long getItemId(int i10) {
        if (this.f10408b.hasStableIds()) {
            return this.f10407a.isFilledPosition(i10) ? this.f10407a.getAdItemId(i10) : this.f10408b.getItemId(this.f10407a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.g0
    public int getItemViewType(int i10) {
        if (this.f10407a.isAdPosition(i10)) {
            return -42;
        }
        return this.f10408b.getItemViewType(this.f10407a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f10407a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f10407a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f10412f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f10412f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f10412f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f10412f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.g0
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f10410d = recyclerView;
        g5 g5Var = new g5(recyclerView);
        this.f10411e = g5Var;
        g5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.g0
    public void onBindViewHolder(@NonNull h1 h1Var, int i10) {
        this.f10411e.a(h1Var.itemView, i10);
        if (!this.f10407a.isAdPosition(i10)) {
            this.f10408b.onBindViewHolder(h1Var, this.f10407a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f10407a.getAdSize(i10);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) h1Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f10407a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.g0
    @NonNull
    public h1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f10408b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        r0 layoutManager = this.f10410d.getLayoutManager();
        if (layoutManager == null || !layoutManager.d()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.g0
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f10410d = null;
        g5 g5Var = this.f10411e;
        if (g5Var != null) {
            g5Var.a();
            this.f10411e = null;
        }
    }

    @Override // androidx.recyclerview.widget.g0
    public boolean onFailedToRecycleView(@NonNull h1 h1Var) {
        if (h1Var instanceof MaxAdRecyclerViewHolder) {
            return false;
        }
        return this.f10408b.onFailedToRecycleView(h1Var);
    }

    @Override // androidx.recyclerview.widget.g0
    public void onViewAttachedToWindow(@NonNull h1 h1Var) {
        if (h1Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.f10408b.onViewAttachedToWindow(h1Var);
    }

    @Override // androidx.recyclerview.widget.g0
    public void onViewDetachedFromWindow(@NonNull h1 h1Var) {
        if (h1Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.f10408b.onViewDetachedFromWindow(h1Var);
    }

    @Override // androidx.recyclerview.widget.g0
    public void onViewRecycled(@NonNull h1 h1Var) {
        g5 g5Var = this.f10411e;
        if (g5Var != null) {
            g5Var.b(h1Var.itemView);
        }
        if (!(h1Var instanceof MaxAdRecyclerViewHolder)) {
            this.f10408b.onViewRecycled(h1Var);
        } else if (this.f10407a.isFilledPosition(h1Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) h1Var).getContainerView().removeAllViews();
        }
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f10414h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.g0
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f10408b.unregisterAdapterDataObserver(this.f10409c);
        this.f10408b.setHasStableIds(z10);
        this.f10408b.registerAdapterDataObserver(this.f10409c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f10412f = listener;
    }

    public void setLookAhead(int i10) {
        this.f10413g = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends i0 {
        private b() {
        }

        @Override // androidx.recyclerview.widget.i0
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.i0
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f10407a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f10407a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.i0
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f10408b.getItemCount();
            if (MaxRecyclerAdapter.this.f10414h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f10414h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f10407a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f10407a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.i0
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.i0
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f10408b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f10414h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f10414h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f10407a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f10407a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f10407a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f10407a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f10407a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }
}
