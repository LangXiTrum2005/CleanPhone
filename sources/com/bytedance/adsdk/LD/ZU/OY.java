package com.bytedance.adsdk.LD.ZU;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.LD.sLN;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class OY {
    private final lc LD;
    private final ebl Lxb;

    public OY(ebl eblVar, lc lcVar) {
        this.Lxb = eblVar;
        this.LD = lcVar;
    }

    @WorkerThread
    private com.bytedance.adsdk.LD.ebl LD(Context context, String str, String str2) {
        ebl eblVar;
        Pair<lk, InputStream> pairLxb;
        if (str2 == null || (eblVar = this.Lxb) == null || (pairLxb = eblVar.Lxb(str)) == null) {
            return null;
        }
        lk lkVar = (lk) pairLxb.first;
        InputStream inputStream = (InputStream) pairLxb.second;
        sLN<com.bytedance.adsdk.LD.ebl> slnLxb = lkVar == lk.ZIP ? com.bytedance.adsdk.LD.OY.Lxb(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.LD.OY.LD(inputStream, str2);
        if (slnLxb.Lxb() != null) {
            return slnLxb.Lxb();
        }
        return null;
    }

    @WorkerThread
    private sLN<com.bytedance.adsdk.LD.ebl> lk(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                ZU zuLxb = this.LD.Lxb(str);
                if (!zuLxb.Lxb()) {
                    sLN<com.bytedance.adsdk.LD.ebl> sln = new sLN<>(new IllegalArgumentException(zuLxb.ZU()));
                    try {
                        zuLxb.close();
                    } catch (IOException unused) {
                    }
                    return sln;
                }
                sLN<com.bytedance.adsdk.LD.ebl> slnLxb = Lxb(context, str, zuLxb.LD(), zuLxb.lk(), str2);
                slnLxb.Lxb();
                try {
                    zuLxb.close();
                } catch (IOException unused2) {
                }
                return slnLxb;
            } catch (Exception e) {
                sLN<com.bytedance.adsdk.LD.ebl> sln2 = new sLN<>(e);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return sln2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @WorkerThread
    public sLN<com.bytedance.adsdk.LD.ebl> Lxb(Context context, String str, String str2) {
        com.bytedance.adsdk.LD.ebl eblVarLD = LD(context, str, str2);
        return eblVarLD != null ? new sLN<>(eblVarLD) : lk(context, str, str2);
    }

    private sLN<com.bytedance.adsdk.LD.ebl> Lxb(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        sLN<com.bytedance.adsdk.LD.ebl> slnLxb;
        lk lkVar;
        ebl eblVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            lkVar = lk.JSON;
            slnLxb = Lxb(str, inputStream, str3);
        } else {
            lk lkVar2 = lk.ZIP;
            slnLxb = Lxb(context, str, inputStream, str3);
            lkVar = lkVar2;
        }
        if (str3 != null && slnLxb.Lxb() != null && (eblVar = this.Lxb) != null) {
            eblVar.Lxb(str, lkVar);
        }
        return slnLxb;
    }

    private sLN<com.bytedance.adsdk.LD.ebl> Lxb(Context context, String str, InputStream inputStream, String str2) throws IOException {
        ebl eblVar;
        if (str2 != null && (eblVar = this.Lxb) != null) {
            return com.bytedance.adsdk.LD.OY.Lxb(context, new ZipInputStream(new FileInputStream(eblVar.Lxb(str, inputStream, lk.ZIP))), str);
        }
        return com.bytedance.adsdk.LD.OY.Lxb(context, new ZipInputStream(inputStream), (String) null);
    }

    private sLN<com.bytedance.adsdk.LD.ebl> Lxb(String str, InputStream inputStream, String str2) throws IOException {
        ebl eblVar;
        if (str2 != null && (eblVar = this.Lxb) != null) {
            return com.bytedance.adsdk.LD.OY.LD(new FileInputStream(eblVar.Lxb(str, inputStream, lk.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.LD.OY.LD(inputStream, (String) null);
    }
}
