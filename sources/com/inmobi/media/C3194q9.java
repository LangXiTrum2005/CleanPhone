package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3194q9 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984d8 f23929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f23930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f23931c;

    public C3194q9(Context context, ImageView imageView, C2984d8 imageAsset) {
        Intrinsics.f(context, "context");
        Intrinsics.f(imageView, "imageView");
        Intrinsics.f(imageAsset, "imageAsset");
        this.f23929a = imageAsset;
        this.f23930b = new WeakReference(context);
        this.f23931c = new WeakReference(imageView);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strA;
        HashMap map = D9.f22775c;
        Objects.toString(method);
        if ("onError".equalsIgnoreCase(method != null ? method.getName() : null)) {
            Context context = (Context) this.f23930b.get();
            ImageView imageView = (ImageView) this.f23931c.get();
            C2984d8 c2984d8 = this.f23929a;
            if (context != null && imageView != null) {
                String str = c2984d8.f23521p;
                if ("cross_button".equalsIgnoreCase(c2984d8.f23514b)) {
                    if (str != null) {
                        int length = str.length() - 1;
                        int i2 = 0;
                        boolean z2 = false;
                        while (i2 <= length) {
                            boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
                            if (z2) {
                                if (!z3) {
                                    break;
                                }
                                length--;
                            } else if (z3) {
                                i2++;
                            } else {
                                z2 = true;
                            }
                        }
                        strA = I7.a(length, 1, str, i2);
                    } else {
                        strA = null;
                    }
                    if (strA == null || strA.length() == 0) {
                        C3146n9.a(context, imageView);
                    }
                }
            }
            c2984d8.a("error", androidx.media3.extractor.text.ttml.a.s("[ERRORCODE]", "603"), (L7) null, (InterfaceC3333z5) null);
        }
        return null;
    }
}
