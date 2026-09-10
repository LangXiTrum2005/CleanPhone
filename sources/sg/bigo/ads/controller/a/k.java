package sg.bigo.ads.controller.a;

import android.os.Parcel;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public class k implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f47872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47874c;

    public k() {
    }

    @Override // sg.bigo.ads.common.f
    public void a(Parcel parcel) {
        parcel.writeString(this.f47874c);
        parcel.writeString(this.f47872a);
        n.a(parcel, this.f47873b);
    }

    @Override // sg.bigo.ads.common.f
    public void b(Parcel parcel) {
        this.f47874c = n.a(parcel, "");
        this.f47872a = n.a(parcel, "");
        this.f47873b = n.b(parcel, false);
    }

    public String toString() {
        return super.toString();
    }

    public k(String str, String str2, boolean z2) {
        this.f47874c = str;
        this.f47872a = str2;
        this.f47873b = z2;
    }
}
