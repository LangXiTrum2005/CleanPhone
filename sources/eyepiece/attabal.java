package eyepiece;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.media3.common.PlaybackException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AdServicesInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Leyepiece/attabal;", "", "<init>", "()V", "", "attabal", "()I", "saneness", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f26255attabal = new attabal();

    /* JADX INFO: renamed from: eyepiece.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Leyepiece/attabal$attabal;", "", "<init>", "()V", "", "attabal", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0607attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0607attabal f26256attabal = new C0607attabal();

        public final int attabal() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: compiled from: AdServicesInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Leyepiece/attabal$saneness;", "", "<init>", "()V", "", "attabal", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f26257attabal = new saneness();

        public final int attabal() {
            return SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
    }

    public final int attabal() {
        if (Build.VERSION.SDK_INT >= 33) {
            return saneness.f26257attabal.attabal();
        }
        return 0;
    }

    public final int saneness() {
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            return C0607attabal.f26256attabal.attabal();
        }
        return 0;
    }
}
