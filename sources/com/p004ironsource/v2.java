package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/v2;", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adUnit", "Lcom/ironsource/ne$a;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f27452a = new v2();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27453a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27453a = iArr;
        }
    }

    private v2() {
    }

    @JvmStatic
    public static final ne.a a(IronSource.AD_UNIT adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        int i2 = a.f27453a[adUnit.ordinal()];
        if (i2 == 1) {
            return ne.a.REWARDED_VIDEO;
        }
        if (i2 == 2) {
            return ne.a.INTERSTITIAL;
        }
        if (i2 == 3) {
            return ne.a.BANNER;
        }
        if (i2 == 4) {
            return ne.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
