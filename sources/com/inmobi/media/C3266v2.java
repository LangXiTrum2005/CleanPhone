package com.inmobi.media;

import com.inmobi.commons.core.configs.RootConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3266v2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3266v2 f24042a = new C3266v2();

    public C3266v2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashMap linkedHashMap = O2.f23027a;
        return Boolean.valueOf(!((RootConfig) AbstractC3174p5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).getMonetizationDisabled());
    }
}
