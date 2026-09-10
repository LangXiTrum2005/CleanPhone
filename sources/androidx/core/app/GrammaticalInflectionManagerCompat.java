package androidx.core.app;

import android.app.GrammaticalInflectionManager;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class GrammaticalInflectionManagerCompat {

    public static class Api34Impl {
        public static int a(Context context) {
            return ((GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class)).getApplicationGrammaticalGender();
        }

        public static void b(Context context, int i2) {
            ((GrammaticalInflectionManager) context.getSystemService(GrammaticalInflectionManager.class)).setRequestedApplicationGrammaticalGender(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }
}
