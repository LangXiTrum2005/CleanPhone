package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class CacheMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile CacheMetaData f40637a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;

    @TypeInfo(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private float sendCacheSizeProb = 20.0f;
    private String cacheMetaDataUpdateVersion = "5.2.4";

    public static CacheMetaData b() {
        return f40637a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f40637a.ACM;
        return aCMConfig != null && aCMConfig.a(ih.f41097a.q);
    }

    public final ACMConfig a() {
        return this.ACM;
    }

    public final float c() {
        return this.sendCacheSizeProb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CacheMetaData cacheMetaData = (CacheMetaData) obj;
            if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) == 0 && vi.a((Object) this.ACM, (Object) cacheMetaData.ACM) && vi.a((Object) this.cacheMetaDataUpdateVersion, (Object) cacheMetaData.cacheMetaDataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "5.2.4";
        f40637a = cacheMetaData;
        g7.a(context, "StartappCacheMetadata", cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) g7.c(context, "StartappCacheMetadata");
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean zA = vi.a((Serializable) cacheMetaData, (Serializable) cacheMetaData2);
            if ("5.2.4".equals(cacheMetaData.cacheMetaDataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f41040e);
                g9Var.d = "metadata_null";
                g9Var.a();
            }
            f40637a = cacheMetaData;
            return;
        }
        f40637a = cacheMetaData2;
    }
}
