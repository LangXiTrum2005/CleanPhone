package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;
import dumb.dern;
import dumb.saneness;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ac implements Handler.Callback {
    private com.bytedance.sdk.openadsdk.core.di.mj aac;
    private com.bytedance.sdk.openadsdk.core.widget.bu ac;
    private ValueAnimator ajz;
    com.bytedance.sdk.openadsdk.core.ik.ri aw;
    private FrameLayout ay;
    com.bytedance.sdk.openadsdk.core.ik.lr bgr;
    private View bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    attabal.wireman f18132co;
    RelativeLayout di;
    private long dw;
    private final View dzy;
    private com.bytedance.sdk.openadsdk.core.widget.ri.fi feb;
    View fi;
    private com.bytedance.sdk.openadsdk.common.co fr;
    private FrameLayout gcp;
    private final Activity hcw;
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ig;
    private ImageView igq;
    private TextView ihz;
    TextView ik;
    ObjectAnimator jbs;
    FrameLayout ka;
    private boolean kt;
    FrameLayout lr;
    FrameLayout mj;
    private AtomicBoolean nd;
    private TextView nr;
    private String oh;
    private lr pc;
    private int pv;
    private com.bytedance.sdk.openadsdk.ka.aw qd;
    private com.bytedance.sdk.openadsdk.core.jbs.ac qh;
    ValueAnimator qt;
    ImageView ri;
    private com.bytedance.sdk.openadsdk.core.di.ka rzk;
    ObjectAnimator sf;
    private int siy;
    private View slm;
    private boolean srn;
    private View su;
    private TextView tan;
    private ILoader tnn;
    private final boolean ud;
    private dzy uq;
    private Handler vr;
    private int whw;
    private com.bytedance.sdk.component.jbs.di wjv;
    private final com.bytedance.sdk.openadsdk.core.bgr.ka.lr xd;
    private LinearLayout.LayoutParams xe;
    final wjv xha;
    private com.bytedance.sdk.openadsdk.common.fi xm;
    private com.bytedance.sdk.openadsdk.core.widget.bu zb;
    private View zf;
    private String zyn;
    private final AtomicBoolean ory = new AtomicBoolean(false);
    private final AtomicBoolean jc = new AtomicBoolean(false);
    private volatile int fe = 0;
    private volatile int ta = 0;
    private volatile int bnj = 0;
    private float tw = -1.0f;
    private final AtomicBoolean yjm = new AtomicBoolean(false);
    private long saa = -1;
    private final AtomicBoolean zk = new AtomicBoolean(false);
    private long luy = 0;

    public static class lr implements com.bytedance.sdk.openadsdk.ka.co {
        private final String ik;
        private final WeakReference<ac> ka;
        private final wjv lr;
        private final int ri;

        public lr(int i, wjv wjvVar, String str, ac acVar) {
            this.ri = i;
            this.lr = wjvVar;
            this.ik = str;
            this.ka = new WeakReference<>(acVar);
        }

        @Override // com.bytedance.sdk.openadsdk.ka.co
        public void ri(int i) {
            ac acVar = this.ka.get();
            if (acVar != null) {
                com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.ri, acVar.bnj, acVar.ta, acVar.fe - acVar.ta, this.lr, this.ik, i);
            }
        }
    }

    public static class ri implements com.bytedance.sdk.component.fi.mj {
        @Override // com.bytedance.sdk.component.fi.mj
        public Bitmap ri(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.ka.ri.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), bitmap, 25);
        }
    }

    public ac(Activity activity, final wjv wjvVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, View view) {
        this.hcw = activity;
        this.xha = wjvVar;
        this.oh = str;
        this.xd = lrVar;
        this.dzy = view;
        this.pv = ig.ri(str);
        if (wjvVar != null) {
            this.zyn = wjvVar.mvf();
        }
        this.ud = wjvVar.zyn() && fi(wjvVar);
        if (!TextUtils.isEmpty(this.zyn)) {
            this.tnn = com.bytedance.sdk.openadsdk.xha.lr.ri().lr();
            int iRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.tnn, this.zyn);
            this.siy = iRi;
            this.whw = iRi > 0 ? 2 : 0;
        }
        boolean zKa = ka(wjvVar);
        boolean zXha = xha(wjvVar);
        boolean zLr = lr(wjvVar);
        if (zLr) {
            this.oh = "landingpage_split_screen";
        } else if (zKa) {
            this.oh = "landingpage_direct";
        } else if (zXha) {
            this.oh = "aggregate_page";
        } else if (ik(wjvVar)) {
            this.oh = "landingpage_split_ceiling";
        }
        this.aw = new com.bytedance.sdk.openadsdk.core.ik.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), wjvVar, this.oh, ig.ri(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.aw.ri(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.aw.ri(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar2 = new com.bytedance.sdk.openadsdk.core.ik.lr(activity, wjvVar, this.oh, ig.ri(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.1
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr
            public boolean ri(co coVar, Map<String, Object> map2) {
                if (ac.qt(wjvVar) && ac.this.feb != null) {
                    ac.this.feb.ri(coVar);
                    ac.this.feb.ri(map2);
                    if (ac.jbs(ac.this.xha) || ac.this.kt) {
                        return true;
                    }
                }
                return super.ri(coVar, map2);
            }
        };
        this.bgr = lrVar2;
        lrVar2.ri(map);
        this.bgr.ri(viewFindViewById);
        this.mj = frameLayout;
        if (zLr || zKa || zXha) {
            try {
                this.vr = new Handler(Looper.getMainLooper(), this);
            } catch (Exception unused) {
                return;
            }
        }
        if (wjvVar.zyn()) {
            return;
        }
        if (zKa || zXha) {
            Handler handler = this.vr;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static /* synthetic */ int bgr(ac acVar) {
        int i = acVar.ta;
        acVar.ta = i + 1;
        return i;
    }

    public static /* synthetic */ int co(ac acVar) {
        int i = acVar.fe;
        acVar.fe = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ik(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    public static /* synthetic */ int vr(ac acVar) {
        int i = acVar.bnj;
        acVar.bnj = i + 1;
        return i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long jKa;
        wjv wjvVar;
        wjv wjvVar2;
        int i = message.what;
        if (i == 100) {
            int i2 = message.arg1;
            if (!ka(this.xha) || (wjvVar2 = this.xha) == null || wjvVar2.ay() == null) {
                jKa = (!xha(this.xha) || (wjvVar = this.xha) == null || wjvVar.ay() == null) ? 20L : this.xha.ay().ka();
            } else {
                jKa = this.xha.ay().lr();
            }
            attabal.wireman wiremanVar = this.f18132co;
            if (wiremanVar != null) {
                wiremanVar.ri(((long) i2) * 1000, jKa * 1000);
            }
            long j = i2;
            if (j >= jKa) {
                attabal.wireman wiremanVar2 = this.f18132co;
                if (wiremanVar2 != null) {
                    wiremanVar2.ri(jKa * 1000, 100);
                }
            } else if (j < jKa && this.vr != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i2 + 1;
                this.vr.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i == 101) {
            qt();
        }
        return true;
    }

    private void ac() {
        com.bytedance.sdk.component.jbs.di diVar = this.wjv;
        if (diVar == null || diVar.getWebView() == null) {
            return;
        }
        this.fe = this.wjv.ri;
        this.ta = this.wjv.lr;
        this.bnj = this.wjv.ik;
        if (this.wjv.lr()) {
            this.xd.zb();
            this.dw = System.currentTimeMillis();
        }
        if (this.wjv.ka()) {
            aw();
        }
        if (this.wjv.ik()) {
            aw();
            int iRi = ig.ri(this.wjv.getWebView());
            lr lrVar = this.pc;
            if (lrVar != null) {
                lrVar.ri(iRi != 1 ? 0 : 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        this.ory.get();
        this.jc.get();
        if (this.ory.get() || this.jc.get()) {
            return;
        }
        this.ory.set(true);
        ri(0);
        long jElapsedRealtime = this.saa == -1 ? 0L : SystemClock.elapsedRealtime() - this.saa;
        if (ik(this.xha)) {
            com.bytedance.sdk.openadsdk.ka.ik.ik(this.xha, this.oh, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(this.xha, this.oh, System.currentTimeMillis() - this.dw, true);
        bgr();
    }

    private void bgr() {
        this.di.setVisibility(8);
        if (ka(this.xha) || xha(this.xha) || !ka() || ik(this.xha)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.sf = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.sf.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ac.this.ay.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                ac.this.ri((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                ac.this.ay.setLayoutParams(layoutParams);
            }
        });
        this.sf.start();
    }

    private void bu() {
        com.bytedance.sdk.openadsdk.common.sf loadingStyle;
        com.bytedance.sdk.openadsdk.common.co coVar = this.fr;
        if (coVar != null && (loadingStyle = coVar.getLoadingStyle()) != null) {
            this.zb = loadingStyle.lr();
            this.aac = loadingStyle.ik();
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = this.rzk;
        if (kaVar != null) {
            kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ac.this.rzk.getTag() != null) {
                        if (ac.this.rzk.getTag().equals(1)) {
                            ac.this.lr(3);
                        } else if (ac.this.rzk.getTag().equals(2)) {
                            ac.this.lr(4);
                        }
                    }
                }
            });
        }
    }

    private void co() {
        dzy dzyVar = new dzy(this.hcw);
        this.uq = dzyVar;
        dzyVar.ri(this.xd);
        this.uq.lr(this.wjv).ri(com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(this.xha)).ik(this.xha.tn()).ka(this.xha.yjg()).ri(this.xha).lr(xha(this.xha) ? this.pv : -1).ri(this.xha.hd()).lr(this.oh).fi(this.xha.uo()).ri(this.wjv).ri(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.fi
            public void ri() {
                if (ac.xha(ac.this.xha) && (ac.this.hcw instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.lr)) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ka.lr) ac.this.hcw).xd();
                } else if (ac.this.feb != null) {
                    ac.this.feb.ik();
                }
            }
        });
    }

    public static boolean di(wjv wjvVar) {
        su suVarDob;
        return (wjvVar == null || (suVarDob = wjvVar.dob()) == null || suVarDob.ri() != 2) ? false : true;
    }

    public static boolean fi(wjv wjvVar) {
        su suVarDob;
        return wjvVar != null && wjvVar.adz() == 3 && !dw.lr(wjvVar) && (wjvVar.gz() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || wjvVar.gz() == 100.0f) && (suVarDob = wjvVar.dob()) != null && suVarDob.ri() == 1;
    }

    public static boolean jbs(wjv wjvVar) {
        return (wjvVar == null || wjvVar.ecl() == 1 || !qt(wjvVar)) ? false : true;
    }

    public static boolean mj(wjv wjvVar) {
        return ka(wjvVar) && !sf(wjvVar);
    }

    private void nr() {
        if (ka()) {
            this.su.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.igq, "translationY", 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L);
            this.jbs = duration;
            duration.setRepeatMode(2);
            this.jbs.setRepeatCount(-1);
            this.jbs.start();
            this.su.setClickable(true);
            this.su.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!ac.this.kt) {
                        ac.this.bgr.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    ac.this.qt = ObjectAnimator.ofFloat(this, "timeSlide", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ac.this.qt.setDuration(200L);
                    ac.this.qt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ac.this.ay.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            ac.this.ri((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            ac.this.ay.setLayoutParams(layoutParams);
                        }
                    });
                    if (ac.this.bgr.di()) {
                        ac.this.su.performClick();
                        ac.this.kt = true;
                    }
                    ac.this.qt.start();
                    ac.this.su.setVisibility(8);
                    return true;
                }
            });
            this.su.setOnClickListener(this.bgr);
        }
        if (!tan()) {
            this.mj.setVisibility(8);
            this.lr.setVisibility(0);
            this.ri.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.ri.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ac acVar = ac.this;
                    com.bytedance.sdk.openadsdk.ka.ik.lr(acVar.xha, acVar.oh);
                }
            });
            wjv wjvVar = this.xha;
            if (wjvVar != null && wjvVar.rbz() != null && this.xha.rbz().size() > 0 && this.xha.rbz().get(0) != null && !TextUtils.isEmpty(this.xha.rbz().get(0).ri())) {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.xha.rbz().get(0), this.ri, this.xha, new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.7
                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                        if (ac.this.vr != null) {
                            ac.this.vr.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(int i, String str, Throwable th) {
                        if (ac.this.vr != null) {
                            ac.this.vr.removeMessages(101);
                        }
                        ac.this.qt();
                    }
                });
            }
        }
        try {
            String strRi = this.xha.rbz().get(0).ri();
            com.bytedance.sdk.openadsdk.qt.ka.ri().ri(strRi).ri(this.xha.rbz().get(0).lr()).lr(this.xha.rbz().get(0).ik()).fi(qd.fi(com.bytedance.sdk.openadsdk.core.nr.ri())).ka(qd.ik(com.bytedance.sdk.openadsdk.core.nr.ri())).ik(1).ri(new ri()).ri(new com.bytedance.sdk.openadsdk.qt.lr(this.xha, strRi, new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.8
                @Override // com.bytedance.sdk.component.fi.slm
                public void ri(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.fi.slm
                public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objLr = sfVar.lr();
                        if (objLr != null && sfVar.ik() != null) {
                            if (objLr instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.nr.ri().getResources(), (Bitmap) objLr);
                            } else if (objLr instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                                    dern.attabal(objLr).start();
                                }
                                bitmapDrawable = (Drawable) objLr;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!ac.this.tan()) {
                                ac.this.lr.setBackground(bitmapDrawable);
                                return;
                            }
                            ac.this.ka.setBackground(bitmapDrawable);
                            View viewSlm = ac.this.xd.slm();
                            if (viewSlm == null || !(viewSlm.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewSlm.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static boolean qt(wjv wjvVar) {
        if (wjvVar != null) {
            return wjvVar.nd() == 19 || wjvVar.nd() == 20;
        }
        return false;
    }

    private void sf() {
        ac acVar;
        com.bytedance.sdk.component.jbs.di diVar = this.wjv;
        if (diVar == null || diVar.getWebView() == null) {
            acVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.ri.ik.ri(com.bytedance.sdk.openadsdk.core.nr.ri()).ri(false).lr(false).ri(this.wjv.getWebView());
            com.bytedance.sdk.component.jbs.di diVar2 = this.wjv;
            if (diVar2 != null && diVar2.getWebView() != null) {
                this.pc = new lr(this.siy, this.xha, this.oh, this);
                if (this.wjv.k_() && (this.wjv.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.ri.fi)) {
                    com.bytedance.sdk.openadsdk.ka.aw awVarLr = ((com.bytedance.sdk.openadsdk.core.widget.ri.fi) this.wjv.getWebViewClient()).lr();
                    this.qd = awVarLr;
                    if (awVarLr != null) {
                        awVarLr.ri(this.pc);
                        this.qd.lr(true);
                    }
                } else {
                    this.qd = new com.bytedance.sdk.openadsdk.ka.aw(this.xha, this.wjv.getWebView(), this.pc, this.whw).lr(true);
                }
                this.qd.ri(this.oh);
                com.bytedance.sdk.openadsdk.common.fi fiVarRi = ig.ri(this.xha, this.wjv, this.hcw, this.oh);
                this.xm = fiVarRi;
                if (fiVarRi != null) {
                    fiVarRi.ri(this.oh);
                }
                ig.ri(this.xha, this.wjv);
            }
            co();
            if (this.wjv.k_()) {
                ac();
            }
            this.wjv.setLandingPage(true);
            this.wjv.setTag(this.oh);
            this.wjv.setMaterialMeta(this.xha.nb());
            acVar = this;
            com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(com.bytedance.sdk.openadsdk.core.nr.ri(), this.uq, this.xha.tn(), this.xm, this.qd, true) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    ac.this.aw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    ac.this.xd.zb();
                    ac.this.dw = System.currentTimeMillis();
                    if (!ac.lr(ac.this.xha) || ac.this.vr == null || wjv.fi(ac.this.xha)) {
                        return;
                    }
                    ac.this.vr.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String strKa = com.bytedance.sdk.openadsdk.core.widget.ri.fi.ka(str2);
                    boolean z = false;
                    if (this.di != null) {
                        this.di.ri(webView, i, str, str2, com.bytedance.sdk.openadsdk.core.widget.ri.fi.ka(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z2 = strKa != null && strKa.startsWith("image");
                    if (strKa != null && strKa.startsWith("mp4")) {
                        z = true;
                    }
                    if (z2 || z || ac.this.ory.get()) {
                        return;
                    }
                    ac.this.vr();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        ac.this.vr();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(ac.this.zyn)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        ac.co(ac.this);
                        WebResourceResponseModel webResourceResponseModelRi = com.bytedance.sdk.openadsdk.xha.lr.ri().ri(ac.this.tnn, ac.this.zyn, str);
                        if (webResourceResponseModelRi != null && webResourceResponseModelRi.getWebResourceResponse() != null) {
                            ac.bgr(ac.this);
                            return webResourceResponseModelRi.getWebResourceResponse();
                        }
                        if (webResourceResponseModelRi != null && webResourceResponseModelRi.getMsg() == 2) {
                            ac.vr(ac.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ac.ri("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!ac.ik(ac.this.xha) || ig.ri(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(ac.this.hcw, (Class<?>) TTCeilingLandingPageActivity.class);
                    ac.this.xha.fi(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.dw.ri().ri(ac.this.xha));
                    com.bytedance.sdk.component.utils.lr.ri(this.ka, intent, null);
                    return true;
                }
            };
            acVar.feb = fiVar;
            acVar.wjv.setWebViewClient(fiVar);
            acVar.feb.ri(acVar.xha);
            acVar.feb.ri(acVar.oh);
            acVar.feb.ri(acVar.xd);
            acVar.wjv.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(acVar.uq, acVar.qd, acVar.xm) { // from class: com.bytedance.sdk.openadsdk.core.model.ac.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (ac.this.hcw != null && !ac.this.hcw.isFinishing() && i == 100) {
                        ac.this.aw();
                    }
                    if (ac.this.fr != null) {
                        ac.this.fr.ri(i);
                    }
                }
            });
            if (acVar.ig == null) {
                acVar.ig = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), acVar.oh);
            }
            acVar.wjv.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (ac.this.ig != null) {
                        ac.this.ig.ri(ac.this.xha);
                    }
                }
            });
            com.bytedance.sdk.component.jbs.di diVar3 = acVar.wjv;
            diVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.tan.ri(diVar3.getWebView(), BuildConfig.VERSION_CODE));
            acVar.wjv.setMixedContentMode(0);
            acVar.wjv.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (ac.this.qd != null) {
                        ac.this.qd.lr(i2);
                    }
                }
            });
            acVar.wjv.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (ac.this.jbs()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            ac.this.tw = motionEvent.getY();
                        } else if (action == 1) {
                            if (qd.ri(ac.this.tw, motionEvent.getY(), ac.this.hcw)) {
                                ac.this.lr(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (ac.this.ud && motionEvent.getAction() == 1 && ac.this.xd != null) {
                        ac.this.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ac.this.xd.qh();
                            }
                        });
                    }
                    if ((!ac.this.kt || ac.qt(ac.this.xha)) && !ac.xha(ac.this.xha)) {
                        ac.this.bgr.onTouch(view, motionEvent);
                    }
                    if ((!ac.this.kt || ac.qt(ac.this.xha)) && !ac.xha(ac.this.xha) && motionEvent.getAction() == 1 && ac.this.bgr.di()) {
                        ac.this.wjv.getWebView().performClick();
                        ac.this.kt = true;
                    }
                    if (ac.this.qd != null) {
                        ac.this.qd.ri(motionEvent);
                    }
                    if (ac.this.xm == null) {
                        return false;
                    }
                    ac.this.xm.ri(motionEvent);
                    return false;
                }
            });
            acVar.wjv.getWebView().setOnClickListener(acVar.bgr);
            com.bytedance.sdk.openadsdk.ka.ik.ri(acVar.xha, acVar.oh, acVar.whw);
            if (!acVar.wjv.k_()) {
                com.bytedance.sdk.component.utils.ac.ri("LandingPageModel", "loadUrlWithRefer url  = " + acVar.xha.smj());
                com.bytedance.sdk.openadsdk.utils.uq.ri(acVar.wjv, acVar.xha.smj());
            }
            acVar.srn = true;
        }
        com.bytedance.sdk.component.jbs.di diVar4 = acVar.wjv;
        if (diVar4 == null || acVar.fr == null || diVar4.ik()) {
            return;
        }
        acVar.fr.ri();
    }

    private void slm() {
        if ((ka(this.xha) || xha(this.xha)) && (this.hcw instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.lr)) {
            this.xd.zb();
            this.xd.bu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tan() {
        return wjv.fi(this.xha);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vr() {
        LinearLayout.LayoutParams layoutParams;
        if (this.ory.get()) {
            return;
        }
        slm();
        this.jc.set(true);
        ri(-1);
        this.xd.co();
        com.bytedance.sdk.openadsdk.common.co coVar = this.fr;
        if (coVar != null) {
            coVar.lr();
        }
        if (xha(this.xha)) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), this.xha, this.oh, "show_agg_backup");
            View view = this.bu;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bu.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.bu.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.di;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.2
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
        this.slm.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.slm.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.slm.setLayoutParams(layoutParams3);
        if (this.xha.fb() != null && !TextUtils.isEmpty(this.xha.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.xha.fb().ri(), this.xha.fb().lr(), this.xha.fb().ik(), this.ac, this.xha);
        }
        this.nr.setText(this.xha.tpb());
        this.tan.setText(this.xha.tq());
        if (this.ihz != null) {
            lr();
            this.ihz.setClickable(true);
            this.ihz.setOnClickListener(this.aw);
            this.ihz.setOnTouchListener(this.aw);
        }
        if (!ik(this.xha) || (layoutParams = this.xe) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            ka(8);
        } else {
            ka(0);
        }
    }

    public static boolean xha(wjv wjvVar) {
        return wjvVar != null && wjvVar.nd() == 33;
    }

    public boolean ka() {
        return this.xha.vz() == 15 || this.xha.vz() == 16;
    }

    public void ik() {
        if (tan()) {
            try {
                String strCuirassed = this.xha.eu().cuirassed();
                com.bytedance.sdk.openadsdk.qt.ka.ri().ri(strCuirassed).ri(this.xha.eu().impassible()).lr(this.xha.eu().adultoid()).fi(qd.fi(com.bytedance.sdk.openadsdk.core.nr.ri())).ka(qd.ik(com.bytedance.sdk.openadsdk.core.nr.ri())).ik(2).ri(new ri()).ri(new com.bytedance.sdk.openadsdk.qt.lr(this.xha, strCuirassed, new com.bytedance.sdk.component.fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.4
                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.fi.slm
                    public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                        try {
                            Object objLr = sfVar.lr();
                            if (objLr != null && sfVar.ik() != null) {
                                BitmapDrawable bitmapDrawable = objLr instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.nr.ri().getResources(), (Bitmap) objLr) : null;
                                View viewSlm = ac.this.xd.slm();
                                if (bitmapDrawable == null || viewSlm == null || !(viewSlm.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewSlm.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.ac.ik("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public void lr() {
        wjv wjvVar = this.xha;
        if (wjvVar == null || TextUtils.isEmpty(wjvVar.skk())) {
            return;
        }
        this.ihz.setText(this.xha.skk());
    }

    public void mj() {
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.qd;
        if (awVar != null) {
            awVar.mj();
        }
    }

    public void xha() {
        dzy dzyVar = this.uq;
        if (dzyVar != null) {
            dzyVar.sf();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.qd;
        if (awVar != null) {
            awVar.xha();
        }
    }

    public static boolean ka(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        if (sf(wjvVar)) {
            return true;
        }
        return wjvVar.adz() == 3 && (wjvVar.nd() == 5 || fi(wjvVar)) && !dw.lr(wjvVar) && (wjvVar.gz() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || wjvVar.gz() == 100.0f);
    }

    public void di() {
        com.bytedance.sdk.component.jbs.di diVar;
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.qd;
        if (awVar != null && (diVar = this.wjv) != null) {
            awVar.ri(diVar);
        }
        Handler handler = this.vr;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.ajz;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.ajz.cancel();
        }
        ValueAnimator valueAnimator2 = this.qt;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.qt.cancel();
        }
        ObjectAnimator objectAnimator = this.sf;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.sf.cancel();
        }
        com.bytedance.sdk.openadsdk.common.co coVar = this.fr;
        if (coVar != null) {
            coVar.lr();
        }
        ObjectAnimator objectAnimator2 = this.jbs;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.jbs.di diVar2 = this.wjv;
        if (diVar2 != null) {
            srn.ri(diVar2.getWebView());
        }
        this.wjv = null;
        dzy dzyVar = this.uq;
        if (dzyVar != null) {
            dzyVar.co();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar2 = this.qd;
        if (awVar2 != null) {
            awVar2.ka(true);
        }
        if (!TextUtils.isEmpty(this.zyn) && this.srn) {
            com.bytedance.sdk.openadsdk.ka.ik.ri.ri(this.ta, this.fe, this.xha);
        }
        com.bytedance.sdk.openadsdk.xha.lr.ri().ri(this.tnn);
    }

    public boolean jbs() {
        AtomicBoolean atomicBoolean;
        return (!ik(this.xha) || (atomicBoolean = this.nd) == null || atomicBoolean.get()) ? false : true;
    }

    public void qt() {
        if ("landingpage_split_screen".equals(this.oh) && com.bytedance.sdk.openadsdk.wjv.fi.ri("default_split_style", false) && this.zk.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.10
                @Override // java.lang.Runnable
                public void run() {
                    ac.this.ajz = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ac.this.ajz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (ac.this.zf != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ac.this.zf.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                ac.this.zf.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    ac.this.ajz.setDuration(500L);
                    ac.this.ajz.start();
                    if (ac.this.su != null) {
                        ac.this.su.setVisibility(8);
                    }
                }
            });
        }
    }

    public static boolean lr(wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.nd() == 6 && !dw.lr(wjvVar) && wjvVar.bbu() == 1 && (wjvVar.gz() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || wjvVar.gz() == 100.0f);
    }

    public void fi() {
        FrameLayout frameLayout = this.ay;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.zf;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka(int i) {
        qd.ri((View) this.zb, i);
        qd.ri((View) this.aac, i);
        if (this.jc.get()) {
            qd.ri((View) this.nr, i);
            qd.ri((View) this.tan, i);
            qd.ri((View) this.ac, i);
            qd.ri((View) this.ihz, 0);
        }
    }

    public void ri(attabal.wireman wiremanVar) {
        this.f18132co = wiremanVar;
    }

    public void lr(int i) {
        com.bytedance.sdk.openadsdk.core.jbs.ac acVar = this.qh;
        if (acVar != null) {
            acVar.fi(i);
        }
    }

    public void ri() {
        long jRi;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.jbs.di diVar = (com.bytedance.sdk.component.jbs.di) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.uq);
        this.wjv = diVar;
        if (diVar != null && !wjv.ri(this.xha)) {
            if (!this.wjv.k_()) {
                this.wjv.fi();
            }
        } else {
            qd.ri((View) this.wjv, 8);
        }
        this.ay = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ihz);
        this.fr = (com.bytedance.sdk.openadsdk.common.co) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.su);
        this.su = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.wjv);
        this.igq = (ImageView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ay);
        this.zf = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.dzy);
        this.lr = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.tan);
        this.ri = (ImageView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ac);
        this.di = (RelativeLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.fr);
        this.ik = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.yj);
        this.ka = (FrameLayout) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f18175co);
        View viewFindViewById = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.igq);
        this.slm = viewFindViewById;
        if (viewFindViewById == null) {
            this.slm = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ig);
        }
        this.bu = this.hcw.findViewById(com.bytedance.sdk.openadsdk.utils.slm.zf);
        this.nr = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.ory);
        this.tan = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.hcw);
        this.ac = (com.bytedance.sdk.openadsdk.core.widget.bu) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.dw);
        this.ihz = (TextView) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.oh);
        if (this.ik != null && this.xha.ay() != null) {
            this.ik.setText(this.xha.ay().fi());
        }
        this.fi = this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.xd);
        this.rzk = (com.bytedance.sdk.openadsdk.core.di.ka) this.dzy.findViewById(com.bytedance.sdk.openadsdk.utils.slm.mf);
        if ((ka(this.xha) || lr(this.xha) || xha(this.xha) || ik(this.xha)) && this.xha.ay() != null) {
            View view2 = this.fi;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (xha(this.xha)) {
                jRi = this.xha.ay().ik();
            } else {
                jRi = this.xha.ay().ri();
            }
            com.bytedance.sdk.openadsdk.core.vr.ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.11
                @Override // java.lang.Runnable
                public void run() {
                    if (ac.this.ory.get()) {
                        return;
                    }
                    ac acVar = ac.this;
                    com.bytedance.sdk.openadsdk.ka.ik.ri(acVar.xha, acVar.oh, System.currentTimeMillis() - ac.this.dw, false);
                    ac.this.vr();
                }
            }, jRi * 1000);
        }
        sf();
        if (lr(this.xha)) {
            nr();
            if (!ka()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ay.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.ay.setLayoutParams(layoutParams);
            }
        }
        if ((ka(this.xha) || xha(this.xha)) && (view = this.zf) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.co coVar = this.fr;
        if (coVar != null) {
            coVar.ri(this.xha);
        }
        if (ik(this.xha)) {
            bu();
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri.ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.xha, this.oh, this.tnn, this.zyn);
    }

    public static boolean ik(wjv wjvVar) {
        return wjvVar != null && wjvVar.adz() == 3 && wjvVar.zb() == 38 && wjvVar.bbu() == 1;
    }

    public static boolean aw(wjv wjvVar) {
        if (wjvVar != null) {
            return fi(wjvVar) || di(wjvVar);
        }
        return false;
    }

    public static boolean co(wjv wjvVar) {
        return wjvVar != null && wjvVar.nd() == 8 && wjvVar.aac() == 1;
    }

    public static boolean sf(wjv wjvVar) {
        return wjvVar != null && wjvVar.nd() == 19;
    }

    public static boolean ri(wjv wjvVar) {
        if (wjvVar == null || sf(wjvVar) || di(wjvVar) || fi(wjvVar)) {
            return false;
        }
        return ka(wjvVar) || lr(wjvVar) || xha(wjvVar);
    }

    public void ri(int i) {
        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.xd;
        if (lrVar != null) {
            lrVar.fi();
        }
    }

    public void ri(float f) {
        try {
            this.xd.vr();
        } catch (Throwable unused) {
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.jbs.ac acVar, FrameLayout frameLayout) {
        this.qh = acVar;
        this.gcp = frameLayout;
    }

    public void ri(final int i, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        float f;
        int iDi;
        if ((i != 3 && !ik(i)) || this.gcp == null || bgrVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.nd;
        if (atomicBoolean != null) {
            if (i == 1) {
                return;
            }
            if (i == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.zf.getLayoutParams();
        this.xe = (LinearLayout.LayoutParams) this.ay.getLayoutParams();
        final float f2 = layoutParams.weight;
        tan tanVarSu = this.xha.su();
        if (ik(i)) {
            if (tanVarSu != null) {
                iDi = tanVarSu.fi();
                f = iDi;
            } else {
                f = 30.0f;
            }
        } else if (tanVarSu != null) {
            iDi = tanVarSu.di();
            f = iDi;
        } else {
            f = 70.0f;
        }
        final float f3 = f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.gcp.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i2 = layoutParams3.height;
        final int i3 = layoutParams3.width;
        final int i4 = layoutParams3.leftMargin;
        final int i5 = layoutParams3.topMargin;
        final int iLr = qd.lr(this.hcw, (float) bgrVar.xha());
        final int iLr2 = qd.lr(this.hcw, (float) bgrVar.mj());
        final int iLr3 = qd.lr(this.hcw, (float) bgrVar.fi());
        final int iLr4 = qd.lr(this.hcw, (float) bgrVar.di());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.qt = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.qt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ac.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f4 = f2;
                layoutParams4.weight = f4 + ((f3 - f4) * fFloatValue);
                ac.this.xe.weight = 100.0f - layoutParams.weight;
                if (ac.this.zf != null) {
                    ac.this.zf.setLayoutParams(layoutParams);
                }
                if (ac.this.ay != null) {
                    ac.this.ay.setLayoutParams(ac.this.xe);
                }
                if (ac.this.xe.weight < 30.0f) {
                    ac.this.ka(8);
                } else {
                    ac.this.ka(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                int i6 = i3;
                layoutParams5.width = i6 + ((int) ((iLr - i6) * fFloatValue));
                int i7 = i2;
                layoutParams5.height = i7 + ((int) ((iLr2 - i7) * fFloatValue));
                int i8 = i4;
                layoutParams5.leftMargin = i8 + ((int) ((iLr3 - i8) * fFloatValue));
                int i9 = i5;
                layoutParams5.topMargin = i9 + ((int) ((iLr4 - i9) * fFloatValue));
                if (ac.this.gcp != null) {
                    ac.this.gcp.setLayoutParams(layoutParams3);
                }
                ac.this.ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (fFloatValue == 1.0f) {
                    if (ac.this.rzk != null) {
                        qd.ri((View) ac.this.rzk, 0);
                        if (ac.this.ik(i)) {
                            ac.this.rzk.setImageDrawable(com.bytedance.sdk.component.utils.uq.ik(ac.this.hcw, "tt_ad_zoom_down"));
                            ac.this.rzk.setTag(1);
                        } else {
                            ac.this.rzk.setImageDrawable(com.bytedance.sdk.component.utils.uq.ik(ac.this.hcw, "tt_ad_zoom_up"));
                            ac.this.rzk.setTag(2);
                        }
                    }
                    if (ac.this.nd == null) {
                        ac.this.nd = new AtomicBoolean();
                    }
                    ac.this.nd.set(ac.this.ik(i));
                }
            }
        });
        com.bytedance.sdk.openadsdk.ka.ik.ka(this.xha, this.oh, i);
        this.qt.start();
        if (this.yjm.compareAndSet(false, true)) {
            this.saa = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.ka.aw awVar = this.qd;
        if (awVar != null) {
            awVar.ri(true, SystemClock.elapsedRealtime());
        }
        qd.ri((View) this.rzk, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.luy < 100) {
            return false;
        }
        this.luy = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
