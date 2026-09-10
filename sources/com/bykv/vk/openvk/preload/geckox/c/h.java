package com.bykv.vk.openvk.preload.geckox.c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {
    private int d = 0;

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "patch update failed", th);
        if (this.d >= g().getPatch().getUrlList().size()) {
            return false;
        }
        return (th instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackageG = g();
        List<String> urlList = updatePackageG.getPatch().getUrlList();
        int i2 = this.d;
        this.d = i2 + 1;
        return new Pair<>(Uri.parse(urlList.get(i2)), updatePackageG);
    }
}
