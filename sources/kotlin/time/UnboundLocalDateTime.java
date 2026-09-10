package kotlin.time;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class UnboundLocalDateTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44731c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44732e;
    public final int f;
    public final int g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public UnboundLocalDateTime(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f44729a = i2;
        this.f44730b = i3;
        this.f44731c = i4;
        this.d = i5;
        this.f44732e = i6;
        this.f = i7;
        this.g = i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnboundLocalDateTime(");
        sb.append(this.f44729a);
        sb.append('-');
        sb.append(this.f44730b);
        sb.append('-');
        sb.append(this.f44731c);
        sb.append(' ');
        sb.append(this.d);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.f44732e);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(this.f);
        sb.append('.');
        return a.p(sb, this.g, ')');
    }
}
