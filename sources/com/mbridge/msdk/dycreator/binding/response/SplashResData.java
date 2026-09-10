package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SplashResData extends BaseRespData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f33158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f33159b;

    public a getBaseViewData() {
        return this.f33158a;
    }

    public EAction geteAction() {
        return this.f33159b;
    }

    public void setBaseViewData(a aVar) {
        this.f33158a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f33159b = eAction;
    }
}
