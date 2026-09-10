package com.bykv.vk.openvk.preload.a.b.b;

import com.bykv.vk.openvk.preload.a.b.d;
import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f271a;

    static {
        f271a = d.a() < 9 ? new a() : new c();
    }

    public static b a() {
        return f271a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
