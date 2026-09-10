package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.OY.QAg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Vo0 {
    public static volatile Vo0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f3895a;
    public final C4607sm0 b;
    public final ThreadPoolExecutor c;
    public volatile SQLiteStatement d;

    public Vo0(Context context) {
        SparseArray sparseArray = new SparseArray(2);
        this.f3895a = sparseArray;
        this.c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new QAg(5, "video_proxy_db"));
        this.b = new C4607sm0(context.getApplicationContext(), "tt_open_sdk_video.db", null, 3);
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    public static Vo0 b(Context context) {
        if (e == null) {
            synchronized (Vo0.class) {
                try {
                    if (e == null) {
                        e = new Vo0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final KK a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map map = (Map) this.f3895a.get(i);
        KK kk = map == null ? null : (KK) map.get(str);
        if (kk != null) {
            return kk;
        }
        try {
            Cursor cursorQuery = this.b.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, null, null, null, "1");
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                    kk = new KK(cursorQuery.getInt(cursorQuery.getColumnIndex("contentLength")), i, cursorQuery.getString(cursorQuery.getColumnIndex("key")), cursorQuery.getString(cursorQuery.getColumnIndex("mime")), cursorQuery.getString(cursorQuery.getColumnIndex("extra")));
                }
                cursorQuery.close();
            }
            if (kk != null && map != null) {
                map.put(str, kk);
            }
            return kk;
        } catch (Throwable unused) {
            return null;
        }
    }
}
