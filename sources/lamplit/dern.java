package lamplit;

import euhemerize.apical;
import java.util.List;

/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<apical> f32581attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f32582beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final double f32583dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f32584marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final char f32585saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final double f32586wireman;

    public dern(List<apical> list, char c, double d, double d2, String str, String str2) {
        this.f32581attabal = list;
        this.f32585saneness = c;
        this.f32583dern = d;
        this.f32586wireman = d2;
        this.f32584marial = str;
        this.f32582beachfront = str2;
    }

    public static int dern(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<apical> attabal() {
        return this.f32581attabal;
    }

    public int hashCode() {
        return dern(this.f32585saneness, this.f32582beachfront, this.f32584marial);
    }

    public double saneness() {
        return this.f32586wireman;
    }
}
