package com.bytedance.sdk.openadsdk.core.NXR.lk;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.JXs;
import com.bytedance.sdk.component.utils.STP;
import com.bytedance.sdk.component.utils.id;
import com.bytedance.sdk.component.utils.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.tD.Lxb.ZU;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
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
public class Lxb {
    private static volatile Lxb Lxb;
    private String LD;
    private final Map<tD, LD> lk = new ConcurrentHashMap();
    private final Map<String, JSONObject> ZU = new ConcurrentHashMap();
    private final AtomicBoolean JXs = new AtomicBoolean(false);
    private final Set<String> lc = Collections.synchronizedSet(new HashSet());
    private final ConcurrentHashMap<String, com.bytedance.sdk.component.ebl.LD.Lxb> ebl = new ConcurrentHashMap<>();
    private final Map<String, String> OY = new ConcurrentHashMap();

    public static class LD {
        long LD;
        long Lxb;
        long ZU;
        long lk;

        private LD() {
        }

        public long LD() {
            return this.ZU - this.lk;
        }

        public long Lxb() {
            return this.LD - this.Lxb;
        }

        public LD ZU(long j) {
            this.ZU = j;
            return this;
        }

        public LD lk(long j) {
            this.lk = j;
            return this;
        }

        public LD LD(long j) {
            this.LD = j;
            return this;
        }

