package g8;

import an.p;
import android.net.Uri;
import android.provider.MediaStore;
import com.ironsource.D1;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f41732a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f41733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f41734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f41735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41736e;

    static {
        ArrayList arrayListS = o.S("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "width", "height", "orientation", "date_added", "date_modified", "mime_type", "datetaken");
        arrayListS.add("datetaken");
        arrayListS.add("is_favorite");
        arrayListS.add("is_trashed");
        f41733b = arrayListS;
        ArrayList arrayListS2 = o.S("_display_name", "_data", "_id", "title", "bucket_id", "bucket_display_name", "date_added", "width", "height", "orientation", "date_modified", "mime_type", IronSourceConstants.EVENTS_DURATION);
        arrayListS2.add("datetaken");
        arrayListS2.add("is_favorite");
        arrayListS2.add("is_trashed");
        f41734c = arrayListS2;
        f41735d = new String[]{"media_type", "_display_name"};
        f41736e = new String[]{"bucket_id", "bucket_display_name"};
    }

    public static Uri a() {
        Uri contentUri = MediaStore.Files.getContentUri(D1.f25920e);
        n.e(contentUri, "getContentUri(...)");
        return contentUri;
    }

    public static boolean b(IllegalArgumentException illegalArgumentException) {
        String message = illegalArgumentException.getMessage();
        return message != null && p.p0(message, "Volume ", false) && p.h0(message, " not found", false);
    }
}
