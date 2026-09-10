package com.google.ads.mediation.inmobi;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiMemoryCache {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, Drawable> f18889attabal = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f18891saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f18890dern = 1000000;

    public InMobiMemoryCache() {
        wireman(Runtime.getRuntime().maxMemory() / 4);
    }

    public final void attabal() {
        this.f18889attabal.size();
        if (this.f18891saneness > this.f18890dern) {
            Iterator<Map.Entry<String, Drawable>> it = this.f18889attabal.entrySet().iterator();
            while (it.hasNext()) {
                this.f18891saneness -= saneness(((BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.f18891saneness <= this.f18890dern) {
                    break;
                }
            }
            this.f18889attabal.size();
        }
    }

    public void clear() {
        try {
            this.f18889attabal.clear();
            this.f18891saneness = 0L;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void dern(String str, Drawable drawable) {
        try {
            if (this.f18889attabal.containsKey(str)) {
                this.f18891saneness -= saneness(((BitmapDrawable) this.f18889attabal.get(str)).getBitmap());
            }
            this.f18889attabal.put(str, drawable);
            this.f18891saneness += saneness(((BitmapDrawable) drawable).getBitmap());
            attabal();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Drawable get(String str) {
        try {
            if (this.f18889attabal.containsKey(str)) {
                return this.f18889attabal.get(str);
            }
            return null;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final long saneness(Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final void wireman(long j) {
        this.f18890dern = j;
    }
}
