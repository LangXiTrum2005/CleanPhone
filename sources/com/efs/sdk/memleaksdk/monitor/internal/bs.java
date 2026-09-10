package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, String> f623a;

    public final String a(String str) {
        AbstractC2995aW.q(str, "obfuscatedClassName");
        String str2 = this.f623a.get(str);
        return str2 != null ? str2 : str;
    }

    public final String a(String str, String str2) {
        AbstractC2995aW.q(str, "obfuscatedClass");
        AbstractC2995aW.q(str2, "obfuscatedField");
        String str3 = this.f623a.get(str + '.' + str2);
        return str3 != null ? str3 : str2;
    }
}
