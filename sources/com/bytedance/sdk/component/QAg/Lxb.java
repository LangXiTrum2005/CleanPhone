package com.bytedance.sdk.component.QAg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.CSn;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.ebl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements View.OnTouchListener, aH.Lxb {
    private View.OnTouchListener DY;
    private long JVA;
    private final int JXs;
    private final int LD;
    private int NXR;
    private volatile float OY;
    private ViewConfiguration Sfi;
    private boolean VVE;
    private final List<Integer> ZU;
    private float brP;
    private volatile float ebl;
    private float kqm;
    private final Context lc;
    private final int lk;
    private long sLN;
    private String tD;
    private float QAg = -1.0f;
    private float nBu = -1.0f;
    private final Handler IeN = new aH(ebl.Lxb().getLooper(), this);
    InterfaceC0051Lxb Lxb = new InterfaceC0051Lxb() { // from class: com.bytedance.sdk.component.QAg.Lxb.1
        @Override // com.bytedance.sdk.component.QAg.Lxb.InterfaceC0051Lxb
        public void Lxb() {
            if (Lxb.this.QAg == -1.0f && Lxb.this.nBu == -1.0f && Lxb.this.sLN == -1) {
                float unused = Lxb.this.QAg;
                float unused2 = Lxb.this.nBu;
                Lxb lxb = Lxb.this;
                lxb.QAg = lxb.ebl;
                Lxb lxb2 = Lxb.this;
                lxb2.nBu = lxb2.OY;
                Lxb lxb3 = Lxb.this;
                lxb3.sLN = lxb3.JVA;
                Lxb.this.VVE = true;
            }
            float unused3 = Lxb.this.QAg;
            float unused4 = Lxb.this.nBu;
        }

        @Override // com.bytedance.sdk.component.QAg.Lxb.InterfaceC0051Lxb
        public void Lxb(int i) {
            Lxb.this.NXR = i;
            Lxb.this.LD();
        }
    };
    private int HD = -1;
    private final List<Integer> STP = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.QAg.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0051Lxb {
        void Lxb();

        void Lxb(int i);
    }

    public Lxb(Context context, int i, int i2, List<Integer> list, int i3) {
        this.lc = context;
        if (i == -1) {
            this.LD = CSn.Lxb(context);
        } else {
            this.LD = CSn.Lxb(context, i);
        }
        this.lk = CSn.Lxb(context, i2);
        this.ZU = list;
        this.JXs = i3;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.JVA = SystemClock.elapsedRealtime();
        this.ebl = x;
        this.OY = y;
        if (action == 0) {
            this.kqm = x;
            this.brP = y;
        } else if (action == 1 && Lxb(x, y)) {
            int iLxb = Lxb(this.ebl, this.OY, this.JVA);
            boolean z = !this.STP.contains(Integer.valueOf(this.NXR));
            Lxb(view, motionEvent, iLxb, z);
            if (z) {
                this.STP.add(Integer.valueOf(this.NXR));
            }
            if (iLxb == 0) {
                motionEvent.setAction(3);
            }
        }
        View.OnTouchListener onTouchListener = this.DY;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        this.QAg = -1.0f;
        this.nBu = -1.0f;
        this.sLN = -1L;
    }

    public void Lxb(View.OnTouchListener onTouchListener) {
        this.DY = onTouchListener;
    }

    public InterfaceC0051Lxb Lxb() {
        return this.Lxb;
    }

    private void Lxb(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.NXR);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.IeN.sendMessageDelayed(messageObtain, 200L);
    }

    private boolean Lxb(float f, float f2) {
        if (this.Sfi == null) {
            this.Sfi = ViewConfiguration.get(this.lc);
        }
        if (this.HD == -1) {
            this.HD = this.Sfi.getScaledTouchSlop();
        }
        return Math.abs(f - this.kqm) <= ((float) this.HD) && Math.abs(f2 - this.brP) <= ((float) this.HD);
    }

    public void Lxb(String str) {
        this.tD = str;
    }

    private int Lxb(float f, float f2, long j) {
        if (this.QAg == -1.0f && this.nBu == -1.0f && this.sLN == -1) {
            return 1;
        }
        if (!this.ZU.contains(Integer.valueOf(this.NXR))) {
            return 2;
        }
        if (j - this.sLN > this.JXs) {
            LD();
            return 3;
        }
        float fAbs = Math.abs(f - this.QAg);
        float fAbs2 = Math.abs(f2 - this.nBu);
        if (fAbs <= this.LD / 2.0f && fAbs2 <= this.lk / 2.0f) {
            return 0;
        }
        LD();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.VVE ? 1 : 0);
                    this.VVE = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.QAg.Lxb.Lxb.Lxb().LD() != null) {
                com.bytedance.sdk.component.QAg.Lxb.Lxb.Lxb().LD().Lxb(this.tD, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
