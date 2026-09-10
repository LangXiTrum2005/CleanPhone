package i7;

import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f42904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f42905b;

    public a(b bVar, String str) {
        this.f42905b = bVar;
        this.f42904a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0.a.b(this.f42905b.f42907b.getSystemService(i0.a.f())).setApplicationLocales(LocaleList.forLanguageTags(this.f42904a));
    }
}
