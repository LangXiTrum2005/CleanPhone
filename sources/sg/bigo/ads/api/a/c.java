package sg.bigo.ads.api.a;

import android.os.Parcel;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f46975a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sg.bigo.ads.common.f.a<c> f46976b = new sg.bigo.ads.common.f.a<c>() { // from class: sg.bigo.ads.api.a.c.1
        @Override // sg.bigo.ads.common.f.a
        public final /* synthetic */ sg.bigo.ads.common.f a() {
            return new c((byte) 0);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46977c;

    private c() {
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f46977c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f46977c = parcel.readString();
    }

    public final String toString() {
        return q.a(this.f46977c);
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public c(String str) {
        this.f46977c = str;
    }
}
