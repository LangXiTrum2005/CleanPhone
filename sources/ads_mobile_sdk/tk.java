package ads_mobile_sdk;

import com.google.gson.JsonElement;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tk extends Lambda implements Function1 {
    public static final tk a = new tk();

    public tk() {
        super(1);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonElement it = (JsonElement) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return p002kotlin.time.saneness.cutely(p002kotlin.time.dern.molybdenite(it.getAsInt(), DurationUnit.MILLISECONDS));
    }
}
