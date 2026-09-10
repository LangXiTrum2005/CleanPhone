package com.charging.screenshow.battery.animations.themes.adapter;

import A.ViewOnClickListenerC0903m;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DAct;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DAct$initViews$1;
import com.charging.screenshow.battery.animations.themes.databinding.ItemPreviewBinding;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/Charging3DPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/Charging3DPagerAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charging3DPagerAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Charging3DAct f13066i;
    public final ArrayList j;
    public Charging3DAct$initViews$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/Charging3DPagerAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/Charging3DPagerAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemPreviewBinding f13067c;
    }

    public Charging3DPagerAdapter(Charging3DAct charging3DAct, ArrayList list) {
        Intrinsics.f(list, "list");
        this.f13066i = charging3DAct;
        this.j = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        final VH holder = (VH) viewHolder;
        Intrinsics.f(holder, "holder");
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty() && i2 < arrayList.size()) {
            Charging3D charging3D = (Charging3D) arrayList.get(i2);
            ItemPreviewBinding itemPreviewBinding = holder.f13067c;
            if (itemPreviewBinding != null) {
                ViewExt.b(itemPreviewBinding.f13223b);
            }
            String thumbnail = charging3D.getThumbnail();
            if (itemPreviewBinding != null) {
                Glide.c(this.f13066i).h(thumbnail).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.Charging3DPagerAdapter$onBindViewHolder$1$1
                    @Override // com.bumptech.glide.request.RequestListener
                    public final boolean b(Object obj) {
                        ItemPreviewBinding itemPreviewBinding2 = holder.f13067c;
                        if (itemPreviewBinding2 == null) {
                            return false;
                        }
                        ViewExt.a(itemPreviewBinding2.f13223b);
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public final boolean h(GlideException glideException) {
                        ItemPreviewBinding itemPreviewBinding2 = holder.f13067c;
                        if (itemPreviewBinding2 == null) {
                            return false;
                        }
                        ViewExt.b(itemPreviewBinding2.f13223b);
                        return false;
                    }
                }).x(itemPreviewBinding.f13224c);
            }
            FrameLayout frameLayout = itemPreviewBinding != null ? itemPreviewBinding.f13222a : null;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new ViewOnClickListenerC0903m(2, this, holder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        ItemPreviewBinding itemPreviewBindingA = ItemPreviewBinding.a(LayoutInflater.from(this.f13066i), parent);
        FrameLayout frameLayout = itemPreviewBindingA.f13222a;
        Intrinsics.e(frameLayout, "getRoot(...)");
        VH vh = new VH(frameLayout);
        vh.f13067c = itemPreviewBindingA;
        return vh;
    }
}
