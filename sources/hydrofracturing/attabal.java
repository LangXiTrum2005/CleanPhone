package hydrofracturing;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import lamplit.impromptu;
import utwa.beachfront;

/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AssetManager f28124wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu<String> f28120attabal = new impromptu<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<impromptu<String>, Typeface> f28123saneness = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, Typeface> f28121dern = new HashMap();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f28122marial = ".ttf";

    public attabal(Drawable.Callback callback, com.airbnb.lottie.attabal attabalVar) {
        if (callback instanceof View) {
            this.f28124wireman = ((View) callback).getContext().getAssets();
        } else {
            beachfront.dern("LottieDrawable must be inside of a view for images to work.");
            this.f28124wireman = null;
        }
    }

    public final Typeface attabal(lamplit.saneness sanenessVar) {
        String strAttabal = sanenessVar.attabal();
        Typeface typeface = this.f28121dern.get(strAttabal);
        if (typeface != null) {
            return typeface;
        }
        sanenessVar.dern();
        sanenessVar.saneness();
        if (sanenessVar.wireman() != null) {
            return sanenessVar.wireman();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f28124wireman, "fonts/" + strAttabal + this.f28122marial);
        this.f28121dern.put(strAttabal, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void dern(String str) {
        this.f28122marial = str;
    }

    public final Typeface marial(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface saneness(lamplit.saneness sanenessVar) {
        this.f28120attabal.saneness(sanenessVar.attabal(), sanenessVar.dern());
        Typeface typeface = this.f28123saneness.get(this.f28120attabal);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceMarial = marial(attabal(sanenessVar), sanenessVar.dern());
        this.f28123saneness.put(this.f28120attabal, typefaceMarial);
        return typefaceMarial;
    }

    public void wireman(com.airbnb.lottie.attabal attabalVar) {
    }
}
