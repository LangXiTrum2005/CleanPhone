package czestochowa;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.nio.CharBuffer;

/* JADX INFO: compiled from: Debug.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {
    public static String attabal() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String beachfront(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static void competently(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder();
            sb.append(".(");
            sb.append(stackTrace[i2].getFileName());
            sb.append(":");
            sb.append(stackTrace[i2].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i2].getMethodName());
            str3 = str3 + " ";
        }
    }

    public static String dern(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    public static String marial(MotionLayout motionLayout, int i) {
        return beachfront(motionLayout, i, -1);
    }

    public static String saneness() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String wireman(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
