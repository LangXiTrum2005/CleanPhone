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
import android.util.Log;
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
import com.bumptech.glide.load.resource.bitmap.a;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.smartdigimkt.x.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class aaj implements Handler.Callback {
    private com.bytedance.sdk.openadsdk.core.widget.yt aaj;
    private boolean ax;
    private FrameLayout bch;
    private Handler bjy;
    private ImageView bqt;
    private String cx;
    private com.bytedance.sdk.openadsdk.core.mo.jpc dk;
    private String ekw;
    private TextView exc;
    com.bytedance.sdk.openadsdk.core.lnr.qdl exu;
    private int fco;
    com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl fs;
    private com.bytedance.sdk.openadsdk.mml.fs gy;
    private final com.bytedance.sdk.openadsdk.core.exu.mml.ud hkc;
    private final View hzv;
    private LinearLayout.LayoutParams ijp;
    private int jjk;
    private TextView jl;
    FrameLayout jpc;
    private View jtx;
    private TextView jyq;
    private ValueAnimator kab;
    private final Activity kdv;
    private View koa;
    private com.bytedance.sdk.component.tvp.mo ljh;
    TextView lnr;
    private com.bytedance.sdk.openadsdk.core.widget.yt lte;
    private AtomicBoolean mlb;
    FrameLayout mml;
    RelativeLayout mo;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo mrf;
    View mzz;
    private ud nz;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mzz om;
    private com.bytedance.sdk.openadsdk.core.hkc oth;
    ImageView qdl;
    com.bytedance.sdk.openadsdk.core.lnr.ud rdp;
    ObjectAnimator rq;
    private FrameLayout sy;
    private com.bytedance.sdk.openadsdk.core.mo.mml taz;
    private com.bytedance.sdk.openadsdk.core.tvp.aaj tid;
    ValueAnimator to;
    private final boolean tqd;
    ObjectAnimator tvp;
    FrameLayout ud;
    private com.bytedance.sdk.openadsdk.common.fs uw;
    private long vu;
    private boolean wc;
    final ljh wd;
    private int xi;
    private View xmv;
    private ILoader yh;
    private View yt;
    private com.bytedance.sdk.openadsdk.common.mml zlt;
    private final AtomicBoolean rc = new AtomicBoolean(false);
    private final AtomicBoolean ag = new AtomicBoolean(false);
    private volatile int wak = 0;
    private volatile int gt = 0;
    private volatile int irn = 0;
    private float car = -1.0f;
    private final AtomicBoolean zy = new AtomicBoolean(false);
    private long en = -1;
    private final AtomicBoolean ra = new AtomicBoolean(false);
    private long qk = 0;

    public static class qdl implements com.bytedance.sdk.component.mzz.jpc {
        @Override // com.bytedance.sdk.component.mzz.jpc
        public Bitmap qdl(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.mml.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), bitmap, 25);
        }
    }

    public static class ud implements com.bytedance.sdk.openadsdk.mml.rq {
        private final String lnr;
        private final WeakReference<aaj> mml;
        private final int qdl;
        private final ljh ud;

        public ud(int i2, ljh ljhVar, String str, aaj aajVar) {
            this.qdl = i2;
            this.ud = ljhVar;
            this.lnr = str;
            this.mml = new WeakReference<>(aajVar);
        }

        @Override // com.bytedance.sdk.openadsdk.mml.rq
        public void qdl(int i2) {
            aaj aajVar = this.mml.get();
            if (aajVar != null) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.qdl, aajVar.irn, aajVar.gt, aajVar.wak - aajVar.gt, this.ud, this.lnr, i2);
            }
        }
    }

    public aaj(Activity activity, final ljh ljhVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, View view) {
        this.kdv = activity;
        this.wd = ljhVar;
        this.ekw = str;
        this.hkc = udVar;
        this.hzv = view;
        this.fco = gy.qdl(str);
        if (ljhVar != null) {
            this.cx = ljhVar.xmr();
        }
        this.tqd = ljhVar.ax() && mzz(ljhVar);
        if (!TextUtils.isEmpty(this.cx)) {
            this.yh = com.bytedance.sdk.openadsdk.wd.ud.qdl().ud();
            int iQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.yh, this.cx);
            this.xi = iQdl;
            this.jjk = iQdl > 0 ? 2 : 0;
        }
        boolean zMml = mml(ljhVar);
        boolean zWd = wd(ljhVar);
        boolean zUd = ud(ljhVar);
        if (zUd) {
            this.ekw = "landingpage_split_screen";
        } else if (zMml) {
            this.ekw = "landingpage_direct";
        } else if (zWd) {
            this.ekw = "aggregate_page";
        } else if (lnr(ljhVar)) {
            this.ekw = "landingpage_split_ceiling";
        }
        this.exu = new com.bytedance.sdk.openadsdk.core.lnr.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), ljhVar, this.ekw, gy.qdl(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.exu.qdl(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.exu.qdl(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar2 = new com.bytedance.sdk.openadsdk.core.lnr.ud(activity, ljhVar, this.ekw, gy.qdl(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud
            public boolean qdl(fs fsVar, Map<String, Object> map2) {
                if (aaj.to(ljhVar) && aaj.this.om != null) {
                    aaj.this.om.qdl(fsVar);
                    aaj.this.om.qdl(map2);
                    if (aaj.tvp(aaj.this.wd) || aaj.this.wc) {
                        return true;
                    }
                }
                return super.qdl(fsVar, map2);
            }
        };
        this.rdp = udVar2;
        udVar2.qdl(map);
        this.rdp.qdl(viewFindViewById);
        this.jpc = frameLayout;
        if (zUd || zMml || zWd) {
            try {
                this.bjy = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e2) {
                Log.e("LandingPageModel", "LandingPageModel: ", e2);
                return;
            }
        }
        if (ljhVar.ax()) {
            return;
        }
        if (zMml || zWd) {
            Handler handler = this.bjy;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static /* synthetic */ int bjy(aaj aajVar) {
        int i2 = aajVar.irn;
        aajVar.irn = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int fs(aaj aajVar) {
        int i2 = aajVar.wak;
        aajVar.wak = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lnr(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5;
    }

    public static /* synthetic */ int rdp(aaj aajVar) {
        int i2 = aajVar.gt;
        aajVar.gt = i2 + 1;
        return i2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long jMml;
        ljh ljhVar;
        ljh ljhVar2;
        int i2 = message.what;
        if (i2 == 100) {
            int i3 = message.arg1;
            if (!mml(this.wd) || (ljhVar2 = this.wd) == null || ljhVar2.aaj() == null) {
                jMml = (!wd(this.wd) || (ljhVar = this.wd) == null || ljhVar.aaj() == null) ? 20L : this.wd.aaj().mml();
            } else {
                jMml = this.wd.aaj().ud();
            }
            com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar = this.fs;
            if (qdlVar != null) {
                qdlVar.qdl(((long) i3) * 1000, jMml * 1000);
            }
            long j = i3;
            if (j >= jMml) {
                com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar2 = this.fs;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(jMml * 1000, 100);
                }
            } else if (j < jMml && this.bjy != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i3 + 1;
                this.bjy.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i2 == 101) {
            to();
        }
        return true;
    }

    private void aaj() {
        com.bytedance.sdk.component.tvp.mo moVar = this.ljh;
        if (moVar == null || moVar.getWebView() == null) {
            return;
        }
        this.wak = this.ljh.qdl;
        this.gt = this.ljh.ud;
        this.irn = this.ljh.lnr;
        if (this.ljh.ud()) {
            this.hkc.yt();
            this.vu = System.currentTimeMillis();
        }
        if (this.ljh.mml()) {
            exu();
        }
        if (this.ljh.lnr()) {
            exu();
            int iQdl = gy.qdl(this.ljh.getWebView());
            ud udVar = this.nz;
            if (udVar != null) {
                udVar.qdl(iQdl != 1 ? 0 : 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjy() {
        LinearLayout.LayoutParams layoutParams;
        if (this.rc.get()) {
            return;
        }
        jtx();
        this.ag.set(true);
        qdl(-1);
        this.hkc.fs();
        com.bytedance.sdk.openadsdk.common.fs fsVar = this.uw;
        if (fsVar != null) {
            fsVar.ud();
        }
        if (wd(this.wd)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.wd, this.ekw, "show_agg_backup");
            View view = this.yt;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.yt.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.yt.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.mo;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.2
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
        this.jtx.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.jtx.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.jtx.setLayoutParams(layoutParams3);
        if (this.wd.hcs() != null && !TextUtils.isEmpty(this.wd.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.wd.hcs().qdl(), this.wd.hcs().ud(), this.wd.hcs().lnr(), this.aaj, this.wd);
        }
        this.jl.setText(this.wd.ca());
        this.exc.setText(this.wd.hvi());
        if (this.jyq != null) {
            ud();
            this.jyq.setClickable(true);
            this.jyq.setOnClickListener(this.exu);
            this.jyq.setOnTouchListener(this.exu);
        }
        if (!lnr(this.wd) || (layoutParams = this.ijp) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            mml(8);
        } else {
            mml(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean exc() {
        return ljh.mzz(this.wd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exu() {
        this.rc.get();
        this.ag.get();
        if (this.rc.get() || this.ag.get()) {
            return;
        }
        this.rc.set(true);
        qdl(0);
        long jElapsedRealtime = this.en == -1 ? 0L : SystemClock.elapsedRealtime() - this.en;
        if (lnr(this.wd)) {
            com.bytedance.sdk.openadsdk.mml.lnr.lnr(this.wd, this.ekw, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.wd, this.ekw, System.currentTimeMillis() - this.vu, true);
        rdp();
    }

    private void fs() {
        com.bytedance.sdk.openadsdk.core.hkc hkcVar = new com.bytedance.sdk.openadsdk.core.hkc(this.kdv);
        this.oth = hkcVar;
        hkcVar.qdl(this.hkc);
        this.oth.ud(this.ljh).qdl(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(this.wd)).lnr(this.wd.yre()).mml(this.wd.ir()).qdl(this.wd).ud(wd(this.wd) ? this.fco : -1).qdl(this.wd.jle()).ud(this.ekw).mzz(this.wd.htl()).qdl(this.ljh).qdl(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                if (aaj.wd(aaj.this.wd) && (aaj.this.kdv instanceof com.bytedance.sdk.openadsdk.core.exu.mml.ud)) {
                    ((com.bytedance.sdk.openadsdk.core.exu.mml.ud) aaj.this.kdv).mrf();
                } else if (aaj.this.om != null) {
                    aaj.this.om.lnr();
                }
            }
        });
    }

    private void jl() {
        if (mml()) {
            this.xmv.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.bqt, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.tvp = duration;
            duration.setRepeatMode(2);
            this.tvp.setRepeatCount(-1);
            this.tvp.start();
            this.xmv.setClickable(true);
            this.xmv.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!aaj.this.wc) {
                        aaj.this.rdp.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    aaj.this.to = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    aaj.this.to.setDuration(200L);
                    aaj.this.to.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aaj.this.bch.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            aaj.this.qdl((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            aaj.this.bch.setLayoutParams(layoutParams);
                        }
                    });
                    if (aaj.this.rdp.mo()) {
                        aaj.this.xmv.performClick();
                        aaj.this.wc = true;
                    }
                    aaj.this.to.start();
                    aaj.this.xmv.setVisibility(8);
                    return true;
                }
            });
            this.xmv.setOnClickListener(this.rdp);
        }
        if (!exc()) {
            this.jpc.setVisibility(8);
            this.ud.setVisibility(0);
            this.qdl.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.qdl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    aaj aajVar = aaj.this;
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(aajVar.wd, aajVar.ekw);
                }
            });
            ljh ljhVar = this.wd;
            if (ljhVar != null && ljhVar.vm() != null && this.wd.vm().size() > 0 && this.wd.vm().get(0) != null && !TextUtils.isEmpty(this.wd.vm().get(0).qdl())) {
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.wd.vm().get(0), this.qdl, this.wd, new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.7
                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
                        if (aaj.this.bjy != null) {
                            aaj.this.bjy.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(int i2, String str, Throwable th) {
                        if (aaj.this.bjy != null) {
                            aaj.this.bjy.removeMessages(101);
                        }
                        aaj.this.to();
                    }
                });
            }
        }
        try {
            String strQdl = this.wd.vm().get(0).qdl();
            com.bytedance.sdk.openadsdk.tvp.mml.qdl().qdl(strQdl).qdl(this.wd.vm().get(0).ud()).ud(this.wd.vm().get(0).lnr()).mzz(ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl())).mml(ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl())).lnr(1).qdl(new qdl()).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(this.wd, strQdl, new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.8
                @Override // com.bytedance.sdk.component.mzz.jtx
                public void qdl(int i2, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.mzz.jtx
                public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objUd = rqVar.ud();
                        if (objUd != null && rqVar.lnr() != null) {
                            if (objUd instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.yt.qdl().getResources(), (Bitmap) objUd);
                            } else if (objUd instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && a.w(objUd)) {
                                    a.l(objUd).start();
                                }
                                bitmapDrawable = (Drawable) objUd;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!aaj.this.exc()) {
                                aaj.this.ud.setBackground(bitmapDrawable);
                                return;
                            }
                            aaj.this.mml.setBackground(bitmapDrawable);
                            View viewJtx = aaj.this.hkc.jtx();
                            if (viewJtx == null || !(viewJtx.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewJtx.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static boolean jpc(ljh ljhVar) {
        return mml(ljhVar) && !rq(ljhVar);
    }

    private void jtx() {
        if ((mml(this.wd) || wd(this.wd)) && (this.kdv instanceof com.bytedance.sdk.openadsdk.core.exu.mml.ud)) {
            this.hkc.yt();
            this.hkc.jl();
        }
    }

    public static boolean mo(ljh ljhVar) {
        xmv xmvVarRaf;
        return (ljhVar == null || (xmvVarRaf = ljhVar.raf()) == null || xmvVarRaf.qdl() != 2) ? false : true;
    }

    public static boolean mzz(ljh ljhVar) {
        xmv xmvVarRaf;
        return ljhVar != null && ljhVar.ygv() == 3 && !vu.ud(ljhVar) && (ljhVar.nv() == 0.0f || ljhVar.nv() == 100.0f) && (xmvVarRaf = ljhVar.raf()) != null && xmvVarRaf.qdl() == 1;
    }

    private void rdp() {
        this.mo.setVisibility(8);
        if (mml(this.wd) || wd(this.wd) || !mml() || lnr(this.wd)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.rq = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.rq.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aaj.this.bch.getLayoutParams();
                layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                aaj.this.qdl((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                aaj.this.bch.setLayoutParams(layoutParams);
            }
        });
        this.rq.start();
    }

    private void rq() {
        aaj aajVar;
        com.bytedance.sdk.component.tvp.mo moVar = this.ljh;
        if (moVar == null || moVar.getWebView() == null) {
            aajVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl()).qdl(false).ud(false).qdl(this.ljh.getWebView());
            com.bytedance.sdk.component.tvp.mo moVar2 = this.ljh;
            if (moVar2 != null && moVar2.getWebView() != null) {
                this.nz = new ud(this.xi, this.wd, this.ekw, this);
                if (this.ljh.i_() && (this.ljh.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.qdl.mzz)) {
                    com.bytedance.sdk.openadsdk.mml.fs fsVarUd = ((com.bytedance.sdk.openadsdk.core.widget.qdl.mzz) this.ljh.getWebViewClient()).ud();
                    this.gy = fsVarUd;
                    if (fsVarUd != null) {
                        fsVarUd.qdl(this.nz);
                        this.gy.ud(true);
                    }
                } else {
                    this.gy = new com.bytedance.sdk.openadsdk.mml.fs(this.wd, this.ljh.getWebView(), this.nz, this.jjk).ud(true);
                }
                this.gy.qdl(this.ekw);
                com.bytedance.sdk.openadsdk.common.mml mmlVarQdl = gy.qdl(this.wd, this.ljh, this.kdv, this.ekw);
                this.zlt = mmlVarQdl;
                if (mmlVarQdl != null) {
                    mmlVarQdl.qdl(this.ekw);
                }
                gy.qdl(this.wd, this.ljh);
            }
            fs();
            if (this.ljh.i_()) {
                aaj();
            }
            this.ljh.setLandingPage(true);
            this.ljh.setTag(this.ekw);
            this.ljh.setMaterialMeta(this.wd.il());
            aajVar = this;
            com.bytedance.sdk.openadsdk.core.widget.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.widget.qdl.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl(), this.oth, this.wd.yre(), this.zlt, this.gy, true) { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    aaj.this.exu();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    aaj.this.hkc.yt();
                    aaj.this.vu = System.currentTimeMillis();
                    if (!aaj.ud(aaj.this.wd) || aaj.this.bjy == null || ljh.mzz(aaj.this.wd)) {
                        return;
                    }
                    aaj.this.bjy.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i2, String str, String str2) {
                    super.onReceivedError(webView, i2, str, str2);
                    String strMml = com.bytedance.sdk.openadsdk.core.widget.qdl.mzz.mml(str2);
                    boolean z2 = false;
                    if (this.mo != null) {
                        this.mo.qdl(webView, i2, str, str2, com.bytedance.sdk.openadsdk.core.widget.qdl.mzz.mml(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z3 = strMml != null && strMml.startsWith(d.c.k);
                    if (strMml != null && strMml.startsWith("mp4")) {
                        z2 = true;
                    }
                    if (z3 || z2 || aaj.this.rc.get()) {
                        return;
                    }
                    aaj.this.bjy();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        aaj.this.bjy();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(aaj.this.cx)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        aaj.fs(aaj.this);
                        WebResourceResponseModel webResourceResponseModelQdl = com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(aaj.this.yh, aaj.this.cx, str);
                        if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getWebResourceResponse() != null) {
                            aaj.rdp(aaj.this);
                            return webResourceResponseModelQdl.getWebResourceResponse();
                        }
                        if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getMsg() == 2) {
                            aaj.bjy(aaj.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.aaj.qdl("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!aaj.lnr(aaj.this.wd) || gy.qdl(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(aaj.this.kdv, (Class<?>) TTCeilingLandingPageActivity.class);
                    aaj.this.wd.mzz(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.koa.qdl().qdl(aaj.this.wd));
                    com.bytedance.sdk.component.utils.ud.qdl(this.mml, intent, null);
                    return true;
                }
            };
            aajVar.om = mzzVar;
            aajVar.ljh.setWebViewClient(mzzVar);
            aajVar.om.qdl(aajVar.wd);
            aajVar.om.qdl(aajVar.ekw);
            aajVar.om.qdl(aajVar.hkc);
            aajVar.ljh.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(aajVar.oth, aajVar.gy, aajVar.zlt) { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i2) {
                    super.onProgressChanged(webView, i2);
                    if (aaj.this.kdv != null && !aaj.this.kdv.isFinishing() && i2 == 100) {
                        aaj.this.exu();
                    }
                    if (aaj.this.uw != null) {
                        aaj.this.uw.qdl(i2);
                    }
                }
            });
            if (aajVar.mrf == null) {
                aajVar.mrf = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), aajVar.ekw);
            }
            aajVar.ljh.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (aaj.this.mrf != null) {
                        aaj.this.mrf.lnr(aaj.this.wd);
                    }
                }
            });
            com.bytedance.sdk.component.tvp.mo moVar3 = aajVar.ljh;
            moVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.exc.qdl(moVar3.getWebView(), BuildConfig.VERSION_CODE));
            aajVar.ljh.setMixedContentMode(0);
            aajVar.ljh.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                    if (aaj.this.gy != null) {
                        aaj.this.gy.ud(i3);
                    }
                }
            });
            aajVar.ljh.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (aaj.this.tvp()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            aaj.this.car = motionEvent.getY();
                        } else if (action == 1) {
                            if (ax.qdl(aaj.this.car, motionEvent.getY(), aaj.this.kdv)) {
                                aaj.this.ud(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (aaj.this.tqd && motionEvent.getAction() == 1 && aaj.this.hkc != null) {
                        aaj.this.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aaj.this.hkc.sy();
                            }
                        });
                    }
                    if ((!aaj.this.wc || aaj.to(aaj.this.wd)) && !aaj.wd(aaj.this.wd)) {
                        aaj.this.rdp.onTouch(view, motionEvent);
                    }
                    if ((!aaj.this.wc || aaj.to(aaj.this.wd)) && !aaj.wd(aaj.this.wd) && motionEvent.getAction() == 1 && aaj.this.rdp.mo()) {
                        aaj.this.ljh.getWebView().performClick();
                        aaj.this.wc = true;
                    }
                    if (aaj.this.gy != null) {
                        aaj.this.gy.qdl(motionEvent);
                    }
                    if (aaj.this.zlt == null) {
                        return false;
                    }
                    aaj.this.zlt.qdl(motionEvent);
                    return false;
                }
            });
            aajVar.ljh.getWebView().setOnClickListener(aajVar.rdp);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(aajVar.wd, aajVar.ekw, aajVar.jjk);
            if (!aajVar.ljh.i_()) {
                com.bytedance.sdk.component.utils.aaj.qdl("LandingPageModel", "loadUrlWithRefer url  = " + aajVar.wd.od());
                com.bytedance.sdk.openadsdk.utils.jyq.qdl(aajVar.ljh, aajVar.wd.od());
            }
            aajVar.ax = true;
        }
        com.bytedance.sdk.component.tvp.mo moVar4 = aajVar.ljh;
        if (moVar4 == null || aajVar.uw == null || moVar4.lnr()) {
            return;
        }
        aajVar.uw.qdl();
    }

    public static boolean to(ljh ljhVar) {
        if (ljhVar != null) {
            return ljhVar.taz() == 19 || ljhVar.taz() == 20;
        }
        return false;
    }

    public static boolean tvp(ljh ljhVar) {
        return (ljhVar == null || ljhVar.rj() == 1 || !to(ljhVar)) ? false : true;
    }

    public static boolean wd(ljh ljhVar) {
        return ljhVar != null && ljhVar.taz() == 33;
    }

    private void yt() {
        com.bytedance.sdk.openadsdk.common.rq loadingStyle;
        com.bytedance.sdk.openadsdk.common.fs fsVar = this.uw;
        if (fsVar != null && (loadingStyle = fsVar.getLoadingStyle()) != null) {
            this.lte = loadingStyle.ud();
            this.dk = loadingStyle.lnr();
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = this.taz;
        if (mmlVar != null) {
            mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (aaj.this.taz.getTag() != null) {
                        if (aaj.this.taz.getTag().equals(1)) {
                            aaj.this.ud(3);
                        } else if (aaj.this.taz.getTag().equals(2)) {
                            aaj.this.ud(4);
                        }
                    }
                }
            });
        }
    }

    public boolean mml() {
        return this.wd.vxg() == 15 || this.wd.vxg() == 16;
    }

    public void jpc() {
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.gy;
        if (fsVar != null) {
            fsVar.jpc();
        }
    }

    public void lnr() {
        if (exc()) {
            try {
                String str = this.wd.tdy().to();
                com.bytedance.sdk.openadsdk.tvp.mml.qdl().qdl(str).qdl(this.wd.tdy().lnr()).ud(this.wd.tdy().ud()).mzz(ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl())).mml(ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl())).lnr(2).qdl(new qdl()).qdl(new com.bytedance.sdk.openadsdk.tvp.ud(this.wd, str, new com.bytedance.sdk.component.mzz.jtx() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.4
                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(int i2, String str2, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.mzz.jtx
                    public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
                        try {
                            Object objUd = rqVar.ud();
                            if (objUd != null && rqVar.lnr() != null) {
                                BitmapDrawable bitmapDrawable = objUd instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.yt.qdl().getResources(), (Bitmap) objUd) : null;
                                View viewJtx = aaj.this.hkc.jtx();
                                if (bitmapDrawable == null || viewJtx == null || !(viewJtx.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewJtx.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.aaj.lnr("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public void ud() {
        ljh ljhVar = this.wd;
        if (ljhVar == null || TextUtils.isEmpty(ljhVar.uvi())) {
            return;
        }
        this.jyq.setText(this.wd.uvi());
    }

    public void wd() {
        com.bytedance.sdk.openadsdk.core.hkc hkcVar = this.oth;
        if (hkcVar != null) {
            hkcVar.rq();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.gy;
        if (fsVar != null) {
            fsVar.wd();
        }
    }

    public static boolean mml(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        if (rq(ljhVar)) {
            return true;
        }
        return ljhVar.ygv() == 3 && (ljhVar.taz() == 5 || mzz(ljhVar)) && !vu.ud(ljhVar) && (ljhVar.nv() == 0.0f || ljhVar.nv() == 100.0f);
    }

    public void mo() {
        com.bytedance.sdk.component.tvp.mo moVar;
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.gy;
        if (fsVar != null && (moVar = this.ljh) != null) {
            fsVar.qdl(moVar);
        }
        Handler handler = this.bjy;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.kab;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.kab.cancel();
        }
        ValueAnimator valueAnimator2 = this.to;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.to.cancel();
        }
        ObjectAnimator objectAnimator = this.rq;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.rq.cancel();
        }
        com.bytedance.sdk.openadsdk.common.fs fsVar2 = this.uw;
        if (fsVar2 != null) {
            fsVar2.ud();
        }
        ObjectAnimator objectAnimator2 = this.tvp;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.tvp.mo moVar2 = this.ljh;
        if (moVar2 != null) {
            com.bytedance.sdk.openadsdk.core.gy.qdl(moVar2.getWebView());
        }
        this.ljh = null;
        com.bytedance.sdk.openadsdk.core.hkc hkcVar = this.oth;
        if (hkcVar != null) {
            hkcVar.fs();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar3 = this.gy;
        if (fsVar3 != null) {
            fsVar3.mml(true);
        }
        if (!TextUtils.isEmpty(this.cx) && this.ax) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(this.gt, this.wak, this.wd);
        }
        com.bytedance.sdk.openadsdk.wd.ud.qdl().qdl(this.yh);
    }

    public void to() {
        if ("landingpage_split_screen".equals(this.ekw) && com.bytedance.sdk.openadsdk.jyq.qdl.qdl("default_split_style", false) && this.ra.compareAndSet(false, true)) {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.10
                @Override // java.lang.Runnable
                public void run() {
                    aaj.this.kab = ValueAnimator.ofFloat(1.0f, 0.0f);
                    aaj.this.kab.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (aaj.this.koa != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aaj.this.koa.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                aaj.this.koa.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    aaj.this.kab.setDuration(500L);
                    aaj.this.kab.start();
                    if (aaj.this.xmv != null) {
                        aaj.this.xmv.setVisibility(8);
                    }
                }
            });
        }
    }

    public boolean tvp() {
        AtomicBoolean atomicBoolean;
        return (!lnr(this.wd) || (atomicBoolean = this.mlb) == null || atomicBoolean.get()) ? false : true;
    }

    public static boolean ud(ljh ljhVar) {
        return ljhVar != null && ljhVar.ygv() == 3 && ljhVar.taz() == 6 && !vu.ud(ljhVar) && ljhVar.jb() == 1 && (ljhVar.nv() == 0.0f || ljhVar.nv() == 100.0f);
    }

    public void mzz() {
        FrameLayout frameLayout = this.bch;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.koa;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml(int i2) {
        ax.qdl((View) this.lte, i2);
        ax.qdl((View) this.dk, i2);
        if (this.ag.get()) {
            ax.qdl((View) this.jl, i2);
            ax.qdl((View) this.exc, i2);
            ax.qdl((View) this.aaj, i2);
            ax.qdl((View) this.jyq, 0);
        }
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar) {
        this.fs = qdlVar;
    }

    public void qdl() {
        long jQdl;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.tvp.mo moVar = (com.bytedance.sdk.component.tvp.mo) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.aaj);
        this.ljh = moVar;
        if (moVar != null && !ljh.qdl(this.wd)) {
            if (!this.ljh.i_()) {
                this.ljh.mzz();
            }
        } else {
            ax.qdl((View) this.ljh, 8);
        }
        this.bch = (FrameLayout) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.exc);
        this.uw = (com.bytedance.sdk.openadsdk.common.fs) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.bch);
        this.xmv = this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.jyq);
        this.bqt = (ImageView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.oth);
        this.koa = this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.ekw);
        this.ud = (FrameLayout) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.yt);
        this.qdl = (ImageView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.jl);
        this.mo = (RelativeLayout) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.ljh);
        this.lnr = (TextView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.djz);
        this.mml = (FrameLayout) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.to);
        View viewFindViewById = this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.uw);
        this.jtx = viewFindViewById;
        if (viewFindViewById == null) {
            this.jtx = this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.hzv);
        }
        this.yt = this.kdv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.xmv);
        this.jl = (TextView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.koa);
        this.exc = (TextView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.vu);
        this.aaj = (com.bytedance.sdk.openadsdk.core.widget.yt) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.bqt);
        this.jyq = (TextView) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.rc);
        if (this.lnr != null && this.wd.aaj() != null) {
            this.lnr.setText(this.wd.aaj().mzz());
        }
        this.mzz = this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.kdv);
        this.taz = (com.bytedance.sdk.openadsdk.core.mo.mml) this.hzv.findViewById(com.bytedance.sdk.openadsdk.utils.jtx.vxm);
        if ((mml(this.wd) || ud(this.wd) || wd(this.wd) || lnr(this.wd)) && this.wd.aaj() != null) {
            View view2 = this.mzz;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (wd(this.wd)) {
                jQdl = this.wd.aaj().lnr();
            } else {
                jQdl = this.wd.aaj().qdl();
            }
            com.bytedance.sdk.openadsdk.core.rdp.lnr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.11
                @Override // java.lang.Runnable
                public void run() {
                    if (aaj.this.rc.get()) {
                        return;
                    }
                    aaj aajVar = aaj.this;
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(aajVar.wd, aajVar.ekw, System.currentTimeMillis() - aaj.this.vu, false);
                    aaj.this.bjy();
                }
            }, jQdl * 1000);
        }
        rq();
        if (ud(this.wd)) {
            jl();
            if (!mml()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.bch.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.bch.setLayoutParams(layoutParams);
            }
        }
        if ((mml(this.wd) || wd(this.wd)) && (view = this.koa) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.fs fsVar = this.uw;
        if (fsVar != null) {
            fsVar.qdl(this.wd);
        }
        if (lnr(this.wd)) {
            yt();
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl.qdl(SystemClock.elapsedRealtime() - jElapsedRealtime, this.wd, this.ekw, this.yh, this.cx);
    }

    public void ud(int i2) {
        com.bytedance.sdk.openadsdk.core.tvp.aaj aajVar = this.tid;
        if (aajVar != null) {
            aajVar.mzz(i2);
        }
    }

    public static boolean lnr(ljh ljhVar) {
        return ljhVar != null && ljhVar.ygv() == 3 && ljhVar.tid() == 38 && ljhVar.jb() == 1;
    }

    public static boolean exu(ljh ljhVar) {
        return (ljhVar == null || !com.bytedance.sdk.openadsdk.core.yt.mml().kdv() || !ljhVar.zpu() || ud(ljhVar) || mml(ljhVar) || wd(ljhVar)) ? false : true;
    }

    public static boolean fs(ljh ljhVar) {
        if (ljhVar != null) {
            return mzz(ljhVar) || mo(ljhVar);
        }
        return false;
    }

    public static boolean rq(ljh ljhVar) {
        return ljhVar != null && ljhVar.taz() == 19;
    }

    public static boolean qdl(ljh ljhVar) {
        if (ljhVar == null || rq(ljhVar) || mo(ljhVar) || mzz(ljhVar)) {
            return false;
        }
        return mml(ljhVar) || ud(ljhVar) || wd(ljhVar);
    }

    public void qdl(int i2) {
        com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar = this.hkc;
        if (udVar != null) {
            udVar.mo();
        }
    }

    public void qdl(float f) {
        try {
            this.hkc.bjy();
        } catch (Throwable unused) {
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.tvp.aaj aajVar, FrameLayout frameLayout) {
        this.tid = aajVar;
        this.sy = frameLayout;
    }

    public void qdl(final int i2, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
        float f;
        int iMo;
        if ((i2 != 3 && !lnr(i2)) || this.sy == null || rdpVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.mlb;
        if (atomicBoolean != null) {
            if (i2 == 1) {
                return;
            }
            if (i2 == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.koa.getLayoutParams();
        this.ijp = (LinearLayout.LayoutParams) this.bch.getLayoutParams();
        final float f2 = layoutParams.weight;
        exc excVarOth = this.wd.oth();
        if (lnr(i2)) {
            if (excVarOth != null) {
                iMo = excVarOth.mzz();
                f = iMo;
            } else {
                f = 30.0f;
            }
        } else if (excVarOth != null) {
            iMo = excVarOth.mo();
            f = iMo;
        } else {
            f = 70.0f;
        }
        final float f3 = f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.sy.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i3 = layoutParams3.height;
        final int i4 = layoutParams3.width;
        final int i5 = layoutParams3.leftMargin;
        final int i6 = layoutParams3.topMargin;
        final int iUd = ax.ud(this.kdv, (float) rdpVar.wd());
        final int iUd2 = ax.ud(this.kdv, (float) rdpVar.jpc());
        final int iUd3 = ax.ud(this.kdv, (float) rdpVar.mzz());
        final int iUd4 = ax.ud(this.kdv, (float) rdpVar.mo());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.to = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.to.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.aaj.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f4 = f2;
                layoutParams4.weight = android.support.v4.media.a.a(f3, f4, fFloatValue, f4);
                aaj.this.ijp.weight = 100.0f - layoutParams.weight;
                if (aaj.this.koa != null) {
                    aaj.this.koa.setLayoutParams(layoutParams);
                }
                if (aaj.this.bch != null) {
                    aaj.this.bch.setLayoutParams(aaj.this.ijp);
                }
                if (aaj.this.ijp.weight < 30.0f) {
                    aaj.this.mml(8);
                } else {
                    aaj.this.mml(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                int i7 = i4;
                layoutParams5.width = i7 + ((int) ((iUd - i7) * fFloatValue));
                int i8 = i3;
                layoutParams5.height = i8 + ((int) ((iUd2 - i8) * fFloatValue));
                int i9 = i5;
                layoutParams5.leftMargin = i9 + ((int) ((iUd3 - i9) * fFloatValue));
                int i10 = i6;
                layoutParams5.topMargin = i10 + ((int) ((iUd4 - i10) * fFloatValue));
                if (aaj.this.sy != null) {
                    aaj.this.sy.setLayoutParams(layoutParams3);
                }
                aaj.this.qdl(0.0f);
                if (fFloatValue == 1.0f) {
                    if (aaj.this.taz != null) {
                        ax.qdl((View) aaj.this.taz, 0);
                        if (aaj.this.lnr(i2)) {
                            aaj.this.taz.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(aaj.this.kdv, "tt_ad_zoom_down"));
                            aaj.this.taz.setTag(1);
                        } else {
                            aaj.this.taz.setImageDrawable(com.bytedance.sdk.component.utils.ljh.lnr(aaj.this.kdv, "tt_ad_zoom_up"));
                            aaj.this.taz.setTag(2);
                        }
                    }
                    if (aaj.this.mlb == null) {
                        aaj.this.mlb = new AtomicBoolean();
                    }
                    aaj.this.mlb.set(aaj.this.lnr(i2));
                }
            }
        });
        com.bytedance.sdk.openadsdk.mml.lnr.mml(this.wd, this.ekw, i2);
        this.to.start();
        if (this.zy.compareAndSet(false, true)) {
            this.en = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.gy;
        if (fsVar != null) {
            fsVar.qdl(true, SystemClock.elapsedRealtime());
        }
        ax.qdl((View) this.taz, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.qk < 100) {
            return false;
        }
        this.qk = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
