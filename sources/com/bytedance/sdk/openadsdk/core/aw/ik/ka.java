package com.bytedance.sdk.openadsdk.core.aw.ik;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.fi;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static final List<String> ri = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);
    private static final ConcurrentHashMap<String, Boolean> lr = new ConcurrentHashMap<>();

    private static double lr(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(wjv wjvVar, File file, fi.ri riVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi(nr.ri(), 0, 0);
        com.bytedance.sdk.openadsdk.core.aw.ri riVarRi = fiVar.ri((String) null, file, new ArrayList());
        if (riVarRi != null) {
            riVar.ri(riVarRi.ri());
            riVar.ri(riVarRi.co());
        }
        lr(wjvVar, riVar.ik(), true, j);
        ri(wjvVar, "vast_url", riVarRi, jElapsedRealtime, fiVar.di);
        lr();
    }

    public static double ri(int i, double d, int i2, int i3, int i4, String str) {
        double dRi = ri(i, d, i2, i3);
        return lr(str) * (1.0d / ((dRi + 1.0d) + ri(i4)));
    }

    private static double ri(int i, double d, int i2, int i3) {
        return (d > 0.0d ? Math.abs(d - (i3 > 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d) + (i > 0 ? Math.abs((i - i2) / i) : 0.0d);
    }

    private static double ri(int i) {
        int iMax = Math.max(i, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void lr() {
        File[] fileArrListFiles;
        File fileRi = ri(nr.ri());
        if (fileRi == null || (fileArrListFiles = fileRi.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i = 0; i < fileArrListFiles.length && i < length; i++) {
            File file = fileArrListFiles[i];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void ri(wjv wjvVar) {
        fi fiVarYub;
        ArrayList<fi.ri> arrayListRi;
        wjv wjvVar2;
        if (wjvVar == null || !fi.ri(wjvVar) || (fiVarYub = wjvVar.yub()) == null || (arrayListRi = fiVarYub.ri()) == null || arrayListRi.isEmpty()) {
            return;
        }
        for (fi.ri riVar : arrayListRi) {
            String strKa = riVar.ka();
            if (TextUtils.isEmpty(strKa)) {
                wjvVar2 = wjvVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi(nr.ri(), 0, 0);
                com.bytedance.sdk.openadsdk.core.aw.ri riVarRi = fiVar.ri(strKa, (File) null, new ArrayList());
                if (riVarRi != null) {
                    riVar.ri(riVarRi.ri());
                    riVar.ri(riVarRi.co());
                }
                wjvVar2 = wjvVar;
                ri(wjvVar2, "vast_content", riVarRi, jElapsedRealtime, fiVar.di);
            }
            ri(wjvVar2, riVar);
            wjvVar = wjvVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(wjv wjvVar, final String str, final boolean z, final long j) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, wjvVar.fi(), "track_url_request_result", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.3
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                    jSONObject.put("success", z);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void lr(final wjv wjvVar, final String str, final com.bytedance.sdk.openadsdk.core.aw.ri riVar, final long j, final com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar2) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    com.bytedance.sdk.openadsdk.core.aw.ri riVar3 = riVar;
                    String str2 = "load_vast_fail";
                    if (riVar3 == null) {
                        com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar4 = riVar2;
                        if (riVar4 != null) {
                            jSONObject.put("error_code", riVar4.ri);
                        }
                    } else if (TextUtils.isEmpty(riVar3.jbs()) || TextUtils.isEmpty(riVar.di()) || riVar.mj() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.aw.ri riVar5 = riVar;
                    if (riVar5 == null || riVar5.lr() == null || !TextUtils.isEmpty(riVar.lr().fi())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put(InMobiNetworkValues.DESCRIPTION, "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str, "load_vast_icon_fail", jSONObject2);
                    riVar.ri((com.bytedance.sdk.openadsdk.core.aw.lr) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        List<wjv> listKa = riVar.ka();
        if (listKa != null) {
            Iterator<wjv> it = listKa.iterator();
            while (it.hasNext()) {
                ri(it.next());
            }
        }
    }

    private static void ri(final wjv wjvVar, final fi.ri riVar) {
        File fileRi;
        String strIk = riVar.ik();
        if (TextUtils.isEmpty(strIk)) {
            return;
        }
        final String str = strIk + wjvVar.jf();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = lr;
        if (concurrentHashMap.containsKey(str) || (fileRi = ri(str)) == null) {
            return;
        }
        if (fileRi.exists() && fileRi.length() > 0) {
            lr(wjvVar, fileRi, riVar, 0L);
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.xha.lr.ri riVarKa = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ka();
        riVarKa.ik(strIk);
        riVarKa.ri(fileRi.getParent(), fileRi.getName());
        riVarKa.ka(strIk);
        riVarKa.ri(new com.bytedance.sdk.component.xha.ri.ri() { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.1
            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, com.bytedance.sdk.component.xha.lr lrVar) {
                if (lrVar.di() && lrVar.fi() != null && lrVar.fi().exists()) {
                    ka.lr(wjvVar, lrVar.fi(), riVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    ka.lr(wjvVar, riVar.ik(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                ka.lr.remove(str);
            }

            @Override // com.bytedance.sdk.component.xha.ri.ri
            public void ri(com.bytedance.sdk.component.xha.lr.ik ikVar, IOException iOException) {
                ka.lr(wjvVar, riVar.ik(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                ka.lr.remove(str);
            }
        });
    }

    public static File ri(String str) {
        String strRi = com.bytedance.sdk.component.utils.fi.ri(str);
        if (strRi == null) {
            return null;
        }
        return new File(ri(nr.ri()), strRi);
    }

    private static File ri(Context context) {
        return xha.lr(context, new File(CacheDirFactory.getRootDir()).getName() + "/vast");
    }

    public static void ri(final wjv wjvVar, final String str, final com.bytedance.sdk.openadsdk.core.aw.ri riVar, final long j, final com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar2) {
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.aw.ik.ka.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j);
                    jSONObject.put("from", str);
                    if (riVar != null) {
                        wjv wjvVar2 = wjvVar;
                        com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar2, wjvVar2.fi(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar3 = riVar2;
                    if (riVar3 != null) {
                        jSONObject.put("error_code", riVar3.ri);
                    }
                    wjv wjvVar3 = wjvVar;
                    com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar3, wjvVar3.fi(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
