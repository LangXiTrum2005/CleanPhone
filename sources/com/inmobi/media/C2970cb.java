package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2970cb extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2970cb f23494a = new C2970cb();

    public C2970cb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2;
        try {
            Class.forName("com.android.billingclient.api.BillingClient");
            z2 = true;
        } catch (ClassNotFoundException | Exception unused) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
