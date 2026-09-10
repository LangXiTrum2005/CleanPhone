package com.charging.screenshow.battery.animations.themes.fragment;

import com.charging.screenshow.battery.animations.themes.adapter.ImageGridAdapter;
import com.charging.screenshow.battery.animations.themes.databinding.FragImageCategoryDetailBinding;
import com.charging.screenshow.battery.animations.themes.databinding.FragWallpaperBinding;
import com.charging.screenshow.battery.animations.themes.utils.ext.ViewExt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BaseFrag f13269Y;

    public /* synthetic */ d(BaseFrag baseFrag, int i2) {
        this.X = i2;
        this.f13269Y = baseFrag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.X) {
            case 0:
                ImageCategoryDetailFrag imageCategoryDetailFrag = (ImageCategoryDetailFrag) this.f13269Y;
                FragImageCategoryDetailBinding fragImageCategoryDetailBinding = imageCategoryDetailFrag.Z;
                if (fragImageCategoryDetailBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragImageCategoryDetailBinding.f13188b.finishRefresh(true);
                FragImageCategoryDetailBinding fragImageCategoryDetailBinding2 = imageCategoryDetailFrag.Z;
                if (fragImageCategoryDetailBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragImageCategoryDetailBinding2.f13188b.finishLoadMore(true);
                ImageGridAdapter imageGridAdapter = imageCategoryDetailFrag.g0;
                if (imageGridAdapter != null) {
                    imageGridAdapter.notifyDataSetChanged();
                }
                return Unit.f43263a;
            default:
                NewTrendingFrag newTrendingFrag = (NewTrendingFrag) this.f13269Y;
                FragWallpaperBinding fragWallpaperBinding = newTrendingFrag.Z;
                if (fragWallpaperBinding == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragWallpaperBinding.d.finishRefresh(true);
                FragWallpaperBinding fragWallpaperBinding2 = newTrendingFrag.Z;
                if (fragWallpaperBinding2 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                fragWallpaperBinding2.d.finishLoadMore(true);
                ImageGridAdapter imageGridAdapter2 = newTrendingFrag.g0;
                if (imageGridAdapter2 != null) {
                    imageGridAdapter2.notifyDataSetChanged();
                }
                FragWallpaperBinding fragWallpaperBinding3 = newTrendingFrag.Z;
                if (fragWallpaperBinding3 == null) {
                    Intrinsics.m("binding");
                    throw null;
                }
                ViewExt.a(fragWallpaperBinding3.f13195b);
                if (newTrendingFrag.f0.isEmpty()) {
                    FragWallpaperBinding fragWallpaperBinding4 = newTrendingFrag.Z;
                    if (fragWallpaperBinding4 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.b(fragWallpaperBinding4.f13196c);
                } else {
                    FragWallpaperBinding fragWallpaperBinding5 = newTrendingFrag.Z;
                    if (fragWallpaperBinding5 == null) {
                        Intrinsics.m("binding");
                        throw null;
                    }
                    ViewExt.a(fragWallpaperBinding5.f13196c);
                }
                return Unit.f43263a;
        }
    }
}
