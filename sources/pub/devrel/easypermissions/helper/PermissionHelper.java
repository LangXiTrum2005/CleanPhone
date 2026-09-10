package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PermissionHelper<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45315a;

    public PermissionHelper(Object obj) {
        this.f45315a = obj;
    }

    public static PermissionHelper c(Activity activity) {
        return activity instanceof AppCompatActivity ? new AppCompatActivityPermissionsHelper((AppCompatActivity) activity) : new ActivityPermissionHelper(activity);
    }

    public static PermissionHelper d(Fragment fragment) {
        return new SupportFragmentPermissionHelper(fragment);
    }

    public abstract void a(int i2, String... strArr);

    public abstract Context b();

    public abstract boolean e(String str);

    public abstract void f(String str, String str2, String str3, int i2, int i3, String... strArr);
}
