package com.charging.screenshow.battery.animations.themes.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragImageCategoryBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ImageCategoryVM;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/fragment/ImageCategoryFrag;", "Lcom/charging/screenshow/battery/animations/themes/fragment/BaseFrag;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryFrag extends BaseFrag {
    public FragImageCategoryBinding Z;
    public ImageCategoryAdapter f0;
    public final Lazy e0 = LazyKt.b(new e(this, 0));
    public final ArrayList g0 = new ArrayList();

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final View b() {
        View viewInflate = getLayoutInflater().inflate(R.layout.frag_image_category, (ViewGroup) null, false);
        int i2 = R.id.llEmpty;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.a(R.id.llEmpty, viewInflate);
        if (linearLayout != null) {
            i2 = R.id.pbb;
            ProgressBar progressBar = (ProgressBar) ViewBindings.a(R.id.pbb, viewInflate);
            if (progressBar != null) {
                i2 = R.id.refreshLayout;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.a(R.id.refreshLayout, viewInflate);
                if (smartRefreshLayout != null) {
                    i2 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.a(R.id.rv, viewInflate);
                    if (recyclerView != null) {
                        i2 = R.id.tvReload;
                        TextView textView = (TextView) ViewBindings.a(R.id.tvReload, viewInflate);
                        if (textView != null) {
                            i2 = R.id.tvTitle;
                            TextView textView2 = (TextView) ViewBindings.a(R.id.tvTitle, viewInflate);
                            if (textView2 != null) {
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                this.Z = new FragImageCategoryBinding(linearLayout2, linearLayout, progressBar, smartRefreshLayout, recyclerView, textView, textView2);
                                Intrinsics.e(linearLayout2, "getRoot(...)");
                                return linearLayout2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final TextView c() {
        FragImageCategoryBinding fragImageCategoryBinding = this.Z;
        if (fragImageCategoryBinding != null) {
            return fragImageCategoryBinding.f;
        }
        Intrinsics.m("binding");
        throw null;
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void d() {
        FragImageCategoryBinding fragImageCategoryBinding = this.Z;
        if (fragImageCategoryBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ViewExt.c(fragImageCategoryBinding.f13186e, new f(this, 0));
        ((ImageCategoryVM) this.e0.getX()).f13354e.e(this, new ImageCategoryFrag$sam$androidx_lifecycle_Observer$0(new f(this, 1)));
    }

    @Override // com.charging.screenshow.battery.animations.themes.fragment.BaseFrag
    public final void f() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ImageCategoryAdapter imageCategoryAdapter = new ImageCategoryAdapter(fragmentActivityRequireActivity, this.g0);
        this.f0 = imageCategoryAdapter;
        imageCategoryAdapter.k = new ImageCategoryFrag$initViews$1(this);
        FragImageCategoryBinding fragImageCategoryBinding = this.Z;
        if (fragImageCategoryBinding == null) {
            Intrinsics.m("binding");
            throw null;
        }
        requireActivity();
        fragImageCategoryBinding.d.setLayoutManager(new LinearLayoutManager());
        FragImageCategoryBinding fragImageCategoryBinding2 = this.Z;
        if (fragImageCategoryBinding2 == null) {
            Intrinsics.m("binding");
            throw null;
        }
        ImageCategoryAdapter imageCategoryAdapter2 = this.f0;
        Intrinsics.c(imageCategoryAdapter2);
        fragImageCategoryBinding2.d.setAdapter(imageCategoryAdapter2);
        FragImageCategoryBinding fragImageCategoryBinding3 = this.Z;
        if (fragImageCategoryBinding3 != null) {
            fragImageCategoryBinding3.f13185c.c1 = new c(this, 2);
        } else {
            Intrinsics.m("binding");
            throw null;
        }
    }
}
