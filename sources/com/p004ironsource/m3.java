package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\t\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/m3;", "Lcom/ironsource/n3;", "Lcom/ironsource/j3;", "eventBaseData", "Lcom/ironsource/o3;", "a", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "adFormat", "<init>", "(Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class m3 implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IronSource.AD_UNIT adFormat;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25673a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25673a = iArr;
        }
    }

    public m3(IronSource.AD_UNIT adFormat) {
        Intrinsics.f(adFormat, "adFormat");
        this.adFormat = adFormat;
    }

    @Override // com.p004ironsource.n3
    public o3 a(j3 eventBaseData) {
        Intrinsics.f(eventBaseData, "eventBaseData");
        int i2 = a.f25673a[this.adFormat.ordinal()];
        if (i2 == 1) {
            return new tj(eventBaseData);
        }
        if (i2 == 2) {
            return new as(eventBaseData);
        }
        if (i2 == 3) {
            return new r6(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.adFormat);
    }
}
