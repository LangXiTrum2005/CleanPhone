package paddywack;

import okhttp3.dovishness;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpaddywack/impromptu;", "Lokhttp3/stratoscope;", "", "contentTypeString", "", "contentLength", "Lduvetyn/beachfront;", "source", "<init>", "(Ljava/lang/String;JLduvetyn/beachfront;)V", "()J", "Lokhttp3/dovishness;", "contentType", "()Lokhttp3/dovishness;", "()Lduvetyn/beachfront;", "kowloon", "Ljava/lang/String;", "arytenoidectomy", "J", "monoploid", "Lduvetyn/beachfront;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class impromptu extends stratoscope {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final long contentLength;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final String contentTypeString;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final duvetyn.beachfront source;

    public impromptu(String str, long j, duvetyn.beachfront source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = source;
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: contentType */
    public dovishness getF34696kowloon() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return dovishness.INSTANCE.saneness(str);
    }

    @Override // okhttp3.stratoscope
    /* JADX INFO: renamed from: source, reason: from getter */
    public duvetyn.beachfront getSource() {
        return this.source;
    }
}
