package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3152o extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3136n f23841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3152o(Context context, C3136n c3136n) {
        super(0);
        this.f23840a = context;
        this.f23841b = c3136n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f23840a.unregisterReceiver(this.f23841b);
        return Unit.f43263a;
    }
}
