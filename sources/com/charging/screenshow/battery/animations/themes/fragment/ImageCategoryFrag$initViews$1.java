package com.charging.screenshow.battery.animations.themes.fragment;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.charging.screenshow.battery.animations.themes.activity.ImageCategoryDetailAct;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.entity.PreviewBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/charging/screenshow/battery/animations/themes/fragment/ImageCategoryFrag$initViews$1", "Lcom/charging/screenshow/battery/animations/themes/adapter/ImageCategoryAdapter$OnItemClickListener;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryFrag$initViews$1 implements ImageCategoryAdapter.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageCategoryFrag f13263a;

    public ImageCategoryFrag$initViews$1(ImageCategoryFrag imageCategoryFrag) {
        this.f13263a = imageCategoryFrag;
    }

    public final void a(int i2) {
        ImageCategoryFrag imageCategoryFrag = this.f13263a;
        if (i2 < 0) {
            imageCategoryFrag.getClass();
            return;
        }
        ArrayList arrayList = imageCategoryFrag.g0;
        if (i2 >= arrayList.size()) {
            return;
        }
        int i3 = ImageCategoryDetailAct.k0;
        FragmentActivity fragmentActivityRequireActivity = imageCategoryFrag.requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ImageCategoryBean bean = (ImageCategoryBean) arrayList.get(i2);
        Intrinsics.f(bean, "bean");
        Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ImageCategoryDetailAct.class);
        intent.putExtra("key_data", bean);
        fragmentActivityRequireActivity.startActivity(intent);
    }

    public final void b(int i2, int i3) {
        ImageCategoryFrag imageCategoryFrag = this.f13263a;
        if (i2 < 0) {
            imageCategoryFrag.getClass();
            return;
        }
        ArrayList arrayList = imageCategoryFrag.g0;
        if (i2 >= arrayList.size()) {
            return;
        }
        List list = ((ImageCategoryBean) arrayList.get(i2)).get_list();
        if (i3 < 0 || i3 >= list.size() || imageCategoryFrag.getActivity() == null) {
            return;
        }
        PreviewBean previewBean = new PreviewBean();
        previewBean.e(((ImageCategoryBean) arrayList.get(i2)).get_list());
        int i4 = ImagePreviewAct.p0;
        FragmentActivity fragmentActivityRequireActivity = imageCategoryFrag.requireActivity();
        Intrinsics.e(fragmentActivityRequireActivity, "requireActivity(...)");
        ImagePreviewAct.Companion.a(fragmentActivityRequireActivity, i3, previewBean, true);
    }
}
