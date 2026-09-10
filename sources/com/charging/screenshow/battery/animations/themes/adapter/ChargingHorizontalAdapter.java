package com.charging.screenshow.battery.animations.themes.adapter;

import A.ViewOnClickListenerC0903m;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ItemChargingHorizontalBinding;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingHorizontalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingHorizontalAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingHorizontalAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FragmentActivity f13075i;
    public final List j;
    public ChargingCategoryAdapter$onBindViewHolder$1$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingHorizontalAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingHorizontalAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemChargingHorizontalBinding f13076c;
    }

    public ChargingHorizontalAdapter(FragmentActivity ctx, List list) {
        Intrinsics.f(ctx, "ctx");
        Intrinsics.f(list, "list");
        this.f13075i = ctx;
        this.j = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List list = this.j;
        if (list.size() > 5) {
            return 5;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String thumbnail;
        final VH holder = (VH) viewHolder;
        Intrinsics.f(holder, "holder");
        List list = this.j;
        if (!list.isEmpty() && i2 < list.size()) {
            BaseMedia baseMedia = (BaseMedia) list.get(i2);
            ItemChargingHorizontalBinding itemChargingHorizontalBinding = holder.f13076c;
            if (itemChargingHorizontalBinding != null) {
                ViewExt.b(itemChargingHorizontalBinding.f13207b);
            }
            FragmentActivity fragmentActivity = this.f13075i;
            if (itemChargingHorizontalBinding != null) {
                ImageView imageView = itemChargingHorizontalBinding.f13208c;
                if (baseMedia instanceof ChargingVideo) {
                    thumbnail = ((ChargingVideo) baseMedia).i();
                } else {
                    thumbnail = baseMedia instanceof Charging3D ? ((Charging3D) baseMedia).getThumbnail() : "";
                }
                Glide.c(fragmentActivity).h(thumbnail).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ChargingHorizontalAdapter$onBindViewHolder$1$1
                    @Override // com.bumptech.glide.request.RequestListener
                    public final boolean b(Object obj) {
                        ItemChargingHorizontalBinding itemChargingHorizontalBinding2 = holder.f13076c;
                        if (itemChargingHorizontalBinding2 == null) {
                            return false;
                        }
                        ViewExt.a(itemChargingHorizontalBinding2.f13207b);
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public final boolean h(GlideException glideException) {
                        ItemChargingHorizontalBinding itemChargingHorizontalBinding2 = holder.f13076c;
                        if (itemChargingHorizontalBinding2 == null) {
                            return false;
                        }
                        ViewExt.b(itemChargingHorizontalBinding2.f13207b);
                        return false;
                    }
                }).x(imageView);
            }
            if (i2 == getItemCount() - 1) {
                if (itemChargingHorizontalBinding != null) {
                    ViewExt.b(itemChargingHorizontalBinding.d);
                }
            } else if (itemChargingHorizontalBinding != null) {
                ViewExt.a(itemChargingHorizontalBinding.d);
            }
            CardView cardView = itemChargingHorizontalBinding != null ? itemChargingHorizontalBinding.f13206a : null;
            if (cardView != null) {
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                float fB = (DeviceUtil.b(fragmentActivity) - IntExt.a(52)) / 3.5f;
                layoutParams.width = (int) fB;
                layoutParams.height = (int) (((fB * DeviceUtil.a(fragmentActivity)) / DeviceUtil.b(fragmentActivity)) * 1.0f);
                cardView.setLayoutParams(layoutParams);
                cardView.setOnClickListener(new ViewOnClickListenerC0903m(3, this, holder));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f13075i).inflate(R.layout.item_charging_horizontal, parent, false);
        int i3 = R.id.ivPlaceholder;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivPlaceholder, viewInflate);
        if (imageView != null) {
            i3 = R.id.ivWallpaper;
            ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivWallpaper, viewInflate);
            if (imageView2 != null) {
                i3 = R.id.rlCover;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.rlCover, viewInflate);
                if (relativeLayout != null) {
                    CardView cardView = (CardView) viewInflate;
                    ItemChargingHorizontalBinding itemChargingHorizontalBinding = new ItemChargingHorizontalBinding(cardView, imageView, imageView2, relativeLayout);
                    Intrinsics.e(cardView, "getRoot(...)");
                    VH vh = new VH(cardView);
                    vh.f13076c = itemChargingHorizontalBinding;
                    return vh;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
