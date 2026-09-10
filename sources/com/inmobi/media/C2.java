package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class C2 {
    public static final Object a(Function0 block) {
        Intrinsics.f(block, "block");
        try {
            return block.invoke();
        } catch (Error e2) {
            return ResultKt.a(e2);
        } catch (Exception e3) {
            return ResultKt.a(e3);
        }
    }
}
