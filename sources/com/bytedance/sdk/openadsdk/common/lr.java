package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private final Map<wjv, Long> di = Collections.synchronizedMap(new HashMap());
    private final String fi;
    private final Context ik;
    private final ri ka;
    private static final HashMap<String, lr> ri = new HashMap<>();
    private static final HashMap<String, ri> lr = new HashMap<>();

    private lr(Context context, String str) {
        this.ik = context;
        ri riVar = lr.get(str);
        this.ka = riVar == null ? new ri(str) : riVar;
        this.fi = str;
    }

    public void ik(String str) {
        this.ka.di(str);
    }

    public boolean ka(String str) {
        return this.ka.xha(str);
    }

    public String lr(String str) {
        try {
            String strLr = this.ka.lr(str);
            if (TextUtils.isEmpty(strLr)) {
                return null;
            }
            return strLr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static class ri {
        protected final String ri;
        private final HashSet<String> xha = new HashSet<>();
        String lr = "material_data";
        String ik = "has_played";
        String ka = "create_time";
        String fi = "in_use_process";
        String di = "req_id";

        public ri(String str) {
            this.ri = TextUtils.isEmpty(str) ? "" : str;
        }

        public void di(String str) {
            try {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(ri(str), this.fi, com.bytedance.sdk.component.utils.ihz.lr(com.bytedance.sdk.openadsdk.core.nr.ri()));
                this.xha.add(str);
            } catch (Throwable unused) {
            }
        }

        public boolean fi(String str) {
            try {
                return com.bytedance.sdk.openadsdk.tan.ka.ri.ri(ri(str), this.ik, true);
            } catch (Throwable unused) {
                return true;
            }
        }

        public String ik(String str) {
            try {
                return com.bytedance.sdk.openadsdk.tan.ka.ri.lr(ri(str), this.di, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public long ka(String str) {
            try {
                return com.bytedance.sdk.openadsdk.tan.ka.ri.ri(ri(str), this.ka, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public String lr(String str) {
            try {
                return com.bytedance.sdk.openadsdk.tan.ka.ri.lr(ri(str), this.lr, (String) null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public void mj(String str) {
            try {
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(ri(str));
                this.xha.remove(str);
            } catch (Throwable unused) {
            }
        }

        public String ri(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.ri + "_cache_" + str;
        }

        public boolean xha(String str) {
            try {
                String strRi = ri(str);
                String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr(strRi, this.fi, "");
                if (TextUtils.isEmpty(strLr)) {
                    return false;
                }
                if (strLr.equals(com.bytedance.sdk.component.utils.ihz.lr(com.bytedance.sdk.openadsdk.core.nr.ri())) && !this.xha.contains(str)) {
                    com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.fi, "");
                    return false;
                }
            } catch (Throwable unused) {
            }
            return true;
        }

        public void ri(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strRi = ri(codeId);
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.ik, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.ka, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.lr, str);
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.fi, "");
                com.bytedance.sdk.openadsdk.tan.ka.ri.ri(strRi, this.di, str2);
                this.xha.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static lr ri(String str) {
        lr lrVar;
        HashMap<String, lr> map = ri;
        lr lrVar2 = map.get(str);
        if (lrVar2 != null) {
            return lrVar2;
        }
        synchronized (lr.class) {
            try {
                lrVar = map.get(str);
                if (lrVar == null) {
                    lrVar = new lr(com.bytedance.sdk.openadsdk.core.nr.ri(), str);
                    map.put(str, lrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lrVar;
    }

    private String lr() {
        return CacheDirFactory.getICacheDir(0).ri();
    }

    public static void ri(String str, ri riVar) {
        lr.put(str, riVar);
    }

    public void ri(String str, wjv wjvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strIk = this.ka.ik(str);
        String strJf = wjvVar != null ? wjvVar.jf() : "";
        if (TextUtils.isEmpty(strIk) || TextUtils.isEmpty(strJf) || strIk.equals(strJf)) {
            this.ka.mj(str);
        }
    }

    public void ri() {
        String str;
        File[] fileArrListFiles;
        try {
            boolean zXha = com.bytedance.sdk.openadsdk.core.qt.xha(this.fi);
            if (zXha) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            File file = new File(this.ik.getDataDir(), str);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.lr.1
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(lr.this.fi);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zXha) {
                        try {
                            com.bytedance.sdk.component.utils.xha.ik(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        this.ik.deleteSharedPreferences(file2.getName().replace(".xml", ""));
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(lr());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.xha.ik(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public void ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        wjv wjvVarDi;
        if ((riVar != null && riVar.di() != null && riVar.di().bl()) || riVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (wjvVarDi = riVar.di()) == null || wjvVarDi.zm() == 2) {
            return;
        }
        try {
            this.ka.ri(adSlot, riVar.sf(), riVar.lr());
        } catch (Throwable unused) {
        }
    }

    public boolean ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, boolean z) {
        if (riVar == null || !riVar.fi()) {
            return false;
        }
        if (z) {
            Iterator<wjv> it = riVar.ka().iterator();
            while (it.hasNext()) {
                if (!ri(it.next())) {
                    it.remove();
                }
            }
        }
        return riVar.fi();
    }

    public String ri(String str, long j) {
        long jKa = this.ka.ka(str);
        boolean zFi = this.ka.fi(str);
        if (System.currentTimeMillis() - jKa >= j || zFi) {
            return null;
        }
        return lr(str);
    }

    private boolean ri(wjv wjvVar) {
        if (wjvVar != null) {
            return dw.ik(wjvVar) || wjvVar.eu() != null;
        }
        return false;
    }
}
