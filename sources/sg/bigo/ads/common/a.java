package sg.bigo.ads.common;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47087a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47089c;
    private long d;

    private a() {
        this.f47088b = "";
        this.f47089c = true;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeString(this.f47088b);
        parcel.writeInt(this.f47089c ? 1 : 0);
        parcel.writeLong(this.d);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47088b = parcel.readString();
        this.f47089c = parcel.readInt() != 0;
        this.d = parcel.readLong();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{advertisingId='");
        sb.append(this.f47088b);
        sb.append("', isLimitAdTrackingEnabled=");
        sb.append(this.f47089c);
        sb.append(", lastUpdateTime=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.d, AbstractJsonLexerKt.END_OBJ);
    }

    public a(Parcel parcel) {
        b(parcel);
    }

    public final boolean a() {
        return Math.abs(r.b() - this.d) > r.d.a(1);
    }

    public a(String str, boolean z2) {
        this.f47088b = str;
        this.f47089c = z2;
        this.d = r.b();
    }
}
