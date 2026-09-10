package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.a;
import com.bytedance.sdk.component.utils.jyq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static final HashMap<String, qdl> qdl = new HashMap<>();
    private static final HashMap<String, C0105qdl> ud = new HashMap<>();
    private final Context lnr;
    private final C0105qdl mml;
    private final Map<ljh, Long> mo = a.r();
    private final String mzz;

    private qdl(Context context, String str) {
        this.lnr = context;
        C0105qdl c0105qdl = ud.get(str);
        this.mml = c0105qdl == null ? new C0105qdl(str) : c0105qdl;
        this.mzz = str;
    }

    public void lnr(String str) {
        this.mml.mo(str);
    }

    public boolean mml(String str) {
        return this.mml.wd(str);
    }

    public String ud(String str) {
        try {
            String strUd = this.mml.ud(str);
            if (TextUtils.isEmpty(strUd)) {
                return null;
            }
            return strUd;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static qdl qdl(String str) {
        qdl qdlVar;
        HashMap<String, qdl> map = qdl;
        qdl qdlVar2 = map.get(str);
        if (qdlVar2 != null) {
            return qdlVar2;
        }
        synchronized (qdl.class) {
            try {
                qdlVar = map.get(str);
                if (qdlVar == null) {
                    qdlVar = new qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str);
                    map.put(str, qdlVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qdlVar;
    }

    private String ud() {
        return CacheDirFactory.getICacheDir(0).qdl();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.qdl$qdl, reason: collision with other inner class name */
    public static class C0105qdl {
        protected final String qdl;
        private final HashSet<String> wd = new HashSet<>();
        String ud = "material_data";
        String lnr = "has_played";
        String mml = "create_time";
        String mzz = "in_use_process";
        String mo = "req_id";

        public C0105qdl(String str) {
            this.qdl = TextUtils.isEmpty(str) ? "" : str;
        }

        public void jpc(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str));
                this.wd.remove(str);
            } catch (Throwable unused) {
            }
        }

        public String lnr(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(qdl(str), this.mo, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public long mml(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.mml, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public void mo(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.mzz, jyq.ud(com.bytedance.sdk.openadsdk.core.yt.qdl()));
                this.wd.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean mzz(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(qdl(str), this.lnr, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public String qdl(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return android.support.v4.media.a.s(new StringBuilder(), this.qdl, "_cache_", str);
        }

        public String ud(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(qdl(str), this.ud, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public boolean wd(String str) {
            try {
                String strQdl = qdl(str);
                String strUd = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud(strQdl, this.mzz, "");
                if (TextUtils.isEmpty(strUd)) {
                    return false;
                }
                if (strUd.equals(jyq.ud(com.bytedance.sdk.openadsdk.core.yt.qdl())) && !this.wd.contains(str)) {
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mzz, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public void qdl(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strQdl = qdl(codeId);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.lnr, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mml, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.ud, str);
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mzz, "");
                com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl(strQdl, this.mo, str2);
                this.wd.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static void qdl(String str, C0105qdl c0105qdl) {
        ud.put(str, c0105qdl);
    }

    public void qdl(String str, ljh ljhVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLnr = this.mml.lnr(str);
        String strCev = ljhVar != null ? ljhVar.cev() : "";
        if (TextUtils.isEmpty(strLnr) || TextUtils.isEmpty(strCev) || strLnr.equals(strCev)) {
            this.mml.jpc(str);
        }
    }

    public void qdl() {
        String str;
        File[] fileArrListFiles;
        try {
            boolean zWd = com.bytedance.sdk.openadsdk.core.tvp.wd(this.mzz);
            if (zWd) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.lnr.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.qdl.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(qdl.this.mzz);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zWd) {
                        try {
                            com.bytedance.sdk.component.utils.wd.lnr(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.lnr.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(ud());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.wd.lnr(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void qdl(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        ljh ljhVarMo;
        if ((qdlVar != null && qdlVar.mo() != null && qdlVar.mo().ilu()) || qdlVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (ljhVarMo = qdlVar.mo()) == null || ljhVarMo.ly() == 2) {
            return;
        }
        try {
            this.mml.qdl(adSlot, qdlVar.rdp(), qdlVar.ud());
        } catch (Throwable unused) {
        }
    }

    public boolean qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, boolean z2) {
        if (qdlVar == null || !qdlVar.mzz()) {
            return false;
        }
        if (z2) {
            Iterator<ljh> it = qdlVar.mml().iterator();
            while (it.hasNext()) {
                if (!qdl(it.next())) {
                    it.remove();
                }
            }
        }
        return qdlVar.mzz();
    }

    public String qdl(String str, long j) {
        long jMml = this.mml.mml(str);
        boolean zMzz = this.mml.mzz(str);
        if (System.currentTimeMillis() - jMml >= j || zMzz) {
            return null;
        }
        return ud(str);
    }

    private boolean qdl(ljh ljhVar) {
        if (ljhVar != null) {
            return vu.lnr(ljhVar) || ljhVar.tdy() != null;
        }
        return false;
    }
}
