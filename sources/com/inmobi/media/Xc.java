package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Xc extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xc f23349a = new Xc();

    public Xc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Zc.f23411a.getClass();
        C6 c6 = Zc.j;
        return Integer.valueOf(c6 != null ? c6.f22735a.getInt("cnt", 0) : 0);
    }
}
