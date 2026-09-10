package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "attabal", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f32501attabal;

    static {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objM3351constructorimpl = Result.m3351constructorimpl(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = null;
        }
        Integer num = (Integer) objM3351constructorimpl;
        f32501attabal = num != null ? num.intValue() : 2097152;
    }
}
