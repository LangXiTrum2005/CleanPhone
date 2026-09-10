package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
final class zzcdk extends ScheduledThreadPoolExecutor {
    public zzcdk(int i2, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
