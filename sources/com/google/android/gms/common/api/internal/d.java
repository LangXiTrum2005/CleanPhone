package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.u6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u6 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", l1.d.k(new StringBuilder(String.valueOf(i10).length() + 34), "Don't know how to handle message: ", i10), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).H(Status.f11652h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        j9.o oVar = (j9.o) pair.second;
        try {
            throw null;
        } catch (RuntimeException e10) {
            BasePendingResult.L(oVar);
            throw e10;
        }
    }
}
