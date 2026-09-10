package com.bytedance.sdk.openadsdk.core.LD;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.STP;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.nBu;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    private static int nJ = Integer.MIN_VALUE;
    protected int DY;
    protected boolean IeN;
    protected nBu JVA;
    public STP JXs;
    private WeakReference<Activity> LD;
    private String Lxb;
    protected PAGNativeAd NXR;
    protected final int OY;
    protected WeakReference<View> QAg;
    protected So0 STP;
    protected com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc VVE;
    protected Context ZU;
    protected PangleAd brP;
    protected final String ebl;
    protected Map<String, Object> kqm;
    protected final tD lc;
    private boolean lk;
    protected WeakReference<View> nBu;
    protected Lxb sLN;
    protected com.bytedance.sdk.openadsdk.core.OY.LD tD;

    public interface Lxb {
        void Lxb(View view, int i);
    }

    public LD(@NonNull Context context, @NonNull tD tDVar, @NonNull String str, int i) {
        this.IeN = false;
        this.DY = 0;
        this.lk = false;
        this.ZU = context;
        this.lc = tDVar;
        this.ebl = str;
        this.OY = i;
    }

    public void JXs(boolean z) {
        this.IeN = z;
    }

    public void LD(View view) {
        if (view == null) {
            return;
        }
        this.nBu = new WeakReference<>(view);
    }

    public boolean Lxb(nBu nbu, Map<String, Object> map) {
        return false;
    }

    public View ZU() {
        WeakReference<Activity> weakReference = this.LD;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.LD.get().findViewById(R.id.content);
    }

    public String lc() {
        return this.Lxb;
    }

    public void lk(int i) {
        this.foI = i;
    }

    public static boolean lk(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || Lxb(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.STP.JD == view.getId() || com.bytedance.sdk.openadsdk.utils.STP.kRz == view.getId();
    }

    public View JXs() {
        WeakReference<Activity> weakReference = this.LD;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        View viewFindViewById = this.LD.get().findViewById(520093713);
        return viewFindViewById == null ? this.LD.get().findViewById(520093713) : viewFindViewById;
    }

    public void LD(int i) {
        this.KPU = i;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar) {
        this.VVE = lcVar;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.OY.LD ld) {
        this.tD = ld;
    }

    public void ZU(int i) {
        this.DY = i;
    }

    public void Lxb(PAGNativeAd pAGNativeAd) {
        this.NXR = pAGNativeAd;
    }

    public void Lxb(PangleAd pangleAd) {
        this.brP = pangleAd;
    }

    public void Lxb(So0 so0) {
        this.STP = so0;
    }

    public void Lxb(Lxb lxb) {
        this.sLN = lxb;
    }

    public void Lxb(Activity activity) {
        if (activity == null) {
            return;
        }
        this.LD = new WeakReference<>(activity);
    }

    public LD(@NonNull Context context, @NonNull tD tDVar, @NonNull String str, int i, boolean z) {
        this(context, tDVar, str, i);
        this.lk = z;
    }

    public void Lxb(View view) {
        if (view == null) {
            return;
        }
        this.QAg = new WeakReference<>(view);
    }

    public void Lxb(Map<String, Object> map) {
        Map<String, Object> map2 = this.kqm;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.kqm);
        }
        this.kqm = map;
    }

    public void Lxb(int i) {
        this.Ivz = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i;
        boolean z2;
        tD tDVar;
        if (this.ZU == null) {
            this.ZU = kqm.Lxb();
        }
        if ((this.lk || !Lxb(view, 1, f, f2, f3, f4, sparseArray, z)) && this.ZU != null) {
            STP stp = this.JXs;
            if (stp != null) {
                int i2 = stp.sLN;
                JSONObject jSONObject3 = stp.NXR;
                JSONObject jSONObject4 = stp.kqm;
                z2 = stp.brP;
                i = i2;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                jSONObject = null;
                jSONObject2 = null;
                i = -1;
                z2 = false;
            }
            long j = this.CSn;
            long j2 = this.id;
            WeakReference<View> weakReference = this.QAg;
            View view2 = weakReference == null ? null : weakReference.get();
            WeakReference<View> weakReference2 = this.nBu;
            nBu nbuLxb = Lxb(f, f2, f3, f4, sparseArray, j, j2, view2, weakReference2 == null ? null : weakReference2.get(), lc(), le.JXs(this.ZU), le.ebl(this.ZU), le.lc(this.ZU), i, jSONObject, jSONObject2);
            this.JVA = nbuLxb;
            if (Lxb(nbuLxb, this.kqm)) {
                return;
            }
            if (this.STP != null) {
                if (this.kqm == null) {
                    this.kqm = new HashMap();
                }
                this.kqm.put("duration", Long.valueOf(this.STP.JXs()));
            }
            if (!this.lk && !z2) {
                Lxb lxb = this.sLN;
                if (lxb != null) {
                    lxb.Lxb(view, -1);
                }
                if (Lxb(view, z)) {
                    boolean zLD = eK.LD(this.lc);
                    String strLxb = zLD ? this.ebl : nJ.Lxb(this.OY);
                    if (view != null) {
                        try {
                            if (((Boolean) view.getTag(520093762)).booleanValue()) {
                                xan.Lxb(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityLxb = view != null ? com.bytedance.sdk.component.utils.LD.Lxb(view) : null;
                    boolean zLxb = xan.Lxb(activityLxb == null ? this.ZU : activityLxb, this.lc, this.OY, this.NXR, this.brP, strLxb, this.VVE, zLD, 0);
                    xan.Lxb(false);
                    if (zLxb || (tDVar = this.lc) == null || tDVar.nTb() == null || this.lc.nTb().lk() != 2) {
                        tD tDVar2 = this.lc;
                        if (tDVar2 != null && !zLxb && TextUtils.isEmpty(tDVar2.Sv()) && com.bytedance.sdk.openadsdk.ZU.LD.Lxb(this.ebl)) {
                            com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.ZU, this.lc, this.ebl).ZU();
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.lc, this.JVA, this.ebl, zLxb, this.kqm, z ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.lc, this.JVA, this.ebl, true, this.kqm, z ? 1 : 2);
        }
    }

    public boolean Lxb(View view, boolean z) {
        return Lxb(view, this.lc, z);
    }

    public static boolean Lxb(View view, tD tDVar, boolean z) {
        if (view != null && tDVar != null) {
            try {
                int i = com.bytedance.sdk.component.adexpress.dynamic.Lxb.DY;
                String strValueOf = String.valueOf(view.getTag(i));
                if (view.getTag(i) != null && !TextUtils.isEmpty(strValueOf)) {
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strValueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (lk(view)) {
                return tDVar.DY() != 1 || z;
            }
            if (tDVar.tD() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    public nBu Lxb(float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new nBu.Lxb().lc(f).JXs(f2).ZU(f3).lk(f4).LD(j).Lxb(j2).LD(le.Lxb(view)).Lxb(le.Lxb(view2)).lk(le.lk(view)).ZU(le.lk(view2)).ZU(this.foI).JXs(this.KPU).lc(this.Ivz).Lxb(sparseArray).LD(QAg.LD().Lxb() ? 1 : 2).Lxb(str).Lxb(f5).lk(i).LD(f6).Lxb(i2).Lxb(jSONObject).LD(jSONObject2).Lxb();
    }

    public boolean Lxb(View view, int i, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        if (this.tD == null) {
            return false;
        }
        int[] iArrLxb = new int[2];
        int[] iArrLk = new int[2];
        WeakReference<View> weakReference = this.nBu;
        if (weakReference != null) {
            iArrLxb = le.Lxb(weakReference.get());
            iArrLk = le.lk(this.nBu.get());
        }
        this.tD.Lxb(view, i, new STP.Lxb().ZU(f).lk(f2).LD(f3).Lxb(f4).LD(this.CSn).Lxb(this.id).lk(iArrLxb[0]).ZU(iArrLxb[1]).JXs(iArrLk[0]).lc(iArrLk[1]).Lxb(sparseArray).Lxb(z).Lxb());
        return true;
    }

    private static int Lxb(Context context) {
        if (nJ == Integer.MIN_VALUE) {
            nJ = com.bytedance.sdk.component.utils.tD.JXs(context, "btn_native_creative");
        }
        return nJ;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }
}
