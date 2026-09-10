package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BuildCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4348a = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "", "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api30Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Api30Impl f4349a = new Api30Impl();

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        Api30Impl api30Impl = Api30Impl.f4349a;
        if (i2 >= 30) {
            api30Impl.a(30);
        }
        if (i2 >= 30) {
            api30Impl.a(31);
        }
        if (i2 >= 30) {
            api30Impl.a(33);
        }
        if (i2 >= 30) {
            api30Impl.a(1000000);
        }
    }

    public static final boolean a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        Intrinsics.f(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        Intrinsics.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return true;
        }
        if (i2 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.e(CODENAME, "CODENAME");
        return a("S");
    }

    public static final boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        if (i2 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.e(CODENAME, "CODENAME");
        return a("Tiramisu");
    }
}
