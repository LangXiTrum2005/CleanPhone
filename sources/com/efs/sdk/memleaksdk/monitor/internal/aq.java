package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f551a = new LinkedHashMap();

    public final <T> T a(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(interfaceC2714Qw, "defaultValue");
        Map<String, Object> map = this.f551a;
        T t = (T) map.get(str);
        if (t != null) {
            return t;
        }
        T t2 = (T) interfaceC2714Qw.invoke();
        map.put(str, t2);
        return t2;
    }
}
