package com.p004ironsource;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0003\u0010\u0007R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\u000b\u0010\u0007R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010\"\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/xa;", "", "", "b", "Z", "c", "()Z", "(Z)V", "shouldUseAppSet", "shouldUseAdvertisingId", "d", "a", "shouldReuseAdvertisingId", "", "e", "I", "()I", "(I)V", "userAgentExpirationThresholdInHours", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa f27681a = new xa();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean shouldUseAppSet = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean shouldUseAdvertisingId = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static boolean shouldReuseAdvertisingId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static int userAgentExpirationThresholdInHours;

    private xa() {
    }

    public final void a(int i2) {
        userAgentExpirationThresholdInHours = i2;
    }

    public final void b(boolean z2) {
        shouldUseAdvertisingId = z2;
    }

    public final void c(boolean z2) {
        shouldUseAppSet = z2;
    }

    public final int d() {
        return userAgentExpirationThresholdInHours;
    }

    public final void a(boolean z2) {
        shouldReuseAdvertisingId = z2;
    }

    public final boolean b() {
        return shouldUseAdvertisingId;
    }

    public final boolean c() {
        return shouldUseAppSet;
    }

    public final boolean a() {
        return shouldReuseAdvertisingId;
    }
}
