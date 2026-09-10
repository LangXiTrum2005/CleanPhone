package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static o a(Notification.BubbleMetadata bubbleMetadata) {
        n nVar;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            nVar = new n();
            if (TextUtils.isEmpty(shortcutId)) {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            nVar.f5153a = shortcutId;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.f4014k;
            IconCompat iconCompatE = go.c.e(icon);
            nVar = new n();
            if (intent == null) {
                throw new NullPointerException("Bubble requires non-null pending intent");
            }
            nVar.f5157e = intent;
            nVar.f5159g = iconCompatE;
        }
        nVar.c(1, bubbleMetadata.getAutoExpandBubble());
        nVar.f5158f = bubbleMetadata.getDeleteIntent();
        nVar.c(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            nVar.f5154b = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            nVar.f5155c = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            nVar.f5155c = bubbleMetadata.getDesiredHeightResId();
            nVar.f5154b = 0;
        }
        IconCompat iconCompat = (IconCompat) nVar.f5159g;
        PendingIntent pendingIntent = (PendingIntent) nVar.f5157e;
        String str = nVar.f5153a;
        if (str == null && pendingIntent == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if (str == null && iconCompat == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        return new o();
    }
}
