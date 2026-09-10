package com.bytedance.sdk.openadsdk.Lxb.LD;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.VVE;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.KPU;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends PAGNativeAd {
    protected int JXs;
    protected final tD LD;
    protected VVE Lxb;
    private boolean OY;
    private boolean QAg;
    protected Lxb ZU;
    protected String ebl;
    protected int lc;
    protected final Context lk;

    public OY(@NonNull Context context, @NonNull tD tDVar, int i, boolean z) {
        if (tDVar == null) {
            sLN.LD("materialMeta can't been null");
        }
        this.LD = tDVar;
        this.lk = context;
        this.JXs = i;
        this.lc = tDVar.Td();
        String strLk = nJ.lk(i);
        this.ebl = strLk;
        if (z) {
            this.ZU = new Lxb(context, tDVar, strLk);
            this.Lxb = new VVE(context, this, tDVar, Lxb(i), this.ZU);
        }
    }

    private List<View> Lxb(List<View> list, List<View> list2) {
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

    public Lxb OY() {
        return this.ZU;
    }

    public boolean ebl() {
        tD tDVar = this.LD;
        return (tDVar == null || tDVar.sRq() == 5 || kqm.ZU().lk(this.lc) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        tD tDVar = this.LD;
        if (tDVar == null || tDVar.Hu() == null) {
            return null;
        }
        try {
            return this.LD.Hu().get(str);
        } catch (Throwable th) {
            sLN.Lxb("TTNativeAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        tD tDVar = this.LD;
        if (tDVar != null) {
            return tDVar.Hu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new ZU(OY());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.QAg) {
            return;
        }
        KPU.Lxb(this.LD, d, str, str2);
        this.QAg = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null) {
            sLN.LD("container can't been null");
            return;
        }
        if (list == null) {
            sLN.LD("clickView can't been null");
        } else if (list.size() <= 0) {
            sLN.LD("clickViews size must been more than 1");
        } else {
            Lxb(viewGroup, null, list, list2, view, new ebl(pAGNativeAdInteractionListener));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.OY) {
            return;
        }
        KPU.Lxb(this.LD, d);
        this.OY = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String Lxb(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    public void Lxb(String str) {
        this.ebl = str;
    }

    public void Lxb(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @NonNull List<View> list2, @Nullable List<View> list3, @Nullable View view, final lc lcVar) {
        if (viewGroup == null) {
            sLN.LD("container can't been null");
            return;
        }
        if (list2 == null) {
            sLN.LD("clickView can't been null");
            return;
        }
        if (list2.size() <= 0) {
            sLN.LD("clickViews size must been more than 1");
            return;
        }
        if (ebl()) {
            list3 = Lxb(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && lcVar != null && lcVar.LD()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.OY.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strLxb = eK.Lxb();
                    TTDelegateActivity.Lxb(OY.this.LD, strLxb, new com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.OY.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb
                        public void Lxb() {
                            lcVar.Lxb();
                            QAg.LD().lc(strLxb);
                            PAGMediaView pAGMediaViewLxb = OY.this.OY().Lxb();
                            if (pAGMediaViewLxb != null) {
                                pAGMediaViewLxb.close();
                            }
                        }
                    });
                }
            });
        }
        this.Lxb.Lxb(viewGroup, list, list2, list4, view, lcVar);
        tD tDVar = this.LD;
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(viewGroup, this.LD, (tDVar == null || tDVar.eK() != 2) ? null : new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.LD.id()));
    }
}
