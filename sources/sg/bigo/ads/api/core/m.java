package sg.bigo.ads.api.core;

import android.os.Parcel;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements sg.bigo.ads.api.a.j, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47053a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeLong(this.f47053a);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47053a = parcel.readLong();
    }

    public final String toString() {
        return androidx.media3.extractor.text.ttml.a.o(new StringBuilder("{value="), this.f47053a, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // sg.bigo.ads.api.a.j
    public final boolean a(int i2) {
        return (this.f47053a & (1 << i2)) != 0;
    }
}
