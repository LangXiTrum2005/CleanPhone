package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3199qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f23941b = new LinkedHashMap();

    public C3199qe(byte b2) {
        this.f23940a = b2;
    }

    public final Object a(String key, Class classType) {
        Intrinsics.f(key, "key");
        Intrinsics.f(classType, "classType");
        Object obj = this.f23941b.get(key);
        if (classType.isInstance(obj)) {
            return classType.cast(obj);
        }
        return null;
    }
}
