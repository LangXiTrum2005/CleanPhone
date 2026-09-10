package premeiotic;

import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.collections.dovishness;
import permissivist.LocaleList;
import permissivist.wireman;

/* JADX INFO: compiled from: LocaleExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpremeiotic/attabal;", "", "<init>", "()V", "Lpermissivist/marial;", "localeList", "attabal", "(Lpermissivist/marial;)Ljava/lang/Object;", "Lcultivated/saneness;", "textPaint", "", "saneness", "(Lcultivated/saneness;Lpermissivist/marial;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f35643attabal = new attabal();

    public final Object attabal(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(dovishness.gintrap(localeList, 10));
        Iterator<wireman> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void saneness(cultivated.saneness textPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(dovishness.gintrap(localeList, 10));
        Iterator<wireman> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        throw null;
    }
}
