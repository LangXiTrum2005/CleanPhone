package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2975d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f23500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3169p0 f23501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Va f23502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2975d(Function0 function0, InterfaceC3169p0 interfaceC3169p0, Va va) {
        super(0);
        this.f23500a = (Lambda) function0;
        this.f23501b = interfaceC3169p0;
        this.f23502c = va;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            if (((Boolean) this.f23500a.invoke()).booleanValue()) {
                this.f23502c.a(this.f23501b.a());
            } else {
                this.f23502c.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e2) {
            this.f23502c.onError(e2);
        }
        return Unit.f43263a;
    }
}
