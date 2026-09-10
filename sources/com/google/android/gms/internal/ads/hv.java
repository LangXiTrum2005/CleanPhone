package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hv implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iv f15399b;

    public /* synthetic */ hv(iv ivVar, int i10) {
        this.f15398a = i10;
        this.f15399b = ivVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f15398a) {
            case 0:
                iv ivVar = this.f15399b;
                ivVar.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", ivVar.f15856f);
                data.putExtra("eventLocation", ivVar.f15860j);
                data.putExtra("description", ivVar.f15859i);
                long j10 = ivVar.f15857g;
                if (j10 > -1) {
                    data.putExtra("beginTime", j10);
                }
                long j11 = ivVar.f15858h;
                if (j11 > -1) {
                    data.putExtra("endTime", j11);
                }
                data.setFlags(268435456);
                zzt.zzc();
                zzs.zzY(ivVar.f15855e, data);
                break;
            default:
                this.f15399b.i("Operation denied by user.");
                break;
        }
    }
}
