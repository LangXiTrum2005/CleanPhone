package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
final class LikeStatusClient extends PlatformServiceClient {
    public String l0;

    @Override // com.facebook.internal.PlatformServiceClient
    public final void b(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.l0);
    }
}
