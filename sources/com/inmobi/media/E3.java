package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class E3 implements Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F3 f22794a;

    public E3(F3 f3) {
        this.f22794a = f3;
    }

    @Override // com.inmobi.media.Ba
    public final void a(Da result) {
        Intrinsics.f(result, "result");
        WeakReference weakReference = (WeakReference) this.f22794a.f22983b.get(result.f22779a.f24163h);
        La la = weakReference != null ? (La) weakReference.get() : null;
        if (Ga.a(result)) {
            this.f22794a.b(result, la);
        } else {
            this.f22794a.a(result, la);
        }
    }
}
