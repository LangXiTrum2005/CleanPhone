package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f12965a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f12966b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12967c;

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            this.f12967c = new File(context.getFilesDir(), android.support.v4.media.a.r(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
        } else {
            this.f12967c = new File(file, str).getAbsolutePath();
        }
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f12965a) {
            try {
                aVar = this.f12965a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.f12967c, strSubstring);
                    this.f12965a.put(strSubstring, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final String a() {
        return this.f12967c;
    }

    public final int b(String str) throws Exception {
        if (this.f12966b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.f12966b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    public final InputStream a(String str) throws Exception {
        if (this.f12966b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f12965a) {
            try {
                Collection<a> collectionValues = this.f12965a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Exception {
        if (this.f12966b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f12965a) {
            try {
                Iterator<a> it = this.f12965a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.f12965a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
