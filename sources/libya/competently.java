package libya;

import android.os.Bundle;
import decarock.grimness;

/* JADX INFO: compiled from: TextEmphasisSpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f32930attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f32931dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f32932saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f32929wireman = grimness.igbo(0);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f32928marial = grimness.igbo(1);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final String f32927beachfront = grimness.igbo(2);

    public competently(int i, int i2, int i3) {
        this.f32930attabal = i;
        this.f32932saneness = i2;
        this.f32931dern = i3;
    }

    public static competently attabal(Bundle bundle) {
        return new competently(bundle.getInt(f32929wireman), bundle.getInt(f32928marial), bundle.getInt(f32927beachfront));
    }

    public Bundle saneness() {
        Bundle bundle = new Bundle();
        bundle.putInt(f32929wireman, this.f32930attabal);
        bundle.putInt(f32928marial, this.f32932saneness);
        bundle.putInt(f32927beachfront, this.f32931dern);
        return bundle;
    }
}
