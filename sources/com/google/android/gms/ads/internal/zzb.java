package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.bz;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.zy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bz f11182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dx f11183d = new dx(Collections.EMPTY_LIST, false);

    public zzb(Context context, @Nullable bz bzVar, @Nullable dx dxVar) {
        this.f11180a = context;
        this.f11182c = bzVar;
    }

    public final void zza() {
        this.f11181b = true;
    }

    public final boolean zzb() {
        bz bzVar = this.f11182c;
        return ((bzVar == null || !((zy) bzVar).f22768g.f12549f) && !this.f11183d.f13752a) || this.f11181b;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        dx dxVar = this.f11183d;
        bz bzVar = this.f11182c;
        if ((bzVar == null || !((zy) bzVar).f22768g.f12549f) && !dxVar.f13752a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (bzVar != null) {
            ((zy) bzVar).b(3, str, null);
            return;
        }
        if (!dxVar.f13752a || (list = dxVar.f13753b) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzO(this.f11180a, "", strReplace);
            }
        }
    }
}
