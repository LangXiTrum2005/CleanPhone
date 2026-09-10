package androidx.core.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f4247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f4248c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4249e;
    public final Bundle f;
    public final HashSet g;

    public static class Api20Impl {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        public static Bundle b(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static class Api26Impl {
        public static void a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.a(remoteInput), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static android.app.RemoteInput.Builder d(android.app.RemoteInput.Builder builder, String str, boolean z2) {
            return builder.setAllowDataType(str, z2);
        }
    }

    public static class Api28Impl {
        public static int a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        public static void b(Intent intent, int i2) {
            android.app.RemoteInput.setResultsSource(intent, i2);
        }
    }

    public static class Api29Impl {
        public static int a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static android.app.RemoteInput.Builder b(android.app.RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z2, int i2, Bundle bundle, HashSet hashSet) {
        this.f4246a = str;
        this.f4247b = charSequence;
        this.f4248c = charSequenceArr;
        this.d = z2;
        this.f4249e = i2;
        this.f = bundle;
        this.g = hashSet;
        if (i2 == 2 && !z2) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput a(RemoteInput remoteInput) {
        HashSet hashSet;
        android.app.RemoteInput.Builder builderAddExtras = new android.app.RemoteInput.Builder(remoteInput.f4246a).setLabel(remoteInput.f4247b).setChoices(remoteInput.f4248c).setAllowFreeFormInput(remoteInput.d).addExtras(remoteInput.f);
        if (Build.VERSION.SDK_INT >= 26 && (hashSet = remoteInput.g) != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Api26Impl.d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(builderAddExtras, remoteInput.f4249e);
        }
        return builderAddExtras.build();
    }
}
