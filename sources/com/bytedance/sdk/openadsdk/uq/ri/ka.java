package com.bytedance.sdk.openadsdk.uq.ri;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.aw.di;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.wjv.fi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private static volatile ka lr;
    private final Handler ri;
    private int ik = 0;
    private int ka = 2;
    private int fi = 3600000;
    private final ArrayList<lr> di = new ArrayList<>();

    private ka() {
        dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.1
            @Override // java.lang.Runnable
            public void run() {
                ka.this.ik = fi.ri("plb_pre_render_enable", 0);
                ka.this.ka = fi.ri("plb_pre_render_max_count", 2);
                if (ka.this.ka <= 0 || ka.this.ka > 4) {
                    ka.this.ka = 2;
                }
                ka.this.fi = fi.ri("plb_pre_render_alive_time", 3600000);
                if (ka.this.fi <= 0 || ka.this.fi > 3600000) {
                    ka.this.fi = 3600000;
                }
            }
        });
        this.ri = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof lr)) {
                    return false;
                }
                ka.this.di.remove(message.obj);
                ((lr) message.obj).ka();
                return true;
            }
        });
    }

    public static ka ri() {
        if (lr == null) {
            synchronized (ka.class) {
                try {
                    if (lr == null) {
                        lr = new ka();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lr;
    }

    public boolean lr() {
        return this.ik == 1;
    }

    public void ri(final wjv wjvVar) {
        if (lr() && wjvVar != null && dw.di(wjvVar)) {
            final String strJf = wjvVar.jf();
            if (TextUtils.isEmpty(strJf)) {
                return;
            }
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ka.this.di.size() >= ka.this.ka) {
                            ka.this.di.size();
                            lr lrVar = (lr) ka.this.di.remove(0);
                            if (lrVar != null) {
                                ka.this.ri.removeMessages(lrVar.jbs().hashCode());
                                lrVar.ka();
                            }
                        }
                        wjvVar.slm(true);
                        Context contextRi = nr.ri();
                        wjv wjvVar2 = wjvVar;
                        final lr lrVar2 = new lr(contextRi, wjvVar2, wjvVar2.bbu(), true, new FrameLayout(nr.ri()), strJf);
                        ka.this.di.add(lrVar2);
                        lrVar2.mj();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strJf.hashCode();
                        messageObtain.obj = lrVar2;
                        ka.this.ri.sendMessageDelayed(messageObtain, ka.this.fi);
                        lrVar2.ri(new ri.lr() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ka.3.1
                            @Override // com.bytedance.sdk.openadsdk.uq.ri.ri.lr
                            public void ri() {
                                ka.this.ri.removeMessages(strJf.hashCode());
                                ka.this.di.remove(lrVar2);
                                lrVar2.ka();
                            }
                        });
                        wjv wjvVar3 = wjvVar;
                        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar3, ig.ik(wjvVar3.eb().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    public lr ri(wjv wjvVar, FrameLayout frameLayout, di diVar) {
        lr lrVar;
        if (lr() && wjvVar.eb() != null && !TextUtils.isEmpty(wjvVar.eb().getBidAdm()) && dw.di(wjvVar) && frameLayout != null) {
            String strJf = wjvVar.jf();
            if (TextUtils.isEmpty(strJf)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.di.size()) {
                    i = -1;
                    lrVar = null;
                    break;
                }
                lrVar = this.di.get(i);
                if (strJf.equals(lrVar.jbs())) {
                    break;
                }
                i++;
            }
            if (lrVar != null) {
                this.ri.removeMessages(strJf.hashCode());
                this.di.remove(i);
                this.di.size();
                wjvVar.slm(true);
                lrVar.ri(frameLayout, diVar);
                com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, ig.ik(wjvVar.eb().getDurationSlotType()), "PL_use_pre_render", 1);
                return lrVar;
            }
        }
        return null;
    }
}
