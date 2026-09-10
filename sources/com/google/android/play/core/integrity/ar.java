package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
final class ar extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1 || i == 2 || i == 3) {
            throw null;
        }
    }
}
