package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private final String JXs;
    private final LD ZU;
    private final Map<tD, Long> lc = Collections.synchronizedMap(new HashMap());

    @SuppressLint({"StaticFieldLeak"})
    private final Context lk;
    private static final HashMap<String, Lxb> Lxb = new HashMap<>();
    private static final HashMap<String, LD> LD = new HashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0085Lxb<T> {
        void Lxb(boolean z, T t);
    }

    private Lxb(Context context, String str) {
        this.lk = context;
        LD ld = LD.get(str);
        this.ZU = ld == null ? new LD(str) : ld;
        this.JXs = str;
    }

    private String lk() {
        return ((OK) CacheDirFactory.getICacheDir(0)).b();
    }

    public void LD() {
        File[] fileArrListFiles;
        try {
            int i = Build.VERSION.SDK_INT;
            boolean zEbl = com.bytedance.sdk.openadsdk.core.QAg.ebl(this.JXs);
            String str = zEbl ? "files" : "shared_prefs";
            File file = i >= 24 ? new File(this.lk.getDataDir(), str) : new File(this.lk.getDatabasePath("1").getParentFile().getParentFile(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.Lxb.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(Lxb.this.JXs);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zEbl) {
                        try {
                            com.bytedance.sdk.component.utils.lc.lk(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.lk.deleteSharedPreferences(strReplace);
                        } else {
                            this.lk.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.lc.lk(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(lk());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.lc.lk(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public boolean lk(String str) {
        return this.ZU.OY(str);
    }

    public static boolean Lxb() {
        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("material_cache_disk_format", 0) == 1;
    }

    public static Lxb Lxb(String str) {
        Lxb lxb;
        HashMap<String, Lxb> map = Lxb;
        Lxb lxb2 = map.get(str);
        if (lxb2 != null) {
            return lxb2;
        }
        synchronized (Lxb.class) {
            try {
                lxb = map.get(str);
                if (lxb == null) {
                    lxb = new Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), str);
                    map.put(str, lxb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lxb;
    }

    public static class LD {
        protected final String Lxb;
        private final HashSet<String> OY = new HashSet<>();
        String LD = "material_data";
        String lk = "has_played";
        String ZU = "create_time";
        String JXs = "in_use_process";
        String lc = "req_id";
        String ebl = "ad_slot";

        public LD(String str) {
            this.Lxb = TextUtils.isEmpty(str) ? "" : str;
        }

        public long JXs(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(Lxb(str), this.ZU, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String LD(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD(Lxb(str), this.LD, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public String Lxb(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return AbstractC5044xl.p(new StringBuilder(), this.Lxb, "_cache_", str);
        }

        public boolean OY(String str) {
            try {
                String strLxb = Lxb(str);
                String strLD = com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD(strLxb, this.JXs, "");
                if (TextUtils.isEmpty(strLD)) {
                    return false;
                }
                if (strLD.equals(com.bytedance.sdk.component.utils.kqm.LD(com.bytedance.sdk.openadsdk.core.kqm.Lxb())) && !this.OY.contains(str)) {
                    com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.JXs, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public void QAg(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(Lxb(str));
                this.OY.remove(str);
            } catch (Throwable unused) {
            }
        }

        public String ZU(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD(Lxb(str), this.ebl, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void ebl(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(Lxb(str), this.JXs, com.bytedance.sdk.component.utils.kqm.LD(com.bytedance.sdk.openadsdk.core.kqm.Lxb()));
                this.OY.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean lc(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(Lxb(str), this.lk, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public String lk(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.ZU.ZU.LD(Lxb(str), this.lc, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void Lxb(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strLxb = Lxb(codeId);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.lk, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.ZU, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.LD, str);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.JXs, "");
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.lc, str2);
                com.bytedance.sdk.openadsdk.multipro.ZU.ZU.Lxb(strLxb, this.ebl, adSlot.toJsonObj().toString());
                this.OY.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static void Lxb(String str, LD ld) {
        LD.put(str, ld);
    }

    public void Lxb(String str, tD tDVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLk = this.ZU.lk(str);
        String strXNP = tDVar != null ? tDVar.xNP() : "";
        if (TextUtils.isEmpty(strLk) || TextUtils.isEmpty(strXNP) || strLk.equals(strXNP)) {
            this.ZU.QAg(str);
        }
    }

    public void Lxb(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        tD tDVarLc;
        if (lxb == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (tDVarLc = lxb.lc()) == null || tDVarLc.mu() == 2) {
            return;
        }
        try {
            this.ZU.Lxb(adSlot, lxb.STP(), lxb.LD());
        } catch (Throwable unused) {
        }
    }

    private boolean LD(tD tDVar) {
        if (tDVar != null) {
            if (eK.brP(tDVar)) {
                return true;
            }
            KG kgJJ = tDVar.JJ();
            if (kgJJ != null) {
                return Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(Lxb(kgJJ.g, kgJJ.b(), tDVar.tv()));
            }
        }
        return false;
    }

    public String Lxb(tD tDVar) {
        if (tDVar == null || tDVar.JJ() == null || TextUtils.isEmpty(tDVar.JJ().g)) {
            return null;
        }
        return Lxb(tDVar.JJ().g, tDVar.JJ().b(), tDVar.tv());
    }

    public void LD(String str) {
        this.ZU.ebl(str);
    }

    public String Lxb(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.component.utils.JXs.Lxb(str);
        }
        File fileLxb = Lxb(str2, i);
        if (fileLxb == null || !fileLxb.exists() || !fileLxb.isFile() || fileLxb.length() <= 0) {
            return null;
        }
        return fileLxb.getAbsolutePath();
    }

    public com.bytedance.sdk.openadsdk.core.model.Lxb Lxb(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxbLk;
        AdSlot adSlotLD;
        tD tDVarLc;
        try {
            String strLD = this.ZU.LD(str);
            if (!TextUtils.isEmpty(strLD)) {
                JSONObject jSONObject = new JSONObject(strLD);
                if (jSONObject.has("cypher")) {
                    jSONObject = com.bytedance.sdk.openadsdk.core.kqm.lk().Lxb(jSONObject);
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
                    if (z) {
                        Iterator<tD> it = lxbLk.ZU().iterator();
                        while (it.hasNext()) {
                            if (!LD(it.next())) {
                                it.remove();
                            }
                        }
                    }
                    if (lxbLk.JXs()) {
                        String strZU = this.ZU.ZU(str);
                        if (!TextUtils.isEmpty(strZU) && (adSlotLD = com.bytedance.sdk.openadsdk.core.LD.LD(new JSONObject(strZU))) != null && (tDVarLc = lxbLk.lc()) != null) {
                            tDVarLc.Lxb(adSlotLD);
                        }
                        return lxbLk;
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.model.Lxb Lxb(String str, long j) {
        long jJXs = this.ZU.JXs(str);
        boolean zLc = this.ZU.lc(str);
        if (System.currentTimeMillis() - jJXs >= j || zLc) {
            return null;
        }
        return Lxb(str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final boolean z, final tD tDVar, final long j, String str) {
        Long lRemove = this.lc.remove(tDVar);
        final long jElapsedRealtime = lRemove == null ? 0L : SystemClock.elapsedRealtime() - lRemove.longValue();
        final String str2 = z ? "load_video_success" : "load_video_error";
        final String str3 = (z || str == null) ? null : str;
        com.bytedance.sdk.openadsdk.STP.lk.Lxb(str2, false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.common.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            @Nullable
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb(str2).LD(nJ.Lxb(z, tDVar, jElapsedRealtime, j, str3).toString());
            }
        });
    }

    public void Lxb(final tD tDVar, final InterfaceC0085Lxb<Object> interfaceC0085Lxb) {
        this.lc.put(tDVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (tDVar.JJ() != null && !TextUtils.isEmpty(tDVar.JJ().g)) {
            String str = tDVar.JJ().g;
            File fileLxb = Lxb(tDVar.JJ().b(), tDVar.tv());
            com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
            lxbZU.LD(str);
            lxbZU.Lxb(fileLxb.getParent(), fileLxb.getName());
            lxbZU.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.common.Lxb.3
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    if (ld.lc() && ld.JXs() != null && ld.JXs().exists()) {
                        InterfaceC0085Lxb interfaceC0085Lxb2 = interfaceC0085Lxb;
                        if (interfaceC0085Lxb2 != null) {
                            interfaceC0085Lxb2.Lxb(true, null);
                        }
                        Lxb.this.Lxb(true, tDVar, ld.Lxb(), ld.LD());
                        return;
                    }
                    InterfaceC0085Lxb interfaceC0085Lxb3 = interfaceC0085Lxb;
                    if (interfaceC0085Lxb3 != null) {
                        interfaceC0085Lxb3.Lxb(false, null);
                    }
                    Lxb.this.Lxb(false, tDVar, ld.Lxb(), ld.LD());
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    InterfaceC0085Lxb interfaceC0085Lxb2 = interfaceC0085Lxb;
                    if (interfaceC0085Lxb2 != null) {
                        interfaceC0085Lxb2.Lxb(false, null);
                    }
                    Lxb.this.Lxb(false, tDVar, -2L, iOException.getMessage());
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
}
