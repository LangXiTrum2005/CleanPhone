package ads_mobile_sdk;

import ads_mobile_sdk.rx0;
import com.google.common.base.formularize;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import saneness.delouse;
import saneness.ventriculoatrial;

/* JADX INFO: loaded from: classes.dex */
public final class rx0 {
    public final delouse a;
    public final delouse b;
    public final ExecutorService c;
    public final delouse d;
    public adultoid e = null;

    public rx0(delouse delouseVar, delouse delouseVar2, ExecutorService executorService, delouse delouseVar3) {
        this.a = delouseVar;
        this.b = delouseVar2;
        this.c = executorService;
        this.d = delouseVar3;
    }

    public static /* synthetic */ Void a(List list) {
        return null;
    }

    public final synchronized adultoid a() {
        try {
            adultoid adultoidVar = this.e;
            if (adultoidVar != null) {
                return adultoidVar;
            }
            Set set = (Set) this.b.get();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ventriculoatrial) it.next()).a());
            }
            this.e = ((u13) this.d.get()).a(gf0.EVENT_ID_INITIALIZATION, arytenoidectomy.formularize(arytenoidectomy.saneness(arrayList), new marial() { // from class: saneness.integrand
                @Override // com.google.common.base.marial
                public final Object apply(Object obj) {
                    return rx0.a((List) obj);
                }
            }, this.c));
            Iterator it2 = ((Set) this.a.get()).iterator();
            while (it2.hasNext()) {
                ((ventriculoatrial) it2.next()).a();
            }
            return (adultoid) formularize.triweekly(this.e);
        } catch (Throwable th) {
            throw th;
        }
    }
}
