package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SchedulerConfig {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Clock f16921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f16922b;
    }

    public static abstract class ConfigValue {

        public static abstract class Builder {
        }

        public abstract long a();

        public abstract Set b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {
        public static final Flag X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Flag f16923Y;
        public static final Flag Z;
        public static final /* synthetic */ Flag[] e0;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            X = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            f16923Y = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            Z = flag3;
            e0 = new Flag[]{flag, flag2, flag3};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) e0.clone();
        }
    }

    public static SchedulerConfig b(Clock clock) {
        Builder builder = new Builder();
        builder.f16922b = new HashMap();
        Priority priority = Priority.X;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder2 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder2.f16917c = set;
        builder2.f16915a = Long.valueOf(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        builder2.f16916b = 86400000L;
        builder.f16922b.put(priority, builder2.a());
        Priority priority2 = Priority.Z;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder3 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder3.f16917c = set;
        builder3.f16915a = 1000L;
        builder3.f16916b = 86400000L;
        builder.f16922b.put(priority2, builder3.a());
        Priority priority3 = Priority.f16674Y;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder4 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.f16917c = set;
        builder4.f16915a = 86400000L;
        builder4.f16916b = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.f16923Y)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.f16917c = setUnmodifiableSet;
        builder.f16922b.put(priority3, builder4.a());
        builder.f16921a = clock;
        if (clock == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (builder.f16922b.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        HashMap map = builder.f16922b;
        builder.f16922b = new HashMap();
        return new AutoValue_SchedulerConfig(builder.f16921a, map);
    }

    public abstract Clock a();

    public final long c(Priority priority, long j, int i2) {
        long jA = j - a().a();
        ConfigValue configValue = (ConfigValue) d().get(priority);
        long jA2 = configValue.a();
        int i3 = i2 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * ((long) i3)))), jA), configValue.c());
    }

    public abstract Map d();
}
