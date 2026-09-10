package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdg;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface me0 {
    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(View view);

    void c();

    void d(View view);

    JSONObject e(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void f(String str);

    void g(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10);

    void h(Bundle bundle);

    void i(up upVar);

    boolean j(Bundle bundle);

    void k(zzdg zzdgVar);

    void l(MotionEvent motionEvent, View view);

    JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void n(Bundle bundle);

    void o(zzdc zzdcVar);

    void p();

    void q(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType);

    void r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void s(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void zzA();

    void zzg();

    boolean zzh();

    void zzq();

    int zzu();

    boolean zzv();
}
