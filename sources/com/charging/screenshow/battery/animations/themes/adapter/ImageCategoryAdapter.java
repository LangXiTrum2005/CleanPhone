package com.charging.screenshow.battery.animations.themes.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.ItemImageCategoryBinding;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryFrag$initViews$1;
import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.charging.screenshow.battery.animations.themes.utils.DeviceUtil;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/charging/screenshow/battery/animations/themes/adapter/ImageCategoryAdapter$VH;", "OnItemClickListener", "VH", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryAdapter extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FragmentActivity f13077i;
    public final ArrayList j;
    public ImageCategoryFrag$initViews$1 k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageCategoryAdapter$OnItemClickListener;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemClickListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/adapter/ImageCategoryAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VH extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ItemImageCategoryBinding f13078c;
    }

    public ImageCategoryAdapter(FragmentActivity fragmentActivity, ArrayList list) {
        Intrinsics.f(list, "list");
        this.f13077i = fragmentActivity;
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
            ImageCategoryBean imageCategoryBean = (ImageCategoryBean) arrayList.get(i2);
            ItemImageCategoryBinding itemImageCategoryBinding = holder.f13078c;
            if (itemImageCategoryBinding != null) {
                itemImageCategoryBinding.f13221u.setText(imageCategoryBean.get_title());
            }
            if (itemImageCategoryBinding != null) {
                final int i3 = 0;
                ViewExt.c(itemImageCategoryBinding.t, new Function1(this) { // from class: h.b

                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                    public final /* synthetic */ ImageCategoryAdapter f42943Y;

                    {
                        this.f42943Y = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i3) {
                            case 0:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$1 != null) {
                                    imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                }
                                break;
                            case 1:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$2 != null) {
                                    imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                }
                                break;
                            case 2:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$3 != null) {
                                    imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                }
                                break;
                            case 3:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$4 != null) {
                                    imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                }
                                break;
                            case 4:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$5 != null) {
                                    imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                }
                                break;
                            case 5:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$6 != null) {
                                    imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                }
                                break;
                            default:
                                Intrinsics.f(it, "it");
                                ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                if (imageCategoryFrag$initViews$7 != null) {
                                    imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                }
                                break;
                        }
                        return Unit.f43263a;
                    }
                });
            }
            Image image = (Image) imageCategoryBean.get_list().get(0);
            FragmentActivity fragmentActivity = this.f13077i;
            if (image != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.f13216h);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$2$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.f13216h);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.f13216h);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.f13219n);
                }
                if (itemImageCategoryBinding != null) {
                    final int i4 = 1;
                    ViewExt.c(itemImageCategoryBinding.f13213b, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i4) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            Image image2 = (Image) imageCategoryBean.get_list().get(1);
            if (image2 != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.f13217i);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image2.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$3$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.f13217i);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.f13217i);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.o);
                }
                if (itemImageCategoryBinding != null) {
                    final int i5 = 2;
                    ViewExt.c(itemImageCategoryBinding.f13214c, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i5) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            Image image3 = (Image) imageCategoryBean.get_list().get(2);
            if (image3 != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.j);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image3.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$4$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.j);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.j);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.f13220p);
                }
                if (itemImageCategoryBinding != null) {
                    final int i6 = 3;
                    ViewExt.c(itemImageCategoryBinding.d, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i6) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            Image image4 = (Image) imageCategoryBean.get_list().get(3);
            if (image4 != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.k);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image4.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$5$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.k);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.k);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.q);
                }
                if (itemImageCategoryBinding != null) {
                    final int i7 = 4;
                    ViewExt.c(itemImageCategoryBinding.f13215e, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i7) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            Image image5 = (Image) imageCategoryBean.get_list().get(4);
            if (image5 != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.f13218l);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image5.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$6$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.f13218l);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.f13218l);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.r);
                }
                if (itemImageCategoryBinding != null) {
                    final int i8 = 5;
                    ViewExt.c(itemImageCategoryBinding.f, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i8) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            Image image6 = (Image) imageCategoryBean.get_list().get(5);
            if (image6 != null) {
                if (itemImageCategoryBinding != null) {
                    ViewExt.b(itemImageCategoryBinding.m);
                }
                if (itemImageCategoryBinding != null) {
                    Glide.c(fragmentActivity).h(image6.getVariations().getPreviewSmall().getUrl()).B(DrawableTransitionOptions.c()).z(new RequestListener<Drawable>() { // from class: com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter$onBindViewHolder$7$1$1
                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean b(Object obj) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.a(itemImageCategoryBinding2.m);
                            return false;
                        }

                        @Override // com.bumptech.glide.request.RequestListener
                        public final boolean h(GlideException glideException) {
                            ItemImageCategoryBinding itemImageCategoryBinding2 = holder.f13078c;
                            if (itemImageCategoryBinding2 == null) {
                                return false;
                            }
                            ViewExt.b(itemImageCategoryBinding2.m);
                            return false;
                        }
                    }).x(itemImageCategoryBinding.s);
                }
                if (itemImageCategoryBinding != null) {
                    final int i9 = 6;
                    ViewExt.c(itemImageCategoryBinding.g, new Function1(this) { // from class: h.b

                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                        public final /* synthetic */ ImageCategoryAdapter f42943Y;

                        {
                            this.f42943Y = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i9) {
                                case 0:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$1 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$1 != null) {
                                        imageCategoryFrag$initViews$1.a(holder.getAdapterPosition());
                                    }
                                    break;
                                case 1:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$2 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$2 != null) {
                                        imageCategoryFrag$initViews$2.b(holder.getAdapterPosition(), 0);
                                    }
                                    break;
                                case 2:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$3 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$3 != null) {
                                        imageCategoryFrag$initViews$3.b(holder.getAdapterPosition(), 1);
                                    }
                                    break;
                                case 3:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$4 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$4 != null) {
                                        imageCategoryFrag$initViews$4.b(holder.getAdapterPosition(), 2);
                                    }
                                    break;
                                case 4:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$5 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$5 != null) {
                                        imageCategoryFrag$initViews$5.b(holder.getAdapterPosition(), 3);
                                    }
                                    break;
                                case 5:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$6 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$6 != null) {
                                        imageCategoryFrag$initViews$6.b(holder.getAdapterPosition(), 4);
                                    }
                                    break;
                                default:
                                    Intrinsics.f(it, "it");
                                    ImageCategoryFrag$initViews$1 imageCategoryFrag$initViews$7 = this.f42943Y.k;
                                    if (imageCategoryFrag$initViews$7 != null) {
                                        imageCategoryFrag$initViews$7.a(holder.getAdapterPosition());
                                    }
                                    break;
                            }
                            return Unit.f43263a;
                        }
                    });
                }
            }
            LinearLayout linearLayout = itemImageCategoryBinding != null ? itemImageCategoryBinding.f13212a : null;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                int iB = DeviceUtil.b(fragmentActivity);
                layoutParams.width = iB;
                layoutParams.height = (int) (((DeviceUtil.a(fragmentActivity) * iB) / DeviceUtil.b(fragmentActivity)) * 1.0f);
                linearLayout.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.f(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f13077i).inflate(R.layout.item_image_category, parent, false);
        int i3 = R.id.c1;
        CardView cardView = (CardView) ViewBindings.a(R.id.c1, viewInflate);
        if (cardView != null) {
            i3 = R.id.c2;
            CardView cardView2 = (CardView) ViewBindings.a(R.id.c2, viewInflate);
            if (cardView2 != null) {
                i3 = R.id.c3;
                CardView cardView3 = (CardView) ViewBindings.a(R.id.c3, viewInflate);
                if (cardView3 != null) {
                    i3 = R.id.c4;
                    CardView cardView4 = (CardView) ViewBindings.a(R.id.c4, viewInflate);
                    if (cardView4 != null) {
                        i3 = R.id.c5;
                        CardView cardView5 = (CardView) ViewBindings.a(R.id.c5, viewInflate);
                        if (cardView5 != null) {
                            i3 = R.id.c6;
                            CardView cardView6 = (CardView) ViewBindings.a(R.id.c6, viewInflate);
                            if (cardView6 != null) {
                                i3 = R.id.ivPlaceholder1;
                                ImageView imageView = (ImageView) ViewBindings.a(R.id.ivPlaceholder1, viewInflate);
                                if (imageView != null) {
                                    i3 = R.id.ivPlaceholder2;
                                    ImageView imageView2 = (ImageView) ViewBindings.a(R.id.ivPlaceholder2, viewInflate);
                                    if (imageView2 != null) {
                                        i3 = R.id.ivPlaceholder3;
                                        ImageView imageView3 = (ImageView) ViewBindings.a(R.id.ivPlaceholder3, viewInflate);
                                        if (imageView3 != null) {
                                            i3 = R.id.ivPlaceholder4;
                                            ImageView imageView4 = (ImageView) ViewBindings.a(R.id.ivPlaceholder4, viewInflate);
                                            if (imageView4 != null) {
                                                i3 = R.id.ivPlaceholder5;
                                                ImageView imageView5 = (ImageView) ViewBindings.a(R.id.ivPlaceholder5, viewInflate);
                                                if (imageView5 != null) {
                                                    i3 = R.id.ivPlaceholder6;
                                                    ImageView imageView6 = (ImageView) ViewBindings.a(R.id.ivPlaceholder6, viewInflate);
                                                    if (imageView6 != null) {
                                                        i3 = R.id.ivWallpaper1;
                                                        ImageView imageView7 = (ImageView) ViewBindings.a(R.id.ivWallpaper1, viewInflate);
                                                        if (imageView7 != null) {
                                                            i3 = R.id.ivWallpaper2;
                                                            ImageView imageView8 = (ImageView) ViewBindings.a(R.id.ivWallpaper2, viewInflate);
                                                            if (imageView8 != null) {
                                                                i3 = R.id.ivWallpaper3;
                                                                ImageView imageView9 = (ImageView) ViewBindings.a(R.id.ivWallpaper3, viewInflate);
                                                                if (imageView9 != null) {
                                                                    i3 = R.id.ivWallpaper4;
                                                                    ImageView imageView10 = (ImageView) ViewBindings.a(R.id.ivWallpaper4, viewInflate);
                                                                    if (imageView10 != null) {
                                                                        i3 = R.id.ivWallpaper5;
                                                                        ImageView imageView11 = (ImageView) ViewBindings.a(R.id.ivWallpaper5, viewInflate);
                                                                        if (imageView11 != null) {
                                                                            i3 = R.id.ivWallpaper6;
                                                                            ImageView imageView12 = (ImageView) ViewBindings.a(R.id.ivWallpaper6, viewInflate);
                                                                            if (imageView12 != null) {
                                                                                i3 = R.id.llMore;
                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llMore, viewInflate);
                                                                                if (linearLayout != null) {
                                                                                    i3 = R.id.tvTitle;
                                                                                    TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                                                                                    if (textView != null) {
                                                                                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                                        ItemImageCategoryBinding itemImageCategoryBinding = new ItemImageCategoryBinding(linearLayout2, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, linearLayout, textView);
                                                                                        Intrinsics.e(linearLayout2, "getRoot(...)");
                                                                                        VH vh = new VH(linearLayout2);
                                                                                        vh.f13078c = itemImageCategoryBinding;
                                                                                        return vh;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }
}
