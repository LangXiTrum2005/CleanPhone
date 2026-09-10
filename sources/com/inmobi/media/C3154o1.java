package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3154o1 implements InterfaceC3138n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC3170p1 f23849a;

    public C3154o1(HandlerC3170p1 handlerC3170p1) {
        this.f23849a = handlerC3170p1;
    }

    @Override // com.inmobi.media.InterfaceC3138n1
    public final void a(P9 response, String locationOnDisk, C3072j asset) {
        Intrinsics.f(response, "response");
        Intrinsics.f(locationOnDisk, "locationOnDisk");
        Intrinsics.f(asset, "asset");
        C3233t1 c3233t1 = (C3233t1) this.f23849a.f23878a.get();
        AdConfig.AssetCacheConfig assetCacheConfig = c3233t1 != null ? C3233t1.f23992c : null;
        if (assetCacheConfig == null) {
            C3233t1 c3233t2 = C3233t1.f23990a;
            return;
        }
        C3233t1 c3233t3 = C3233t1.f23990a;
        AdConfig.AssetCacheConfig assetCacheConfig2 = assetCacheConfig;
        C3056i c3056iA = new C3056i().a(asset.f23703b, locationOnDisk, response, assetCacheConfig2.getMaxRetries(), assetCacheConfig2.getTimeToLive());
        int i2 = c3056iA.f23673a;
        String str = c3056iA.f23675c;
        if (str == null) {
            str = "";
        }
        C3072j c3072j = new C3072j(i2, str, c3056iA.d, c3056iA.f23674b, c3056iA.f23676e, c3056iA.f, c3056iA.g, c3056iA.f23677h);
        Nc.a().a(c3072j);
        c3072j.j = asset.j;
        c3072j.k = asset.k;
        c3233t1.a(c3072j, (byte) -1);
        HandlerC3170p1 handlerC3170p1 = this.f23849a;
        handlerC3170p1.getClass();
        try {
            handlerC3170p1.sendEmptyMessage(3);
        } catch (Exception unused) {
            C3233t1 c3233t4 = C3233t1.f23990a;
        }
    }

    @Override // com.inmobi.media.InterfaceC3138n1
    public final void a(C3072j asset) {
        Intrinsics.f(asset, "asset");
        C3233t1 c3233t1 = (C3233t1) this.f23849a.f23878a.get();
        if (c3233t1 != null) {
            C3233t1 c3233t2 = C3233t1.f23990a;
            C3233t1.k.remove(asset.f23703b);
            int i2 = asset.d;
            if (i2 > 0) {
                asset.d = i2 - 1;
                asset.f23705e = System.currentTimeMillis();
                Nc.a().a(asset);
                this.f23849a.a();
                return;
            }
            c3233t1.a(asset, asset.f23708l);
            HandlerC3170p1 handlerC3170p1 = this.f23849a;
            handlerC3170p1.getClass();
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = asset;
                handlerC3170p1.sendMessage(messageObtain);
                return;
            } catch (Exception unused) {
                C3233t1 c3233t3 = C3233t1.f23990a;
                return;
            }
        }
        C3233t1 c3233t4 = C3233t1.f23990a;
    }
}
