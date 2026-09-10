package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class r6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f41428c;
    public final /* synthetic */ t2 d;

    public r6(Context context, String str, s2 s2Var, t2 t2Var) {
        this.f41426a = context;
        this.f41427b = str;
        this.f41428c = s2Var;
        this.d = t2Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        Object object;
        try {
            Context context = this.f41426a;
            String strConcat = "startapp_ads".concat(File.separator).concat("interstitials");
            String str = this.f41427b;
            if (str == null) {
                object = null;
            } else {
                try {
                    File file = new File(g7.a(context, strConcat));
                    if (file.exists() && file.isDirectory()) {
                        File file2 = new File(file, str);
                        if (file2.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                            object = objectInputStream.readObject();
                            objectInputStream.close();
                            fileInputStream.close();
                        } else {
                            object = null;
                        }
                    } else {
                        object = null;
                    }
                } catch (Throwable th) {
                    if (g7.a(2)) {
                        g9.a(th);
                    }
                }
            }
            new Handler(Looper.getMainLooper()).post(new q6(this, (DiskAdCacheManager$DiskCachedAd) object));
        } catch (Throwable th2) {
            g9.a(th2);
            a0.a(this.f41426a, this.f41428c, null, true);
        }
    }
}
