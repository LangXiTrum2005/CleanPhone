package com.inmobi.media;

import A.RunnableC0887e;
import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S3 f23902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of f23903b;

    public pf(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.f(context, "context");
        Intrinsics.f(webAssetCacheConfig, "webAssetCacheConfig");
        this.f23903b = new of();
        Uc.a(new RunnableC0887e(webAssetCacheConfig, this, context, 7));
    }

    public final InputStream a(String url, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        S3 s3 = this.f23902a;
        if (s3 == null) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: ".concat(url));
            }
            return null;
        }
        try {
            R3 r3B = s3.b(String.valueOf(url.hashCode()));
            if (r3B != null && url.equals(Ge.a(new InputStreamReader(r3B.f23118a[0], Ge.f22852b)))) {
                return r3B.f23118a[1];
            }
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for ".concat(url));
            }
            return null;
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e2.getMessage() + " for " + url);
            }
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, pf this$0, Context context) {
        Intrinsics.f(webAssetCacheConfig, "$webAssetCacheConfig");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(context, "$context");
        try {
            long jE = L3.f22938a.e();
            if (jE < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                a(context, jE);
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(context, "web_asset_file_key"), "cache_enabled", false, false, 4, (Object) null);
            } else {
                this$0.a(context, webAssetCacheConfig, jE);
                ConcurrentHashMap concurrentHashMap2 = C6.f22734b;
                C6.a(B6.a(context, "web_asset_file_key"), "cache_enabled", true, false, 4, (Object) null);
            }
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        Intrinsics.f(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * 1024 * ((long) 1024);
        of ofVar = this.f23903b;
        Pattern pattern = S3.f23152p;
        if (jMin > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            S3 s3 = new S3(file, jMin, ofVar);
            if (s3.f23154b.exists()) {
                try {
                    s3.c();
                    s3.b();
                    s3.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s3.f23154b, true), Ge.f22851a));
                } catch (IOException e2) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    s3.close();
                    Ge.a(s3.f23153a);
                    file.mkdirs();
                    s3 = new S3(file, jMin, ofVar);
                    s3.d();
                }
            } else {
                file.mkdirs();
                s3 = new S3(file, jMin, ofVar);
                s3.d();
            }
            this.f23902a = s3;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j) {
        Pair pair = new Pair("size", Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        LinkedHashMap linkedHashMapL = MapsKt.l(pair, new Pair("state", Boolean.valueOf(B6.a(context, "web_asset_file_key").f22735a.getBoolean("cache_enabled", false))));
        Pd pd = Pd.f23077a;
        Pd.b("LowAvailableSpaceForCache", linkedHashMapL, Td.SDK);
    }
}
