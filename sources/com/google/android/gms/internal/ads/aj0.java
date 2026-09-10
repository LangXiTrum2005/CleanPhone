package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements wk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f12046e;

    public aj0(Context context, int i10) {
        switch (i10) {
            case 3:
                this.f12043b = 0;
                this.f12044c = context;
                break;
            default:
                this.f12046e = "";
                this.f12044c = context;
                this.f12045d = context.getApplicationInfo();
                this.f12042a = ((Integer) zzba.zzc().a(am.Ia)).intValue();
                this.f12043b = ((Integer) zzba.zzc().a(am.Ja)).intValue();
                break;
        }
    }

    public static String c(mb.g gVar) {
        gVar.a();
        mb.i iVar = gVar.f45930c;
        String str = iVar.f45947e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f45944b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f12046e) == null) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f12046e;
    }

    public synchronized int d() {
        PackageInfo packageInfoE;
        try {
            if (this.f12042a == 0 && (packageInfoE = e("com.google.android.gms")) != null) {
                this.f12042a = packageInfoE.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f12042a;
    }

    public PackageInfo e(String str) {
        try {
            return ((Context) this.f12044c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean f() {
        int i10;
        synchronized (this) {
            i10 = this.f12043b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f12044c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f12043b = 2;
                    } else {
                        this.f12043b = 2;
                    }
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public synchronized void g() {
        PackageInfo packageInfoE = e(((Context) this.f12044c).getPackageName());
        if (packageInfoE != null) {
            this.f12046e = Integer.toString(packageInfoE.versionCode);
            this.f12045d = packageInfoE.versionName;
        }
    }

    public JSONObject h() throws JSONException {
        String strZzr;
        String strEncodeToString;
        int i10 = this.f12043b;
        int i11 = this.f12042a;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f12045d;
        Context context = (Context) this.f12044c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            y01 y01Var = zzs.zza;
            Context context2 = r9.c.a(context).f40681b;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        zzt.zzc();
        Drawable applicationIcon = null;
        try {
            strZzr = zzs.zzr(context);
        } catch (RemoteException unused2) {
            strZzr = null;
        }
        jSONObject.put("adMobAppId", strZzr);
        if (((String) this.f12046e).isEmpty()) {
            try {
                f7.a aVarA = r9.c.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = aVarA.f40681b;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i11, i10);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f12046e = strEncodeToString;
        }
        if (!((String) this.f12046e).isEmpty()) {
            jSONObject.put("icon", (String) this.f12046e);
            jSONObject.put("iconWidthPx", i11);
            jSONObject.put("iconHeightPx", i10);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public long l(po1 po1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void n(ox1 ox1Var) {
        ox1Var.getClass();
        ((wk1) this.f12044c).n(ox1Var);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public int t(byte[] bArr, int i10, int i11) {
        wk1 wk1Var = (wk1) this.f12044c;
        int i12 = this.f12043b;
        if (i12 == 0) {
            byte[] bArr2 = (byte[]) this.f12046e;
            int i13 = 0;
            if (wk1Var.t(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int iT = wk1Var.t(bArr3, i13, i15);
                        if (iT != -1) {
                            i13 += iT;
                            i15 -= iT;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        d42 d42Var = (d42) this.f12045d;
                        np0 np0Var = new np0(bArr3, i14);
                        long jMax = !d42Var.l ? d42Var.f13395i : Math.max(d42Var.f13398m.s(true), d42Var.f13395i);
                        int iB = np0Var.B();
                        h3 h3Var = d42Var.f13397k;
                        h3Var.getClass();
                        h3Var.b(iB, np0Var);
                        h3Var.c(jMax, 1, iB, 0, null);
                        d42Var.l = true;
                    }
                }
                i12 = this.f12042a;
                this.f12043b = i12;
            }
            return -1;
        }
        int iT2 = wk1Var.t(bArr, i10, Math.min(i12, i11));
        if (iT2 != -1) {
            this.f12043b -= iT2;
        }
        return iT2;
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Uri zzc() {
        return ((wk1) this.f12044c).zzc();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public Map zzj() {
        return ((wk1) this.f12044c).zzj();
    }
}
