package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.ironsource.X3;
import java.io.File;
import java.io.FileOutputStream;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultPrivacyIconInjector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/downloader/dern;", "", "<init>", "()V", "Ljava/io/File;", X3.i.b, "", "writePrivacyFileFromString", "(Ljava/io/File;)Z", "dir", "injectPrivacyIcon", "(Ljava/io/File;)Ljava/io/File;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class dern {
    public static final dern INSTANCE = new dern();

    private dern() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArrDecode = Base64.decode(com.vungle.ads.internal.saneness.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(fileOutputStream, null);
                objM3351constructorimpl = Result.m3351constructorimpl(Boolean.TRUE);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th3));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = bool;
        }
        return ((Boolean) objM3351constructorimpl).booleanValue();
    }

    public final File injectPrivacyIcon(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(dir, com.vungle.ads.internal.saneness.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
