package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K5 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22921b;

    public K5(String name, boolean z2) {
        Intrinsics.f(name, "name");
        this.f22920a = z2;
        this.f22921b = AbstractC3041h0.a("TIM-", name);
    }

    public final boolean a() {
        return this.f22920a;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        Intrinsics.f(r, "r");
        try {
            Thread thread = new Thread(r, this.f22921b);
            thread.setDaemon(this.f22920a);
            return thread;
        } catch (InternalError e2) {
            e2.toString();
            return null;
        }
    }

    public /* synthetic */ K5(String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K5(String name) {
        this(name, false);
        Intrinsics.f(name, "name");
    }
}
