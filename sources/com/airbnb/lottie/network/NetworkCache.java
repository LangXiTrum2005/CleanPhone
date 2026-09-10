package com.airbnb.lottie.network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class NetworkCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieNetworkCacheProvider f9871a;

    public NetworkCache(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.f9871a = lottieNetworkCacheProvider;
    }

    public static String a(String str, FileExtension fileExtension, boolean z2) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        String strConcat = fileExtension.X;
        if (z2) {
            strConcat = ".temp".concat(strConcat);
        }
        sb.append(strConcat);
        return sb.toString();
    }

    public final File b() {
        File fileA = this.f9871a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public final File c(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(b(), a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
