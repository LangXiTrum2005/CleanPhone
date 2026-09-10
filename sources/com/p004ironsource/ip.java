package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/ip;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "<init>", "(Ljava/lang/Exception;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ip extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(Exception e2) {
        super("Missing Headers", e2);
        Intrinsics.f(e2, "e");
    }
}
