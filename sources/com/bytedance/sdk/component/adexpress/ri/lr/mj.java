package com.bytedance.sdk.component.adexpress.ri.lr;

import com.ironsource.A5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static com.bytedance.sdk.component.adexpress.ri.ik.ri ri;

    public static void ik() {
        ik.ri(fi.mj(), lr(), "temp_pkg_info.json");
    }

    public static void ka() {
        ik.lr(fi.mj(), lr(), "temp_pkg_info.json");
        ri = null;
    }

    public static synchronized com.bytedance.sdk.component.adexpress.ri.ik.ri lr() {
        return ri;
    }

    public static void ri() {
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(fi.mj(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        com.bytedance.sdk.component.adexpress.ri.ik.ri riVarRi = com.bytedance.sdk.component.adexpress.ri.ik.ri.ri(new JSONObject(new String(bArr, A5.O)));
                        if (riVarRi != null) {
                            ri = riVarRi;
                            ri.ik();
                        }
                        fileInputStream = fileInputStream2;
                    } catch (Throwable unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                            return;
                        }
                        return;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
        }
    }

    public static boolean lr(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar) {
        return ik.ik(lr(), riVar);
    }

    public static synchronized void ri(com.bytedance.sdk.component.adexpress.ri.ik.ri riVar) {
        if (riVar != null) {
            if (riVar.mj()) {
                ri = riVar;
            }
        }
    }

    public static boolean ri(String str) {
        return ik.ri(lr(), str);
    }
}
