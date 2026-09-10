package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bb extends j9.i {
    public static final /* synthetic */ int l = 0;

    static {
        Pair.create(new f1(11), Tasks.forResult(null));
    }

    public final Task d(String str) {
        com.google.android.gms.common.api.internal.m mVarB = com.google.android.gms.common.api.internal.m.b();
        mVarB.f11732d = new xd(str, 2);
        return c(0, mVarB.a());
    }
}
