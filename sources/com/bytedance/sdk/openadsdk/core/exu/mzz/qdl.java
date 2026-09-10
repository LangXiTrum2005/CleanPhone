package com.bytedance.sdk.openadsdk.core.exu.mzz;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.ud.qdl.wd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.fs;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.rq;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.to;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.tvp;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static final com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl qdl = new com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.qdl();

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr(lnr lnrVar, ljh ljhVar, AdSlot adSlot) {
        if (qdl(lnrVar)) {
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud((com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<tvp>) new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, gy.lnr(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(ljhVar, (String) null, -1, lnrVar), new tvp(lnrVar.jtx(), lnrVar.mo())));
        }
    }

    private static boolean qdl(lnr lnrVar) {
        return true;
    }

    private static void ud(lnr lnrVar, ljh ljhVar, AdSlot adSlot) {
        if (qdl(lnrVar)) {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_start", new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, gy.lnr(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(ljhVar, (String) null, -1, lnrVar), new rq(lnrVar.jtx(), lnrVar.exu() ? lnrVar.fs() : lnrVar.mo())));
        }
    }

    public static void qdl(final lnr lnrVar, final com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl) {
        ljh ljhVar;
        AdSlot adSlot;
        if ((lnrVar.mo() > 0 || lnrVar.exu()) && lnrVar.jl() != -2) {
            if (lnrVar.jl() != 1) {
                lnrVar.mzz(6000);
                lnrVar.mo(6000);
                lnrVar.wd(6000);
                boolean z2 = lnrVar.mzz("material_meta") != null && (lnrVar.mzz("material_meta") instanceof ljh);
                boolean z3 = lnrVar.mzz("ad_slot") != null && (lnrVar.mzz("ad_slot") instanceof AdSlot);
                if (z2 && z3) {
                    ljh ljhVar2 = (ljh) lnrVar.mzz("material_meta");
                    AdSlot adSlot2 = (AdSlot) lnrVar.mzz("ad_slot");
                    ud(lnrVar, ljhVar2, adSlot2);
                    ljhVar = ljhVar2;
                    adSlot = adSlot2;
                } else {
                    ljhVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final ljh ljhVar3 = ljhVar;
                final com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl2 = new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.1
                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                    public void qdl(lnr lnrVar2, int i2) {
                        com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl3 = interfaceC0056qdl;
                        if (interfaceC0056qdl3 != null) {
                            interfaceC0056qdl3.qdl(lnrVar2, i2);
                        }
                        if (ljhVar3 == null || adSlot3 == null) {
                            return;
                        }
                        qdl.ud(lnrVar, ljhVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                    public void ud(lnr lnrVar2, int i2) {
                        AdSlot adSlot4;
                        com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl3 = interfaceC0056qdl;
                        if (interfaceC0056qdl3 != null) {
                            interfaceC0056qdl3.qdl(lnrVar2, i2);
                        }
                        ljh ljhVar4 = ljhVar3;
                        if (ljhVar4 != null && (adSlot4 = adSlot3) != null) {
                            qdl.lnr(lnrVar, ljhVar4, adSlot4);
                        }
                        lnrVar.yt();
                    }

                    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                    public void qdl(lnr lnrVar2, int i2, String str) {
                        com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl3 = interfaceC0056qdl;
                        if (interfaceC0056qdl3 != null) {
                            interfaceC0056qdl3.qdl(lnrVar2, i2, str);
                        }
                        if (ljhVar3 == null || adSlot3 == null) {
                            return;
                        }
                        qdl.ud(lnrVar, ljhVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i2, str);
                    }
                };
                if (!qdl(lnrVar.jtx())) {
                    if (interfaceC0056qdl != null) {
                        interfaceC0056qdl.qdl(lnrVar, 404, "unexpected url: " + lnrVar.jtx());
                    }
                    ud(lnrVar, ljhVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                jpc jpcVar = new jpc("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            qdl.qdl.qdl(yt.qdl(), lnrVar, interfaceC0056qdl2);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                };
                if (fco.mo()) {
                    fco.ud(jpcVar);
                    return;
                } else {
                    jpcVar.run();
                    return;
                }
            }
        }
        if (interfaceC0056qdl != null) {
            interfaceC0056qdl.qdl(lnrVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(lnr lnrVar, ljh ljhVar, AdSlot adSlot, long j, int i2, String str) {
        if (qdl(lnrVar)) {
            String strLnr = gy.lnr(adSlot.getDurationSlotType());
            JSONObject jSONObjectQdl = com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(ljhVar, (String) null, -1, lnrVar);
            to toVar = new to();
            toVar.qdl(lnrVar.jtx());
            toVar.qdl(lnrVar.mo());
            toVar.ud(j);
            toVar.qdl(i2);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            toVar.ud(str);
            toVar.lnr("");
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl((com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl<to>) new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, strLnr, jSONObjectQdl, toVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(lnr lnrVar, ljh ljhVar, AdSlot adSlot, long j) {
        if (qdl(lnrVar)) {
            String strLnr = gy.lnr(adSlot.getDurationSlotType());
            JSONObject jSONObjectQdl = com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(ljhVar, (String) null, -1, lnrVar);
            fs fsVar = new fs();
            fsVar.qdl(lnrVar.jtx());
            fsVar.qdl(lnrVar.mo());
            fsVar.ud(j);
            if (lnrVar.oth() == 1) {
                fsVar.lnr(1L);
            } else {
                fsVar.lnr(0L);
            }
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("load_video_success", new com.bytedance.sdk.openadsdk.mml.mzz.ud.qdl(ljhVar, strLnr, jSONObjectQdl, fsVar));
        }
    }

    public static boolean qdl(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str2 = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str2 = "https:" + str.substring(4);
        } else {
            str2 = str;
        }
        return wd.lnr(str2) != null;
    }
}
