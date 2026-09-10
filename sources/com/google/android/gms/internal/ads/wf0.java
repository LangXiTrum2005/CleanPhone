package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.ironsource.C0335f8;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf0 implements ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b30 f21505b;

    public /* synthetic */ wf0(b30 b30Var, int i10) {
        this.f21504a = i10;
        this.f21505b = b30Var;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final /* synthetic */ void v(zh zhVar) {
        switch (this.f21504a) {
            case 0:
                HashMap map = new HashMap();
                map.put(C0335f8.f28653k, true != zhVar.f22617j ? "0" : "1");
                this.f21505b.e("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = zhVar.f22611d;
                this.f21505b.zzP().z(rect.left, rect.top);
                break;
            default:
                Rect rect2 = zhVar.f22611d;
                this.f21505b.zzP().z(rect2.left, rect2.top);
                break;
        }
    }
}
