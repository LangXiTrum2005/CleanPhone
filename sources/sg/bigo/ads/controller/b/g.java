package sg.bigo.ads.controller.b;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f47924a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f47925b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f47926c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        n.a(parcel, this.f47924a);
        n.a(parcel, this.f47925b);
        parcel.writeInt(this.f47926c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47924a = n.b(parcel, true);
        this.f47924a = n.b(parcel, false);
        this.f47926c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.f47926c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{isNativeVideoClickable=");
        sb.append(this.f47924a);
        sb.append(", isNativeVideoClickable=");
        sb.append(this.f47924a);
        sb.append(", clickTriggerType=");
        return android.support.v4.media.a.p(sb, this.f47926c, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f47924a;
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.f47925b;
    }
}
