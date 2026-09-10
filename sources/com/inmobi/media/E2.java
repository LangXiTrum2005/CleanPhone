package com.inmobi.media;

import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class E2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Ta f22793a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(Runnable runnable, Ta priority) {
        super(runnable, null);
        Intrinsics.f(priority, "priority");
        this.f22793a = priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        E2 other = (E2) obj;
        Intrinsics.f(other, "other");
        return Intrinsics.h(this.f22793a.f23234a, other.f22793a.f23234a);
    }
}
