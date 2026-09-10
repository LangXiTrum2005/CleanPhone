package com.unity3d.ads.core.domain.attribution;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/adservices/measurement/MeasurementManager;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAttribution$measurementManager$2 extends o implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ AndroidAttribution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAttribution$measurementManager$2(AndroidAttribution androidAttribution, Context context) {
        super(0);
        this.this$0 = androidAttribution;
        this.$context = context;
    }

    @Override // jk.a
    public final MeasurementManager invoke() {
        return this.this$0.getMeasurementManager(this.$context);
    }
}
