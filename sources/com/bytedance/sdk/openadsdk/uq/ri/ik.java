package com.bytedance.sdk.openadsdk.uq.ri;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ory;
import com.bytedance.sdk.component.utils.slm;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static volatile ik ri;
    private final Set<String> fi = Collections.synchronizedSet(new HashSet());
    private String ik;
    private String ka;
    private String lr;

    private String di() {
        if (TextUtils.isEmpty(this.ka)) {
            String str = ka() + File.separator + "pregames";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.ka = str;
        }
        return this.ka;
    }

    private String fi() {
        if (TextUtils.isEmpty(this.ik)) {
            String str = ka() + File.separator + "common";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.ik = str;
        }
        return this.ik;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.uq.lr.ri riVarLr = com.bytedance.sdk.openadsdk.uq.lr.ri.lr(com.bytedance.sdk.openadsdk.tan.ka.ri.lr("pag_plb_config", L6.B, ""));
                if (riVarLr != null) {
                    ik.this.ri(riVarLr, null, 0);
                }
            }
        });
    }

    private String ka() {
        if (TextUtils.isEmpty(this.lr)) {
            try {
                File fileRi = xha.ri(nr.ri(), nr.ri().getCacheDir(), "playable");
                if (!fileRi.exists()) {
                    fileRi.mkdirs();
                }
                this.lr = fileRi.getAbsolutePath();
            } catch (Throwable th) {
                ac.ik("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.lr;
    }

    public void lr() {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.tan.ka.ri.ri("pag_plb_config", "last_update_time", 0L);
        final String strRi = fi.ri("plb_res", "");
        long jRi = fi.ri("plb_res_fetch_interval", 3600000);
        if (jRi <= 0 || jRi > 259200000) {
            jRi = 3600000;
        }
        if (jCurrentTimeMillis < jRi || TextUtils.isEmpty(strRi)) {
            return;
        }
        int iRi = fi.ri("plb_res_delay_fetch_time", 0);
        if (iRi <= 0) {
            lr(strRi);
        } else {
            vr.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.3
                @Override // java.lang.Runnable
                public void run() {
                    ik.this.lr(strRi);
                }
            }, iRi);
        }
    }

    private static String ik(String str) {
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

    public static ik ri() {
        if (ri == null) {
            synchronized (ik.class) {
                try {
                    if (ri == null) {
                        ri = new ik();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(final String str) {
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
                try {
                    lrVarIk.ik(com.bytedance.sdk.openadsdk.jbs.ka.ri(lrVarIk, str));
                    com.bytedance.sdk.component.xha.lr lrVarRi = lrVarIk.ri();
                    if (lrVarRi == null || !lrVarRi.di()) {
                        return;
                    }
                    String strKa = lrVarRi.ka();
                    com.bytedance.sdk.openadsdk.uq.lr.ri riVarLr = com.bytedance.sdk.openadsdk.uq.lr.ri.lr(strKa);
                    com.bytedance.sdk.openadsdk.tan.ka.ri.ri("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (riVarLr != null) {
                        com.bytedance.sdk.openadsdk.uq.lr.ri riVarLr2 = com.bytedance.sdk.openadsdk.uq.lr.ri.lr(com.bytedance.sdk.openadsdk.tan.ka.ri.lr("pag_plb_config", L6.B, ""));
                        if (riVarLr2 != null && riVarLr.ri().equals(riVarLr2.ri())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("pag_plb_config", L6.B, strKa);
                        ik.this.ri(riVarLr, riVarLr2, 1);
                    }
                } catch (Exception e) {
                    ac.ik("PlayableResManager", e.getMessage());
                }
            }
        });
    }

    public void ri(Map<String, String> map) {
        File[] fileArrListFiles;
        if (com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            String strDi = di();
            if (!TextUtils.isEmpty(strDi)) {
                File file = new File(strDi);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileRi = com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri(file2);
                                if (fileRi != null && fileRi.exists()) {
                                    map.put(file2.getName(), fileRi.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iRi = fi.ri("plb_res_delay_fetch_time", 0);
            if (iRi <= 0) {
                ik();
            } else {
                vr.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ik.this.ik();
                    }
                }, iRi);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ri(com.bytedance.sdk.openadsdk.uq.lr.ri riVar, com.bytedance.sdk.openadsdk.uq.lr.ri riVar2, int i) {
        List<com.bytedance.sdk.openadsdk.uq.lr.ri.C0277ri> listIk = null;
        ri(riVar.lr(), riVar2 == null ? null : riVar2.lr(), 1, i);
        List<com.bytedance.sdk.openadsdk.uq.lr.ri.C0277ri> listIk2 = riVar.ik();
        if (riVar2 != null) {
            listIk = riVar2.ik();
        }
        ri(listIk2, listIk, 2, i);
    }

    private void ri(List<com.bytedance.sdk.openadsdk.uq.lr.ri.C0277ri> list, List<com.bytedance.sdk.openadsdk.uq.lr.ri.C0277ri> list2, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strFi = i == 1 ? fi() : di();
        for (com.bytedance.sdk.openadsdk.uq.lr.ri.C0277ri c0277ri : list) {
            String strRi = c0277ri.ri();
            String strRi2 = slm.ri(strRi);
            if (!TextUtils.isEmpty(strRi2)) {
                if (i == 1) {
                    strRi2 = strRi2 + ik(strRi);
                }
                String str = strRi2;
                File file = new File(strFi, str);
                boolean zExists = file.exists();
                if (i2 == 1) {
                    if (zExists && list2 != null && list2.contains(c0277ri)) {
                        com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ik(file);
                    } else {
                        int i3 = i;
                        ri(strRi, strFi, str, i3, file, zExists);
                        i = i3;
                    }
                } else if (!zExists) {
                    int i4 = i;
                    ri(strRi, strFi, str, i4, file, zExists);
                    i = i4;
                }
            }
        }
    }

    private void ri(final String str, final String str2, final String str3, final int i, final File file, final boolean z) {
        String strConcat;
        if (this.fi.contains(str)) {
            return;
        }
        if (i == 2) {
            strConcat = str3 + ".zip";
        } else {
            strConcat = z ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.fi.add(str);
        com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
        riVarKa.ik(str);
        riVarKa.ri(str2, strConcat);
        final com.bytedance.sdk.component.xha.lr lrVarRi = riVarKa.ri();
        this.fi.remove(str);
        if (lrVarRi != null && lrVarRi.di() && lrVarRi.fi() != null && lrVarRi.fi().exists()) {
            if (i == 2) {
                dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("downloadZip") { // from class: com.bytedance.sdk.openadsdk.uq.ri.ik.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (z) {
                                file.delete();
                            }
                            String str4 = str2 + File.separator + str3;
                            ory.ri(lrVarRi.fi().getAbsolutePath(), str4);
                            File file2 = new File(str4);
                            File fileRi = com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri(file2);
                            if (fileRi != null && fileRi.exists()) {
                                com.bytedance.sdk.openadsdk.core.bgr.ik.ri.ri().ik().put(file2.getName(), fileRi.getAbsolutePath());
                            }
                            com.bytedance.sdk.openadsdk.core.bgr.ik.ri.lr(file2);
                        } catch (Throwable th) {
                            ac.ik("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i), ", url=", str);
                        }
                        try {
                            lrVarRi.fi().delete();
                        } catch (Throwable unused) {
                        }
                    }
                });
                return;
            } else {
                if (z) {
                    file.delete();
                    lrVarRi.fi().renameTo(file);
                    return;
                }
                return;
            }
        }
        File file2 = new File(str2 + File.separator + str3 + ".tmp");
        if (file2.exists()) {
            try {
                file2.delete();
            } catch (Throwable unused) {
            }
        }
    }

    public WebResourceResponse ri(String str) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.ri()) {
            return null;
        }
        String strRi = slm.ri(str);
        if (TextUtils.isEmpty(strRi)) {
            return null;
        }
        File file = new File(fi(), strRi + ik(str));
        if (file.exists()) {
            try {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                return new WebResourceResponse(mimeTypeFromExtension, C.UTF8_NAME, new FileInputStream(file));
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
