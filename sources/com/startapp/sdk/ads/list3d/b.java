package com.startapp.sdk.ads.list3d;

import android.view.View;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.rb;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f40501a;

    public b(List3DActivity list3DActivity) {
        this.f40501a = list3DActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List3DActivity list3DActivity = this.f40501a;
        ArrayList arrayList = list3DActivity.f40487h;
        String str = "";
        if (arrayList != null && !arrayList.isEmpty() && ((rb) list3DActivity.f40487h.get(0)).f41438e != null) {
            str = ((rb) list3DActivity.f40487h.get(0)).f41438e;
        }
        h0.a(list3DActivity, str, this.f40501a.a());
        this.f40501a.finish();
    }
}
