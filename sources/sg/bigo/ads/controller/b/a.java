package sg.bigo.ads.controller.b;

import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
final class a implements sg.bigo.ads.api.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f47875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f47876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f47877c;
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f47878e;
    String f;
    String g;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeLong(this.f47875a);
        parcel.writeString(this.f47876b);
        parcel.writeString(this.f47877c);
        parcel.writeString(this.d);
        parcel.writeString(this.f47878e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47875a = parcel.readLong();
        this.f47876b = parcel.readString();
        this.f47877c = parcel.readString();
        this.d = parcel.readString();
        this.f47878e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{expressId=");
        sb.append(this.f47875a);
        sb.append(", name='");
        sb.append(this.f47876b);
        sb.append("', url='");
        sb.append(this.f47877c);
        sb.append("', md5='");
        sb.append(this.d);
        sb.append("', style='");
        sb.append(this.f47878e);
        sb.append("', adTypes='");
        sb.append(this.f);
        sb.append("', fileId='");
        return android.support.v4.media.a.r(sb, this.g, "'}");
    }
}
