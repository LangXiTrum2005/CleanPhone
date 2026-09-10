package com.bytedance.sdk.openadsdk.tD.Lxb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.sLN.JXs;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private static volatile ZU LD;
    private final Handler Lxb;
    private int lk = 0;
    private int ZU = 2;
    private int JXs = 3600000;
    private final ArrayList<LD> lc = new ArrayList<>();

    private ZU() {
        hg.LD(new OY("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.1
            @Override // java.lang.Runnable
            public void run() {
                ZU.this.lk = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_pre_render_enable", 0);
                ZU.this.ZU = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_pre_render_max_count", 2);
                if (ZU.this.ZU <= 0 || ZU.this.ZU > 4) {
                    ZU.this.ZU = 2;
                }
                ZU.this.JXs = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_pre_render_alive_time", 3600000);
                if (ZU.this.JXs <= 0 || ZU.this.JXs > 3600000) {
                    ZU.this.JXs = 3600000;
                }
            }
        });
        this.Lxb = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                if (!(message.obj instanceof LD)) {
                    return false;
                }
                ZU.this.lc.remove(message.obj);
                ((LD) message.obj).ZU();
                return true;
            }
        });
    }

    public static ZU Lxb() {
        if (LD == null) {
            synchronized (ZU.class) {
                try {
                    if (LD == null) {
                        LD = new ZU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return LD;
    }

    public boolean LD() {
        return this.lk == 1;
    }

    @MainThread
    public void Lxb(@Nullable final tD tDVar) {
        if (LD() && tDVar != null && eK.lc(tDVar)) {
            final String strXNP = tDVar.xNP();
            if (TextUtils.isEmpty(strXNP)) {
                return;
            }
            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ZU.this.lc.size() >= ZU.this.ZU) {
                            ZU.this.lc.size();
                            LD ld = (LD) ZU.this.lc.remove(0);
                            if (ld != null) {
                                ZU.this.Lxb.removeMessages(ld.OY().hashCode());
                                ld.ZU();
                            }
                        }
                        tDVar.nBu(true);
                        Context contextLxb = kqm.Lxb();
                        tD tDVar2 = tDVar;
                        final LD ld2 = new LD(contextLxb, tDVar2, tDVar2.wCT(), true, new FrameLayout(kqm.Lxb()), strXNP);
                        ZU.this.lc.add(ld2);
                        ld2.ebl();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strXNP.hashCode();
                        messageObtain.obj = ld2;
                        ZU.this.Lxb.sendMessageDelayed(messageObtain, ZU.this.JXs);
                        ld2.Lxb(new Lxb.InterfaceC0118Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.3.1
                            @Override // com.bytedance.sdk.openadsdk.tD.Lxb.Lxb.InterfaceC0118Lxb
                            public void Lxb() {
                                ZU.this.Lxb.removeMessages(strXNP.hashCode());
                                ZU.this.lc.remove(ld2);
                                ld2.ZU();
                            }
                        });
                        tD tDVar3 = tDVar;
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar3, nJ.lk(tDVar3.hg().getDurationSlotType()), "PL_start_pre_render", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.3.2
                            @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                            public JSONObject Lxb() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("is_pre_render", 1);
                                } catch (JSONException unused) {
                                }
                                return jSONObject;
                            }
                        });
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            });
        }
    }

    @MainThread
    public LD Lxb(@NonNull tD tDVar, FrameLayout frameLayout, JXs jXs) {
        LD ld;
        if (LD() && tDVar.hg() != null && !TextUtils.isEmpty(tDVar.hg().getBidAdm()) && eK.lc(tDVar) && frameLayout != null) {
            String strXNP = tDVar.xNP();
            if (TextUtils.isEmpty(strXNP)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.lc.size()) {
                    i = -1;
                    ld = null;
                    break;
                }
                ld = this.lc.get(i);
                if (strXNP.equals(ld.OY())) {
                    break;
                }
                i++;
            }
            if (ld != null) {
                this.Lxb.removeMessages(strXNP.hashCode());
                this.lc.remove(i);
                this.lc.size();
                tDVar.nBu(true);
                ld.Lxb(frameLayout, jXs);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, nJ.lk(tDVar.hg().getDurationSlotType()), "PL_use_pre_render", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.ZU.4
                    @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                    public JSONObject Lxb() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("is_pre_render", 1);
                        } catch (JSONException unused) {
                        }
                        return jSONObject;
                    }
                });
                return ld;
            }
        }
        return null;
    }
}
