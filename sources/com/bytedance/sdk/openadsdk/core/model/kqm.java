package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class kqm implements Handler.Callback {
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc BcA;
    private final com.bytedance.sdk.openadsdk.core.NXR.ZU.LD CG;
    private com.bytedance.sdk.openadsdk.common.sLN CSn;
    private com.bytedance.sdk.openadsdk.core.widget.kqm DY;
    private com.bytedance.sdk.openadsdk.core.widget.kqm FD;
    private Ivz HD;
    private Handler IeN;
    private long Ivz;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs JJ;
    ObjectAnimator JVA;
    View JXs;
    private View KPU;
    FrameLayout LD;
    private int Lpq;
    ImageView Lxb;
    private boolean NDz;
    com.bytedance.sdk.openadsdk.core.LD.Lxb NXR;
    private int Ns;
    private com.bytedance.sdk.openadsdk.core.OY.tD Nu;
    FrameLayout OY;
    private boolean Pw;
    ObjectAnimator QAg;
    private FrameLayout SS;
    com.bytedance.sdk.openadsdk.core.LD.LD STP;
    private TextView Sfi;
    private com.bytedance.sdk.openadsdk.common.ZU Sv;
    private String VU;
    private View VVE;
    FrameLayout ZU;
    private FrameLayout aH;
    private com.bytedance.sdk.openadsdk.core.JXs.OY ae;
    private TextView brP;
    private com.bytedance.sdk.component.QAg.ZU eK;
    final tD ebl;
    private ImageView foI;
    private String hg;
    private View id;
    private View kqm;
    RelativeLayout lc;
    private int le;
    TextView lk;
    ValueAnimator nBu;
    private final View nJ;
    private com.bytedance.sdk.openadsdk.ZU.JVA rW;
    Fo0 sLN;
    private ILoader sRq;
    private TextView tD;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU uxf;
    private AtomicBoolean wbY;
    private final Activity xan;
    private LinearLayout.LayoutParams xr;
    private final AtomicBoolean nE = new AtomicBoolean(false);
    private final AtomicBoolean dR = new AtomicBoolean(false);
    private volatile int Of = 0;
    private volatile int Ld = 0;
    private volatile int JZE = 0;
    private float LXE = -1.0f;
    private final AtomicBoolean bG = new AtomicBoolean(false);
    private long jeq = -1;

    public static class LD implements com.bytedance.sdk.openadsdk.ZU.nBu {
        private final tD LD;
        private final int Lxb;
        private final WeakReference<kqm> ZU;
        private final String lk;

        public LD(int i, tD tDVar, String str, kqm kqmVar) {
            this.Lxb = i;
            this.LD = tDVar;
            this.lk = str;
            this.ZU = new WeakReference<>(kqmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.ZU.nBu
        public void Lxb(int i) {
            kqm kqmVar = this.ZU.get();
            if (kqmVar != null) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.Lxb, kqmVar.JZE, kqmVar.Ld, kqmVar.Of - kqmVar.Ld, this.LD, this.lk, i);
            }
        }
    }

    public static class Lxb implements com.bytedance.sdk.component.JXs.OY {
        @Override // com.bytedance.sdk.component.JXs.OY
        public Bitmap Lxb(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), bitmap, 25);
        }
    }

    public kqm(Activity activity, final tD tDVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, View view) {
        this.xan = activity;
        this.ebl = tDVar;
        this.hg = str;
        this.CG = ld;
        this.nJ = view;
        this.le = nJ.Lxb(str);
        if (tDVar != null) {
            this.VU = tDVar.oc();
        }
        if (!TextUtils.isEmpty(this.VU)) {
            this.sRq = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().LD();
            int iLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.sRq, this.VU);
            this.Lpq = iLxb;
            this.Ns = iLxb > 0 ? 2 : 0;
        }
        boolean zZU = ZU(tDVar);
        boolean zJXs = JXs(tDVar);
        if (LD(tDVar)) {
            this.hg = "landingpage_split_screen";
        } else if (zZU) {
            this.hg = "landingpage_direct";
        } else if (zJXs) {
            this.hg = "aggregate_page";
        } else if (lk(tDVar)) {
            this.hg = "landingpage_split_ceiling";
        }
        this.NXR = new com.bytedance.sdk.openadsdk.core.LD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), tDVar, this.hg, nJ.Lxb(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.NXR.Lxb(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.NXR.Lxb(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.LD.LD ld2 = new com.bytedance.sdk.openadsdk.core.LD.LD(activity, tDVar, this.hg, nJ.Lxb(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.1
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD
            public boolean Lxb(nBu nbu, Map<String, Object> map2) {
                if (kqm.OY(tDVar) && kqm.this.JJ != null) {
                    kqm.this.JJ.Lxb(nbu);
                    kqm.this.JJ.Lxb(map2);
                    if (kqm.ebl(kqm.this.ebl) || kqm.this.NDz) {
                        return true;
                    }
                }
                return super.Lxb(nbu, map2);
            }
        };
        this.STP = ld2;
        ld2.Lxb(map);
        this.STP.Lxb(viewFindViewById);
        this.OY = frameLayout;
        if (zZU || zJXs) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.IeN = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ int JVA(kqm kqmVar) {
        int i = kqmVar.Of;
        kqmVar.Of = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean LD(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    public static /* synthetic */ int NXR(kqm kqmVar) {
        int i = kqmVar.Ld;
        kqmVar.Ld = i + 1;
        return i;
    }

    public static /* synthetic */ int STP(kqm kqmVar) {
        int i = kqmVar.JZE;
        kqmVar.JZE = i + 1;
        return i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        long jZU;
        tD tDVar;
        tD tDVar2;
        if (message.what == 100) {
            int i = message.arg1;
            if (!ZU(this.ebl) || (tDVar2 = this.ebl) == null || tDVar2.QAg() == null) {
                jZU = (!JXs(this.ebl) || (tDVar = this.ebl) == null || tDVar.QAg() == null) ? 20L : this.ebl.QAg().ZU();
            } else {
                jZU = this.ebl.QAg().LD();
            }
            Fo0 fo0 = this.sLN;
            if (fo0 != null) {
                fo0.Lxb(((long) i) * 1000, jZU * 1000);
            }
            long j = i;
            if (j >= jZU) {
                Fo0 fo1 = this.sLN;
                if (fo1 != null) {
                    fo1.Lxb(jZU * 1000, 100);
                }
            } else if (j < jZU && this.IeN != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i + 1;
                this.IeN.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }

    private void IeN() {
        if ((ZU(this.ebl) || JXs(this.ebl)) && (this.xan instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.LD)) {
            this.CG.JVA();
            this.CG.sLN();
        }
    }

    private void JVA() {
        Ivz ivz = new Ivz(this.xan);
        this.HD = ivz;
        ivz.LD(this.eK).lk(this.ebl.bG()).ZU(this.ebl.Lv()).Lxb(this.ebl).LD(JXs(this.ebl) ? this.le : -1).Lxb(this.ebl.BcA()).LD(this.hg).JXs(this.ebl.cf()).Lxb(this.eK).Lxb(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.15
            @Override // com.bytedance.sdk.openadsdk.core.widget.lc
            public void Lxb() {
                if (kqm.JXs(kqm.this.ebl) && (kqm.this.xan instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.LD)) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) kqm.this.xan).c_();
                } else if (kqm.this.JJ != null) {
                    kqm.this.JJ.LD();
                }
            }
        });
    }

    public static boolean JXs(tD tDVar) {
        return tDVar != null && tDVar.kqm() == 33;
    }

    private void NXR() {
        this.lc.setVisibility(8);
        if (ZU(this.ebl) || JXs(this.ebl) || !ZU() || lk(this.ebl)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.JVA = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.JVA.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.16
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) kqm.this.aH.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                kqm.this.Lxb((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                kqm.this.aH.setLayoutParams(layoutParams);
            }
        });
        this.JVA.start();
    }

    public static boolean OY(tD tDVar) {
        if (tDVar != null) {
            return tDVar.kqm() == 19 || tDVar.kqm() == 20;
        }
        return false;
    }

    public static boolean QAg(tD tDVar) {
        return tDVar != null && tDVar.kqm() == 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void STP() {
        LinearLayout.LayoutParams layoutParams;
        if (this.nE.get()) {
            return;
        }
        IeN();
        this.dR.set(true);
        this.CG.OY();
        com.bytedance.sdk.openadsdk.common.sLN sln = this.CSn;
        if (sln != null) {
            sln.LD();
        }
        if (JXs(this.ebl)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), this.ebl, this.hg, "show_agg_backup");
            View view = this.kqm;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.kqm.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.kqm.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.lc;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.VVE.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.VVE.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.VVE.setLayoutParams(layoutParams3);
        if (this.ebl.Lpq() != null && !TextUtils.isEmpty(this.ebl.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.ebl.Lpq().Lxb(), this.ebl.Lpq().LD(), this.ebl.Lpq().lk(), this.DY, this.ebl);
        }
        this.brP.setText(this.ebl.VU());
        this.tD.setText(this.ebl.ae());
        if (this.Sfi != null) {
            LD();
            this.Sfi.setClickable(true);
            this.Sfi.setOnClickListener(this.NXR);
            this.Sfi.setOnTouchListener(this.NXR);
        }
        if (!lk(this.ebl) || (layoutParams = this.xr) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            lk(8);
        } else {
            lk(0);
        }
    }

    private void VVE() {
        com.bytedance.sdk.openadsdk.common.JVA loadingStyle;
        com.bytedance.sdk.openadsdk.common.sLN sln = this.CSn;
        if (sln != null && (loadingStyle = sln.getLoadingStyle()) != null) {
            this.FD = loadingStyle.LD();
            this.ae = loadingStyle.lk();
        }
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.uxf;
        if (zu != null) {
            zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (kqm.this.uxf.getTag() != null) {
                        if (kqm.this.uxf.getTag().equals(1)) {
                            kqm.this.Lxb(3);
                        } else if (kqm.this.uxf.getTag().equals(2)) {
                            kqm.this.Lxb(4);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean brP() {
        return tD.JXs(this.ebl);
    }

    public static boolean ebl(tD tDVar) {
        return (tDVar == null || tDVar.fG() == 1 || !OY(tDVar)) ? false : true;
    }

    private void kqm() {
        if (ZU()) {
            this.id.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.foI, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.QAg = duration;
            duration.setRepeatMode(2);
            this.QAg.setRepeatCount(-1);
            this.QAg.start();
            this.id.setClickable(true);
            this.id.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!kqm.this.NDz) {
                        kqm.this.STP.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    kqm.this.nBu = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    kqm.this.nBu.setDuration(200L);
                    kqm.this.nBu.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) kqm.this.aH.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            kqm.this.Lxb((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            kqm.this.aH.setLayoutParams(layoutParams);
                        }
                    });
                    if (kqm.this.STP.ebl()) {
                        kqm.this.id.performClick();
                        kqm.this.NDz = true;
                    }
                    kqm.this.nBu.start();
                    kqm.this.id.setVisibility(8);
                    return true;
                }
            });
            this.id.setOnClickListener(this.STP);
        }
        if (!brP()) {
            this.OY.setVisibility(8);
            this.LD.setVisibility(0);
            this.Lxb.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.Lxb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    kqm kqmVar = kqm.this;
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(kqmVar.ebl, kqmVar.hg);
                }
            });
            tD tDVar = this.ebl;
            if (tDVar != null && tDVar.uxf() != null && this.ebl.uxf().size() > 0 && this.ebl.uxf().get(0) != null && !TextUtils.isEmpty(this.ebl.uxf().get(0).Lxb())) {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.ebl.uxf().get(0), this.Lxb, this.ebl);
            }
        }
        try {
            String strLxb = this.ebl.uxf().get(0).Lxb();
            com.bytedance.sdk.openadsdk.QAg.ZU.Lxb().Lxb(strLxb).Lxb(this.ebl.uxf().get(0).LD()).LD(this.ebl.uxf().get(0).lk()).JXs(le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).ZU(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).lk(2).Lxb(new Lxb()).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(this.ebl, strLxb, new com.bytedance.sdk.component.JXs.VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.7
                @Override // com.bytedance.sdk.component.JXs.VVE
                public void Lxb(int i, String str, @Nullable Throwable th) {
                }

                @Override // com.bytedance.sdk.component.JXs.VVE
                public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
                    try {
                        Bitmap bitmapLD = jva.LD();
                        if (bitmapLD != null && jva.lk() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources(), bitmapLD);
                            if (!kqm.this.brP()) {
                                kqm.this.LD.setBackground(bitmapDrawable);
                                return;
                            }
                            kqm.this.ZU.setBackground(bitmapDrawable);
                            View viewNBu = kqm.this.CG.nBu();
                            if (viewNBu == null || !(viewNBu.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewNBu.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static boolean lc(tD tDVar) {
        return ZU(tDVar) && !QAg(tDVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void nBu() {
        com.bytedance.sdk.openadsdk.common.sLN sln;
        com.bytedance.sdk.component.QAg.ZU zu = this.eK;
        if (zu != null && zu.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.Lxb.lk.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb()).Lxb(false).LD(false).Lxb(this.eK.getWebView());
            com.bytedance.sdk.component.QAg.ZU zu2 = this.eK;
            if (zu2 != null && zu2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.ZU.JVA jvaLxb = new com.bytedance.sdk.openadsdk.ZU.JVA(this.ebl, this.eK.getWebView(), new LD(this.Lpq, this.ebl, this.hg, this), this.Ns).Lxb(true);
                this.rW = jvaLxb;
                jvaLxb.Lxb(this.hg);
                com.bytedance.sdk.openadsdk.common.ZU zuLxb = nJ.Lxb(this.ebl, this.eK, this.xan, this.hg);
                this.Sv = zuLxb;
                if (zuLxb != null) {
                    zuLxb.Lxb(this.hg);
                }
                nJ.Lxb(this.ebl, this.eK);
            }
            JVA();
            this.eK.setLandingPage(true);
            this.eK.setTag(this.hg);
            this.eK.setMaterialMeta(this.ebl.Bg());
            com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs jXs = new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), this.HD, this.ebl.bG(), this.Sv, this.rW, true) { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.10
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    kqm.this.sLN();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    kqm.this.CG.JVA();
                    kqm.this.Ivz = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String strZU = com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs.ZU(str2);
                    boolean z = false;
                    if (this.lc != null) {
                        this.lc.Lxb(webView, i, str, str2, com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs.ZU(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z2 = strZU != null && strZU.startsWith("image");
                    if (strZU != null && strZU.startsWith("mp4")) {
                        z = true;
                    }
                    if (z2 || z || kqm.this.nE.get()) {
                        return;
                    }
                    kqm.this.STP();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        kqm.this.STP();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(kqm.this.VU)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        kqm.JVA(kqm.this);
                        WebResourceResponseModel webResourceResponseModelLxb = com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(kqm.this.sRq, kqm.this.VU, str);
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getWebResourceResponse() != null) {
                            kqm.NXR(kqm.this);
                            return webResourceResponseModelLxb.getWebResourceResponse();
                        }
                        if (webResourceResponseModelLxb != null && webResourceResponseModelLxb.getMsg() == 2) {
                            kqm.STP(kqm.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!kqm.lk(kqm.this.ebl) || nJ.Lxb(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(kqm.this.xan, (Class<?>) TTCeilingLandingPageActivity.class);
                    intent.putExtra("second_url", str);
                    com.bytedance.sdk.openadsdk.core.aH.Lxb().lc();
                    com.bytedance.sdk.openadsdk.core.aH.Lxb().Lxb(kqm.this.ebl);
                    com.bytedance.sdk.component.utils.LD.Lxb(this.ZU, intent, null);
                    return true;
                }
            };
            this.JJ = jXs;
            this.eK.setWebViewClient(jXs);
            this.JJ.Lxb(this.ebl);
            this.JJ.Lxb(this.hg);
            this.eK.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.HD, this.rW, this.Sv) { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.11
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (kqm.this.xan != null && !kqm.this.xan.isFinishing() && i == 100) {
                        kqm.this.sLN();
                    }
                    if (kqm.this.CSn != null) {
                        kqm.this.CSn.Lxb(i);
                    }
                }
            });
            if (this.BcA == null) {
                this.BcA = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), this.ebl, this.hg);
            }
            this.eK.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.12
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (kqm.this.BcA != null) {
                        kqm.this.BcA.ZU();
                    }
                }
            });
            com.bytedance.sdk.component.QAg.ZU zu3 = this.eK;
            zu3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu3.getWebView(), BuildConfig.VERSION_CODE));
            int i = Build.VERSION.SDK_INT;
            this.eK.setMixedContentMode(0);
            if (i >= 23) {
                this.eK.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.13
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                        if (kqm.this.rW != null) {
                            kqm.this.rW.LD(i3);
                        }
                    }
                });
            }
            this.eK.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.14
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (kqm.this.QAg()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            kqm.this.LXE = motionEvent.getY();
                        } else if (action == 1) {
                            if (le.Lxb(kqm.this.LXE, motionEvent.getY(), kqm.this.xan)) {
                                kqm.this.Lxb(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if ((!kqm.this.NDz || kqm.OY(kqm.this.ebl)) && !kqm.JXs(kqm.this.ebl)) {
                        kqm.this.STP.onTouch(view, motionEvent);
                    }
                    if ((!kqm.this.NDz || kqm.OY(kqm.this.ebl)) && !kqm.JXs(kqm.this.ebl) && motionEvent.getAction() == 1 && kqm.this.STP.ebl()) {
                        kqm.this.eK.getWebView().performClick();
                        kqm.this.NDz = true;
                    }
                    if (kqm.this.rW != null) {
                        kqm.this.rW.Lxb(motionEvent);
                    }
                    if (kqm.this.Sv == null) {
                        return false;
                    }
                    kqm.this.Sv.Lxb(motionEvent);
                    return false;
                }
            });
            this.eK.getWebView().setOnClickListener(this.STP);
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.ebl, this.hg, this.Ns);
            com.bytedance.sdk.openadsdk.utils.tD.Lxb(this.eK, this.ebl.Sv());
            this.Pw = true;
        }
        if (this.eK == null || (sln = this.CSn) == null) {
            return;
        }
        sln.Lxb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sLN() {
        if (this.nE.get() || this.dR.get()) {
            return;
        }
        this.nE.set(true);
        long jElapsedRealtime = this.jeq == -1 ? 0L : SystemClock.elapsedRealtime() - this.jeq;
        if (lk(this.ebl)) {
            com.bytedance.sdk.openadsdk.ZU.lk.lk(this.ebl, this.hg, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.ebl, this.hg, System.currentTimeMillis() - this.Ivz, true);
        NXR();
    }

    public boolean ZU() {
        return this.ebl.FGm() == 15 || this.ebl.FGm() == 16;
    }

    public void lk() {
        if (brP()) {
            try {
                String str = this.ebl.JJ().f;
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb().Lxb(str).Lxb(this.ebl.JJ().b).LD(this.ebl.JJ().f3307a).JXs(le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).ZU(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).lk(2).Lxb(new Lxb()).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(this.ebl, str, new com.bytedance.sdk.component.JXs.VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.4
                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(int i, String str2, @Nullable Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(com.bytedance.sdk.component.JXs.JVA<Bitmap> jva) {
                        try {
                            Bitmap bitmapLD = jva.LD();
                            if (bitmapLD != null && jva.lk() != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources(), bitmapLD);
                                View viewNBu = kqm.this.CG.nBu();
                                if (viewNBu == null || !(viewNBu.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewNBu.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public void JXs() {
        FrameLayout frameLayout = this.aH;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.KPU;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public boolean QAg() {
        AtomicBoolean atomicBoolean;
        return (!lk(this.ebl) || (atomicBoolean = this.wbY) == null || atomicBoolean.get()) ? false : true;
    }

    public void lc() {
        com.bytedance.sdk.component.QAg.ZU zu;
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.rW;
        if (jva != null && (zu = this.eK) != null) {
            jva.Lxb(zu);
        }
        Handler handler = this.IeN;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.nBu;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.nBu.cancel();
        }
        ObjectAnimator objectAnimator = this.JVA;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.JVA.cancel();
        }
        com.bytedance.sdk.openadsdk.common.sLN sln = this.CSn;
        if (sln != null) {
            sln.LD();
        }
        ObjectAnimator objectAnimator2 = this.QAg;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.QAg.ZU zu2 = this.eK;
        if (zu2 != null) {
            hg.Lxb(zu2.getWebView());
        }
        this.eK = null;
        Ivz ivz = this.HD;
        if (ivz != null) {
            ivz.JVA();
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva2 = this.rW;
        if (jva2 != null) {
            jva2.lk(true);
        }
        if (!TextUtils.isEmpty(this.VU) && this.Pw) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(this.Ld, this.Of, this.ebl);
        }
        com.bytedance.sdk.openadsdk.ebl.LD.Lxb().Lxb(this.sRq);
    }

    public static boolean ZU(tD tDVar) {
        if (tDVar == null) {
            return false;
        }
        if (QAg(tDVar)) {
            return true;
        }
        return tDVar.sRq() == 3 && tDVar.kqm() == 5 && !eK.LD(tDVar) && (tDVar.Za() == 0.0f || tDVar.Za() == 100.0f);
    }

    public void LD() {
        tD tDVar = this.ebl;
        if (tDVar == null || TextUtils.isEmpty(tDVar.xr())) {
            return;
        }
        this.Sfi.setText(this.ebl.xr());
    }

    public void OY() {
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.rW;
        if (jva != null) {
            jva.OY();
        }
    }

    public void ebl() {
        Ivz ivz = this.HD;
        if (ivz != null) {
            ivz.nBu();
        }
        com.bytedance.sdk.openadsdk.ZU.JVA jva = this.rW;
        if (jva != null) {
            jva.ebl();
        }
    }

    public static boolean LD(tD tDVar) {
        return tDVar != null && tDVar.sRq() == 3 && tDVar.kqm() == 6 && !eK.LD(tDVar) && tDVar.wCT() == 1 && (tDVar.Za() == 0.0f || tDVar.Za() == 100.0f);
    }

    public void Lxb(Fo0 fo0) {
        this.sLN = fo0;
    }

    public void Lxb() {
        long jLxb;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.QAg.ZU zu = (com.bytedance.sdk.component.QAg.ZU) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.Sfi);
        this.eK = zu;
        if (zu != null && !tD.Lxb(this.ebl)) {
            this.eK.f_();
        } else {
            le.Lxb((View) this.eK, 8);
        }
        this.aH = (FrameLayout) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.DY);
        this.CSn = (com.bytedance.sdk.openadsdk.common.sLN) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.CSn);
        this.id = this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.HD);
        this.foI = (ImageView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.eK);
        this.KPU = this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.CG);
        this.LD = (FrameLayout) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.brP);
        this.Lxb = (ImageView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.tD);
        this.lc = (RelativeLayout) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.aH);
        this.lk = (TextView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.aE);
        this.ZU = (FrameLayout) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.nBu);
        View viewFindViewById = this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.id);
        this.VVE = viewFindViewById;
        if (viewFindViewById == null) {
            this.VVE = this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.le);
        }
        this.kqm = this.xan.findViewById(com.bytedance.sdk.openadsdk.utils.STP.foI);
        this.brP = (TextView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.Ivz);
        this.tD = (TextView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.nE);
        this.DY = (com.bytedance.sdk.openadsdk.core.widget.kqm) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.KPU);
        this.Sfi = (TextView) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.xan);
        if (this.lk != null && this.ebl.QAg() != null) {
            this.lk.setText(this.ebl.QAg().JXs());
        }
        this.JXs = this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.hg);
        this.uxf = (com.bytedance.sdk.openadsdk.core.JXs.ZU) this.nJ.findViewById(com.bytedance.sdk.openadsdk.utils.STP.aBz);
        if ((ZU(this.ebl) || LD(this.ebl) || JXs(this.ebl) || lk(this.ebl)) && this.ebl.QAg() != null) {
            View view2 = this.JXs;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (JXs(this.ebl)) {
                jLxb = this.ebl.QAg().lk();
            } else {
                jLxb = this.ebl.QAg().Lxb();
            }
            com.bytedance.sdk.openadsdk.core.STP.lk().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.9
                @Override // java.lang.Runnable
                public void run() {
                    if (kqm.this.nE.get()) {
                        return;
                    }
                    kqm kqmVar = kqm.this;
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(kqmVar.ebl, kqmVar.hg, System.currentTimeMillis() - kqm.this.Ivz, false);
                    kqm.this.STP();
                }
            }, jLxb * 1000);
        }
        nBu();
        if (LD(this.ebl)) {
            kqm();
            if (!ZU()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.aH.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.aH.setLayoutParams(layoutParams);
            }
        }
        if ((ZU(this.ebl) || JXs(this.ebl)) && (view = this.KPU) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.sLN sln = this.CSn;
        if (sln != null) {
            sln.Lxb(this.ebl);
        }
        if (lk(this.ebl)) {
            VVE();
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb.Lxb(SystemClock.elapsedRealtime() - jElapsedRealtime, this.ebl, this.hg, this.sRq, this.VU);
    }

    public static boolean lk(tD tDVar) {
        return tDVar != null && tDVar.sRq() == 3 && tDVar.brP() == 38 && tDVar.wCT() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(int i) {
        le.Lxb((View) this.FD, i);
        le.Lxb((View) this.ae, i);
        if (this.dR.get()) {
            le.Lxb((View) this.brP, i);
            le.Lxb((View) this.tD, i);
            le.Lxb((View) this.DY, i);
            le.Lxb((View) this.Sfi, 0);
        }
    }

    public static boolean nBu(tD tDVar) {
        return (tDVar == null || !com.bytedance.sdk.openadsdk.core.kqm.ZU().HD() || !tDVar.le() || LD(tDVar) || ZU(tDVar) || JXs(tDVar)) ? false : true;
    }

    public static boolean Lxb(tD tDVar) {
        if (tDVar == null || QAg(tDVar)) {
            return false;
        }
        return ZU(tDVar) || LD(tDVar) || JXs(tDVar);
    }

    public void Lxb(float f) {
        try {
            this.CG.QAg();
        } catch (Throwable unused) {
        }
    }

    public void Lxb(@NonNull com.bytedance.sdk.openadsdk.core.OY.tD tDVar, FrameLayout frameLayout) {
        this.Nu = tDVar;
        this.SS = frameLayout;
    }

    public void Lxb(int i) {
        com.bytedance.sdk.openadsdk.core.OY.tD tDVar = this.Nu;
        if (tDVar != null) {
            tDVar.JXs(i);
        }
    }

    public void Lxb(final int i, com.bytedance.sdk.component.adexpress.LD.STP stp) {
        final float f;
        int iLk;
        if (i == 3 || LD(i)) {
            if (this.SS == null || stp == null) {
                return;
            }
            AtomicBoolean atomicBoolean = this.wbY;
            if (atomicBoolean != null) {
                if (i == 1) {
                    return;
                }
                if (i == 5 && atomicBoolean.get()) {
                    return;
                }
            }
            final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.KPU.getLayoutParams();
            this.xr = (LinearLayout.LayoutParams) this.aH.getLayoutParams();
            final float f2 = layoutParams.weight;
            VVE vveNBu = this.ebl.nBu();
            if (LD(i)) {
                if (vveNBu != null) {
                    iLk = vveNBu.LD();
                    f = iLk;
                } else {
                    f = 30.0f;
                }
            } else if (vveNBu != null) {
                iLk = vveNBu.lk();
                f = iLk;
            } else {
                f = 70.0f;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.SS.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            }
            final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            final int i2 = layoutParams3.height;
            final int i3 = layoutParams3.width;
            final int i4 = layoutParams3.leftMargin;
            final int i5 = layoutParams3.topMargin;
            final int iLk2 = le.lk(this.xan, (float) stp.OY());
            final int iLk3 = le.lk(this.xan, (float) stp.QAg());
            final int iLk4 = le.lk(this.xan, (float) stp.lc());
            final int iLk5 = le.lk(this.xan, (float) stp.ebl());
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.nBu = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(500L);
            this.nBu.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.kqm.8
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams;
                    float f3 = f2;
                    layoutParams4.weight = AbstractC5044xl.w(f, f3, fFloatValue, f3);
                    kqm.this.xr.weight = 100.0f - layoutParams.weight;
                    if (kqm.this.KPU != null) {
                        kqm.this.KPU.setLayoutParams(layoutParams);
                    }
                    if (kqm.this.aH != null) {
                        kqm.this.aH.setLayoutParams(kqm.this.xr);
                    }
                    if (kqm.this.xr.weight < 30.0f) {
                        kqm.this.lk(8);
                    } else {
                        kqm.this.lk(0);
                    }
                    FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                    int i6 = i3;
                    layoutParams5.width = i6 + ((int) ((iLk2 - i6) * fFloatValue));
                    int i7 = i2;
                    layoutParams5.height = i7 + ((int) ((iLk3 - i7) * fFloatValue));
                    int i8 = i4;
                    layoutParams5.leftMargin = i8 + ((int) ((iLk4 - i8) * fFloatValue));
                    int i9 = i5;
                    layoutParams5.topMargin = i9 + ((int) ((iLk5 - i9) * fFloatValue));
                    if (kqm.this.SS != null) {
                        kqm.this.SS.setLayoutParams(layoutParams3);
                    }
                    kqm.this.Lxb(0.0f);
                    if (fFloatValue == 1.0f) {
                        if (kqm.this.uxf != null) {
                            le.Lxb((View) kqm.this.uxf, 0);
                            if (kqm.this.LD(i)) {
                                kqm.this.uxf.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(kqm.this.xan, "tt_ad_zoom_down"));
                                kqm.this.uxf.setTag(1);
                            } else {
                                kqm.this.uxf.setImageDrawable(com.bytedance.sdk.component.utils.tD.lk(kqm.this.xan, "tt_ad_zoom_up"));
                                kqm.this.uxf.setTag(2);
                            }
                        }
                        if (kqm.this.wbY == null) {
                            kqm.this.wbY = new AtomicBoolean();
                        }
                        kqm.this.wbY.set(kqm.this.LD(i));
                    }
                }
            });
            com.bytedance.sdk.openadsdk.ZU.lk.ZU(this.ebl, this.hg, i);
            this.nBu.start();
            if (this.bG.compareAndSet(false, true)) {
                this.jeq = SystemClock.elapsedRealtime();
            }
            le.Lxb((View) this.uxf, 8);
        }
    }
}
