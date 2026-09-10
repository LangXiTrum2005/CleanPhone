package com.bytedance.sdk.openadsdk.aaj.qdl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.fs.mo;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    private static volatile mml ud;
    private final Handler qdl;
    private int lnr = 0;
    private int mml = 2;
    private int mzz = 3600000;
    private final ArrayList<ud> mo = new ArrayList<>();

    private mml() {
        fco.ud(new jpc("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.mml.1
            @Override // java.lang.Runnable
            public void run() {
                mml.this.lnr = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_pre_render_enable", 0);
                mml.this.mml = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_pre_render_max_count", 2);
                if (mml.this.mml <= 0 || mml.this.mml > 4) {
                    mml.this.mml = 2;
                }
                mml.this.mzz = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_pre_render_alive_time", 3600000);
                if (mml.this.mzz <= 0 || mml.this.mzz > 3600000) {
                    mml.this.mzz = 3600000;
                }
            }
        });
        this.qdl = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.mml.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof ud)) {
                    return false;
                }
                mml.this.mo.remove(message.obj);
                ((ud) message.obj).mml();
                return true;
            }
        });
    }

    public static mml qdl() {
        if (ud == null) {
            synchronized (mml.class) {
                try {
                    if (ud == null) {
                        ud = new mml();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ud;
    }

    public boolean ud() {
        return this.lnr == 1;
    }

    public void qdl(final ljh ljhVar) {
        if (ud() && ljhVar != null && vu.mo(ljhVar)) {
            final String strCev = ljhVar.cev();
            if (TextUtils.isEmpty(strCev)) {
                return;
            }
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.mml.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (mml.this.mo.size() >= mml.this.mml) {
                            mml.this.mo.size();
                            ud udVar = (ud) mml.this.mo.remove(0);
                            if (udVar != null) {
                                mml.this.qdl.removeMessages(udVar.tvp().hashCode());
                                udVar.mml();
                            }
                        }
                        ljhVar.exu(true);
                        Context contextQdl = yt.qdl();
                        ljh ljhVar2 = ljhVar;
                        final ud udVar2 = new ud(contextQdl, ljhVar2, ljhVar2.jb(), true, new FrameLayout(yt.qdl()), strCev);
                        mml.this.mo.add(udVar2);
                        udVar2.jpc();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strCev.hashCode();
                        messageObtain.obj = udVar2;
                        mml.this.qdl.sendMessageDelayed(messageObtain, mml.this.mzz);
                        udVar2.qdl(new qdl.ud() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.mml.3.1
                            @Override // com.bytedance.sdk.openadsdk.aaj.qdl.qdl.ud
                            public void qdl() {
                                mml.this.qdl.removeMessages(strCev.hashCode());
                                mml.this.mo.remove(udVar2);
                                udVar2.mml();
                            }
                        });
                        ljh ljhVar3 = ljhVar;
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar3, gy.lnr(ljhVar3.ji().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    public ud qdl(ljh ljhVar, FrameLayout frameLayout, mo moVar) {
        ud udVar;
        if (ud() && ljhVar.ji() != null && !TextUtils.isEmpty(ljhVar.ji().getBidAdm()) && vu.mo(ljhVar) && frameLayout != null) {
            String strCev = ljhVar.cev();
            if (TextUtils.isEmpty(strCev)) {
                return null;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.mo.size()) {
                    i2 = -1;
                    udVar = null;
                    break;
                }
                udVar = this.mo.get(i2);
                if (strCev.equals(udVar.tvp())) {
                    break;
                }
                i2++;
            }
            if (udVar != null) {
                this.qdl.removeMessages(strCev.hashCode());
                this.mo.remove(i2);
                this.mo.size();
                ljhVar.exu(true);
                udVar.qdl(frameLayout, moVar);
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, gy.lnr(ljhVar.ji().getDurationSlotType()), "PL_use_pre_render", 1);
                return udVar;
            }
        }
        return null;
    }
}
