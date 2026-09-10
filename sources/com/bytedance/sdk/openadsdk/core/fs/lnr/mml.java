package com.bytedance.sdk.openadsdk.core.fs.lnr;

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.utils.wd;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.mzz;
import com.bytedance.sdk.openadsdk.core.yt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    public static final List<String> qdl = Arrays.asList("video/mp4", "video/3gpp");
    private static final ConcurrentHashMap<String, Boolean> ud = new ConcurrentHashMap<>();

    private static double ud(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals("video/mp4")) ? 1.5d : 1.0d;
        }
        str.equals("video/3gpp");
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(ljh ljhVar, File file, mzz.qdl qdlVar, long j) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz(yt.qdl(), 0, 0);
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = mzzVar.qdl((String) null, file, new ArrayList());
        if (qdlVarQdl != null) {
            qdlVar.qdl(qdlVarQdl.qdl());
            qdlVar.qdl(qdlVarQdl.exu());
        }
        ud(ljhVar, qdlVar.lnr(), true, j);
        qdl(ljhVar, "vast_url", qdlVarQdl, jElapsedRealtime, mzzVar.mo);
        ud();
    }

    public static double qdl(int i2, double d, int i3, int i4, int i5, String str) {
        double dQdl = qdl(i2, d, i3, i4);
        return (1.0d / ((dQdl + 1.0d) + qdl(i5))) * ud(str);
    }

    private static double qdl(int i2, double d, int i3, int i4) {
        return (d > 0.0d ? Math.abs(d - (i4 > 0 ? ((double) i3) / ((double) i4) : 0.0d)) : 0.0d) + (i2 > 0 ? Math.abs((i2 - i3) / i2) : 0.0d);
    }

    private static double qdl(int i2) {
        int iMax = Math.max(i2, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void ud() {
        File[] fileArrListFiles;
        File fileQdl = qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr());
        if (fileQdl == null || (fileArrListFiles = fileQdl.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.mml.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i2 = 0; i2 < fileArrListFiles.length && i2 < length; i2++) {
            File file = fileArrListFiles[i2];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void qdl(ljh ljhVar) throws Throwable {
        mzz mzzVarAf;
        ArrayList<mzz.qdl> arrayListQdl;
        ljh ljhVar2;
        if (ljhVar == null || !mzz.qdl(ljhVar) || (mzzVarAf = ljhVar.af()) == null || (arrayListQdl = mzzVarAf.qdl()) == null || arrayListQdl.isEmpty()) {
            return;
        }
        for (mzz.qdl qdlVar : arrayListQdl) {
            String strMml = qdlVar.mml();
            if (TextUtils.isEmpty(strMml)) {
                ljhVar2 = ljhVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz(yt.qdl(), 0, 0);
                com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = mzzVar.qdl(strMml, (File) null, new ArrayList());
                if (qdlVarQdl != null) {
                    qdlVar.qdl(qdlVarQdl.qdl());
                    qdlVar.qdl(qdlVarQdl.exu());
                }
                ljhVar2 = ljhVar;
                qdl(ljhVar2, "vast_content", qdlVarQdl, jElapsedRealtime, mzzVar.mo);
            }
            qdl(ljhVar2, qdlVar);
            ljhVar = ljhVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ud(ljh ljhVar, final String str, final boolean z2, final long j) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, ljhVar.mzz(), "track_url_request_result", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.mml.3
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject lnr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j);
                    jSONObject.put("success", z2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ud(final ljh ljhVar, final String str, final com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, final long j, final com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar2) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new jpc("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.mml.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar3 = qdlVar;
                    String str2 = "load_vast_fail";
                    if (qdlVar3 == null) {
                        com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar4 = qdlVar2;
                        if (qdlVar4 != null) {
                            jSONObject.put("error_code", qdlVar4.qdl);
                        }
                    } else if (TextUtils.isEmpty(qdlVar3.tvp()) || TextUtils.isEmpty(qdlVar.mo()) || qdlVar.jpc() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar5 = qdlVar;
                    if (qdlVar5 == null || qdlVar5.ud() == null || !TextUtils.isEmpty(qdlVar.ud().mo())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str, "load_vast_icon_fail", jSONObject2);
                    qdlVar.qdl((com.bytedance.sdk.openadsdk.core.fs.ud) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) throws Throwable {
        List<ljh> listMml = qdlVar.mml();
        if (listMml != null) {
            Iterator<ljh> it = listMml.iterator();
            while (it.hasNext()) {
                qdl(it.next());
            }
        }
    }

    private static void qdl(final ljh ljhVar, final mzz.qdl qdlVar) throws Throwable {
        File fileQdl;
        String strLnr = qdlVar.lnr();
        if (TextUtils.isEmpty(strLnr)) {
            return;
        }
        StringBuilder sbW = a.w(strLnr);
        sbW.append(ljhVar.cev());
        final String string = sbW.toString();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = ud;
        if (concurrentHashMap.containsKey(string) || (fileQdl = qdl(string)) == null) {
            return;
        }
        if (fileQdl.exists() && fileQdl.length() > 0) {
            ud(ljhVar, fileQdl, qdlVar, 0L);
            return;
        }
        concurrentHashMap.put(string, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
        qdlVarMml.ud(strLnr);
        qdlVarMml.qdl(fileQdl.getParent(), fileQdl.getName());
        qdlVarMml.lnr(strLnr);
        qdlVarMml.qdl(new com.bytedance.sdk.component.wd.qdl.qdl() { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.mml.1
            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, com.bytedance.sdk.component.wd.ud udVar) throws Throwable {
                if (udVar.mo() && udVar.mzz() != null && udVar.mzz().exists()) {
                    mml.ud(ljhVar, udVar.mzz(), qdlVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    mml.ud(ljhVar, qdlVar.lnr(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                mml.ud.remove(string);
            }

            @Override // com.bytedance.sdk.component.wd.qdl.qdl
            public void qdl(com.bytedance.sdk.component.wd.ud.lnr lnrVar, IOException iOException) {
                mml.ud(ljhVar, qdlVar.lnr(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                mml.ud.remove(string);
            }
        });
    }

    public static File qdl(String str) {
        String strQdl = com.bytedance.sdk.component.utils.mzz.qdl(str);
        if (strQdl == null) {
            return null;
        }
        return wd.qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr(), a.m(new File(CacheDirFactory.getRootDir()).getName(), "/vast/"), strQdl);
    }

    private static File qdl(Context context, boolean z2) {
        return wd.qdl(context, z2, new File(CacheDirFactory.getRootDir()).getName() + "/vast/");
    }

    public static void qdl(final ljh ljhVar, final String str, final com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, final long j, final com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar2) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new jpc("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.fs.lnr.mml.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    jSONObject.put("from", str);
                    if (qdlVar != null) {
                        ljh ljhVar2 = ljhVar;
                        com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar2, ljhVar2.mzz(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar3 = qdlVar2;
                    if (qdlVar3 != null) {
                        jSONObject.put("error_code", qdlVar3.qdl);
                    }
                    ljh ljhVar3 = ljhVar;
                    com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar3, ljhVar3.mzz(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
