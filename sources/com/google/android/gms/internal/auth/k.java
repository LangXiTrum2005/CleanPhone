package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Handler handler, int i10) {
        super(handler);
        this.f22853a = i10;
        this.f22854b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f22853a) {
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.f22853a) {
            case 0:
                l lVar = (l) this.f22854b;
                synchronized (lVar.f22866d) {
                    lVar.f22867e = null;
                    r.f22896i.incrementAndGet();
                    break;
                }
                synchronized (lVar) {
                    try {
                        Iterator it = lVar.f22868f.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                onChange(z10, null);
                return;
            case 2:
                super.onChange(z10);
                mi.s sVar = (mi.s) this.f22854b;
                if (sVar.f46059j == null) {
                    return;
                }
                sVar.d();
                return;
            default:
                xi.g gVar = (xi.g) this.f22854b;
                if (gVar != null) {
                    gVar.b(Boolean.valueOf(z10));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(null);
        this.f22853a = 0;
        this.f22854b = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Handler handler, xi.g gVar) {
        super(handler);
        this.f22853a = 3;
        this.f22854b = gVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        switch (this.f22853a) {
            case 1:
                io.flutter.view.g gVar = (io.flutter.view.g) this.f22854b;
                if (!gVar.f43498u) {
                    if (Settings.Global.getFloat(gVar.f43484f, "transition_animation_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        gVar.l |= 4;
                    } else {
                        gVar.l &= -5;
                    }
                    ((FlutterJNI) gVar.f43480b.f48981c).setAccessibilityFeatures(gVar.l);
                    break;
                }
                break;
            default:
                super.onChange(z10, uri);
                break;
        }
    }
}
