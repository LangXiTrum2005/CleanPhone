package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dw;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.jbs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik implements igq.ri {
    private View.OnTouchListener ac;
    private int aw;
    private float bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18056co;
    private final Context di;
    private final int fi;
    private final int ik;
    private final List<Integer> ka;
    private final int lr;
    private volatile float mj;
    private float nr;
    private long sf;
    private boolean slm;
    private String tan;
    private volatile float xha;
    private float jbs = -1.0f;
    private float qt = -1.0f;
    private final Handler vr = new igq(jbs.ri().getLooper(), this);
    InterfaceC0211ri ri = new InterfaceC0211ri() { // from class: com.bytedance.sdk.component.jbs.ri.1
        @Override // com.bytedance.sdk.component.jbs.ri.InterfaceC0211ri
        public void ri() {
            if (ri.this.jbs == -1.0f && ri.this.qt == -1.0f && ri.this.f18056co == -1) {
                float unused = ri.this.jbs;
                float unused2 = ri.this.qt;
                ri riVar = ri.this;
                riVar.jbs = riVar.xha;
                ri riVar2 = ri.this;
                riVar2.qt = riVar2.mj;
                ri riVar3 = ri.this;
                riVar3.f18056co = riVar3.sf;
                ri.this.slm = true;
            }
            float unused3 = ri.this.jbs;
            float unused4 = ri.this.qt;
        }

        @Override // com.bytedance.sdk.component.jbs.ri.InterfaceC0211ri
        public void ri(int i) {
            ri.this.aw = i;
            ri.this.lr();
        }
    };
    private int ihz = -1;
    private final List<Integer> bgr = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0211ri {
        void ri();

        void ri(int i);
    }

    public ri(Context context, int i, int i2, List<Integer> list, int i3) {
        this.di = context;
        if (i == -1) {
            this.lr = dw.ri(context);
        } else {
            this.lr = dw.ri(context, i);
        }
        this.ik = dw.ri(context, i2);
        this.ka = list;
        this.fi = i3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ri riVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.sf = SystemClock.elapsedRealtime();
        this.xha = x;
        this.mj = y;
        if (action == 0) {
            riVar = this;
            riVar.bu = x;
            riVar.nr = y;
        } else if (action != 1) {
            riVar = this;
        } else {
            riVar = this;
            if (riVar.ri(x, y, this.bu, this.nr, this.di)) {
                int iRi = ri(riVar.xha, riVar.mj, riVar.sf);
                boolean zContains = riVar.bgr.contains(Integer.valueOf(riVar.aw));
                ri(view, motionEvent, iRi, !zContains);
                if (!zContains) {
                    riVar.bgr.add(Integer.valueOf(riVar.aw));
                }
                if (iRi == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = riVar.ac;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        this.jbs = -1.0f;
        this.qt = -1.0f;
        this.f18056co = -1L;
    }

    @Override // com.bytedance.sdk.component.jbs.ik
    public void ri(View.OnTouchListener onTouchListener) {
        this.ac = onTouchListener;
    }

    public InterfaceC0211ri ri() {
        return this.ri;
    }

    private void ri(View view, MotionEvent motionEvent, int i, boolean z) {
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
        jSONObject.put("current_url_index", this.aw);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.vr.sendMessageDelayed(messageObtain, 200L);
    }

    public void ri(String str) {
        this.tan = str;
    }

    private int ri(float f, float f2, long j) {
        if (this.jbs == -1.0f && this.qt == -1.0f && this.f18056co == -1) {
            return 1;
        }
        if (!this.ka.contains(Integer.valueOf(this.aw))) {
            return 2;
        }
        if (j - this.f18056co > this.fi) {
            lr();
            return 3;
        }
        float fAbs = Math.abs(f - this.jbs);
        float fAbs2 = Math.abs(f2 - this.qt);
        if (fAbs <= this.lr / 2.0f && fAbs2 <= this.ik / 2.0f) {
            return 0;
        }
        lr();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.slm ? 1 : 0);
                    this.slm = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.jbs.ri.ri.ri().lr() != null) {
                com.bytedance.sdk.component.jbs.ri.ri.ri().lr().ri(this.tan, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
