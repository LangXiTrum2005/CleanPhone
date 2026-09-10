package hardpan;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import monroe.taiyuan;
import technofreak.cutely;

/* JADX INFO: compiled from: FontsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class dern {
        public void attabal(int i) {
            throw null;
        }

        public void saneness(Typeface typeface) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f27509attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f27510dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f27511marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f27512saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final boolean f27513wireman;

        @Deprecated
        public saneness(Uri uri, int i, int i2, boolean z, int i3) {
            this.f27509attabal = (Uri) cutely.competently(uri);
            this.f27512saneness = i;
            this.f27510dern = i2;
            this.f27513wireman = z;
            this.f27511marial = i3;
        }

        public static saneness attabal(Uri uri, int i, int i2, boolean z, int i3) {
            return new saneness(uri, i, i2, z, i3);
        }

        public boolean beachfront() {
            return this.f27513wireman;
        }

        public int dern() {
            return this.f27512saneness;
        }

        public int marial() {
            return this.f27510dern;
        }

        public int saneness() {
            return this.f27511marial;
        }

        public Uri wireman() {
            return this.f27509attabal;
        }
    }

    public static Typeface attabal(Context context, CancellationSignal cancellationSignal, saneness[] sanenessVarArr) {
        return monroe.cutely.saneness(context, cancellationSignal, sanenessVarArr, 0);
    }

    public static Typeface dern(Context context, List<marial> list, int i, boolean z, int i2, Handler handler, dern dernVar) {
        hardpan.attabal attabalVar = new hardpan.attabal(dernVar, impromptu.saneness(handler));
        if (!z) {
            return beachfront.wireman(context, list, i, null, attabalVar);
        }
        if (list.size() <= 1) {
            return beachfront.marial(context, list.get(0), attabalVar, i, i2);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static attabal saneness(Context context, CancellationSignal cancellationSignal, marial marialVar) throws PackageManager.NameNotFoundException {
        return wireman.marial(context, taiyuan.attabal(new Object[]{marialVar}), cancellationSignal);
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f27507attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<saneness[]> f27508saneness;

        @Deprecated
        public attabal(int i, saneness[] sanenessVarArr) {
            this.f27507attabal = i;
            this.f27508saneness = Collections.singletonList(sanenessVarArr);
        }

        public static attabal attabal(int i, List<saneness[]> list) {
            return new attabal(i, list);
        }

        public static attabal saneness(int i, saneness[] sanenessVarArr) {
            return new attabal(i, sanenessVarArr);
        }

        public boolean beachfront() {
            return this.f27508saneness.size() > 1;
        }

        public saneness[] dern() {
            return this.f27508saneness.get(0);
        }

        public int marial() {
            return this.f27507attabal;
        }

        public List<saneness[]> wireman() {
            return this.f27508saneness;
        }

        public attabal(int i, List<saneness[]> list) {
            this.f27507attabal = i;
            this.f27508saneness = list;
        }
    }
}
