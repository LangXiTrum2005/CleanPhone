package d8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.lifecycle.p;
import cn.d0;
import cn.n0;
import d5.u;
import hn.o;
import java.io.OutputStream;
import kotlin.jvm.internal.n;
import wi.j;
import xi.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38765a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38768d;

    public c(Context context) {
        n.f(context, "context");
        this.f38767c = context;
    }

    public static final void a(c cVar, Uri uri) {
        try {
            Log.d("Dialog Activity", "Saving file");
            OutputStream outputStreamOpenOutputStream = cVar.f38766b.getContentResolver().openOutputStream(uri);
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.write((byte[]) cVar.f38768d);
            }
        } catch (Exception e10) {
            Log.d("Dialog Activity", "Error while writing file" + e10.getMessage());
        }
    }

    public void b(String str, String str2, byte[] bArr, String str3, Boolean bool, j jVar) {
        Log.d("Dialog Activity", "Opening File Manager");
        if (str2 == null) {
            str2 = "";
        }
        if (n.a(bool, Boolean.TRUE)) {
            StringBuilder sbI = u.i(str);
            if (!an.h.K0(str2, '.')) {
                str2 = ".".concat(str2);
            }
            sbI.append(str2);
            str = sbI.toString();
        }
        this.f38767c = jVar;
        this.f38768d = bArr;
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.TITLE", String.valueOf(str));
        intent.putExtra("android.provider.extra.INITIAL_URI", Environment.getExternalStorageDirectory().getPath());
        intent.setType(str3);
        this.f38766b.startActivityForResult(intent, 886325063);
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        switch (this.f38765a) {
            case 0:
                if (i10 != 40071) {
                    return false;
                }
                l8.b bVar = (l8.b) this.f38768d;
                if (bVar != null) {
                    bVar.b(Boolean.valueOf(i11 == -1));
                }
                this.f38768d = null;
                return true;
            default:
                if (i10 != 886325063) {
                    return false;
                }
                if (i11 == -1) {
                    if ((intent != null ? intent.getData() : null) != null) {
                        Log.d("Dialog Activity", "Starting file operation");
                        Uri data = intent.getData();
                        n.c(data);
                        jn.e eVar = n0.f6748a;
                        d0.w(d0.b(o.f42451a), null, new p(this, data, null, 14), 3);
                        return true;
                    }
                }
                Log.d("Dialog Activity", "Activity result was null");
                j jVar = (j) this.f38767c;
                if (jVar != null) {
                    jVar.a(null);
                }
                this.f38767c = null;
                return true;
        }
    }

    public c(Activity activity) {
        n.f(activity, "activity");
        this.f38766b = activity;
    }
}
