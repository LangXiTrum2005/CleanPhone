package ads_mobile_sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sc0 {
    public final jk0 a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final ActivityManager d;

    public sc0(Context context, jk0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = flags;
        this.b = new AtomicReference(dc0.TIER_UNKNOWN);
        this.c = new AtomicReference(ec0.PROCESSOR_TIER_UNKNOWN);
        this.d = (ActivityManager) context.getSystemService(ActivityManager.class);
    }

    public final void a() {
        long j;
        jk0 jk0Var = this.a;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:device_tier_manager:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:device_tier_manager:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            if (this.b.get() == dc0.TIER_UNKNOWN || this.c.get() == ec0.PROCESSOR_TIER_UNKNOWN) {
                if (Build.VERSION.SDK_INT >= 34) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    this.d.getMemoryInfo(memoryInfo);
                    j = memoryInfo.advertisedMem;
                } else {
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    this.d.getMemoryInfo(memoryInfo2);
                    j = memoryInfo2.totalMem;
                }
                long j2 = j;
                AtomicReference atomicReference = this.b;
                jk0 jk0Var2 = this.a;
                jk0Var2.getClass();
                List defaultValue = adultoid.kowloon(1, 2, 4, 6, 8, 12, 16);
                Intrinsics.checkNotNullParameter("gads:device_tier:advertised_memory_thresholds_gb", X3.i.W);
                Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                pk pkVar = zk.h;
                atomicReference.set((dc0) a(j2, (List) jk0Var2.a("gads:device_tier:advertised_memory_thresholds_gb", defaultValue, pkVar), adultoid.kowloon(1L, 2L, 4L, 6L, 8L, 12L, 16L), adultoid.kowloon(dc0.TIER_EXTREME_LOW, dc0.TIER_VERY_LOW, dc0.TIER_LOW, dc0.TIER_MID, dc0.TIER_MID_PLUS, dc0.TIER_HIGH, dc0.TIER_VERY_HIGH), dc0.TIER_INVALID_DATA_SOURCE, dc0.TIER_EXTREME_HIGH, 1073741824L));
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                AtomicReference atomicReference2 = this.c;
                long j3 = iAvailableProcessors;
                jk0 jk0Var3 = this.a;
                jk0Var3.getClass();
                List defaultValue2 = adultoid.kowloon(2, 4, 6, 8, 10);
                Intrinsics.checkNotNullParameter("gads:device_tier:available_processor_thresholds", X3.i.W);
                Intrinsics.checkNotNullParameter(defaultValue2, "defaultValue");
                atomicReference2.set((ec0) a(j3, (List) jk0Var3.a("gads:device_tier:available_processor_thresholds", defaultValue2, pkVar), adultoid.kowloon(2L, 4L, 6L, 8L, 10L), adultoid.kowloon(ec0.PROCESSOR_TIER_EXTREME_LOW, ec0.PROCESSOR_TIER_LOW, ec0.PROCESSOR_TIER_MID, ec0.PROCESSOR_TIER_MID_PLUS, ec0.PROCESSOR_TIER_HIGH), ec0.PROCESSOR_TIER_INVALID_DATA_SOURCE, ec0.PROCESSOR_TIER_EXTREME_HIGH, 1L));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static Object a(long j, List list, List list2, List list3, Enum r7, Enum r8, long j2) {
        if (j <= 0) {
            return r7;
        }
        if (!list.isEmpty()) {
            list2 = new ArrayList(dovishness.gintrap(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Long.valueOf(((Number) it.next()).intValue()));
            }
        }
        int size = list2.size();
        for (int i = 0; i < size && i < list3.size(); i++) {
            if (j <= ((Number) list2.get(i)).longValue() * j2) {
                return list3.get(i);
            }
        }
        return r8;
    }
}
