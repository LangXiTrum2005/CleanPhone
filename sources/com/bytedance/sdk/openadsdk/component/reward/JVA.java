package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile JVA Lxb;
    private final Context LD;
    private final Map<tD, Long> ZU = Collections.synchronizedMap(new HashMap());
    private final com.bytedance.sdk.openadsdk.common.Lxb.LD lk;

    private JVA(Context context) {
        this.LD = context == null ? kqm.Lxb() : context.getApplicationContext();
        this.lk = new com.bytedance.sdk.openadsdk.common.Lxb.LD("sp_reward_video");
    }

    private boolean LD(tD tDVar) {
        if (tDVar != null) {
            if (eK.lk(tDVar)) {
                return true;
            }
            KG kgJJ = tDVar.JJ();
            if (kgJJ != null) {
                return Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(Lxb(kgJJ.g, kgJJ.b(), tDVar.tv()));
            }
        }
        return false;
    }

    public void Lxb(String str, tD tDVar) {
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").Lxb(str, tDVar);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLk = this.lk.lk(str);
        String strXNP = tDVar != null ? tDVar.xNP() : "";
        if (TextUtils.isEmpty(strLk) || TextUtils.isEmpty(strXNP) || strLk.equals(strXNP)) {
            this.lk.QAg(str);
        }
    }

    public void Lxb() {
        File[] fileArrListFiles;
        String str;
        File file;
        File[] fileArrListFiles2;
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").LD();
            return;
        }
        try {
            int i = Build.VERSION.SDK_INT;
            boolean zEbl = com.bytedance.sdk.openadsdk.core.QAg.ebl("sp_reward_video");
            if (zEbl) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i >= 24) {
                file = new File(this.LD.getDataDir(), str);
            } else {
                file = new File(this.LD.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.JVA.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_reward_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles2) {
                    if (zEbl) {
                        try {
                            com.bytedance.sdk.component.utils.lc.lk(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.LD.deleteSharedPreferences(strReplace);
                        } else {
                            this.LD.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.lc.lk(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.LD.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.JVA.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("reward_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.lc.lk(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        tD tDVarLc;
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").Lxb(adSlot, lxb);
            return;
        }
        if (lxb == null || lxb.nBu() || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (tDVarLc = lxb.lc()) == null || tDVarLc.mu() == 2) {
            return;
        }
        String strLD = lxb.LD();
        synchronized (lxb) {
            try {
                if (!lxb.nBu()) {
                    try {
                        this.lk.Lxb(adSlot, lxb.NXR().toString(), strLD);
                    } catch (Throwable unused) {
                        lxb.JVA();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static JVA Lxb(Context context) {
        if (Lxb == null) {
            synchronized (JVA.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new JVA(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public String Lxb(tD tDVar) {
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            return com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").Lxb(tDVar);
        }
        if (tDVar == null || tDVar.JJ() == null || TextUtils.isEmpty(tDVar.JJ().g)) {
            return null;
        }
        return Lxb(tDVar.JJ().g, tDVar.JJ().b(), tDVar.tv());
    }

    public String Lxb(String str, String str2, int i) {
        File fileLxb;
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            return com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").Lxb(str, str2, i);
        }
        if (!TextUtils.isEmpty(str) && (fileLxb = Lxb(str2, i)) != null && fileLxb.exists() && fileLxb.isFile() && fileLxb.length() > 0) {
            return fileLxb.getAbsolutePath();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.Lxb Lxb(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxbLk;
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb Lxb2 = com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video");
            com.bytedance.sdk.openadsdk.core.model.Lxb Lxb3 = Lxb2.Lxb(str, 10500000L);
            if (z && Lxb3 != null && JXs.LD() == 2 && Lxb2.lk(str)) {
                return null;
            }
            return Lxb3;
        }
        long jJXs = this.lk.JXs(str);
        boolean zLc = this.lk.lc(str);
        boolean zOY = this.lk.OY(str);
        int iLD = JXs.LD();
        if (System.currentTimeMillis() - jJXs < 10500000 && !zLc && (!z || iLD != 2 || !zOY)) {
            try {
                String strLD = this.lk.LD(str);
                if (!TextUtils.isEmpty(strLD)) {
                    JSONObject jSONObject = new JSONObject(strLD);
                    if (jSONObject.has("cypher")) {
                        jSONObject = kqm.lk().Lxb(jSONObject);
                    }
                    if (jSONObject.has("creatives")) {
                        lxbLk = com.bytedance.sdk.openadsdk.core.model.Lxb.lk(jSONObject);
                    } else {
                        tD tDVarLxb = com.bytedance.sdk.openadsdk.core.LD.Lxb(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.Lxb lxb = new com.bytedance.sdk.openadsdk.core.model.Lxb();
                        lxb.Lxb(tDVarLxb);
                        lxbLk = lxb;
                    }
                    if (lxbLk != null && lxbLk.JXs()) {
                        Iterator<tD> it = lxbLk.ZU().iterator();
                        while (it.hasNext()) {
                            if (!LD(it.next())) {
                                it.remove();
                            }
                        }
                        if (lxbLk.JXs()) {
                            return lxbLk;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final boolean z, final tD tDVar, final long j, String str) {
        Long lRemove = this.ZU.remove(tDVar);
        final long jElapsedRealtime = lRemove == null ? 0L : SystemClock.elapsedRealtime() - lRemove.longValue();
        final String str2 = z ? "load_video_success" : "load_video_error";
        final String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.STP.lk.Lxb(str2, false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.JVA.3
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb(str2).LD(nJ.Lxb(z, tDVar, jElapsedRealtime, j, str3).toString());
            }
        });
    }

    public void Lxb(final tD tDVar, final com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb<Object> interfaceC0085Lxb) {
        if (!com.bytedance.sdk.openadsdk.core.NXR.JXs.Lxb.Lxb()) {
            interfaceC0085Lxb.Lxb(true, null);
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").Lxb(tDVar, interfaceC0085Lxb);
            return;
        }
        this.ZU.put(tDVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (tDVar != null && tDVar.JJ() != null && !TextUtils.isEmpty(tDVar.JJ().g)) {
            String str = tDVar.JJ().g;
            File fileLxb = Lxb(tDVar.JJ().b(), tDVar.tv());
            com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
            lxbZU.LD(str);
            lxbZU.Lxb(fileLxb.getParent(), fileLxb.getName());
            lxbZU.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.JVA.4
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    if (ld.lc() && ld.JXs() != null && ld.JXs().exists()) {
                        com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb interfaceC0085Lxb2 = interfaceC0085Lxb;
                        if (interfaceC0085Lxb2 != null) {
                            interfaceC0085Lxb2.Lxb(true, null);
                        }
                        JVA.this.Lxb(true, tDVar, ld.Lxb(), ld.LD());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb interfaceC0085Lxb3 = interfaceC0085Lxb;
                    if (interfaceC0085Lxb3 != null) {
                        interfaceC0085Lxb3.Lxb(false, null);
                    }
                    JVA.this.Lxb(false, tDVar, ld.Lxb(), ld.LD());
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    com.bytedance.sdk.openadsdk.common.Lxb.InterfaceC0085Lxb interfaceC0085Lxb2 = interfaceC0085Lxb;
                    if (interfaceC0085Lxb2 != null) {
                        interfaceC0085Lxb2.Lxb(false, null);
                    }
                    JVA.this.Lxb(false, tDVar, -2L, iOException.getMessage());
                }
            });
            return;
        }
        if (interfaceC0085Lxb != null) {
            interfaceC0085Lxb.Lxb(false, null);
        }
        Lxb(false, tDVar, -1L, null);
    }

    private File Lxb(String str, int i) {
        return new File(((OK) CacheDirFactory.getICacheDir(i)).b(), str);
    }

    public void Lxb(String str) {
        if (com.bytedance.sdk.openadsdk.common.Lxb.Lxb()) {
            com.bytedance.sdk.openadsdk.common.Lxb.Lxb("sp_reward_video").LD(str);
        } else {
            this.lk.ebl(str);
        }
    }
}
