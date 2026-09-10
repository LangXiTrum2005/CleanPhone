package saneness;

import ads_mobile_sdk.ff0;
import ads_mobile_sdk.kd1;
import ads_mobile_sdk.ld1;
import ads_mobile_sdk.m73;
import ads_mobile_sdk.x13;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class frailly extends ff0 implements anaphylactin {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frailly(kotlinx.coroutines.saran uiScope, Map listeners) {
        super(uiScope, listeners);
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.anaphylactin
    public final Object a(m73 m73Var, wretchedly.dern dernVar) {
        ld1 ld1Var;
        frailly fraillyVar;
        if (dernVar instanceof ld1) {
            ld1Var = (ld1) dernVar;
            int i = ld1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld1Var.d = i - Integer.MIN_VALUE;
            } else {
                ld1Var = new ld1(this, dernVar);
            }
        } else {
            ld1Var = new ld1(this, dernVar);
        }
        Object objAttabal = ld1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ld1Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objAttabal);
            ld1Var.a = this;
            ld1Var.d = 1;
            int iWidth = m73Var.d.width();
            int iHeight = m73Var.d.height();
            objAttabal = igo.attabal.attabal((m73Var.h && m73Var.g.height() == iHeight && m73Var.g.width() == iWidth) && (m73Var.j && m73Var.i.height() == iHeight && m73Var.i.width() == iWidth));
            if (objAttabal == objBeachfront) {
                return objBeachfront;
            }
            fraillyVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fraillyVar = ld1Var.a;
            p002kotlin.dern.saneness(objAttabal);
        }
        if (((Boolean) objAttabal).booleanValue()) {
            for (Map.Entry entry : fraillyVar.b.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                kotlinx.coroutines.saran saranVar = fraillyVar.a;
                kd1 block = new kd1("onMediaViewFullyVisible", str, value, null);
                EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(saranVar, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                kotlinx.coroutines.cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
            }
        }
        return Unit.f29295attabal;
    }
}
