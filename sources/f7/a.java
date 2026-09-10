package f7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import k6.b;
import k6.f;
import k6.n;
import k6.r;
import k6.s;
import k6.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f40681b;

    public /* synthetic */ a(Context context, int i10) {
        this.f40680a = i10;
        this.f40681b = context;
    }

    @Override // k6.s
    public r M(x xVar) {
        switch (this.f40680a) {
            case 1:
                return new b(this.f40681b, this);
            case 2:
                return new b(this.f40681b, xVar.b(Integer.class, InputStream.class));
            default:
                return new n(this.f40681b, 1);
        }
    }

    @Override // k6.f
    public Class a() {
        return InputStream.class;
    }

    @Override // k6.f
    public Object b(Resources.Theme theme, Resources resources, int i10) {
        return resources.openRawResource(i10);
    }

    public void c() {
        this.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    public ApplicationInfo d(int i10, String str) {
        return this.f40681b.getPackageManager().getApplicationInfo(str, i10);
    }

    @Override // k6.f
    public void e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public PackageInfo f(int i10, String str) {
        return this.f40681b.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean g() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f40681b;
        if (callingUid == iMyUid) {
            return r9.b.r(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public void h(String str, String str2, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = this.f40681b.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            editorEdit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            editorEdit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            editorEdit.putString("flutter_image_picker_error_message", str2);
        }
        editorEdit.apply();
    }
}
