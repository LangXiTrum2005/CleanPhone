package l6;

import android.content.Context;
import android.net.Uri;
import e6.i;
import k6.q;
import k6.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f45066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f45067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f45068d;

    public d(Context context, r rVar, r rVar2, Class cls) {
        this.f45065a = context.getApplicationContext();
        this.f45066b = rVar;
        this.f45067c = rVar2;
        this.f45068d = cls;
    }

    @Override // k6.r
    public final boolean a(Object obj) {
        return android.support.v4.media.session.a.y((Uri) obj);
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, i iVar) {
        Uri uri = (Uri) obj;
        return new q(new z6.d(uri), new c(this.f45065a, this.f45066b, this.f45067c, uri, i10, i11, iVar, this.f45068d));
    }
}
