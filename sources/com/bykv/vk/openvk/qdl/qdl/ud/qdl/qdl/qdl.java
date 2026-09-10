package com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud {
    private String qdl = "video_reward_full";
    private String ud = "video_brand";
    private String lnr = "video_splash";
    private String mml = "video_default";
    private String mzz = null;
    private String mo = null;
    private String wd = null;
    private String jpc = null;
    private String tvp = null;

    private List<com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl> mo() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl(new File(qdl()).listFiles(), com.bykv.vk.openvk.qdl.qdl.ud.qdl.lnr()));
        arrayList.add(new com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl(new File(ud()).listFiles(), com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud()));
        arrayList.add(new com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl(new File(mzz()).listFiles(), com.bykv.vk.openvk.qdl.qdl.ud.qdl.mml()));
        arrayList.add(new com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl(new File(lnr()).listFiles(), com.bykv.vk.openvk.qdl.qdl.ud.qdl.mzz()));
        return arrayList;
    }

    private Set<String> wd() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl qdlVar : com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.qdl.values()) {
            if (qdlVar != null && qdlVar.qdl() != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVarQdl = qdlVar.qdl();
                hashSet.add(com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVarQdl.mzz(), lnrVarQdl.yt()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVarQdl.mzz(), lnrVarQdl.yt()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.ud udVar : com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.lnr.qdl.values()) {
            if (udVar != null && udVar.qdl() != null) {
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVarQdl2 = udVar.qdl();
                hashSet.add(com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVarQdl2.mzz(), lnrVarQdl2.yt()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVarQdl2.mzz(), lnrVarQdl2.yt()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public String lnr() {
        if (this.tvp == null) {
            this.tvp = this.mzz + File.separator + this.mml;
            File file = new File(this.tvp);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.tvp;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public synchronized void mml() {
        try {
            Set<String> setWd = null;
            for (com.bykv.vk.openvk.qdl.qdl.qdl.qdl.qdl qdlVar : mo()) {
                File[] fileArrQdl = qdlVar.qdl();
                if (fileArrQdl != null && fileArrQdl.length >= qdlVar.ud()) {
                    if (setWd == null) {
                        setWd = wd();
                    }
                    int iUd = qdlVar.ud() - 2;
                    if (iUd < 0) {
                        iUd = 0;
                    }
                    qdl(qdlVar.qdl(), iUd, setWd);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String mzz() {
        if (this.wd == null) {
            this.wd = this.mzz + File.separator + this.ud;
            File file = new File(this.wd);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.wd;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public void qdl(String str) {
        this.mzz = str;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public String ud() {
        if (this.jpc == null) {
            this.jpc = this.mzz + File.separator + this.lnr;
            File file = new File(this.jpc);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.jpc;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public String qdl() {
        if (this.mo == null) {
            this.mo = this.mzz + File.separator + this.qdl;
            File file = new File(this.mo);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.mo;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public long ud(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        if (TextUtils.isEmpty(lnrVar.mzz()) || TextUtils.isEmpty(lnrVar.yt())) {
            return 0L;
        }
        return com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.qdl(lnrVar.mzz(), lnrVar.yt());
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.ud
    public boolean qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        if (TextUtils.isEmpty(lnrVar.mzz()) || TextUtils.isEmpty(lnrVar.yt())) {
            return false;
        }
        return new File(lnrVar.mzz(), lnrVar.yt()).exists();
    }

    private static void qdl(File[] fileArr, int i2, Set<String> set) {
        if (i2 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i2) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.qdl.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i2 < listAsList.size()) {
                        File file = (File) listAsList.get(i2);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i2)).delete();
                        }
                        i2++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
