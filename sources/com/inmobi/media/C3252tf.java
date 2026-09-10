package com.inmobi.media;

import java.io.IOException;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.text.Charsets;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3252tf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Je b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3252tf(Je je, dern dernVar) {
        super(2, dernVar);
        this.b = je;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3252tf(this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3252tf(this.b, (dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C3271u9 c3271u9 = (C3271u9) He.c.getValue();
            Je je = this.b;
            this.a = 1;
            obj = c3271u9.a.a(je, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        Ne ne = (Ne) obj;
        if (!AbstractC2935gl.a(ne)) {
            throw new IOException();
        }
        IntRange intRange = Se.a;
        Intrinsics.checkNotNullParameter(ne, "<this>");
        return ne.d().string(Charsets.UTF_8);
    }
}
