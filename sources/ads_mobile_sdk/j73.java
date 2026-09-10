package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import saneness.repagination;
import saneness.vinificator;

/* JADX INFO: loaded from: classes.dex */
public final class j73 implements vinificator {
    public final int[] a = new int[2];

    @Override // saneness.vinificator
    public final JSONObject a(View view) {
        if (view == null) {
            return nw1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] iArr = this.a;
        return nw1.a(iArr[0], iArr[1], width, height);
    }

    @Override // saneness.vinificator
    public final void a(View view, JSONObject jSONObject, repagination repaginationVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (z) {
                HashMap map = new HashMap();
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i++;
                }
                ArrayList arrayList2 = new ArrayList(map.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((s23) repaginationVar).a((View) it2.next(), this, jSONObject, z2);
                    }
                }
                return;
            }
            while (i < viewGroup.getChildCount()) {
                ((s23) repaginationVar).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                i++;
            }
        }
    }
}
