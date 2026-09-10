package com.charging.screenshow.battery.animations.themes.adapter;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.ChargingCategoryDetailAct;
import com.charging.screenshow.battery.animations.themes.activity.ChargingCategoryDetailAct$initViews$1;
import com.charging.screenshow.battery.animations.themes.databinding.ItemChargingBinding;
import com.charging.screenshow.battery.animations.themes.download.DownloadUtil;
import com.charging.screenshow.battery.animations.themes.entity.BaseMedia;
import com.charging.screenshow.battery.animations.themes.entity.Charging3D;
import com.charging.screenshow.battery.animations.themes.entity.Layer3D;
import com.charging.screenshow.battery.animations.themes.network.entity.ChargingVideo;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import h.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChargingAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ChargingCategoryDetailAct f13068i;
    public final ArrayList j;
    public ChargingCategoryDetailAct$initViews$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ChargingAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemChargingBinding f13069c;
    }

    public ChargingAdapter(ChargingCategoryDetailAct chargingCategoryDetailAct, ArrayList list) {
        Intrinsics.f(list, "list");
        this.f13068i = chargingCategoryDetailAct;
        this.j = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.size();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        final VH holder = (VH) viewHolder;
        Intrinsics.f(holder, "holder");
        ArrayList arrayList = this.j;
        if (!arrayList.isEmpty() && i2 < arrayList.size()) {
            BaseMedia baseMedia = (BaseMedia) arrayList.get(i2);
            ItemChargingBinding itemChargingBinding = holder.f13069c;
            if (itemChargingBinding != null) {
                ViewExt.b(itemChargingBinding.d);
            }
            boolean z2 = baseMedia instanceof ChargingVideo;
            AppPreferencesUtil appPreferencesUtil = AppPreferencesUtil.f13313a;
            ChargingCategoryDetailAct chargingCategoryDetailAct = this.f13068i;
            if (z2) {
                if (itemChargingBinding != null) {
                    Glide.c(chargingCategoryDetailAct).h(((ChargingVideo) baseMedia).i()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ChargingAdapter$onBindViewHolder$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemChargingBinding itemChargingBinding2 = holder.f13069c;
                            if (itemChargingBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemChargingBinding2.d);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemChargingBinding itemChargingBinding2 = holder.f13069c;
                            if (itemChargingBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemChargingBinding2.d);
                            return false;
                        }
                    }).x(itemChargingBinding.f13202e);
                }
                ChargingVideo chargingVideo = (ChargingVideo) baseMedia;
                if (DownloadUtil.c(chargingVideo.k(), chargingVideo.h())) {
                    if (itemChargingBinding != null) {
                        ViewExt.a(itemChargingBinding.f13200b);
                    }
                } else if (itemChargingBinding != null) {
                    ViewExt.b(itemChargingBinding.f13200b);
                }
                String name = baseMedia.getName();
                String string = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getString("current_charging_video_name", "");
                if (TextUtils.equals(name, string != null ? string : "")) {
                    if (itemChargingBinding != null) {
                        ViewExt.b(itemChargingBinding.f13201c);
                    }
                } else if (itemChargingBinding != null) {
                    ViewExt.a(itemChargingBinding.f13201c);
                }
            } else if (baseMedia instanceof Charging3D) {
                if (itemChargingBinding != null) {
                    Glide.c(chargingCategoryDetailAct).h(((Charging3D) baseMedia).getThumbnail()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ChargingAdapter$onBindViewHolder$2$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemChargingBinding itemChargingBinding2 = holder.f13069c;
                            if (itemChargingBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemChargingBinding2.d);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemChargingBinding itemChargingBinding2 = holder.f13069c;
                            if (itemChargingBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemChargingBinding2.d);
                            return false;
                        }
                    }).x(itemChargingBinding.f13202e);
                }
                Charging3D charging3D = (Charging3D) baseMedia;
                if (charging3D.getPictures() != null) {
                    Layer3D pictures = charging3D.getPictures();
                    Intrinsics.c(pictures);
                    if (DownloadUtil.c(pictures.getLayer1(), charging3D.getName()) && DownloadUtil.c(pictures.getLayer2(), charging3D.getName()) && DownloadUtil.c(pictures.getLayer3(), charging3D.getName())) {
                        if (itemChargingBinding != null) {
                            ViewExt.a(itemChargingBinding.f13200b);
                        }
                    } else if (itemChargingBinding != null) {
                        ViewExt.b(itemChargingBinding.f13200b);
                    }
                } else if (itemChargingBinding != null) {
                    ViewExt.a(itemChargingBinding.f13200b);
                }
                String name2 = baseMedia.getName();
                String string2 = AppPreferencesUtil.a(appPreferencesUtil, AppExt.a()).getString("current_charging_video_name", "");
                if (TextUtils.equals(name2, string2 != null ? string2 : "")) {
                    if (itemChargingBinding != null) {
                        ViewExt.b(itemChargingBinding.f13201c);
                    }
                } else if (itemChargingBinding != null) {
                    ViewExt.a(itemChargingBinding.f13201c);
                }
            }
            CardView cardView = itemChargingBinding != null ? itemChargingBinding.f13199a : null;
            if (cardView != null) {
                cardView.setOnClickListener(new a(this, i2, 0));
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                float fB = (DeviceUtil.b(chargingCategoryDetailAct) - IntExt.a(36)) / 2.0f;
                layoutParams.width = (int) fB;
                layoutParams.height = (int) (((fB * 16) / 9) * 1.0f);
                cardView.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f13068i).inflate(R.layout.item_charging, parent, false);
        int i3 = R.id.ivDownload;
        ImageView imageView = (ImageView) ViewBindings.a(R.id.ivDownload, viewInflate);
        if (imageView != null) {
            i3 = R.id.ivGou;
            ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivGou, viewInflate);
            if (imageView2 != null) {
                i3 = R.id.ivPlaceholder;
                ImageView imageView3 = (ImageView) ViewBindings.a(R.id.ivPlaceholder, viewInflate);
                if (imageView3 != null) {
                    i3 = R.id.ivWallpaper;
                    ImageView imageView4 = (ImageView) ViewBindings.a(R.id.ivWallpaper, viewInflate);
                    if (imageView4 != null) {
                        CardView cardView = (CardView) viewInflate;
                        ItemChargingBinding itemChargingBinding = new ItemChargingBinding(cardView, imageView, imageView2, imageView3, imageView4);
                        Intrinsics.e(cardView, "getRoot(...)");
                        VH vh = new VH(cardView);
                        vh.f13069c = itemChargingBinding;
                        return vh;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
