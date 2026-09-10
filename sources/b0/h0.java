package b0;

import android.app.Notification;
import android.os.Parcel;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f5128d;

    public h0(String str, int i10, String str2, Notification notification) {
        this.f5125a = str;
        this.f5126b = i10;
        this.f5127c = str2;
        this.f5128d = notification;
    }

    public final void a(d.c cVar) {
        String str = this.f5125a;
        int i10 = this.f5126b;
        String str2 = this.f5127c;
        Notification notification = this.f5128d;
        d.a aVar = (d.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d.c.f38609a9);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            aVar.f38607a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f5125a);
        sb2.append(", id:");
        sb2.append(this.f5126b);
        sb2.append(", tag:");
        return defpackage.e.q(this.f5127c, X3.j.f27836e, sb2);
    }
}
