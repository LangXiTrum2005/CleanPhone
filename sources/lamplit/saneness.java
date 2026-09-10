package lamplit;

import android.graphics.Typeface;

/* JADX INFO: compiled from: Font.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f32589attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float f32590dern;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f32591saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public Typeface f32592wireman;

    public saneness(String str, String str2, String str3, float f) {
        this.f32589attabal = str;
        this.name = str2;
        this.f32591saneness = str3;
        this.f32590dern = f;
    }

    public String attabal() {
        return this.f32589attabal;
    }

    public String dern() {
        return this.f32591saneness;
    }

    public void marial(Typeface typeface) {
        this.f32592wireman = typeface;
    }

    public String saneness() {
        return this.name;
    }

    public Typeface wireman() {
        return this.f32592wireman;
    }
}
