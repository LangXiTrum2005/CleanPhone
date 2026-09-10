package com.inmobi.media;

import android.content.Context;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.media.C2809bo;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2809bo {
    public H5 a;
    public final C2783ao b;

    public C2809bo(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.b = new C2783ao();
        Runnable runnable = new Runnable() { // from class: adsuki.energid
            @Override // java.lang.Runnable
            public final void run() {
                C2809bo.a(webAssetCacheConfig, this, context);
            }
        };
        Context context2 = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }

    public final InputStream a(String url, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(url, "url");
        H5 h5 = this.a;
        if (h5 == null) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        try {
            G5 g5B = h5.b(String.valueOf(url.hashCode()));
            if (g5B != null && Intrinsics.wireman(url, AbstractC2806bl.a(new InputStreamReader(g5B.a[0], AbstractC2806bl.b)))) {
                return g5B.a[1];
            }
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
            }
            return null;
        } catch (Exception e) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e.getMessage() + " for " + url);
            }
        }
    }

    public final boolean a(String url, String data, InterfaceC3072m9 interfaceC3072m9) throws Throwable {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.a == null) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            String strValueOf = String.valueOf(url.hashCode());
            H5 h5 = this.a;
            OutputStreamWriter outputStreamWriter = null;
            if (h5 == null) {
                Intrinsics.preprohormone("diskLruCache");
                h5 = null;
            }
            D5 d5A = h5.a(strValueOf);
            if (d5A == null) {
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
                }
                return false;
            }
            try {
                OutputStream outputStreamA = d5A.a(0);
                Charset charset = AbstractC2806bl.b;
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStreamA, charset);
                try {
                    outputStreamWriter2.write(url);
                    AbstractC2806bl.a(outputStreamWriter2);
                    try {
                        OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(d5A.a(1), charset);
                        try {
                            outputStreamWriter3.write(data);
                            AbstractC2806bl.a(outputStreamWriter3);
                            if (d5A.c) {
                                d5A.d.a(d5A, false);
                                d5A.d.d(d5A.a.a);
                            } else {
                                d5A.d.a(d5A, true);
                            }
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            outputStreamWriter = outputStreamWriter3;
                            AbstractC2806bl.a(outputStreamWriter);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamWriter = outputStreamWriter2;
                    AbstractC2806bl.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e.getMessage() + " for " + url);
            }
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C2809bo c2809bo, Context context) {
        try {
            C3342x5.a.getClass();
            long j = C3342x5.c;
            if (j < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c2809bo.getClass();
                a(context, j);
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c2809bo.a(context, webAssetCacheConfig, j);
            ConcurrentHashMap concurrentHashMap2 = Ea.b;
            Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            e.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE * ((long) 1024);
        C2783ao c2783ao = this.b;
        Pattern pattern = H5.p;
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
            H5 h5 = new H5(file, jMin, c2783ao);
            if (h5.c.exists()) {
                try {
                    h5.b();
                    h5.a();
                    h5.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(h5.c, true), AbstractC2806bl.a));
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    file.toString();
                    e.getMessage();
                    printStream.getClass();
                    h5.close();
                    AbstractC2806bl.a(h5.b);
                    file.mkdirs();
                    h5 = new H5(file, jMin, c2783ao);
                    h5.c();
                }
            } else {
                file.mkdirs();
                h5 = new H5(file, jMin, c2783ao);
                h5.c();
            }
            this.a = h5;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j) {
        Pair pairAttabal = formularize.attabal("size", Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "web_asset_file_key");
        Intrinsics.checkNotNullParameter("cache_enabled", com.ironsource.X3.i.W);
        Map mapKowloon = seminary.kowloon(pairAttabal, formularize.attabal("state", Boolean.valueOf(eaA.a.getBoolean("cache_enabled", false))));
        Wj wj = Wj.a;
        Wj.b("LowAvailableSpaceForCache", mapKowloon, EnumC2779ak.SDK);
    }
}
