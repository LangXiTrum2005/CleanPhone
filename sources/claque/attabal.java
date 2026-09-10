package claque;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.media3.common.PlaybackException;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0015"}, d2 = {"Lclaque/attabal;", "", "<init>", "()V", "", "codename", "buildCodename", "", "attabal", "(Ljava/lang/String;Ljava/lang/String;)Z", "dern", "()Z", "wireman", "marial", "", "saneness", "I", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f15619attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final int S_EXTENSION_INT;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final int AD_SERVICES_EXTENSION_INT;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final int R_EXTENSION_INT;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final int T_EXTENSION_INT;

    /* JADX INFO: renamed from: claque.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lclaque/attabal$attabal;", "", "<init>", "()V", "", "extension", "attabal", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0141attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0141attabal f15624attabal = new C0141attabal();

        private C0141attabal() {
        }

        public final int attabal(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i >= 30 ? C0141attabal.f15624attabal.attabal(30) : 0;
        S_EXTENSION_INT = i >= 30 ? C0141attabal.f15624attabal.attabal(31) : 0;
        T_EXTENSION_INT = i >= 30 ? C0141attabal.f15624attabal.attabal(33) : 0;
        AD_SERVICES_EXTENSION_INT = i >= 30 ? C0141attabal.f15624attabal.attabal(PlaybackException.CUSTOM_ERROR_CODE_BASE) : 0;
    }

    private attabal() {
    }

    public static final boolean attabal(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.wireman("REL", buildCodename)) {
            return false;
        }
        Integer numSaneness = saneness(buildCodename);
        Integer numSaneness2 = saneness(codename);
        if (numSaneness != null && numSaneness2 != null) {
            return numSaneness.intValue() >= numSaneness2.intValue();
        }
        if (numSaneness != null || numSaneness2 != null) {
            return numSaneness != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @patroclinal.wireman
    public static final boolean dern() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return attabal("S", CODENAME);
    }

    @patroclinal.wireman
    public static final boolean marial() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return attabal("VanillaIceCream", CODENAME);
    }

    public static final Integer saneness(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Intrinsics.wireman(upperCase, "BAKLAVA") ? 0 : null;
    }

    @patroclinal.wireman
    public static final boolean wireman() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return attabal("UpsideDownCake", CODENAME);
    }
}
