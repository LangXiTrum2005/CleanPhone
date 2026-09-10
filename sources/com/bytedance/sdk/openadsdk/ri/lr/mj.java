package com.bytedance.sdk.openadsdk.ri.lr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bu;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.bytedance.sdk.openadsdk.utils.su;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends PAGNativeAd {
    protected int di;
    protected int fi;
    protected final Context ik;
    private boolean jbs;
    protected ri ka;
    protected final wjv lr;
    private boolean mj;
    protected bu ri;
    protected String xha;

    public mj(Context context, wjv wjvVar, int i, boolean z) {
        this.lr = wjvVar;
        this.ik = context;
        this.fi = i;
        this.di = wjvVar.ur();
        String strIk = ig.ik(i);
        this.xha = strIk;
        if (z) {
            this.ka = new ri(context, wjvVar, strIk);
            this.ri = new bu(context, this, wjvVar, ri(i), this.ka);
        }
    }

    private List<View> ri(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        wjv wjvVar = this.lr;
        if (wjvVar == null || wjvVar.iyl() == null) {
            return null;
        }
        try {
            return this.lr.iyl().get(str);
        } catch (Throwable th) {
            ac.ik("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        wjv wjvVar = this.lr;
        if (wjvVar != null) {
            return wjvVar.iyl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new ka(mj());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.jbs) {
            return;
        }
        ory.ri(this.lr, d, str, str2);
        this.jbs = true;
    }

    public ri mj() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        ri(viewGroup, null, list, list2, view, new xha(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.mj) {
            return;
        }
        ory.ri(this.lr, d);
        this.mj = true;
    }

    public boolean xha() {
        wjv wjvVar = this.lr;
        return (wjvVar == null || wjvVar.adz() == 5 || nr.ka().ik(this.di) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String ri(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void ri(String str) {
        this.xha = str;
    }

    public void ri(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final di diVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (xha()) {
            list3 = ri(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && diVar != null && diVar.lr()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.mj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strRi = su.ri();
                    TTDelegateActivity.ri(mj.this.lr, strRi, new com.bytedance.sdk.openadsdk.core.ka.xha.ri() { // from class: com.bytedance.sdk.openadsdk.ri.lr.mj.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.ka.xha.ri
                        public void ri() {
                            diVar.ri();
                            qt.lr().di(strRi);
                            PAGMediaView pAGMediaViewRi = mj.this.mj().ri();
                            if (pAGMediaViewRi != null) {
                                pAGMediaViewRi.close();
                            }
                        }
                    });
                }
            });
        }
        this.ri.ri(viewGroup, list, list2, list4, diVar);
        wjv wjvVar = this.lr;
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(viewGroup, this.lr, (wjvVar == null || wjvVar.ajz() != 2) ? null : new com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.lr.hpn()));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }
}
