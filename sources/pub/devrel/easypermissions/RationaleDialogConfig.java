package pub.devrel.easypermissions;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
class RationaleDialogConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45311c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45312e;
    public final String[] f;

    public RationaleDialogConfig(String str, String str2, String str3, int i2, int i3, String[] strArr) {
        this.f45309a = str;
        this.f45310b = str2;
        this.f45312e = str3;
        this.f45311c = i2;
        this.d = i3;
        this.f = strArr;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f45309a);
        bundle.putString("negativeButton", this.f45310b);
        bundle.putString("rationaleMsg", this.f45312e);
        bundle.putInt("theme", this.f45311c);
        bundle.putInt("requestCode", this.d);
        bundle.putStringArray("permissions", this.f);
        return bundle;
    }

    public RationaleDialogConfig(Bundle bundle) {
        this.f45309a = bundle.getString("positiveButton");
        this.f45310b = bundle.getString("negativeButton");
        this.f45312e = bundle.getString("rationaleMsg");
        this.f45311c = bundle.getInt("theme");
        this.d = bundle.getInt("requestCode");
        this.f = bundle.getStringArray("permissions");
    }
}
