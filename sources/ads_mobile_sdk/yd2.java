package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.monroe;
import p002kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yd2 implements kotlinx.coroutines.flow.wireman {
    public final /* synthetic */ monroe a;

    public yd2(monroe monroeVar) {
        this.a = monroeVar;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, wretchedly.dern dernVar) {
        this.a.attabal(new va2(new CancellationException("Ad request cancelled by publisher action.")));
        return Unit.f29295attabal;
    }
}
