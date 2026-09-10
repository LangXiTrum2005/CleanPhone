package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class U5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pc f23260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pc f23261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pc f23262c;
    public final Pc d;

    public U5(CrashConfig config) {
        Intrinsics.f(config, "config");
        this.f23260a = new Pc(config.getCrashConfig().getSamplingPercent());
        this.f23261b = new Pc(config.getCatchConfig().getSamplingPercent());
        this.f23262c = new Pc(config.getAnr().getWatchdog().getSamplingPercent());
        this.d = new Pc(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
