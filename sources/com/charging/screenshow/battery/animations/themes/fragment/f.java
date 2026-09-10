package com.charging.screenshow.battery.animations.themes.fragment;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import com.charging.screenshow.battery.animations.themes.databinding.FragImageCategoryBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BaseFrag f13271Y;

    public /* synthetic */ f(BaseFrag baseFrag, int i2) {
        this.X = i2;
        this.f13271Y = baseFrag;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit = Unit.f43263a;
        BaseFrag baseFrag = this.f13271Y;
        switch (this.X) {
            case 0:
                View it = (View) obj;
                Intrinsics.f(it, "it");
                ImageCategoryFrag imageCategoryFrag = (ImageCategoryFrag) baseFrag;
                imageCategoryFrag.getClass();
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(imageCategoryFrag);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new ImageCategoryFrag$reload$1(imageCategoryFrag, null), 2);
                FragImageCategoryBinding fragImageCategoryBinding = imageCategoryFrag.Z;
                if (fragImageCategoryBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragImageCategoryBinding.f13183a);
                FragImageCategoryBinding fragImageCategoryBinding2 = imageCategoryFrag.Z;
                if (fragImageCategoryBinding2 != null) {
                    ViewExt.b(fragImageCategoryBinding2.f13184b);
                    return unit;
                }
                Intrinsics.m("binding");
                throw null;
            case 1:
                List list = (List) obj;
                ImageCategoryFrag imageCategoryFrag2 = (ImageCategoryFrag) baseFrag;
                imageCategoryFrag2.g0.clear();
                ArrayList arrayList = imageCategoryFrag2.g0;
                Intrinsics.c(list);
                arrayList.addAll(list);
                AppExt.b(new e(imageCategoryFrag2, 1));
                return unit;
            default:
                List list2 = (List) obj;
                ImageCategoryDetailFrag imageCategoryDetailFrag = (ImageCategoryDetailFrag) baseFrag;
                imageCategoryDetailFrag.f0.clear();
                ArrayList arrayList2 = imageCategoryDetailFrag.f0;
                Intrinsics.c(list2);
                arrayList2.addAll(list2);
                AppExt.b(new d(imageCategoryDetailFrag, 0));
                return unit;
        }
    }
}
