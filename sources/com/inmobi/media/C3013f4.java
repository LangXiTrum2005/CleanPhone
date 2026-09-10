package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3013f4 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3045h4 f23599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3013f4(C3045h4 c3045h4) {
        super(1);
        this.f23599a = c3045h4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject it = (JSONObject) obj;
        Intrinsics.f(it, "it");
        this.f23599a.f.invoke(it);
        return Unit.f43263a;
    }
}
