package com.inmobi.media;

import kotlinx.coroutines.cutely;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Dg {
    public static final void a(Ag priority, Function1 block) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        int iOrdinal = priority.ordinal();
        if (iOrdinal == 0) {
            cutely.wireman(A9.d, null, null, new Bg(block, null), 3, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            cutely.wireman(A9.c, null, null, new Cg(block, null), 3, null);
        }
    }
}
