package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.p004ironsource.d9;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", d9.h.f24719b, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultPrivacyIconInjector {
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objA;
        try {
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                fileOutputStream.close();
                objA = Boolean.TRUE;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            objA = ResultKt.a(th3);
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof Result.Failure) {
            objA = obj;
        }
        return ((Boolean) objA).booleanValue();
    }

    public final File injectPrivacyIcon(File dir) {
        Intrinsics.f(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
