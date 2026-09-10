package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.internal.measurement.u6;
import i9.d;
import k9.c0;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11645b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11646a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f11646a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                e eVarD = e.d(this);
                if (i11 == -1) {
                    u6 u6Var = eVarD.f11705n;
                    u6Var.sendMessage(u6Var.obtainMessage(3));
                } else if (i11 == 0) {
                    eVarD.h(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f11646a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f11646a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11646a = bundle.getInt("resolution");
        }
        if (this.f11646a == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            c0.h(num);
            d.f42926e.d(this, num.intValue(), this);
            this.f11646a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f11646a = 1;
            } catch (ActivityNotFoundException e10) {
                e = e10;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    e.d(googleApiActivity).h(new ConnectionResult(22, null, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    String strJ = a.j(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strJ = strJ.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strJ, activityNotFoundException);
                }
                googleApiActivity.f11646a = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException e12) {
            e = e12;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e13) {
            e = e13;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f11646a);
        super.onSaveInstanceState(bundle);
    }
}
