package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.support.v4.media.a;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Debug {
    public static String a(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return a.h(i2, "?");
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
