package splinterproof;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: compiled from: ViewStructureCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f38052attabal;

    /* JADX INFO: compiled from: ViewStructureCompat.java */
    public static class attabal {
        public static Bundle attabal(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void beachfront(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void competently(ViewStructure viewStructure, float f, int i, int i2, int i3) {
            viewStructure.setTextStyle(f, i, i2, i3);
        }

        public static void dern(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void marial(ViewStructure viewStructure, int i, String str, String str2, String str3) {
            viewStructure.setId(i, str, str2, str3);
        }

        public static void saneness(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void wireman(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }
    }

    public beachfront(ViewStructure viewStructure) {
        this.f38052attabal = viewStructure;
    }

    public static beachfront impromptu(ViewStructure viewStructure) {
        return new beachfront(viewStructure);
    }

    public Bundle attabal() {
        return attabal.attabal((ViewStructure) this.f38052attabal);
    }

    public void beachfront(CharSequence charSequence) {
        attabal.beachfront((ViewStructure) this.f38052attabal, charSequence);
    }

    public ViewStructure competently() {
        return (ViewStructure) this.f38052attabal;
    }

    public void dern(CharSequence charSequence) {
        attabal.dern((ViewStructure) this.f38052attabal, charSequence);
    }

    public void marial(int i, String str, String str2, String str3) {
        attabal.marial((ViewStructure) this.f38052attabal, i, str, str2, str3);
    }

    public void saneness(String str) {
        attabal.saneness((ViewStructure) this.f38052attabal, str);
    }

    public void wireman(int i, int i2, int i3, int i4, int i5, int i6) {
        attabal.wireman((ViewStructure) this.f38052attabal, i, i2, i3, i4, i5, i6);
    }
}
