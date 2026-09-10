package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3322ya {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Picasso f24130b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3322ya f24129a = new C3322ya();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24131c = new Object();
    public static final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3306xa f24132e = new C3306xa();

    public static final /* synthetic */ String d() {
        return "ya";
    }

    public static final WeakReference a(C3322ya c3322ya, Context context) {
        c3322ya.getClass();
        int size = d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i2)).get();
            if (context2 != null && context2.equals(context)) {
                return (WeakReference) arrayList.get(i2);
            }
        }
        return null;
    }

    public final Picasso a(Context context) {
        WeakReference weakReference;
        Picasso picassoBuild;
        Intrinsics.f(context, "context");
        synchronized (f24131c) {
            try {
                int size = d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = d;
                    Context context2 = (Context) ((WeakReference) arrayList.get(i2)).get();
                    if (context2 != null && context2.equals(context)) {
                        weakReference = (WeakReference) arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (weakReference == null) {
                    d.add(new WeakReference(context));
                }
                picassoBuild = f24130b;
                if (picassoBuild == null) {
                    picassoBuild = new Picasso.Builder(context).build();
                    f24130b = picassoBuild;
                    Uc.a(context, f24132e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.e(picassoBuild, "synchronized(...)");
        return picassoBuild;
    }

    public final Object a(InvocationHandler connectionCallbackHandler) {
        Intrinsics.f(connectionCallbackHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, connectionCallbackHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
