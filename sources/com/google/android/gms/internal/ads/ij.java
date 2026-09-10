package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ij extends l9.a {
    public static final Parcelable.Creator<ij> CREATOR = new gj(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f15763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15767j;

    public ij(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.f15758a = str;
        this.f15759b = j10;
        this.f15760c = str2 == null ? "" : str2;
        this.f15761d = str3 == null ? "" : str3;
        this.f15762e = str4 == null ? "" : str4;
        this.f15763f = bundle == null ? new Bundle() : bundle;
        this.f15764g = z10;
        this.f15765h = j11;
        this.f15766i = str5;
        this.f15767j = i10;
    }

    public static ij b(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                String string = sb2.toString();
                int i10 = zze.zza;
                zzo.zzi(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j10 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new ij(queryParameter, j10, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e10) {
            int i11 = zze.zza;
            zzo.zzj("Unable to parse Uri into cache offering.", e10);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 2, this.f15758a);
        r9.b.Q(parcel, 3, 8);
        parcel.writeLong(this.f15759b);
        r9.b.J(parcel, 4, this.f15760c);
        r9.b.J(parcel, 5, this.f15761d);
        r9.b.J(parcel, 6, this.f15762e);
        r9.b.C(parcel, 7, this.f15763f);
        r9.b.Q(parcel, 8, 4);
        parcel.writeInt(this.f15764g ? 1 : 0);
        long j10 = this.f15765h;
        r9.b.Q(parcel, 9, 8);
        parcel.writeLong(j10);
        r9.b.J(parcel, 10, this.f15766i);
        int i11 = this.f15767j;
        r9.b.Q(parcel, 11, 4);
        parcel.writeInt(i11);
        r9.b.S(parcel, iR);
    }
}
