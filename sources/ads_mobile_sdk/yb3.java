package ads_mobile_sdk;

import java.util.Optional;
import saneness.anthropography;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb3 implements anthropography {
    public final /* synthetic */ long a;

    public /* synthetic */ yb3(long j) {
        this.a = j;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        try {
            ((uc3) obj).a.a(zc3.a(this.a));
            return Optional.empty();
        } catch (pc3 unused) {
            return Optional.of(y62.b);
        }
    }
}
