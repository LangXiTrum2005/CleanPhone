package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Constructor f22782a;

    public Dc(Constructor constructor) {
        Intrinsics.f(constructor, "constructor");
        this.f22782a = constructor;
    }

    public final Constructor<Object> a() {
        return this.f22782a;
    }

    public final void a(Constructor<Object> constructor) {
        Intrinsics.f(constructor, "<set-?>");
        this.f22782a = constructor;
    }
}
