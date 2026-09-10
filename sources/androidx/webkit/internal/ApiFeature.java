package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f8566c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8568b;

    public static class LAZY_HOLDER {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashSet f8569a = new HashSet(Arrays.asList(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f8591a.a()));
    }

    public static class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    public static class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public ApiFeature(String str, String str2) {
        this.f8567a = str;
        this.f8568b = str2;
        f8566c.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String a() {
        return this.f8567a;
    }

    public abstract boolean b();

    public boolean c() {
        HashSet hashSet = LAZY_HOLDER.f8569a;
        String str = this.f8568b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean isSupported() {
        return b() || c();
    }
}
