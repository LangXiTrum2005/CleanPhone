package yi;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import rb.c;
import wi.b;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f54401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54402b;

    public a(Context context, b bVar) {
        c cVar = new c(this, 21);
        this.f54402b = context;
        this.f54401a = bVar;
        bVar.f53212b = cVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i10 = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i10 = 2;
        }
        if (strArrSplit.length > i10 && strArrSplit[i10].length() >= 2 && strArrSplit[i10].length() <= 3) {
            builder.setRegion(strArrSplit[i10]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList<Locale> arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(locales.get(i10));
        }
        b bVar = this.f54401a;
        bVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : arrayList) {
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((p) bVar.f53211a).a("setLocale", arrayList2, null);
    }
}
