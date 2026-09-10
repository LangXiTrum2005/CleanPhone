package g5;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41542d;

    public /* synthetic */ g(int i10, int i11, Object obj, Object obj2) {
        this.f41539a = i11;
        this.f41541c = obj;
        this.f41542d = obj2;
        this.f41540b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41539a) {
            case 0:
                ((h) this.f41541c).a((Intent) this.f41542d, this.f41540b);
                break;
            case 1:
                ((SystemForegroundService) this.f41542d).f5042e.notify(this.f41540b, (Notification) this.f41541c);
                break;
            case 2:
                ((TextView) this.f41541c).setTypeface((Typeface) this.f41542d, this.f41540b);
                break;
            default:
                ((u.f) this.f41542d).f51629b.onNavigationEvent(this.f41540b, (Bundle) this.f41541c);
                break;
        }
    }

    public /* synthetic */ g(Object obj, int i10, Parcelable parcelable, int i11) {
        this.f41539a = i11;
        this.f41542d = obj;
        this.f41540b = i10;
        this.f41541c = parcelable;
    }
}
