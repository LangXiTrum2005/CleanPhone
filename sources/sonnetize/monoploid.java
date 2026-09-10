package sonnetize;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.codejoy.boom.clap.widget.ParkinsansFontText;

/* JADX INFO: compiled from: DialogFunctionCountDownBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class monoploid implements goonda.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final LinearLayout f37895attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ParkinsansFontText f37896dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ParkinsansFontText f37897saneness;

    public monoploid(LinearLayout linearLayout, ParkinsansFontText parkinsansFontText, ParkinsansFontText parkinsansFontText2) {
        this.f37895attabal = linearLayout;
        this.f37897saneness = parkinsansFontText;
        this.f37896dern = parkinsansFontText2;
    }

    public static monoploid attabal(View view) {
        int i = com.codejoy.boom.clap.impassible.tvCountDownSec;
        ParkinsansFontText parkinsansFontText = (ParkinsansFontText) goonda.saneness.attabal(view, i);
        if (parkinsansFontText != null) {
            i = com.codejoy.boom.clap.impassible.tvTip;
            ParkinsansFontText parkinsansFontText2 = (ParkinsansFontText) goonda.saneness.attabal(view, i);
            if (parkinsansFontText2 != null) {
                return new monoploid((LinearLayout) view, parkinsansFontText, parkinsansFontText2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static monoploid dern(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(com.codejoy.boom.clap.triweekly.dialog_function_count_down, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return attabal(viewInflate);
    }

    @Override // goonda.attabal
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f37895attabal;
    }
}
