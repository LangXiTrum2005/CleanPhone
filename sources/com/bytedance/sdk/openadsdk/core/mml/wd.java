package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.rc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends PAGBannerAd {
    private int jpc;
    protected AdSlot lnr;
    private boolean mml;
    private mzz mo;
    private boolean mzz;
    protected Context qdl;
    private List<com.bytedance.sdk.openadsdk.core.mml.qdl> rq;
    private final AtomicBoolean to = new AtomicBoolean(false);
    private int tvp;
    protected ljh ud;
    private boolean wd;

    public interface qdl {
        void qdl();
    }

    public wd(Context context, ljh ljhVar, AdSlot adSlot) {
        this.jpc = 0;
        this.tvp = 0;
        this.qdl = context;
        this.ud = ljhVar;
        this.lnr = adSlot;
        this.jpc = (int) adSlot.getExpressViewAcceptedWidth();
        this.tvp = (int) this.lnr.getExpressViewAcceptedHeight();
        qdl(this.ud);
        ud(ljhVar);
    }

    private void ud(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml;
        if (ljhVar == null || (qdlVarMml = ljhVar.mml()) == null) {
            return;
        }
        this.rq = new ArrayList();
        int size = qdlVarMml.mml().size();
        if (!this.wd) {
            this.rq.add(new com.bytedance.sdk.openadsdk.core.mml.qdl(this.qdl, ljhVar, this.lnr, this, false));
            return;
        }
        this.mo = new mzz(qdlVarMml.wd(), this.qdl, this.jpc, this.tvp);
        for (int i2 = 0; i2 < size; i2++) {
            this.lnr.setExpressViewAccepted(((this.jpc - ax.lnr(this.qdl, qdlVarMml.wd().mzz())) - ax.lnr(this.qdl, qdlVarMml.wd().mo())) - (ax.lnr(this.qdl, qdlVarMml.wd().wd()) * 2), this.tvp);
            ljh ljhVar2 = qdlVarMml.mml().get(i2);
            if (i2 != 0) {
                qdl(i2, ljhVar2);
            }
            com.bytedance.sdk.openadsdk.core.mml.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.mml.qdl(this.qdl, ljhVar2, this.lnr, this, true);
            qdlVar.qdl(i2);
            this.rq.add(qdlVar);
        }
        this.mo.qdl(this.rq);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.mml.qdl> list = this.rq;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.wd) {
                this.mo.qdl();
            } else {
                this.rq.get(0).wd();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.lnr != null ? new PAGBannerSize(this.jpc, this.tvp) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.mml.qdl> list = this.rq;
            if (list != null && !list.isEmpty()) {
                return this.wd ? this.mo.ud() : this.rq.get(0).qdl();
            }
        } catch (Throwable unused) {
        }
        return new View(this.qdl);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        ljh ljhVar = this.ud;
        if (ljhVar == null || ljhVar.dsy() == null) {
            return null;
        }
        try {
            return this.ud.dsy().get(str);
        } catch (Throwable th) {
            aaj.lnr("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        ljh ljhVar = this.ud;
        if (ljhVar != null) {
            return ljhVar.dsy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.mzz) {
            return;
        }
        rc.qdl(this.ud, d, str, str2);
        this.mzz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.mml.qdl> list = this.rq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.rq.size(); i2++) {
            this.rq.get(i2).qdl(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.mml.wd.1
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
                    if (!wd.this.to.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.mml.qdl> list = this.rq;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < this.rq.size(); i2++) {
            this.rq.get(i2).qdl(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.wd.2
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
                    if (!wd.this.to.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.mml) {
            return;
        }
        rc.qdl(this.ud, d);
        this.mml = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml;
        boolean z2;
        if (ljhVar == null || (qdlVarMml = ljhVar.mml()) == null) {
            return;
        }
        if (qdlVarMml.to()) {
            z2 = qdlVarMml.mml().size() > 1;
        }
        this.wd = z2;
    }

    public boolean qdl() {
        return this.wd;
    }

    private void qdl(int i2, ljh ljhVar) {
        if (i2 != 0) {
            if (!TextUtils.isEmpty(ljhVar.tqd())) {
                ljhVar.rdp("0");
            }
            Map<String, Object> mapDsy = ljhVar.dsy();
            if (mapDsy == null || !mapDsy.containsKey("price")) {
                return;
            }
            mapDsy.put("price", "0");
        }
    }
}
