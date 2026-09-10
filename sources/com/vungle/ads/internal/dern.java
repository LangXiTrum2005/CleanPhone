package com.vungle.ads.internal;

import android.content.Context;
import com.ironsource.X3;
import com.vungle.ads.VungleAdSize;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FullscreenAdInternal.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/dern;", "Lcom/vungle/ads/internal/AdInternal;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/vungle/ads/trm;", X3.i.O, "", "isValidAdSize", "(Lcom/vungle/ads/trm;)Z", "getAdSizeForAdRequest", "()Lcom/vungle/ads/trm;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class dern extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize adSize) {
        return true;
    }
}
