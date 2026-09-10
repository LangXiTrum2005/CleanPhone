package com.bytedance.sdk.openadsdk.aaj.qdl;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jtx;
import com.bytedance.sdk.component.utils.kdv;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.settings.wd;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.om.n;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private static volatile lnr qdl;
    private String lnr;
    private String mml;
    private final Set<String> mzz = Collections.synchronizedSet(new HashSet());
    private String ud;

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        fco.qdl(new jpc("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.lnr.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.aaj.ud.qdl qdlVarUd = com.bytedance.sdk.openadsdk.aaj.ud.qdl.ud(com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("pag_plb_config", "model", ""));
                if (qdlVarUd != null) {
                    lnr.this.qdl(qdlVarUd, null, 0);
                }
            }
        });
    }

    private String mml() {
        if (TextUtils.isEmpty(this.ud)) {
            try {
                File file = new File(yt.qdl().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.ud = file.getAbsolutePath();
            } catch (Throwable th) {
                aaj.lnr("PlayableResManager", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.ud;
    }

    private String mo() {
        if (TextUtils.isEmpty(this.mml)) {
            StringBuilder sb = new StringBuilder();
            sb.append(mml());
            String strR = a.r(sb, File.separator, "pregames");
            File file = new File(strR);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mml = strR;
        }
        return this.mml;
    }

    private String mzz() {
        if (TextUtils.isEmpty(this.lnr)) {
            StringBuilder sb = new StringBuilder();
            sb.append(mml());
            String strR = a.r(sb, File.separator, "common");
            File file = new File(strR);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.lnr = strR;
        }
        return this.lnr;
    }

    public void ud() {
        if (wd.qdl() && com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_enable", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("pag_plb_config", "last_update_time", 0L);
            final String strQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res", "");
            long jQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_fetch_interval", 3600000);
            if (jQdl <= 0 || jQdl > 259200000) {
                jQdl = n.m;
            }
            if (jCurrentTimeMillis < jQdl || TextUtils.isEmpty(strQdl)) {
                return;
            }
            int iQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_delay_fetch_time", 0);
            if (iQdl <= 0) {
                ud(strQdl);
            } else {
                rdp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.lnr.3
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr.this.ud(strQdl);
                    }
                }, iQdl);
            }
        }
    }

    private static String lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(mo.ono);
        if (iLastIndexOf == -1) {
            return "";
        }
        return mo.ono + str.substring(iLastIndexOf + 1);
    }

    public static lnr qdl() {
        if (qdl == null) {
            synchronized (lnr.class) {
                try {
                    if (qdl == null) {
                        qdl = new lnr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(final String str) {
        fco.qdl(new jpc("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.lnr.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
                try {
                    udVarLnr.ud(com.bytedance.sdk.openadsdk.jpc.mml.qdl(udVarLnr, str));
                    com.bytedance.sdk.component.wd.ud udVarQdl = udVarLnr.qdl();
                    if (udVarQdl == null || !udVarQdl.mo()) {
                        return;
                    }
                    String strMml = udVarQdl.mml();
                    com.bytedance.sdk.openadsdk.aaj.ud.qdl qdlVarUd = com.bytedance.sdk.openadsdk.aaj.ud.qdl.ud(strMml);
                    com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (qdlVarUd != null) {
                        com.bytedance.sdk.openadsdk.aaj.ud.qdl qdlVarUd2 = com.bytedance.sdk.openadsdk.aaj.ud.qdl.ud(com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("pag_plb_config", "model", ""));
                        if (qdlVarUd2 != null && qdlVarUd.qdl().equals(qdlVarUd2.qdl())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("pag_plb_config", "model", strMml);
                        lnr.this.qdl(qdlVarUd, qdlVarUd2, 1);
                    }
                } catch (Exception e2) {
                    aaj.lnr("PlayableResManager", e2.getMessage());
                }
            }
        });
    }

    public void qdl(Map<String, String> map) {
        File[] fileArrListFiles;
        if (wd.qdl() && com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_enable", 0) == 1) {
            String strMo = mo();
            if (!TextUtils.isEmpty(strMo)) {
                File file = new File(strMo);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileQdl = com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl(file2);
                                if (fileQdl != null && fileQdl.exists()) {
                                    map.put(file2.getName(), fileQdl.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_delay_fetch_time", 0);
            if (iQdl <= 0) {
                lnr();
            } else {
                rdp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.lnr.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr.this.lnr();
                    }
                }, iQdl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void qdl(com.bytedance.sdk.openadsdk.aaj.ud.qdl qdlVar, com.bytedance.sdk.openadsdk.aaj.ud.qdl qdlVar2, int i2) {
        List<com.bytedance.sdk.openadsdk.aaj.ud.qdl.C0100qdl> listLnr = null;
        qdl(qdlVar.ud(), qdlVar2 == null ? null : qdlVar2.ud(), 1, i2);
        List<com.bytedance.sdk.openadsdk.aaj.ud.qdl.C0100qdl> listLnr2 = qdlVar.lnr();
        if (qdlVar2 != null) {
            listLnr = qdlVar2.lnr();
        }
        qdl(listLnr2, listLnr, 2, i2);
    }

    private void qdl(List<com.bytedance.sdk.openadsdk.aaj.ud.qdl.C0100qdl> list, List<com.bytedance.sdk.openadsdk.aaj.ud.qdl.C0100qdl> list2, int i2, int i3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strMzz = i2 == 1 ? mzz() : mo();
        for (com.bytedance.sdk.openadsdk.aaj.ud.qdl.C0100qdl c0100qdl : list) {
            String strQdl = c0100qdl.qdl();
            String strQdl2 = jtx.qdl(strQdl);
            if (!TextUtils.isEmpty(strQdl2)) {
                if (i2 == 1) {
                    StringBuilder sbW = a.w(strQdl2);
                    sbW.append(lnr(strQdl));
                    strQdl2 = sbW.toString();
                }
                String str = strQdl2;
                File file = new File(strMzz, str);
                boolean zExists = file.exists();
                if (i3 == 1) {
                    if (zExists && list2 != null && list2.contains(c0100qdl)) {
                        com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.lnr(file);
                    } else {
                        int i4 = i2;
                        qdl(strQdl, strMzz, str, i4, file, zExists);
                        i2 = i4;
                    }
                } else if (!zExists) {
                    int i5 = i2;
                    qdl(strQdl, strMzz, str, i5, file, zExists);
                    i2 = i5;
                }
            }
        }
    }

    private void qdl(final String str, final String str2, final String str3, final int i2, final File file, final boolean z2) {
        String strConcat;
        if (this.mzz.contains(str)) {
            return;
        }
        if (i2 == 2) {
            strConcat = a.m(str3, ".zip");
        } else {
            strConcat = z2 ? "tmp".concat(String.valueOf(str3)) : str3;
        }
        this.mzz.add(str);
        com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
        qdlVarMml.ud(str);
        qdlVarMml.qdl(str2, strConcat);
        final com.bytedance.sdk.component.wd.ud udVarQdl = qdlVarMml.qdl();
        this.mzz.remove(str);
        if (udVarQdl == null || !udVarQdl.mo() || udVarQdl.mzz() == null || !udVarQdl.mzz().exists()) {
            File file2 = new File(a.s(a.w(str2), File.separator, str3, ".tmp"));
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
        if (i2 == 2) {
            fco.ud(new jpc("downloadZip") { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.lnr.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z2) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        kdv.qdl(udVarQdl.mzz().getAbsolutePath(), str4);
                        File file3 = new File(str4);
                        File fileQdl = com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl(file3);
                        if (fileQdl != null && fileQdl.exists()) {
                            com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().lnr().put(file3.getName(), fileQdl.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.ud(file3);
                    } catch (Throwable th) {
                        aaj.lnr("PlayableResManager", "unzip error: ", th, "tp=", Integer.valueOf(i2), ", url=", str);
                    }
                    try {
                        udVarQdl.mzz().delete();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (z2) {
            file.delete();
            udVarQdl.mzz().renameTo(file);
        }
    }

    public WebResourceResponse qdl(String str) {
        if (wd.qdl() && com.bytedance.sdk.openadsdk.jyq.qdl.qdl("plb_res_enable", 0) == 1) {
            String strQdl = jtx.qdl(str);
            if (TextUtils.isEmpty(strQdl)) {
                return null;
            }
            String strMzz = mzz();
            StringBuilder sbW = a.w(strQdl);
            sbW.append(lnr(str));
            File file = new File(strMzz, sbW.toString());
            if (file.exists()) {
                try {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                    if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                        return null;
                    }
                    return new WebResourceResponse(mimeTypeFromExtension, "UTF-8", new FileInputStream(file));
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
