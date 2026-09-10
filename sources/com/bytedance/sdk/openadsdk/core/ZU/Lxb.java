package com.bytedance.sdk.openadsdk.core.ZU;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.JXs;
import com.bytedance.sdk.component.utils.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.STP.Lxb.ZU;
import com.bytedance.sdk.openadsdk.core.NXR.lk.lk;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.multipro.LD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private final List<String> Lxb = new CopyOnWriteArrayList();
    private final lk LD = new lk(5, 5, true);
    private final ConcurrentHashMap<String, Long> lk = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ZU.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0102Lxb {
        private static final Lxb Lxb = new Lxb();
    }

    private boolean lk(String str) {
        return !this.Lxb.contains(str);
    }

    public File LD(String str) {
        String strLxb = JXs.Lxb(str);
        if (strLxb == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        return lc.Lxb(kqm.Lxb(), LD.lk(), LD.lk() ? DM.h(name, "/music/") : DM.h(name, "//music/"), strLxb);
    }

    public void lk() {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("music_preload_start", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.ZU.Lxb.2
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                ZU zuLxb = ZU.LD().Lxb("music_preload_start");
                zuLxb.Lxb();
                return zuLxb;
            }
        });
    }

    public static Lxb Lxb() {
        return C0102Lxb.Lxb;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb) {
        List<tD> listZU = lxb.ZU();
        if (listZU == null || listZU.size() == 0) {
            return;
        }
        for (int i = 0; i < listZU.size(); i++) {
            tD tDVar = listZU.get(i);
            if (tDVar != null) {
                Lxb(tDVar);
            }
        }
    }

    public InputStream Lxb(String str) {
        File fileLD = LD(str);
        if (fileLD != null && Lxb(fileLD)) {
            try {
                return new FileInputStream(fileLD);
            } catch (Exception e) {
                sLN.Lxb("MusicCacheManager", e.getMessage());
            }
        }
        return null;
    }

    private void Lxb(tD tDVar) {
        tD.Lxb lxbRW;
        String strJVA;
        if (tDVar == null || (lxbRW = tDVar.rW()) == null || (strJVA = lxbRW.JVA()) == null || !strJVA.contains("music_url")) {
            return;
        }
        lk();
        String strZU = lxbRW.ZU();
        if (TextUtils.isEmpty(strZU)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e) {
                sLN.Lxb("MusicCacheManager", e.getMessage());
            }
            Lxb(0, -1L, EnumC4719u30.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File fileLD = LD(strZU);
        if (fileLD == null) {
            return;
        }
        fileLD.getPath();
        if (Lxb(fileLD)) {
            Lxb(2, -1L, -1, null);
        } else {
            Lxb(tDVar, strZU, fileLD);
        }
    }

    public void LD() {
        File fileLxb = Lxb(kqm.Lxb(), LD.lk());
        fileLxb.getAbsolutePath();
        try {
            this.LD.Lxb(fileLxb);
        } catch (IOException e) {
            sLN.Lxb("MusicCacheManager", "trimFileCache fail", e);
        }
    }

    private boolean Lxb(File file) {
        return file.exists() && file.length() != 0;
    }

    private void Lxb(tD tDVar, String str, File file) {
        if (lk(str)) {
            this.lk.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
            lxbZU.LD(str);
            lxbZU.Lxb(file.getParent(), file.getName());
            lxbZU.lk(str);
            this.Lxb.add(str);
            lxbZU.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.ZU.Lxb.1
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, com.bytedance.sdk.component.ebl.LD ld) {
                    ld.lk();
                    ld.Lxb();
                    String strLk = lkVar.lk();
                    Long l = (Long) Lxb.this.lk.get(strLk);
                    if (ld.lc() && ld.JXs() != null && ld.JXs().exists()) {
                        ld.JXs();
                        if (l != null) {
                            Lxb.this.lk.remove(strLk);
                            Lxb.this.Lxb(1, SystemClock.elapsedRealtime() - l.longValue(), -1, null);
                        }
                        try {
                            lc.LD(ld.JXs());
                        } catch (IOException e) {
                            sLN.Lxb("MusicCacheManager", e.getMessage());
                        }
                    }
                    if (ld.lc() || l == null) {
                        return;
                    }
                    Lxb.this.Lxb(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    Long l = (Long) Lxb.this.lk.get(lkVar.lk());
                    if (l != null) {
                        Lxb.this.Lxb(0, SystemClock.elapsedRealtime() - l.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private File Lxb(Context context, boolean z) {
        String strH;
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (LD.lk()) {
            strH = DM.h(name, "/music");
        } else {
            strH = DM.h(name, "//music");
        }
        return lc.Lxb(context, z, strH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final int i, final long j, final int i2, final String str) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("music_preload_finish", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.ZU.Lxb.3
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i);
                long j2 = j;
                if (j2 != -1) {
                    jSONObject.put("load_duration", j2);
                }
                ZU zuLD = ZU.LD().Lxb("music_preload_finish").LD(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    zuLD.LD(i2);
                    zuLD.lc(str);
                }
                zuLD.Lxb();
                return zuLD;
            }
        });
    }

    public void Lxb(final boolean z) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("music_cache", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.core.ZU.Lxb.4
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                ZU zuLD = ZU.LD().Lxb("music_cache").LD(jSONObject.toString());
                zuLD.Lxb();
                return zuLD;
            }
        });
    }
}
