package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: ActivityFoundPhoneBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConstraintLayout f38008attabal;

    public wireman(ConstraintLayout constraintLayout) {
        this.f38008attabal = constraintLayout;
    }

    public static wireman attabal(View view) {
        if (view != null) {
            return new wireman((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static wireman dern(LayoutInflater layoutInflater) {
        return wireman(layoutInflater, null, false);
    }

    public static wireman wireman(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.activity_found_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f38008attabal;
    }
}
