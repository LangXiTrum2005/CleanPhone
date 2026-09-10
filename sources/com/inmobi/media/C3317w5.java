package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import patroclinal.taiyuan;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3317w5 extends SuspendLambda implements Function2 {
    public C3317w5(dern dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        return new C3317w5(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3317w5((dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        try {
            Context context = Ji.a;
            if (context == null) {
                return Unit.f29295attabal;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null) {
                return Unit.f29295attabal;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            C3342x5 c3342x5 = C3342x5.a;
            C3342x5.m = memoryInfo.lowMemory;
            return Unit.f29295attabal;
        } catch (Exception e) {
            C3342x5 c3342x6 = C3342x5.a;
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e);
        }
    }
}
