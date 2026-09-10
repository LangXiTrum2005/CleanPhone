package com.blankj.utilcode.util;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
class KeyboardUtils$1 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1 || i == 3) {
            apical.dern();
        }
    }
}
