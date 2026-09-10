package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/bolts/AggregateException$Companion;", "", "", "serialVersionUID", "J", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream err) {
        Intrinsics.f(err, "err");
        super.printStackTrace(err);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter err) {
        Intrinsics.f(err, "err");
        super.printStackTrace(err);
        throw null;
    }
}
