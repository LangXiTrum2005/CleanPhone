package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;

/* JADX INFO: compiled from: InputOutputUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/util/impassible;", "", "<init>", "()V", "", "stringToConvert", "convertForSending", "(Ljava/lang/String;)Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class impassible {
    public static final impassible INSTANCE = new impassible();

    private impassible() {
    }

    public final String convertForSending(String stringToConvert) throws IOException {
        Intrinsics.checkNotNullParameter(stringToConvert, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(stringToConvert.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                byte[] bytes = stringToConvert.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                interaction.saneness.attabal(gZIPOutputStream, null);
                interaction.saneness.attabal(byteArrayOutputStream, null);
                return strEncodeToString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(gZIPOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                interaction.saneness.attabal(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
