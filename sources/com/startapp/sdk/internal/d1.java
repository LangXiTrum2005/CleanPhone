package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3D;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class d1 implements j2, Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdDetails f40888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f40889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f40890c;
    public Bitmap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40891e;
    public final TrackingParams f;
    public ag g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Banner3DView f40892h;

    public d1(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f40890c = null;
        this.d = null;
        this.f40891e = new AtomicBoolean(false);
        this.g = null;
        this.f40892h = null;
        this.f40888a = adDetails;
        this.f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int iA = li.a(context, bannerOptions.d() - 5);
        this.f40889b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f40892h = banner3DView;
        banner3DView.setText(this.f40888a.x());
        this.f40892h.setRating(this.f40888a.u());
        this.f40892h.setDescription(this.f40888a.j());
        this.f40892h.setButtonText(this.f40888a.C());
        Bitmap bitmap = this.f40890c;
        if (bitmap != null) {
            this.f40892h.setImage(bitmap, iA, iA);
        } else {
            this.f40892h.setImage(R.drawable.sym_def_app_icon, iA, iA);
            new k2(context, this.f40888a.m(), this, 0).a();
        }
        Point point = this.f40889b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.f40892h, layoutParams);
        this.f40892h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f40888a, i2);
        parcel.writeInt(this.f40889b.x);
        parcel.writeInt(this.f40889b.y);
        parcel.writeParcelable(this.f40890c, i2);
        parcel.writeBooleanArray(new boolean[]{this.f40891e.get()});
        parcel.writeSerializable(this.f);
    }

    public d1(Parcel parcel) {
        this.f40890c = null;
        this.d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f40891e = atomicBoolean;
        this.g = null;
        this.f40892h = null;
        this.f40888a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f40889b = point;
        point.x = parcel.readInt();
        this.f40889b.y = parcel.readInt();
        this.f40890c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap bitmapA;
        Point point;
        int i2;
        int i3;
        Banner3DView banner3DView = this.f40892h;
        if (banner3DView != null) {
            try {
                bitmapA = a(banner3DView);
            } catch (OutOfMemoryError unused) {
                bitmapA = null;
            } catch (Throwable th) {
                g9.a(th);
                bitmapA = null;
            }
        } else {
            bitmapA = null;
        }
        this.d = bitmapA;
        if (bitmapA != null && (i2 = (point = this.f40889b).x) > 0 && (i3 = point.y) > 0) {
            this.d = Bitmap.createScaledBitmap(bitmapA, i2, i3, false);
        }
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i2) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.f40892h) == null) {
            return;
        }
        this.f40890c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
