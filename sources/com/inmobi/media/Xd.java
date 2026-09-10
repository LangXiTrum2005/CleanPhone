package com.inmobi.media;

import android.os.Build;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TelemetryConfig f23350a;

    public Xd(TelemetryConfig telemetryConfig) {
        Intrinsics.f(telemetryConfig, "telemetryConfig");
        this.f23350a = telemetryConfig;
    }

    public final void a(C2977d1 c2977d1) {
        if (Build.VERSION.SDK_INT < 30 || c2977d1 == null || c2977d1.g != 6) {
            return;
        }
        a("ANREvent", c2977d1);
    }

    public final void a(String str, T5 t5) {
        if (this.f23350a.getPriorityEventsList().contains(str) && t5 != null && Ie.a(t5)) {
            Pd.b(str, new LinkedHashMap(), Td.SDK);
        }
    }
}
