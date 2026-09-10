package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class U6 extends Dc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(Constructor<List<Object>> constructor, Class<Object> valueClass) {
        super(constructor);
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(valueClass, "valueClass");
        this.f23263b = valueClass;
    }

    public final List<Object> b() {
        return (List) a().construct();
    }

    public final Class<Object> c() {
        return this.f23263b;
    }
}
