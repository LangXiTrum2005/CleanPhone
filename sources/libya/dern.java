package libya;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import decarock.grimness;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomSpanBundler.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f32933attabal = grimness.igbo(0);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f32936saneness = grimness.igbo(1);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f32934dern = grimness.igbo(2);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f32937wireman = grimness.igbo(3);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f32935marial = grimness.igbo(4);

    public static ArrayList<Bundle> attabal(Spanned spanned) {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        for (marial marialVar : (marial[]) spanned.getSpans(0, spanned.length(), marial.class)) {
            arrayList.add(saneness(spanned, marialVar, 1, marialVar.saneness()));
        }
        for (competently competentlyVar : (competently[]) spanned.getSpans(0, spanned.length(), competently.class)) {
            arrayList.add(saneness(spanned, competentlyVar, 2, competentlyVar.saneness()));
        }
        for (wireman wiremanVar : (wireman[]) spanned.getSpans(0, spanned.length(), wireman.class)) {
            arrayList.add(saneness(spanned, wiremanVar, 3, null));
        }
        return arrayList;
    }

    public static void dern(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(f32933attabal);
        int i2 = bundle.getInt(f32936saneness);
        int i3 = bundle.getInt(f32934dern);
        int i4 = bundle.getInt(f32937wireman, -1);
        Bundle bundle2 = bundle.getBundle(f32935marial);
        if (i4 == 1) {
            spannable.setSpan(marial.attabal((Bundle) decarock.attabal.marial(bundle2)), i, i2, i3);
        } else if (i4 == 2) {
            spannable.setSpan(competently.attabal((Bundle) decarock.attabal.marial(bundle2)), i, i2, i3);
        } else {
            if (i4 != 3) {
                return;
            }
            spannable.setSpan(new wireman(), i, i2, i3);
        }
    }

    public static Bundle saneness(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f32933attabal, spanned.getSpanStart(obj));
        bundle2.putInt(f32936saneness, spanned.getSpanEnd(obj));
        bundle2.putInt(f32934dern, spanned.getSpanFlags(obj));
        bundle2.putInt(f32937wireman, i);
        if (bundle != null) {
            bundle2.putBundle(f32935marial, bundle);
        }
        return bundle2;
    }
}
