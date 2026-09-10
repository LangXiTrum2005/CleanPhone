package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f22855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H7 f22856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22857c;

    public H3(Context context, CrashConfig crashConfig, H7 eventBus) {
        H3 h3;
        Intrinsics.f(context, "context");
        Intrinsics.f(crashConfig, "crashConfig");
        Intrinsics.f(eventBus, "eventBus");
        this.f22855a = crashConfig;
        this.f22856b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.e(listSynchronizedList, "synchronizedList(...)");
        this.f22857c = listSynchronizedList;
        if (this.f22855a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new C3108l3(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f22855a.getAnr().getAppExitReason().getEnabled() && L3.f22938a.z()) {
            h3 = this;
            listSynchronizedList.add(new C2960c1(context, h3, this.f22855a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.f22855a.getAnr().getAppExitReason().getMaxNumberOfLines()));
        } else {
            h3 = this;
        }
        if (h3.f22855a.getAnr().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C2941b(h3.f22855a.getAnr().getWatchdog().getInterval(), this));
        }
    }

    public final void a(T5 incidentEvent) {
        int i2;
        Intrinsics.f(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C2977d1) && this.f22855a.getAnr().getAppExitReason().getEnabled()) {
            i2 = 152;
        } else if ((incidentEvent instanceof C3124m3) && this.f22855a.getCrashConfig().getEnabled()) {
            i2 = 150;
        } else if (!(incidentEvent instanceof mf) || !this.f22855a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i2 = 151;
        }
        this.f22856b.b(new C2978d2(i2, incidentEvent.f23247a, MapsKt.i(new Pair("data", incidentEvent))));
    }
}
