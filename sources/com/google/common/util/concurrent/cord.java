package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: OverflowAvoidingLockSupport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord {
    public static void attabal(@CheckForNull Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
