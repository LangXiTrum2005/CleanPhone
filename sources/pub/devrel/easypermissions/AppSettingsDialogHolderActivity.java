package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes7.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AlertDialog f45299Y;
    public int Z;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        setResult(i3, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.Z);
            startActivityForResult(data, 7534);
        } else {
            if (i2 != -2) {
                throw new IllegalStateException(a.h(i2, "Unknown button type: "));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AppSettingsDialogHolderActivity appSettingsDialogHolderActivity;
        super.onCreate(bundle);
        Intent intent = getIntent();
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            AppSettingsDialog.Builder builder = new AppSettingsDialog.Builder(this);
            builder.f45297c = TextUtils.isEmpty(builder.f45297c) ? getString(com.charging.screenshow.battery.animations.themes.R.string.rationale_ask_again) : builder.f45297c;
            builder.d = TextUtils.isEmpty(builder.d) ? getString(com.charging.screenshow.battery.animations.themes.R.string.title_settings_dialog) : builder.d;
            builder.f45298e = TextUtils.isEmpty(builder.f45298e) ? getString(android.R.string.ok) : builder.f45298e;
            String string = TextUtils.isEmpty(builder.f) ? getString(android.R.string.cancel) : builder.f;
            builder.f = string;
            int i2 = builder.g;
            if (i2 <= 0) {
                i2 = 16061;
            }
            int i3 = i2;
            builder.g = i3;
            appSettingsDialogHolderActivity = this;
            appSettingsDialog = new AppSettingsDialog(appSettingsDialogHolderActivity, builder.f45297c, builder.d, builder.f45298e, string, i3);
        } else {
            appSettingsDialogHolderActivity = this;
        }
        appSettingsDialog.i0 = appSettingsDialogHolderActivity;
        appSettingsDialogHolderActivity.Z = appSettingsDialog.h0;
        int i4 = appSettingsDialog.X;
        AlertDialog alertDialogCreate = (i4 != -1 ? new AlertDialog.Builder(this, i4) : new AlertDialog.Builder(this)).a().setTitle(appSettingsDialog.Z).b(appSettingsDialog.f45294Y).d(appSettingsDialog.e0, this).c(appSettingsDialog.f0, this).create();
        alertDialogCreate.show();
        appSettingsDialogHolderActivity.f45299Y = alertDialogCreate;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f45299Y;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f45299Y.dismiss();
    }
}
