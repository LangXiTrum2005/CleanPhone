package b0;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f5122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f5123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5124d = false;

    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:97:0x017b  */
    public static g0 c(Notification notification) {
        g0 b0Var;
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null) {
            String string = extras.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
            int i10 = 0;
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        b0Var = new f0();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        b0Var = new u(i10);
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        b0Var = new k();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        b0Var = new s();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        b0Var = new l(1);
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        b0Var = new l(0);
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        b0Var = new b0();
                        break;
                    default:
                        b0Var = null;
                        break;
                }
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                if (extras.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || extras.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                    b0Var = new b0();
                } else if (extras.containsKey(NotificationCompat.EXTRA_PICTURE) || extras.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                    b0Var = new k();
                } else if (extras.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                    b0Var = new l(0);
                } else if (extras.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                    b0Var = new l(1);
                } else if (extras.containsKey(NotificationCompat.EXTRA_CALL_TYPE)) {
                    b0Var = new s();
                } else if (extras.containsKey(NotificationCompat.EXTRA_PROGRESS_SEGMENTS) || extras.containsKey(NotificationCompat.EXTRA_PROGRESS_POINTS)) {
                    b0Var = new f0();
                } else {
                    String string2 = extras.getString(NotificationCompat.EXTRA_TEMPLATE);
                    if (string2 == null) {
                        b0Var = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        b0Var = new k();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        b0Var = new l(0);
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        b0Var = new l(1);
                    } else if (Build.VERSION.SDK_INT >= 36 && string2.equals(Notification.ProgressStyle.class.getName())) {
                        b0Var = new f0();
                    } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                        b0Var = new b0();
                    } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        b0Var = new u(i10);
                    } else {
                        b0Var = null;
                    }
                }
            }
            if (b0Var != null) {
                try {
                    b0Var.e(extras);
                    return b0Var;
                } catch (ClassCastException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public void a(Bundle bundle) {
        if (this.f5124d) {
            bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.f5123c);
        }
        CharSequence charSequence = this.f5122b;
        if (charSequence != null) {
            bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
        }
        String strD = d();
        if (strD != null) {
            bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, strD);
        }
    }

    public abstract void b(h9.k kVar);

    public String d() {
        return null;
    }

    public void e(Bundle bundle) {
        if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
            this.f5123c = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
            this.f5124d = true;
        }
        this.f5122b = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
    }
}
