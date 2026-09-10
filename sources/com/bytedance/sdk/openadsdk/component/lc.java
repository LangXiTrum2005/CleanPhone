package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.CSn;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.Sfi;
import com.bytedance.sdk.openadsdk.core.tD;
import com.bytedance.sdk.openadsdk.utils.CG;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ro0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static volatile lc Lxb;
    private final Map<String, AtomicInteger> JXs = new ConcurrentHashMap();
    private final com.bytedance.sdk.openadsdk.LD.LD LD;
    private final Context ZU;
    private final tD<com.bytedance.sdk.openadsdk.ZU.Lxb> lk;

    public interface LD {
        void Lxb();

        void Lxb(@Nullable com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld);
    }

    public class Lxb extends OY {
        private final com.bytedance.sdk.openadsdk.component.JXs.Lxb LD;

        public Lxb(com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb) {
            super("App Open Ad Write Cache");
            this.LD = lxb;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
                    com.bytedance.sdk.openadsdk.common.Lxb.Lxb("tt_openad_materialMeta").Lxb(this.LD.LD().hg(), this.LD.lk());
                    return;
                }
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad_materialMeta", "material" + this.LD.Lxb(), com.bytedance.sdk.component.utils.Lxb.Lxb(this.LD.LD().JD()).toString());
            } catch (Throwable unused) {
            }
        }
    }

    public interface ZU {
        void Lxb(Bitmap bitmap);
    }

    public interface lk {
        void Lxb();

        void Lxb(int i, String str);
    }

    private lc(Context context) {
        if (context != null) {
            this.ZU = context.getApplicationContext();
        } else {
            this.ZU = kqm.Lxb();
        }
        this.LD = new com.bytedance.sdk.openadsdk.LD.LD(10, 8, true);
        this.lk = kqm.lk();
        com.bytedance.sdk.openadsdk.common.Lxb.Lxb("tt_openad_materialMeta", new com.bytedance.sdk.openadsdk.common.Lxb.LD("tt_openad_materialMeta") { // from class: com.bytedance.sdk.openadsdk.component.lc.1
            @Override // com.bytedance.sdk.openadsdk.common.Lxb.LD
            public String LD(String str) {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tt_openad_materialMeta", "material".concat(String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.Lxb.LD
            public String Lxb(String str) {
                return "tt_openad_materialMeta";
            }

            @Override // com.bytedance.sdk.openadsdk.common.Lxb.LD
            public String ZU(String str) {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tt_openad_materialMeta", "ad_slot".concat(String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.Lxb.LD
            public void Lxb(AdSlot adSlot, String str, String str2) {
                String codeId = adSlot.getCodeId();
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad_materialMeta", "material".concat(String.valueOf(codeId)), str);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad_materialMeta", "ad_slot".concat(String.valueOf(codeId)), adSlot.toJsonObj().toString());
            }
        });
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.model.tD JXs(int i) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVarLc;
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.core.model.Lxb Lxb2 = com.bytedance.sdk.openadsdk.common.Lxb.Lxb("tt_openad_materialMeta").Lxb(String.valueOf(i), false);
            tDVarLc = Lxb2 != null ? Lxb2.lc() : null;
        } else {
            tDVarLc = lc(i);
        }
        long jLxb = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "material_expiration_time".concat(String.valueOf(i)), -1L);
        if (System.currentTimeMillis() / 1000 < jLxb && tDVarLc != null) {
            return tDVarLc;
        }
        if (tDVarLc != null || jLxb != -1) {
            ebl(i);
            if (tDVarLc != null) {
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(tDVarLc);
            }
        }
        return null;
    }

    public boolean ZU(int i) {
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "image_has_cached".concat(String.valueOf(i)), false);
    }

    public void ebl(int i) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad_materialMeta", "material".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "material_expiration_time".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "video_has_cached".concat(String.valueOf(i)));
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "image_has_cached".concat(String.valueOf(i)));
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.model.tD lc(int i) {
        String strLD = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("tt_openad_materialMeta", "material".concat(String.valueOf(i)), null);
        if (!TextUtils.isEmpty(strLD)) {
            try {
                JSONObject jSONObjectLxb = kqm.lk().Lxb(new JSONObject(strLD));
                return jSONObjectLxb.has("creatives") ? com.bytedance.sdk.openadsdk.core.model.Lxb.lk(jSONObjectLxb).lc() : com.bytedance.sdk.openadsdk.core.LD.Lxb(jSONObjectLxb);
            } catch (Exception e) {
                sLN.Lxb("TTAppOpenAdCacheManager", e.getMessage());
            }
        }
        return null;
    }

    public void lk(int i) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "image_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.JXs.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.JXs.put(adSlot.getCodeId(), atomicInteger);
    }

    private int lk(AdSlot adSlot) {
        StringBuilder sb = new StringBuilder("material_expiration_time");
        sb.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", sb.toString(), -1L) == -1 ? 0 : 1;
    }

    public static lc Lxb(Context context) {
        if (Lxb == null) {
            synchronized (lc.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(@NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final AdSlot adSlot, final CSn cSn, final com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        final int iTd = tDVar.Td();
        Lxb(tDVar, cSn, new LD() { // from class: com.bytedance.sdk.openadsdk.component.lc.6
            @Override // com.bytedance.sdk.openadsdk.component.lc.LD
            public void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld) {
                com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb2 = new com.bytedance.sdk.openadsdk.component.JXs.Lxb(iTd, tDVar, lxb);
                lc.this.Lxb(lxb2);
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(lxb2.LD(), 1, cSn);
                lc.this.LD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.lc.LD
            public void Lxb() {
                lc.this.LD(adSlot);
            }
        });
    }

    public boolean LD(int i) {
        return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "video_has_cached".concat(String.valueOf(i)), false);
    }

    private void LD(com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb) {
        hg.Lxb(new Lxb(lxb), 5);
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, ZU zu) {
        Lxb(tDVar, zu, 0);
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, final ZU zu, final int i) {
        String str = tDVar.JJ().f;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str).Lxb(tDVar.JJ().b).LD(tDVar.JJ().f3307a).JXs(le.ZU(kqm.Lxb())).ZU(le.lk(kqm.Lxb())).lk(2).Lxb(new com.bytedance.sdk.component.JXs.OY() { // from class: com.bytedance.sdk.openadsdk.component.lc.3
            @Override // com.bytedance.sdk.component.JXs.OY
            public Bitmap Lxb(Bitmap bitmap) {
                return i <= 0 ? bitmap : com.bytedance.sdk.component.adexpress.ZU.Lxb.Lxb(kqm.Lxb(), bitmap, i);
            }
        }).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, str, new VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.lc.2
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i2, String str2, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(JVA<Bitmap> jva) {
                ZU zu2;
                if (jva == null || jva.LD() == null || jva.lk() == null || (zu2 = zu) == null) {
                    return;
                }
                zu2.Lxb(jva.LD());
            }
        }));
    }

    public boolean LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar == null || tDVar.uxf() == null || tDVar.uxf().size() == 0 || TextUtils.isEmpty(tDVar.uxf().get(0).Lxb())) {
            return false;
        }
        IeN ieN = tDVar.uxf().get(0);
        return Lxb(ieN.Lxb(), ieN.ebl());
    }

    public String LD() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
            return DM.h(name, "/openad_image_cache/");
        }
        return DM.h(name, "//openad_image_cache/");
    }

    public void Lxb(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.JXs.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (atomicInteger.get() + lk(adSlot) > 0) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.JXs.put(adSlot.getCodeId(), atomicInteger);
        final CSn cSn = new CSn();
        cSn.Lxb(CG.LD());
        Sfi sfi = new Sfi();
        sfi.nBu = cSn;
        sfi.ZU = 2;
        sfi.OY = 2;
        this.lk.Lxb(adSlot, sfi, 3, new tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.lc.4
            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(int i, String str) {
                lc.this.LD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
            public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                if (lxb == null || lxb.ZU() == null || lxb.ZU().size() == 0) {
                    ld.Lxb(-3);
                    com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.ZU().get(0);
                if (tDVar == null || !tDVar.kVf()) {
                    if (com.bytedance.sdk.openadsdk.core.model.tD.JXs(tDVar)) {
                        lc.this.Lxb(tDVar, adSlot, cSn, lxb);
                        return;
                    } else {
                        lc.this.LD(tDVar, adSlot, cSn, lxb);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb2 = new com.bytedance.sdk.openadsdk.component.JXs.Lxb(tDVar.Td(), tDVar, lxb);
                lc.this.Lxb(lxb2);
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(lxb2.LD(), 1, cSn);
                lc.this.LD(adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(@NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final AdSlot adSlot, final CSn cSn, final com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        final int iTd = tDVar.Td();
        Lxb(tDVar, adSlot, cSn, new lk() { // from class: com.bytedance.sdk.openadsdk.component.lc.5
            @Override // com.bytedance.sdk.openadsdk.component.lc.lk
            public void Lxb() {
                com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb2 = new com.bytedance.sdk.openadsdk.component.JXs.Lxb(iTd, tDVar, lxb);
                lc.this.Lxb(lxb2);
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(lxb2.LD(), 1, cSn);
                lc.this.LD(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.lc.lk
            public void Lxb(int i, String str) {
                lc.this.LD(adSlot);
            }
        });
    }

    public void Lxb(@NonNull final com.bytedance.sdk.openadsdk.core.model.tD tDVar, AdSlot adSlot, final CSn cSn, final lk lkVar) {
        final CG cgLD = CG.LD();
        final int iTd = tDVar.Td();
        KG kgJJ = tDVar.JJ();
        String str = kgJJ.g;
        String strB = kgJJ.b();
        if (TextUtils.isEmpty(strB)) {
            strB = com.bytedance.sdk.component.utils.JXs.Lxb(str);
        }
        final File fileLxb = com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb(strB);
        if (fileLxb.exists()) {
            com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb(fileLxb);
            Lxb(iTd);
            long jZU = cgLD.ZU();
            if (cSn != null) {
                cSn.Lxb(jZU);
                cSn.Lxb(1);
            }
            lkVar.Lxb();
            Lxb(tDVar, (ZU) null);
            return;
        }
        if (kqm.ZU().id(String.valueOf(iTd)) && !com.bytedance.sdk.component.utils.IeN.ZU(kqm.Lxb())) {
            lkVar.Lxb(100, "OnlyWifi");
            return;
        }
        com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = com.bytedance.sdk.openadsdk.core.model.tD.Lxb(fileLxb.getParent(), tDVar);
        ldLxb.Lxb("material_meta", tDVar);
        ldLxb.Lxb("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb(ldLxb, new InterfaceC5182zK() { // from class: com.bytedance.sdk.openadsdk.component.lc.7
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
            public void Lxb(Uo0 uo0, int i) {
                lc.this.Lxb(iTd);
                long jZU2 = cgLD.ZU();
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.LD(tDVar, jZU2, true);
                CSn cSn2 = cSn;
                if (cSn2 != null) {
                    cSn2.Lxb(jZU2);
                    cSn.Lxb(2);
                }
                lkVar.Lxb();
                lc.Lxb(tDVar, (ZU) null);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
            public void Lxb(Uo0 uo0, int i, String str2) {
                long jZU2 = cgLD.ZU();
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.LD(tDVar, jZU2, false);
                CSn cSn2 = cSn;
                if (cSn2 != null) {
                    cSn2.Lxb(jZU2);
                }
                lkVar.Lxb(i, str2);
                try {
                    if (fileLxb.exists() && fileLxb.isFile()) {
                        com.bytedance.sdk.component.utils.lc.lk(fileLxb);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5182zK
            public void LD(Uo0 uo0, int i) {
            }
        });
        if (Build.VERSION.SDK_INT < 23) {
            Lxb(new File(Ro0.f3682a.getCacheDir(), "proxy_cache"));
            Lxb(iTd);
            long jZU2 = cgLD.ZU();
            com.bytedance.sdk.openadsdk.component.ZU.Lxb.LD(tDVar, jZU2, true);
            if (cSn != null) {
                cSn.Lxb(jZU2);
                cSn.Lxb(2);
            }
            lkVar.Lxb();
            Lxb(tDVar, (ZU) null);
        }
    }

    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, final CSn cSn, final LD ld) {
        final CG cgLD = CG.LD();
        final int iTd = tDVar.Td();
        IeN ieN = tDVar.uxf().get(0);
        String strEbl = ieN.ebl();
        String strLxb = ieN.Lxb();
        int iLD = ieN.LD();
        int iLk = ieN.lk();
        String strLxb2 = TextUtils.isEmpty(strEbl) ? com.bytedance.sdk.component.utils.JXs.Lxb(strLxb) : strEbl;
        if (TextUtils.isEmpty(strLxb2)) {
            if (ld != null) {
                ld.Lxb();
                return;
            }
            return;
        }
        File fileLD = com.bytedance.sdk.openadsdk.component.ebl.Lxb.LD(strLxb2);
        if (Lxb(strLxb, strEbl)) {
            lk(iTd);
            long jZU = cgLD.ZU();
            if (cSn != null) {
                cSn.Lxb(jZU);
                cSn.Lxb(1);
            }
            ld.Lxb(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.IeN.Lxb(new com.bytedance.sdk.openadsdk.kqm.Lxb(strLxb, ieN.ebl()), iLD, iLk, new com.bytedance.sdk.openadsdk.utils.IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.lc.8
            @Override // com.bytedance.sdk.openadsdk.utils.IeN.Lxb
            @MainThread
            public void Lxb(@NonNull com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld2) {
                if (!ld2.ZU()) {
                    com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(tDVar, cgLD.ZU(), false);
                    ld.Lxb();
                    return;
                }
                lc.this.lk(iTd);
                long jZU2 = cgLD.ZU();
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(tDVar, jZU2, true);
                CSn cSn2 = cSn;
                if (cSn2 != null) {
                    cSn2.Lxb(jZU2);
                    cSn.Lxb(2);
                }
                ld.Lxb(ld2);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.IeN.Lxb
            @MainThread
            public void Lxb() {
                com.bytedance.sdk.openadsdk.component.ZU.Lxb.Lxb(tDVar, cgLD.ZU(), false);
                ld.Lxb();
            }
        }, fileLD.getParent());
    }

    public void Lxb(int i) {
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "video_has_cached".concat(String.valueOf(i)), Boolean.TRUE);
    }

    public void Lxb(com.bytedance.sdk.openadsdk.component.JXs.Lxb lxb) {
        if (lxb.LD() == null || com.bytedance.sdk.openadsdk.core.model.tD.lc(lxb.LD())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad", "material_expiration_time" + lxb.Lxb(), Long.valueOf(lxb.LD().ro()));
        LD(lxb);
    }

    @Nullable
    public String Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (tDVar != null && tDVar.JJ() != null && !TextUtils.isEmpty(tDVar.JJ().g)) {
            String str = tDVar.JJ().g;
            String strB = tDVar.JJ().b();
            if (TextUtils.isEmpty(strB)) {
                strB = com.bytedance.sdk.component.utils.JXs.Lxb(str);
            }
            File fileLxb = com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb(strB);
            if (fileLxb.exists() && fileLxb.isFile()) {
                return fileLxb.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean Lxb(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.JXs.Lxb(str);
            }
            File fileLD = com.bytedance.sdk.openadsdk.component.ebl.Lxb.LD(str2);
            InputStream inputStreamLxb = com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str, str2);
            if (inputStreamLxb != null) {
                try {
                    inputStreamLxb.close();
                } catch (IOException e) {
                    sLN.Lxb("TTAppOpenAdCacheManager", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(str, str2, fileLD.getParent())) {
                    return true;
                }
                if (new File(fileLD.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            sLN.Lxb("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    public void Lxb(File file) {
        try {
            this.LD.Lxb(file);
        } catch (IOException e) {
            sLN.Lxb("TTAppOpenAdCacheManager", "trimFileCache fail", e);
        }
    }

    public void Lxb() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.ZU.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.lc.9
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains("openad_image_cache") || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.lc.lk(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
