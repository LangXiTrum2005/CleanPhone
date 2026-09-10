package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: compiled from: BadgeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {
    public static void attabal(attabal attabalVar, View view) {
        saneness(attabalVar, view, null);
    }

    public static void beachfront(attabal attabalVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        attabalVar.setBounds(rect);
        attabalVar.starveling(view, frameLayout);
    }

    public static void competently(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    public static SparseArray<attabal> dern(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<attabal> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            sparseArray.put(iKeyAt, state != null ? attabal.beachfront(context, state) : null);
        }
        return sparseArray;
    }

    public static void marial(attabal attabalVar, View view) {
        if (attabalVar == null) {
            return;
        }
        if (attabalVar.apical() != null) {
            attabalVar.apical().setForeground(null);
        } else {
            view.getOverlay().remove(attabalVar);
        }
    }

    public static void saneness(attabal attabalVar, View view, FrameLayout frameLayout) {
        beachfront(attabalVar, view, frameLayout);
        if (attabalVar.apical() != null) {
            attabalVar.apical().setForeground(attabalVar);
        } else {
            view.getOverlay().add(attabalVar);
        }
    }

    public static ParcelableSparseArray wireman(SparseArray<attabal> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            attabal attabalVarValueAt = sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, attabalVarValueAt != null ? attabalVarValueAt.adultoid() : null);
        }
        return parcelableSparseArray;
    }
}
