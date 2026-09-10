package com.inmobi.media;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2930a5 implements Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2947b5 f23429a;

    public C2930a5(C2947b5 c2947b5) {
        this.f23429a = c2947b5;
    }

    @Override // com.inmobi.media.Ba
    public final void a(Da result) {
        Intrinsics.f(result, "result");
        WeakReference weakReference = (WeakReference) this.f23429a.f22983b.get(result.f22779a.f24163h);
        La la = weakReference != null ? (La) weakReference.get() : null;
        if (Ga.a(result)) {
            this.f23429a.b(result, la);
        } else {
            this.f23429a.a(result, la);
        }
    }
}
