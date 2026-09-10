package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c60 implements od1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c60 f13057b = new c60(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c60 f13058c = new c60(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c60 f13059d = new c60(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c60 f13060e = new c60(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c60 f13061f = new c60(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c60 f13062g = new c60(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c60 f13063h = new c60(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c60 f13064i = new c60(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c60 f13065j = new c60(10);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ c60 f13066k = new c60(11);
    public static final /* synthetic */ c60 l = new c60(12);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c60 f13067m = new c60(13);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c60 f13068n = new c60(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13069a;

    public /* synthetic */ c60(int i10) {
        this.f13069a = i10;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) throws IOException {
        int i10 = -1;
        String str = "";
        int i11 = 0;
        String str2 = null;
        int i12 = 1;
        switch (this.f13069a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (((Boolean) zzba.zzc().a(am.f12088bc)).booleanValue()) {
                    zzt.zzh().f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th2);
                } else {
                    zzt.zzh().e("GetTopicsApiWithRecordObservationActionHandler", th2);
                }
                aa1 aa1Var = ca1.f13122b;
                return zw1.d(new e4.a(ya1.f22208e));
            case 1:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return be1.f12743b;
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zw1.l(cause);
            case 3:
                return zw1.l(new ck0(5));
            case 4:
                return zw1.d(((zk0) obj).f22647a);
            case 5:
                return be1.f12743b;
            case 6:
                Throwable cause2 = (ExecutionException) obj;
                if (cause2.getCause() != null) {
                    cause2 = cause2.getCause();
                }
                return zw1.l(cause2);
            case 7:
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                l00.f16608a.execute(new gm0(9, (InputStream) obj, parcelFileDescriptorArrCreatePipe[1]));
                return zw1.d(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? zw1.d(new yp0(Integer.toString(17), i12)) : zw1.d(new yp0(str2, i12));
            case 9:
                return zw1.d(new yp0((String) obj, i12));
            case 10:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return appSetIdInfo == null ? zw1.d(new nq0(str2, i10, i11)) : zw1.d(new nq0(appSetIdInfo.getId(), appSetIdInfo.getScope(), i11));
            case 11:
                e4.a aVar = (e4.a) obj;
                if (aVar == null) {
                    return zw1.d(new nq0(str, i12, i12));
                }
                yu1 yu1VarZ = zu1.z();
                Iterator it = aVar.f39073a.iterator();
                if (!it.hasNext()) {
                    return zw1.d(new nq0(Base64.encodeToString(((zu1) yu1VarZ.e()).b(), 1), i12, i12));
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                xu1.z();
                throw null;
            case 12:
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                int i13 = 2;
                return appSetIdInfo2 == null ? zw1.d(new nq0(str2, i10, i13)) : zw1.d(new nq0(appSetIdInfo2.getId(), appSetIdInfo2.getScope(), i13));
            case 13:
                return be1.f12743b;
            case 14:
                return zw1.d("");
            default:
                m31 m31Var = (m31) obj;
                return zw1.z(m31Var.zzb(), new lx(m31Var, 8), td1.f20333a);
        }
    }
}
