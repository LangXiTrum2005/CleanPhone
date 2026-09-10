package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;

/* JADX INFO: loaded from: classes.dex */
public class NotificationCompat {

    public static class Api15Impl {
        public static void a(RemoteViews remoteViews, int i2, CharSequence charSequence) {
            remoteViews.setContentDescription(i2, charSequence);
        }
    }

    public static class Api21Impl {
        public static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                e(mediaStyle, iArr);
            }
            if (token != null) {
                c(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        public static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        public static void e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    public static class Api24Impl {
        public static Notification.MediaStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    public static class Api34Impl {
        public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i2, PendingIntent pendingIntent, Boolean bool) {
            if (bool.booleanValue()) {
                mediaStyle.setRemotePlaybackInfo(charSequence, i2, pendingIntent);
            }
            return mediaStyle;
        }
    }

    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api21Impl.d(notificationBuilderWithBuilderAccessor.a(), Api21Impl.b(Api34Impl.a(Api24Impl.a(), null, 0, null, Boolean.FALSE), null, null));
            } else {
                Api21Impl.d(notificationBuilderWithBuilderAccessor.a(), Api21Impl.b(Api24Impl.a(), null, null));
            }
        }
    }

    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api21Impl.d(notificationBuilderWithBuilderAccessor.a(), Api21Impl.b(Api34Impl.a(Api21Impl.a(), null, 0, null, Boolean.FALSE), null, null));
            } else {
                Api21Impl.d(notificationBuilderWithBuilderAccessor.a(), Api21Impl.b(Api21Impl.a(), null, null));
            }
        }
    }
}
