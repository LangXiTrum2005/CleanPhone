package androidx.media3.ui;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.Player;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public class PlayerNotificationManager {

    public final class BitmapCallback {
    }

    public static class Builder {
    }

    public interface CustomActionReceiver {
    }

    public interface MediaDescriptionAdapter {
    }

    public static final class MediaStyle extends NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(null);
            notificationBuilderWithBuilderAccessor.a().setStyle(mediaStyle);
        }
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            throw null;
        }
    }

    public interface NotificationListener {
    }

    public class PlayerListener implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
            if (events.a(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                throw null;
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }
}
