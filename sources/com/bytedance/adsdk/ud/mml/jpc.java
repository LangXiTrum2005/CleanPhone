package com.bytedance.adsdk.ud.mml;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.ud.fs;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class jpc {
    private final wd qdl;
    private final mo ud;

    public jpc(wd wdVar, mo moVar) {
        this.qdl = wdVar;
        this.ud = moVar;
    }

    private fs<com.bytedance.adsdk.ud.wd> lnr(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                mml mmlVarQdl = this.ud.qdl(str);
                if (!mmlVarQdl.qdl()) {
                    fs<com.bytedance.adsdk.ud.wd> fsVar = new fs<>(new IllegalArgumentException(mmlVarQdl.mml()));
                    try {
                        mmlVarQdl.close();
                    } catch (IOException unused) {
                    }
                    return fsVar;
                }
                fs<com.bytedance.adsdk.ud.wd> fsVarQdl = qdl(context, str, mmlVarQdl.ud(), mmlVarQdl.lnr(), str2);
                fsVarQdl.qdl();
                try {
                    mmlVarQdl.close();
                } catch (IOException unused2) {
                }
                return fsVarQdl;
            } catch (Exception e2) {
                fs<com.bytedance.adsdk.ud.wd> fsVar2 = new fs<>(e2);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return fsVar2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    private com.bytedance.adsdk.ud.wd ud(Context context, String str, String str2) {
        wd wdVar;
        Pair<lnr, InputStream> pairQdl;
        if (str2 == null || (wdVar = this.qdl) == null || (pairQdl = wdVar.qdl(str)) == null) {
            return null;
        }
        lnr lnrVar = (lnr) pairQdl.first;
        InputStream inputStream = (InputStream) pairQdl.second;
        fs<com.bytedance.adsdk.ud.wd> fsVarQdl = lnrVar == lnr.ZIP ? com.bytedance.adsdk.ud.jpc.qdl(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.ud.jpc.ud(inputStream, str2);
        if (fsVarQdl.qdl() != null) {
            return fsVarQdl.qdl();
        }
        return null;
    }

    public fs<com.bytedance.adsdk.ud.wd> qdl(Context context, String str, String str2) {
        com.bytedance.adsdk.ud.wd wdVarUd = ud(context, str, str2);
        return wdVarUd != null ? new fs<>(wdVarUd) : lnr(context, str, str2);
    }

    private fs<com.bytedance.adsdk.ud.wd> qdl(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        fs<com.bytedance.adsdk.ud.wd> fsVarQdl;
        lnr lnrVar;
        wd wdVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            lnrVar = lnr.JSON;
            fsVarQdl = qdl(str, inputStream, str3);
        } else {
            lnr lnrVar2 = lnr.ZIP;
            fsVarQdl = qdl(context, str, inputStream, str3);
            lnrVar = lnrVar2;
        }
        if (str3 != null && fsVarQdl.qdl() != null && (wdVar = this.qdl) != null) {
            wdVar.qdl(str, lnrVar);
        }
        return fsVarQdl;
    }

    private fs<com.bytedance.adsdk.ud.wd> qdl(Context context, String str, InputStream inputStream, String str2) throws IOException {
        wd wdVar;
        if (str2 != null && (wdVar = this.qdl) != null) {
            return com.bytedance.adsdk.ud.jpc.qdl(context, new ZipInputStream(new FileInputStream(wdVar.qdl(str, inputStream, lnr.ZIP))), str);
        }
        return com.bytedance.adsdk.ud.jpc.qdl(context, new ZipInputStream(inputStream), (String) null);
    }

    private fs<com.bytedance.adsdk.ud.wd> qdl(String str, InputStream inputStream, String str2) throws IOException {
        wd wdVar;
        if (str2 != null && (wdVar = this.qdl) != null) {
            return com.bytedance.adsdk.ud.jpc.ud(new FileInputStream(wdVar.qdl(str, inputStream, lnr.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.ud.jpc.ud(inputStream, (String) null);
    }
}
