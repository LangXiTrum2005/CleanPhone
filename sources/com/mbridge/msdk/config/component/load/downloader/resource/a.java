package com.mbridge.msdk.config.component.load.downloader.resource;

import com.mbridge.msdk.config.component.load.downloader.resource.stream.b;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f32244a;

    private a() {
    }

    public static a a() {
        if (f32244a == null) {
            synchronized (a.class) {
                try {
                    if (f32244a == null) {
                        f32244a = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32244a;
    }

    public com.mbridge.msdk.config.component.load.downloader.resource.stream.a b(File file) throws IOException {
        if (file == null) {
            throw new IOException("file is null");
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        return new b(file);
    }

    public long c(File file) {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            try {
                return file.length();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }

    public String a(String str) {
        try {
            URL url = new URL(str);
            String str2 = url.getProtocol() + "://" + url.getHost() + url.getPath();
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str2.getBytes("UTF-8"));
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }
}
