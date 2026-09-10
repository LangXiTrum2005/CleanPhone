package com.gyf.immersionbar;

import android.app.Application;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class EMUI3NavigationBarObserver extends ContentObserver {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f21427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f21428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f21429c;

    public static class NavigationBarObserverInstance {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EMUI3NavigationBarObserver f21430a;

        static {
            EMUI3NavigationBarObserver eMUI3NavigationBarObserver = new EMUI3NavigationBarObserver(new Handler(Looper.getMainLooper()));
            eMUI3NavigationBarObserver.f21429c = Boolean.FALSE;
            f21430a = eMUI3NavigationBarObserver;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        ArrayList arrayList;
        super.onChange(z2);
        Application application = this.f21428b;
        if (application == null || application.getContentResolver() == null || (arrayList = this.f21427a) == null || arrayList.isEmpty()) {
            return;
        }
        int i2 = Settings.System.getInt(this.f21428b.getContentResolver(), "navigationbar_is_min", 0);
        Iterator it = this.f21427a.iterator();
        while (it.hasNext()) {
            ((ImmersionCallback) it.next()).a(i2 == 0);
        }
    }
}
