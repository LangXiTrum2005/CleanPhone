package com.inmobi.media;

import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3252u4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3252u4 f24020a = new C3252u4();

    public C3252u4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Lazy lazy = AbstractC3268v4.f24047a;
        return Executors.newSingleThreadScheduledExecutor(new K5("v4"));
    }
}
