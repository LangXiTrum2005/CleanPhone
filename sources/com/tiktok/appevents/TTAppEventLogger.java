package com.tiktok.appevents;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public class TTAppEventLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f42663a = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f42664b = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());

    /* JADX INFO: renamed from: com.tiktok.appevents.TTAppEventLogger$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.TTAppEventLogger$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tiktok.appevents.TTAppEventLogger$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FlushReason {
        public static final /* synthetic */ FlushReason[] X = {new FlushReason("THRESHOLD", 0), new FlushReason("TIMER", 1), new FlushReason("START_UP", 2), new FlushReason("FORCE_FLUSH", 3), new FlushReason("IDENTIFY", 4), new FlushReason("LOGOUT", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        FlushReason EF5;

        public static FlushReason valueOf(String str) {
            return (FlushReason) Enum.valueOf(FlushReason.class, str);
        }

        public static FlushReason[] values() {
            return (FlushReason[]) X.clone();
        }
    }
}
