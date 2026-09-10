package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/monoploid;", "", "typeface", "Landroidx/compose/ui/text/font/impromptu;", "font", "Landroidx/compose/ui/text/font/graveside;", "requestedWeight", "Landroidx/compose/ui/text/font/arytenoidectomy;", "requestedStyle", "attabal", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/impromptu;Landroidx/compose/ui/text/font/graveside;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class polloi {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object attabal(int i, Object obj, impromptu impromptuVar, FontWeight fontWeight, int i2) {
        boolean z;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if (!monoploid.competently(i) || Intrinsics.wireman(impromptuVar.getWeight(), fontWeight)) {
            z = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (fontWeight.compareTo(marial.attabal(companion)) < 0 || impromptuVar.getWeight().compareTo(marial.attabal(companion)) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z3 = monoploid.beachfront(i) && !arytenoidectomy.marial(i2, impromptuVar.getStyle());
        if (!z3 && !z) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return polder.f7790attabal.attabal((Typeface) obj, z ? fontWeight.getWeight() : impromptuVar.getWeight().getWeight(), z3 ? arytenoidectomy.marial(i2, arytenoidectomy.INSTANCE.attabal()) : arytenoidectomy.marial(impromptuVar.getStyle(), arytenoidectomy.INSTANCE.attabal()));
        }
        if (z3 && arytenoidectomy.marial(i2, arytenoidectomy.INSTANCE.attabal())) {
            z2 = true;
        }
        return Typeface.create((Typeface) obj, marial.saneness(z, z2));
    }
}
