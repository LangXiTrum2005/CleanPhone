package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.hw;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hw f10617a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzm(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null && !hwVar.zzg()) {
                return;
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            hw hwVar2 = this.f10617a;
            if (hwVar2 != null) {
                hwVar2.zze();
            }
        } catch (RemoteException e11) {
            zzo.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzn(new b(configuration));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        hw hwVarZzg = zzay.zzb().zzg(this);
        this.f10617a = hwVarZzg;
        if (hwVarZzg == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            hwVarZzg.zzh(bundle);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzq();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzl();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzH(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzi();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzk();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzo(bundle);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzj();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.zzd("AdActivity onStop");
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzp();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            hw hwVar = this.f10617a;
            if (hwVar != null) {
                hwVar.zzf();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        hw hwVar = this.f10617a;
        if (hwVar != null) {
            try {
                hwVar.zzs();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        hw hwVar = this.f10617a;
        if (hwVar != null) {
            try {
                hwVar.zzs();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        hw hwVar = this.f10617a;
        if (hwVar != null) {
            try {
                hwVar.zzs();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
