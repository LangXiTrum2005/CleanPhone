package libya;

import android.os.Bundle;
import decarock.grimness;

/* JADX INFO: compiled from: RubySpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f32938dern = grimness.igbo(0);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final String f32939wireman = grimness.igbo(1);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f32940attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f32941saneness;

    public marial(String str, int i) {
        this.f32940attabal = str;
        this.f32941saneness = i;
    }

    public static marial attabal(Bundle bundle) {
        return new marial((String) decarock.attabal.marial(bundle.getString(f32938dern)), bundle.getInt(f32939wireman));
    }

    public Bundle saneness() {
        Bundle bundle = new Bundle();
        bundle.putString(f32938dern, this.f32940attabal);
        bundle.putInt(f32939wireman, this.f32941saneness);
        return bundle;
    }
}
