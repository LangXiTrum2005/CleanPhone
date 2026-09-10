package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1673Yi {
    void AAu(Intent intent, Bundle bundle, C1493Re c1493Re);

    void AFA(boolean z);

    void AFi(boolean z);

    void AIv(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i, int i2, Intent intent);

    void onDestroy();
}
