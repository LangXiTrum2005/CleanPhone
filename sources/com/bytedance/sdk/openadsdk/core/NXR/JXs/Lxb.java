package com.bytedance.sdk.openadsdk.core.NXR.JXs;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.ebl;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.STP.lk;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.JVA;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.QAg;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.nBu;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.sLN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4918wK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5006xK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.util.concurrent.ArrayBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static final CK Lxb = new C4710tz(22);

    private static void LD(Uo0 uo0, tD tDVar, AdSlot adSlot) {
        if (Lxb(uo0)) {
            lk.Lxb("load_video_start", new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVar, nJ.lk(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(tDVar, (String) null, -1, uo0), new JVA(uo0.NXR(), uo0.nBu() ? uo0.QAg() : uo0.lk())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk(Uo0 uo0, tD tDVar, AdSlot adSlot) {
        if (Lxb(uo0)) {
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD((com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb<QAg>) new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVar, nJ.lk(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(tDVar, (String) null, -1, uo0), new QAg(uo0.NXR(), uo0.lk())));
        }
    }

    public static void Lxb(final Uo0 uo0, final InterfaceC5182zK interfaceC5182zK) {
        tD tDVar;
        AdSlot adSlot;
        if ((uo0.lk() > 0 || uo0.nBu()) && uo0.IeN() != -2) {
            if (uo0.IeN() != 1) {
                uo0.ZU(6000);
                uo0.JXs(6000);
                uo0.lc(6000);
                boolean z = uo0.JXs("material_meta") != null && (uo0.JXs("material_meta") instanceof tD);
                boolean z2 = uo0.JXs("ad_slot") != null && (uo0.JXs("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    tDVar = (tD) uo0.JXs("material_meta");
                    AdSlot adSlot2 = (AdSlot) uo0.JXs("ad_slot");
                    LD(uo0, tDVar, adSlot2);
                    adSlot = adSlot2;
                } else {
                    tDVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final tD tDVar2 = tDVar;
                final AdSlot adSlot3 = adSlot;
                final InterfaceC5182zK interfaceC5182zK2 = new InterfaceC5182zK() { // from class: com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.1
                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void LD(Uo0 uo1, int i) {
                        AdSlot adSlot4;
                        InterfaceC5182zK interfaceC5182zK3 = interfaceC5182zK;
                        if (interfaceC5182zK3 != null) {
                            interfaceC5182zK3.Lxb(uo1, i);
                        }
                        tD tDVar3 = tDVar2;
                        if (tDVar3 != null && (adSlot4 = adSlot3) != null) {
                            Lxb.lk(uo0, tDVar3, adSlot4);
                        }
                        uo0.STP();
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo1, int i) {
                        InterfaceC5182zK interfaceC5182zK3 = interfaceC5182zK;
                        if (interfaceC5182zK3 != null) {
                            interfaceC5182zK3.Lxb(uo1, i);
                        }
                        if (tDVar2 == null || adSlot3 == null) {
                            return;
                        }
                        Lxb.LD(uo0, tDVar2, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
                    public void Lxb(Uo0 uo1, int i, String str) {
                        InterfaceC5182zK interfaceC5182zK3 = interfaceC5182zK;
                        if (interfaceC5182zK3 != null) {
                            interfaceC5182zK3.Lxb(uo1, i, str);
                        }
                        if (tDVar2 == null || adSlot3 == null) {
                            return;
                        }
                        Lxb.LD(uo0, tDVar2, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }
                };
                if (!Lxb(uo0.NXR())) {
                    if (interfaceC5182zK != null) {
                        interfaceC5182zK.Lxb(uo0, 404, "unexpected url: " + uo0.NXR());
                    }
                    LD(uo0, tDVar, adSlot, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                OY oy = new OY("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 23) {
                            try {
                                ((C4710tz) Lxb.Lxb).h(kqm.Lxb(), uo0, interfaceC5182zK2);
                                return;
                            } catch (Throwable th) {
                                th.getMessage();
                                return;
                            }
                        }
                        if (Lxb.Lxb()) {
                            LK lk = AbstractC4918wK.f5175a;
                            Uo0 uo1 = uo0;
                            if (lk.b()) {
                                AK ak = lk.f3348a;
                                ArrayBlockingQueue arrayBlockingQueue = ak.c;
                                arrayBlockingQueue.size();
                                C5006xK c5006xK = (C5006xK) arrayBlockingQueue.poll();
                                if (c5006xK == null) {
                                    c5006xK = new C5006xK();
                                }
                                c5006xK.f5218a = 0;
                                c5006xK.f = uo1;
                                synchronized (ak) {
                                    ak.d.add(c5006xK);
                                    ak.notify();
                                }
                            }
                        }
                    }
                };
                if (hg.JXs()) {
                    hg.LD(oy);
                    return;
                } else {
                    oy.run();
                    return;
                }
            }
        }
        if (interfaceC5182zK != null) {
            interfaceC5182zK.Lxb(uo0, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(Uo0 uo0, tD tDVar, AdSlot adSlot, long j, int i, String str) {
        if (Lxb(uo0)) {
            String strLk = nJ.lk(adSlot.getDurationSlotType());
            JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(tDVar, (String) null, -1, uo0);
            nBu nbu = new nBu();
            nbu.Lxb(uo0.NXR());
            nbu.Lxb(uo0.lk());
            nbu.LD(j);
            nbu.Lxb(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            nbu.LD(str);
            nbu.lk("");
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb((com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb<nBu>) new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVar, strLk, jSONObjectLxb, nbu));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(Uo0 uo0, tD tDVar, AdSlot adSlot, long j) {
        if (Lxb(uo0)) {
            String strLk = nJ.lk(adSlot.getDurationSlotType());
            JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(tDVar, (String) null, -1, uo0);
            sLN sln = new sLN();
            sln.Lxb(uo0.NXR());
            sln.Lxb(uo0.lk());
            sln.LD(j);
            if (uo0.tD() == 1) {
                sln.lk(1L);
            } else {
                sln.lk(0L);
            }
            lk.Lxb("load_video_success", new com.bytedance.sdk.openadsdk.ZU.JXs.LD.Lxb(tDVar, strLk, jSONObjectLxb, sln));
        }
    }

    private static boolean Lxb(Uo0 uo0) {
        return Build.VERSION.SDK_INT >= 23 || uo0.IeN() != 0;
    }

    public static boolean Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return ebl.lk(str) != null;
    }

    public static boolean Lxb() {
        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("video_lower_support_discard", 0) == 0;
    }
}
