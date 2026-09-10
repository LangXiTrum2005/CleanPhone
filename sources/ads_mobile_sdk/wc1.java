package ads_mobile_sdk;

import saneness.curium;
import saneness.utwa;

/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements curium {
    public final curium[] a;

    public wc1(curium... curiumVarArr) {
        this.a = curiumVarArr;
    }

    @Override // saneness.curium
    public final boolean a(Class cls) {
        for (curium curiumVar : this.a) {
            if (curiumVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // saneness.curium
    public final utwa b(Class cls) {
        for (curium curiumVar : this.a) {
            if (curiumVar.a(cls)) {
                return curiumVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }
}