        public LD Lxb(long j) {
            this.Lxb = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0098Lxb {
    }

    private Lxb() {
    }

    private boolean JXs(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File ZU(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        return JXs(file2) ? file2 : new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    public static void lk(File file) {
        try {
            if (!file.exists() || file.setLastModified(System.currentTimeMillis())) {
                return;
            }
            file.renameTo(file);
            file.lastModified();
        } catch (Throwable unused) {
        }
    }

    public void LD() {
        if (this.JXs.get()) {
            return;
        }
        hg.Lxb(new OY("PlayableCache_init") { // from class: com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles;
                try {
                    String strZU = Lxb.this.ZU();
                    if (!TextUtils.isEmpty(strZU)) {
                        File file = new File(strZU);
                        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                            for (File file2 : fileArrListFiles) {
                                if (file2 != null) {
                                    try {
                                        File fileLxb = Lxb.Lxb(file2);
                                        if (fileLxb != null && fileLxb.exists()) {
                                            Lxb.this.OY.put(file2.getName(), fileLxb.getAbsolutePath());
                                        }
                                        Lxb.this.Lxb(Lxb.this.ZU(fileLxb), true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
                com.bytedance.sdk.openadsdk.tD.Lxb.lk.Lxb().Lxb(Lxb.this.OY);
                Lxb.this.JXs.set(true);
            }
        });
    }

    private String JXs() {
        if (TextUtils.isEmpty(this.LD)) {
            try {
                File file = new File(kqm.Lxb().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.LD = file.getAbsolutePath();
            } catch (Throwable th) {
                sLN.Lxb("PlayableCache", "init root path error: ".concat(String.valueOf(th)));
            }
        }
        return this.LD;
    }

    public static void LD(File file) {
        lk(file);
        try {
            QAg.LD().STP().Lxb(file);
        } catch (Throwable unused) {
        }
    }

    public static Lxb Lxb() {
        if (Lxb == null) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ZU() {
        File file = new File(JXs(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public void LD(tD tDVar) {
        if (tDVar == null || tDVar.JJ() == null || TextUtils.isEmpty(tDVar.JJ().i) || !com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("can_cancel_playable", false)) {
            return;
        }
        com.bytedance.sdk.component.ebl.LD.Lxb lxb = this.ebl.get(tDVar.JJ().i);
        if (lxb != null) {
            lxb.LD();
        }
    }

    public Map<String, String> lk() {
        return this.OY;
    }

    public boolean Lxb(tD tDVar) {
        if (this.JXs.get() && tDVar != null && tDVar.JJ() != null && tDVar.JJ().i != null) {
            try {
                if (!TextUtils.isEmpty(this.OY.get(JXs.Lxb(tDVar.JJ().i)))) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject Lxb(File file, boolean z) {
        byte[] bArrZU;
        String strLD;
        try {
            if (!JXs(file) || (bArrZU = lc.ZU(file)) == null || bArrZU.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                strLD = com.bytedance.sdk.component.utils.Lxb.lk(new String(bArrZU));
            } else {
                strLD = com.bytedance.sdk.component.ZU.Lxb.LD(new String(bArrZU), com.bytedance.sdk.openadsdk.core.Lxb.LD());
            }
            if (TextUtils.isEmpty(strLD)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strLD);
            if (z && jSONObject.length() > 0) {
                this.ZU.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public WebResourceResponse Lxb(String str, String str2, String str3) {
        File fileLxb;
        try {
            WebResourceResponse webResourceResponseLxb = com.bytedance.sdk.openadsdk.tD.Lxb.lk.Lxb().Lxb(str3);
            if (webResourceResponseLxb != null) {
                return webResourceResponseLxb;
            }
            if (this.JXs.get() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                try {
                    if ((str3.startsWith("http://") || str3.startsWith("https://")) && str3.contains("?")) {
                        str3 = str3.split("\\?")[0];
                        if (str3.endsWith("/")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                    }
                } catch (Throwable unused) {
                }
                String strLxb = STP.Lxb(kqm.Lxb(), str3);
                com.bytedance.sdk.openadsdk.STP.lk.lk(strLxb, str3);
                if (TextUtils.isEmpty(strLxb)) {
                    return null;
                }
                String strLxb2 = JXs.Lxb(str);
                if (TextUtils.isEmpty(strLxb2)) {
                    return null;
                }
                String str4 = this.OY.get(strLxb2);
                if (!TextUtils.isEmpty(str4)) {
                    fileLxb = new File(str4);
                } else {
                    fileLxb = Lxb(new File(ZU(), strLxb2));
                    if (fileLxb != null && fileLxb.exists()) {
                        this.OY.put(strLxb2, fileLxb.getAbsolutePath());
                    }
                }
                if (fileLxb != null && fileLxb.exists()) {
                    String strLxb3 = Lxb(str2);
                    if (TextUtils.isEmpty(strLxb3)) {
                        return null;
                    }
                    String strReplace = str3.replace(strLxb3, "");
                    if (!TextUtils.isEmpty(strReplace) && !strReplace.startsWith("https://") && !strReplace.startsWith("http://")) {
                        File file = new File(fileLxb, strReplace);
                        if (file.exists() && Lxb(strLxb2, strReplace, file) && file.getCanonicalPath().startsWith(fileLxb.getCanonicalPath())) {
                            return new WebResourceResponse(strLxb, "utf-8", new FileInputStream(file));
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            sLN.Lxb("PlayableCache", "playable intercept error: ", th);
        }
        return null;
    }

    public static File Lxb(File file) {
        File[] fileArrListFiles;
        if (file != null && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile() && C2390Ej.AD_INDEX_FILE_NAME.equals(file2.getName())) {
                    return file;
                }
            }
            for (File file3 : fileArrListFiles) {
                if (file3 != null && file3.isDirectory()) {
                    return Lxb(file3);
                }
            }
        }
        return null;
    }

    private String Lxb(String str) {
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
            if (str3 != null && str3.endsWith(C2390Ej.AD_INDEX_FILE_NAME)) {
                str = strArrSplit[0];
            }
        }
        return str.replace(C2390Ej.AD_INDEX_FILE_NAME, "");
    }

    private boolean Lxb(String str, String str2, File file) {
        if (file != null && file.exists()) {
            JSONObject jSONObject = this.ZU.get(str);
            if (jSONObject == null) {
                return true;
            }
            String strOptString = jSONObject.optString(str2);
            if (strOptString != null && strOptString.equalsIgnoreCase(JXs.Lxb(file))) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign4.2]BadDomainNameVerifier"})
    public void Lxb(final tD tDVar, final InterfaceC0098Lxb interfaceC0098Lxb) {
        File file;
        if (ZU.Lxb().LD() && tDVar != null && eK.lc(tDVar) && tDVar.hg() != null && !TextUtils.isEmpty(tDVar.hg().getBidAdm())) {
            com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, -705, "server bidding pre render");
            Lxb(interfaceC0098Lxb, false);
            return;
        }
        if (tDVar != null && tDVar.JJ() != null && !TextUtils.isEmpty(tDVar.JJ().i)) {
            final String str = tDVar.JJ().i;
            if (this.lc.contains(str)) {
                return;
            }
            this.lk.put(tDVar, new LD().Lxb(System.currentTimeMillis()));
            com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar);
            String strLxb = JXs.Lxb(str);
            final File file2 = new File(ZU(), strLxb);
            String str2 = this.OY.get(strLxb);
            if (TextUtils.isEmpty(str2)) {
                file = Lxb(file2);
                if (file != null && file.exists()) {
                    this.OY.put(strLxb, file.getAbsolutePath());
                }
            } else {
                file = new File(str2);
            }
            if (file != null && file.exists()) {
                com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, -702, (String) null);
                lk(file2);
                this.lk.remove(tDVar);
                Lxb(interfaceC0098Lxb, true);
                return;
            }
            try {
                lc.lk(file2);
            } catch (Throwable unused) {
            }
            this.lc.add(str);
            File file3 = new File(JXs(), DM.h(strLxb, ".zip"));
            com.bytedance.sdk.component.ebl.LD.Lxb lxbZU = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().ZU();
            this.ebl.put(str, lxbZU);
            lxbZU.LD(str);
            lxbZU.Lxb(file3.getParent(), file3.getName());
            lxbZU.Lxb(7);
            lxbZU.Lxb("playable_download");
            lxbZU.Lxb(new com.bytedance.sdk.component.ebl.Lxb.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.2
                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, final com.bytedance.sdk.component.ebl.LD ld) {
                    Lxb.this.lc.remove(str);
                    Lxb.this.ebl.remove(str);
                    final LD ld2 = (LD) Lxb.this.lk.remove(tDVar);
                    if (ld2 != null) {
                        ld2.LD(System.currentTimeMillis());
                    }
                    if (ld.lc() && ld.JXs() != null && ld.JXs().exists()) {
                        hg.LD(new OY("downloadZip") { // from class: com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean z;
                                long jLxb;
                                long jLD;
                                try {
                                    LD ld3 = ld2;
                                    if (ld3 != null) {
                                        ld3.lk(System.currentTimeMillis());
                                    }
                                    id.Lxb(ld.JXs().getAbsolutePath(), file2.getAbsolutePath());
                                    LD ld4 = ld2;
                                    if (ld4 != null) {
                                        ld4.ZU(System.currentTimeMillis());
                                    }
                                    LD ld5 = ld2;
                                    if (ld5 != null) {
                                        jLxb = ld5.Lxb();
                                        jLD = ld2.LD();
                                    } else {
                                        jLxb = 0;
                                        jLD = 0;
                                    }
                                    com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, jLxb, jLD);
                                    Lxb.LD(file2);
                                    z = true;
                                    try {
                                        File fileLxb = Lxb.Lxb(file2);
                                        if (fileLxb != null && fileLxb.exists()) {
                                            Lxb.this.OY.put(file2.getName(), fileLxb.getAbsolutePath());
                                        }
                                        Lxb.this.Lxb(Lxb.this.ZU(fileLxb), true);
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable th) {
                                    sLN.Lxb("PlayableCache", "unzip error: ", th);
                                    com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, -704, th.getMessage());
                                    z = false;
                                }
                                try {
                                    ld.JXs().delete();
                                } catch (Throwable unused3) {
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                Lxb.this.Lxb(interfaceC0098Lxb, z);
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, ld.Lxb() != 0 ? ld.Lxb() : -700, (String) null);
                        Lxb.this.Lxb(interfaceC0098Lxb, false);
                    }
                }

                @Override // com.bytedance.sdk.component.ebl.Lxb.Lxb
                public void Lxb(com.bytedance.sdk.component.ebl.LD.lk lkVar, IOException iOException) {
                    Lxb.this.lc.remove(str);
                    Lxb.this.ebl.remove(str);
                    Lxb.this.lk.remove(tDVar);
                    com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, -700, iOException.getMessage());
                    Lxb.this.Lxb(interfaceC0098Lxb, false);
                }
            });
            return;
        }
        com.bytedance.sdk.openadsdk.core.NXR.lk.LD.Lxb(tDVar, -701, (String) null);
        Lxb(interfaceC0098Lxb, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final InterfaceC0098Lxb interfaceC0098Lxb, final boolean z) {
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
