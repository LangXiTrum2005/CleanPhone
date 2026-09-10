package tau;

import android.content.Context;
import android.content.SharedPreferences;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LangCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Ltau/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "languageCode", "", "saneness", "(Landroid/content/Context;Ljava/lang/String;)V", "attabal", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sp", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f38663attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f38664dern = 8;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static SharedPreferences sp;

    public final String attabal(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("app_language_setting", 0);
            sp = sharedPreferences;
        }
        String string = sharedPreferences.getString("key_language_code", "");
        return string == null ? "" : string;
    }

    public final void saneness(Context context, String languageCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("app_language_setting", 0);
            sp = sharedPreferences;
        }
        Intrinsics.beachfront(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("key_language_code", languageCode);
        editorEdit.commit();
    }
}
