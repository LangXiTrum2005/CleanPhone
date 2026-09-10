package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class mml {
    private static volatile mml qdl;
    private final com.bytedance.sdk.openadsdk.common.qdl.C0105qdl lnr;
    private final Context ud;

    private mml(Context context) {
        this.ud = context == null ? yt.qdl() : context.getApplicationContext();
        this.lnr = new com.bytedance.sdk.openadsdk.common.qdl.C0105qdl("sp_full_screen_video");
    }

    public void qdl(String str, ljh ljhVar) {
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new").qdl(str, ljhVar);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLnr = this.lnr.lnr(str);
        String strCev = ljhVar != null ? ljhVar.cev() : "";
        if (TextUtils.isEmpty(strLnr) || TextUtils.isEmpty(strCev) || strLnr.equals(strCev)) {
            this.lnr.jpc(str);
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.qdl ud(String str, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarUd;
        long jMml = this.lnr.mml(str);
        boolean zMzz = this.lnr.mzz(str);
        boolean zWd = this.lnr.wd(str);
        int iUd = mzz.ud();
        if (System.currentTimeMillis() - jMml < 10500000 && !zMzz && (!z2 || iUd != 2 || !zWd)) {
            try {
                String strUd = this.lnr.ud(str);
                if (!TextUtils.isEmpty(strUd)) {
                    JSONObject jSONObject = new JSONObject(strUd);
                    if (jSONObject.has("cypher")) {
                        jSONObject = yt.lnr().qdl(jSONObject);
                    }
                    if (jSONObject.has("creatives")) {
                        qdlVarUd = com.bytedance.sdk.openadsdk.core.model.qdl.ud(jSONObject);
                    } else {
                        ljh ljhVarQdl = com.bytedance.sdk.openadsdk.core.ud.qdl(jSONObject);
                        com.bytedance.sdk.openadsdk.core.model.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.model.qdl();
                        qdlVar.qdl(ljhVarQdl);
                        qdlVarUd = qdlVar;
                    }
                    if (qdlVarUd != null && qdlVarUd.mzz()) {
                        Iterator<ljh> it = qdlVarUd.mml().iterator();
                        while (it.hasNext()) {
                            if (!qdl(it.next())) {
                                it.remove();
                            }
                        }
                        if (qdlVarUd.mzz() && qdlVarUd.mo() != null && qdlVarUd.mo().ji() != null) {
                            return qdlVarUd;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void qdl() {
        File[] fileArrListFiles;
        String str;
        File[] fileArrListFiles2;
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new").qdl();
            return;
        }
        try {
            boolean zWd = com.bytedance.sdk.openadsdk.core.tvp.wd("sp_full_screen_video");
            if (zWd) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.ud.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.mml.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains("sp_full_screen_video");
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles2) {
                    if (zWd) {
                        try {
                            com.bytedance.sdk.component.utils.wd.lnr(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.ud.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File cacheDir = this.ud.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.reward.mml.2
                @Override // java.io.FileFilter
                public boolean accept(File file3) {
                    if (file3 != null) {
                        return file3.getName().contains("full_screen_video_cache");
                    }
                    return false;
                }
            })) == null) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.wd.lnr(file3);
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        ljh ljhVarMo;
        if (qdlVar == null || qdlVar.mo() == null || !qdlVar.mo().ilu()) {
            if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
                com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new").qdl(adSlot, qdlVar);
                return;
            }
            if (qdlVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (ljhVarMo = qdlVar.mo()) == null || ljhVarMo.ly() == 2) {
                return;
            }
            try {
                this.lnr.qdl(adSlot, qdlVar.exu().toString(), qdlVar.ud());
            } catch (Throwable unused) {
            }
        }
    }

    public static mml qdl(Context context) {
        if (qdl == null) {
            synchronized (mml.class) {
                try {
                    if (qdl == null) {
                        qdl = new mml(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public String qdl(String str, boolean z2) {
        com.bytedance.sdk.openadsdk.common.qdl qdlVarQdl = com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new");
        String strQdl = qdlVarQdl.qdl(str, 10500000L);
        if (z2 && !TextUtils.isEmpty(strQdl) && mzz.ud() == 2 && qdlVarQdl.mml(str)) {
            return null;
        }
        return strQdl;
    }

    public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        return com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new").qdl(qdlVar, true);
    }

    private boolean qdl(ljh ljhVar) {
        if (ljhVar != null) {
            return vu.lnr(ljhVar) || ljhVar.tdy() != null;
        }
        return false;
    }

    public void qdl(String str) {
        if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
            com.bytedance.sdk.openadsdk.common.qdl.qdl("sp_full_screen_video_new").lnr(str);
        } else {
            this.lnr.mo(str);
        }
    }
}
