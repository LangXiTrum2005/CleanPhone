package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.f;
import com.startapp.sdk.internal.o8;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class DiskAdCacheManager$DiskCachedAd implements Serializable {
    private static final long serialVersionUID = -9194311006094821018L;
    private f ad;
    private String html;

    /* JADX WARN: Multi-variable type inference failed */
    public DiskAdCacheManager$DiskCachedAd(f fVar) {
        this.ad = fVar;
        if (fVar == 0 || !(fVar instanceof o8)) {
            return;
        }
        this.html = ((o8) fVar).a();
    }

    public final f a() {
        return this.ad;
    }

    public final String b() {
        return this.html;
    }
}
