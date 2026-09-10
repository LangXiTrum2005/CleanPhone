package gynocracy;

import android.text.TextUtils;
import bunt.dern;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.List;
import java.util.Locale;
import okhttp3.logging.HttpLoggingInterceptor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: YoloDecryptHttpLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lgynocracy/attabal;", "Lokhttp3/logging/HttpLoggingInterceptor$attabal;", "<init>", "()V", "", PglCryptUtils.KEY_MESSAGE, "", "attabal", "(Ljava/lang/String;)V", "initVector", "", "encrypted", "saneness", "(Ljava/lang/String;[B)Ljava/lang/String;", "Ljava/lang/String;", "iv", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuffer;", "sb", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class attabal implements HttpLoggingInterceptor.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public String iv = "";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public StringBuffer sb = new StringBuffer();

    @Override // okhttp3.logging.HttpLoggingInterceptor.attabal
    public void attabal(String message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        if (revolt.attabal.f36720attabal.impromptu() && !TextUtils.isEmpty(message)) {
            List listSplit$default = StringsKt.split$default(message, new String[]{": "}, false, 0, 6, null);
            Locale locale = Locale.ROOT;
            String lowerCase = message.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = "X-Yolo-Auth".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (StringsKt.overspeculate(lowerCase, lowerCase2, false, 2, null)) {
                this.iv = (String) listSplit$default.get(listSplit$default.size() - 1);
            }
            if (dern.f15186attabal.saneness(message)) {
                this.sb.setLength(0);
                this.sb.append("↓\n");
            }
            if (StringsKt.overspeculate(message, ": ", false, 2, null) || StringsKt.overspeculate(message, "-->", false, 2, null) || StringsKt.overspeculate(message, "<--", false, 2, null)) {
                str = message;
            } else {
                try {
                    String str2 = this.iv;
                    byte[] bytes = message.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    String strSaneness = saneness(str2, bytes);
                    this.sb.append(message);
                    if (this.sb.lastIndexOf("\n") != this.sb.length() - 1) {
                        this.sb.append("\n");
                    }
                    str = "decrypt->" + strSaneness;
                } catch (Throwable unused) {
                    str = message;
                }
            }
            StringBuffer stringBuffer = this.sb;
            stringBuffer.append(str);
            stringBuffer.append("\n");
            if (dern.f15186attabal.attabal(message)) {
                try {
                    StringBuffer stringBuffer2 = this.sb;
                    stringBuffer2.deleteCharAt(stringBuffer2.lastIndexOf("\n"));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.sb.toString();
            }
        }
    }

    public abstract String saneness(String initVector, byte[] encrypted);
}
