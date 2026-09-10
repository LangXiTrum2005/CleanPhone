package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1842Yi {
    void AAu(Intent intent, Bundle bundle, C1662Re c1662Re);

    void AFA(boolean z2);

    void AFi(boolean z2);

    void AIv(Bundle bundle);

    String getCurrentClientToken();

    boolean onActivityResult(int i2, int i3, Intent intent);

    void onDestroy();
}
