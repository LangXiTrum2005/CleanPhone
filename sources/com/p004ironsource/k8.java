package com.p004ironsource;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/k8;", "", "Lcom/ironsource/p8;", "cappingType", "", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class k8 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25518a;

        static {
            int[] iArr = new int[p8.values().length];
            try {
                iArr[p8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25518a = iArr;
        }
    }

    public final int a(p8 cappingType) {
        Intrinsics.f(cappingType, "cappingType");
        int i2 = a.f25518a[cappingType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 3000;
        }
        if (i2 == 3) {
            return 3001;
        }
        throw new NoWhenBranchMatchedException();
    }
}
