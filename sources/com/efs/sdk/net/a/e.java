package com.efs.sdk.net.a;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2409Fc;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<InterfaceC2409Fc, f> f727a = new WeakHashMap<>();

    public static void a(InterfaceC2409Fc interfaceC2409Fc, f fVar) {
        f727a.put(interfaceC2409Fc, fVar);
    }

    public static void b(InterfaceC2409Fc interfaceC2409Fc) {
        f727a.remove(interfaceC2409Fc);
    }

    public static f a(InterfaceC2409Fc interfaceC2409Fc) {
        return f727a.get(interfaceC2409Fc);
    }
}
