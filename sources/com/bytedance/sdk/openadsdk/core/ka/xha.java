package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ory;
import com.bytedance.sdk.openadsdk.utils.qd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends PAGBannerAd {
    private fi di;
    private boolean fi;
    protected AdSlot ik;
    private int jbs;
    private boolean ka;
    protected wjv lr;
    private int mj;
    private final AtomicBoolean qt = new AtomicBoolean(false);
    protected Context ri;
    private List<com.bytedance.sdk.openadsdk.core.ka.ri> sf;
    private boolean xha;

    public interface ri {
        void ri();
    }

    public xha(Context context, wjv wjvVar, AdSlot adSlot) {
        this.mj = 0;
        this.jbs = 0;
        this.ri = context;
        this.lr = wjvVar;
        this.ik = adSlot;
        this.mj = (int) adSlot.getExpressViewAcceptedWidth();
        this.jbs = (int) this.ik.getExpressViewAcceptedHeight();
        ri(this.lr);
        lr(wjvVar);
    }

    private void lr(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa;
        if (wjvVar == null || (riVarKa = wjvVar.ka()) == null) {
            return;
        }
        this.sf = new ArrayList();
        int size = riVarKa.ka().size();
        if (!this.xha) {
            this.sf.add(new com.bytedance.sdk.openadsdk.core.ka.ri(this.ri, wjvVar, this.ik, this, false));
            return;
        }
        this.di = new fi(riVarKa.xha(), this.ri, this.mj, this.jbs);
        for (int i = 0; i < size; i++) {
            this.ik.setExpressViewAccepted(((this.mj - qd.ik(this.ri, riVarKa.xha().fi())) - qd.ik(this.ri, riVarKa.xha().di())) - (qd.ik(this.ri, riVarKa.xha().xha()) * 2), this.jbs);
            wjv wjvVar2 = riVarKa.ka().get(i);
            if (i != 0) {
                ri(i, wjvVar2);
            }
            com.bytedance.sdk.openadsdk.core.ka.ri riVar = new com.bytedance.sdk.openadsdk.core.ka.ri(this.ri, wjvVar2, this.ik, this, true);
            riVar.ri(i);
            this.sf.add(riVar);
        }
        this.di.ri(this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.ka.ri> list = this.sf;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.xha) {
                this.di.ri();
            } else {
                this.sf.get(0).xha();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.ik != null ? new PAGBannerSize(this.mj, this.jbs) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.ka.ri> list = this.sf;
            if (list != null && !list.isEmpty()) {
                return this.xha ? this.di.lr() : this.sf.get(0).ri();
            }
        } catch (Throwable unused) {
        }
        return new View(this.ri);
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
            ac.ik("PAGBannerAdImpl", th.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.fi) {
            return;
        }
        ory.ri(this.lr, d, str, str2);
        this.fi = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.ka.ri> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.sf.size(); i++) {
            this.sf.get(i).ri(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.ka.xha.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!xha.this.qt.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.ka.ri> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.sf.size(); i++) {
            this.sf.get(i).ri(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.xha.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!xha.this.qt.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.ka) {
            return;
        }
        ory.ri(this.lr, d);
        this.ka = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private void ri(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa;
        boolean z;
        if (wjvVar == null || (riVarKa = wjvVar.ka()) == null) {
            return;
        }
        if (riVarKa.mj()) {
            z = riVarKa.ka().size() > 1;
        }
        this.xha = z;
    }

    public boolean ri() {
        return this.xha;
    }

    private void ri(int i, wjv wjvVar) {
        if (i != 0) {
            if (!TextUtils.isEmpty(wjvVar.id())) {
                wjvVar.bgr("0");
            }
            Map<String, Object> mapIyl = wjvVar.iyl();
            if (mapIyl == null || !mapIyl.containsKey("price")) {
                return;
            }
            mapIyl.put("price", "0");
        }
    }
}
