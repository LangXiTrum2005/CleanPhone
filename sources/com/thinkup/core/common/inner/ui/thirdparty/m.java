package com.thinkup.core.common.inner.ui.thirdparty;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    public interface o {
        void o(View view, View view2, View view3);
    }

    public static void o(ViewGroup viewGroup, BaseAd baseAd, o oVar) {
        if (baseAd == null || viewGroup == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        layoutParams.leftMargin = o00.o(viewGroup.getContext(), 10.0f);
        String domain = baseAd.getDomain();
        String warning = baseAd.getWarning();
        String adFrom = baseAd.getAdFrom();
        if (!(TextUtils.isEmpty(domain) && TextUtils.isEmpty(warning) && TextUtils.isEmpty(adFrom)) && (viewGroup instanceof RelativeLayout)) {
            ThirdPartyNativeExtView thirdPartyNativeExtView = new ThirdPartyNativeExtView(viewGroup.getContext());
            thirdPartyNativeExtView.initView(domain, warning, adFrom);
            viewGroup.addView(thirdPartyNativeExtView, layoutParams);
            oVar.o(thirdPartyNativeExtView.getDomainView(), thirdPartyNativeExtView.getWarningView(), thirdPartyNativeExtView.getAdFromView());
        }
    }

    private static void o(ViewGroup viewGroup, BaseAd baseAd, o oVar, RelativeLayout.LayoutParams layoutParams) {
        String domain = baseAd.getDomain();
        String warning = baseAd.getWarning();
        String adFrom = baseAd.getAdFrom();
        if (!(TextUtils.isEmpty(domain) && TextUtils.isEmpty(warning) && TextUtils.isEmpty(adFrom)) && (viewGroup instanceof RelativeLayout)) {
            ThirdPartyNativeExtView thirdPartyNativeExtView = new ThirdPartyNativeExtView(viewGroup.getContext());
            thirdPartyNativeExtView.initView(domain, warning, adFrom);
            viewGroup.addView(thirdPartyNativeExtView, layoutParams);
            if (oVar != null) {
                oVar.o(thirdPartyNativeExtView.getDomainView(), thirdPartyNativeExtView.getWarningView(), thirdPartyNativeExtView.getAdFromView());
            }
        }
    }
}
