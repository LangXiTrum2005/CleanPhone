package com.thinkup.core.common.inner.mixad.m;

import android.view.View;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyNativeTemplateView;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends o implements com.thinkup.core.common.mn.n.o.o0 {
    View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    TUNativeAdInfo.AdPrepareInfo f41812n;

    @Override // com.thinkup.core.common.mn.n.o.o0
    public final TUNativeAdInfo.AdPrepareInfo m() {
        return this.f41812n;
    }

    @Override // com.thinkup.core.common.mn.n.o.o0
    public final View o() {
        com.thinkup.core.common.mn.oo.o.o oVar = this.o;
        if (oVar != null && this.m == null) {
            View view = (View) oVar.o();
            this.m = view;
            if (view instanceof ThirdPartyNativeTemplateView) {
                this.f41812n = ((ThirdPartyNativeTemplateView) view).getAdPrepareInfo();
            }
        }
        return this.m;
    }
}
