package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeModule_UptimeClockFactory f16982a = new TimeModule_UptimeClockFactory();
    }

    public static TimeModule_UptimeClockFactory a() {
        return InstanceHolder.f16982a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new UptimeClock();
    }
}
