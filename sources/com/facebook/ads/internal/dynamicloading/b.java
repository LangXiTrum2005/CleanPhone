package com.facebook.ads.internal.dynamicloading;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2501Iq;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f748a;
    public final C2501Iq b = new C2501Iq(this);

    public final Object a(Class cls) {
        return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
    }
}
