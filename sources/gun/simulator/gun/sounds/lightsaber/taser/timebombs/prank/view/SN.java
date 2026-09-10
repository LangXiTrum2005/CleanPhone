package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class SN {
    @Nullable
    @DoNotInline
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    @DoNotInline
    public static void b(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setMediaUri(uri);
    }
}
