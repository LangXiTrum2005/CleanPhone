package com.bytedance.sdk.openadsdk.core.bgr.fi;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.bytedance.sdk.component.lr.ri.xha;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.ka.fi.lr.co;
import com.bytedance.sdk.openadsdk.ka.fi.lr.jbs;
import com.bytedance.sdk.openadsdk.ka.fi.lr.qt;
import com.bytedance.sdk.openadsdk.ka.fi.lr.sf;
import com.bytedance.sdk.openadsdk.slm.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import laky.saneness;
import sanskrit.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static final saneness ri = new dern();

    /* JADX INFO: Access modifiers changed from: private */
    public static void ik(ik ikVar, wjv wjvVar, AdSlot adSlot) {
        if (ri(ikVar)) {
            com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(wjvVar, (String) null, -1, ikVar);
            riVarRi.ri(new jbs(ikVar.slm(), ikVar.di()));
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(riVarRi);
        }
    }

    private static void lr(ik ikVar, wjv wjvVar, AdSlot adSlot) {
        if (ri(ikVar)) {
            long jCo = ikVar.aw() ? ikVar.co() : ikVar.di();
            com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(wjvVar, (String) null, -1, ikVar);
            riVarRi.ri(new sf(ikVar.slm(), jCo));
            ka.ri("load_video_start", riVarRi);
        }
    }

    private static boolean ri(ik ikVar) {
        return true;
    }

    public static void ri(final ik ikVar, final saneness.attabal attabalVar) {
        wjv wjvVar;
        AdSlot adSlot;
        if ((ikVar.di() > 0 || ikVar.aw()) && ikVar.nr() != -2) {
            if (ikVar.nr() != 1) {
                ikVar.fi(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                ikVar.di(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                ikVar.xha(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED);
                boolean z = ikVar.fi("material_meta") != null && (ikVar.fi("material_meta") instanceof wjv);
                boolean z2 = ikVar.fi("ad_slot") != null && (ikVar.fi("ad_slot") instanceof AdSlot);
                if (z && z2) {
                    wjv wjvVar2 = (wjv) ikVar.fi("material_meta");
                    AdSlot adSlot2 = (AdSlot) ikVar.fi("ad_slot");
                    lr(ikVar, wjvVar2, adSlot2);
                    wjvVar = wjvVar2;
                    adSlot = adSlot2;
                } else {
                    wjvVar = null;
                    adSlot = null;
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                final AdSlot adSlot3 = adSlot;
                final wjv wjvVar3 = wjvVar;
                final saneness.attabal attabalVar2 = new saneness.attabal() { // from class: com.bytedance.sdk.openadsdk.core.bgr.fi.ri.1
                    @Override // laky.saneness.attabal
                    public void lr(ik ikVar2, int i) {
                        AdSlot adSlot4;
                        saneness.attabal attabalVar3 = attabalVar;
                        if (attabalVar3 != null) {
                            attabalVar3.ri(ikVar2, i);
                        }
                        wjv wjvVar4 = wjvVar3;
                        if (wjvVar4 != null && (adSlot4 = adSlot3) != null) {
                            ri.ik(ikVar, wjvVar4, adSlot4);
                        }
                        ikVar.bu();
                    }

                    @Override // laky.saneness.attabal
                    public void ri(ik ikVar2, int i) {
                        saneness.attabal attabalVar3 = attabalVar;
                        if (attabalVar3 != null) {
                            attabalVar3.ri(ikVar2, i);
                        }
                        if (wjvVar3 == null || adSlot3 == null) {
                            return;
                        }
                        ri.lr(ikVar, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }

                    @Override // laky.saneness.attabal
                    public void ri(ik ikVar2, int i, String str) {
                        saneness.attabal attabalVar3 = attabalVar;
                        if (attabalVar3 != null) {
                            attabalVar3.ri(ikVar2, i, str);
                        }
                        if (wjvVar3 == null || adSlot3 == null) {
                            return;
                        }
                        ri.lr(ikVar, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, i, str);
                    }
                };
                if (!ri(ikVar.slm())) {
                    if (attabalVar != null) {
                        attabalVar.ri(ikVar, 404, "unexpected url: " + ikVar.slm());
                    }
                    lr(ikVar, wjvVar3, adSlot3, SystemClock.elapsedRealtime() - jElapsedRealtime, -1, "video url is invalid");
                    return;
                }
                com.bytedance.sdk.component.mj.lr.ik ikVar2 = new com.bytedance.sdk.component.mj.lr.ik("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.bgr.fi.ri.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ri.ri.attabal(nr.ri(), ikVar, attabalVar2);
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                    }
                };
                if (dzy.di()) {
                    dzy.ik((Runnable) ikVar2);
                    return;
                } else {
                    ikVar2.run();
                    return;
                }
            }
        }
        if (attabalVar != null) {
            attabalVar.ri(ikVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(ik ikVar, wjv wjvVar, AdSlot adSlot, long j, int i, String str) {
        if (ri(ikVar)) {
            com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(wjvVar, (String) null, -1, ikVar);
            qt qtVar = new qt();
            qtVar.ri(ikVar.slm());
            qtVar.ri(ikVar.di());
            qtVar.lr(j);
            qtVar.ri(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            qtVar.lr(str);
            qtVar.ik("");
            riVarRi.ri(qtVar);
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(riVarRi);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(ik ikVar, wjv wjvVar, AdSlot adSlot, long j) {
        if (ri(ikVar)) {
            com.bytedance.sdk.openadsdk.ka.fi.lr.ri riVarRi = com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(wjvVar, (String) null, -1, ikVar);
            co coVar = new co();
            coVar.ri(ikVar.slm());
            coVar.ri(ikVar.di());
            coVar.lr(j);
            if (ikVar.uq() == 1) {
                coVar.ik(1L);
            } else {
                coVar.ik(0L);
            }
            riVarRi.ri(coVar);
            ka.ri("load_video_success", riVarRi);
        }
    }

    public static boolean ri(String str) {
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
        return xha.ik(str2) != null;
    }
}
