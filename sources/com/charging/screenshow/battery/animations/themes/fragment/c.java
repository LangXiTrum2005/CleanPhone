package com.charging.screenshow.battery.animations.themes.fragment;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import com.charging.screenshow.battery.animations.themes.vm.ImageCategoryVM;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements OnRefreshListener, OnLoadMoreListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BaseFrag f13268Y;

    public /* synthetic */ c(BaseFrag baseFrag, int i2) {
        this.X = i2;
        this.f13268Y = baseFrag;
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnRefreshListener
    public void a(RefreshLayout refreshLayout) {
        BaseFrag baseFrag = this.f13268Y;
        switch (this.X) {
            case 0:
                ImageCategoryDetailFrag imageCategoryDetailFrag = (ImageCategoryDetailFrag) baseFrag;
                if (!imageCategoryDetailFrag.g().f13344i.get()) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(imageCategoryDetailFrag);
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new ImageCategoryDetailFrag$initViews$2$1(imageCategoryDetailFrag, null), 2);
                    break;
                }
                break;
            default:
                ImageCategoryFrag imageCategoryFrag = (ImageCategoryFrag) baseFrag;
                if (!((ImageCategoryVM) imageCategoryFrag.e0.getX()).g.get()) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA2 = LifecycleOwnerKt.a(imageCategoryFrag);
                    DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
                    BuildersKt.c(lifecycleCoroutineScopeImplA2, DefaultIoScheduler.f45062Y, null, new ImageCategoryFrag$initViews$2$1(imageCategoryFrag, null), 2);
                    break;
                }
                break;
        }
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
    public void b(RefreshLayout it) {
        Intrinsics.f(it, "it");
        ImageCategoryDetailFrag imageCategoryDetailFrag = (ImageCategoryDetailFrag) this.f13268Y;
        if (imageCategoryDetailFrag.g().f13344i.get()) {
            return;
        }
        CategoryDetailVM.d(imageCategoryDetailFrag.g(), imageCategoryDetailFrag.h0, imageCategoryDetailFrag.i0);
    }
}
