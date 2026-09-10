package earstone;

import android.view.View;

/* JADX INFO: compiled from: VisibilityPropagation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class hydrovane extends cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String[] f25525attabal = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int wireman(stratoscope stratoscopeVar, int i) {
        int[] iArr;
        if (stratoscopeVar == null || (iArr = (int[]) stratoscopeVar.f25561attabal.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // earstone.cord
    public void attabal(stratoscope stratoscopeVar) {
        View view = stratoscopeVar.f25563saneness;
        Integer numValueOf = (Integer) stratoscopeVar.f25561attabal.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        stratoscopeVar.f25561attabal.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        stratoscopeVar.f25561attabal.put("android:visibilityPropagation:center", iArr);
    }

    public int beachfront(stratoscope stratoscopeVar) {
        return wireman(stratoscopeVar, 0);
    }

    public int competently(stratoscope stratoscopeVar) {
        return wireman(stratoscopeVar, 1);
    }

    public int marial(stratoscope stratoscopeVar) {
        Integer num;
        if (stratoscopeVar == null || (num = (Integer) stratoscopeVar.f25561attabal.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    @Override // earstone.cord
    public String[] saneness() {
        return f25525attabal;
    }
}
