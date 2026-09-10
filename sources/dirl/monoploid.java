package dirl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid {
    public static final List attabal(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            molybdenite molybdeniteVar = (molybdenite) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", molybdeniteVar.attabal());
            bundle.putLong("event_timestamp", molybdeniteVar.saneness());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void saneness(int i, List list) {
        list.add(molybdenite.dern(i, System.currentTimeMillis()));
    }
}
