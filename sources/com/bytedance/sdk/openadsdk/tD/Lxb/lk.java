package com.bytedance.sdk.openadsdk.tD.Lxb;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.id;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static volatile lk Lxb;
    private final Set<String> JXs = Collections.synchronizedSet(new HashSet());
    private String LD;
    private String ZU;
    private String lk;

    private String JXs() {
        if (TextUtils.isEmpty(this.lk)) {
            StringBuilder sb = new StringBuilder();
            sb.append(ZU());
            String strM = DM.m(sb, File.separator, "common");
            File file = new File(strM);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.lk = strM;
        }
        return this.lk;
    }

    private String ZU() {
        if (TextUtils.isEmpty(this.LD)) {
            try {
                File file = new File(kqm.Lxb().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.LD = file.getAbsolutePath();
            } catch (Throwable th) {
                sLN.Lxb("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.LD;
    }

    private String lc() {
        if (TextUtils.isEmpty(this.ZU)) {
            StringBuilder sb = new StringBuilder();
            sb.append(ZU());
            String strM = DM.m(sb, File.separator, "pregames");
            File file = new File(strM);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.ZU = strM;
        }
        return this.ZU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        hg.Lxb(new OY("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.lk.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tD.LD.Lxb lxbLD = com.bytedance.sdk.openadsdk.tD.LD.Lxb.LD(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("pag_plb_config", "model", ""));
                if (lxbLD != null) {
                    lk.this.Lxb(lxbLD, null, 0);
                }
            }
        });
    }

    public void LD() {
        if (com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() && com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_enable", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("pag_plb_config", "last_update_time", 0L);
            final String strLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res", "");
            long jLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_fetch_interval", 3600000);
            if (jLxb <= 0 || jLxb > 259200000) {
                jLxb = 3600000;
            }
            if (jCurrentTimeMillis < jLxb || TextUtils.isEmpty(strLxb)) {
                return;
            }
            int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_delay_fetch_time", 0);
            if (iLxb <= 0) {
                LD(strLxb);
            } else {
                STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.lk.3
                    @Override // java.lang.Runnable
                    public void run() {
                        lk.this.LD(strLxb);
                    }
                }, iLxb);
            }
        }
    }

    private static String lk(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    public static lk Lxb() {
        if (Lxb == null) {
            synchronized (lk.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new lk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(final String str) {
        hg.Lxb(new OY("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.lk.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.ebl.LD.LD ldLk = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().lk();
                try {
                    ldLk.LD(com.bytedance.sdk.openadsdk.OY.ZU.Lxb(ldLk, str));
                    com.bytedance.sdk.component.ebl.LD ldLxb = ldLk.Lxb();
                    if (ldLxb == null || !ldLxb.lc()) {
                        return;
                    }
                    String strZU = ldLxb.ZU();
                    com.bytedance.sdk.openadsdk.tD.LD.Lxb lxbLD = com.bytedance.sdk.openadsdk.tD.LD.Lxb.LD(strZU);
                    com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (lxbLD != null) {
                        com.bytedance.sdk.openadsdk.tD.LD.Lxb lxbLD2 = com.bytedance.sdk.openadsdk.tD.LD.Lxb.LD(com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD("pag_plb_config", "model", ""));
                        if (lxbLD2 != null && lxbLD.Lxb().equals(lxbLD2.Lxb())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb("pag_plb_config", "model", strZU);
                        lk.this.Lxb(lxbLD, lxbLD2, 1);
                    }
                } catch (Exception e) {
                    sLN.Lxb("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    public void Lxb(Map<String, String> map) {
        File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() && com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_enable", 0) == 1) {
            String strLc = lc();
            if (!TextUtils.isEmpty(strLc)) {
                File file = new File(strLc);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileLxb = com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb(file2);
                                if (fileLxb != null && fileLxb.exists()) {
                                    map.put(file2.getName(), fileLxb.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iLxb = com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_delay_fetch_time", 0);
            if (iLxb <= 0) {
                lk();
            } else {
                STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.lk.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lk.this.lk();
                    }
                }, iLxb);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Lxb(com.bytedance.sdk.openadsdk.tD.LD.Lxb lxb, @Nullable com.bytedance.sdk.openadsdk.tD.LD.Lxb lxb2, int i) {
        List<com.bytedance.sdk.openadsdk.tD.LD.Lxb.C0117Lxb> listLk = null;
        Lxb(lxb.LD(), lxb2 == null ? null : lxb2.LD(), 1, i);
        List<com.bytedance.sdk.openadsdk.tD.LD.Lxb.C0117Lxb> listLk2 = lxb.lk();
        if (lxb2 != null) {
            listLk = lxb2.lk();
        }
        Lxb(listLk2, listLk, 2, i);
    }

    private void Lxb(@Nullable List<com.bytedance.sdk.openadsdk.tD.LD.Lxb.C0117Lxb> list, @Nullable List<com.bytedance.sdk.openadsdk.tD.LD.Lxb.C0117Lxb> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strJXs = i == 1 ? JXs() : lc();
        for (com.bytedance.sdk.openadsdk.tD.LD.Lxb.C0117Lxb c0117Lxb : list) {
            String strLxb = c0117Lxb.Lxb();
            String strLxb2 = com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(strLxb);
            if (!TextUtils.isEmpty(strLxb2)) {
                if (i == 1) {
                    StringBuilder sbO = DM.o(strLxb2);
                    sbO.append(lk(strLxb));
                    strLxb2 = sbO.toString();
                }
                String str = strLxb2;
                File file = new File(strJXs, str);
                boolean zExists = file.exists();
                if (i2 == 1) {
                    if (zExists && list2 != null && list2.contains(c0117Lxb)) {
                        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.lk(file);
                    } else {
                        Lxb(strLxb, strJXs, str, i, file, zExists);
                    }
                } else if (!zExists) {
                    Lxb(strLxb, strJXs, str, i, file, zExists);
                }
            }
        }
    }

    private void Lxb(final String str, final String str2, final String str3, final int i, final File file, final boolean z) {
        String strConcat;
        if (this.JXs.contains(str)) {
            return;
        }
        if (i == 2) {
            strConcat = DM.h(str3, ".zip");
        } else {
            strConcat = z ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.JXs.add(str);
        com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
        lxbZU.LD(str);
        lxbZU.Lxb(str2, strConcat);
        final com.bytedance.sdk.component.ebl.LD ldLxb = lxbZU.Lxb();
        this.JXs.remove(str);
        if (ldLxb == null || !ldLxb.lc() || ldLxb.JXs() == null || !ldLxb.JXs().exists()) {
            File file2 = new File(AbstractC5044xl.p(DM.o(str2), File.separator, str3, ".tmp"));
            if (file2.exists()) {
                try {
                    file2.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (i == 2) {
            hg.LD(new OY("downloadZip") { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.lk.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        id.Lxb(ldLxb.JXs().getAbsolutePath(), str4);
                        File file3 = new File(str4);
                        File fileLxb = com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb(file3);
                        if (fileLxb != null && fileLxb.exists()) {
                            com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().lk().put(file3.getName(), fileLxb.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.LD(file3);
                    } catch (Throwable th) {
                        sLN.Lxb("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i), ", url=", str);
                    }
                    try {
                        ldLxb.JXs().delete();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (z) {
            file.delete();
            ldLxb.JXs().renameTo(file);
        }
    }

    public WebResourceResponse Lxb(String str) {
        if (com.bytedance.sdk.openadsdk.core.settings.sLN.Lxb() && com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("plb_res_enable", 0) == 1) {
            String strLxb = com.bytedance.sdk.component.JXs.lk.lk.lk.Lxb(str);
            if (TextUtils.isEmpty(strLxb)) {
                return null;
            }
            String strJXs = JXs();
            StringBuilder sbO = DM.o(strLxb);
            sbO.append(lk(str));
            File file = new File(strJXs, sbO.toString());
            if (file.exists()) {
                try {
                    return new WebResourceResponse(com.bytedance.sdk.component.utils.STP.Lxb(kqm.Lxb(), str), C.UTF8_NAME, new FileInputStream(file));
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
