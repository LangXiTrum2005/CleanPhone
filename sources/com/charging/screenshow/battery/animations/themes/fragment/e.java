package com.charging.screenshow.battery.animations.themes.fragment;

import android.app.Application;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.adapter.ImageCategoryAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragImageCategoryBinding;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import com.charging.screenshow.battery.animations.themes.vm.ImageCategoryVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ ImageCategoryFrag f13270Y;

    public /* synthetic */ e(ImageCategoryFrag imageCategoryFrag, int i2) {
        this.X = i2;
        this.f13270Y = imageCategoryFrag;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragImageCategoryBinding fragImageCategoryBinding;
        switch (this.X) {
            case 0:
                Application application = this.f13270Y.requireActivity().getApplication();
                MyApp myApp = application instanceof MyApp ? (MyApp) application : null;
                if (myApp != null) {
                    return (ImageCategoryVM) myApp.a().a(ImageCategoryVM.class);
                }
                throw new NullPointerException("Application does not inherit from BaseApplication");
            default:
                ImageCategoryFrag imageCategoryFrag = this.f13270Y;
                FragImageCategoryBinding fragImageCategoryBinding2 = imageCategoryFrag.Z;
                if (fragImageCategoryBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragImageCategoryBinding2.f13185c.finishRefresh(true);
                ImageCategoryAdapter imageCategoryAdapter = imageCategoryFrag.f0;
                if (imageCategoryAdapter != null) {
                    imageCategoryAdapter.notifyDataSetChanged();
                }
                FragImageCategoryBinding fragImageCategoryBinding3 = imageCategoryFrag.Z;
                if (fragImageCategoryBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragImageCategoryBinding3.f13184b);
                ArrayList arrayList = imageCategoryFrag.g0;
                if (arrayList.isEmpty()) {
                    fragImageCategoryBinding = imageCategoryFrag.Z;
                    if (fragImageCategoryBinding != null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(fragImageCategoryBinding.f13183a);
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size || i2 == 9) {
                            FragImageCategoryBinding fragImageCategoryBinding4 = imageCategoryFrag.Z;
                            if (fragImageCategoryBinding4 == null) {
                                Intrinsics.m("binding");
                                throw null;
                            }
                            ViewExt.a(fragImageCategoryBinding4.f13183a);
                        } else if (!((ImageCategoryBean) arrayList.get(i2)).get_list().isEmpty()) {
                            i2++;
                        }
                    }
                    fragImageCategoryBinding = imageCategoryFrag.Z;
                    if (fragImageCategoryBinding != null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(fragImageCategoryBinding.f13183a);
                }
                return Unit.f43263a;
        }
    }
}
