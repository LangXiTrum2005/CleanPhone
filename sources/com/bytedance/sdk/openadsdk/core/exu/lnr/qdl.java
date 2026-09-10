package com.bytedance.sdk.openadsdk.core.exu.lnr;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.kdv;
import com.bytedance.sdk.component.utils.mzz;
import com.bytedance.sdk.component.utils.wd;
import com.bytedance.sdk.openadsdk.aaj.qdl.mml;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile qdl qdl;
    private String ud;
    private final Map<ljh, ud> lnr = new ConcurrentHashMap();
    private final Map<String, JSONObject> mml = new ConcurrentHashMap();
    private final AtomicBoolean mzz = new AtomicBoolean(false);
    private final Set<String> mo = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.wd.ud.qdl> wd = new ConcurrentHashMap<>();
    private final Map<String, String> jpc = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.exu.lnr.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0108qdl {
        void qdl(boolean z2);
    }

    public static class ud {
        long lnr;
        long mml;
        long qdl;
        long ud;

        private ud() {
        }

        public ud lnr(long j) {
            this.lnr = j;
            return this;
        }

        public ud mml(long j) {
            this.mml = j;
            return this;
        }

        public long qdl() {
            return this.ud - this.qdl;
        }

        public long ud() {
            return this.mml - this.lnr;
        }

        public ud qdl(long j) {
            this.qdl = j;
            return this;
        }

        public ud ud(long j) {
            this.ud = j;
            return this;
        }
    }

    private qdl() {
    }

    public static void lnr(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File mml(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return mzz(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    private boolean mzz(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public void ud() {
        if (this.mzz.get()) {
            return;
        }
        fco.qdl(new jpc("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strMml = qdl.this.mml();
                    if (!TextUtils.isEmpty(strMml)) {
                        File file = new File(strMml);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileQdl = qdl.qdl(file2);
                                        if (fileQdl != null && fileQdl.exists()) {
                                            qdl.this.jpc.put(file2.getName(), fileQdl.getAbsolutePath());
                                        }
                                        qdl.this.qdl(qdl.this.mml(fileQdl), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.aaj.qdl.lnr.qdl().qdl(qdl.this.jpc);
                qdl.this.mzz.set(true);
            }
        });
    }

    private String mzz() {
        if (TextUtils.isEmpty(this.ud)) {
            try {
                File file = new File(yt.qdl().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.ud = file.getAbsolutePath();
            } catch (Throwable th) {
                aaj.lnr("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.ud;
    }

    public static void ud(File file) {
        lnr(file);
        try {
            tvp.ud().rdp().qdl(file);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String mml() {
        File file = new File(mzz(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qdl;
    }

    public void ud(ljh ljhVar) {
        if (ljhVar == null || ljhVar.tdy() == null || TextUtils.isEmpty(ljhVar.tdy().exu()) || !com.bytedance.sdk.openadsdk.jyq.qdl.qdl("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.wd.ud.qdl qdlVar = this.wd.get(ljhVar.tdy().exu());
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }

    public Map<String, String> lnr() {
        return this.jpc;
    }

    public boolean qdl(ljh ljhVar) {
        if (this.mzz.get() && ljhVar != null && ljhVar.tdy() != null && ljhVar.tdy().exu() != null) {
            try {
                if (!TextUtils.isEmpty(this.jpc.get(mzz.qdl(ljhVar.tdy().exu())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject qdl(File file, boolean z2) {
        byte[] bArrMml;
        String strUd;
        try {
            if (!mzz(file) || (bArrMml = wd.mml(file)) == null || bArrMml.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strUd = com.bytedance.sdk.component.utils.qdl.lnr(new String(bArrMml));
            } else {
                strUd = com.bytedance.sdk.component.mml.qdl.ud(new String(bArrMml), com.bytedance.sdk.openadsdk.core.qdl.ud());
            }
            if (TextUtils.isEmpty(strUd)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strUd);
            if (z2 && jSONObject.length() > 0) {
                this.mml.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse qdl(String str, String str2, String str3) {
        String mimeTypeFromExtension;
        File fileQdl;
        try {
            WebResourceResponse webResourceResponseQdl = com.bytedance.sdk.openadsdk.aaj.qdl.lnr.qdl().qdl(str3);
            if (webResourceResponseQdl != null) {
                return webResourceResponseQdl;
            }
            if (this.mzz.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                try {
                    if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                        str3 = str3.split("\\?")[0];
                        if (str3.endsWith("/")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                    }
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str3));
                } catch (Throwable unused) {
                    mimeTypeFromExtension = null;
                }
                if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                    return null;
                }
                String strQdl = mzz.qdl(str);
                if (TextUtils.isEmpty(strQdl)) {
                    return null;
                }
                String str4 = this.jpc.get(strQdl);
                if (!TextUtils.isEmpty(str4)) {
                    fileQdl = new File(str4);
                } else {
                    fileQdl = qdl(new File(mml(), strQdl));
                    if (fileQdl != null && fileQdl.exists()) {
                        this.jpc.put(strQdl, fileQdl.getAbsolutePath());
                    }
                }
                if (fileQdl != null && fileQdl.exists()) {
                    String strQdl2 = qdl(str2);
                    if (TextUtils.isEmpty(strQdl2)) {
                        return null;
                    }
                    String strReplace = str3.replace(strQdl2, "");
                    if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                        File file = new File(fileQdl, strReplace);
                        if (file.exists() && qdl(strQdl, strReplace, file) && file.getCanonicalPath().startsWith(fileQdl.getCanonicalPath())) {
                            return new WebResourceResponse(mimeTypeFromExtension, "utf-8", new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            aaj.qdl("PlayableCache", "playable intercept error: ", th);
        }
        return null;
    }

    public static File qdl(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return qdl(file3);
                }
            }
        }
        return null;
    }

    private String qdl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit != null && strArrSplit.length == 2) {
            String str2 = strArrSplit[0];
            if (str2 != null && str2.endsWith("/")) {
                str = str.substring(0, strArrSplit.length - 1);
            }
            String str3 = strArrSplit[0];
            if (str3 != null && str3.endsWith("index.html")) {
                str = strArrSplit[0];
            }
        }
        return str.replace("index.html", "");
    }

    private boolean qdl(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.mml.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(mzz.qdl(file))) {
                return true;
            }
        }
        return false;
    }

    public void qdl(final ljh ljhVar, final InterfaceC0108qdl interfaceC0108qdl) {
        File file;
        if (mml.qdl().ud() && ljhVar != null && vu.mo(ljhVar) && ljhVar.ji() != null && !TextUtils.isEmpty(ljhVar.ji().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, -705, "server bidding pre render");
            qdl(interfaceC0108qdl, false);
            return;
        }
        if (ljhVar != null && ljhVar.tdy() != null && !TextUtils.isEmpty(ljhVar.tdy().exu())) {
            final String strExu = ljhVar.tdy().exu();
            if (this.mo.contains(strExu)) {
                return;
            }
            this.lnr.put(ljhVar, new ud().qdl(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar);
            String strQdl = mzz.qdl(strExu);
            final File file2 = new File(mml(), strQdl);
            String str = this.jpc.get(strQdl);
            if (TextUtils.isEmpty(str)) {
                file = qdl(file2);
                if (file != null && file.exists()) {
                    this.jpc.put(strQdl, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, -702, (String) null);
                lnr(file2);
                this.lnr.remove(ljhVar);
                qdl(interfaceC0108qdl, true);
                return;
            }
            try {
                wd.lnr(file2);
            } catch (Throwable unused) {
            }
            this.mo.add(strExu);
            File file3 = new File(mzz(), a.m(strQdl, ".zip"));
            com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
            this.wd.put(strExu, qdlVarMml);
            qdlVarMml.ud(strExu);
            qdlVarMml.qdl(file3.getParent(), file3.getName());
            qdlVarMml.qdl(7);
            qdlVarMml.qdl("playable_download");
            qdlVarMml.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.2
                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, final com.bytedance.sdk.component.wd.ud udVar) {
                    qdl.this.mo.remove(strExu);
                    qdl.this.wd.remove(strExu);
                    final ud udVar2 = (ud) qdl.this.lnr.remove(ljhVar);
                    if (udVar2 != null) {
                        udVar2.ud(System.currentTimeMillis());
                    }
                    if (udVar.mo() && udVar.mzz() != null && udVar.mzz().exists()) {
                        fco.ud(new jpc("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z2;
                                long jQdl;
                                long jUd;
                                try {
                                    ud udVar3 = udVar2;
                                    if (udVar3 != null) {
                                        udVar3.lnr(System.currentTimeMillis());
                                    }
                                    kdv.qdl(udVar.mzz().getAbsolutePath(), file2.getAbsolutePath());
                                    ud udVar4 = udVar2;
                                    if (udVar4 != null) {
                                        udVar4.mml(System.currentTimeMillis());
                                    }
                                    ud udVar5 = udVar2;
                                    if (udVar5 != null) {
                                        jQdl = udVar5.qdl();
                                        jUd = udVar2.ud();
                                    } else {
                                        jQdl = 0;
                                        jUd = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, jQdl, jUd);
                                    qdl.ud(file2);
                                    z2 = true;
                                    try {
                                        File fileQdl = qdl.qdl(file2);
                                        if (fileQdl != null && fileQdl.exists()) {
                                            qdl.this.jpc.put(file2.getName(), fileQdl.getAbsolutePath());
                                        }
                                        qdl.this.qdl(qdl.this.mml(fileQdl), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    aaj.qdl("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, -704, th.getMessage());
                                    z2 = false;
                                }
                                try {
                                    udVar.mzz().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                qdl.this.qdl(interfaceC0108qdl, z2);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, udVar.qdl() != 0 ? udVar.qdl() : -700, (String) null);
                        qdl.this.qdl(interfaceC0108qdl, false);
                    }
                }

                @Override // com.bytedance.sdk.component.wd.qdl.qdl
                public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                    qdl.this.mo.remove(strExu);
                    qdl.this.wd.remove(strExu);
                    qdl.this.lnr.remove(ljhVar);
                    com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, -700, iOException.getMessage());
                    qdl.this.qdl(interfaceC0108qdl, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.exu.lnr.ud.qdl(ljhVar, -701, (String) null);
        qdl(interfaceC0108qdl, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final InterfaceC0108qdl interfaceC0108qdl, final boolean z2) {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0108qdl interfaceC0108qdl2 = interfaceC0108qdl;
                if (interfaceC0108qdl2 != null) {
                    interfaceC0108qdl2.qdl(z2);
                }
            }
        });
    }
}
