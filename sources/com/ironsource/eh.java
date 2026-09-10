package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f28552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f28553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f28554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f28555d = -1;

    public final void a(int i10, String controllerUrl) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        this.f28554c = i10;
        this.f28555d = i10;
        this.f28553b = true;
        this.f28552a = controllerUrl;
        IronLog.INTERNAL.verbose("Reset load state for attempt " + i10 + ", pending URL: " + controllerUrl);
    }

    public final String b() {
        if (this.f28555d != this.f28554c) {
            IronLog.INTERNAL.verbose("Ignoring stale onPageFinished callback from attempt " + this.f28555d + ", current attempt is " + this.f28554c);
            return null;
        }
        this.f28553b = false;
        if (this.f28552a == null) {
            return null;
        }
        IronLog.INTERNAL.verbose("BLANK_PAGE load completed for attempt " + this.f28554c + ", now loading controller");
        String str = this.f28552a;
        this.f28552a = null;
        return str;
    }

    public final boolean c() {
        return this.f28553b;
    }

    public final void a() {
        this.f28552a = null;
        this.f28553b = false;
        this.f28554c = 0;
        this.f28555d = -1;
    }
}
