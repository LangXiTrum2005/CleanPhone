package com.mbridge.msdk.dycreator.binding.base;

import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f33155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EAction f33156b;

    public a getBaseViewData() {
        return this.f33155a;
    }

    public EAction geteAction() {
        return this.f33156b;
    }

    public void setBaseViewData(a aVar) {
        this.f33155a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f33156b = eAction;
    }
}
