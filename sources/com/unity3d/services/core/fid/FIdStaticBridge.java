package com.unity3d.services.core.fid;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/unity3d/services/core/fid/FIdStaticBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "()V", "getClassName", "", Constants.GET_INSTANCE, "Lcom/unity3d/services/core/fid/FIdBridge;", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FIdStaticBridge extends GenericBridge {
    public FIdStaticBridge() {
        super(b0.P(new f(Constants.GET_INSTANCE, new Class[]{Context.class})), false);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.INSTANCE.getClassName();
    }

    public final FIdBridge getInstance(Context context) {
        n.f(context, "context");
        Object objCallNonVoidMethod = callNonVoidMethod(Constants.GET_INSTANCE, null, context);
        if (objCallNonVoidMethod != null) {
            return new FIdBridge(objCallNonVoidMethod);
        }
        return null;
    }
}
