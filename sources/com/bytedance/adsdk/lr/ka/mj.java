package com.bytedance.adsdk.lr.ka;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.lr.co;
import com.ironsource.A5;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private final di lr;
    private final xha ri;

    public mj(xha xhaVar, di diVar) {
        this.ri = xhaVar;
        this.lr = diVar;
    }

    private co<com.bytedance.adsdk.lr.xha> ik(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                ka kaVarRi = this.lr.ri(str);
                if (!kaVarRi.ri()) {
                    co<com.bytedance.adsdk.lr.xha> coVar = new co<>(new IllegalArgumentException(kaVarRi.ka()));
                    try {
                        kaVarRi.close();
                    } catch (IOException unused) {
                    }
                    return coVar;
                }
                co<com.bytedance.adsdk.lr.xha> coVarRi = ri(context, str, kaVarRi.lr(), kaVarRi.ik(), str2);
                coVarRi.ri();
                try {
                    kaVarRi.close();
                } catch (IOException unused2) {
                }
                return coVarRi;
            } catch (Exception e) {
                co<com.bytedance.adsdk.lr.xha> coVar2 = new co<>(e);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return coVar2;
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

    private com.bytedance.adsdk.lr.xha lr(Context context, String str, String str2) {
        xha xhaVar;
        Pair<ik, InputStream> pairRi;
        if (str2 == null || (xhaVar = this.ri) == null || (pairRi = xhaVar.ri(str)) == null) {
            return null;
        }
        ik ikVar = (ik) pairRi.first;
        InputStream inputStream = (InputStream) pairRi.second;
        co<com.bytedance.adsdk.lr.xha> coVarRi = ikVar == ik.ZIP ? com.bytedance.adsdk.lr.mj.ri(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.lr.mj.lr(inputStream, str2);
        if (coVarRi.ri() != null) {
            return coVarRi.ri();
        }
        return null;
    }

    public co<com.bytedance.adsdk.lr.xha> ri(Context context, String str, String str2) {
        com.bytedance.adsdk.lr.xha xhaVarLr = lr(context, str, str2);
        return xhaVarLr != null ? new co<>(xhaVarLr) : ik(context, str, str2);
    }

    private co<com.bytedance.adsdk.lr.xha> ri(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        co<com.bytedance.adsdk.lr.xha> coVarRi;
        ik ikVar;
        xha xhaVar;
        if (str2 == null) {
            str2 = A5.M;
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            ikVar = ik.JSON;
            coVarRi = ri(str, inputStream, str3);
        } else {
            ik ikVar2 = ik.ZIP;
            coVarRi = ri(context, str, inputStream, str3);
            ikVar = ikVar2;
        }
        if (str3 != null && coVarRi.ri() != null && (xhaVar = this.ri) != null) {
            xhaVar.ri(str, ikVar);
        }
        return coVarRi;
    }

    private co<com.bytedance.adsdk.lr.xha> ri(Context context, String str, InputStream inputStream, String str2) throws IOException {
        xha xhaVar;
        if (str2 != null && (xhaVar = this.ri) != null) {
            return com.bytedance.adsdk.lr.mj.ri(context, new ZipInputStream(new FileInputStream(xhaVar.ri(str, inputStream, ik.ZIP))), str);
        }
        return com.bytedance.adsdk.lr.mj.ri(context, new ZipInputStream(inputStream), (String) null);
    }

    private co<com.bytedance.adsdk.lr.xha> ri(String str, InputStream inputStream, String str2) throws IOException {
        xha xhaVar;
        if (str2 != null && (xhaVar = this.ri) != null) {
            return com.bytedance.adsdk.lr.mj.lr(new FileInputStream(xhaVar.ri(str, inputStream, ik.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.lr.mj.lr(inputStream, (String) null);
    }
}
