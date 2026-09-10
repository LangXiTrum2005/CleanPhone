package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class H5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H5 f22859a = new H5();

    public H5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        return B6.a(contextD, "inmobi_store");
    }
}
