package monroe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.preprohormone;
import java.util.List;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final arytenoidectomy f33586attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final preprohormone<String, Typeface> f33587saneness;

    /* JADX INFO: compiled from: TypefaceCompat.java */
    public static class attabal extends hardpan.competently.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public lightstruck.impromptu.marial f33588attabal;

        public attabal(lightstruck.impromptu.marial marialVar) {
            this.f33588attabal = marialVar;
        }

        @Override // hardpan.competently.dern
        public void attabal(int i) {
            lightstruck.impromptu.marial marialVar = this.f33588attabal;
            if (marialVar != null) {
                marialVar.beachfront(i);
            }
        }

        @Override // hardpan.competently.dern
        public void saneness(Typeface typeface) {
            lightstruck.impromptu.marial marialVar = this.f33588attabal;
            if (marialVar != null) {
                marialVar.competently(typeface);
            }
        }
    }

    static {
        ferrovanadium.attabal.attabal("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f33586attabal = new kowloon();
        } else if (i >= 28) {
            f33586attabal = new triweekly();
        } else if (i >= 26) {
            f33586attabal = new impassible();
        } else if (formularize.apical()) {
            f33586attabal = new formularize();
        } else {
            f33586attabal = new apical();
        }
        f33587saneness = new preprohormone<>(16);
        ferrovanadium.attabal.saneness();
    }

    public static Typeface attabal(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String beachfront(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + SignatureVisitor.SUPER + str + SignatureVisitor.SUPER + i2 + SignatureVisitor.SUPER + i + SignatureVisitor.SUPER + i3;
    }

    public static Typeface competently(Resources resources, int i, String str, int i2, int i3) {
        return f33587saneness.get(beachfront(resources, i, str, i2, i3));
    }

    public static Typeface dern(Context context, CancellationSignal cancellationSignal, List<hardpan.competently.saneness[]> list, int i) {
        ferrovanadium.attabal.attabal("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f33586attabal.dern(context, cancellationSignal, list, i);
        } finally {
            ferrovanadium.attabal.saneness();
        }
    }

    public static Typeface impromptu(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Typeface marial(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMarial = f33586attabal.marial(context, resources, i, str, i3);
        if (typefaceMarial != null) {
            f33587saneness.put(beachfront(resources, i, str, i2, i3), typefaceMarial);
        }
        return typefaceMarial;
    }

    public static Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        ferrovanadium.attabal.attabal("TypefaceCompat.createFromFontInfo");
        try {
            return f33586attabal.saneness(context, cancellationSignal, sanenessVarArr, i);
        } finally {
            ferrovanadium.attabal.saneness();
        }
    }

    public static Typeface wireman(Context context, lightstruck.marial.saneness sanenessVar, Resources resources, int i, String str, int i2, int i3, lightstruck.impromptu.marial marialVar, Handler handler, boolean z) {
        Typeface typefaceAttabal;
        if (sanenessVar instanceof lightstruck.marial.C0721marial) {
            lightstruck.marial.C0721marial c0721marial = (lightstruck.marial.C0721marial) sanenessVar;
            Typeface typefaceImpromptu = impromptu(c0721marial.wireman());
            if (typefaceImpromptu != null) {
                if (marialVar != null) {
                    marialVar.wireman(typefaceImpromptu, handler);
                }
                return typefaceImpromptu;
            }
            typefaceAttabal = hardpan.competently.dern(context, c0721marial.attabal() != null ? taiyuan.attabal(new Object[]{c0721marial.dern(), c0721marial.attabal()}) : taiyuan.attabal(new Object[]{c0721marial.dern()}), i3, !z ? marialVar != null : c0721marial.saneness() != 0, z ? c0721marial.marial() : -1, lightstruck.impromptu.marial.marial(handler), new attabal(marialVar));
        } else {
            typefaceAttabal = f33586attabal.attabal(context, (lightstruck.marial.dern) sanenessVar, resources, i3);
            if (marialVar != null) {
                if (typefaceAttabal != null) {
                    marialVar.wireman(typefaceAttabal, handler);
                } else {
                    marialVar.dern(-3, handler);
                }
            }
        }
        if (typefaceAttabal != null) {
            f33587saneness.put(beachfront(resources, i, str, i2, i3), typefaceAttabal);
        }
        return typefaceAttabal;
    }
}
