package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3217s1 implements InterfaceC3138n1 {
    @Override // com.inmobi.media.InterfaceC3138n1
    public final void a(P9 response, String locationOnDisk, C3072j asset) {
        Intrinsics.f(response, "response");
        Intrinsics.f(locationOnDisk, "locationOnDisk");
        Intrinsics.f(asset, "asset");
        AdConfig.AssetCacheConfig assetCacheConfig = C3233t1.f23992c;
        if (assetCacheConfig != null) {
            C3056i c3056iA = new C3056i().a(asset.f23703b, locationOnDisk, response, assetCacheConfig.getMaxRetries(), assetCacheConfig.getTimeToLive());
            int i2 = c3056iA.f23673a;
            String str = c3056iA.f23675c;
            if (str == null) {
                str = "";
            }
            C3072j c3072j = new C3072j(i2, str, c3056iA.d, c3056iA.f23674b, c3056iA.f23676e, c3056iA.f, c3056iA.g, c3056iA.f23677h);
            Nc.a().a(c3072j);
            c3072j.j = asset.j;
            c3072j.k = asset.k;
            C3233t1.f23990a.a(c3072j, (byte) -1);
        }
        try {
            C3233t1 c3233t1 = C3233t1.f23990a;
            if (C3233t1.j.get()) {
                return;
            }
            c3233t1.c();
        } catch (Exception e2) {
            C3233t1 c3233t2 = C3233t1.f23990a;
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    @Override // com.inmobi.media.InterfaceC3138n1
    public final void a(C3072j asset) {
        Intrinsics.f(asset, "asset");
        C3233t1 c3233t1 = C3233t1.f23990a;
        String str = asset.f23703b;
        C3233t1 c3233t2 = C3233t1.f23990a;
        C3233t1.k.remove(str);
        if (asset.d <= 0) {
            c3233t2.a(asset, asset.f23708l);
            C3122m1 c3122m1A = Nc.a();
            c3122m1A.getClass();
            c3122m1A.a("id = ?", new String[]{String.valueOf(asset.f23702a)});
        } else {
            asset.f23705e = System.currentTimeMillis();
            Nc.a().a(asset);
            if (T9.a(false) != null) {
                c3233t2.a(asset, asset.f23708l);
            }
        }
        try {
            if (C3233t1.j.get()) {
                return;
            }
            c3233t2.c();
        } catch (Exception e2) {
            C3233t1 c3233t3 = C3233t1.f23990a;
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
