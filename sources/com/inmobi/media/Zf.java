package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.zf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f24169b;

    public zf(View view) {
        Intrinsics.f(view, "view");
        this.f24168a = new ArrayList();
        this.f24169b = new WeakReference(view);
        if (L3.f22938a.F()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: A.O0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return zf.a(this.f3154a, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(zf this$0, View view, WindowInsets windowInsets) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(view, "<anonymous parameter 0>");
        Intrinsics.f(windowInsets, "windowInsets");
        if (!this$0.f24168a.isEmpty()) {
            Iterator it = this$0.f24168a.iterator();
            while (it.hasNext()) {
                Df df = (Df) ((yf) it.next());
                df.getClass();
                df.f22788a.a(windowInsets);
                try {
                    Activity activity = (Activity) df.f22791e.get();
                    if (!df.f22788a.a()) {
                        InterfaceC3333z5 interfaceC3333z5 = df.f22789b;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                        }
                    } else if (activity == null) {
                        InterfaceC3333z5 interfaceC3333z6 = df.f22789b;
                        if (interfaceC3333z6 != null) {
                            ((A5) interfaceC3333z6).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                        }
                    } else {
                        Bf bfB = B2.a(activity) ? AbstractC3181pc.b(windowInsets) : AbstractC3181pc.a(windowInsets);
                        Integer numF = U3.f();
                        int iIntValue = numF != null ? numF.intValue() : U3.a(windowInsets);
                        U3.a(Integer.valueOf(iIntValue));
                        df.a(bfB, iIntValue);
                    }
                } catch (Error e2) {
                    InterfaceC3333z5 interfaceC3333z7 = df.f22789b;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).b("WindowInsetsHandler", "Error in getting safeArea " + e2.getMessage());
                    }
                } catch (Exception e3) {
                    InterfaceC3333z5 interfaceC3333z8 = df.f22789b;
                    if (interfaceC3333z8 != null) {
                        ((A5) interfaceC3333z8).a("WindowInsetsHandler", "Exception in getting safeArea", e3);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f24168a.clear();
        if (!L3.f22938a.F() || (view = (View) this.f24169b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
