package com.charging.screenshow.battery.animations.themes.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ItemImageBinding;
import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import h.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageGridAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/ImageGridAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageGridAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FragmentActivity f13079i;
    public final ArrayList j;
    public OnItemClickListener k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageGridAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
        void a(int i2);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageGridAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemImageBinding f13080c;
    }

    public ImageGridAdapter(FragmentActivity fragmentActivity, ArrayList list) {
        Intrinsics.f(list, "list");
        this.f13079i = fragmentActivity;
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
            ItemImageBinding itemImageBinding = holder.f13080c;
            FrameLayout frameLayout = itemImageBinding != null ? itemImageBinding.f13209a : null;
            FragmentActivity fragmentActivity = this.f13079i;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new a(this, i2, 1));
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                float fB = (DeviceUtil.b(fragmentActivity) - IntExt.a(8)) / 3.0f;
                layoutParams.width = (int) fB;
                layoutParams.height = (int) (((fB * DeviceUtil.a(fragmentActivity)) / DeviceUtil.b(fragmentActivity)) * 1.0f);
                frameLayout.setLayoutParams(layoutParams);
            }
            if (arrayList.get(i2) instanceof Image) {
                Object obj = arrayList.get(i2);
                Intrinsics.d(obj, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.network.entity.Image");
                Image image = (Image) obj;
                if (itemImageBinding != null) {
                    ViewExt.b(itemImageBinding.f13210b);
                }
                if (itemImageBinding != null) {
                    Glide.c(fragmentActivity).h(image.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageGridAdapter$onBindViewHolder$2$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj2) {
                            ItemImageBinding itemImageBinding2 = holder.f13080c;
                            if (itemImageBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageBinding2.f13210b);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageBinding itemImageBinding2 = holder.f13080c;
                            if (itemImageBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageBinding2.f13210b);
                            return false;
                        }
                    }).x(itemImageBinding.f13211c);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f13079i).inflate(R.layout.item_image, parent, false);
        int i3 = R.id.ivPlaceholder;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivPlaceholder, viewInflate);
        if (imageView != null) {
            i3 = R.id.ivWallpaper;
            ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivWallpaper, viewInflate);
            if (imageView2 != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                ItemImageBinding itemImageBinding = new ItemImageBinding(frameLayout, imageView, imageView2);
                Intrinsics.e(frameLayout, "getRoot(...)");
                VH vh = new VH(frameLayout);
                vh.f13080c = itemImageBinding;
                return vh;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
