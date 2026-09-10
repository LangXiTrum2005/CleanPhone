package com.bytedance.sdk.openadsdk.core.widget.ri;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class di implements igq.ri {
    float aw;
    float bgr;
    boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    float f18150co;
    private boolean hcw;
    private final boolean igq;
    String jbs;
    WebView ka;
    wjv lr;
    boolean mj;
    boolean nr;
    private long ory;
    int qt;
    Context ri;
    float sf;
    long slm;
    long tan;
    float vr;
    boolean xha;
    private final Handler su = new igq(vr.lr().getLooper(), this);
    String ik = "landingpage";
    int di = 0;
    private final String zf = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String dw = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    ri ay = new ri() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.ri.di.ri
        public void ri() {
            di diVar = di.this;
            diVar.mj = true;
            diVar.di();
            di diVar2 = di.this;
            diVar2.ri(2, diVar2.jbs, diVar2.qt);
        }
    };
    GestureDetector fr = new GestureDetector(nr.ri(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            di.this.bu = true;
            return false;
        }
    });
    int fi = nr.ka().ihz();
    Map<Integer, Long> ac = new HashMap();
    Map<Integer, Float> ihz = new HashMap();
    Map<Integer, Long> uq = new HashMap();
    List<Integer> wjv = new ArrayList();

    public interface ri {
        void ri();
    }

    public di(WebView webView, wjv wjvVar, Context context, boolean z) {
        this.lr = wjvVar;
        this.ka = webView;
        this.ri = context;
        this.igq = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di() {
        if (this.ihz.get(Integer.valueOf(this.qt)) != null) {
            return;
        }
        float height = this.ka.getHeight() / qd.lr(this.ri, this.ka.getContentHeight());
        if (height < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height > 1.0f) {
            height = 0.0f;
        }
        this.ihz.put(Integer.valueOf(this.qt), Float.valueOf(height));
    }

    private boolean fi() {
        try {
            int i = this.qt;
            if (i == 2 || i == 3) {
                return Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.jbs) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.jbs);
            }
            return false;
        } catch (Throwable th) {
            ac.ik("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    private void ka(String str) {
        if (xha()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(this.lr, new com.bytedance.sdk.openadsdk.slm.ri.ri.C0275ri().ri(this.jbs).lr(Uri.decode(str)).ri(), this.ik);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mj() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.ka.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.qt = currentIndex + 1;
            if (this.igq) {
                this.qt = currentIndex + 2;
            }
        }
    }

    private boolean xha() {
        int i = this.di + 1;
        this.di = i;
        if (i > this.fi) {
            return true;
        }
        return ("landingpage".equals(this.ik) || "landingpage_endcard".equals(this.ik) || "landingpage_split_screen".equals(this.ik) || "landingpage_direct".equals(this.ik) || "landingpage_split_ceiling".equals(this.ik)) ? false : true;
    }

    public void ik(String str) {
        if (this.xha) {
            this.nr = true;
        }
        if (this.qt == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf(X3.j.c, iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            ka(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void lr(String str) {
        this.jbs = str;
        mj();
        this.ac.put(Integer.valueOf(this.qt), Long.valueOf(SystemClock.elapsedRealtime()));
        this.uq.put(Integer.valueOf(this.qt), Long.valueOf(SystemClock.elapsedRealtime()));
        this.hcw = fi();
    }

    public void ri(String str) {
        this.ik = str;
    }

    public void ri() {
        lr(this.qt);
    }

    public void ri(int i) {
        float height = (i + this.ka.getHeight()) / qd.lr(this.ri, this.ka.getContentHeight());
        Float f = this.ihz.get(Integer.valueOf(this.qt));
        if (height > (f == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue())) {
            this.ihz.put(Integer.valueOf(this.qt), Float.valueOf(height));
        }
    }

    public void lr() {
        this.ka.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.di.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if (!z) {
                    di diVar = di.this;
                    if (!diVar.mj) {
                        diVar.di();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - di.this.ory >= 50) {
                            di diVar2 = di.this;
                            diVar2.ri(3, diVar2.jbs, diVar2.qt);
                            di.this.ory = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    diVar.mj = false;
                }
                if (z) {
                    di.this.mj();
                    di diVar3 = di.this;
                    diVar3.ac.put(Integer.valueOf(diVar3.qt), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void ka() {
        if (xha()) {
            return;
        }
        com.bytedance.sdk.openadsdk.slm.ri.ri riVarRi = new com.bytedance.sdk.openadsdk.slm.ri.ri.C0275ri().ri(this.jbs).ri(this.qt).ka(this.sf).fi(this.f18150co).di(this.vr).xha(this.tan).ri();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = riVarRi;
        this.su.sendMessageDelayed(messageObtain, 20L);
    }

    private void lr(int i) {
        if (xha() || this.wjv.contains(Integer.valueOf(i))) {
            return;
        }
        this.wjv.add(Integer.valueOf(i));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.uq.get(Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.ka.ik.lr(this.lr, new com.bytedance.sdk.openadsdk.slm.ri.ri.C0275ri().ri(this.jbs).ri(this.qt).qt(jElapsedRealtime - (l != null ? l.longValue() : jElapsedRealtime)).ri(), this.ik);
    }

    public ri ik() {
        return this.ay;
    }

    private void ik(int i) {
        if (xha()) {
            return;
        }
        di();
        this.xha = true;
        com.bytedance.sdk.openadsdk.slm.ri.ri riVarRi = new com.bytedance.sdk.openadsdk.slm.ri.ri.C0275ri().ri(this.jbs).ri(this.qt).ri(this.sf).lr(this.f18150co).ik(this.tan).ik(i).ri();
        try {
            if (this.hcw) {
                WebView.HitTestResult hitTestResult = this.ka.getHitTestResult();
                riVarRi.ri(hitTestResult.getExtra());
                riVarRi.ri(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = riVarRi;
        this.su.sendMessageDelayed(messageObtain, 100L);
    }

    public void ri(MotionEvent motionEvent) {
        this.fr.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sf = motionEvent.getX();
            this.f18150co = motionEvent.getY();
            this.slm = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            ik(2);
        } else {
            this.tan = SystemClock.elapsedRealtime() - this.slm;
            if (lr(motionEvent)) {
                ka();
            } else {
                ik(1);
            }
        }
    }

    private boolean lr(MotionEvent motionEvent) {
        this.aw = motionEvent.getX();
        float y = motionEvent.getY();
        this.bgr = y;
        float f = this.f18150co;
        if (y - f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        this.vr = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, String str, int i2) {
        if (xha()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.ac.get(Integer.valueOf(i2));
        long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
        Float f = this.ihz.get(Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.ka.ik.ik(this.lr, new com.bytedance.sdk.openadsdk.slm.ri.ri.C0275ri().ri(str).ri(i2).mj(jElapsedRealtime - jLongValue).jbs(f == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue()).lr(i).ri(), this.ik);
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.slm.ri.ri riVar = (com.bytedance.sdk.openadsdk.slm.ri.ri) message.obj;
        if (i == 100) {
            riVar.ka(this.bu ? 2 : 1);
            com.bytedance.sdk.openadsdk.ka.ik.ka(this.lr, riVar, this.ik);
            this.bu = false;
        } else if (i == 200) {
            if (this.nr) {
                ri(1, riVar.ik(), riVar.ka());
            }
            riVar.ik(this.nr ? 1 : 0);
            com.bytedance.sdk.openadsdk.ka.ik.fi(this.lr, riVar, this.ik);
            this.xha = false;
            this.nr = false;
        }
    }
}
