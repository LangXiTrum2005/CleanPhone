package com.bytedance.sdk.openadsdk.core.bgr.ik;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ory;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.uq.ri.ka;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.fi;
import com.ironsource.A5;
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

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static volatile ri ri;
    private String lr;
    private final Map<wjv, lr> ik = new ConcurrentHashMap();
    private final Map<String, JSONObject> ka = new ConcurrentHashMap();
    private final AtomicBoolean fi = new AtomicBoolean(false);
    private final Set<String> di = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.xha.lr.ri> xha = new ConcurrentHashMap<>();
    private final Map<String, String> mj = new ConcurrentHashMap();

    public static class lr {
        long ik;
        long ka;
        long lr;
        long ri;

        private lr() {
        }

        public lr ik(long j) {
            this.ik = j;
            return this;
        }

        public lr ka(long j) {
            this.ka = j;
            return this;
        }

        public long lr() {
            return this.ka - this.ik;
        }

        public long ri() {
            return this.lr - this.ri;
        }

        public lr lr(long j) {
            this.lr = j;
            return this;
        }

        public lr ri(long j) {
            this.ri = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ik.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0232ri {
        void ri(boolean z);
    }

    private ri() {
    }

    private boolean fi(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    public static void ik(File file) {
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
    public File ka(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return fi(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public void lr() {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().fi() || this.fi.get()) {
            return;
        }
        dzy.ri(new com.bytedance.sdk.component.mj.lr.ik("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strKa = ri.this.ka();
                    if (!TextUtils.isEmpty(strKa)) {
                        File file = new File(strKa);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileRi = ri.ri(file2);
                                        if (fileRi != null && fileRi.exists()) {
                                            ri.this.mj.put(file2.getName(), fileRi.getAbsolutePath());
                                        }
                                        ri.this.ri(ri.this.ka(fileRi), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.uq.ri.ik.ri().ri(ri.this.mj);
                ri.this.fi.set(true);
            }
        });
    }

    private String fi() {
        if (TextUtils.isEmpty(this.lr)) {
            try {
                File fileRi = xha.ri(nr.ri(), nr.ri().getCacheDir(), "playable");
                if (!fileRi.exists()) {
                    fileRi.mkdirs();
                }
                this.lr = fileRi.getAbsolutePath();
            } catch (Throwable th) {
                ac.ik("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.lr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ka() {
        File file = new File(fi(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static void lr(File file) {
        ik(file);
        try {
            qt.lr().aw().ri(file);
        } catch (Throwable unused) {
        }
    }

    public static ri ri() {
        if (ri == null) {
            synchronized (ri.class) {
                try {
                    if (ri == null) {
                        ri = new ri();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public Map<String, String> ik() {
        return this.mj;
    }

    public void lr(wjv wjvVar) {
        if (wjvVar == null || wjvVar.eu() == null || TextUtils.isEmpty(wjvVar.eu().saneness()) || !fi.ri("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.xha.lr.ri riVar = this.xha.get(wjvVar.eu().saneness());
        if (riVar != null) {
            riVar.lr();
        }
    }

    public boolean ri(wjv wjvVar) {
        if (this.fi.get() && wjvVar != null && wjvVar.eu() != null && wjvVar.eu().saneness() != null) {
            try {
                if (!TextUtils.isEmpty(this.mj.get(com.bytedance.sdk.component.utils.fi.ri(wjvVar.eu().saneness())))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ri(File file, boolean z) {
        byte[] bArrKa;
        String strLr;
        try {
            if (!fi(file) || (bArrKa = xha.ka(file)) == null || bArrKa.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strLr = com.bytedance.sdk.component.utils.ri.ik(new String(bArrKa));
            } else {
                strLr = com.bytedance.sdk.component.ka.ri.lr(new String(bArrKa), com.bytedance.sdk.openadsdk.core.ri.lr());
            }
            if (TextUtils.isEmpty(strLr)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strLr);
            if (z && jSONObject.length() > 0) {
                this.ka.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse ri(String str, String str2, String str3) {
        String mimeTypeFromExtension;
        File fileRi;
        try {
            WebResourceResponse webResourceResponseRi = com.bytedance.sdk.openadsdk.uq.ri.ik.ri().ri(str3);
            if (webResourceResponseRi != null) {
                return webResourceResponseRi;
            }
            if (this.fi.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
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
                String strRi = com.bytedance.sdk.component.utils.fi.ri(str);
                if (TextUtils.isEmpty(strRi)) {
                    return null;
                }
                String str4 = this.mj.get(strRi);
                if (!TextUtils.isEmpty(str4)) {
                    fileRi = new File(str4);
                } else {
                    fileRi = ri(new File(ka(), strRi));
                    if (fileRi != null && fileRi.exists()) {
                        this.mj.put(strRi, fileRi.getAbsolutePath());
                    }
                }
                if (fileRi != null && fileRi.exists()) {
                    String strRi2 = ri(str2);
                    if (TextUtils.isEmpty(strRi2)) {
                        return null;
                    }
                    String strReplace = str3.replace(strRi2, "");
                    if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                        File file = new File(fileRi, strReplace);
                        if (file.exists() && ri(strRi, strReplace, file) && file.getCanonicalPath().startsWith(fileRi.getCanonicalPath())) {
                            return new WebResourceResponse(mimeTypeFromExtension, A5.O, new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            ac.ri("PlayableCache", "playable intercept error: ", th);
        }
        return null;
    }

    public static File ri(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && "index.html".equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return ri(file3);
                }
            }
        }
        return null;
    }

    private String ri(String str) {
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

    private boolean ri(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.ka.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(com.bytedance.sdk.component.utils.fi.ri(file))) {
                return true;
            }
        }
        return false;
    }

    public void ri(final wjv wjvVar, final InterfaceC0232ri interfaceC0232ri) {
        File file;
        if (ka.ri().lr() && wjvVar != null && dw.di(wjvVar) && wjvVar.eb() != null && !TextUtils.isEmpty(wjvVar.eb().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, -705, "server bidding pre render");
            ri(interfaceC0232ri, false);
            return;
        }
        if (wjvVar != null && wjvVar.eu() != null && !TextUtils.isEmpty(wjvVar.eu().saneness())) {
            final String strSaneness = wjvVar.eu().saneness();
            if (this.di.contains(strSaneness)) {
                return;
            }
            this.ik.put(wjvVar, new lr().ri(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar);
            String strRi = com.bytedance.sdk.component.utils.fi.ri(strSaneness);
            final File file2 = new File(ka(), strRi);
            String str = this.mj.get(strRi);
            if (TextUtils.isEmpty(str)) {
                file = ri(file2);
                if (file != null && file.exists()) {
                    this.mj.put(strRi, file.getAbsolutePath());
                }
            } else {
                file = new File(str);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, -702, (String) null);
                ik(file2);
                this.ik.remove(wjvVar);
                ri(interfaceC0232ri, true);
                return;
            }
            try {
                xha.ik(file2);
            } catch (Throwable unused) {
            }
            this.di.add(strSaneness);
            File file3 = new File(fi(), strRi + ".zip");
            com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
            this.xha.put(strSaneness, riVarKa);
            riVarKa.ik(strSaneness);
            riVarKa.ri(file3.getParent(), file3.getName());
            riVarKa.ri(7);
            riVarKa.lr("playable_download");
            riVarKa.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.2
                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, final com.bytedance.sdk.component.xha.lr lrVar) {
                    ri.this.di.remove(strSaneness);
                    ri.this.xha.remove(strSaneness);
                    final lr lrVar2 = (lr) ri.this.ik.remove(wjvVar);
                    if (lrVar2 != null) {
                        lrVar2.lr(System.currentTimeMillis());
                    }
                    if (lrVar.di() && lrVar.fi() != null && lrVar.fi().exists()) {
                        dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z;
                                long jRi;
                                long jLr;
                                try {
                                    lr lrVar3 = lrVar2;
                                    if (lrVar3 != null) {
                                        lrVar3.ik(System.currentTimeMillis());
                                    }
                                    ory.ri(lrVar.fi().getAbsolutePath(), file2.getAbsolutePath());
                                    lr lrVar4 = lrVar2;
                                    if (lrVar4 != null) {
                                        lrVar4.ka(System.currentTimeMillis());
                                    }
                                    lr lrVar5 = lrVar2;
                                    if (lrVar5 != null) {
                                        jRi = lrVar5.ri();
                                        jLr = lrVar2.lr();
                                    } else {
                                        jRi = 0;
                                        jLr = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, jRi, jLr);
                                    ri.lr(file2);
                                    z = true;
                                    try {
                                        File fileRi = ri.ri(file2);
                                        if (fileRi != null && fileRi.exists()) {
                                            ri.this.mj.put(file2.getName(), fileRi.getAbsolutePath());
                                        }
                                        ri.this.ri(ri.this.ka(fileRi), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    ac.ri("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, -704, th.getMessage());
                                    z = false;
                                }
                                try {
                                    lrVar.fi().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                ri.this.ri(interfaceC0232ri, z);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, lrVar.ri() != 0 ? lrVar.ri() : -700, (String) null);
                        ri.this.ri(interfaceC0232ri, false);
                    }
                }

                @Override // com.bytedance.sdk.component.xha.ri.ri
                public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                    ri.this.di.remove(strSaneness);
                    ri.this.xha.remove(strSaneness);
                    ri.this.ik.remove(wjvVar);
                    com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, -700, iOException.getMessage());
                    ri.this.ri(interfaceC0232ri, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ik.lr.ri(wjvVar, -701, (String) null);
        ri(interfaceC0232ri, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final InterfaceC0232ri interfaceC0232ri, final boolean z) {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ik.ri.3
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC0232ri interfaceC0232ri2 = interfaceC0232ri;
                if (interfaceC0232ri2 != null) {
                    interfaceC0232ri2.ri(z);
                }
            }
        });
    }
}
