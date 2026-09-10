package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class pb extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41360b;

    public pb(List3DActivity list3DActivity, ArrayList arrayList, String str, String str2) {
        super(list3DActivity, 0, arrayList);
        this.f41359a = str;
        this.f41360b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) throws Throwable {
        View view2;
        tb tbVar;
        if (view == null) {
            tbVar = new tb(getContext());
            view2 = tbVar.f41517a;
        } else {
            view2 = view;
            tbVar = (tb) view.getTag();
        }
        rb rbVar = (rb) getItem(i2);
        MetaDataStyle metaDataStyleA = AdsCommonMetaData.k().a(rbVar.q);
        if (tbVar.g != metaDataStyleA) {
            tbVar.g = metaDataStyleA;
            tbVar.f41517a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{metaDataStyleA.e().intValue(), metaDataStyleA.d().intValue()}));
            tbVar.f41519c.setTextSize(metaDataStyleA.h().intValue());
            tbVar.f41519c.setTextColor(metaDataStyleA.f().intValue());
            li.a(tbVar.f41519c, metaDataStyleA.g());
            tbVar.d.setTextSize(metaDataStyleA.c().intValue());
            tbVar.d.setTextColor(metaDataStyleA.a().intValue());
            li.a(tbVar.d, metaDataStyleA.b());
        }
        tbVar.f41519c.setText(rbVar.g);
        tbVar.d.setText(rbVar.f41439h);
        ub ubVarA = ((vb) com.startapp.sdk.components.a.a(getContext()).f40733R.a()).a(this.f41360b);
        Bitmap bitmapA = ubVarA.f41541a.a(rbVar.f41435a, i2, rbVar.f41440i);
        if (bitmapA == null) {
            tbVar.f41518b.setImageResource(R.drawable.sym_def_app_icon);
            tbVar.f41518b.setTag("tag_error");
        } else {
            tbVar.f41518b.setImageBitmap(bitmapA);
            tbVar.f41518b.setTag("tag_ok");
        }
        tbVar.f.setRating(rbVar.j);
        if (rbVar.f41442n != null) {
            tbVar.f41520e.setText("Open");
        } else {
            tbVar.f41520e.setText("Download");
        }
        Context context = getContext();
        String[] strArr = rbVar.f41437c;
        TrackingParams trackingParams = new TrackingParams(this.f41359a);
        Long l2 = rbVar.o;
        long millis = l2 != null ? TimeUnit.SECONDS.toMillis(l2.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
        d9 d9Var = ubVarA.f41541a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String strR = strArr != null ? android.support.v4.media.a.r(new StringBuilder(), TextUtils.join("^", strArr), ubVarA.f41543c) : null;
        if (d9Var.f40903c.containsKey(strR)) {
            return view2;
        }
        ag agVar = new ag(context, placement, strArr, trackingParams, millis, false, null);
        d9Var.f40903c.put(strR, agVar);
        agVar.c();
        return view2;
    }
}
