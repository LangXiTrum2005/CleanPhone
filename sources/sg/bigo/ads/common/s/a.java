package sg.bigo.ads.common.s;

import android.content.Context;
import android.os.Parcel;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f47434a = r.f47537c.a(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f47435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47436c;
    private double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f47437e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f47438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47439i;

    public a(Context context) {
        this(context, (byte) 0);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.f47437e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.f47438h);
        parcel.writeLong(this.f47439i);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.d = parcel.readDouble();
        this.f47437e = parcel.readDouble();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.f47438h = parcel.readString();
        this.f47439i = parcel.readLong();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{longitude=");
        sb.append(this.d);
        sb.append(", latitude=");
        sb.append(this.f47437e);
        sb.append(", countryCode='");
        sb.append(this.f);
        sb.append("', state='");
        sb.append(this.g);
        sb.append("', city='");
        sb.append(this.f47438h);
        sb.append("', updateTime='");
        return android.support.v4.media.a.j(this.f47439i, "'}", sb);
    }

    private a(Context context, byte b2) {
        this.f47436c = false;
        this.f47435b = context;
        this.f47439i = 0L;
    }

    public a(Context context, Parcel parcel) {
        this.f47436c = false;
        this.f47435b = context;
        b(parcel);
    }
}
