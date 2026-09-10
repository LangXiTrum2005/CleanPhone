package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.MBCountDownView;
import com.mbridge.msdk.dycreator.baseview.MBLinearLayout;
import com.mbridge.msdk.dycreator.baseview.MBRelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.utils.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewdata.base.a f33128a;

    public a(com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        this.f33128a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        BaseStrategy baseStrategyA;
        com.mbridge.msdk.dycreator.viewdata.base.a aVar;
        if (view == 0 || !(view instanceof InterBase)) {
            return;
        }
        if (!(view instanceof MBCountDownView) || (aVar = this.f33128a) == null || aVar.getEffectData() == null || this.f33128a.getEffectData().isCanSkip()) {
            com.mbridge.msdk.dycreator.viewdata.base.a aVar2 = this.f33128a;
            if (aVar2 != null && (view instanceof MBRelativeLayout) && d.a(view, aVar2)) {
                com.mbridge.msdk.dycreator.viewdata.base.a aVar3 = this.f33128a;
                if (aVar3 instanceof MBSplashData) {
                    MBRelativeLayout mBRelativeLayout = (MBRelativeLayout) view;
                    ((MBSplashData) aVar3).setxInScreen(mBRelativeLayout.getxInScreen());
                    ((MBSplashData) this.f33128a).setyInScreen(mBRelativeLayout.getyInScreen());
                    ((MBSplashData) this.f33128a).setClickType(1);
                }
            }
            com.mbridge.msdk.dycreator.viewdata.base.a aVar4 = this.f33128a;
            if (aVar4 != null && (view instanceof MBLinearLayout) && d.a(view, aVar4)) {
                com.mbridge.msdk.dycreator.viewdata.base.a aVar5 = this.f33128a;
                if (aVar5 instanceof MBSplashData) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) view;
                    ((MBSplashData) aVar5).setxInScreen(mBLinearLayout.getxInScreen());
                    ((MBSplashData) this.f33128a).setyInScreen(mBLinearLayout.getyInScreen());
                    ((MBSplashData) this.f33128a).setClickType(0);
                }
            }
            String strategyDes = ((InterBase) view).getStrategyDes();
            if (TextUtils.isEmpty(strategyDes) || (baseStrategyA = c.a().a(strategyDes)) == null) {
                return;
            }
            baseStrategyA.bindClickData(view, this.f33128a);
        }
    }
}
