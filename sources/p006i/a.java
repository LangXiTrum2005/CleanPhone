package p006i;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import com.charging.screenshow.battery.animations.themes.MyApp;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Notification.Builder b(MyApp myApp) {
        return new Notification.Builder(myApp, "channel_notification_function");
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("channel_notification_function", str, 4);
    }

    public static /* synthetic */ NotificationChannelGroup d(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup k(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* bridge */ /* synthetic */ Path n(Object obj) {
        return (Path) obj;
    }

    public static /* bridge */ /* synthetic */ BasicFileAttributes p(Object obj) {
        return (BasicFileAttributes) obj;
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void x() {
    }
}
