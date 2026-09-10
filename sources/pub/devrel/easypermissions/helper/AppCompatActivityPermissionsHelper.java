package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes7.dex */
class AppCompatActivityPermissionsHelper extends BaseSupportPermissionsHelper<AppCompatActivity> {
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final void a(int i2, String... strArr) {
        ActivityCompat.c((Activity) this.f45315a, strArr, i2);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final Context b() {
        return (Context) this.f45315a;
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    public final boolean e(String str) {
        return ActivityCompat.f((Activity) this.f45315a, str);
    }

    @Override // pub.devrel.easypermissions.helper.BaseSupportPermissionsHelper
    public final FragmentManager g() {
        return ((AppCompatActivity) this.f45315a).getSupportFragmentManager();
    }
}
