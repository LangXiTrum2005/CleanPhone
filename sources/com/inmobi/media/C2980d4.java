package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2980d4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2980d4 f23510a = new C2980d4();

    public C2980d4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashMap linkedHashMap = O2.f23027a;
        return (AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
    }
}
