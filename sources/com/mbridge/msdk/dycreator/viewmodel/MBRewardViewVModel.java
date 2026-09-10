package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.viewdata.a;
import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f33300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f33301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f33302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f33303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f33304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DyOption f33305f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f33305f = dyOption;
        EventBus.getDefault().register(this);
    }

    private void a(Object obj) {
        c cVar = this.f33301b;
        if (cVar != null) {
            cVar.a(obj);
        }
    }

    private void b(Object obj) {
        d dVar = this.f33300a;
        if (dVar != null) {
            dVar.a(obj);
        }
    }

    private void c(Object obj) {
        f fVar = this.f33302c;
        if (fVar != null) {
            fVar.a(obj);
        }
    }

    private void d(Object obj) {
        h hVar = this.f33303d;
        if (hVar != null) {
            hVar.a(obj);
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        a(splashResData);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f33301b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f33300a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f33304e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f33302c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f33305f);
        b(aVar);
        a(aVar);
        c(aVar);
        d(aVar);
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f33303d = hVar;
        }
    }

    private void a(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f33304e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }
}
