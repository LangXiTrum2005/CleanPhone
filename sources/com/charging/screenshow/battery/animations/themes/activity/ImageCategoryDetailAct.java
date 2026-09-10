package com.charging.screenshow.battery.animations.themes.activity;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.databinding.ActImageCategoryDetailBinding;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.fragment.ImageCategoryDetailFrag;
import com.charging.screenshow.battery.animations.themes.utils.ext.IntExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.flyco.tablayout.SlidingTabLayout;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ImageCategoryDetailAct;", "Lcom/charging/screenshow/battery/animations/themes/activity/BaseAct;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryDetailAct extends BaseAct {
    public static final /* synthetic */ int k0 = 0;
    public ActImageCategoryDetailBinding h0;
    public final String[] i0 = {IntExt.c(R.string.most_download), IntExt.c(R.string.most_popular), IntExt.c(R.string.newest)};
    public final ArrayList j0 = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/activity/ImageCategoryDetailAct$Companion;", "", "", "KEY_DATA", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void g() {
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void i() {
        ImageCategoryBean imageCategoryBean;
        if (Build.VERSION.SDK_INT >= 33) {
            imageCategoryBean = (ImageCategoryBean) getIntent().getSerializableExtra("key_data", ImageCategoryBean.class);
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("key_data");
            Intrinsics.d(serializableExtra, "null cannot be cast to non-null type com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean");
            imageCategoryBean = (ImageCategoryBean) serializableExtra;
        }
        if (imageCategoryBean == null) {
            finish();
        }
        Intrinsics.c(imageCategoryBean);
        int i2 = imageCategoryBean.get_id();
        ArrayList arrayList = this.j0;
        arrayList.add(ImageCategoryDetailFrag.Companion.a(i2, NativeAdPresenter.DOWNLOAD));
        arrayList.add(ImageCategoryDetailFrag.Companion.a(i2, "popular"));
        arrayList.add(ImageCategoryDetailFrag.Companion.a(i2, "newest"));
        ActImageCategoryDetailBinding actImageCategoryDetailBinding = this.h0;
        if (actImageCategoryDetailBinding != null) {
            actImageCategoryDetailBinding.f13128e.setText(imageCategoryBean.get_title());
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View l() {
        View viewInflate = getLayoutInflater().inflate(R.layout.act_image_category_detail, (ViewGroup) null, false);
        int i2 = R.id.immersionBarView;
        View viewA = ViewBindings.a(R.id.immersionBarView, viewInflate);
        if (viewA != null) {
            i2 = R.id.ivBack;
            ImageView imageView = (ImageView) ViewBindings.a(R.id.ivBack, viewInflate);
            if (imageView != null) {
                i2 = R.id.lay_title_toolbar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.a(R.id.lay_title_toolbar, viewInflate);
                if (relativeLayout != null) {
                    i2 = R.id.sTab;
                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) ViewBindings.a(R.id.sTab, viewInflate);
                    if (slidingTabLayout != null) {
                        i2 = R.id.tvTitle;
                        TextView textView = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                        if (textView != null) {
                            i2 = R.id.viewPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.a(R.id.viewPager, viewInflate);
                            if (viewPager != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.h0 = new ActImageCategoryDetailBinding(linearLayout, viewA, imageView, relativeLayout, slidingTabLayout, textView, viewPager);
                                Intrinsics.e(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final View m() {
        ActImageCategoryDetailBinding actImageCategoryDetailBinding = this.h0;
        if (actImageCategoryDetailBinding != null) {
            return actImageCategoryDetailBinding.f13125a;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.activity.BaseAct
    public final void o() {
        ActImageCategoryDetailBinding actImageCategoryDetailBinding = this.h0;
        if (actImageCategoryDetailBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actImageCategoryDetailBinding.f.setOffscreenPageLimit(7);
        ActImageCategoryDetailBinding actImageCategoryDetailBinding2 = this.h0;
        if (actImageCategoryDetailBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        actImageCategoryDetailBinding2.d.e(actImageCategoryDetailBinding2.f, this.i0, this, this.j0);
        ActImageCategoryDetailBinding actImageCategoryDetailBinding3 = this.h0;
        if (actImageCategoryDetailBinding3 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(actImageCategoryDetailBinding3.f13126b, new androidx.room.b(this, 5));
        if (j()) {
            p(new q(this, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!j() || n().f13353e) {
            finish();
        } else {
            q(new q(this, 1));
        }
    }
}
