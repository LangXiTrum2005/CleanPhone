package ads_mobile_sdk;

import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.util.List;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.polliwog;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 extends w03 {
    public final o12 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf1(no0 cuiName, List tags, UUID rootTraceId, l13 traceMetaSet, int i, int i2, w03 w03Var, boolean z) {
        super(cuiName, traceMetaSet, rootTraceId, w03Var, System.currentTimeMillis(), z);
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.g = new o12(i2, traceMetaSet, cuiName, tags, rootTraceId, w03Var != null ? w03Var.c() : -1, i, f(), f() - polliwog.f37253attabal, polliwog.f37254saneness < 0 ? -1L : f() - polliwog.f37254saneness, z, null, null, null, BackupConstant.CLOSE_NOT_SHOW_CODE);
    }

    @Override // ads_mobile_sdk.w03
    public final w03 a(no0 cuiName, List tags, boolean z) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        o12 o12Var = this.g;
        return new rf1(cuiName, tags, o12Var.e, this.a, o12Var.g + 1, o12Var.a + 1, this, z);
    }

    @Override // ads_mobile_sdk.w03
    public final o12 e() {
        return this.g;
    }

    @Override // ads_mobile_sdk.w03
    public final void h() {
        o12 o12Var = this.g;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        o12Var.p = p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(jCurrentTimeMillis, durationUnit), p002kotlin.time.dern.graveside(this.c, durationUnit));
    }
}
