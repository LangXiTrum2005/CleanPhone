package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: FcmExecutors.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly {
    public static Executor attabal(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    public static ExecutorService beachfront() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService competently() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    public static ScheduledExecutorService dern() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    public static ExecutorService marial() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    public static Executor saneness() {
        return attabal("Firebase-Messaging-File-Io");
    }

    public static ExecutorService wireman() {
        return keynesianism.saneness.attabal().attabal(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
    }
}
