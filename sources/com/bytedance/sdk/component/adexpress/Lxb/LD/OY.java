package com.bytedance.sdk.component.adexpress.Lxb.LD;

import com.bytedance.sdk.component.utils.sLN;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb Lxb;

    public static synchronized com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb LD() {
        return Lxb;
    }

    public static void Lxb() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(JXs.OY(), "temp_pkg_info.json");
            long length = file.length();
            Long lValueOf = Long.valueOf(length);
            if (length > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[lValueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb Lxb2 = com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb.Lxb(new JSONObject(new String(bArr, "utf-8")));
                    if (Lxb2 != null) {
                        Lxb = Lxb2;
                        Lxb2.lk();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        sLN.Lxb("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public static void ZU() {
        lk.LD(JXs.OY(), LD(), "temp_pkg_info.json");
        Lxb = null;
    }

    public static void lk() {
        lk.Lxb(JXs.OY(), LD(), "temp_pkg_info.json");
    }

    public static boolean LD(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb) {
        return lk.lk(LD(), lxb);
    }

    public static synchronized void Lxb(com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb lxb) {
        if (lxb != null) {
            if (lxb.ebl()) {
                Lxb = lxb;
            }
        }
    }

    public static boolean Lxb(String str) {
        return lk.Lxb(LD(), str);
    }
}
