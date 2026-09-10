package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsu implements zzfsr {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzftb.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzftb.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfsr
    public final void zzb(View view, JSONObject jSONObject, zzfsq zzfsqVar, boolean z2, boolean z3) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z2) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzfsqVar.zza(viewGroup.getChildAt(i3), this, jSONObject, z3);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i5));
                int size2 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    i2 = i5 + 1;
                    if (i6 < size2) {
                        zzfsqVar.zza((View) arrayList3.get(i6), this, jSONObject, z3);
                        i6++;
                    }
                }
                i5 = i2;
            }
        }
    }
}
