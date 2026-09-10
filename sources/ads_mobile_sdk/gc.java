package ads_mobile_sdk;

import androidx.datastore.core.competently;
import kotlinx.coroutines.flow.marial;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.delouse;

/* JADX INFO: loaded from: classes.dex */
public final class gc {
    public final delouse a;

    public gc(delouse dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wretchedly.dern dernVar) {
        fc fcVar;
        if (dernVar instanceof fc) {
            fcVar = (fc) dernVar;
            int i = fcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcVar.c = i - Integer.MIN_VALUE;
            } else {
                fcVar = new fc(this, dernVar);
            }
        } else {
            fcVar = new fc(this, dernVar);
        }
        Object objGraveside = fcVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fcVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objGraveside);
            kotlinx.coroutines.flow.dern data = ((competently) this.a.get()).getData();
            fcVar.c = 1;
            objGraveside = marial.graveside(data, fcVar);
            if (objGraveside == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objGraveside);
        }
        cc ccVar = (cc) objGraveside;
        if (ccVar != null) {
            return ccVar.p();
        }
        return null;
    }
}
