package com.bytedance.sdk.openadsdk.core.bgr.lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.ac;
import com.bytedance.sdk.openadsdk.core.widget.tan;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import eliminate.saneness;
import euthanasia.attabal;
import euthanasia.dern;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements saneness, euthanasia.saneness<wjv>, igq.ri, com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri, ac.lr, tan.ri {
    int ac;
    com.bytedance.sdk.openadsdk.core.widget.ri aw;
    int ay;
    TextView bgr;
    int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    View f18104co;
    View di;
    boolean dw;
    boolean dzy;
    ImageView fi;
    wjv fr;
    attabal hcw;
    private long ig;
    ac igq;
    boolean ihz;
    ViewGroup ik;
    View jbs;
    com.bykv.vk.openvk.ri.ri.ri.di.attabal ka;
    protected final int lr;
    ImageView mj;
    int nr;
    com.bytedance.sdk.openadsdk.core.ik.ri oh;
    com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ory;
    private di.ri pv;
    private final String qd;
    View qt;
    protected final int ri;
    ImageView sf;
    TextView slm;
    Context su;
    int tan;
    boolean uq;
    TextView vr;
    int wjv;
    com.bytedance.sdk.openadsdk.core.ik.ri xd;
    View xha;
    ri zf;

    public fi(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, attabal attabalVar, boolean z2) {
        this.ri = 228;
        this.lr = 160;
        this.ihz = true;
        this.dw = true;
        this.dzy = true;
        this.qd = Build.MODEL;
        if (this instanceof ka) {
            return;
        }
        this.su = nr.ri().getApplicationContext();
        ka(z2);
        this.ik = viewGroup;
        this.ihz = z;
        this.ay = i;
        this.hcw = attabalVar;
        this.fr = wjvVar;
        ka(8);
        ri(context, this.ik);
        ka();
        co();
    }

    private boolean fr() {
        return wjv.fi(this.fr) && (!com.bytedance.sdk.openadsdk.core.co.fi.ri(this.fr.hpn()) ? this.fr.sez() == null : this.fr.zv() == null) && this.fr.ud() == 1;
    }

    public void ac() {
        ImageView imageView = this.sf;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.ri riVar = this.aw;
        if (riVar != null) {
            riVar.setImageBitmap(null);
        }
    }

    public com.bykv.vk.openvk.ri.ri.ri.di.attabal aw() {
        return this.ka;
    }

    public boolean ay() {
        return (this.ay & 4) != 4 || this.ihz;
    }

    public void bgr() {
        if (this.zf == null || this.igq != null) {
            return;
        }
        System.currentTimeMillis();
        ac acVar = new ac();
        this.igq = acVar;
        acVar.ri(this.su, this.ik);
        this.igq.ri(this.zf, this);
        System.currentTimeMillis();
    }

    public void bu() {
        qd.di(this.di);
        qd.di(this.xha);
        if (this.fi.getVisibility() == 0) {
            qd.ri((View) this.fi, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    public void co() {
        String str;
        int i;
        String str2;
        int i2;
        com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar;
        com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar2;
        com.bytedance.sdk.openadsdk.core.ik.ri riVar;
        String str3 = this.dw ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.fr.qa()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else {
            if (!this.fr.pg()) {
                if (this.fr.svc()) {
                    str2 = "banner_ad";
                    i2 = 2;
                } else {
                    str = str3;
                    i = 1;
                }
                if (this.fr.adz() == 4) {
                    this.ory = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.su, str);
                }
                com.bytedance.sdk.openadsdk.core.ik.ri riVar2 = new com.bytedance.sdk.openadsdk.core.ik.ri(this.su, this.fr, str, i);
                this.oh = riVar2;
                riVar2.ri(this);
                this.oh.lr(true);
                if (this.dw) {
                    this.oh.ri(true);
                } else {
                    this.oh.ri(false);
                    this.oh.ik(true);
                }
                this.oh.ri(this.hcw);
                this.oh.fi(true);
                this.oh.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.1
                    @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
                    public void ri(View view, int i3) {
                        if (fi.this.pv != null) {
                            fi.this.pv.ri(view, i3);
                        }
                    }
                });
                ikVar = this.ory;
                if (ikVar != null && (riVar = this.oh) != null) {
                    riVar.ri(ikVar);
                }
                if (fr()) {
                    com.bytedance.sdk.openadsdk.core.ik.ri riVar3 = new com.bytedance.sdk.openadsdk.core.ik.ri(this.su, this.fr, str, i) { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.2
                        @Override // com.bytedance.sdk.openadsdk.core.ik.ri
                        public boolean ik() {
                            View view = fi.this.qt;
                            if (view != null && view.getVisibility() == 0) {
                                return true;
                            }
                            View view2 = fi.this.f18104co;
                            if (view2 != null && view2.getVisibility() == 0) {
                                return true;
                            }
                            com.bytedance.sdk.openadsdk.core.widget.ri riVar4 = fi.this.aw;
                            if (riVar4 != null && riVar4.getVisibility() == 0) {
                                return true;
                            }
                            TextView textView = fi.this.bgr;
                            return textView != null && textView.getVisibility() == 0;
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.ik.ri
                        public boolean lr() {
                            ac acVar = fi.this.igq;
                            boolean zRi = acVar != null ? acVar.ri() : false;
                            fi.this.fi.getVisibility();
                            return zRi || fi.this.fi.getVisibility() == 0;
                        }
                    };
                    this.xd = riVar3;
                    riVar3.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.3
                        @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
                        public void ri(View view, int i3) {
                            if (fi.this.pv != null) {
                                fi.this.pv.ri(view, i3);
                            }
                        }
                    });
                    this.xd.lr(true);
                    this.xd.ri(this.dw);
                    this.xd.ri(this.hcw);
                    this.xd.fi(true);
                    ikVar2 = this.ory;
                    if (ikVar2 != null) {
                        this.xd.ri(ikVar2);
                    }
                    this.xd.ri(this);
                }
            }
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        }
        str = str2;
        i = i2;
        if (this.fr.adz() == 4) {
            this.ory = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(this.su, str);
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar4 = new com.bytedance.sdk.openadsdk.core.ik.ri(this.su, this.fr, str, i);
        this.oh = riVar4;
        riVar4.ri(this);
        this.oh.lr(true);
        if (this.dw) {
            this.oh.ri(true);
        } else {
            this.oh.ri(false);
            this.oh.ik(true);
        }
        this.oh.ri(this.hcw);
        this.oh.fi(true);
        this.oh.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i3) {
                if (fi.this.pv != null) {
                    fi.this.pv.ri(view, i3);
                }
            }
        });
        ikVar = this.ory;
        if (ikVar != null) {
            riVar.ri(ikVar);
        }
        if (fr()) {
            com.bytedance.sdk.openadsdk.core.ik.ri riVar5 = new com.bytedance.sdk.openadsdk.core.ik.ri(this.su, this.fr, str, i) { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.2
                @Override // com.bytedance.sdk.openadsdk.core.ik.ri
                public boolean ik() {
                    View view = fi.this.qt;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = fi.this.f18104co;
                    if (view2 != null && view2.getVisibility() == 0) {
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.ri riVar6 = fi.this.aw;
                    if (riVar6 != null && riVar6.getVisibility() == 0) {
                        return true;
                    }
                    TextView textView = fi.this.bgr;
                    return textView != null && textView.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.ik.ri
                public boolean lr() {
                    ac acVar = fi.this.igq;
                    boolean zRi = acVar != null ? acVar.ri() : false;
                    fi.this.fi.getVisibility();
                    return zRi || fi.this.fi.getVisibility() == 0;
                }
            };
            this.xd = riVar5;
            riVar5.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.3
                @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
                public void ri(View view, int i3) {
                    if (fi.this.pv != null) {
                        fi.this.pv.ri(view, i3);
                    }
                }
            });
            this.xd.lr(true);
            this.xd.ri(this.dw);
            this.xd.ri(this.hcw);
            this.xd.fi(true);
            ikVar2 = this.ory;
            if (ikVar2 != null) {
                this.xd.ri(ikVar2);
            }
            this.xd.ri(this);
        }
    }

    public void di() {
    }

    public void fi() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri
    public long getVideoProgress() {
        if (this.ig <= 0) {
            wjv wjvVar = this.fr;
            if (wjvVar != null && wjvVar.eu() != null) {
                this.ig = (long) (this.fr.eu().beachfront() * 1000.0d);
            }
            attabal attabalVar = this.hcw;
            if (attabalVar != null) {
                this.ig = attabalVar.jbs();
            }
        }
        return this.ig;
    }

    public boolean ihz() {
        return this.ihz;
    }

    public void ik(boolean z) {
    }

    public void jbs() {
        ka(8);
        if (ay()) {
            this.ka.setVisibility(8);
        }
        ImageView imageView = this.mj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ka(8);
        qd.ri(this.qt, 8);
        qd.ri((View) this.sf, 8);
        qd.ri(this.f18104co, 8);
        qd.ri((View) this.aw, 8);
        qd.ri((View) this.bgr, 8);
        qd.ri((View) this.vr, 8);
        ac acVar = this.igq;
        if (acVar != null) {
            acVar.ri(true);
        }
    }

    public void ka() {
        this.ka.attabal(this);
        this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fi.this.slm()) {
                    TextView textView = fi.this.slm;
                    if (textView == null || textView.getVisibility() != 0) {
                        fi fiVar = fi.this;
                        fiVar.zf.ri(fiVar, view);
                    }
                }
            }
        });
    }

    public void lr(ViewGroup viewGroup) {
    }

    public void mj() {
        qd.fi(this.di);
    }

    public void nr() {
        qd.ri((View) this.ik, 0);
        com.bykv.vk.openvk.ri.ri.ri.di.attabal attabalVar = this.ka;
        if (attabalVar != null) {
            qd.ri(attabalVar.getView(), 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ac.lr
    public boolean qt() {
        return false;
    }

    public void ri(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ac.lr
    public void sf() {
        ri(true, false);
    }

    public boolean slm() {
        return this.zf != null;
    }

    public void tan() {
        try {
            qd.ri(this.qt, 8);
            qd.ri((View) this.sf, 8);
            qd.ri(this.f18104co, 8);
            qd.ri((View) this.aw, 8);
            qd.ri((View) this.bgr, 8);
            qd.ri((View) this.vr, 8);
            qd.ri((View) this.slm, 8);
        } catch (Exception unused) {
        }
    }

    public boolean uq() {
        return this.uq;
    }

    public void vr() {
        ac acVar = this.igq;
        if (acVar != null) {
            acVar.ri(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tan.ri
    public boolean wjv() {
        ac acVar = this.igq;
        return acVar != null && acVar.ri();
    }

    public void xha() {
        wjv wjvVar;
        qd.di(this.di);
        qd.di(this.xha);
        if (this.mj != null && (wjvVar = this.fr) != null && wjvVar.eu() != null && this.fr.eu().cuirassed() != null) {
            qd.di(this.mj);
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.eu().cuirassed(), this.fr.eu().impassible(), this.fr.eu().adultoid(), this.mj, this.fr);
        }
        if (this.fi.getVisibility() == 0) {
            qd.ri((View) this.fi, 8);
        }
    }

    private void di(int i) {
        qd.ri(this.f18104co, i);
    }

    private int fi(int i) {
        if (this.tan <= 0 || this.ac <= 0) {
            return 0;
        }
        int iLr = qd.lr(this.su, 228.0f);
        int iLr2 = qd.lr(this.su, 160.0f);
        int i2 = (int) (this.ac * ((i * 1.0f) / this.tan));
        if (i2 > iLr) {
            return iLr;
        }
        return i2 < iLr2 ? iLr2 : i2;
    }

    public void ik(int i) {
        qd.ri((View) this.ik, 0);
        com.bykv.vk.openvk.ri.ri.ri.di.attabal attabalVar = this.ka;
        if (attabalVar != null) {
            attabalVar.setVisibility(i);
        }
    }

    public void lr(boolean z) {
    }

    public void ri(long j) {
    }

    public void ka(boolean z) {
        this.dw = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.ik.ri riVar = this.oh;
            if (riVar != null) {
                riVar.ri(true);
            }
            com.bytedance.sdk.openadsdk.core.ik.ri riVar2 = this.xd;
            if (riVar2 != null) {
                riVar2.ri(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar3 = this.oh;
        if (riVar3 != null) {
            riVar3.ri(false);
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar4 = this.xd;
        if (riVar4 != null) {
            riVar4.ri(false);
        }
    }

    public boolean lr(int i) {
        return false;
    }

    public void ri(long j, long j2) {
    }

    public void lr(boolean z, boolean z2) {
        ImageView imageView = this.fi;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(sf.ri(this.su, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(sf.ri(this.su, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
    }

    public void ik(int i, int i2) {
        this.tan = i;
        this.ac = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tan.ri
    public void ri(View view, boolean z) {
    }

    public void ri(ViewGroup viewGroup) {
    }

    public void ik(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.ik.getParent() == null) {
            viewGroup.addView(this.ik);
        }
        ka(0);
    }

    public void lr(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.ik.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.ik.setLayoutParams(layoutParams);
    }

    public void ri(String str) {
    }

    @Override // euthanasia.saneness
    public View ik() {
        return this.ik;
    }

    @Override // euthanasia.saneness
    public /* bridge */ /* synthetic */ void ri(wjv wjvVar, WeakReference weakReference, boolean z) {
        ri2(wjvVar, (WeakReference<Context>) weakReference, z);
    }

    @Override // euthanasia.saneness
    public void lr() {
        qd.fi(this.di);
        qd.fi(this.xha);
        ImageView imageView = this.mj;
        if (imageView != null) {
            qd.fi(imageView);
        }
    }

    public void ri(di.ri riVar) {
        this.pv = riVar;
    }

    public void ka(int i) {
        this.wjv = i;
        qd.ri((View) this.ik, i);
    }

    public void ri(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = this.oh;
        if (riVar != null) {
            riVar.ri(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar2 = this.xd;
        if (riVar2 != null) {
            riVar2.ri(pAGNativeAd);
        }
    }

    @Override // eliminate.saneness
    public void lr(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.ka.getHolder()) {
            return;
        }
        this.uq = false;
        if (slm()) {
            this.zf.lr(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, com.bykv.vk.openvk.ri.ri.ri.di.attabal] */
    public void ri(Context context, View view) {
        ?? ikVar;
        System.currentTimeMillis();
        wjv wjvVar = this.fr;
        if ((wjvVar == null || ((!wjvVar.ny() && !this.fr.svc()) || com.bytedance.sdk.openadsdk.core.settings.sf.lr().akr())) && view != null) {
            view.setKeepScreenOn(true);
        }
        attabal attabalVar = this.hcw;
        if (attabalVar != null && attabalVar.vr()) {
            ikVar = new com.bykv.vk.openvk.ri.ri.ri.di.ka(this.su);
        } else {
            ikVar = new com.bykv.vk.openvk.ri.ri.ri.di.ik(this.su);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(ikVar, 0, layoutParams);
        }
        qd.ri((View) ikVar, 8);
        this.ka = ikVar;
        this.fi = (ImageView) view.findViewById(slm.bzf);
        this.di = view.findViewById(slm.evm);
        this.xha = view.findViewById(slm.fb);
        this.mj = (ImageView) view.findViewById(slm.sz);
        this.jbs = view.findViewById(slm.jm);
        System.currentTimeMillis();
    }

    @Override // eliminate.saneness
    public void lr(SurfaceTexture surfaceTexture) {
        attabal attabalVar = this.hcw;
        if (attabalVar != null) {
            attabalVar.ri(surfaceTexture);
        }
    }

    public fi(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, attabal attabalVar) {
        this(context, viewGroup, z, i, wjvVar, attabalVar, true);
    }

    public void ri(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.jbs) == null || view2.getParent() == null || this.qt != null) {
            return;
        }
        this.qt = this.jbs;
        this.sf = (ImageView) view.findViewById(slm.ezp);
        this.f18104co = view.findViewById(slm.adz);
        this.aw = (com.bytedance.sdk.openadsdk.core.widget.ri) view.findViewById(slm.kt);
        this.bgr = (TextView) view.findViewById(slm.feb);
        this.vr = (TextView) view.findViewById(slm.zyn);
        this.slm = (TextView) view.findViewById(slm.tnn);
    }

    public boolean ri(int i, com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVar, boolean z) {
        ac acVar = this.igq;
        return acVar == null || acVar.ri(i, attabalVar, z);
    }

    public void ri(dern dernVar) {
        if (dernVar instanceof ri) {
            this.zf = (ri) dernVar;
            bgr();
        }
    }

    public void ri(int i, int i2) {
        if (i == -1) {
            i = qd.ik(this.su);
        }
        if (i <= 0) {
            return;
        }
        this.bu = i;
        if (!ihz() && !qt() && (this.ay & 8) != 8) {
            this.nr = fi(i);
        } else {
            this.nr = i2;
        }
        lr(this.bu, this.nr);
    }

    @Override // euthanasia.saneness
    public void ri() {
        ri(false, this.ihz);
        tan();
    }

    @Override // euthanasia.saneness
    public void ri(boolean z) {
        this.dzy = z;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x021b  */
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method */
    public void ri2(wjv wjvVar, WeakReference<Context> weakReference, boolean z) {
        final wjv wjvVar2;
        String strTq;
        wjv wjvVar3;
        wjv wjvVar4;
        if (wjvVar == null) {
            return;
        }
        ri(false, this.ihz);
        ri(this.ik, nr.ri());
        View view = this.qt;
        if (view != null) {
            qd.ri(view, 0);
        }
        ImageView imageView = this.sf;
        if (imageView != null) {
            qd.ri((View) imageView, 0);
        }
        qd.ri(this.f18104co, 0);
        if (this.sf == null || (wjvVar4 = this.fr) == null || wjvVar4.eu() == null || this.fr.eu().cuirassed() == null) {
            wjvVar2 = wjvVar;
        } else {
            wjvVar2 = wjvVar;
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.eu().cuirassed(), this.fr.eu().impassible(), this.fr.eu().adultoid(), this.sf, wjvVar2);
        }
        if (!TextUtils.isEmpty(wjvVar2.tpb())) {
            strTq = wjvVar2.tpb();
        } else if (!TextUtils.isEmpty(wjvVar2.xh())) {
            strTq = wjvVar2.xh();
        } else if (!TextUtils.isEmpty(wjvVar2.tq())) {
            strTq = wjvVar2.tq();
        } else {
            strTq = "";
        }
        if (this.aw != null && (wjvVar3 = this.fr) != null && wjvVar3.fb() != null && this.fr.fb().ri() != null) {
            qd.ri((View) this.aw, 0);
            qd.ri((View) this.bgr, 4);
            wjv wjvVar5 = this.fr;
            if (wjvVar5 != null && wjvVar5.zz()) {
                com.bytedance.sdk.openadsdk.qt.ka.ri(this.fr.fb()).ik(1).ri(new com.bytedance.sdk.openadsdk.qt.lr(wjvVar2, this.fr.fb().ri(), new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.5
                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                        Object objLr = sfVar.lr();
                        if (objLr != null) {
                            if (objLr instanceof Bitmap) {
                                com.bytedance.sdk.openadsdk.core.widget.ri riVar = fi.this.aw;
                                if (riVar != null) {
                                    riVar.setImageBitmap((Bitmap) objLr);
                                }
                            } else if ((objLr instanceof Drawable) && fi.this.aw != null) {
                                if (Build.VERSION.SDK_INT >= 28 && dumb.saneness.attabal(objLr)) {
                                    dumb.dern.attabal(objLr).start();
                                }
                                fi.this.aw.setImageDrawable((Drawable) objLr);
                            }
                            com.bytedance.sdk.openadsdk.ka.ik.lr(fi.this.fr, fi.this.fr != null ? ig.ik(wjvVar2.lji()) : null, "load_vast_icon_success", (JSONObject) null);
                        }
                    }

                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(int i, String str, Throwable th) {
                        fi.this.ri(i, str, wjvVar2);
                    }
                }));
                if (this.fr.sr() != null && this.fr.sr().lr() != null) {
                    this.fr.sr().lr().lr(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.fr.fb(), this.aw, wjvVar2);
            }
            wjv wjvVar6 = this.fr;
            if (wjvVar6 != null && wjvVar6.zz()) {
                try {
                    this.aw.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            wjv wjvVar7 = this.fr;
            if (wjvVar7 != null && wjvVar7.sr() != null && this.fr.sr().lr() != null) {
                final com.bytedance.sdk.openadsdk.core.aw.lr lrVarLr = this.fr.sr().lr();
                com.bytedance.sdk.openadsdk.core.widget.ri riVar = this.aw;
                if (riVar != null) {
                    riVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.aw.lr lrVar;
                            com.bytedance.sdk.openadsdk.core.widget.ri riVar2 = fi.this.aw;
                            if (riVar2 == null || !riVar2.isShown() || (lrVar = lrVarLr) == null) {
                                return;
                            }
                            lrVar.lr(fi.this.getVideoProgress());
                        }
                    });
                }
            }
            if (fr()) {
                this.aw.setOnClickListener(this.xd);
                this.aw.setOnTouchListener(this.xd);
            } else {
                this.aw.setOnClickListener(this.oh);
                this.aw.setOnTouchListener(this.oh);
            }
        } else if (!TextUtils.isEmpty(strTq)) {
            qd.ri((View) this.aw, 4);
            qd.ri((View) this.bgr, 0);
            TextView textView = this.bgr;
            if (textView != null) {
                textView.setText(strTq.substring(0, 1));
                if (fr()) {
                    this.bgr.setOnClickListener(this.xd);
                    this.bgr.setOnTouchListener(this.xd);
                } else {
                    this.bgr.setOnClickListener(this.oh);
                    this.bgr.setOnTouchListener(this.oh);
                }
            }
        }
        if (this.vr != null && !TextUtils.isEmpty(strTq)) {
            this.vr.setText(strTq);
            this.vr.setTag(570425345, "VAST_TITLE");
        }
        qd.ri((View) this.vr, 0);
        qd.ri((View) this.slm, 0);
        String strSkk = wjvVar2.skk();
        if (TextUtils.isEmpty(strSkk)) {
            int iAdz = wjvVar2.adz();
            if (iAdz == 2 || iAdz == 3) {
                strSkk = uq.ri(this.su, "tt_video_mobile_go_detail");
            } else if (iAdz == 4) {
                strSkk = uq.ri(this.su, "tt_video_download_apk");
            } else if (iAdz == 5) {
                strSkk = uq.ri(this.su, "tt_video_dial_phone");
            } else if (iAdz != 8) {
                strSkk = uq.ri(this.su, "tt_video_mobile_go_detail");
            } else {
                strSkk = uq.ri(this.su, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.slm;
        if (textView2 != null) {
            textView2.setText(strSkk);
            this.slm.setOnClickListener(this.oh);
            this.slm.setOnTouchListener(this.oh);
        }
        if (this.dzy) {
            return;
        }
        di(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final int i, final String str, final wjv wjvVar) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.fi.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put(InMobiNetworkValues.DESCRIPTION, i + ":" + str);
                    jSONObject.put("url", fi.this.fr.fb().ri());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(fi.this.fr, fi.this.fr != null ? ig.ik(wjvVar.lji()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // eliminate.saneness
    public void ri(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.ka.getHolder()) {
            return;
        }
        this.uq = true;
        if (slm()) {
            this.zf.ri(this, surfaceHolder);
        }
    }

    @Override // eliminate.saneness
    public void ri(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.ka.getHolder()) {
            return;
        }
        slm();
    }

    @Override // eliminate.saneness
    public void ri(SurfaceTexture surfaceTexture, int i, int i2) {
        this.uq = true;
        if (slm()) {
            this.zf.ri(this, surfaceTexture);
        }
    }

    @Override // eliminate.saneness
    public boolean ri(SurfaceTexture surfaceTexture) {
        this.uq = false;
        if (!slm()) {
            return true;
        }
        this.zf.lr(this, surfaceTexture);
        return true;
    }

    public void ri(boolean z, boolean z2, boolean z3) {
        qd.ri((View) this.fi, (!z || this.di.getVisibility() == 0) ? 8 : 0);
    }

    public void ri(boolean z, boolean z2) {
        qd.ri((View) this.fi, 8);
    }

    @Override // euthanasia.saneness
    public void ri(Drawable drawable) {
        ViewGroup viewGroup = this.ik;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
