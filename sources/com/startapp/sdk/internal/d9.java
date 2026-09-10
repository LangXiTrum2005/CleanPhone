package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f40901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40902b;
    public List3DActivity f;
    public int g = 0;
    public final Hashtable d = new Hashtable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f40904e = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40905h = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f40903c = new HashMap();

    public d9(lb lbVar, lb lbVar2) {
        this.f40901a = lbVar;
        this.f40902b = lbVar2;
    }

    public final Bitmap a(String str, int i2, String str2) {
        Bitmap bitmap = (Bitmap) this.d.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f40904e.contains(str)) {
            return null;
        }
        this.f40904e.add(str);
        int i3 = this.g;
        if (i3 >= 15) {
            this.f40905h.add(new c9(this, i2, str, str2));
            return null;
        }
        this.g = i3 + 1;
        ((Executor) this.f40901a.a()).execute(new c9(this, i2, str, str2));
        return null;
    }
}
