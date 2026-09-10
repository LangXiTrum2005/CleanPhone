package com.charging.screenshow.battery.animations.themes.fragment;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwnerKt;
import com.charging.screenshow.battery.animations.themes.vm.CategoryDetailVM;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements OnRefreshListener, OnLoadMoreListener {
    public final /* synthetic */ NewTrendingFrag X;

    public /* synthetic */ g(NewTrendingFrag newTrendingFrag) {
        this.X = newTrendingFrag;
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnRefreshListener
    public void a(RefreshLayout refreshLayout) {
        NewTrendingFrag newTrendingFrag = this.X;
        if (newTrendingFrag.g().f13344i.get()) {
            return;
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(newTrendingFrag);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(lifecycleCoroutineScopeImplA, DefaultIoScheduler.f45062Y, null, new NewTrendingFrag$initViews$2$1(newTrendingFrag, null), 2);
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
    public void b(RefreshLayout it) {
        Intrinsics.f(it, "it");
        NewTrendingFrag newTrendingFrag = this.X;
        if (newTrendingFrag.g().f13344i.get()) {
            return;
        }
        CategoryDetailVM.d(newTrendingFrag.g(), PsExtractor.AUDIO_STREAM, newTrendingFrag.j0);
    }
}
