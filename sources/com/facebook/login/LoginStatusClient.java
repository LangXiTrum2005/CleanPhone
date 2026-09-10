package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

/* JADX INFO: loaded from: classes3.dex */
final class LoginStatusClient extends PlatformServiceClient {
    @Override // com.facebook.internal.PlatformServiceClient
    public final void b(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.LOGGER_REF", null);
        bundle.putString("com.facebook.platform.extra.GRAPH_API_VERSION", null);
        bundle.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", 0L);
    }
}
