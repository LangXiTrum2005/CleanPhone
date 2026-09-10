package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class RN {
    @DoNotInline
    public static MediaDescription a(MediaDescription.Builder builder) {
        return builder.build();
    }

    @DoNotInline
    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    @Nullable
    @DoNotInline
    public static CharSequence c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    @Nullable
    @DoNotInline
    public static Bundle d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    @Nullable
    @DoNotInline
    public static Bitmap e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    @Nullable
    @DoNotInline
    public static Uri f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    @Nullable
    @DoNotInline
    public static String g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    @Nullable
    @DoNotInline
    public static CharSequence h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    @Nullable
    @DoNotInline
    public static CharSequence i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    @DoNotInline
    public static void j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    @DoNotInline
    public static void k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
        builder.setExtras(bundle);
    }

    @DoNotInline
    public static void l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    @DoNotInline
    public static void m(MediaDescription.Builder builder, @Nullable Uri uri) {
        builder.setIconUri(uri);
    }

    @DoNotInline
    public static void n(MediaDescription.Builder builder, @Nullable String str) {
        builder.setMediaId(str);
    }

    @DoNotInline
    public static void o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    @DoNotInline
    public static void p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
