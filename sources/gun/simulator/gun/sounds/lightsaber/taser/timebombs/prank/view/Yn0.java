package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Yn0 implements Vm0, Em0, Lm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4042a;
    public final int[] b;

    public Yn0(int i) {
        this.f4042a = i;
        if (i == 1) {
            this.b = new int[2];
        } else if (i != 2) {
            this.b = new int[2];
        } else {
            this.b = new int[2];
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vm0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Em0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lm0
    public final JSONObject a(View view) {
        int i = this.f4042a;
        int[] iArr = this.b;
        switch (i) {
            case 0:
                if (view == null) {
                    return En0.a(0, 0, 0, 0);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                return En0.a(iArr[0], iArr[1], width, height);
            case 1:
                if (view == null) {
                    return Gn0.a(0, 0, 0, 0);
                }
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                view.getLocationOnScreen(iArr);
                return Gn0.a(iArr[0], iArr[1], width2, height2);
            default:
                if (view == null) {
                    return In0.a(0, 0, 0, 0);
                }
                int width3 = view.getWidth();
                int height3 = view.getHeight();
                view.getLocationOnScreen(iArr);
                return In0.a(iArr[0], iArr[1], width3, height3);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lm0
    public final void f(View view, JSONObject jSONObject, Bm0 bm0, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z) {
                while (i < viewGroup.getChildCount()) {
                    ((C3008ae0) bm0).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
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
                    ((C3008ae0) bm0).a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Em0
    public final void i(View view, JSONObject jSONObject, Am0 am0, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z) {
                while (i < viewGroup.getChildCount()) {
                    ((Zd0) am0).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
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
                    ((Zd0) am0).a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vm0
    public final void l(View view, JSONObject jSONObject, Dm0 dm0, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z) {
                while (i < viewGroup.getChildCount()) {
                    ((C3097be0) dm0).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
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
                    ((C3097be0) dm0).a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }
}
