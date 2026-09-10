package paddywack;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lpaddywack/apical;", "", "Lokhttp3/Protocol;", "protocol", "", "code", "", PglCryptUtils.KEY_MESSAGE, "<init>", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "attabal", "Lokhttp3/Protocol;", "saneness", "I", "dern", "Ljava/lang/String;", "wireman", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Protocol protocol;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: paddywack.apical$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: StatusLine.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lpaddywack/apical$attabal;", "", "<init>", "()V", "", "statusLine", "Lpaddywack/apical;", "attabal", "(Ljava/lang/String;)Lpaddywack/apical;", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final apical attabal(String statusLine) throws IOException {
            Protocol protocol;
            int i;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (dovishness.starveling(statusLine, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!dovishness.starveling(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new apical(protocol, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(Intrinsics.arytenoidectomy("Unexpected status line: ", statusLine));
            }
        }

        public Companion() {
        }
    }

    public apical(Protocol protocol, int i, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.protocol = protocol;
        this.code = i;
        this.message = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
