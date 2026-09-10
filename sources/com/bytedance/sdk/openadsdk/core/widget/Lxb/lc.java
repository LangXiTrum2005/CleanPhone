package com.bytedance.sdk.openadsdk.core.widget.Lxb;

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
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements aH.Lxb {
    float IeN;
    float JVA;
    tD LD;
    Context Lxb;
    float NXR;
    boolean OY;
    String QAg;
    float STP;
    long VVE;
    WebView ZU;
    boolean brP;
    boolean ebl;
    private final boolean foI;
    boolean kqm;
    int nBu;
    private long nE;
    float sLN;
    long tD;
    private boolean xan;
    private final Handler id = new aH(STP.LD().getLooper(), this);
    String lk = "landingpage";
    int lc = 0;
    private final String KPU = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String Ivz = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    Lxb aH = new Lxb() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.Lxb
        public void Lxb() {
            lc lcVar = lc.this;
            lcVar.OY = true;
            lcVar.lc();
            lc lcVar2 = lc.this;
            lcVar2.Lxb(2, lcVar2.QAg, lcVar2.nBu);
        }
    };
    GestureDetector CSn = new GestureDetector(kqm.Lxb(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            lc.this.kqm = true;
            return false;
        }
    });
    int JXs = kqm.ZU().ro();
    Map<Integer, Long> DY = new HashMap();
    Map<Integer, Float> Sfi = new HashMap();
    Map<Integer, Long> HD = new HashMap();
    List<Integer> eK = new ArrayList();

    public interface Lxb {
        void Lxb();
    }

    public lc(WebView webView, tD tDVar, Context context, boolean z) {
        this.LD = tDVar;
        this.ZU = webView;
        this.Lxb = context;
        this.foI = z;
    }

    private boolean JXs() {
        try {
            int i = this.nBu;
            if (i == 2 || i == 3) {
                return Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.QAg) || Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.QAg);
            }
            return false;
        } catch (Throwable th) {
            sLN.Lxb("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OY() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.ZU.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.nBu = currentIndex + 1;
            if (this.foI) {
                this.nBu = currentIndex + 2;
            }
        }
    }

    private void ZU(String str) {
        if (ebl()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.LD, new com.bytedance.sdk.openadsdk.STP.Lxb.Lxb.C0076Lxb().Lxb(this.QAg).LD(Uri.decode(str)).Lxb(), this.lk);
    }

    private boolean ebl() {
        int i = this.lc + 1;
        this.lc = i;
        if (i > this.JXs) {
            return true;
        }
        return ("landingpage".equals(this.lk) || "landingpage_endcard".equals(this.lk) || "landingpage_split_screen".equals(this.lk) || "landingpage_direct".equals(this.lk) || "landingpage_split_ceiling".equals(this.lk)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void lc() {
        if (this.Sfi.get(Integer.valueOf(this.nBu)) != null) {
            return;
        }
        float height = this.ZU.getHeight() / le.lk(this.Lxb, this.ZU.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.Sfi.put(Integer.valueOf(this.nBu), Float.valueOf(height));
    }

    public void LD(String str) {
        this.QAg = str;
        OY();
        this.DY.put(Integer.valueOf(this.nBu), Long.valueOf(SystemClock.elapsedRealtime()));
        this.HD.put(Integer.valueOf(this.nBu), Long.valueOf(SystemClock.elapsedRealtime()));
        this.xan = JXs();
    }

    public void lk(String str) {
        if (this.ebl) {
            this.brP = true;
        }
        if (this.nBu == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf("&", iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            ZU(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void Lxb(String str) {
        this.lk = str;
    }

    public void Lxb() {
        LD(this.nBu);
    }

    public void Lxb(int i) {
        float height = (this.ZU.getHeight() + i) / le.lk(this.Lxb, this.ZU.getContentHeight());
        Float f = this.Sfi.get(Integer.valueOf(this.nBu));
        if (height > (f == null ? 0.0f : f.floatValue())) {
            this.Sfi.put(Integer.valueOf(this.nBu), Float.valueOf(height));
        }
    }

    public void LD() {
        this.ZU.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.lc.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if (!z) {
                    lc lcVar = lc.this;
                    if (!lcVar.OY) {
                        lcVar.lc();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - lc.this.nE >= 50) {
                            lc lcVar2 = lc.this;
                            lcVar2.Lxb(3, lcVar2.QAg, lcVar2.nBu);
                            lc.this.nE = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    lcVar.OY = false;
                }
                if (z) {
                    lc.this.OY();
                    lc lcVar3 = lc.this;
                    lcVar3.DY.put(Integer.valueOf(lcVar3.nBu), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void ZU() {
        if (ebl()) {
            return;
        }
        com.bytedance.sdk.openadsdk.STP.Lxb.Lxb Lxb2 = new com.bytedance.sdk.openadsdk.STP.Lxb.Lxb.C0076Lxb().Lxb(this.QAg).Lxb(this.nBu).ZU(this.JVA).JXs(this.sLN).lc(this.IeN).ebl(this.tD).Lxb();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = Lxb2;
        this.id.sendMessageDelayed(messageObtain, 20L);
    }

    private void LD(int i) {
        if (ebl() || this.eK.contains(Integer.valueOf(i))) {
            return;
        }
        this.eK.add(Integer.valueOf(i));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.HD.get(Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.LD, new com.bytedance.sdk.openadsdk.STP.Lxb.Lxb.C0076Lxb().Lxb(this.QAg).Lxb(this.nBu).nBu(jElapsedRealtime - (l != null ? l.longValue() : jElapsedRealtime)).Lxb(), this.lk);
    }

    public Lxb lk() {
        return this.aH;
    }

    private void lk(int i) {
        if (ebl()) {
            return;
        }
        lc();
        this.ebl = true;
        com.bytedance.sdk.openadsdk.STP.Lxb.Lxb Lxb2 = new com.bytedance.sdk.openadsdk.STP.Lxb.Lxb.C0076Lxb().Lxb(this.QAg).Lxb(this.nBu).Lxb(this.JVA).LD(this.sLN).lk(this.tD).lk(i).Lxb();
        try {
            if (this.xan) {
                WebView.HitTestResult hitTestResult = this.ZU.getHitTestResult();
                Lxb2.Lxb(hitTestResult.getExtra());
                Lxb2.Lxb(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = Lxb2;
        this.id.sendMessageDelayed(messageObtain, 100L);
    }

    public void Lxb(MotionEvent motionEvent) {
        this.CSn.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.JVA = motionEvent.getX();
            this.sLN = motionEvent.getY();
            this.VVE = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            lk(2);
        } else {
            this.tD = SystemClock.elapsedRealtime() - this.VVE;
            if (LD(motionEvent)) {
                ZU();
            } else {
                lk(1);
            }
        }
    }

    private boolean LD(MotionEvent motionEvent) {
        this.NXR = motionEvent.getX();
        float y = motionEvent.getY();
        this.STP = y;
        float f = this.sLN;
        if (y - f == 0.0f) {
            return false;
        }
        this.IeN = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i, String str, int i2) {
        if (ebl()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.DY.get(Integer.valueOf(i2));
        long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
        Float f = this.Sfi.get(Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.ZU.lk.lk(this.LD, new com.bytedance.sdk.openadsdk.STP.Lxb.Lxb.C0076Lxb().Lxb(str).Lxb(i2).OY(jElapsedRealtime - jLongValue).QAg(f == null ? 0.0f : f.floatValue()).LD(i).Lxb(), this.lk);
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.STP.Lxb.Lxb lxb = (com.bytedance.sdk.openadsdk.STP.Lxb.Lxb) message.obj;
        if (i == 100) {
            lxb.ZU(this.kqm ? 2 : 1);
            com.bytedance.sdk.openadsdk.ZU.lk.ZU(this.LD, lxb, this.lk);
            this.kqm = false;
        } else if (i == 200) {
            if (this.brP) {
                Lxb(1, lxb.lk(), lxb.ZU());
            }
            lxb.lk(this.brP ? 1 : 0);
            com.bytedance.sdk.openadsdk.ZU.lk.JXs(this.LD, lxb, this.lk);
            this.ebl = false;
            this.brP = false;
        }
    }
}
