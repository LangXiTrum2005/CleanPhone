package com.bytedance.sdk.openadsdk.core.ik;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.co;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.slm;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {
    private static int xd = Integer.MIN_VALUE;
    protected attabal aw;
    protected boolean bgr;
    protected com.bytedance.sdk.openadsdk.core.ka.ri bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected PAGNativeAd f18121co;
    protected final wjv di;
    public slm fi;
    private boolean ik;
    protected WeakReference<View> jbs;
    protected Context ka;
    private WeakReference<Activity> lr;
    protected final int mj;
    protected com.bytedance.sdk.openadsdk.core.jbs.lr nr;
    protected co qt;
    private String ri;
    protected ri sf;
    protected Map<String, Object> slm;
    protected int tan;
    protected com.bytedance.sdk.openadsdk.ihz.ri.ri.ik vr;
    protected final String xha;

    public interface ri {
        void ri(View view, int i);
    }

    public lr(Context context, wjv wjvVar, String str, int i) {
        this.bgr = false;
        this.tan = 0;
        this.ik = false;
        this.ka = context;
        this.di = wjvVar;
        this.xha = str;
        this.mj = i;
    }

    public void fi(boolean z) {
        this.bgr = z;
    }

    public void ik(int i) {
        this.su = i;
    }

    public View ka() {
        WeakReference<Activity> weakReference = this.lr;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.lr.get().findViewById(R.id.content);
    }

    public void lr(int i) {
        this.igq = i;
    }

    public boolean ri(co coVar, Map<String, Object> map) {
        return false;
    }

    public static boolean lr(View view) {
        return 520093705 == view.getId() || 520093707 == view.getId() || 520093703 == view.getId() || ri(view.getContext()) == view.getId() || com.bytedance.sdk.openadsdk.utils.slm.hd == view.getId() || com.bytedance.sdk.openadsdk.utils.slm.iyl == view.getId();
    }

    public String fi() {
        return this.ri;
    }

    public void ri(com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar) {
        this.vr = ikVar;
    }

    public void ka(int i) {
        this.tan = i;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.jbs.lr lrVar) {
        this.nr = lrVar;
    }

    public void ri(PAGNativeAd pAGNativeAd) {
        this.f18121co = pAGNativeAd;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ka.ri riVar) {
        this.bu = riVar;
    }

    public void ri(attabal attabalVar) {
        this.aw = attabalVar;
    }

    public void ri(ri riVar) {
        this.sf = riVar;
    }

    public void ri(Activity activity) {
        if (activity == null) {
            return;
        }
        this.lr = new WeakReference<>(activity);
    }

    public lr(Context context, wjv wjvVar, String str, int i, boolean z) {
        this(context, wjvVar, str, i);
        this.ik = z;
    }

    public void ri(View view) {
        if (view == null) {
            return;
        }
        this.jbs = new WeakReference<>(view);
    }

    public void ri(Map<String, Object> map) {
        Map<String, Object> map2 = this.slm;
        if (map2 != null) {
            map2.putAll(map);
            map.putAll(this.slm);
        }
        this.slm = map;
    }

    public void ri(int i) {
        this.zf = i;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        int i;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        if (this.ka == null) {
            this.ka = nr.ri();
        }
        if ((this.ik || !ri(view, 1, f, f2, f3, f4, sparseArray, z)) && this.ka != null) {
            slm slmVar = this.fi;
            if (slmVar != null) {
                int i2 = slmVar.mj;
                JSONObject jSONObject3 = slmVar.jbs;
                JSONObject jSONObject4 = slmVar.aw;
                z2 = slmVar.bgr;
                i = i2;
                jSONObject = jSONObject3;
                jSONObject2 = jSONObject4;
            } else {
                i = -1;
                z2 = false;
                jSONObject = null;
                jSONObject2 = null;
            }
            long j = this.ay;
            long j2 = this.fr;
            WeakReference<View> weakReference = this.jbs;
            co coVarRi = ri(f, f2, f3, f4, sparseArray, j, j2, weakReference == null ? null : weakReference.get(), fi(), qd.mj(this.ka), qd.qt(this.ka), qd.jbs(this.ka), i, jSONObject, jSONObject2);
            this.qt = coVarRi;
            if (ri(coVarRi, this.slm)) {
                return;
            }
            if (this.aw != null) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                this.slm.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.aw.di()));
            }
            wjv wjvVar = this.di;
            if (!this.ik && !z2) {
                ri riVar = this.sf;
                if (riVar != null) {
                    riVar.ri(view, -1);
                }
                if (ri(view, z)) {
                    boolean zLr = dw.lr(wjvVar);
                    String strRi = zLr ? this.xha : ig.ri(this.mj);
                    if (view != null) {
                        try {
                            if (Boolean.TRUE.equals(view.getTag(520093762))) {
                                com.bytedance.sdk.openadsdk.core.ig.ri(true);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    Activity activityRi = view != null ? com.bytedance.sdk.component.utils.lr.ri(view) : null;
                    boolean zRi = com.bytedance.sdk.openadsdk.core.ig.ri(activityRi == null ? this.ka : activityRi, wjvVar, this.mj, this.f18121co, this.bu, strRi, this.vr, zLr, 0);
                    com.bytedance.sdk.openadsdk.core.ig.ri(false);
                    if (zRi || wjvVar == null || wjvVar.lau() == null || wjvVar.lau().ik() != 2) {
                        if (wjvVar != null && !zRi && TextUtils.isEmpty(wjvVar.smj()) && com.bytedance.sdk.openadsdk.ka.lr.ri(this.xha)) {
                            com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.ka, this.xha).ri(wjvVar);
                        }
                        com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, this.qt, this.xha, zRi, this.slm, z ? 1 : 2);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri("click", wjvVar, this.qt, this.xha, true, this.slm, z ? 1 : 2);
            com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = wjvVar.qc();
            if (kaVarQc == null || wjvVar.zz() || (kaVarRi = kaVarQc.ri()) == null) {
                return;
            }
            attabal attabalVar = this.aw;
            kaVarRi.xha(attabalVar != null ? attabalVar.di() : 0L);
        }
    }

    public boolean ri(View view, boolean z) {
        return ri(view, this.di, z);
    }

    public static boolean ri(View view, wjv wjvVar, boolean z) {
        if (view != null && wjvVar != null) {
            try {
                int i = com.bytedance.sdk.component.adexpress.dynamic.ri.ac;
                String strValueOf = String.valueOf(view.getTag(i));
                if (view.getTag(i) != null && !TextUtils.isEmpty(strValueOf)) {
                    if ("click".equals(strValueOf)) {
                        return z;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            if (lr(view)) {
                return wjvVar.yjm() != 1 || z;
            }
            if (wjvVar.xe() == 1 && !z) {
                return false;
            }
        }
        return true;
    }

    public co ri(float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        return new co.ri().di(f).fi(f2).ka(f3).ik(f4).lr(j).ri(j2).ri(qd.ri(view)).lr(qd.ik(view)).ka(this.su).fi(this.igq).di(this.zf).ri(sparseArray).lr(qt.lr().ri() ? 1 : 2).ri(str).ri(f5).ik(i).lr(f6).ri(i2).ri(jSONObject).lr(jSONObject2).ri();
    }

    public boolean ri(View view, int i, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        if (this.nr == null) {
            return false;
        }
        this.nr.ri(view, i, new slm.ri().ka(f).ik(f2).lr(f3).ri(f4).lr(this.ay).ri(this.fr).ri(sparseArray).ri(z).ri());
        return true;
    }

    private static int ri(Context context) {
        if (xd == Integer.MIN_VALUE) {
            xd = uq.fi(context, "btn_native_creative");
        }
        return xd;
    }

    public void ri(String str) {
        this.ri = str;
    }
}
