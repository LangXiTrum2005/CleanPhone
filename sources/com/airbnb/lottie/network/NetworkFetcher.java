package com.airbnb.lottie.network;

import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class NetworkFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkCache f9872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultLottieNetworkFetcher f9873b;

    public NetworkFetcher(NetworkCache networkCache, DefaultLottieNetworkFetcher defaultLottieNetworkFetcher) {
        this.f9872a = networkCache;
        this.f9873b = defaultLottieNetworkFetcher;
    }

    public final LottieResult a(String str, InputStream inputStream, String str2, String str3) {
        FileExtension fileExtension;
        LottieResult lottieResultF;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        NetworkCache networkCache = this.f9872a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            Logger.a();
            fileExtension = FileExtension.ZIP;
            lottieResultF = str3 == null ? LottieCompositionFactory.f(new ZipInputStream(inputStream), null) : LottieCompositionFactory.f(new ZipInputStream(new FileInputStream(networkCache.c(str, inputStream, fileExtension))), str);
        } else {
            Logger.a();
            fileExtension = FileExtension.JSON;
            lottieResultF = str3 == null ? LottieCompositionFactory.c(inputStream, null) : LottieCompositionFactory.c(new FileInputStream(networkCache.c(str, inputStream, fileExtension).getAbsolutePath()), str);
        }
        if (str3 != null && lottieResultF.f9547a != null) {
            File file = new File(networkCache.b(), NetworkCache.a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            Logger.a();
            if (!zRenameTo) {
                Logger.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + mo.ono);
            }
        }
        return lottieResultF;
    }
}
