package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hh extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ih b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ InputEvent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh(ih ihVar, Uri uri, InputEvent inputEvent, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = ihVar;
        this.c = uri;
        this.d = inputEvent;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new hh(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hh) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                MeasurementManager measurementManagerAttabal = MeasurementManager.INSTANCE.attabal(this.b.a);
                if (measurementManagerAttabal == null) {
                    return new on0(new IllegalStateException(), null, null, 6);
                }
                Uri uri = this.c;
                InputEvent inputEvent = this.d;
                this.a = 1;
                if (measurementManagerAttabal.dern(uri, inputEvent, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            return new tn0(Unit.f29295attabal);
        } catch (Exception e) {
            return new on0(e, null, null, 6);
        }
    }
}
