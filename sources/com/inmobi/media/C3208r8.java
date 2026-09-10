package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3208r8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3224s8 f23957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3208r8(C3224s8 c3224s8, String str) {
        super(0);
        this.f23956a = str;
        this.f23957b = c3224s8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3072j c3072jB = Nc.a().b(this.f23956a);
        if (c3072jB == null) {
            return null;
        }
        C3224s8 c3224s8 = this.f23957b;
        try {
            String str = c3072jB.f23704c;
            if (str != null) {
                return C3224s8.a(c3224s8, str);
            }
            return null;
        } catch (Exception e2) {
            Intrinsics.e(c3224s8.x, "access$getTAG$p(...)");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return null;
        }
    }
}
