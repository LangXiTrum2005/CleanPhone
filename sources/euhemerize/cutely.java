package euhemerize;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f26102attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final inswinger.attabal f26103dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f26104marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Path.FillType f26105saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final inswinger.wireman f26106wireman;

    public cutely(String str, boolean z, Path.FillType fillType, inswinger.attabal attabalVar, inswinger.wireman wiremanVar, boolean z2) {
        this.name = str;
        this.f26102attabal = z;
        this.f26105saneness = fillType;
        this.f26103dern = attabalVar;
        this.f26106wireman = wiremanVar;
        this.f26104marial = z2;
    }

    @Override // euhemerize.dern
    public kinesic.dern attabal(LottieDrawable lottieDrawable, com.airbnb.lottie.impromptu impromptuVar, com.airbnb.lottie.model.layer.attabal attabalVar) {
        return new kinesic.competently(lottieDrawable, attabalVar, this);
    }

    public boolean beachfront() {
        return this.f26104marial;
    }

    public Path.FillType dern() {
        return this.f26105saneness;
    }

    public inswinger.wireman marial() {
        return this.f26106wireman;
    }

    public inswinger.attabal saneness() {
        return this.f26103dern;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f26102attabal + '}';
    }

    public String wireman() {
        return this.name;
    }
}
