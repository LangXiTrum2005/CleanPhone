package com.charging.screenshow.battery.animations.themes.vm;

import androidx.lifecycle.ViewModel;
import com.charging.screenshow.battery.animations.themes.entity.ImageCategoryBean;
import com.charging.screenshow.battery.animations.themes.network.base.resource.Resource;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f13356Y;
    public final /* synthetic */ ViewModel Z;

    public /* synthetic */ a(ViewModel viewModel, int i2, int i3) {
        this.X = i3;
        this.Z = viewModel;
        this.f13356Y = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ImageResponse imageResponse;
        ImageResponse imageResponse2;
        Resource resource = (Resource) obj;
        switch (this.X) {
            case 0:
                CategoryDetailVM categoryDetailVM = (CategoryDetailVM) this.Z;
                categoryDetailVM.f13344i.set(false);
                boolean z2 = resource.f13285a;
                ArrayList arrayList = categoryDetailVM.f;
                if (z2 && (imageResponse = (ImageResponse) resource.f13286b) != null && !imageResponse.getImages().isEmpty()) {
                    arrayList.addAll(imageResponse.getImages());
                    categoryDetailVM.g = this.f13356Y;
                }
                categoryDetailVM.f13342e.k(arrayList);
                break;
            default:
                boolean z3 = resource.f13285a;
                ImageCategoryVM imageCategoryVM = (ImageCategoryVM) this.Z;
                if (z3 && (imageResponse2 = (ImageResponse) resource.f13286b) != null) {
                    ArrayList arrayList2 = imageCategoryVM.f;
                    int i2 = this.f13356Y;
                    ((ImageCategoryBean) arrayList2.get(i2)).get_list().clear();
                    ((ImageCategoryBean) imageCategoryVM.f.get(i2)).get_list().addAll(imageResponse2.getImages());
                }
                imageCategoryVM.f13355h.incrementAndGet();
                int i3 = imageCategoryVM.f13355h.get();
                ArrayList arrayList3 = imageCategoryVM.f;
                if (i3 == arrayList3.size()) {
                    imageCategoryVM.g.set(false);
                    imageCategoryVM.f13354e.k(arrayList3);
                }
                break;
        }
        return Unit.f43263a;
    }
}
