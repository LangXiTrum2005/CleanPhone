package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f41192a;

    public l(p pVar) {
        this.f41192a = pVar;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f41192a.g;
            String str = File.separator;
            String strConcat = "startapp_ads".concat(str).concat("keys");
            if (strConcat != null) {
                g7.a(new File(g7.b(context, strConcat)));
                g7.a(new File(g7.a(context, strConcat)));
            }
            Context context2 = this.f41192a.g;
            String strConcat2 = "startapp_ads".concat(str).concat("interstitials");
            if (strConcat2 != null) {
                g7.a(new File(g7.b(context2, strConcat2)));
                g7.a(new File(g7.a(context2, strConcat2)));
            }
            for (Map.Entry entry : this.f41192a.f41333a.entrySet()) {
                CacheKey cacheKey = (CacheKey) entry.getKey();
                x2 x2Var = (x2) entry.getValue();
                Context context3 = this.f41192a.g;
                AdPreferences.Placement placementA = cacheKey.a();
                AdPreferences adPreferences = x2Var.f41660n;
                String strReplace = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                int i2 = x2Var.f41663w;
                DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = new DiskAdCacheManager$DiskCacheKey(placementA, adPreferences);
                diskAdCacheManager$DiskCacheKey.a(i2);
                String strConcat3 = "startapp_ads".concat(File.separator).concat("keys");
                if (strReplace != null) {
                    try {
                        File file = new File(g7.a(context3, strConcat3));
                        if (file.exists() || file.mkdirs()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, strReplace));
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                            objectOutputStream.writeObject(diskAdCacheManager$DiskCacheKey);
                            objectOutputStream.close();
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        if (g7.a(4)) {
                            g9.a(th);
                        }
                    }
                }
                Context context4 = this.f41192a.g;
                String strReplace2 = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = new DiskAdCacheManager$DiskCachedAd(x2Var.o);
                String strConcat4 = "startapp_ads".concat(File.separator).concat("interstitials");
                if (strReplace2 != null) {
                    try {
                        File file2 = new File(g7.a(context4, strConcat4));
                        if (file2.exists() || file2.mkdirs()) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file2, strReplace2));
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                            objectOutputStream2.writeObject(diskAdCacheManager$DiskCachedAd);
                            objectOutputStream2.close();
                            fileOutputStream2.close();
                        }
                    } catch (Throwable th2) {
                        if (g7.a(4)) {
                            g9.a(th2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }
}
