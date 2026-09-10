package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3796jc0 implements InterfaceC4148nc0 {
    public static final String[] b = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f4559a;

    public C3796jc0(ContentResolver contentResolver) {
        this.f4559a = contentResolver;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4148nc0
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f4559a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
